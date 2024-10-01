package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileDetailsPage extends BasePage {

    public WebDriver driver;

    public ProfileDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(xpath = "//div[@class='userprofile-user-name']/*[text()=' Manjunath S N ']"),
            @FindBy(xpath = "//div[@class='userprofile-user-name']/*[text()=' Md Zafar Alam ']")
    })
    private WebElement profileDetailsPage;

    @FindBy(xpath = "//img[@alt='user profile photo']")
    private WebElement profileImgae;

    @FindBy(xpath = "//button[text()=' Download Profile ']")
    private WebElement downloadBtn;

    @FindBy(xpath = "//button[@title='Share']")
    private WebElement shareBtn;

    @FindBy(xpath = "//div[@class='dialog-header']/*[text()=' Share this User Profile ']")
    private WebElement verifySharePage;

    @FindBy(xpath = "//div[@class='d-flex justify-content-end ng-star-inserted']/button[@title='Edit']")
    private WebElement editBtn;

    @FindBy(xpath = "//div[@class='adress-header']/*[text()='Communication Address']")
    private WebElement editPageVerify;

    @FindBy(xpath = "//button[@title='Delete']")
    private WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='dialog-header']/*[text()=' Confirmation ']")
    private WebElement verifyDeletePage;

    @FindBy(xpath = "//button[text()=' Update ']")
    private WebElement updateBtn;

    @FindBy(xpath = "//input[@id='Address1']")
    private WebElement addressLine1TextField;

    @FindBy(xpath = "//input[@id='Address2']")
    private WebElement addressLine2TextField;

    @FindBy(xpath = "//mat-label[text()='State']/ancestor::div[contains(@class,'mat-form-field-infix ng-tns')]/mat-select")
    private WebElement stateDropDown;

    @FindBy(xpath = "//span[text()='BIHAR']/parent::mat-option")
    private WebElement selectState;

    @FindBy(xpath = "//mat-select[@formcontrolname='District']")
    private WebElement districtDropDown;

    @FindBy(xpath = "//span[text()='KHAGARIA']/parent::mat-option")
    private WebElement selectDistrict;

    @FindBy(xpath = "//mat-select[@formcontrolname='Block']")
    private WebElement blockDropDown;

    @FindBy(xpath = "//span[text()='Khagaria']/parent::mat-option")
    private WebElement selectBlock;

    @FindBy(xpath = "//input[@id='pinCode']")
    private WebElement pinCodeTextField;

    @FindBy(xpath = "//input[@id='cityInput']")
    private WebElement cityVillageTextField;

    @FindBy(xpath = "//*[text()='Communication Address']/parent::div//*[@class='ng-star-inserted']")
    private WebElement getAllUpdatedAddress;

    @FindBy(xpath = "//button[text()=' Add Address ']")
    private WebElement addAddressBtn;

    @FindBy(xpath = "//button[text()=' Add ']")
    private WebElement addBtn;

    @FindBy(xpath = "//button[text()=' Yes ']")
    private WebElement yesBtn;

    @FindAll({
            @FindBy(xpath = "//*[text()=' Language ']"),
            @FindBy(xpath = "//mat-expansion-panel-header[contains(@id,'mat-expansion-panel-header-1')]")
    })
    private WebElement languageBtn;

    @FindAll({
            @FindBy(xpath = "//*[contains(text(),'Languages')]"),
            @FindBy(xpath = "//span[text()='Languages']")
    })
    private WebElement languageText;

    @FindBy(xpath = "//td[text()=' English ']/parent::tr//mat-checkbox")
    private List<WebElement> englishAllCheckbox;

    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement saveBtn;

    @FindBy(xpath = "//span[text()='Language settings updated successfully']")
    private WebElement languageSelectedText;


    @FindBy(xpath = "//button[text()=' Add Address ']")
    public WebElement addAddressButton;

    public boolean languageSelectedTextIsDisplyed() {
        waitTillTheElementIsVisibleAndClickable(languageSelectedText);
        return isElementPresent(languageSelectedText);
    }


    public void clickOnSaveBtn() {
        waitTillTheElementIsVisibleAndClickable(saveBtn);
        clickWithJavaScript(saveBtn);
    }

    public void englishCheckBoxIsSelected() throws InterruptedException {
        for(WebElement ele : englishAllCheckbox) {
            waitTillTheElementIsVisibleAndClickable(ele);
            clickWithJavaScript(ele);
        }
    }


    public boolean languageTextIsDisplayed() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(languageText);
        return isElementPresent(languageText);
    }

    public void clickoNLanguageBtn() {
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(languageBtn);
        object_Click(languageBtn);
    }



    public void clickOnYesBtn() {
        waitTillTheElementIsVisibleAndClickable(yesBtn);
        clickWithJavaScript(yesBtn);
    }

    public void clickOnAddBtn() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(addBtn);
        Thread.sleep(4000);
        clickWithJavaScript(addBtn);
    }

    public boolean addBtnIsEnabled() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(addBtn);
       return addBtn.isEnabled();
    }

    public void clickOnAddAdressBtn() throws InterruptedException {

        clickWithJavaScript(addAddressBtn);
    }


     public  String getTextUpdatedAdress(){
         waitTillTheElementIsVisibleAndClickable(getAllUpdatedAddress);
         return getTextOfObject(getAllUpdatedAddress);
     }

    public boolean addressBtnIsDisplayed(){
        waitTillTheElementIsVisibleAndClickable(addAddressBtn);
        return isElementPresent(addAddressBtn);
    }

    public void clickStateDropDown() {
        waitTillTheElementIsVisibleAndClickable(stateDropDown);
        clickWithJavaScript(stateDropDown);
    }

    public void selectState() throws InterruptedException {
        waitTillTheElementIsVisibleAndClickable(selectState);
        clickWithJavaScript(selectState);
        //Thread.sleep(1000);
    }

    public void clickDistrictDropDown()  {
        waitWebDriver(3000);
        clickWithJavaScript(districtDropDown);
    }
    public void selectDistrict() throws InterruptedException {

        waitTillTheElementIsVisibleAndClickable(selectDistrict);
        clickWithJavaScript(selectDistrict);
    }

    public void clickOnBlockDropDown()  {
        waitTillTheElementIsVisibleAndClickable(blockDropDown);
        clickWithJavaScript(blockDropDown);
    }

    public void selectBlock() {
        clickWithJavaScript(selectBlock);
    }

    public void sendAddressLine1(String value) {
        addressLine1TextField.clear();
        waitTillTheElementIsVisibleAndClickable(addressLine1TextField);
        addressLine1TextField.sendKeys(value);
    }

    public void clearAddressLine1(){
        addressLine1TextField.clear();
    }
    public void clearAddressLine2(){
        addressLine2TextField.clear();
    }
    public void clearStateText(){
        stateDropDown.clear();
    }
    public void clearDistrict(){
        districtDropDown.clear();
    }
    public void clearBlockText(){
        blockDropDown.clear();
    }
    public void clearPincode(){
        pinCodeTextField.clear();
    }
    public void clearCityVillageText(){
        cityVillageTextField.clear();
    }


    public void sendAddressLine2(String value) {
        addressLine2TextField.clear();
        addressLine2TextField.sendKeys(value);
    }


    public void sendCityAndVillage(String value) {
        cityVillageTextField.clear();
        cityVillageTextField.sendKeys(value);
    }

    public void sendPincode(String value) {
        pinCodeTextField.clear();
        pinCodeTextField.sendKeys(value);
    }

    public void clickOnUpdateBtn() {
        clickWithJavaScript(updateBtn);
    }

    public boolean deletePageIsDisplayed() {
        waitTillTheElementIsVisibleAndClickable(verifyDeletePage);
        return isElementPresent(verifyDeletePage);
    }


    public void clickOnDeleteBtn() {
        clickWithJavaScript(deleteBtn);
    }

    public boolean editPageTextIsDisplayed() {
        waitTillTheElementIsVisibleAndClickable(editPageVerify);
        return isElementPresent(editPageVerify);
    }

    public void clickOnEditBtn() {
        waitTillTheElementIsVisibleAndClickable(editBtn);
        clickWithJavaScript(editBtn);
    }

    public void clickOnAddAddress(){
        waitTillTheElementIsVisibleAndClickable(addAddressButton);
        clickWithJavaScript(addAddressButton);
    }

    public boolean sharaPageIsDisplayed() {
        waitTillTheElementIsVisibleAndClickable(verifySharePage);
        return isElementPresent(verifySharePage);
    }

    public void clickOnShareBtn() {
        clickWithJavaScript(shareBtn);
    }

    public void clickOnDownloadBtn() {
        clickWithJavaScript(downloadBtn);
    }


    public boolean profilrDetailsPageIsDisplayed() {
        waitTillTheElementIsVisibleAndClickable(profileDetailsPage);
       return isElementPresent(profileDetailsPage);
    }

    public String getTagNameOfProfileImage() {
       return profileImgae.getTagName();
    }

   }
