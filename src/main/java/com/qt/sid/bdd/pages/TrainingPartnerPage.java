package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPartnerPage extends BasePage {


    public WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'Training Partner')]//following::button[1]")
    public WebElement trainingPartnerRegisterBtn;

    @FindBy(xpath = "//*[text()=' Training Partner ']")
    public WebElement trainingPartnerRoleInMobileNumberPage;


    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboardInTP;

    @FindBy(xpath = "//*[text()='Overview']")
    public WebElement overviewSection;

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement userProfile;

    @FindBy(xpath = "//*[text()='Features']")
    public WebElement featuresSection;

    @FindBy(xpath = "//button[text()=' Explore Now ']")
    public WebElement exploreNowBtn;

    @FindBy(xpath = "//*[text()='Skill Development Management System']")
    public WebElement skillDevelopmentManagementSystemText;

    @FindBy(xpath = "//button[text()=' Switch Role ']")
    public WebElement switchRoleBtn;




    public TrainingPartnerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickOnTrainingPartnerRegister(){
        scrollToElement(trainingPartnerRegisterBtn);
        waitWebDriver(2000);
        object_Click(trainingPartnerRegisterBtn);
    }

    public void scrollToFeatures(){
        waitWebDriver(2000);
        scrollToElement(featuresSection);
        waitWebDriver(1000);
    }

    public void clickOnExploreNowbutton(){
        waitTillTheElementIsVisibleAndClickable(exploreNowBtn);
        object_Click(exploreNowBtn);
        waitWebDriver(3000);
    }

    public void clickOnSwitchRoleBtn(){
        waitTillTheElementIsVisibleAndClickable(switchRoleBtn);
        object_Click(switchRoleBtn);
        waitWebDriver(3000);
    }


}
