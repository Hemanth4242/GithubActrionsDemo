package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentListPage extends BasePage {

    public WebDriver driver;

    @FindAll({
            @FindBy(xpath = "//*[@class='skill-course-card-v2']"),
            @FindBy(xpath = "(//h3[normalize-space(@title)='Data Feeder - Warehouse'])[1]")
    })
    public WebElement eBookName;

    @FindBy(xpath ="//li[normalize-space(@class)='breadcrumb-item active']")
    public WebElement eBookView;

    @FindBy(xpath="//button[normalize-space(text())='Download']")
    public WebElement eBookDownloadButton;

    public ContentListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyEbookClick(){
        waitTillTheElementIsVisibleAndClickable(eBookName);
        clickWithJavaScript(eBookName);
    }

    public  boolean verifyEbookView(){
        waitForElementToAppear(eBookView);
        Boolean value =eBookView.isDisplayed();
        return value;
    }

    public void verifyEbookDownloadOption() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(eBookDownloadButton);
        clickWithJavaScript(eBookDownloadButton);
        clickWithJavaScript(eBookDownloadButton);
        Thread.sleep(30000);
    }
}
