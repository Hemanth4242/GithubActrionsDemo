package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.FileReaderManager;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NSDCAdminPageSteps extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;
    LoginPage loginPage;

    MyDashboardPage myDashboardPage;

    TrainerPage trainerPage;

    TrainingPartnerPage trainingPartnerPage;

    ProfilePage profilePage;

    NSDCAdminPage nsdcAdminPage;

   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public NSDCAdminPageSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
        trainerPage = testContext.getPageObjectManager().getTrainerPage();
        trainingPartnerPage = testContext.getPageObjectManager().getTrainingPartnerPage();
        profilePage = testContext.getPageObjectManager().getprofilePage();
        nsdcAdminPage= testContext.getPageObjectManager().getNSDCAdminPage();



    }

    @Then("I verify NSDC Admin is able to add the Banner End date in Banner upload")
    public void i_verify_nsdc_admin_is_able_to_add_the_banner_end_date_in_banner_upload(){
        nsdcAdminPage.clickOnUploadBanner();

        nsdcAdminPage.clickOnBannerTitleTextField();

        nsdcAdminPage.enterBannerTitle();

        nsdcAdminPage.clickOnEnterAltTextInUploadBanner();

        nsdcAdminPage.enterAltTextInTextField();

        nsdcAdminPage.clickOnRedirectionUrlTextField();

        nsdcAdminPage.enterTheRedirectionUrl();

        nsdcAdminPage.clickOnGoLiveDateofBanner();

        nsdcAdminPage.selectTheGoLiveDateOfBanner();

        nsdcAdminPage.clickOnEndDateOfBanner();

        nsdcAdminPage.selectTheEndDateOfBanner();

    }

    @Then("I verify NSDC Admin is able to select banner redirection in the same page")
    public void i_verify_nsdc_admin_is_able_to_select_banner_redirection_in_the_same_page(){
        nsdcAdminPage.clickOnUploadBanner();

        nsdcAdminPage.clickOnBannerTitleTextField();

        nsdcAdminPage.enterBannerTitle();

        nsdcAdminPage.clickOnEnterAltTextInUploadBanner();

        nsdcAdminPage.enterAltTextInTextField();

        nsdcAdminPage.clickOnRedirectionUrlTextField();

        nsdcAdminPage.enterTheRedirectionUrl();

        nsdcAdminPage.clickOnBannerRedirectionType();

        nsdcAdminPage.selectSamePageRedirection();

        nsdcAdminPage.clickOnGoLiveDateofBanner();

        nsdcAdminPage.selectTheGoLiveDateOfBanner();

        nsdcAdminPage.clickOnEndDateOfBanner();

        nsdcAdminPage.selectTheEndDateOfBanner();
    }

    @Then("I verify NSDC Admin is able to select banner redirection in different page")
    public void i_verify_nsdc_admin_is_able_to_select_banner_redirection_in_different_page(){
        nsdcAdminPage.clickOnUploadBanner();

        nsdcAdminPage.clickOnBannerTitleTextField();

        nsdcAdminPage.enterBannerTitle();

        nsdcAdminPage.clickOnEnterAltTextInUploadBanner();

        nsdcAdminPage.enterAltTextInTextField();

        nsdcAdminPage.clickOnRedirectionUrlTextField();

        nsdcAdminPage.enterTheRedirectionUrl();

        nsdcAdminPage.clickOnBannerRedirectionType();

        nsdcAdminPage.selectDifferentPageRedirection();

        nsdcAdminPage.clickOnGoLiveDateofBanner();

        nsdcAdminPage.selectTheGoLiveDateOfBanner();

        nsdcAdminPage.clickOnEndDateOfBanner();

        nsdcAdminPage.selectTheEndDateOfBanner();
    }

    @Then("I verify NSDC Admin is able to Preview the Uploaded banner")
    public void i_verify_nsdc_admin_is_able_to_preview_the_uploaded_banner(){
        nsdcAdminPage.clickOnUploadBanner();

        nsdcAdminPage.clickOnBannerTitleTextField();

        nsdcAdminPage.enterBannerTitle();

        nsdcAdminPage.clickOnEnterAltTextInUploadBanner();

        nsdcAdminPage.enterAltTextInTextField();

        nsdcAdminPage.clickOnRedirectionUrlTextField();

        nsdcAdminPage.enterTheRedirectionUrl();

        nsdcAdminPage.clickOnBannerRedirectionType();

        nsdcAdminPage.selectDifferentPageRedirection();

        nsdcAdminPage.clickOnGoLiveDateofBanner();

        nsdcAdminPage.selectTheGoLiveDateOfBanner();

        nsdcAdminPage.clickOnEndDateOfBanner();

        nsdcAdminPage.selectTheEndDateOfBanner();

        nsdcAdminPage.clickOnUploadbannerToDesktop();

        nsdcAdminPage.clickOnPreviewTheUploadedBanner();
    }

    @Then("I verify NSDC Admin is able to edit the uploaded banner in Manage banner")
    public void i_verify_nsdc_admin_is_able_to_edit_the_uploaded_banner_in_manage_banner(){
        nsdcAdminPage.clickOnManageBanner();

        nsdcAdminPage.clickOnEditBanner();

    }

    @Then("I verify NSDC Admin is able to create an Assessment and submit")
    public void i_verify_nsdc_admin_is_able_to_create_an_assessment_and_submit(){
        nsdcAdminPage.clickOnCreateAnnouncement();

        nsdcAdminPage.clickOnAnnouncementTitleTextField();

     //   nsdcAdminPage.EnterTheAnnouncementTitle();

    //    nsdcAdminPage.clickOnSchemeDropdown();

        nsdcAdminPage.selectTheSchemeOrProgram();

        nsdcAdminPage.clickOnPublishedBy();

        nsdcAdminPage.selectThePublishedBy();

        nsdcAdminPage.clickOnPublishedFor();

        nsdcAdminPage.selectThePublishedFor();

        nsdcAdminPage.clickOnPublishedDate();

        nsdcAdminPage.selectThePublishedDate();

        nsdcAdminPage.clickOnDescription();

        nsdcAdminPage.clcikOnURLRadioButton();

        nsdcAdminPage.clickOnURLTextField();

        nsdcAdminPage.enterTheSpecificURL();

        nsdcAdminPage.clickOnNoRestrictionToAccessAttachment();

        nsdcAdminPage.clickOnYesToSendNotificationsToAudience();

        nsdcAdminPage.clickOnModeOfSendingNotification();

        nsdcAdminPage.selectInAppMode();

        nsdcAdminPage.clickOnSubmit();

    }

    @Then("I verify NSDC Admin is able to send back the created Assessment")
    public void i_verify_nsdc_admin_is_able_to_send_back_the_created_assessment(){
        nsdcAdminPage.clickOnMyAnnouncementsTwo();

        nsdcAdminPage.clickOnPending();

        nsdcAdminPage.clickOnViewDetails();

        nsdcAdminPage.clickOnSendBack();

        nsdcAdminPage.clickOnContinue();

        nsdcAdminPage.clickOnSave();

    }

    @Then("I verify NSDC Admin is able to Edit the send back assessment and submit")
    public void i_verify_nsdc_admin_is_able_to_edit_the_send_back_assessment_and_submit(){
        nsdcAdminPage.clickOnMyAnnouncementsOne();

        nsdcAdminPage.clickOnSentBack();

        nsdcAdminPage.clickOnViewDetails();

        nsdcAdminPage.editTheAnnouncementTitle();

        nsdcAdminPage.clickOnSubmit();

    }

    @Then("I verify NSDC Admin is able Approve and Publish the Assessment")
    public void i_verify_nsdc_admin_is_able_approve_and_publish_the_assessment(){
        nsdcAdminPage.clickOnMyAnnouncementsTwo();

        nsdcAdminPage.clickOnPending();

        nsdcAdminPage.clickOnViewDetails();

        nsdcAdminPage.clickOnApproveAndPublish();

        nsdcAdminPage.clickOnYesNow();

    }

    @Then("I verify NSDC Admin is able to enter the minimum characters in the Assessment Title")
    public void i_verify_nsdc_admin_is_able_to_enter_the_minimum_characters_in_the_assessment_title(){
        nsdcAdminPage.clickOnCreateAnnouncement();

        nsdcAdminPage.clickOnAnnouncementTitleTextField();

        nsdcAdminPage.enterLessThanMinimumCharactersRequiredInAssessmentTitle();

        nsdcAdminPage.clearAndEnterMinimumCharactersRequiredInAssessmentTitle();


    }

    @Then("I verify NSDC Admin is able to enter the minimum characters in the Assessment description")
    public void i_verify_nsdc_admin_is_able_to_enter_the_minimum_characters_in_the_assessment_description(){

       // nsdcAdminPage.clickOnSchemeDropdown();

        nsdcAdminPage.selectTheSchemeOrProgram();

        nsdcAdminPage.clickOnPublishedBy();

        nsdcAdminPage.selectThePublishedBy();

        nsdcAdminPage.clickOnPublishedFor();

        nsdcAdminPage.selectThePublishedFor();

        nsdcAdminPage.clickOnPublishedDate();

        nsdcAdminPage.selectThePublishedDate();

        nsdcAdminPage.clickOnDescription();

        nsdcAdminPage.enterLessThanMinimumCharactersRequiredinAssessmentDescription();

        nsdcAdminPage.clearAndEnterTheMinimumCharactersRequriedInAssessmentDescription();
    }

    @Then("I verify NSDC Admin is able to enter the maximum characters in the Assessment Title")
    public void i_verify_nsdc_admin_is_able_to_enter_the_maximum_characters_in_the_assessment_title(){
        nsdcAdminPage.clickOnCreateAnnouncement();

        nsdcAdminPage.clickOnAnnouncementTitleTextField();

        nsdcAdminPage.enterMoreThanMaximumCharactersRequiredInAssessmentTitle();

        nsdcAdminPage.clearAndEnterMaximumCharactersRequiredInAssessmentTitle();


    }

    @Then("I verify NSDC Admin is able to enter the maximum characters in the Assessment description")
    public void i_verify_nsdc_admin_is_able_to_enter_the_maximum_characters_in_the_assessment_description(){

      //  nsdcAdminPage.clickOnSchemeDropdown();

        nsdcAdminPage.selectTheSchemeOrProgram();

        nsdcAdminPage.clickOnPublishedBy();

        nsdcAdminPage.selectThePublishedBy();

        nsdcAdminPage.clickOnPublishedFor();

        nsdcAdminPage.selectThePublishedFor();

        nsdcAdminPage.clickOnPublishedDate();

        nsdcAdminPage.selectThePublishedDate();

        nsdcAdminPage.clickOnDescription();

        nsdcAdminPage.enterMoreThanMaximumCharactersRequiredinAssessmentDescription();

        nsdcAdminPage.clearAndEnterTheMaximumCharactersRequriedInAssessmentDescription();
    }

    @Then("I verify user is not able to see the Published by details on the Assessment")
    public void i_verify_user_is_not_able_to_see_the_published_by_details_on_the_assessment(){
        nsdcAdminPage.clickOnMyAnnouncementsTwo();

        nsdcAdminPage.clickOnPending();

        nsdcAdminPage.verifyThePublishedByDetailsOnTheAssessment();
    }

    @Then("I verify NSDC Admin is able to create an Assessment and submit {string} {string} {int} {string}")
    public void i_verify_nsdc_admin_is_able_to_create_an_assessment_and_submit_trainer(String title, String publishedfor,Integer date, String dsecription) throws InterruptedException {


        nsdcAdminPage.clickOnCreateAnnouncement();

        nsdcAdminPage.clickOnAnnouncementTitleTextField();

        nsdcAdminPage.EnterTheAnnouncementTitle(title);

        nsdcAdminPage.selectPublishFor();

        nsdcAdminPage.clickOnAnnouncementTitleTextField();

        nsdcAdminPage.clickOnPublishedDate();

        nsdcAdminPage.selectThePublishedDate();

        nsdcAdminPage.clickOnDescription();

        nsdcAdminPage.enterDescription(dsecription);
        waitWebDriver(2000);

        nsdcAdminPage.uploadDocument();

        nsdcAdminPage.clickOnSubmit();

        Assert.assertTrue(isElementPresent(nsdcAdminPage.formSubmitMessage),"Form Submit message is not displayed");

        nsdcAdminPage.clickOnDoneButton();

    }

    @When("I verify all elements are displayed")
    public void i_verify_all_elements_are_displayed(){
        nsdcAdminPage.clickOnCreateAnnouncement();

        Assert.assertTrue(isElementPresent(nsdcAdminPage.TitleText),"TitleText is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(nsdcAdminPage.publishedfor),"publishedfor is not displayed");
        log.info("Partner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(nsdcAdminPage.publishedDate),"publishedDate is not displayed");

        Assert.assertTrue(isElementPresent(nsdcAdminPage.description),"Admin role is not displayed");

        Assert.assertTrue(isElementPresent(nsdcAdminPage.uploadfile),"uploadfile is not displayed");
        scrollToPageEnd();
        Assert.assertTrue(isElementPresent(nsdcAdminPage.submitButton),"submitButton is not displayed");

    }


    @When("I verify all validation on the title filed")
    public void i_verify_all_validation_on_the_title_filed(io.cucumber.datatable.DataTable dataTable){

        List<String> listData = dataTable.asList(String.class);
        nsdcAdminPage.clickOnCreateAnnouncement();
        nsdcAdminPage.clickOnAnnouncementTitleTextField();

        nsdcAdminPage.EnterTheAnnouncementTitle(listData.get(0));
        waitWebDriver(2000);
        nsdcAdminPage.clickOnCreateAnnouncementText();
        Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getAnnouncementTitleerrorMessage(),nsdcAdminPage.titleErrorMessage.getText());
        nsdcAdminPage.EnterTheAnnouncementTitle(listData.get(1));
        Assert.assertFalse(nsdcAdminPage.titleErrorMessageDisplayed());


    }


    @When("I verify all validation on the description filed")
    public void i_verify_all_validation_on_the_description_filed(io.cucumber.datatable.DataTable dataTable){

        List<String> listData = dataTable.asList(String.class);
        nsdcAdminPage.clickOnCreateAnnouncement();
        nsdcAdminPage.clickOnDescription();
        waitWebDriver(2000);
        nsdcAdminPage.enterDescription(listData.get(0));
        Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getAnnouncementDescriptionerrorMessage(),nsdcAdminPage.titleErrorMessage.getText());
        nsdcAdminPage.EnterTheAnnouncementTitle(listData.get(1));
        Assert.assertFalse(nsdcAdminPage.titleErrorMessageDisplayed());


    }
}
