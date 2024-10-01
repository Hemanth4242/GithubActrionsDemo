package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TrainingSteps extends BasePage {

    TestContext testContext;
    WebDriver driver;
    LandingPage landingPage;
    TrainingPage trainingPage;


    public TrainingSteps(TestContext context){
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        driver = testContext.getDriverManager().getDriver();
        trainingPage = testContext.getPageObjectManager().getTrainingPage();

    }

    @And("i click on skill course section")
    public void i_click_on_skill_course_page()  {
        trainingPage.clickOnSkillCourse();

    }

    @Then("i enter Agriculture text in search bar")
    public void i_enter_agriculture_text(){
        trainingPage.clickSectorsSearch();
    }

    @When("i select agriculture course")
    public void i_select_agriculture_course()  {
        trainingPage.clickOnAgriculture();

    }
    @Then("i select sort dropdown")
    public void i_select_sort_dropdown()  {
       trainingPage. clickOnSortDropDown();

    }
    @When("i select low to high and verify")
    public void i_select_low_to_high()  {
        trainingPage.clickOnLowToHighOpt();
        Assert.assertTrue(isElementPresent(trainingPage.assertCourse),"Agriculture course is Not Displayed");

    }






}
