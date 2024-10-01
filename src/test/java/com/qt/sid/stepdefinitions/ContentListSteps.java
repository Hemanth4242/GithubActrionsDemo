package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.pages.ContentListPage;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContentListSteps {
    TestContext testContext;
    WebDriver driver;
    ContentListPage contentListPage;


    public ContentListSteps(TestContext context){
        testContext = context;
        driver = testContext.getDriverManager().getDriver();
        contentListPage=testContext.getPageObjectManager().getContentListPage();

    }

    @Then("I click on the ebook name")
    public void iClickOnEbookToViewTheEbook() {
        contentListPage.verifyEbookClick();
    }

    @Then("I verified user can view the eBook")
    public void iVerifiedUserCanViewTheEBook() {
        Assert.assertTrue(contentListPage.verifyEbookView());
    }

    @Then("I verified user can download eBook")
    public void iVerifiedUserCanDownloadEBook() throws InterruptedException {
        contentListPage.verifyEbookDownloadOption();

    }
}
