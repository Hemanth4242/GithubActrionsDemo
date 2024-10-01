package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class TrainerPage extends BasePage {


    public WebDriver driver;

    @FindBy(xpath = "//p[text()='Session Overview']")
    public WebElement sessionOverviewSection;

    @FindBy(xpath = "//h1[text()='Session Overview']")
    public WebElement sessionOverViewText;

    @FindBy(xpath = "//button[text()=' Upcoming Sessions ']")
    public WebElement upcomingSessionsBtn;

    @FindBy(xpath = "//button[text()=' Completed Sessions ']")
    public WebElement completedSessionsBtn;

    @FindBy(xpath = "//p[text()='Session Calendar']")
    public WebElement sessionCalendarSection;

    @FindBy(xpath = "//*[@class='calender-header']")
    public WebElement calendarHeader;

    @FindBy(xpath = "//p[text()='My Sessions']")
    public WebElement mySessionsSection;

    @FindBy(xpath = "(//span[@class='btn-text'])[3]")
    public WebElement profileNameSection;

    @FindBy(xpath = "//button[text()=' Create Session ']")
    public WebElement createSessionBtn;

    @FindBy(xpath = "//a[text()=' Create Live Session ']")
    public WebElement createLiveSessionLink;

    @FindBy(id = "sessionName")
    public WebElement sessionTitle;

    @FindBy(xpath = "//*[text()='Select Sector']")
    public WebElement selectSectorDropdown;

    @FindBy(xpath = "//*[text()=' Aerospace and Aviation ']")
    public WebElement aerospaceAndAviationSector;

    @FindBy(xpath = "//*[@formcontrolname='Description']")
    public WebElement descriptionSection;

    @FindBy(xpath = "//*[@formcontrolname='StartTime']")
    public WebElement startTimeDropdown;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
    public  WebElement startTimeValue;

    @FindBy(xpath = "//*[@formcontrolname='EndTime']")
    public WebElement endTimeDropdown;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[3]")
    public WebElement endTimeValue;

    @FindBy(xpath = "//*[@formcontrolname='Language']")
    public WebElement languageDropdown;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
    public WebElement selectLanguage;

    @FindBy(xpath = "//*[@formcontrolname='TrainerName']")
    public WebElement trainerNameSection;

    @FindBy(xpath = "//button[text()=' Upload ']")
    public WebElement uploadButton;

    @FindBy(id = "fileInput")
    public WebElement fileInputField;

    @FindBy(xpath = "//button[text()=' Connect ']")
    public WebElement connectButton;

    @FindBy(xpath = "//*[text()='Connect with legacy MSDE system']")
    public WebElement connectPopupText;

    @FindBy(xpath = "//*[text()=' Do you have an account with legacy MSDE system? ']")
    public WebElement questionUnderConnnectPopup;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement yesBtn;

    @FindBy(xpath = "//*[text()='No']")
    public WebElement noBtn;

    @FindBy(xpath = "//*[@formcontrolname='UserName']")
    public WebElement userNameField;

    @FindBy(xpath = "//*[text()='User Name is required']")
    public WebElement userNameRequiredMsg;




    public TrainerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSessionOverview(){
        waitWebDriver(2000);
        scrollToElement(sessionOverviewSection);
        waitTillTheElementIsVisibleAndClickable(sessionOverviewSection);
        object_Click(sessionOverviewSection);
        waitWebDriver(1000);
    }

    public void clickOnSessionCalendar(){
        waitWebDriver(2000);
        scrollToElement(sessionCalendarSection);
        waitTillTheElementIsVisibleAndClickable(sessionCalendarSection);
        object_Click(sessionCalendarSection);
        waitWebDriver(1000);
    }

    public void clickOnMySessions(){
        waitTillTheElementIsVisibleAndClickable(mySessionsSection);
        object_Click(mySessionsSection);
        waitWebDriver(2000);
    }

    public void clickOnMyProfile(){
        try {
            waitWebDriver(2000);
            waitTillTheElementIsVisibleAndClickable(profileNameSection);
            object_Click(profileNameSection);
            waitWebDriver(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clickOnCreateSessionBtn(){
        waitTillTheElementIsVisibleAndClickable(createSessionBtn);
        object_Click(createSessionBtn);
        waitWebDriver(2000);
    }

    public void clickOnSessionTitle(){
        waitTillTheElementIsVisibleAndClickable(sessionTitle);
        object_Click(sessionTitle);
        waitWebDriver(2000);
    }

    public void enterSessionTitle(){
        waitWebDriver(1000);
        sessionTitle.sendKeys("AutomationDemo");
        waitWebDriver(1000);
    }

    public void clickOnSectorDropdown(){
        waitTillTheElementIsVisibleAndClickable(selectSectorDropdown);
        object_Click(selectSectorDropdown);
        waitWebDriver(1000);
    }

    public void selectSectorFromDropdown(){
        waitTillTheElementIsVisibleAndClickable(aerospaceAndAviationSector);
        object_Click(aerospaceAndAviationSector);
        waitWebDriver(1000);
    }

    public void clickOnDescriptionSection(){
        waitTillTheElementIsVisibleAndClickable(descriptionSection);
        object_Click(descriptionSection);
        waitWebDriver(1000);
    }

    public void enterTheDescription(){
        descriptionSection.sendKeys("Demo Session");
        waitWebDriver(2000);
    }

    public void clickOnStartTime(){
        waitTillTheElementIsVisibleAndClickable(startTimeDropdown);
        clickWithJavaScript(startTimeDropdown);
        waitWebDriver(1000);
    }

    public void selectStartTime(){
        waitTillTheElementIsVisibleAndClickable(startTimeValue);
        clickWithJavaScript(startTimeValue);
        waitWebDriver(2000);
    }

    public void clickOnEndTime(){
        waitTillTheElementIsVisibleAndClickable(endTimeDropdown);
        clickWithJavaScript(endTimeDropdown);
        waitWebDriver(1000);
    }

    public void selectEndTime(){
        waitTillTheElementIsVisibleAndClickable(endTimeValue);
        clickWithJavaScript(endTimeValue);
        waitWebDriver(2000);
    }

    public void clickOnLanguageDropdown(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(languageDropdown);
        object_Click(languageDropdown);
        waitWebDriver(2000);
    }

    public void selectTheLanguage(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(selectLanguage);
        clickWithJavaScript(selectLanguage);
        waitWebDriver(2000);
    }

    public void clickOnUploadBtn(){
        waitTillTheElementIsVisibleAndClickable(uploadButton);
        object_Click(uploadButton);
        waitWebDriver(2000);
    }

    public void uploadTheFile(){
        waitWebDriver(2000);
        WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
        ele.sendKeys(System.getProperty("user.dir")+"\\testdata\\Upload content-mp4.mp4");
        waitWebDriver(5000);
        waitWebDriver(5000);
    }

    public void scrollTillLanguageDropdown(){
        waitWebDriver(2000);
        scrollToElement(languageDropdown);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);
    }

    public void clickOnConnect(){
        waitTillTheElementIsVisibleAndClickable(connectButton);
        object_Click(connectButton);
        waitWebDriver(2000);
    }

    public void clickOnYesBtn(){
        waitTillTheElementIsVisibleAndClickable(yesBtn);
        object_Click(yesBtn);
        waitWebDriver(2000);
    }

    public void clickOnNoBtn(){
        waitTillTheElementIsVisibleAndClickable(noBtn);
        object_Click(noBtn);
        waitWebDriver(2000);
    }

    public void clickOnUsernameField(){
        waitTillTheElementIsVisibleAndClickable(userNameField);
        object_Click(userNameField);
        waitWebDriver(2000);
    }



}
