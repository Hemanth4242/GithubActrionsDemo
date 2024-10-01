package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class TrainingCentrePage extends BasePage {


    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;


    public TrainingCentrePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(xpath = "//div[@class='header-section']/*[normalize-space()='Skill Centre']"),
            @FindBy(xpath = "//div[@class='training-center-header']/*[normalize-space()='Skill Centre']" )
    })
    public WebElement verifyTrainingCentre;

    @FindBy(xpath = "//button[text()=' Explore Now ']")
    public WebElement exploreNowBtn;

    @FindAll({
            @FindBy(xpath = "//*[text()=' Dashboard ']"),
            @FindBy(xpath = "//*[contains(text(),'Training Centre Registration')] ")
    })
    public WebElement trainingCentreRegistrationPageText;

    @FindBy(xpath = "//*[text()='Training Centre Organization Name']")
    public WebElement trainingCentreOrgName;

    @FindBy(xpath = "//*[text()='Training Centre Email']")
    public WebElement trainingCentreEmail;

    @FindBy(xpath = "//*[text()='Training Centre Address']")
    public WebElement trainingCentreAddress;

    public boolean getTextTrainingCentrePage(){
        return  isElementPresent(verifyTrainingCentre);
    }

    public void clickOnExploreNowbutton(){
        waitWebDriver(2000);
        scrollToElement(exploreNowBtn);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(exploreNowBtn);
        object_Click(exploreNowBtn);
        waitWebDriver(3000);
    }
}
