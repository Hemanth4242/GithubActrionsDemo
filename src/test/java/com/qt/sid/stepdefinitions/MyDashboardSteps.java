package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;

import com.qt.sid.bdd.utils.FileReaderManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.qt.sid.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.Color;
import org.testng.Assert;


import java.time.Duration;
import java.util.List;

public class MyDashboardSteps extends BasePage{

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;
    LoginPage loginPage;
    MyDashboard myDashboard;

    MyDashboardPage myDashboardPage;

    CoursesPage coursesPage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public MyDashboardSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        myDashboard= testContext.getPageObjectManager().getmyDashboard();
        myDashboardPage= testContext.getPageObjectManager().getmyDashboardPage();
        coursesPage = testContext.getPageObjectManager().getCoursesPage();



    }

	

    @Then("I verify PMKVY in my dashboard")
    public void i_verify_pmkvy_in_my_dashboard(){

        myDashboard.clickOnPMKVYSection();
       
       Assert.assertTrue(isElementPresent(myDashboard.schemeslink),"Schemes text is not displayed ");
       log.info("Schemes text is displayed");
      

    }
    
    
    @Then("I verify eshram in my dashboard")
    public void i_verify_eshram_in_my_dashboard(){
    	
       loginPage.clickOnProfile();
      
       loginPage.clickOnMyDashboard();
       
       landingPage.scrollToElement(myDashboard.eShramOption);

        myDashboard.clickOnEshramSection();
       
       Assert.assertTrue(isElementPresent(myDashboard.eshramImage),"eShram image is not displayed ");
       log.info("eShram image is displayed");
       
       Assert.assertTrue(isElementPresent(myDashboard.closeBtn),"Close button is not displayed");
       log.info("Close button is displayed in eshram");
      

    }
    
    
    @Then("I verify PMKVY in User profile section")
    public void i_verify_pmkvy_in_user_profile_section(){
       loginPage.clickOnProfile();
       
      // landingPage.scrollToElement(loginPage.settingsSection);
       loginPage.visibilityOfSettingsSection();

        myDashboard.clickOnUserProfilePMKVY();
        myDashboard.visibilityOfSchemes();
       
       Assert.assertTrue(isElementPresent(myDashboard.schemeslink),"Schemes text is not displayed ");
       log.info("Schemes text is displayed");
       

    }
   
    @Then("I verify eshram in user profile section")
    public void i_verify_eshram_in_user_profile_section(){
    	
       loginPage.clickOnProfile();
       
       loginPage.visibilityOfSettingsSection();

        myDashboard.clickOnUserProfileeShram();
       
       Assert.assertTrue(isElementPresent(myDashboard.eshramImage),"eShram image is not displayed ");
       log.info("eShram image is displayed");
       
       Assert.assertTrue(isElementPresent(myDashboard.closeBtn),"Close button is not displayed");
       log.info("Close button is displayed in eshram");

        myDashboard.clickOneshramCloseBtn();

    }
    
    @Then("I verify my virtual training sessions in user profile section")
    public void i_verify_my_virtual_training_sessions_in_user_profile_section(){
       myDashboard.visibilityOfProfileSection();
       
       loginPage.clickOnProfile();
    
       loginPage.visibilityOfSettingsSection();

        myDashboard.clickOnUserProfileMyVirtualTrainingSessions();
        myDashboard.visibilityOfMyVirtualSessions();
       
       Assert.assertTrue(isElementPresent(myDashboard.virtualSessionPageText),"Virtual Sessions text is not displayed");
       log.info("Virtual Sessions text is displayed post clicking My virtual training sessions in user profile");
       
       Assert.assertTrue(isElementPresent(myDashboard.dateRangeDropdown),"Date Range dropdown is not displayed");
       log.info("Date Range dropdown is displayed");
       
       Assert.assertTrue(isElementPresent(myDashboard.searchTextFieldInVirtualSessionsPage),"Search Text field is not displayed");
       log.info("Search text field is displayed");
       
       Assert.assertTrue(isElementPresent(myDashboard.myVirtualCalendar),"My virtual calendar is not displayed");
       log.info("My virtual calendar is displayed");
       
       Assert.assertTrue(isElementPresent(myDashboard.sortBtn),"Sort option is not displayed");
       log.info("Sort option is displayed");
      
//       Assert.assertTrue(isElementPresent(myDashboardPage.allSessionsBtn),"All sessions button is not displayed");
//       log.info("All sessions button is displayed");
//       
//       Assert.assertTrue(isElementPresent(myDashboardPage.liveSessionsBtn),"Live sessions button is not displayed");
//       log.info("Live sessions button is displayed");
//       
//       Assert.assertTrue(isElementPresent(myDashboardPage.upcomingSessionsBtn),"Upcoming sessions button is not displayed");
//       log.info("Upcoming sessions button is displayed");
      
//       Assert.assertTrue(isElementPresent(myDashboardPage.interestedSessionsBtn),"Interested sessions button is not displayed");
//       log.info("Interested sessions button is displayed");
//       
//       Assert.assertTrue(isElementPresent(myDashboardPage.completedSessionsBtn),"Completed sessions button is not displayed");
//       log.info("Completed sessions button is displayed");
       
     
    
   }
    
    @Then("I verify learner able to access my skill courses all sections")
    public void i_verify_learner_able_to_access_my_skill_courses_all_sections(){

        myDashboard.clickOnOnlineCourses();
        log.info("Learner is able to access Online courses");

        myDashboard.clickOnOfflineCourses();
        log.info("Learner is able to access Offline courses");

        myDashboard.clickOnJoinedCourses();
        log.info("Learner is able to access Joined courses");

        myDashboard.clickOnCompletedCourses();
        log.info("Learner is able to access Completed courses");

        myDashboard.clickOnApplications();
        log.info("Learner is able to access applications section");

    }
    
    @Then("I verify navigated to course details page")
    public void i_verify_navigated_to_course_details_page() {
        myDashboard.clickOnOnlineCourses();

        myDashboard.clickOnGoToCourse();

        myDashboard.visibilityOfCourseDetails();
    	
    	Assert.assertTrue(isElementPresent(myDashboard.courseDetailsText),"Learner is not navigated course details page post clicking go to course btn");
    	log.info("Learner is navigated to course details page");
    	
    }
    
    @Then("I verify user is navigated to my dashboard page")
    public void i_verify_user_is_navigated_to_my_dashboard_page(){
      
        loginPage.clickOnProfile();
        
        loginPage.clickOnMyDashboard();
        
        loginPage.visibilityOfMyDashboard();
        
        Assert.assertTrue(isElementPresent(loginPage.myDashboardLink),"My dashboard page is not displayed ");
        log.info("User is navigated to My Dashboard Page");
      

    }
    
    @Then("I verify user is navigated to my courses section")
    public void i_verify_user_is_navigated_to_my_courses_section() {
    	loginPage.clickOnProfile();

        myDashboard.clickOnMyCoursesInUserProfile();
    	
    	Assert.assertTrue(isElementPresent(myDashboard.goToCourseBtn),"My courses section is not displayed");
    	log.info("User is navigated to My courses section");
    }
    
    @Then("I verify user is navigated to my credits section")
    public void i_verify_user_is_navigated_to_my_credits_section() {
    	loginPage.clickOnProfile();

        myDashboard.clickOnMyCreditsInUserProfile();

        myDashboard.visibilityOfMyCreditsSection();
    	
    	Assert.assertTrue(isElementPresent(myDashboard.myCreditsPageText),"My credits section is not displayed");
    	log.info("User is navigated to My credits section");
    }



    @When("Login to the application as a Learner {string},{string}")
    public void loginToTheApplicationAsALearner(String mobleNumber, String password) {

        loginPage.logoinAppAsLerner(driver,mobleNumber,password);
    }
    
    
    @Then("verify partner navigated to My Dashboard Page")
    public void verify_partner_navigated_to_my_dashboard_page() {
        loginPage.clickOnPartnerProfile();	
        
        loginPage.clickOnMyDashboard();
        
        Assert.assertTrue(isElementPresent(myDashboard.dashboard),"dashboard is not displayed");
        log.info("dashboard is not displayed");
        
        Assert.assertTrue(isElementPresent(loginPage.assertOverview),"Overview section is not displayed");
        log.info("Overview section is displayed");
        
    }
    
    
    @Then("verify partner able to access all tabs of course list")
    public void verify_partner_able_to_access_all_tabs_of_course_list() {
    	myDashboard.clickOnCourseList();
    	
    	myDashboard.clickOnAllTab();
    	
    	myDashboard.clickOnDraftTab();
    	
    	myDashboard.clickOnApprovedTab();
    	
    	myDashboard.clickOnInReviewTab();
    	
    	myDashboard.clickOnSendbackTab();
    	
    	myDashboard.clickOnDeactivatedTab();
    	log.info("Partner is able to access all tabs of course list");
    }
    
    
    @Then("verify partner able to apply filters in course list")
    public void verify_partner_able_to_apply_filters_in_course_list() {
    	myDashboard.clickOnCourseList();
    
    	Assert.assertTrue(isElementPresent(myDashboard.searchField),"Search field is not displayed");
    	log.info("Search field is displayed in course list");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.interestAreaFilter),"Interest area filter is not displayed");
    	log.info("Interest area filter is displayed in course list");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.minimumQualificationsFilter),"Minimum Qualifications filter is not displayed");
    	log.info("Minimum Qualifications filter is displayed in course list");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.sortFilter),"Sort filter is not displayed");
    	log.info("Sort filter is displayed in course list");
    	
    	scrollDown();
    	
    	Assert.assertTrue(isElementPresent(myDashboard.languageFilter),"Language filter is not displayed");
    	log.info("Language filter is displayed in course list");
    	
    	scrollDown();
    	//Assert.assertTrue(isElementPresent(myDashboard.resetBtn));
    }
    
    @Then("I click on learning resource option")
    public void iClickOnLearningResourceOption() {
        waitWebDriver(2000);
        homePage.clickOnSkillIndiaLogo();
        myDashboardPage.verifyClickOnLearningResourceOption();
    }
    
    @Then("I click on important link option and selected skilled universities")
    public void iClickOnImportantLinkOption() {
        waitWebDriver(3000);
        homePage.clickOnSkillIndiaLogo();
        myDashboardPage.verifyClickOnSkillUniversitiesOption();
    }

    @Then("I click on schemes button and selected all schemes option")
    public void iClickOnSchemesButtonAndSelectedAllSchemesOption() {
        myDashboardPage.verifyClickOnSchemes();
        myDashboardPage.verifyClickOnAllSchemesOption();
    }





    @Then("I click on scheme button")
    public void iClickOnSchemeButton() {
        myDashboardPage.verifyClickOnSchemes();

    }

    @Then("I verified scheme all available options")
    public void iVerifiedSchemeAllAvailableOptions() {
        myDashboardPage.verifySubSchemes();
    }

    @Then("I verified pmkvy sub scheme all available options")
    public void iVerifiedPmkvySubSchemeAllVailableOptions() {
        myDashboardPage.verifyPmkvySubMenus();
    }


    @Then("I click on pmkvy and dashboard and verified all available options")
    public void iVerifiedTheMyDashboardSubSchemeAllAvailableOptions() {
        myDashboardPage.verifyMyDashBoardSubMenus();
    }


    @Then("I click on pmkvy and dashboard and verified my skill courses all available options")
    public void iClickOnPmkvyAndDashboardAndVerifiedMySkillCoursesAllAvailableOptions() {
        myDashboardPage.verifyMyskillCoursesOptions();
    }


    @Then("I verified the courses displayed are online")
    public void iVerifiedTheCoursesDisplayedAreOnline() {
        String actualValue=myDashboardPage.verifyCourseType();
        String expecteValue="Online";
        Assert.assertEquals(actualValue,expecteValue);
    }



    @Then("I click on pmkvy and dashboard and verified offLine join now option")
    public void iClickOnPmkvyAndDashboardAndVerifiedOffLineJoinNowOption() {
        myDashboardPage.verifyOfflineJoinOption();
        Assert.assertTrue(coursesPage.verifyJoinNowOptions());

    }


    @Then("I click on pmkvy and dashboard and verified the click and explore option")
    public void iClickOnPmkvyAndDashboardAndVerifiedTheClickAndExploreOption() {
        myDashboardPage.verifyCompletedOption();
        Assert.assertTrue(coursesPage.verifyJoinNowOptions());
    }


    @Then("I verify application and view application click and application information")
    public void iVerifyApplicationAndViewApplicationClickAndApplicationInformation() {
        myDashboardPage.verifyApplicationOption();
    }


    @Then("I click on recommendation for you and verified the recommended options")
    public void iClickOnRecommendationForYouAndVerifiedTheRecommendedOptions() {
        myDashboardPage.verifyRecommendationsForYou();
    }
   

    

}
