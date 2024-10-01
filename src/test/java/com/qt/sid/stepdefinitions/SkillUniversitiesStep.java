package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.pages.SkillUniversitiesPage;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class SkillUniversitiesStep {

    TestContext testContext;
    WebDriver driver;
    SkillUniversitiesPage skillUniversitiesPage;


    public SkillUniversitiesStep(TestContext context){
        testContext = context;
        driver = testContext.getDriverManager().getDriver();
        skillUniversitiesPage=testContext.getPageObjectManager().getSkillUniversitiesPage();
    }

    @Then("I selected private option from the type filter")
    public void iSelectedPrivateOptionFromTheTypeFilter() {
        skillUniversitiesPage.verifyTypePrivateOption();

        skillUniversitiesPage.clickOnTypeFilter();
    }


    @Then("I selected location from the location filter")
    public void iSelectedLocationFromTheLocationFilter()  {
        skillUniversitiesPage.verifyLocationOption();
    }

    @Then("I verified the search result")
    public void iVerifiedTheSearchResult() {
        String actualText =skillUniversitiesPage.verifyTypeText();
        String actualLocation =skillUniversitiesPage.verifyLocationText();
        Assert.assertEquals(actualText,"Private");
        Assert.assertTrue(actualLocation.contains("Madhya Pradesh"));
    }
    @Then("I cleared the filter result")
    public void iClearedTheFilterResult() {
        skillUniversitiesPage.verifyResetButton();
    }
}
