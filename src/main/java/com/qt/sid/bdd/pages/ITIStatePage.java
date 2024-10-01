package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ITIStatePage extends BasePage {

    public WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'State')]//following::button[1]")
    public WebElement stateRegisterBtn;

    @FindBy(xpath = "//*[contains(text(),'ITI')]//following::button[1]")
    public WebElement itiRegisterBtn;

    @FindBy(xpath = "//*[contains(text(),'DGT Admin')]//following::button[1]")
    public WebElement dgtAdminRegisterBtn;

    @FindBy(id = "number")
    public WebElement mobileNumberEditField;

    @FindBy(xpath = "//*[text()='Please provide valid user type']")
    public WebElement validUserTypeErrorMessage;

    @FindBy(xpath = "//button[text()=' View All ']")
    public WebElement viewAll;

    @FindBy(xpath = "(//button[text()=' View Details'])[1]")
    public WebElement viewDetails;

    @FindBy(xpath = "//*[text()='Application Details']")
    public WebElement applicationDetailsText;

    @FindBy(xpath = "//*[text()='Father / Guardian']")
    public WebElement fatherDetails;

    @FindBy(xpath = "//*[text()='Mother']")
    public WebElement motherDetails;

    @FindBy(xpath = "//*[text()='Date of Birth']")
    public WebElement DOBDetails;

    @FindBy(xpath = "//*[text()='PRN ']")
    public WebElement prnDetails;

    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement genderDetails;

    @FindBy(xpath = "//*[text()='Highest Qualification']")
    public WebElement highestQualificationDetails;

    @FindBy(xpath = "//*[text()='Admission']")
    public WebElement admissionDetails;

    @FindBy(xpath = "//*[text()='Category']")
    public WebElement categoryDetails;

    @FindBy(xpath = "//*[text()='Type']")
    public WebElement typeDetails;

    @FindBy(xpath = "//*[text()=' Economically Weaker Section (EWS) ']")
    public WebElement EWSDetails;

    @FindBy(xpath = "//*[text()=' DST (Dual System Training) ']")
    public WebElement DSTDetails;

    @FindBy(xpath = "//*[text()='Person with Disability']")
    public WebElement personWithDisability;

    @FindBy(xpath = "//*[text()='PWD Category']")
    public WebElement pwdCategoryDetails;

    public ITIStatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnStateRegisterBtn(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(stateRegisterBtn);
        object_Click(stateRegisterBtn);
        waitWebDriver(2000);
    }

    public void clickOnITIRegisterBtn(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(itiRegisterBtn);
        object_Click(itiRegisterBtn);
        waitWebDriver(2000);
    }

    public void clickOnDGTAdminRegisterBtn(){
        waitWebDriver(2000);
        scrollToElement(dgtAdminRegisterBtn);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(dgtAdminRegisterBtn);
        object_Click(dgtAdminRegisterBtn);
        waitWebDriver(2000);
    }

    public void enterNonRegisteredNumber(){
        waitTillTheElementIsVisibleAndClickable(mobileNumberEditField);
        mobileNumberEditField.sendKeys("8183876981");
        waitWebDriver(2000);
    }

    public void clickOnViewAllInDashboard(){
        waitWebDriver(2000);
        scrollToElement(viewAll);
        waitWebDriver(1000);
        //scrollUp();
        waitWebDriver(1000);
        object_Click(viewAll);
        waitWebDriver(2000);
    }

    public void clickOnViewDetails(){
        waitWebDriver(1000);
        scrollToElement(viewDetails);
        waitWebDriver(1000);
        scrollUp();
        waitWebDriver(1000);
        object_Click(viewDetails);
        waitWebDriver(2000);
    }


}
