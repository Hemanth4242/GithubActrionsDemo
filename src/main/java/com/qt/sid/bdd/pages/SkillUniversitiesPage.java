package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillUniversitiesPage extends  BasePage{

    public WebDriver driver;

    @FindBy(xpath = "(//span[normalize-space(text())='Private'])[1]")
    public WebElement typePrivateOption;

    @FindBy(xpath = "//*[text()=' Type ']")
    public WebElement typeFilter;

    @FindAll({
            @FindBy(xpath = "//*[text()=' Location ']"),
            @FindBy(xpath = "//span[@class='mat-content ng-tns-c172-77']")
    })
    public WebElement locationOption;

    @FindBy(xpath = "//span[normalize-space(text())='Madhya Pradesh']")
    public WebElement locationMadhyaPradesh;

    @FindBy(xpath = "(//button[normalize-space(text())='Apply'])[2]")
    public WebElement applyButton;

    @FindBy(xpath = "//div[@class='nsdc-text']")
    public WebElement typeText;

    @FindBy(xpath = "//p[normalize-space(text())='Indore, Madhya Pradesh']")
    public WebElement locationText;

    @FindAll({
            @FindBy(xpath = "//button[text()=' RESET FILTER ']"),
            @FindBy(xpath = "//button[normalize-space(text())='Reset']")
    })
    public WebElement resetButton;

    public SkillUniversitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyTypePrivateOption(){
    	waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(typePrivateOption);
        object_Click(typePrivateOption);
    }

    public void clickOnTypeFilter(){
        waitTillTheElementIsVisibleAndClickable(typeFilter);
        object_Click(typeFilter);
        waitWebDriver(2000);
    }

    public void verifyLocationOption() {
    	waitWebDriver(2000);
        scrollToElement(locationOption);
        clickWithJavaScript(locationOption);
        clickWithJavaScript(locationMadhyaPradesh);
        clickWithJavaScript(applyButton);
    }

    public String verifyTypeText(){
        String actualText =getTextOfObject(typeText);
        return actualText;
    }
    public String verifyLocationText(){
        String actualLocationText =getTextOfObject(locationText);
        return actualLocationText;
    }

    public void verifyResetButton(){
        scrollToElement(resetButton);
        waitWebDriver(2000);
        clickWithJavaScript(resetButton);
    }
}
