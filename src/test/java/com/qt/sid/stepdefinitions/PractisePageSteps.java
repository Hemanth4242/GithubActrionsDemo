package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PractisePageSteps extends BasePage {

    TestContext testContext;
    WebDriver driver;
    LandingPage landingPage;
    PractisePage practisePage;


    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public PractisePageSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        driver = testContext.getDriverManager().getDriver();
        practisePage = testContext.getPageObjectManager().getPractisePage();


    }


    @And("i click on login button")
    public void i_click_on_Login_Button() throws InterruptedException {
        practisePage.clickOnLoginBtn();
        Assert.assertTrue(isElementPresent(practisePage.assertLoginPage),"Login Page is not displayed");
        log.info("Login Page is Displayed");

        Thread.sleep(2000);
    }

    @Given("i select learnerParticipant")
    public void i_select_LearnerParticipant() throws InterruptedException {
        practisePage.clickOnLearnerParticipantBtn();
        Thread.sleep(2000);

    }


    @And("i enter the mobile number")
    public void i_enter_mobile_number() throws InterruptedException {
        practisePage.clickAndEnterMobileNumber();
        Assert.assertTrue(isElementPresent(practisePage.assertMobileNumberFIled),"Mobile Number Page is not displayed");
        log.info("MobileNumber Page is Displayed");
        Thread.sleep(3000);
    }


//    Scenario : Verify Skill India Digital Agriculture course in skill course

//    @And("i click on skill course section")
//    public void i_click_on_skillcourse() throws InterruptedException {
//        practisePage.clickOnSkillCourse();
//
//        Thread.sleep(2000);
//    }
//
//    @Then("i enter Agriculture text in search bar")
//    public void i_enter_agriculture_text()  {
//        practisePage.clickSectorsSearch();
//
//    }
//
//    @When("i select agriculture course")
//    public void i_select_agriculture_course()  {
//        practisePage. clickOnAgriculture();
//
//    }
//
//    @Then("i select sort dropdown")
//    public void i_select_sort_dropdown()  {
//        practisePage.clickOnSortDropDown();
//
//    }
//
//    @When("i select low to high and verify")
//    public void i_select_low_to_high() throws InterruptedException {
//        practisePage.clickOnLowToHighOpt();
//        Assert.assertTrue(isElementPresent(practisePage.assertCourse),"Agriculture course is Not Displayed");
//        log.info("Agriculture course is Displayed");
//        Thread.sleep(5000);


 //   }


}
