package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.FileReaderManager;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class AssessmentAgencyPageSteps extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;
    LoginPage loginPage;

    MyDashboardPage myDashboardPage;

    TrainerPage trainerPage;

    TrainingPartnerPage trainingPartnerPage;

    ProfilePage profilePage;

    TrainingCentrePage trainingCentrePage;

    AwardingBodyPage awardingBodyPage;

    AssessmentAgencyPage assessmentAgencyPage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public AssessmentAgencyPageSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
        trainerPage = testContext.getPageObjectManager().getTrainerPage();
        trainingPartnerPage = testContext.getPageObjectManager().getTrainingPartnerPage();
        profilePage = testContext.getPageObjectManager().getprofilePage();
        trainingCentrePage = testContext.getPageObjectManager().getTrainingCentrePage();
        awardingBodyPage = testContext.getPageObjectManager().getAwardingBodyPage();
        assessmentAgencyPage = testContext.getPageObjectManager().getAssessmentAgencyPage();



    }


    @When("I verify user navigated to Mobile number field post clicking Assessment Agency Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_assessment_agency_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        assessmentAgencyPage.clickOnAssessmentAgencyRegister();

        Assert.assertTrue(isElementPresent(loginPage.assessmentAgencyRole),"Assessment Agency role is not displayed");
        log.info("Awarding Body role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");
    }

    @Then("I verify Overview ExploreMore Features and User profile")
    public void i_verify_overview_exploremore_features_and_user_profile(){
        Assert.assertTrue(isElementPresent(loginPage.ExploreNowBtn),"Explore now button is not displayed");
        log.info("Explore now button is displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.dashboardInTP),"Dashboard is not displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.overviewSection),"Overview section is not displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.userProfile),"User Profile is not displayed");

        trainingPartnerPage.scrollToFeatures();

        Assert.assertTrue(isElementPresent(trainingPartnerPage.featuresSection),"Features section is not displayed");
        log.info("Features section is displayed");
    }

    @Then("I verify Assessment Agency is able to click on Explore Now")
    public void i_verify_assessment_agency_is_able_to_click_on_explore_now(){
        assessmentAgencyPage.clickOnExploreNowbutton();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(trainingCentrePage.trainingCentreRegistrationPageText),"User is not navigated to SIP portal");
                log.info("User is navigated to SIP Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @When("I verify Assessment Agency is navigated to OTP page post clicking Forgot Password")
    public void i_verify_assessment_agency_is_navigated_to_otp_page_post_clicking_forgot_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnAssessmentAgencyLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.assessmentAgencyRole),"Assessment Agency role is not selected");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.mobileNumberEditField.sendKeys("");
            loginPage.clickOnContinue();

        }else{
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getAssessmentAgencyCredForUATFromProperty());

            loginPage.clickOnContinue();
        }

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"Awarding body is not navigated to OTP Page");
        log.info("Awarding body is navigated to OTP Page");

    }

    @Then("I verify Assessment Agency user is able to click on view Surveys and Poll")
    public void i_verify_assessment_agency_user_is_able_to_click_on_view_surveys_and_poll(){
        trainerPage.clickOnMyProfile();

        assessmentAgencyPage.clickOnViewInProfile();

        Assert.assertTrue(isElementPresent(assessmentAgencyPage.surveysAndPollsLink),"Surveys and Polls link is not displayed");
        log.info("Surveys and Polls link is displayed");

        Assert.assertTrue(isElementPresent(assessmentAgencyPage.surveysBtn),"Surveys button is not displayed");
        log.info("Surveys button is displayed");

        Assert.assertTrue(isElementPresent(assessmentAgencyPage.pollsBtn),"Polls button is not displayed");
        log.info("Polls button is displayed");
    }


}
