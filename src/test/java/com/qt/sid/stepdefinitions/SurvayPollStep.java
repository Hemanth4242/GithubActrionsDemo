package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SurvayPollStep extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    LoginPage loginPage;
    MyDashboardPage myDashboardPage;
    SurveysPollPage surveysPollPage;
    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public SurvayPollStep(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
        surveysPollPage = testContext.getPageObjectManager().getsurveysPollPage();

    }


    @And("Click Survey & Poll tab from the right side panel")
    public void clickSurveyPollTabFromTheRightSidePanel() {
        waitWebDriver(3000);
        homePage.clickOnSkillIndiaLogo();

        myDashboardPage.clickOnSurvayPolBtn();
    }

    @Then("verify that page {string}")
    public void verifyThatPage(String expected) {
    Assert.assertEquals(surveysPollPage.getTextSurvaysPollsPage(),expected);
    }
    
    @Then("verify user able to navigate to surveys and polls page")
    public void verifyuserabletonavigatetosurveysandpollspage() {
    	surveysPollPage.clickOnSurveyBtn();
    	
    	surveysPollPage.clickOnPollsBtn();
    }
}
