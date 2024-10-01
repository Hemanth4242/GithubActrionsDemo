package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MostPopularStep extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    CoursesPage coursesPage;
    OpportunitiesPage opportunitiesPage;
    TrainingCentrePage trainingCentrePage;


    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public MostPopularStep(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        coursesPage = testContext.getPageObjectManager().getCoursesPage();
        opportunitiesPage = testContext.getPageObjectManager().getOpportunityPage();
        trainingCentrePage = testContext.getPageObjectManager().getTrainingCentrePage();


    }



    @Then("scroll down and click {string} and enter the keyword {string} and  click on search button And verify redireted {string}")
    public void scrollDownAndClickAndEnterTheKeywordAndClickOnSearchButtonAndVerifyRedireted(String tab, String keyword, String expected) throws InterruptedException {

        homePage.scrollTillMostPopularElement();
        homePage.clickMostPopularCourses(tab);
        homePage.sendMostPopularSearchTextField(keyword);
        homePage.clickOnMostPoularSearchTextBtn();

        if(tab.equalsIgnoreCase("Skill Courses")){
            Assert.assertTrue(coursesPage.getTextCoursePageIsDisplay());
        }else if(tab.equalsIgnoreCase("Job Exchange")){
            Assert.assertTrue(opportunitiesPage.getTextOpportunityPageText());
        }else if(tab.equalsIgnoreCase("Skill Centre")){
            Assert.assertTrue(trainingCentrePage.getTextTrainingCentrePage());
        }
    }
}
