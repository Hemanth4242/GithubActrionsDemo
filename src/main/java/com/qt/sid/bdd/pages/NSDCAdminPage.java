package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NSDCAdminPage extends BasePage {

    public WebDriver driver;

    public NSDCAdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "title")
    public WebElement TitleText;

    @FindBy(xpath = "//button[@title='Datepicker']")
    public WebElement publishedDate;

    @FindBy(xpath = "//span[text()='Select Stakeholder']")
    public WebElement publishedfor;


    @FindBy(xpath = "//*[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
    public WebElement ex1;

    @FindBy(xpath = "//h1[text()='Announcement Creation']")
    public WebElement ex2;

    @FindBy(xpath = "//h1[text()='Announcement Creation']")
    public WebElement documentOpt;

    @FindBy(xpath = "//span[text()='Trainer']")
    public WebElement publishedforOption;

    @FindBy(id = "schemeeffectivedate")
    public WebElement publishDate;

    @FindBy(xpath = "//textarea[@formcontrolname='Description']")
    public WebElement description;

    @FindBy(id = "portal_name")
    public WebElement attachment;



    @FindBy(id = "portal_name")
    public WebElement saveAsDraft;

    @FindBy(xpath = "//span[text()='Create Announcement']")
    public WebElement createAnnouncementButton;

    @FindBy(xpath = "//*[text()=' 12 ']")
    public WebElement selectDate;

    @FindBy(id = "fileuploads")
    public WebElement uploadfile;

    @FindBy(xpath = "//span[@class='mat-radio-label-content']")
    public WebElement document;

    @FindBy(xpath = "//span[text()='URL/Weblink ']  ")
    public WebElement URLWeblink;

    @FindBy(xpath = "//button[text()=' Save As Draft ']")
    public WebElement SaveAsDraft;

    @FindBy(xpath = "/button[@class='btn-primary-style1 ng-star-inserted']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[text()=' Submit ']")
    public WebElement announcementSubmitBtn;

    @FindBy(xpath = "//*[text()='Form has been submitted successfully.']")
    public WebElement formSubmitMessage;

    @FindBy(xpath = "//button[text()=' Done ']")
    public WebElement doneButton;

    @FindBy(xpath = "//mat-error[@aria-live='polite']")
    public WebElement titleErrorMessage;


    @FindBy(xpath = "//h1[text()='Announcement Creation']")
    public WebElement announcementCreationText;


    public boolean titleErrorMessageDisplayed(){

        try {

            titleErrorMessage.isDisplayed();
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }



    public void clickOnUploadBanner(){

    }

    public void clickOnBannerTitleTextField(){

    }

    public void enterBannerTitle(){

    }

    public void clickOnEnterAltTextInUploadBanner(){

    }

    public void enterAltTextInTextField(){

    }

    public void clickOnRedirectionUrlTextField(){

    }

    public void enterTheRedirectionUrl(){

    }

    public void clickOnBannerRedirectionType(){

    }

    public void selectSamePageRedirection(){

    }

    public void selectDifferentPageRedirection(){

    }

    public void clickOnGoLiveDateofBanner(){

    }

    public void selectTheGoLiveDateOfBanner(){

    }

    public void clickOnEndDateOfBanner(){

    }

    public void selectTheEndDateOfBanner(){

    }

    public void clickOnUploadbannerToDesktop(){

    }

    public void clickOnPreviewTheUploadedBanner(){

    }

    public void clickOnManageBanner(){

    }

    public void clickOnEditBanner(){

    }

    public void clickOnCreateAnnouncement(){

        waitTillTheElementIsVisibleAndClickable(createAnnouncementButton);
        object_Click(createAnnouncementButton);

    }

    public void clickOnAnnouncementTitleTextField(){
        waitTillTheElementIsVisibleAndClickable(TitleText);
        clickWithJavaScript(TitleText);
    }
    public void clickOnCreateAnnouncementText(){
        waitTillTheElementIsVisibleAndClickable(TitleText);
        object_Click(TitleText);
    }


    public void EnterTheAnnouncementTitle(String title)
    {
        enterValueInTextBox(TitleText,title);

    }



    public void clickPulishDate()
    {
        object_Click(publishDate);
    }

    public void selectPublishFor(){
        waitTillTheElementIsVisibleAndClickable(publishedfor);
        object_Click(publishedfor);
        object_Click(publishedforOption);
        waitWebDriver(1000);


    }
    public void selectAccouncement(){
        object_Click(ex1);
        object_Click(ex2);

    }

    public void pressEscKey() throws InterruptedException {
        Thread.sleep(5000);
        escKey();
        Thread.sleep(5000);
    }
    public void selectTheSchemeOrProgram(){

    }
    public void clickOnPublishedBy(){

    }
    public void selectThePublishedBy(){

    }
    public void clickOnPublishedFor(){

    }
    public void selectThePublishedFor(){

    }
    public void clickOnPublishedDate(){
        waitWebDriver(2000);
        clickWithJavaScript(publishedDate);


    }
    public void selectThePublishedDate(){

        waitWebDriver(1000);
        object_Click(selectDate);
    }

    public void clickOnDescription(){
       scrollToElement(description);
       scrollUp();
       clickWithJavaScript(description);

    }

    public void enterDescription(String value){

        enterValueInTextBox(description,value);

    }

    public void uploadDocument(){
        scrollDown();
        waitWebDriver(2000);
        WebElement ele = driver.findElement(By.id("fileuploads"));
        ele.sendKeys(System.getProperty("user.dir")+"\\testdata\\samplepdf.pdf");

    }



    public void clcikOnURLRadioButton(){

    }

    public void clickOnURLTextField(){

    }

    public void enterTheSpecificURL(){

    }

    public void clickOnNoRestrictionToAccessAttachment(){

    }

    public void clickOnYesToSendNotificationsToAudience(){

    }

    public void clickOnModeOfSendingNotification(){

    }

    public void selectInAppMode(){

    }

    public void clickOnSaveAsDraft(){

    }

    public void clickOnSubmit(){
        scrollToElement(announcementSubmitBtn);
        waitWebDriver(2000);
       waitTillTheElementIsVisibleAndClickable(announcementSubmitBtn);
       clickWithJavaScript(announcementSubmitBtn);
       waitWebDriver(3000);
    }

    public void clickOnDoneButton(){
        waitTillTheElementIsVisibleAndClickable(doneButton);
        object_Click(doneButton);
    }

    public void clickOnMyAnnouncementsTwo(){

    }

    public void clickOnPending(){

    }

    public void clickOnViewDetails(){

    }

    public void clickOnSendBack(){

    }

    public void clickOnContinue(){

    }

    public void clickOnSave(){

    }

    public void clickOnMyAnnouncementsOne(){

    }

    public void clickOnSentBack(){

    }

    public void editTheAnnouncementTitle(){

    }

    public void clickOnApproveAndPublish(){

    }

    public void clickOnYesNow(){

    }

    public void enterLessThanMinimumCharactersRequiredInAssessmentTitle(){

    }

    public void clearAndEnterMinimumCharactersRequiredInAssessmentTitle(){

    }

    public void enterLessThanMinimumCharactersRequiredinAssessmentDescription(){

    }

    public void clearAndEnterTheMinimumCharactersRequriedInAssessmentDescription(){

    }

    public void enterMoreThanMaximumCharactersRequiredInAssessmentTitle(){

    }

    public void clearAndEnterMaximumCharactersRequiredInAssessmentTitle(){

    }

    public void enterMoreThanMaximumCharactersRequiredinAssessmentDescription(){

    }

    public void clearAndEnterTheMaximumCharactersRequriedInAssessmentDescription(){

    }

    public void verifyThePublishedByDetailsOnTheAssessment(){

    }








}
