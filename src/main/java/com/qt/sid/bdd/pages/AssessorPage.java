package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class AssessorPage extends BasePage {


    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;

    @FindBy(xpath = "//*[contains(text(),'Assessor')]//following::button[1]")
    public WebElement assessorRegisterBtn;

    @FindBy(xpath = "//button[text()=' Explore Now ']")
    public WebElement exploreNowBtn;

    @FindAll({
            @FindBy(xpath = "//*[text()=' Applicant Dashboard ']"),
            @FindBy(xpath = "//*[text()=' Assessor Registration Form ']")
    })
    public WebElement assessorRegistrationForm;

    @FindBy(xpath = "//*[text()='View']")
    public WebElement viewInProfile;

    @FindBy(xpath = "//a[text()=' Surveys&Polls ']")
    public WebElement surveysAndPollsLink;

    @FindBy(xpath = "//button[text()=' Surveys ']")
    public WebElement surveysBtn;

    @FindBy(xpath = "//button[text()=' Polls ']")
    public WebElement pollsBtn;

    @FindBy(xpath = "//*[text()=' My Dashboard ']")
    public WebElement myDashboardInProfile;

    public AssessorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAssessorRegister(){
        waitWebDriver(3000);
        scrollToElement(assessorRegisterBtn);
        waitWebDriver(2000);
        object_Click(assessorRegisterBtn);
    }

    public void clickOnExploreNowbutton(){
        waitWebDriver(2000);
        scrollToElement(exploreNowBtn);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(exploreNowBtn);
        clickWithJavaScript(exploreNowBtn);
        waitWebDriver(3000);
    }

    public void clickOnViewInProfile(){
        waitTillTheElementIsVisibleAndClickable(viewInProfile);
        object_Click(viewInProfile);
        waitWebDriver(2000);
    }

    public void clickOnMyDashboardInProfile(){
        waitTillTheElementIsVisibleAndClickable(myDashboardInProfile);
        object_Click(myDashboardInProfile);
        waitWebDriver(2000);
    }



}
