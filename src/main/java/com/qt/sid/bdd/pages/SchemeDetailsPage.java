package com.qt.sid.bdd.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SchemeDetailsPage extends BasePage{

    public WebDriver driver;
    public SchemeDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()=' Apply Now ']")
    public WebElement applyNowBtn;

    @FindBy(xpath = "//*[normalize-space()='Courses in Short Term Training']")
    public WebElement coursesHeading;

    @FindBy(xpath = "//button[text()=' Apply ']")
    public WebElement applyOnCoursesBtn;

    @FindBy(xpath = "//button[text()=' Show Interest ']")
    public WebElement showInterestedBtn;

    @FindBy(xpath = "//button[@class='share-btn']")
    public WebElement shareBtn;

    @FindAll({
            @FindBy(xpath = "//*[normalize-space(text())='Share this skilling program job role']"),
            @FindBy(xpath = "//*[text()=' Share this scheme ']"),
            @FindBy(xpath = "//*[text()=' Share this scheme job role ']")
    })
    public WebElement shareHeading;

    @FindBy(xpath = "//span[normalize-space()='Continue to Chat']")
    public WebElement verifyWatsappPage;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement verifyFacebookPage;

    @FindBy(xpath = "//span[text()='Sign in to X']")
    public WebElement verifyThatTwitterPage;

    @FindBy(xpath = "//button[@id='join-form-submit']")
    public WebElement verifyThatLinkedInPage;

    @FindBy(xpath = "//button[@class='mat-focus-indicator whatsapp mat-button mat-button-base']")
    public WebElement watsappBtn;

    @FindBy(xpath = "//button[@class='mat-focus-indicator facebook mat-button mat-button-base']")
    public WebElement faceBookBtn;

    @FindBy(xpath = "//button[@class='mat-focus-indicator twitter mat-button mat-button-base']")
    public WebElement twitterBtn;

    @FindBy(xpath = "//button[@class='mat-focus-indicator linkedin mat-button mat-button-base']")
    public WebElement linkedInBtn;

    @FindBy(xpath = "//button[@class='mat-focus-indicator copy-link mat-button mat-button-base']")
    public WebElement copyLinkBtn;

    @FindBy(xpath = "//button[@class='mat-focus-indicator copy-link mat-button mat-button-base']//span[@class='mat-ripple mat-button-ripple']")
    public WebElement verifyCopiLinkedBtn;

    @FindBy(xpath = "//div[@class='skill-course-card-img']/img")
    public WebElement coursesImage;

    @FindBy(xpath = "//button[text()=' View details ']")
    public WebElement viewDetailsBtn;


    public void clickOnViewDetails(){
        clickWithJavaScript(viewDetailsBtn);
    }

    public void clickOnCoursesImage(){
        clickWithJavaScript(coursesImage);
    }

    public boolean verifyCopyLinkedText() {
        return isElementPresent(verifyCopiLinkedBtn);
    }

    public void clickOnCopyLinkBtn(){
        clickWithJavaScript(copyLinkBtn);
    }


    public void clickOnLinkedInBtn(){
        clickWithJavaScript(linkedInBtn);
    }

    public void clickOnTwitterBtn(){
        clickWithJavaScript(twitterBtn);
    }

    public void clickOnFacebookBtn(){
        clickWithJavaScript(faceBookBtn);
    }

    public void clickOnWatsappBtn(){
        clickWithJavaScript(watsappBtn);
    }

    public boolean linkedInPageIsDisplayed() {
        return isElementPresent(verifyThatLinkedInPage);
    }

    public boolean twitterPageIsDisplayed() {
        return isElementPresent(verifyThatTwitterPage);
    }

    public boolean facebookPageIsDisplayed() {
        return isElementPresent(verifyFacebookPage);
    }

    public boolean watsappPageTextIsDisplayed() {
        return isElementPresent(verifyWatsappPage);
    }


    public boolean shareHeadingIsDisplayed() {
        return isElementPresent(shareHeading);
    }

    public void clickOnShareBtn(){
        waitWebDriver(3000);
        clickWithJavaScript(shareBtn);
        waitWebDriver(2000);
    }

    public boolean showInterestedBtnIsDisplayed() {
        return isElementPresent(showInterestedBtn);
    }


    public void clickOnApplyOnCoursesBtn(){
        clickWithJavaScript(applyOnCoursesBtn);
    }

    public boolean courseHeadingIsDisplayed() {
        return isElementPresent(applyNowBtn);
    }


    public String getTextApplyNowBtn() {
        return getTextOfObject(applyNowBtn);
    }

    public void clickOnApplyNowBtn(){
        waitWebDriver(3000);
        object_Click(applyNowBtn);
    }








}
