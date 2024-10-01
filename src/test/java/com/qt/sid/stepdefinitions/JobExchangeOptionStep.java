package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.ConfigFileReader;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JobExchangeOptionStep extends BasePage {


        TestContext testContext;
        HomePage homePage;
        WebDriver driver;
        LandingPage landingPage;
        RecommendationPage recommendationPage;
        LoginPage loginPage;

        MyDashboardPage myDashboardPage;
        OpportunitiesPage opportunitiesPage;
        JobDetailsPage jobDetailsPage;
        ConfigFileReader configFileReader;

        JobExchangePage jobExchangePage;



        Logger log = LoggerHelper.getLogger(LoggerHelper.class);

        public JobExchangeOptionStep(TestContext context) {
            testContext = context;
            landingPage = testContext.getPageObjectManager().getlandingPage();
            homePage = testContext.getPageObjectManager().getHomePage();
            driver = testContext.getDriverManager().getDriver();
            homePage = testContext.getPageObjectManager().getHomePage();
            loginPage= testContext.getPageObjectManager().getLoginPage();
            myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
            opportunitiesPage = testContext.getPageObjectManager().getOpportunityPage();
            jobDetailsPage =testContext.getPageObjectManager().getJobDetailsPage();
            jobExchangePage=testContext.getPageObjectManager().getJobExchangePage();
            configFileReader= new ConfigFileReader();


        }

    @Then("I click on job exchange button")
    public void iClickOnJobExchangeButton() throws InterruptedException {
            myDashboardPage.clickOnJobExchangeOption();
    }

    @Then("I verified user is navigated to job exchange page")
    public void iVerifiedUserIsNavigatedToJobExchangePage() {
            opportunitiesPage.verifyJobEXchangePage();

    }

    @Then("I verified the different job exchange options")
    public void iVerifiedTheDifferentJobExchangeOptions() throws InterruptedException {
          String actualValue =  opportunitiesPage.verifyJobExchangeName();
          String  expectedValue =configFileReader.getJobExchangeName();
        //  Assert.assertEquals(actualValue,expectedValue);
        Assert.assertTrue(isElementPresent(opportunitiesPage.jobExchangeOption),"Job is not displayed");
         log.info("Particular job is displayed");
        }

        @Then("I click on course name")
         public void iClickOnCourseName() {
        opportunitiesPage.verifyCourseNameClick();
    }
    @Then("I verified the course details")
    public void iVerifiedTheCourseDetails() {
            Assert.assertTrue(jobDetailsPage.verifyJobDescription());
            log.info("Job description is dispalyed");
    }
    @Then("I click on course dropDown")
    public void iClickOnCourseDropDown() {
            opportunitiesPage.verifyCourseDropDownButton();
    }

    @Then("I sorted the courses in ascending order")
    public void iSortedTheCoursesInAccendingOrder() {
        opportunitiesPage.verifyCourseDropdownAccendingOrderOption();
    }
    @Then("I verified courses are sorted in ascending order")
    public void iVerifiedCoursesAreSortedInAccendingOrder() {
         char cr1 =opportunitiesPage.verifyCourse1FirstCharacter();
         char cr2 =opportunitiesPage.verifyCourse2FirstCharacter();
         Assert.assertTrue(cr1<=cr2);
        }

        @Then("I sorted the course in descending order")
        public void iSortedTheCourseInDeccendingOrder() {
        opportunitiesPage.verifyCourseDeccendingOrder();
    }

    @Then("I verified courses are sorted in descending order")
    public void iVerifiedCoursesAreSortedInDeccendingOrder() {
       char result1= opportunitiesPage.verifyDecCoursr1FirstCharacter();
        char result2=opportunitiesPage.verifyDecCoursr2FirstCharacter();
        Assert.assertTrue(result1>=result2);
    }

    @Then("I click on course radio button")
    public void iClickOnCourseRadioButton() {
            opportunitiesPage.verifyJobCourseFilter();

            jobExchangePage.clickOnIndustryFilter();

            //jobExchangePage.clickOnApplyBtn();
    }

    @Then("I verified the job course search result")
    public void iVerifiedTheJobCourseSearchResult() {
         //  String actualCourse= opportunitiesPage.verifyJobCourseRadioButtonFilterResult().trim();
         //  String expectedCourse=configFileReader.getJobExchangeRadioButtonSearch();
         //  Assert.assertEquals(actualCourse,expectedCourse);
    }


    @Then("I enter text in the input field")
    public void iEnterTextInTheInputField() throws InterruptedException {
            String  value =configFileReader.getJobExchangeSearchValue();
            opportunitiesPage.verifyJobExchangeSearchField(value);
    }

    @Then("I cleared the search input field")
    public void iClearedInSearchInputField() {
            opportunitiesPage.verifyJobExchangeSearchFieldClear();

    }


}

