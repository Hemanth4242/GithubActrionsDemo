package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class AwardingBodyPageSteps extends BasePage {

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


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public AwardingBodyPageSteps(TestContext context) {
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



    }


    @When("I verify user navigated to Mobile number field post clicking Awarding Body Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_awarding_body_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        awardingBodyPage.clickOnAwardingBodyRegister();

        Assert.assertTrue(isElementPresent(loginPage.awardingBodyRole),"Awarding body role is not displayed");
        log.info("Awarding Body role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");
    }

    @When("I verify Awarding Body is navigated to OTP page post clicking Forgot Password")
    public void i_verify_awarding_body_is_navigated_to_otp_page_post_clicking_forgot_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnAwardingBodyLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.awardingBodyRole),"Awarding Body role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"Awarding body is not navigated to OTP Page");
        log.info("Awarding body is navigated to OTP Page");

    }


}
