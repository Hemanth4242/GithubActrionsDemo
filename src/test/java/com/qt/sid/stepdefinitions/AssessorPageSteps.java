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

public class AssessorPageSteps extends BasePage {

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

    AssessorPage assessorPage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public AssessorPageSteps(TestContext context) {
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
        assessorPage = testContext.getPageObjectManager().getAssessorPage();



    }



    @When("I verify user navigated to Mobile number field post clicking Assessor Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_assessor_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        assessorPage.clickOnAssessorRegister();

        Assert.assertTrue(isElementPresent(loginPage.assessorRole),"Assessor role is not displayed");
        log.info("Awarding Body role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");
    }


    @Then("I verify Assessor is able to click on Explore Now")
    public void i_verify_assessor_is_able_to_click_on_explore_now(){
        assessorPage.clickOnExploreNowbutton();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(assessorPage.assessorRegistrationForm),"User is not navigated to SIP portal");
                log.info("User is navigated to SIP Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @When("I verify Assessor is navigated to OTP page post clicking Forgot Password")
    public void i_verify_assessor_is_navigated_to_otp_page_post_clicking_forgot_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnAssessorLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.assessorRole),"Assessor role is not selected");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")){
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithLearner());
            loginPage.clickOnContinue();

            waitWebDriver(2000);
        }else{
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getAssessmentAgencyCredForUATFromProperty());

            loginPage.clickOnContinue();
            waitWebDriver(2000);
        }

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"Awarding body is not navigated to OTP Page");
        log.info("Awarding body is navigated to OTP Page");

    }

    @Then("I verify Assessor user is able to click on view Surveys and Poll")
    public void i_verify_assessor_user_is_able_to_click_on_view_surveys_and_poll(){
        trainerPage.clickOnMyProfile();

        assessmentAgencyPage.clickOnViewInProfile();

        Assert.assertTrue(isElementPresent(assessmentAgencyPage.surveysAndPollsLink),"Surveys and Polls link is not displayed");
        log.info("Surveys and Polls link is displayed");

        Assert.assertTrue(isElementPresent(assessmentAgencyPage.surveysBtn),"Surveys button is not displayed");
        log.info("Surveys button is displayed");

        Assert.assertTrue(isElementPresent(assessmentAgencyPage.pollsBtn),"Polls button is not displayed");
        log.info("Polls button is displayed");
    }

    @Then("I verify Assessor able to access dashboard from user profile")
    public void i_verify_assessor_able_to_access_dashboard_from_user_profile(){
        trainerPage.clickOnMyProfile();

        assessorPage.clickOnMyDashboardInProfile();

        waitForElementToAppear(loginPage.dashboardSection);
        Assert.assertTrue(isElementPresent(loginPage.dashboardSection),"Dashboard is not displayed");
        log.info("Dashboard is displayed");

        Assert.assertTrue(isElementPresent(loginPage.assessorLink),"Assessor is not displayed");
        log.info("Assessor  is displayed");

    }

    @Then("I verify Assessor is able to Logout successfully")
    public void i_verify_assessor_is_able_to_logout_successfully(){
        trainerPage.clickOnMyProfile();

        profilePage.visibilityOfSettingsOption();

        loginPage.clickOnLogout();

        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"Register button is not displayed");
        log.info("Register button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.loginBtn),"Login button is not displayed");
        log.info("Login button is displayed");

    }


}
