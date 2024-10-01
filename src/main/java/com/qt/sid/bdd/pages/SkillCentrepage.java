package com.qt.sid.bdd.pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.sid.bdd.utils.FileReaderManager;
import org.testng.Assert;


public class SkillCentrepage extends BasePage{

    public WebDriver driver;

    @FindBy(xpath = "//span[text()='Skill Centre']")
    private WebElement SkillCentre;

	@FindBy(xpath = "//span[text()='Skill India Map']")
	private WebElement SkillIndiaMap;

    @FindAll({
            @FindBy(xpath = "//a[text()=' Job Exchange ']"),
            @FindBy(xpath = "//a[@href='/opportunities']")
    })
    private WebElement JobExchange;

    @FindBy(xpath = "//a[text()='Skill Centre']")
    public WebElement skillCentrePageText;
    
    @FindBy(xpath = "//*[text()=' ITI ']")
    public WebElement iTISection;
    
    @FindBy(xpath = "//*[text()=' JSS ']")
    public WebElement jSSSection;
    
    @FindBy(xpath = "//*[text()=' PMKVY ']")
    public WebElement pMKVYSection;

    @FindAll({
            @FindBy(xpath = "//*[text()=' Skill India Centres ']"),
            @FindBy(xpath = "//*[text()=' Skill India Centers ']")
    })
    public WebElement skillIndiaCentresSection;
    
    @FindBy(xpath = "//div[@class='card-detail']")
    public WebElement cardDetails;
    
    @FindBy(xpath = "//mat-panel-title[text()=' Location ']")
    public WebElement locationFilter;
    
    @FindBy(id = "stateSearch")
    public WebElement stateSearchField;
    
    @FindBy(xpath = "//label[text()='KARNATAKA']")
    public WebElement selectState;
    
    @FindBy(xpath = "//mat-panel-title[text()=' Interest Area ']")
    public WebElement industryFilter;
    
    @FindBy(xpath = "//label[text()='ELECTRONICS']")
    public WebElement selectElectronicsIndustry;
    
    @FindBy(xpath = "//mat-panel-title[text()=' Courses ']")
    public WebElement coursesFilter;

    @FindBy(xpath = "//button[text()=' Apply ']")
    public WebElement applyBtn;
    
    @FindBy(id = "courseSearch")
    public WebElement courseSearchField;
    
    @FindBy(xpath = "//label[text()='HW/2022']")
    public WebElement selectCourse;

    @FindAll({
            @FindBy(xpath = "//button[text()=' RESET ']"),
            @FindBy(xpath = "//button[text()=' RESET FILTER ']"),
            @FindBy(xpath = "//button[text()=' Reset ']")
    })
    public WebElement resetBtn;

    @FindAll({
            @FindBy(xpath = "//button[text()=' Sort ']"),
            @FindBy(xpath = "//span[text()='Sort']")
    })
    public WebElement sortBtn;
    
    @FindBy(xpath = "//button[text()=' A to Z ']")
    public WebElement sortAtoZOption;
    
    @FindBy(xpath = "//button[text()=' Z to A ']")
    public WebElement sortZtoAOption;
    
    @FindBy(id = "centreSearch")
    public WebElement skillCentreSearch;

    @FindBy(xpath = "(//*[@class='mat-radio-container'])[1]")
    public WebElement locationRadioButton;

    @FindBy(xpath = "//label[text()='UTTAR PRADESH']")
    public WebElement selectedRadioButton;

    @FindBy(xpath = "(//button[@title='Location' ])[2]")
    public WebElement locationIconOnCard;

    @FindBy(xpath = "(//button[@title='Share' ])[1]")
    public WebElement shareIconOnCard;

    @FindBy(xpath = "(//button[@title='Favorite' ])[1]")
    public WebElement favoriteIconOnCard;

    @FindBy(xpath = "(//*[@class='location' ])[1]")
    public WebElement centreAndLocationNameOnCard;

    @FindBy(xpath = "(//*[@class='mobile'])[1]")
    public WebElement phoneNumberOnCard;

    @FindAll({
            @FindBy(xpath = "//*[contains(@title,'.com')]"),
            @FindBy(xpath = "//*[contains(@title,'.in')]")
    })
    public WebElement emailOnCard;

    @FindBy(xpath = "(//*[text()='Courses Offered'])[1]")
    public WebElement coursesOfferedOnCard;

    @FindBy(xpath = "(//*[text()=' View Details '])[1]")
    public WebElement viewDetailsOnCard;

    @FindBy(xpath = "//a[text()='1']")
    public WebElement firstPageNumber;

    @FindBy(xpath = "//a[text()='2']")
    public WebElement secondPageNumber;

    @FindBy(xpath = "//a[text()='4']")
    public WebElement fourthPageNumber;

