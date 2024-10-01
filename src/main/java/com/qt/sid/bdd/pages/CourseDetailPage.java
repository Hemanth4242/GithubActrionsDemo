package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class CourseDetailPage extends BasePage {

    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;


    public CourseDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()=' Welding Technician ']"  )
    public WebElement courseDetailsPageVerify;

    @FindBy(xpath = "//button[text()=' Enroll ']")
    public WebElement enrolBtn;

    @FindBy(xpath = "//button[text()=' Continue ']")
    public WebElement continueBtn;

    @FindBy(xpath = "//*[text()=' Course Details']")
    public WebElement courseDetailsText;

    @FindBy(xpath = "//button[text()=' Pay Now ']")
    public WebElement payNowBtn;


    public String getContinnueText() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(continueBtn);
        return getTextOfObject(continueBtn);
    }

    public String getCourseDetailsText() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(courseDetailsText);
        return getTextOfObject(courseDetailsText);
    }

    public boolean getEnrolBtnVerification() {
        waitTillTheElementIsVisibleAndClickable(enrolBtn);
        return isElementPresent(enrolBtn);
    }

    public boolean getContinueBtnVerification() {
        waitTillTheElementIsVisibleAndClickable(continueBtn);
        return isElementPresent(continueBtn);
    }

    public String getTextCourseDetailsPage(){
    	waitWebDriver(3000);
      return getTextOfObject(courseDetailsPageVerify);
    }

    public boolean getPayNowBtnVerification()  {
        // waitTillTheElementIsVisibleAndClickable(payNowBtn);
        return isElementPresent(payNowBtn);}


}
