package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LookupResultPage extends BasePage {

    public WebDriver driver;

    public LookupResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h4[@class='suggestions-title ng-star-inserted']")
    private WebElement employementOpportunityHeader;

    @FindBy(xpath = "//h2[normalize-space()='1+ Employment Opportunities']")
    private WebElement loocupResultPage;

    //h2[normalize-space()='1+ Employment Opportunities']


    public String verifyLookupResultPage() {
        return employementOpportunityHeader.getText();
    }


    public String getTextElement() {
        return loocupResultPage.getText();
    }

}