    @FindBy(xpath = "//a[text()='3']")
    public WebElement thirdPageNumber;

    @FindBy(xpath = "(//a[@class='page-link'])[2]")
    public WebElement leftArrow;

    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement rightArrow;

    @FindBy(xpath = "//*[text()='clear']")
    public WebElement closeIconInViewDetailsPopup;

    @FindBy(xpath = "//*[text()='Skill centre has been added to your favourite list']")
    public WebElement favoriteAddedMsg;

    @FindBy(xpath = "//*[text()='Skill centre has been removed from your favourite list']")
    public WebElement favoriteRemovedMsg;

    @FindBy(xpath = "//*[contains(text(),'Favourite')]")
    public WebElement favoriteCountAdded;

    @FindBy(xpath = "//*[@title='Close']")
    public WebElement closeSharePopup;

    @FindBy(xpath = "//*[@class='training-center-dailog']")
    public WebElement coursesOfferedDialogBox;

    @FindBy(xpath = "(//*[@class='mat-radio-label-content'])[1]")
    public WebElement locationName;

    
    public SkillCentrepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String checkJobSkillCentrepage() {
        return getTextOfObject(SkillCentre);
    }

	public void clickJobIndiaMapLink() {
		object_Click(SkillIndiaMap);
	}
    public void clickJobExchangeLink() {
        waitWebDriver(3000);
        clickWithJavaScript(JobExchange);
        waitWebDriver(2000);
    }
    
    public void clickOnSkillCentres() {
    	waitTillTheElementIsVisibleAndClickable(SkillCentre);
    	object_Click(SkillCentre);
      }
    
    public void navigatedToSkillCentresPage() {
    	waitTillTheElementIsVisibleAndClickable(skillCentrePageText);
    	
    }
    
    public void clickOnITI() {
    	waitTillTheElementIsVisibleAndClickable(iTISection);
    	object_Click(iTISection);
    }

    public void verifyOrangeColorFontOfITI(){
        String color =iTISection.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }
    
    public void clickOnJSS() {
    	waitTillTheElementIsVisibleAndClickable(jSSSection);
    	clickWithJavaScript(jSSSection);
    }
    
    public void clickOnPMKVYSection() {
    	waitWebDriver(5000);
    	waitTillTheElementIsVisibleAndClickable(pMKVYSection);
    	object_Click(pMKVYSection);
    }
    
    public void clickOnSkillIndiaCentres() {
    	waitWebDriver(5000);
    	waitTillTheElementIsVisibleAndClickable(skillIndiaCentresSection);
    	clickWithJavaScript(skillIndiaCentresSection);
    }

    public void visibilityOfContentCard() {
    	waitWebDriver(3000);
    	waitTillTheElementIsVisibleAndClickable(cardDetails);
    }
    
    public void clickOnLocationFilter() {
    	waitTillTheElementIsVisibleAndClickable(locationFilter);
    	object_Click(locationFilter);
        waitWebDriver(2000);
    }
    
    public void clickOnLocationSearchField() {
    	waitTillTheElementIsVisibleAndClickable(stateSearchField);
    	object_Click(stateSearchField);
        waitWebDriver(2000);
    }
    
    public void enterStateValueInLocationFilter() {
    	stateSearchField.sendKeys(FileReaderManager.getInstance().getConfigReader().getState());
    	waitWebDriver(2000);
    }


    public void selectStateFromLocation() {
    	waitTillTheElementIsVisibleAndClickable(selectState);
    	object_Click(selectState);
        waitWebDriver(2000);
    }
    
    public void clickOnIndustryFilter() {
    	waitTillTheElementIsVisibleAndClickable(industryFilter);
    	object_Click(industryFilter);
        waitWebDriver(2000);
    }
    
    public void selectIndustry() {
        scrollDown();
        waitWebDriver(2000);
    	waitTillTheElementIsVisibleAndClickable(selectElectronicsIndustry);
    	object_Click(selectElectronicsIndustry);
        waitWebDriver(2000);
    }
    
    public void clickOnCoursesFilter() {
    	waitWebDriver(4000);
    	waitTillTheElementIsVisibleAndClickable(coursesFilter);
    	clickWithJavaScript(coursesFilter);
        waitWebDriver(2000);

    }

    public void clickOnApplyBtn(){
        waitWebDriver(4000);
        waitTillTheElementIsVisibleAndClickable(applyBtn);
        clickWithJavaScript(applyBtn);
        waitWebDriver(2000);
    }
    
    public void clickOnCourseSearchField() {
        waitWebDriver(3000);
    	waitTillTheElementIsVisibleAndClickable(courseSearchField);
    	object_Click(courseSearchField);
    	waitWebDriver(2000);
    }
    
    public void enterCourseValueInCourseFilter() {
        waitWebDriver(2000);
    	courseSearchField.sendKeys(FileReaderManager.getInstance().getConfigReader().getCourse());
    	waitWebDriver(2000);
    }
    
