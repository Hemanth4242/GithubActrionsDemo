package com.qt.sid.bdd.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class SkillIndiaMapPage extends BasePage{

	public WebDriver driver;

	@FindBy(xpath = "//span[text()='Skill India Map']")
	private WebElement SkillIndiaMap;
	
	@FindBy(id = "filter-panel")
	public WebElement filterOption;
	
	@FindBy(xpath = "//p[normalize-space()='Legend']")
	public WebElement legendOption;
	
	@FindBy(xpath = "//p[normalize-space()='Drag & Zoom']")
	public WebElement dragAndZoomOption;
	
	@FindBy(xpath = "//p[text()=' Measurement ']")
	public WebElement measurementOption;

	@FindAll({
			@FindBy(xpath = "//*[@class='stltviewimg']"),
			@FindBy(xpath = "//p[text()=' Satellite View ']")
	})
	public WebElement satelliteViewOption;
	
	@FindBy(xpath = "//button[@aria-label='Full Screen']")
	public WebElement fullScreenBtn;
	
	@FindBy(xpath = "//img[@alt='Zoom Out']")
	public WebElement zoomOut;
	
	@FindBy(xpath = "//img[@alt='Zoom In']")
	public WebElement zoomIn;

	@FindBy(xpath = "//span[text()='Job Exchange']")
	public WebElement jobExchangeInSIM;

	@FindBy(xpath = "//span[text()=' Jobs']")
	public WebElement assertJobs;

	@FindBy(xpath = "//span[text()=' Apprenticeships']")
	public WebElement assertApprenticeships;

	@FindBy(xpath = "//span[text()=' Skill Centre']")
	public WebElement skillCentreInSIM;

	@FindBy(xpath = "//span[text()=' PMKVY']")
	public WebElement assertPMKVY;

	@FindBy(xpath = "//span[text()=' JSS']")
	public WebElement assertJSS;

	@FindBy(xpath = "//span[text()=' ITI']")
	public WebElement assertITI;

	@FindBy(id = "searchtext")
	public WebElement searchEditField;

	@FindBy(id = "btnsearch")
	public WebElement searchButton;

	@FindBy(id = "searchClearIcon")
	public WebElement clearSearchIcon;

	@FindBy(xpath = "//*[@aria-label='Clear All']")
	public WebElement clearSearchButton;

	@FindBy(xpath = "//*[@data-placeholder='Search Skill India Digital']")
	public WebElement clearedSearchField;

	@FindBy(xpath = "//span[text()='Apply']")
	public WebElement applyBtn;

	@FindBy(xpath = "//h4[text()=' Filter ']")
	public WebElement filterText;

	@FindBy(xpath = "//span[text()=' Clear ']")
	public WebElement clearBtn;

	@FindBy(xpath = "//span[text()='Select State']")
	public WebElement stateDropdown;

	@FindBy(xpath = "//span[text()='Andhra Pradesh']")
	public WebElement selectState;

	@FindBy(xpath = "//span[text()='Karnataka']")
	public WebElement assertKarnatakaState;

	@FindBy(xpath = "//span[text()='Select District']")
	public WebElement districtDropdown;

	@FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
	public WebElement selectDistrict;

	@FindBy(xpath = "//*[@class='currentLocIconID']")
	public WebElement showYourLocation;

	@FindBy(id = "clear_all")
	public WebElement clearSearchBtn;

	@FindBy(xpath = " //h2[text()=' Measurement ']")
	public WebElement measurementText;

	@FindBy(xpath = " //span[text()='Line']")
	public WebElement defaultLineSelected;

	@FindBy(xpath = " //span[text()='Kilometer']")
	public WebElement defaultKilometerSelected;

	@FindBy(xpath = "//h2[text()=' Map Legend ']")
	public WebElement mapLegendText;

	@FindBy(id = "chkboxLabel1")
	public WebElement checkBoxOne;

	@FindBy(id = "chkboxLabel2")
	public WebElement checkBoxTwo;

	@FindBy(xpath = " //label[contains(text(),'Show Segment Lengths')]")
	public WebElement showSegmentLengthsChkBox;

	@FindBy(xpath = " //label[contains(text(),'Clear Previous Measure')]")
	public WebElement clearPreviousMeasureChkBox;

	@FindBy(xpath = "//button[text()=' Start ']")
	public WebElement startBtn;

	@FindBy(xpath = "(//button[text()=' Clear '])[2]")
	public WebElement measurementClearBtn;

	@FindBy(xpath = "//span[text()='Area']")
	public WebElement areaMeasurement;

	@FindBy(xpath = "//span[text()='Metre']")
	public WebElement metreUnit;

	@FindBy(xpath = "//span[text()='State']")
	public WebElement stateMapLegendOption;

	@FindBy(xpath = "//span[text()='District']")
	public WebElement districtMapLegendOption;

	@FindBy(xpath = "//span[text()=' ITI']")
	public WebElement IITMapLegendOption;

	@FindBy(xpath = "//span[text()='JSS']")
	public WebElement JSSMapLegendOption;

	@FindBy(xpath = "//span[text()='PMKVY']")
	public WebElement PMKVYMapLegendOption;

	@FindBy(xpath = "//span[text()='Skill University']")
	public WebElement skillUniversityMapLegendOption;


	@FindBy(xpath = "//span[text()='Fee Based']")
	public WebElement feeBasedMapLegendOption;

	@FindBy(xpath = "//span[text()='Polytechnic']")
	public WebElement polytechnicMapLegendOption;




	

	public SkillIndiaMapPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String checkSkillIndiaMapPage() {
		waitVisibleElement(SkillIndiaMap, 50);
		return getTextOfObject(SkillIndiaMap);
	}
	
	public void clickOnSkillIndiaMap() {
		object_Click(SkillIndiaMap);
	}
	
	public void clickOnSatelliteView() {
		waitTillTheElementIsVisibleAndClickable(satelliteViewOption);
		object_Click(satelliteViewOption);
	}
	
	public void clickOnFullScreen() {
		waitTillTheElementIsVisibleAndClickable(fullScreenBtn);
		object_Click(fullScreenBtn);
		
	}
	
	public void clickOnZoomOutBtn() {
		waitTillTheElementIsVisibleAndClickable(zoomOut);
		object_Click(zoomOut);
	}
	
	public void doubleClickOnZoomInBtn() {
		waitTillTheElementIsVisibleAndClickable(zoomIn);
		clickWithJavaScript(zoomIn);
		clickWithJavaScript(zoomIn);
	}

	public String verifySkillMapPage(){
		return driver.getCurrentUrl();
	}

	public void clickOnJobExchangeInSIM(){
		waitTillTheElementIsVisibleAndClickable(jobExchangeInSIM);
		object_Click(jobExchangeInSIM);
	}

	public void clickOnSkillCentreInSIM(){
		waitTillTheElementIsVisibleAndClickable(skillCentreInSIM);
		clickWithJavaScript(skillCentreInSIM);
	}

	public void clickOnSearchField(){
		waitTillTheElementIsVisibleAndClickable(searchEditField);
		object_Click(searchEditField);
	}

	public void enterNumbersInSearchField(){
		waitTillTheElementIsVisibleAndClickable(searchEditField);
		searchEditField.sendKeys("123456");
	}

	public void searchCityInSIM(){
		waitWebDriver(2000);
		searchEditField.sendKeys("Bengaluru (Bangalore)");
		waitWebDriver(2000);
	}

	public void clickOnSearchIcon(){
		waitTillTheElementIsVisibleAndClickable(searchButton);
		object_Click(searchButton);
		waitWebDriver(5000);
	}

	public void clickOnClearSearchButton(){
		waitTillTheElementIsVisibleAndClickable(clearSearchIcon);
		object_Click(clearSearchIcon);
	}


	public void clickOnFilter(){
		waitTillTheElementIsVisibleAndClickable(filterOption);
		object_Click(filterOption);
	}

	public void clickOnStateDropdown(){
		waitTillTheElementIsVisibleAndClickable(stateDropdown);
		object_Click(stateDropdown);
		waitWebDriver(3000);
	}

	public void selectStateValueFromDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectState);
		object_Click(selectState);
		waitWebDriver(3000);
	}

	public void clickOnDistrictDropdown(){
		waitTillTheElementIsVisibleAndClickable(districtDropdown);
		object_Click(districtDropdown);
		waitWebDriver(3000);
	}

	public void selectDistrictValueFromDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectDistrict);
		object_Click(selectDistrict);
	}

	public void scrollToRequiredDistrictDropdown(){
		scrollDown();
		waitWebDriver(3000);
		scrollDown();
		waitWebDriver(3000);
	}
	public void clickOnLegend(){
		waitTillTheElementIsVisibleAndClickable(legendOption);
		object_Click(legendOption);
	}

	public void clickOnClearButtonToClearSearch(){
		waitTillTheElementIsVisibleAndClickable(clearSearchBtn);
		object_Click(clearSearchBtn);
	}

	public void clickOnShowYourLocation(){
		waitTillTheElementIsVisibleAndClickable(showYourLocation);
		object_Click(showYourLocation);
	}

	public void clickOnMeasurement(){
		waitTillTheElementIsVisibleAndClickable(measurementOption);
		clickWithJavaScript(measurementOption);
		waitWebDriver(4000);
	}

	public void clickOnLineMeasurement(){
		waitTillTheElementIsVisibleAndClickable(defaultLineSelected);
		object_Click(defaultLineSelected);
		waitWebDriver(3000);
	}

	public void selectAreaMeasurement(){
		waitTillTheElementIsVisibleAndClickable(areaMeasurement);
		object_Click(areaMeasurement);
		waitWebDriver(3000);
	}

	public void clickOnKilometerUnit(){
		waitTillTheElementIsVisibleAndClickable(defaultKilometerSelected);
		object_Click(defaultKilometerSelected);
		waitWebDriver(3000);
	}
	public void selectMetreUnit(){
		waitTillTheElementIsVisibleAndClickable(metreUnit);
		object_Click(metreUnit);
		waitWebDriver(3000);
	}

	public void clickOnClearBtn(){
		waitTillTheElementIsVisibleAndClickable(measurementClearBtn);
		clickWithJavaScript(measurementClearBtn);
	}

	public void clickOnClearAllSearchBtn(){
		waitTillTheElementIsVisibleAndClickable(clearSearchBtn);
		clickWithJavaScript(clearSearchBtn);
	}

	public void clickOnClearSearchButtonInSIM(){
		waitTillTheElementIsVisibleAndClickable(clearSearchButton);
		clickWithJavaScript(clearSearchButton);
	}

	public void clickOnGapAnalysis(){

	}

	public void clickOnResetButton(){

	}

	public void clickOnSkillCentreInGapAnalysis(){

	}

	public void selectTheSkillCentre(){

	}

	public void clickAndEnterMinimumValueInPopulation(){

	}

	public void clickAndEnterMaximumValueInPopulation(){

	}

	public void clickAndEnterMinimumAreaCoveredInSqKms(){

	}

	public void clickAndEnterMaximumAreaCoveredInSqKms(){

	}
}
