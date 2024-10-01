package com.qt.sid.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class MyDashboard extends BasePage{

	public WebDriver driver;
	
	
	@FindBy(xpath = "//span[text()='PMKVY 4.0 ']")
	public WebElement PMKVY4Option;

	@FindAll({
			@FindBy(xpath ="(//span[contains(text(),'PMKVY ')])[1]"),
			@FindBy(xpath ="(//li[@class='ng-star-inserted'])[4]")
	})
	public WebElement pmkvy;

	@FindAll({
			@FindBy(xpath = "//a[text()=' Skilling Program ']"),
			@FindBy(xpath = "//a[text()=' Schemes ']")
	})
	public WebElement schemeslink;
	
	@FindBy(xpath = "//button[text()=' Apply ']")
	public WebElement applyBtn;
	
	@FindBy(xpath = "//span[text()='e-SHRAM ']")
	public WebElement eShramOption;
	
	@FindBy(xpath = "//img[contains(@src,'eshrm-icon.png')]")
	public WebElement eshramImage;
	
	@FindBy(xpath = "//button[@class='eshrm-close-btn']")
	public WebElement closeBtn;

	@FindAll({
			@FindBy(xpath = "//button[text()=' PMKVY ']"),
	})
	public WebElement PMKVYBtn;
	
	@FindBy(xpath = "//button[text()=' e-SHRAM ']")
	public WebElement eshramBtn;

	@FindAll({
			@FindBy(xpath = "//button[text()=' My Live training sessions ']"),
			@FindBy(xpath = "//button[text()=' My Virtual Training Sessions ']")
	})
	public WebElement myVirtualTrainingSessionsBtn;

	@FindAll({
			@FindBy(xpath = "//a[text()=' Live training sessions ']"),
			@FindBy(xpath = "//a[contains(text(),'Virtual Sessions')]")
	})
	public WebElement virtualSessionPageText;
	
	@FindBy(xpath = "//input[@placeholder='Search Sessions']")
	public WebElement searchTextFieldInVirtualSessionsPage;
	
	@FindBy(xpath = "//*[text()=' Date Range ']")
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

	@FindBy(xpath = "//p[text()=' Completed ']")
	public List<WebElement> completedSessions;
	
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
	
	@FindBy(xpath = "//h2[text()='Referral Dashboard']")
	public WebElement ReferralDashboardSection;
	
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
	
	@FindBy(xpath  ="//span[text()='Dashboard']")
	public WebElement dashboard;
	
	@FindBy(xpath = "//span[text()='Course List']")
	public WebElement courseList;
	
	@FindBy(xpath = "//span[text()=' All ']")
	public WebElement allTabofCourseList;
	
	@FindBy(xpath = "//span[text()=' Draft ']")
	public WebElement draftTabofCourseList;
	
	@FindBy(xpath = "//span[text()=' Approved ']")
	public WebElement approvedTabOfCourseList;
	
	@FindBy(xpath = "//span[text()=' In Review ']")
	public WebElement inReviewTabOfCourseList;
	
	@FindBy(xpath  = "//span[text()=' Send Back ']")
	public WebElement sendbackTabofCourseList;
	
	@FindBy(xpath = "//span[text()=' Deactivated ']")
	public WebElement deactivatedTabofCourseList;
	
	@FindBy(id = "search")
	public WebElement searchField;
	
	@FindBy(xpath = "//*[text()=' Interest Area ']")
	public WebElement interestAreaFilter;
	
	@FindBy(xpath = "//*[text()=' Minimum Qualifications ']")
	public WebElement minimumQualificationsFilter;
	
	@FindBy(xpath  = "//*[text()=' Language ']")
	public WebElement languageFilter;
	
	@FindBy(xpath = "//span[text()='Sort']")
	public WebElement sortFilter;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	public WebElement resetBtn;

	@FindBy(xpath = "//*[text()='Overview']")
	public WebElement partnerOverview;

	@FindBy(xpath = "//button[text()=' CREATE COURSE ']")
	public WebElement createCourseBtn;

	@FindBy(xpath = "//button[text()=' PDF ']")
	public WebElement pdfReport;


	@FindBy(xpath = "//button[text()=' Excel ']")
	public WebElement excelReport;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	public WebElement calendarDropdown;

	@FindBy(xpath = "//*[@aria-label='Choose month and year']")
	public WebElement chooseMonthAndYear;

	@FindBy(xpath = "//*[text()=' 2023 ']")
	public WebElement selectYear;

	@FindBy(xpath = "//*[text()=' JAN ']")
	public WebElement selectMonth;

	@FindBy(xpath = "//*[text()=' 1 ']")
	public WebElement selectDate;

	@FindBy(xpath = "//*[text()=' Reset ']")
	public WebElement resetButton;


	public MyDashboard(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);

	}

	
	public void clickOnPMKVYSection() {
		waitWebDriver(3000);
		scrollToElement(pmkvy);
		waitWebDriver(2000);
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
		scrollUp();
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(myVirtualTrainingSessionsBtn);
		object_Click(myVirtualTrainingSessionsBtn);
	}
	
	public void clickOneshramCloseBtn() {
		waitTillTheElementIsVisibleAndClickable(closeBtn);
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
	
	public void clickOnCourseList() {
		waitTillTheElementIsVisibleAndClickable(courseList);
		object_Click(courseList);
	}
	
	public void clickOnAllTab() {
		waitTillTheElementIsVisibleAndClickable(allTabofCourseList);
		clickWithJavaScript(allTabofCourseList);
	}
	
	public void clickOnDraftTab() {
		waitTillTheElementIsVisibleAndClickable(draftTabofCourseList);
		clickWithJavaScript(draftTabofCourseList);
	}
	
	public void clickOnApprovedTab() {
		waitTillTheElementIsVisibleAndClickable(approvedTabOfCourseList);
		clickWithJavaScript(approvedTabOfCourseList);
	}
	
	public void clickOnInReviewTab() {
		waitTillTheElementIsVisibleAndClickable(inReviewTabOfCourseList);
		clickWithJavaScript(inReviewTabOfCourseList);
	}
	
	public void clickOnSendbackTab() {
		waitTillTheElementIsVisibleAndClickable(sendbackTabofCourseList);
		clickWithJavaScript(sendbackTabofCourseList);
	}
	
	public void clickOnDeactivatedTab() {
		waitTillTheElementIsVisibleAndClickable(deactivatedTabofCourseList);
		clickWithJavaScript(deactivatedTabofCourseList);
		
	}
	
	public void visibilityOfProfileSection() {
		waitWebDriver(2000);
		scrollUp();
		waitWebDriver(2000);
		scrollUp();
	}

	public void clickOnCompletedSection(){
		waitTillTheElementIsVisibleAndClickable(completedSessionsBtn);
		object_Click(completedSessionsBtn);
		waitWebDriver(2000);
	}

	public void sizeOfCompletedSessions(){
		System.out.println(completedSessions.size());

	}

	public void clickOnExtentReports(){
		waitTillTheElementIsVisibleAndClickable(exportReport);
		object_Click(exportReport);
		waitWebDriver(2000);
	}

	public void clickOnPDFReport(){
		waitTillTheElementIsVisibleAndClickable(pdfReport);
		object_Click(pdfReport);
		waitWebDriver(2000);
	}

	public void clickOnExcelReport(){
		waitTillTheElementIsVisibleAndClickable(excelReport);
		object_Click(excelReport);
		waitWebDriver(2000);
	}

	public void clickOnSourceFilter(){
		waitTillTheElementIsVisibleAndClickable(sourceDropdown);
		object_Click(sourceDropdown);
		waitWebDriver(2000);
	}

	public void clickOnCalendar(){
		waitTillTheElementIsVisibleAndClickable(calendarDropdown);
		object_Click(calendarDropdown);
		waitWebDriver(2000);
	}

	public void clickOnChooseMonthAndYear(){
		waitTillTheElementIsVisibleAndClickable(chooseMonthAndYear);
		object_Click(chooseMonthAndYear);
		waitWebDriver(2000);
	}

	public void selectYear(){
		waitTillTheElementIsVisibleAndClickable(selectYear);
		object_Click(selectYear);
		waitWebDriver(2000);
	}

	public void selectMonth(){
		waitTillTheElementIsVisibleAndClickable(selectMonth);
		object_Click(selectMonth);
		waitWebDriver(2000);
	}

	public void selectDate(){
		waitTillTheElementIsVisibleAndClickable(selectDate);
		object_Click(selectDate);
		waitWebDriver(2000);
	}

	public void clickOnResetButton(){
		waitTillTheElementIsVisibleAndClickable(resetButton);
		object_Click(resetButton);
		waitWebDriver(2000);
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