    public void selectCourse() {
    	waitTillTheElementIsVisibleAndClickable(selectCourse);
    	object_Click(selectCourse);
        waitWebDriver(2000);
    }
    
    public void clickOnResetBtn() {
    	waitWebDriver(4000);
    	waitTillTheElementIsVisibleAndClickable(resetBtn);
    	clickWithJavaScript(resetBtn);
    }
    
    public void clickOnSortBtn() {
    	waitTillTheElementIsVisibleAndClickable(sortBtn);
    	object_Click(sortBtn);
    }
    
    public void selectSortZtoA() {
    	waitTillTheElementIsVisibleAndClickable(sortZtoAOption);
    	object_Click(sortZtoAOption);
    }
    
    public void selectSortAtoZ() {
    	waitTillTheElementIsVisibleAndClickable(sortAtoZOption);
    	object_Click(sortAtoZOption);
    }
    
    public void clickOnSkillCentreSearchField() {
    	waitTillTheElementIsVisibleAndClickable(skillCentreSearch);
    	object_Click(skillCentreSearch);
    	
    }
    
    public void enterSkillCentreValueFromConfig() {
    	skillCentreSearch.sendKeys(FileReaderManager.getInstance().getConfigReader().getBengaluruCity());
    	waitWebDriver(2000);
    }

    public void clickOnRadioButtonInLocation(){
        waitTillTheElementIsVisibleAndClickable(locationRadioButton);
        object_Click(locationRadioButton);
        waitWebDriver(2000);
    }

    public void verifyOrangeColorOfSelectedRadioButton(){
        String color =selectedRadioButton.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void verifyResetButtonColor(){
        waitWebDriver(2000);
        scrollDown();
        waitWebDriver(2000);
        String color =resetBtn.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void verifyFirstPageNumberColorHighlighted(){
        waitWebDriver(2000);
        scrollToElement(firstPageNumber);
        waitWebDriver(4000);
        //scrollUp();
        waitWebDriver(2000);
        String color =firstPageNumber.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);

    }

    public void verifyThirdPageNumberColorHighlighted(){
        waitWebDriver(2000);
        scrollToElement(thirdPageNumber);
        waitWebDriver(4000);
        //scrollUp();
        waitWebDriver(2000);
        String color =firstPageNumber.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);

    }

    public void verifyUserNavigatedToNextPagePostClickingRightArrow(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(rightArrow);
        object_Click(rightArrow);
        waitWebDriver(3000);
        scrollToElement(secondPageNumber);
        waitWebDriver(4000);
        scrollUp();
        waitWebDriver(2000);
        String color =secondPageNumber.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void verifyUserNavigatedToNextPagePostClickingRightArrowForState(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(rightArrow);
        object_Click(rightArrow);
        waitWebDriver(3000);
        scrollToElement(fourthPageNumber);
        waitWebDriver(4000);
       // scrollUp();
        waitWebDriver(2000);
        String color =secondPageNumber.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void verifyUserNavigatesBackToPreviousPage(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(leftArrow);
        object_Click(leftArrow);
        waitWebDriver(3000);
    }

    public void verifyClickOnParticularPageNumber(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(thirdPageNumber);
        object_Click(thirdPageNumber);
        waitWebDriver(3000);
        scrollToElement(thirdPageNumber);
        waitWebDriver(4000);
        scrollUp();
        waitWebDriver(2000);
    }

    public void clickOnViewDetails(){
        scrollUp();
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(viewDetailsOnCard);
        clickWithJavaScript(viewDetailsOnCard);
        waitWebDriver(2000);
    }

    public void clickOnFavorite(){
        waitTillTheElementIsVisibleAndClickable(favoriteIconOnCard);
        object_Click(favoriteIconOnCard);
    }

    public void clickOnShareIcon(){
        waitTillTheElementIsVisibleAndClickable(shareIconOnCard);
        object_Click(shareIconOnCard);
    }

    public void clickOnCloseSharePopup(){
        waitTillTheElementIsVisibleAndClickable(closeSharePopup);
        object_Click(closeSharePopup);
    }

    public void clickOnLocationIcon(){
        waitTillTheElementIsVisibleAndClickable(locationIconOnCard);
        object_Click(locationIconOnCard);
        waitWebDriver(5000);
    }

    public void clickOnCoursesOffered(){
        waitTillTheElementIsVisibleAndClickable(coursesOfferedOnCard);
        object_Click(coursesOfferedOnCard);
        waitWebDriver(2000);
    }

    public void verifyColorOfPMKVYSection(){
        String color =pMKVYSection.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void verifyColorOfLocationName(){
        String color =locationName.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void verifyColorOfSelectedInterestArea(){
        String color =selectElectronicsIndustry.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }
}
