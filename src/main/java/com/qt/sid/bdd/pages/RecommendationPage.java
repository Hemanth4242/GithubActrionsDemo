package com.qt.sid.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RecommendationPage extends BasePage {

	public WebDriver driver;

	public RecommendationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Recommendation']")
	private WebElement Recommendation;

	@FindBy(xpath = "//span[text()='Skill Courses']")
	private WebElement SkillCourse;
	@FindBy(xpath = "//span[text()=' What is your highest education qualification? ']")
	private WebElement educationQualification;
	@FindBy(xpath = "//span[text()=' Job Exchange ']")
	private WebElement JobExchange;


	@FindBy(xpath = "//button[text()='Below Class 10']")
	public WebElement highestEduBtn;

	@FindBy(xpath = "(//button[text()=' Yes '])[1]")
	private WebElement workExperianceBtn;


	@FindBy(xpath = "(//button[text()=' Yes '])[2]")
	private WebElement locationTrainiBtn;

	@FindBy(xpath = "//input[@id='experienceYear']")
	public WebElement noOfYearTextfield;

	@FindBy(xpath = "//input[@id='experienceMonth']")
	public WebElement noOfMonthTextfield;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	public WebElement nextBtn;

	@FindBy(xpath = "//span[contains(.,' International opportunities ')]/preceding-sibling::span/input")
	private WebElement relocateRadioBtn;

	@FindBy(xpath = "(//button[contains(@class,'mat-focus-indicator mat-icon-button mat-button-base ng-tns-c')])[1]")
	private WebElement countryBtn;

	@FindBy(xpath = "(//button[contains(@class,'mat-focus-indicator mat-icon-button mat-button-base ng-tns-c')])[2]")
	private WebElement districtBtn;

	@FindBy(xpath = "//input[@data-placeholder='Search Country']")
	private WebElement searchCountryTextfield;



	@FindBy(xpath = "//span[text()=' India ']/parent::mat-option")
	private WebElement matOption;

	@FindBy(xpath = "//span[text()=' Agricultural ']/parent::mat-option")
	private WebElement matOptionIntrestedArea;


	@FindBy(xpath = "//input[@data-placeholder='Search District']")
	private WebElement searchDistrictTextfield;

	@FindBy(xpath = "//input[@id='searchYourAreaOfInterest']")
	public WebElement intrestedAreaTextfield;

	@FindBy(xpath = "//*[text()=' What is your highest education qualification? ']")
	public WebElement higestQualificationQuestion;

	@FindBy(xpath = "//button[text()='Below Class 10']")
	public WebElement belowClass10;

	@FindBy(xpath = "//button[text()='Class 10']")
	public WebElement class10;

	@FindBy(xpath = "//button[text()='Class 12']")
	public WebElement class12;

	@FindBy(xpath = "//button[text()='Diploma']")
	public WebElement diploma;

	@FindBy(xpath = "//button[text()=' Graduation ']")
	public WebElement graducation;

	@FindBy(xpath = "//button[text()=' Post Graduation ']")
	public WebElement postGraduation;

	@FindBy(xpath = "(//button[text()=' Yes '])[1]")
	public WebElement YesButton1;

	@FindBy(xpath = "(//button[text()=' Yes '])[2]")
	public WebElement YesButton2;

	@FindBy(xpath = "(//button[text()=' No '])[1]")
	public WebElement NoButton1;

	@FindBy(xpath = "(//button[text()=' No '])[2]")
	public WebElement NoButton2;

	@FindBy(xpath = "(//*[text()=' No '])[3]")
	public WebElement NoButton3;

	@FindBy(xpath = "//*[text()=' Do you have any work experience? ']")
	public WebElement experienceQuestion;

	@FindBy(xpath = "//button[text()=' Back ']")
	public WebElement backButton;

	@FindBy(xpath = "//*[text()=' Total work experience ']")
	public WebElement totalWorkExperience;

	@FindBy(xpath = "//*[text()=' Will you be willing to move to another location for training, jobs or apprenticeships? ']")
	public WebElement relocateQuestionText;

	@FindBy(xpath = "//*[text()=' Within India']")
	public WebElement withinIndiaOption;

	@FindBy(xpath = "(//*[text()='Select One'])[1]")
	public WebElement stateDropdown;

	@FindBy(xpath = "//*[text()=' International opportunities ']")
	public WebElement internationalOpportunities;

	@FindBy(xpath = "//*[text()=' ANDHRA PRADESH ']")
	public WebElement selectAndhra;

	@FindAll({
			@FindBy(xpath = "//*[text()='Select One']"),
			@FindBy(xpath = "(//*[text()='Select One'])[2]")
	})
	public WebElement districtDropdown;

	@FindAll({
			@FindBy(xpath = "//*[text()=' ANANTAPUR ']"),
			@FindBy(xpath = "//*[text()=' Anantapur ']")
	})
	public WebElement selectAnantapur;

	@FindBy(xpath = "//*[text()='Select One']")
	public WebElement countryDropdown;

	@FindBy(xpath = "//*[text()=' Afghanistan ']")
	public WebElement selectAfghanistanCountry;

	@FindBy(xpath = "//*[text()=' Tell us your interest areas ']")
	public WebElement tellUsYourInterestText;


	@FindBy(xpath = "//*[text()=' Suggestions ']")
	public WebElement suggestionsText;

	@FindBy(xpath = "//button[text()=' Back to recommendation ']")
	public WebElement backToRecommendationButton;

	@FindBy(xpath = "//*[text()=' Healthcare ']")
	public WebElement healthCare;

	@FindBy(xpath = "//*[@class='mat-radio-container']")
	public List<WebElement> radioButtons;

	@FindBy(xpath = "//button[text()=' Submit ']")
	public WebElement submitBtn;

	@FindBy(xpath = "//*[text()=' Active Recommendation ']")
	public WebElement activeRecommendationText;

	@FindBy(xpath = "//button[text()=' Back to counseling ']")
	public WebElement backToCounselingBtn;

	@FindBy(xpath = "//*[text()=' View Answers ']")
	public WebElement viewAnswers;

	@FindBy(xpath = " //*[text()=' Citizens with similar preferences have been provided with the following recommendations ']")
	public WebElement assertionTextInRecommendation;

	@FindBy(xpath = "//*[text()=' Recommended Job Exchange ']")
	public WebElement recommendedJobExchangeHeader;

	@FindBy(xpath = "//button[text()=' View Details ']")
	public WebElement viewDetailsBtn;

	@FindBy(xpath = "//button[text()=' Jobs ']")
	public WebElement jobsSection;

	@FindBy(xpath = "//*[text()=' Skills you may also be interested in ']")
	public WebElement skillsHeader;

	@FindBy(xpath = "//*[@class='skill-course-card-v2']")
	public List<WebElement> skillCard;

	@FindBy(xpath = "//*[@class='course-title']")
	public WebElement courseTitle;

	@FindBy(xpath = "//button[text()=' Apply Now ']")
	public WebElement applyNowBtn;

	@FindBy(xpath = "//*[@class='header-content']")
	public WebElement skillHeaderSection;




	public void openRecommendationpage() throws InterruptedException {

		object_Click(Recommendation);

	}
	public String checkRecommendationpage()  {
		waitVisibleElement(Recommendation,50);
		return getTextOfObject(Recommendation);
	}
	public void clickSkillCourseLink() {
		waitTillTheElementIsVisibleAndClickable(SkillCourse);
		object_Click(SkillCourse);
	}

	public void clickHighestEduBtn() {
		waitClickableElement(highestEduBtn, 30);
		object_Click(highestEduBtn);
	}

	public void selectEducationAndVerifycolorOfHighestEducation(){
		object_Click(highestEduBtn);
		waitWebDriver(2000);
		String color =highestEduBtn.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#042cb0";
		Assert.assertEquals(bc,expectedColor);
	}

	public void clickLocationTrainBtn() {
		waitClickableElement(locationTrainiBtn, 30);
		object_Click(locationTrainiBtn);
	}



	public void clickWorkExperianceBtn() {
		object_Click(workExperianceBtn);
	}

	public void clickOnLocationYesButton(){
		object_Click(YesButton2);
	}

	public void clickOnNoButtonInExperiencePage(){
		waitTillTheElementIsVisibleAndClickable(NoButton1);
		object_Click(NoButton1);
		waitWebDriver(2000);
	}

	public void sendNoOfYearTextfield(String value) {
		waitVisibleElement(noOfYearTextfield, 30);
		noOfYearTextfield.sendKeys(value);
	}

	public void sendNoOfMonthTextfield(String value) {
		waitVisibleElement(noOfMonthTextfield, 30);
		noOfMonthTextfield.sendKeys(value);

	}

	public void clickNextBtn() {
		waitClickableElement(nextBtn, 30);
		object_Click(nextBtn);

	}

	public void clickRelocateRadioBtn() {
		clickWithJavaScript(relocateRadioBtn);

	}

	public void clickStateBtn() {
		object_Click(countryBtn);
	}

	public void sendtDistrictBtn() {
		object_Click(districtBtn);
	}

	public void sendSearchStateTextfield(String value) {
		searchCountryTextfield.sendKeys(value);
	}

	public void sendSearchDistrictTextfield(String value) {
		searchDistrictTextfield.sendKeys(value);

	}

	public void clickMatOption() {
		object_Click(matOption);
	}

	public void sendIntrestedAreaTextfield(String value) {
		waitVisibleElement(intrestedAreaTextfield, 30);
		intrestedAreaTextfield.sendKeys(value);

	}

	public void clickOnLocationBtn(){
		clickWithJavaScript(relocateRadioBtn);
	}

	public void clickOnCountryBtn(){
		clickWithJavaScript(countryBtn);
	}

	public void sendSearchContryTextField(String value){
		searchCountryTextfield.sendKeys(value);
	}

	public void clickMatOptionIntrestedArea(){
		object_Click(matOptionIntrestedArea);
	}






	public void getselfAssessmentTextFill(String year, String month, String country, String intrestArea) throws InterruptedException {

		clickHighestEduBtn();
		clickNextBtn();
		clickWorkExperianceBtn();
		sendNoOfYearTextfield(year);
		sendNoOfMonthTextfield(month);
		clickNextBtn();
		clickLocationTrainBtn();
		clickRelocateRadioBtn();
		clickOnCountryBtn();
		sendSearchContryTextField(country);
		clickMatOption();
		clickNextBtn();
		sendIntrestedAreaTextfield(intrestArea);
		clickMatOptionIntrestedArea();
		clickNextBtn();
	}

	public void clickOnWithinIndia(){
		waitTillTheElementIsVisibleAndClickable(withinIndiaOption);
		object_Click(withinIndiaOption);
		waitWebDriver(2000);
	}

	public void clickOnInternationalOpportunities(){
		waitTillTheElementIsVisibleAndClickable(internationalOpportunities);
		object_Click(internationalOpportunities);
		waitWebDriver(2000);
	}

	public void clickOnNoButtonInLocation(){
		waitTillTheElementIsVisibleAndClickable(NoButton2);
		object_Click(NoButton2);
		waitWebDriver(2000);
	}

	public void clickOnStateDropdown(){
		waitTillTheElementIsVisibleAndClickable(stateDropdown);
		object_Click(stateDropdown);
		waitWebDriver(2000);
	}

	public void selectStateValueFromDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectAndhra);
		object_Click(selectAndhra);
		waitWebDriver(2000);
	}

	public void clickOnDistrictDropdown(){
		waitTillTheElementIsVisibleAndClickable(districtDropdown);
		object_Click(districtDropdown);
		waitWebDriver(2000);
	}

	public void selectDistrictValueFromDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectAnantapur);
		object_Click(selectAnantapur);
		waitWebDriver(2000);
	}

	public void clickOnCountryDropdown(){
		waitTillTheElementIsVisibleAndClickable(countryDropdown);
		object_Click(countryDropdown);
		waitWebDriver(2000);
	}

	public void selectAfghanCountry(){
		waitTillTheElementIsVisibleAndClickable(selectAfghanistanCountry);
		object_Click(selectAfghanistanCountry);
		waitWebDriver(2000);
	}

	public void clickOnBackButton(){
		waitTillTheElementIsVisibleAndClickable(backButton);
		object_Click(backButton);
		waitWebDriver(2000);
	}

	public void clickEnterAndSelectInterestArea(){
		waitTillTheElementIsVisibleAndClickable(intrestedAreaTextfield);
		intrestedAreaTextfield.sendKeys("health");
		waitWebDriver(2000);
		object_Click(healthCare);
		waitWebDriver(1000);
	}

	public void clickOnSuggestionRadioBtn(){
		waitTillTheElementIsVisibleAndClickable(radioButtons.get(0));
		object_Click(radioButtons.get(0));
		waitWebDriver(2000);
	}

	public void clickOnNoButton(){
		waitTillTheElementIsVisibleAndClickable(NoButton3);
		object_Click(NoButton3);
		waitWebDriver(1000);
	}

	public void clickOnSubmitBtn(){
		waitTillTheElementIsVisibleAndClickable(submitBtn);
		object_Click(submitBtn);
		waitWebDriver(1000);
	}

	public void clickOnViewDetailsOfRecommendedJob(){
		waitWebDriver(1000);
		scrollToElement(recommendedJobExchangeHeader);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(viewDetailsBtn);
		object_Click(viewDetailsBtn);
		waitWebDriver(2000);
	}

	public void clickOnInterestedSkillSection(){
		waitWebDriver(1000);
		scrollToElement(skillsHeader);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(skillCard.get(0));
		object_Click(skillCard.get(0));
		waitWebDriver(2000);
	}

	public void clickOnApplyNowBtn(){
		waitTillTheElementIsVisibleAndClickable(applyNowBtn);
		object_Click(applyNowBtn);
		waitWebDriver(2000);
	}





}
