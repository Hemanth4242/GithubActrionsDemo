package com.qt.sid.bdd.pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class MyDashboardPage extends BasePage {

	public WebDriver driver;


	@FindBy(xpath = "//span[text()='PMKVY 4.0 ']")
	public WebElement PMKVY4Option;

	@FindBy(xpath = "(//li[@class='ng-star-inserted'])[4]")
	public WebElement pmkvy;

	@FindBy(xpath = "//button[text()=' Apply ']")
	public WebElement applyBtn;

	@FindBy(xpath = "//span[text()='e-SHRAM ']")
	public WebElement eShramOption;

	@FindBy(xpath = "//img[contains(@src,'eshrm-icon.png')]")
	public WebElement eshramImage;

	@FindBy(xpath = "//button[@class='eshrm-close-btn']")
	public WebElement closeBtn;

	@FindBy(xpath = "//button[text()=' PMKVY 4.0 ']")
	public WebElement PMKVYBtn;

	@FindBy(xpath = "//button[text()=' e-SHRAM ']")
	public WebElement eshramBtn;

	@FindBy(xpath = "//button[text()=' My Virtual Training Sessions ']")
	public WebElement myVirtualTrainingSessionsBtn;

	@FindBy(xpath = "//a[contains(text(),'Virtual Sessions')]")
	public WebElement virtualSessionPageText;

	@FindBy(xpath = "//input[@placeholder='Search Sessions']")
	public WebElement searchTextFieldInVirtualSessionsPage;

	@FindBy(xpath = "//div[@class='panel-icon']")
	public WebElement dateRangeDropdown;


	@FindBy(xpath = "//button[contains(text(),'All')]")
	public WebElement allSessionsBtn;

	@FindBy(xpath = "//button[contains(text(),'Live')]")
	public WebElement liveSessionsBtn;

	@FindBy(xpath = "//button[contains(text(),'Upcoming')]")
	public WebElement upcomingSessionsBtn;

	@FindBy(xpath = "//button[contains(text(),'Interested')]")
	public WebElement interestedSessionsBtn;

	@FindBy(xpath = "//button[contains(text(),'Completed')]")
	public WebElement completedSessionsBtn;

	@FindBy(xpath = "//button[@class='sorting-btn']")
	public WebElement sortBtn;

	@FindBy(xpath = "//button[@class='active']")
	public WebElement myVirtualCalendar;

	@FindBy(xpath = "//span[text()=' Online ']")
	public WebElement mySkillOnlineCourses;

	@FindBy(xpath = "//span[text()=' Offline ']")
	public WebElement mySkillOfflineCourses;

	@FindBy(xpath = "//span[text()=' Completed ']")
	public WebElement mySkillCompletedCourses;

	@FindBy(xpath = "//span[text()=' Joined ']")
	public WebElement mySkillJoinedCourses;

	@FindBy(xpath = "//span[text()=' Enrolled Job Roles ']")
	public WebElement mySkillEnrolledJobRoles;

	@FindBy(xpath = "//span[text()=' Applications ']")
	public WebElement mySkillApplications;

	@FindBy(xpath = "//button[text()=' Go To Course ']")
	public WebElement goToCourseBtn;

	@FindBy(xpath = "//*[text()=' Course Details']")
	public WebElement courseDetailsText;
	//25--
	@FindBy(xpath = "//button[text()=' My Courses ']")
	public WebElement myCoursesBtn;

	@FindBy(xpath = "//button[text()=' My Credits ']")
	public WebElement myCreditsBtn;

	@FindBy(xpath = "//h4[text()=' My Credits ']")
	public WebElement myCreditsPageText;

	@FindBy(xpath = "//button[text()=' My Activity Analysis ']")
	public WebElement myActivityAnalysis;

	@FindBy(xpath = "//a[text()=' My Activity Analysis ']")
	public WebElement myActivityAnalysisPageText;

	@FindBy(xpath = "//img[@alt='user img']")
	public WebElement profileImage;

	@FindBy(xpath = "//button[text()=' Edit ']")
	public WebElement editBtn;

	@FindBy(xpath = "//h2[text()='UTM Dashboard']")
	public WebElement UTMDashboardSection;

	@FindBy(xpath = "//button[text()=' Export Report ']")
	public WebElement exportReport;

	@FindBy(xpath = "//span[text()='Source']")
	public WebElement sourceDropdown;

	@FindBy(xpath = "//span[text()='Date Range']")
	public WebElement dateRangeDropdownInAnalysis;

	@FindBy(xpath = "//h2[text()='Overview']")
	public WebElement overviewSection;

	@FindBy(xpath = "//h2[text()='Referral Source Analysis']")
	public WebElement referralSourceAnalysisSection;

	@FindBy(xpath = "//h2[text()='Medium Analysis']")
	public WebElement mediumAnalysisSection;

	@FindAll({
			@FindBy(xpath = "//*[text()=' Mobilizer ']"),
			@FindBy(xpath = "//h4[text()='Mobilizer']"),
			@FindBy(xpath = "//li[@class='breadcrumb-item active']/a")
	})
	private WebElement loginVerify;

	@FindBy(xpath = "//a[text()=' Schemes ']")
	public WebElement schemeslink;

	String mySkillCourceXpath = "//span[normalize-space()='%s']/parent::button";

	@FindBy(xpath = "//h4[normalize-space()='My Skill Courses']/ancestor::div[@class='row']//div[@class='tab-btn-list']/button")
	private WebElement getMySkillButtonText;

	@FindAll({
			@FindBy(xpath = "//*[@class='widget-menu survey-poll-menu ng-star-inserted']"),
			@FindBy(xpath = "//li[@id='survey-pool']/a")
	})
	private WebElement survayPolBtn;

	@FindBy(xpath = "//button[@class='cancel']")
	public WebElement cancelBtn;

	@FindBy(xpath = "//span[normalize-space(text())='Job Exchange']")
	public WebElement jobExchangeOptionButton;

	@FindAll({
			@FindBy(xpath = "//a[@class='widget-menu learning-resource-menu']"),
			@FindBy(xpath = "//li[@id='learning']")
	})
	public WebElement learningResourceOption;

	@FindBy(xpath = "//span[normalize-space(text())='Learning Resources']")
	public WebElement learningResourceButton;

	@FindAll({
			@FindBy(xpath = "//a[@class='widget-menu important-links']"),
			@FindBy(xpath = "//li[@id='important']")
	})
	public WebElement importantLinksOption;

	@FindBy(xpath = "//button[normalize-space(text())='Skill Universities']")
	public WebElement skillUniversitiesButton;

	@FindBy(xpath = "//span[normalize-space(text())='Schemes']")
	public WebElement schemesButton;

	@FindAll({
			@FindBy(xpath = "//button[normalize-space(text())='All Skilling Program']"),
			@FindBy(xpath = "//button[normalize-space(text())='All Schemes']")
	})
	public WebElement allSchemesOption;


	@FindBy(xpath = "//div[@class='sub-moremenu ng-star-inserted']/child::button")
	public List<WebElement> subSchemes;

	@FindBy(xpath = "//span[normalize-space(text())='PMKVY']")
	public WebElement pmkvySubScheme;
	@FindBy(xpath = "//div[@class='sub-menu ng-star-inserted']/child::button")
	public List<WebElement> pmkvySubSchemeOptions;

	@FindBy(xpath = "//button[normalize-space(text())='Dashboard']")
	public WebElement dashboardSubScheme;

	@FindBy(xpath = "//div[@class='dashboard-tab-menu-list']//child::li")
	public List<WebElement> dashBoardSubSchemeOptions;

	@FindBy(xpath = "//div[@class='tab-btn-list']/child::button")
	public List<WebElement> myskillCoursesOption;

	@FindBy(xpath = "(//ul[@class='slick-dots'])[1]/li[1]")
	public WebElement sliderButton;

	@FindBy(xpath = "((//div[@class='slick-list draggable'])[1]//child::div[@class='skill-course-card-img'])[8]/p[normalize-space(text())='Online']")
	public WebElement onlineCourseOption;

	@FindBy(xpath = "//span[normalize-space(text())='Offline']")
	public WebElement offLineOption;
	@FindBy(xpath = "//button[normalize-space(text())='Join now']")
	public WebElement joinNowButton;

	@FindBy(xpath = "//span[normalize-space(text())='Completed']")
	public WebElement completedOption;
	@FindBy(xpath = "//button[@class='skill-btn ng-star-inserted']")
	public WebElement exploreButton;

	@FindBy(xpath = "//span[normalize-space(text())='Applications']")
	public WebElement applicationOption;
	@FindBy(xpath = "//button[normalize-space(text())='View Applications']")
	public WebElement viewApplication;

	@FindAll({
			@FindBy(xpath = "//p[contains(@class,'information')]"),
			@FindBy(xpath = "//p[@class='information']")
	})
	public WebElement applicationInformation;

	@FindBy(xpath = "//p[normalize-space(text())='Recommendations For You']")
	public WebElement recommendedForYou;
	@FindBy(xpath = "//div[@class='mat-tab-labels']/child::div")
	public List<WebElement> recommendedForYouOptions;

	@FindBy(xpath = "//button[text()=' Approved ']")
	public WebElement approvedSection;


	private WebElement convertWebELement(String currentXpath, String replacingXpath) {
		String xpath = String.format(currentXpath, replacingXpath);
		return driver.findElement(By.xpath(xpath));
	}


	public void clickGetMySkillButtonText() {
		object_Click(getMySkillButtonText);
	}

	public void clickOnDesireSkill(String replaceValue) {
		convertWebELement(mySkillCourceXpath, replaceValue).click();
	}

	public String getTextLoginAsLernerVerify() {
		return getTextOfObject(loginVerify);

	}

	public String getTextLoginAsParnerVerify() {
		return getTextOfObject(loginVerify);
	}


	public MyDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public void clickOnPMKVYSection() {
		waitTillTheElementIsVisibleAndClickable(pmkvy);
		clickWithJavaScript(pmkvy);
	}

	public void clickOnEshramSection() {
		waitTillTheElementIsVisibleAndClickable(eShramOption);
		clickWithJavaScript(eShramOption);
	}

	public void clickOnUserProfilePMKVY() {
		waitTillTheElementIsVisibleAndClickable(PMKVYBtn);
		object_Click(PMKVYBtn);
	}

	public void clickOnUserProfileeShram() {
		waitTillTheElementIsVisibleAndClickable(eshramBtn);
		object_Click(eshramBtn);
		waitWebDriver(2000);
	}

	public void clickOnUserProfileMyVirtualTrainingSessions() {
		waitTillTheElementIsVisibleAndClickable(myVirtualTrainingSessionsBtn);
		object_Click(myVirtualTrainingSessionsBtn);
	}

	public void clickOneshramCloseBtn() {
		object_Click(closeBtn);
	}

	public void visibilityOfSchemes() {
		waitTillTheElementIsVisibleAndClickable(schemeslink);
	}


	public void visibilityOfMyVirtualSessions() {
		waitTillTheElementIsVisibleAndClickable(virtualSessionPageText);
	}

	public void clickOnOnlineCourses() {
		waitTillTheElementIsVisibleAndClickable(mySkillOnlineCourses);
		object_Click(mySkillOnlineCourses);
	}

	public void clickOnOfflineCourses() {
		waitTillTheElementIsVisibleAndClickable(mySkillOfflineCourses);
		object_Click(mySkillOfflineCourses);
	}

	public void clickOnCompletedCourses() {
		waitTillTheElementIsVisibleAndClickable(mySkillCompletedCourses);
		object_Click(mySkillCompletedCourses);
	}

	public void clickOnJoinedCourses() {
		waitTillTheElementIsVisibleAndClickable(mySkillJoinedCourses);
		object_Click(mySkillJoinedCourses);
	}

	public void clickOnEnrolledCourses() {
		waitTillTheElementIsVisibleAndClickable(mySkillEnrolledJobRoles);
		object_Click(mySkillEnrolledJobRoles);
	}

	public void clickOnApplications() {
		waitTillTheElementIsVisibleAndClickable(mySkillApplications);
		object_Click(mySkillApplications);
	}

	public void clickOnGoToCourse() {
		//scrollToElement(goToCourseBtn);
		waitTillTheElementIsVisibleAndClickable(goToCourseBtn);
		clickWithJavaScript(goToCourseBtn);
	}

	public void visibilityOfCourseDetails() {
		scrollToElement(courseDetailsText);

	}

	public void clickOnMyCoursesInUserProfile() {
		waitTillTheElementIsVisibleAndClickable(myCoursesBtn);
		object_Click(myCoursesBtn);

	}

	public void clickOnMyCreditsInUserProfile() {
		waitTillTheElementIsVisibleAndClickable(myCreditsBtn);
		object_Click(myCreditsBtn);
	}

	public void visibilityOfMyCreditsSection() {
		waitTillTheElementIsVisibleAndClickable(myCreditsPageText);
	}

	public void clickOnMyActivityAnalysisInUserProfile() {
		waitTillTheElementIsVisibleAndClickable(myActivityAnalysis);
		object_Click(myActivityAnalysis);
	}

	public void visibilityOfMyActivityAnalysis() {
		waitTillTheElementIsVisibleAndClickable(myActivityAnalysisPageText);
	}


	public void clickOnSurvayPolBtn() {
		waitTillTheElementIsVisibleAndClickable(survayPolBtn);
		clickWithJavaScript(survayPolBtn);
	}


	public void clickOnCloseBtn() {
		waitTillTheElementIsVisibleAndClickable(cancelBtn);
		object_Click(cancelBtn);
	}


	public void clickOnJobExchangeOption() {
		waitTillTheElementIsVisibleAndClickable(jobExchangeOptionButton);
		object_Click(jobExchangeOptionButton);
		waitWebDriver(2000);
	}

	public void verifyClickOnLearningResourceOption() {
		waitTillTheElementIsVisibleAndClickable(learningResourceOption);
		Actions ac = new Actions(driver);
		ac.moveToElement(learningResourceOption).build().perform();
		waitTillTheElementIsVisibleAndClickable(learningResourceButton);
		clickWithJavaScript(learningResourceButton);

	}

	public void verifyClickOnSkillUniversitiesOption() {
		waitTillTheElementIsVisibleAndClickable(importantLinksOption);
		Actions ac = new Actions(driver);
		ac.moveToElement(importantLinksOption).build().perform();
		waitWebDriver(5000);
		waitTillTheElementIsVisibleAndClickable(skillUniversitiesButton);
		object_Click(skillUniversitiesButton);
		waitWebDriver(2000);

	}

	public void verifyClickOnSchemes() {
		waitTillTheElementIsVisibleAndClickable(schemesButton);
		object_Click(schemesButton);
	}

	public void verifySchemesColor(){
		verifyClickOnSchemes();

		waitWebDriver(1000);
		String color =schemesButton.getCssValue("color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#df6e12";
		org.testng.Assert.assertEquals(bc,expectedColor);

	}

	public void verifyClickOnAllSchemesOption() {
		waitTillTheElementIsVisibleAndClickable(allSchemesOption);
		object_Click(allSchemesOption);
		waitWebDriver(2000);
	}


	public void verifySubSchemes() {
		waitWebDriver(2000);
		String[] subSchemeList = {"PMKVY", "All Skilling Program", "Entrepreneurship Skilling Program"};
		for (int i = 0; i < subSchemes.size(); i++) {
			waitWebDriver(500);
			String actualText = subSchemes.get(i).getText().trim();
			String expectedText = subSchemeList[i];
			waitWebDriver(500);
			Assert.assertEquals(expectedText, actualText);
		}
	}


	public void verifyPmkvySubMenus() {
		object_Click(pmkvySubScheme);
		waitWebDriver(2000);
		String[] value = {"Dashboard", "Courses", "Centres", "Books", "Analytics Dashboard"};
		for (int i = 0; i < pmkvySubSchemeOptions.size(); i++) {
			waitWebDriver(500);
			String actualText = pmkvySubSchemeOptions.get(i).getText().trim();
			String expectedText = value[i];
			Assert.assertEquals(actualText, expectedText);
		}
	}


	public void verifyMyDashBoardSubMenus() {
		object_Click(pmkvySubScheme);
		waitWebDriver(1000);
		object_Click(dashboardSubScheme);
		String[] value = {"My Skill Courses", "My Opportunities", "Recommendations For You", "My Credits", "Upcoming Skill Courses", "Summary"};
		waitWebDriver(2000);
		for (int i = 0; i < dashBoardSubSchemeOptions.size(); i++) {
			waitWebDriver(500);
			String actualValue = dashBoardSubSchemeOptions.get(i).getText().trim();
			String expectedValue = value[i];
			waitWebDriver(500);
			Assert.assertEquals(actualValue, expectedValue);
		}
	}


	public void verifyMyskillCoursesOptions() {
		object_Click(pmkvySubScheme);
		waitWebDriver(1000);
		object_Click(dashboardSubScheme);
		waitWebDriver(2000);
		String[] value = {"Online", "Offline", "Completed", "Joined", "Applications","Job Exchange","Apprenticeships"};
		for (int i = 0; i < myskillCoursesOption.size(); i++) {
			String actualValue = myskillCoursesOption.get(i).getText().trim();
			String expectedValue = value[i];
			Assert.assertEquals(actualValue, expectedValue);
		}

	}

	public String verifyCourseType() {
		waitWebDriver(2000);
		waitForElementToAppear(onlineCourseOption);
		String value = getTextOfObject(onlineCourseOption).trim();
		System.out.println(value);
		return value;
	}


	public void verifyOfflineJoinOption() {
		object_Click(pmkvySubScheme);
		waitWebDriver(1000);
		object_Click(dashboardSubScheme);
		waitWebDriver(2000);
		object_Click(offLineOption);
		waitWebDriver(2000);
		//object_Click(joinNowButton);
	}

	public void verifyCompletedOption() {
		object_Click(pmkvySubScheme);
		waitWebDriver(1000);
		object_Click(dashboardSubScheme);
		waitWebDriver(2000);
		object_Click(completedOption);
		waitWebDriver(2000);
		waitForElementToAppear(exploreButton);
		Assert.assertTrue(exploreButton.isDisplayed());
		waitWebDriver(2000);
		object_Click(exploreButton);
	}

	public void verifyApplicationOption() {
		object_Click(pmkvySubScheme);
		waitWebDriver(1000);
		object_Click(dashboardSubScheme);
		waitWebDriver(2000);
		object_Click(applicationOption);
		waitWebDriver(2000);
		waitForElementToAppear(viewApplication);
		object_Click(viewApplication);
		waitWebDriver(2000);
		waitForElementToAppear(approvedSection);
		object_Click(approvedSection);
		waitWebDriver(2000);
		waitForElementToAppear(applicationInformation);
		Assert.assertTrue(applicationInformation.isDisplayed());
	}

	public void verifyRecommendationsForYou() {
		String[] str = {"Skill Courses", "Skill Centre", "Job Exchange", "eBooks"};
		object_Click(pmkvySubScheme);
		waitWebDriver(1000);
		object_Click(dashboardSubScheme);
		waitWebDriver(2000);
		waitForElementToAppear(recommendedForYou);
		clickWithJavaScript(recommendedForYou);
		waitWebDriver(5000);
		waitForElements(recommendedForYouOptions);
		for (int i = 0; i < recommendedForYouOptions.size(); i++) {
			waitWebDriver(500);
			String value = recommendedForYouOptions.get(i).getText().trim();
			waitWebDriver(500);
			String valueExpected = str[i];
			Assert.assertTrue(value.contains(valueExpected));
		}


//
//	public void OpenMyDashboard() throws Exception {
//
//		Thread.sleep(2000);
//		driver.findElement(User_Profile).click();
//		driver.findElement(My_Dashboard).click();
//		
//
//	}
//
//	public void ClickonDigiLocker() throws InterruptedException {
//
//		WebElement d = driver.findElement(MyDashboard_Digilocker);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,80)");
//		js.executeScript("arguments[0].click()", d);
//		Thread.sleep(3000);
//
//	}
//
//	public void verifyDigiLockerRedirection() throws InterruptedException {
//		boolean Digilocker = driver.findElement(MyDashboard_Dogolocker_Verify_redirect).isDisplayed();
//		if (Digilocker) {
//			System.out.println("Digilocker page redirection is successful");
//		} else {
//			System.out.println("Digilocker page redirection is not successful");
//
//		}
//
//		Thread.sleep(2000);
//		driver.navigate().back();
//	}
//
//	public void ClickonPMKVY() throws InterruptedException {
//
//		WebElement p = driver.findElement(MyDashboard_PMKVY);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,80)");
//
//		js.executeScript("arguments[0].click()", p);
//		Thread.sleep(3000);
//	}
//
//	public void verifyPMKVYRedirection() throws InterruptedException {
//		boolean PMKVY = driver.findElement(PMKVY_Verify_redirect).isDisplayed();
//		if (PMKVY) {
//			System.out.println("Pmkv page redirection is successful");
//		} else {
//			System.out.println("Pmkv page redirection is not successful");
//
//		}
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//	}
//
//	public void ClickoneAshram() throws InterruptedException {
//
//		WebElement a = driver.findElement(MyDashboard_eashram);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,80)");
//
//		js.executeScript("arguments[0].click()", a);
//		Thread.sleep(3000);
//
//		driver.findElement(eshramclose).click();
//
//	}
//
//	public void verifyeAshramRedirection() throws InterruptedException {
//
//		boolean eAshram = driver.findElement(eAshram_Verify_redirct).isDisplayed();
//
//		if (eAshram) {
//
//			System.out.println("eAshram page is successfully redirect");
//
//		} else {
//
//			System.out.println("eAshram page is not successfully redirect");
//		}
//
//		//driver.navigate().back();
//		Thread.sleep(2000);
//
//	}
//
//	public void ClickonMyskillcourses() throws InterruptedException {
//
//		WebElement msc = driver.findElement(MyDashboard_Myskillcourses);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,100)");
//		js.executeScript("arguments[0].click()", msc);
//		System.out.println("Successfully clicked on Myskill courses.");
//
//	}
//
//	public void clickonskillcourse_Offline() throws InterruptedException {
//
//		WebElement offline = driver.findElement(MySkillcourses_offline);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", offline);
//		driver.findElement(MyDashboard_join).click();
//		System.out.println("scuccessfully clickd on Skill course Offline");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//
//	}
//
//	public void clickonskillcourse_Completed() throws InterruptedException {
//
//		WebElement completed = driver.findElement(Myskillcourses_Completed);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].click()", completed);
//		System.out.println("scuccessfully clickd on Skill course Completed");
//		Thread.sleep(2000);
//	}
//
//	public void clickoncourse_Joined() throws InterruptedException {
//
//		WebElement joined = driver.findElement(Myskillcourses_Joined);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].click()", joined);
//		System.out.println("scuccessfully clickd on Skill course Joined");
//		Thread.sleep(2000);
//	}
//	
//	public void allRecommendationForYou() throws InterruptedException {
//		
//		List<WebElement> Recommendationforyou = driver.findElements(MyDashboard_Recommenddation);
//		for (int i = 0; i < Recommendationforyou.size(); i++) {
//
//			   if(i<4) {
//				   
//				   Thread.sleep(2000);
//					WebElement recom = Recommendationforyou.get(i);
//					JavascriptExecutor js = (JavascriptExecutor) driver;
//					js.executeScript("window.scrollTo(0,650)");
//					js.executeScript("arguments[0].click()", recom);
//					System.out.println("Sucessfully clicked on Recommendations type");
//					
//				   
//			   }
//				
//			}
//
//		}
//		
//
//
////	public void ClickonRecommendation() throws InterruptedException {
////
////		WebElement r = driver.findElement(MyDashBoard_RecommendationForyou);
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		Thread.sleep(3000);
////		js.executeScript("window.scrollTo(0,350)");
////
//////		js.executeScript("window.scrollBy(0,150)");
////		js.executeScript("arguments[0].click()", r);
////		Thread.sleep(2000);
////		System.out.println("Successfully clicked on Recommendation For You.");
////
////	}
////
////	public void ClickonRecommendation_skillcenter() throws InterruptedException {
////
////		WebElement rec_skilcenter = driver.findElement(MyDasBoard_Recommendation_skillcenter);
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("window.scrollTo(0,300)");
////		Thread.sleep(2000);
////		js.executeScript("arguments[0].click", rec_skilcenter);
////		Thread.sleep(2000);
////
//////		Actions act = new Actions(driver);
//////		act.moveToElement(rec_skilcenter).click().build().perform();		
////		System.out.println("clicked on Skill center under recommendation");
////
////	}
////
////	public void ClickonRecommendation_Jobexchange() throws InterruptedException {
////
////		WebElement rec_jobexchange = driver.findElement(MyDasBoard_Recommendation_JobExchange);
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////
////		js.executeScript("window.scrollTo(0,300)");
////		Thread.sleep(2000);
////		js.executeScript("arguments[0].click", rec_jobexchange);
////		Thread.sleep(2000);
////
//////		Actions act = new Actions(driver);
//////		act.moveToElement(rec_jobexchange).click().build().perform();
////
////		System.out.println("clicked on JobExchange under recommendation");
////
////	}
////
////	public void ClickonRecommendation_eBook() throws InterruptedException {
////
////		WebElement rec_eBook = driver.findElement(MyDasBoard_Recommendation_eBook);
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////
////		js.executeScript("window.scrollTo(0,300)");
////		Thread.sleep(2000);
////		js.executeScript("arguments[0].click", rec_eBook);
////		Thread.sleep(2000);
//////		Actions act = new Actions(driver);
//////		act.moveToElement(rec_eBook).click().build().perform();
////
////		System.out.println("clicked on eBook under recommendation");
////
////	}
//
//	public void ClickonMycredits() throws InterruptedException {
//
//		WebElement mc = driver.findElement(MyDashbaord_MyCredits);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,200)");
//		js.executeScript("arguments[0].click()", mc);
//		System.out.println("Successfully clicked on My Credits");
//		Thread.sleep(2000);
//
//	}
//
//	public void ClickonUpcomingskills() throws InterruptedException {
//
//		WebElement us = driver.findElement(MyDashboard_UpcomingSkillcourse);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,300)");
//		js.executeScript("arguments[0].click()", us);
//		System.out.println("Successfully clicked on Upcoming Skills");
//		Thread.sleep(2000);
//
//	}
//
//	public void ClickonSummary() throws InterruptedException {
//
//		WebElement sum = driver.findElement(MyDasboard_Summary);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scroll(0,300)");
//
//		js.executeScript("arguments[0].click()", sum);
//		System.out.println("Successfully clicked on Summary");
//		Thread.sleep(2000);
//
//	}
//
//	public void clickonSum_skillcourse() throws InterruptedException {
//
//		WebElement sum_skillcourse = driver.findElement(MyDasboard_summar_skillcourse);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,100)");
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].click()", sum_skillcourse);
//		System.out.println("Successfully clicked on Skill course under summary");
//		Thread.sleep(2000);
//		driver.navigate().back();
//
//	}
//
//	public void clickonSum_JobExchange() throws InterruptedException {
//
//		WebElement sum_JobExchange = driver.findElement(MyDashboard_summary_JobExchange);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].click()", sum_JobExchange);
//		System.out.println("Successfully clicked on Job Exchange under summary");
//		Thread.sleep(2000);
//		driver.navigate().back();
//
//	}
//
//	public void clickonSum_Apprenticeships() throws InterruptedException {
//
//		WebElement sum_apprenticeships = driver.findElement(MyDashboard_summary_Apprenticeships);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].click()", sum_apprenticeships);
//		System.out.println("Successfully clicked on Apprenticeships under summary");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//
//	}
//
//	public void clickonEdit() throws InterruptedException {
//
//		WebElement profileEdit = driver.findElement(Profile_Edit);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", profileEdit);
//		Thread.sleep(2000);
//		System.out.println("Successfully clicked on profile Edit.");
//
//		driver.navigate().back();
//
//	}
//
//	public void clickonUpdateProfile() throws InterruptedException {
//
//		WebElement UpdateProfile = driver.findElement(Update_Profile);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].click()", UpdateProfile);
//		Thread.sleep(2000);
//
//		System.out.println("Successfully clicked on Update profile.");
//
//		driver.navigate().back();
//
//	}


	}
}
