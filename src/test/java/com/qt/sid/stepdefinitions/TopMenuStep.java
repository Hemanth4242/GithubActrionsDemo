package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TopMenuStep extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;

    JobExchangePage jobExchangePage;

    SkillCoursesPage skillCoursesPage;

    SkillCentrepage skillCentrepage;

    SkillIndiaMapPage skillIndiaMapPage;

    AboutUSPage aboutUSPage;

    TermAndConditionsPage termAndConditionsPage;

    PrivacyPolicyPage privacyPolicyPage;

    DisclaimerPage disclaimerPage;

    ContactUSPage contactUSPage;

    SchemesPage schemesPage;
    EBooksPage eBooksPage;

    Sectorspage sectorspage;

    ProfilePage profilePage;

    SurveysPollPage surveysPollPage;
    DashboardPage dashboardPage;


    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public TopMenuStep(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        recommendationPage = testContext.getPageObjectManager().getRecommendationPage();
        skillCoursesPage = testContext.getPageObjectManager().getSkillCoursesPage();
        jobExchangePage = testContext.getPageObjectManager().getJobExchangePage();
        skillCentrepage = testContext.getPageObjectManager().getSkillCentrepage();
        skillIndiaMapPage = testContext.getPageObjectManager().getSkillIndiaMapPage();
        aboutUSPage = testContext.getPageObjectManager().getAboutUSPage();
        termAndConditionsPage = testContext.getPageObjectManager().getTermAndConditionsPage();
        privacyPolicyPage = testContext.getPageObjectManager().getPrivacyPolicyPage();
        disclaimerPage = testContext.getPageObjectManager().getDisclaimerPage();
        contactUSPage = testContext.getPageObjectManager().getContactUSPage();
        schemesPage = testContext.getPageObjectManager().getSchemesPage();
        eBooksPage = testContext.getPageObjectManager().getEBookspage();
        sectorspage = testContext.getPageObjectManager().getSectorspage();
        profilePage = testContext.getPageObjectManager().getprofilePage();
        surveysPollPage = testContext.getPageObjectManager().getsurveysPollPage();
        dashboardPage  = testContext.getPageObjectManager().getDashboardPage();



    }


    @And("Click Notification Bell icon from the top menu")
    public void clickNotificationBellIconFromTheTopMenu() throws InterruptedException {
     dashboardPage.clickOnNotificationIcon();
    }

    @Then("I verify the notification icon {string}")
    public void iVerifyTheNotificationIcon(String expected) {
    	
        Assert.assertEquals(dashboardPage.getTextNotification(),expected);

    }

    @And("Click Searchbar icon from the top menu and enter")
    public void clickSearchbarIconFromTheTopMenuAndEnter() {
        homePage.clickOnSearchBtnHomePage();
    }

    @Then("I verify that redirected page {string},expecte is {string}")
    public void iVerifyThatRedirectedPageExpecteIs(String atribute, String expected) throws Throwable {
        Assert.assertEquals(homePage.getAtributeSearchText(atribute),expected);
    }


}
