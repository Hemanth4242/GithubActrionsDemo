package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.FileReaderManager;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class TrainerPageSteps extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;
    LoginPage loginPage;

    MyDashboardPage myDashboardPage;

    TrainerPage trainerPage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public TrainerPageSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
        trainerPage = testContext.getPageObjectManager().getTrainerPage();



    }

    @Then("I verify trainer is able to click on Session Overview Session Calender and My Sessions")
    public void i_verify_trainer_is_able_to_click_on_session_overview_session_calendar_and_my_sessions(){
        trainerPage.clickOnSessionOverview();

        Assert.assertTrue(isElementPresent(trainerPage.sessionOverViewText),"Session Overview section is not displayed");
        log.info("Session Overview section is displayed");

        Assert.assertTrue(isElementPresent(trainerPage.upcomingSessionsBtn),"Upcoming sessions button is not displayed");
        log.info("Upcoming sessions button is displayed");

        Assert.assertTrue(isElementPresent(trainerPage.completedSessionsBtn),"Completed sessions button is not displayed");
        log.info("Completed sessions button is displayed");

        trainerPage.clickOnSessionCalendar();

        Assert.assertTrue(isElementPresent(trainerPage.calendarHeader),"Calendar header is not displayed");
        log.info("Calendar header is displayed");

        trainerPage.clickOnMySessions();
        log.info("User is able to click on My Sessions");
    }

    @Then("I verify Trainer is able to Logout")
    public void i_verify_trainer_is_able_to_logout(){
        trainerPage.clickOnMyProfile();

        loginPage.clickOnLogout();

        Assert.assertTrue(isElementPresent(loginPage.loginBtn),"Login button is not displayed");
        log.info("Trainer is able to Logout successfully");
    }

    @Then("I verify trainer is able to fill all the mandatory fields in Create Session")
    public void i_verify_trainer_is_able_to_fill_all_the_mandatory_fields_in_create_session(){
        trainerPage.clickOnCreateSessionBtn();

        Assert.assertTrue(isElementPresent(trainerPage.createLiveSessionLink),"Trainer is not navigated to Create Live session page");
        log.info("Trainer is navigated to Create Live Session Page");

        trainerPage.clickOnSessionTitle();
        trainerPage.enterSessionTitle();

        trainerPage.clickOnSectorDropdown();
        trainerPage.selectSectorFromDropdown();

        trainerPage.clickOnDescriptionSection();
        trainerPage.enterTheDescription();

        trainerPage.clickOnStartTime();
        trainerPage.selectStartTime();

        trainerPage.clickOnEndTime();
        trainerPage.selectEndTime();

        trainerPage.scrollTillLanguageDropdown();

        trainerPage.clickOnLanguageDropdown();
        trainerPage.selectTheLanguage();


//        boolean trainerName = trainerPage.trainerNameSection.isEnabled();
//        Assert.assertEquals(trainerName,false);

        trainerPage.uploadTheFile();


    }

    @Then("I verify trainer get error message for empty username field")
    public void i_verify_trainer_get_error_message_for_empty_username_field(){
         trainerPage.clickOnConnect();

         Assert.assertTrue(isElementPresent(trainerPage.connectPopupText),"Connect popup is not displayed");
         log.info("Connect popup is displayed");

         Assert.assertTrue(isElementPresent(trainerPage.questionUnderConnnectPopup),"User not able to click on Connect");

         trainerPage.clickOnUsernameField();

         trainerPage.clickOnNoBtn();

         trainerPage.clickOnYesBtn();

         trainerPage.clickOnUsernameField();

         Assert.assertTrue(isElementPresent(trainerPage.userNameRequiredMsg),"Error message is not displayed");
         log.info("Error message is displayed");
    }

}
