package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class IWantToLearnStep {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    WebDriverWait wait;
    JavascriptExecutor js;

    SkillCoursesPage skillCoursesPage;
    LookupResultPage lookupResultPage;
    CareerCounselingPage careerCounselingPage;
    SkillIndiaMapPage skillIndiaMap;


    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public IWantToLearnStep(TestContext context) {

        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        skillCoursesPage = testContext.getPageObjectManager().getSkillCoursesPage();
        skillIndiaMap = testContext.getPageObjectManager().getSkillIndiaMapPage();
        lookupResultPage=testContext.getPageObjectManager().getLookupResultPage();
        careerCounselingPage = testContext.getPageObjectManager().getCarrerCaunselingPage();


    }

    @And("Enter interest type in the {string} section and select it")
    public void enterInterestTypeInTheSectionAndSelectIt(String value) {
        homePage.sendSelectInterestAreaTextField(value);
    }

    @And("Enter job exchange in the {string} section")
    public void enterJobExchangeInTheSection(String value) throws InterruptedException {

         homePage.sendSearchJobExchengeTextField(value);
         homePage.selectTheFlooringWorkJob();

    }


    @And("Click Find Skill Courses button")
    public void clickFindSkillCoursesButton() throws InterruptedException {
        homePage.clickOnSelectedIntrestArea();
        homePage.clickFindSkillCourseBtn();
    }



    @And("Click Find Job Exchange button")
    public void clickFindJobExchangeButton() throws InterruptedException {
        homePage.clickExploreJobBtn();
    }

    @And("In Not sure where to begin section, select the education type {string} and click Next button")
    public void inNotSureWhereToBeginSectionSelectTheEducationTypeAndClickNextButton(String value) throws InterruptedException {
        homePage.clickMatBtn();
        homePage.clickSelectEducationTextField();
        homePage.clickNextBtn();
    }

    @Then("verify skill course page is displayed {string}")
    public void verifySkillCoursePageIsDisplayed(String expected) throws InterruptedException {
        Assert.assertEquals(skillCoursesPage.verifySkillCoursePage(),expected,"Expected Value is "+expected+" Achual value is "+skillCoursesPage.verifySkillCoursePage());
       }


    @Then("verify that expected element is displayed {string}")
    public void verifyThatExpectedElementIsDisplayed(String expected) throws InterruptedException {
        Assert.assertEquals(lookupResultPage.getTextElement(),expected,"Expected Value is "+expected+ " Achual value is "+lookupResultPage.getTextElement());
    }

    @Then("verify career-counseling page should be displayed {string}")
    public void verifyCareerCounselingPageShouldBeDisplayed(String expected) throws InterruptedException {
        Assert.assertEquals(careerCounselingPage.verifyLookupResultPage(),expected,"Expected Value is "+expected+ " Achual value is "+careerCounselingPage.verifyLookupResultPage());

    }


    @When("Scroll down to the Opportunities Near You section and click Opportunities Near You button")
    public void scrollDownToTheOpportunitiesNearYouSectionAndClickOpportunitiesNearYouButton() {
    	
            homePage.clickOpportunitiesNearYouBtn();
    }
    @Then("Verify the navigation page {string}")
    public void verifyTheNavigationPage(String expected) throws InterruptedException {
        Assert.assertTrue(skillIndiaMap.verifySkillMapPage().contains(expected)," Skill india map is not displayed its return false");
    }

}
