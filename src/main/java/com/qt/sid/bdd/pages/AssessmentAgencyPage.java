package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class AssessmentAgencyPage extends BasePage {


    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;

    @FindBy(xpath = "//*[contains(text(),'Assessment Agency')]//following::button[1]")
    public WebElement assessmentAgencyRegisterBtn;

    @FindBy(xpath = "//button[text()=' Explore Now ']")
    public WebElement exploreNowBtn;

    @FindBy(xpath = "//*[text()='View']")
    public WebElement viewInProfile;

    @FindBy(xpath = "//a[text()=' Surveys&Polls ']")
    public WebElement surveysAndPollsLink;

    @FindBy(xpath = "//button[text()=' Surveys ']")
    public WebElement surveysBtn;

    @FindBy(xpath = "//button[text()=' Polls ']")
    public WebElement pollsBtn;

    public AssessmentAgencyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAssessmentAgencyRegister(){
        waitWebDriver(3000);
        scrollToElement(assessmentAgencyRegisterBtn);
        waitWebDriver(2000);
        object_Click(assessmentAgencyRegisterBtn);
    }

    public void clickOnExploreNowbutton(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(exploreNowBtn);
        object_Click(exploreNowBtn);
        waitWebDriver(3000);
    }

    public void clickOnViewInProfile(){
        waitTillTheElementIsVisibleAndClickable(viewInProfile);
        object_Click(viewInProfile);
        waitWebDriver(2000);
    }



}
