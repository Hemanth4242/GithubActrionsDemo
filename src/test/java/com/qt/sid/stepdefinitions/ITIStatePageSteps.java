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

public class ITIStatePageSteps extends BasePage {

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

    ITIStatePage itiStatePage;

    SkillCentrepage skillCentrepage;

   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public ITIStatePageSteps(TestContext context) {
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
        itiStatePage =  testContext.getPageObjectManager().getITIStatePage();
        skillCentrepage =  testContext.getPageObjectManager().getSkillCentrepage();

    }



    @When("I verify user navigated to Mobile number field post clicking ITI State Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_iti_state_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        itiStatePage.clickOnStateRegisterBtn();

        Assert.assertTrue(isElementPresent(loginPage.stateUserRole),"State role is not displayed");
        log.info("State role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");
    }

    @When("I verify user navigated to Mobile number field post clicking ITI Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_iti_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        itiStatePage.clickOnITIRegisterBtn();

        Assert.assertTrue(isElementPresent(loginPage.ITIRole),"ITI role is not displayed");
        log.info("ITI role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");
    }


    @When("I verify user navigated to Mobile number field post clicking DGT Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_DGT_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        itiStatePage.clickOnDGTAdminRegisterBtn();

        Assert.assertTrue(isElementPresent(loginPage.DGTAdminRole),"DGT Admin role is not displayed");
        log.info("DGT Admin role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");
    }

    @Then("I verify error message post entering the new mobile number")
    public void i_verify_error_message_post_entering_the_new_mobile_number(){
        loginPage.clickOnMobileNumberEditField();

        itiStatePage.enterNonRegisteredNumber();

        loginPage.clickOnContinue();
        waitWebDriver(3000);
        Assert.assertTrue(isElementPresent(itiStatePage.validUserTypeErrorMessage),"Please provide the valid usertype message is not displayed");
        log.info("Please provide the valid user type message is displayed");

    }

    @Then("I click on view all button in Dashboard")
    public void i_click_on_view_all_button_in_dashboard(){
        itiStatePage.clickOnViewAllInDashboard();
    }

    @Then("I verify user is able navigate to next page and previous page by clicking pagination arrows for State user")
    public void i_verify_user_is_able_navigate_to_next_page_and_previous_page_by_clicking_pagination_arrows_for_state_user(){
        skillCentrepage.verifyFirstPageNumberColorHighlighted();

        skillCentrepage.verifyUserNavigatedToNextPagePostClickingRightArrowForState();

        skillCentrepage.verifyUserNavigatesBackToPreviousPage();

        skillCentrepage.verifyThirdPageNumberColorHighlighted();

    }

    @Then("I verify all the application details in ITI Trainee")
    public void i_verify_all_the_application_details_in_iti_trainee(){
        itiStatePage.clickOnViewDetails();

        Assert.assertTrue(isElementPresent(itiStatePage.applicationDetailsText));
        Assert.assertTrue(isElementPresent(itiStatePage.fatherDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.motherDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.DOBDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.prnDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.genderDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.highestQualificationDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.admissionDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.categoryDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.typeDetails));

        scrollDown();

        Assert.assertTrue(isElementPresent(itiStatePage.EWSDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.DSTDetails));
        Assert.assertTrue(isElementPresent(itiStatePage.personWithDisability));
        Assert.assertTrue(isElementPresent(itiStatePage.pwdCategoryDetails));
        log.info("ITI Trainee is displayed with all the application details");
    }




}
