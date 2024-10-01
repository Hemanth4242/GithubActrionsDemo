package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDetailsPage  extends BasePage{

    public WebDriver driver;
    public JobDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='mat-tab-label-content']//child::span[normalize-space(text())='Job Description']")
    public WebElement jobDescription;

    public boolean verifyJobDescription(){
        waitVisibleElement(jobDescription,60);
        boolean jd = jobDescription.isDisplayed();
        return jd;
    }
}
