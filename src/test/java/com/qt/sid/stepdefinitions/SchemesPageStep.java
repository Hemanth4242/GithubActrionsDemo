package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class SchemesPageStep extends BasePage{

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    SchemesPage schemesPage;
    PMKVYDashboardPage pMKVYDashboardPage;

    SchemeDetailsPage schemeDetailsPage;

    String parentWindowId;

    DashboardPage dashboardPage;

    ProfileDetailsPage profileDetailsPage;

    LoginPage loginPage;

    SkillCoursesPage skillCoursesPage;


    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public SchemesPageStep(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        schemesPage = testContext.getPageObjectManager().getSchemesPage();
        pMKVYDashboardPage = testContext.getPageObjectManager().getPMKYDHashboard();
        schemeDetailsPage = testContext.getPageObjectManager().getSchemeDetailsPage();
        dashboardPage = testContext.getPageObjectManager().getDashboardPage();
        profileDetailsPage = testContext.getPageObjectManager().getProfileDetailsPage();
        loginPage = testContext.getPageObjectManager().getLoginPage();
        skillCoursesPage = testContext.getPageObjectManager().getSkillCoursesPage();
    }

    @When("Click Schemes dropdown from the top menu")
    public void clickSchemesDropdownFromTheTopMenu() {
        homePage.clickOnSchemesLink();
    }


    @And("Click PMKVY tab")
    public void clickPMKVYTab() {
        schemesPage.clickPMKVYBtn();
    }

    @And("Click Analytics Dashboard tab")
    public void clickAnalyticsDashboardTab() {
        schemesPage.clickAnaliticDashboardTab();
        waitWebDriver(3000);
    }

    @And("Click {string} tab")
    public void clickTab(String tab) throws InterruptedException {
           schemesPage.clickOverviewTab();
           schemesPage.clickCandidatesTab();
           schemesPage.clickBatchesTab();
           schemesPage.clickTrainingCentreTab();

    }

    @Then("Click on all tabs of analytics dashboard")
    public void click_on_all_tabs_of_analytics_dashboard(){

        schemesPage.clickCandidatesTab();
        log.info("Clicked on Candidates tab");
        waitWebDriver(5000);

        schemesPage.clickBatchesTab();
        log.info("Clicked on Batches tab");
        waitWebDriver(5000);

        schemesPage.clickTrainingCentreTab();
        log.info("Clicked on Training centres tab");
        waitWebDriver(5000);

    }


    @Then("Verify the behavior of the each tab {string}")
    public void verifyTheBehaviorOfTheEachTab(String tab) {
        if(tab.equalsIgnoreCase("overview")) {
           Assert.assertTrue(pMKVYDashboardPage.verifyOverview());
        }else if(tab.equalsIgnoreCase("candidate")) {
            Assert.assertTrue(pMKVYDashboardPage.verifyCandidates());
        }else if(tab.equalsIgnoreCase("batches")) {
            Assert.assertTrue(pMKVYDashboardPage.verifyBatches());
            log.info("verify batches");
        }else if(tab.equalsIgnoreCase("traini centere")){
            Assert.assertTrue(pMKVYDashboardPage.verifyTrainingCentere());
        }
    }
    
    @Then("verify the All Schemes Page and click on Apply now")
    public void verify_the_all_schemes_page_and_click_on_apply_now() {
    	schemesPage.clickOnAllSchemes();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.schemesPageText),"user is not navigated to All schemes page");
    	log.info("User is navigated to All Schemes page");

        schemesPage.clickOnSchemeSearchAndSendValidKeyword();
    	
    	schemesPage.verifySchemeOptionForCoursePage();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.applyNowBtn),"Apply now button is not displayed");
    	log.info("Apply now button is displayed");
    	
    	
    }
    
    @Then("verify user navigated to courses page post clicking View All")
    public void verify_user_navigated_to_courses_page_post_clicking_view_all() {
    	schemesPage.scrollToViewAllSection();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.viewAllBtn),"View all button is not displayed");
    	log.info("View all button is displayed");
    	
    	schemesPage.clickOnViewAll();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.coursePageText),"User is not navigated to job roles page");
    	log.info("User is navigated to job roles page successfully");
    }
    
    @Then("verify user is able to navigate to learning resource page")
    public void verify_user_is_able_to_navigate_to_learning_resource_page() {
    	schemesPage.clickPMKVYBtn();
    	
    	schemesPage.clickOnBooks();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.learningResourcesPageText),"Learning resources page text is not displayed");
    	log.info("learning resource page text is displayed");
    	
    }
    
    @Then("Verify user able to apply content type filters in learning resouces page")
    public void verify_user_able_to_apply_content_type_filters_in_learning_resouces_page() {
    	schemesPage.clickOnSearchField();
    	
    	schemesPage.clickOnContentTypeFilter();
    	
    	schemesPage.selectVideoTypeContent();
    	
    	schemesPage.selectPDFTypeContent();
    	
    	schemesPage.clickOnContentTypeFilter();
    	
    	schemesPage.clickOnContentCategory();
    }
    
    @Then("Verify user able to apply content category and language filter and click on Reset button")
    public void verify_user_able_to_apply_content_category_and_language_filter_and_click_on_reset_button() {
    	schemesPage.clickOnContentCategory();
    	
    	schemesPage.clickOnLanguage();
    	scrollDown();
    	schemesPage.selectEnglishLanguage();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.learningResourceCard),"Learning resource card is not displayed");
    	log.info("Learning resource card is displayed for the applied filters");
    	
    	scrollDown();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.resetBtn),"Reset button is not displayed");
    	log.info("Reset button is displayed");
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);
    	schemesPage.clickOnResetBtn();
    }
    
    @Then("verify user is able to download and share the learning resource")
    public void verify_user_is_able_to_download_and_share_the_learning_resource() {
    	schemesPage.clickOnLearningResourceCard();
    	waitWebDriver(2000);
        scrollDown();
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(1000);
    	schemesPage.clickOnDownloadBtn();
        waitWebDriver(3000);
    	scrollUp();
        waitWebDriver(2000);
    	schemesPage.clickOnShareBtn();
    	
    	Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
    	log.info("Whatsapp link is displayed to share the learning resource");
    	
    	Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
    	log.info("Facebook link is displayed to share the learning resource");
    	
    	Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
    	log.info("Twitter link is displayed to share the learning resource");
    	
    	Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
    	log.info("LinkedIn link is displayed to share the learning resource");
    	
    	Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
    	log.info("Share link is displayed to share the learning resource");
    }


    @And("click on schemes")
    public void clickOnSchemes() {
        homePage.clickOnSkillIndiaLogo();
        waitWebDriver(3000);
        homePage.clickOnSchemesLink();
    }

    @Then("click on all schemes and verify that {string}")
    public void clickOnAllSchemesAndVerifyThat(String expected) {

        schemesPage.clickOnAllSchemes();
        Assert.assertEquals(schemesPage.checkSchemespage(),expected);
    }

    @Then("click on apply and verify that")
    public void clickOnApplyAndVerifyThat() {
        schemesPage.clickOnSchemeSearchAndSendValidKeyword();

        schemesPage.verifySchemeOptionForCoursePage();
        schemesPage.clickOnApllyBtn();
        Assert.assertTrue(isElementPresent(schemesPage.applyNowBtn),"Apply now button is not displayed");
        log.info("Apply now button is displayed");    }

    @Then("click on the applyNow button and verify that")
    public void clickOnTheApplyNowButtonAndVerifyThat() {

        schemeDetailsPage.clickOnApplyNowBtn();
        Assert.assertTrue(schemeDetailsPage.courseHeadingIsDisplayed(),"course heading is not displayed");
        log.info("course heading is not displayed");

    }

    @Then("click on courses and verify that")
    public void clickOnCoursesAndVerifyThat() {

        schemeDetailsPage.clickOnApplyOnCoursesBtn();
       // Assert.assertTrue(schemeDetailsPage.showInterestedBtnIsDisplayed(),"show interested button is not displayed");
      //  log.info("show interested button is not displayed");


    }


    @Then("navigate to the click on share button and verify that")
    public void navigateToTheClickOnShareButtonAndVerifyThat() {
       // schemesPage.clickOnApllyBtn();
        schemeDetailsPage.clickOnApplyNowBtn();
        schemeDetailsPage.clickOnShareBtn();
        Assert.assertTrue(schemeDetailsPage.shareHeadingIsDisplayed(),"share heading is not displayed");
        log.info("share heading is not displayed");
    }

    @Then("navigate to the click on share button")
    public void navigateToTheClickOnShareButton() {

        schemesPage.clickOnApllyBtn();
        schemeDetailsPage.clickOnApplyNowBtn();
        schemeDetailsPage.clickOnShareBtn();
    }


    @Then("click on whatsapp button {string} and verify redirected page")
    public void clickOnWhatsappButtonAndVerifyRedirectedPage(String Whatsapp) {

        parentWindowId =  getWindowHandle();
        schemeDetailsPage.clickOnWatsappBtn();
        Set<String> windowId = getWindowHandles();
        for (String childWindow:windowId){
            driver.switchTo().window(childWindow);
            if(switchToWindowBasedOnId(childWindow).getTitle().equalsIgnoreCase(Whatsapp)){
                break;
            }
        }

        Assert.assertTrue(schemeDetailsPage.watsappPageTextIsDisplayed(),"watsapp page text is not displayed");
        log.info("watsapp page text is not displayed");
        switchToWindowBasedOnId(parentWindowId);
    }


    @Then("click on facebook button {string} and verify redirected page")
    public void clickOnFacebookButtonAndVerifyRedirectedPage(String Facebook) {

        schemeDetailsPage.clickOnFacebookBtn();
        Set<String> windowId = getWindowHandles();
        for (String childWindow:windowId){
            driver.switchTo().window(childWindow);
            if(switchToWindowBasedOnId(childWindow).getTitle().equalsIgnoreCase(Facebook)){
                break;
            }
        }

        Assert.assertTrue(schemeDetailsPage.facebookPageIsDisplayed(),"facebook page text is not displayed");
        log.info("facebook page text is not displayed");
        switchToWindowBasedOnId(parentWindowId);

    }


    @Then("click on twitter button {string} and verify redirected page")
    public void clickOnTwitterButtonAndVerifyRedirectedPage(String Twitter) {

        schemeDetailsPage.clickOnTwitterBtn();
        Set<String> windowId = getWindowHandles();
        for (String childWindow:windowId){
            driver.switchTo().window(childWindow);
            if(switchToWindowBasedOnId(childWindow).getTitle().equalsIgnoreCase(Twitter)){
                break;
            }
        }
        Assert.assertTrue(schemeDetailsPage.twitterPageIsDisplayed(),"twitter page text is not displayed");
        log.info("twitter page text is not displayed");
        switchToWindowBasedOnId(parentWindowId);
    }


    @Then("click on linkedIn button {string} and verify redirected page")
    public void clickOnLinkedInButtonAndVerifyRedirectedPage(String LinkedIn) {

        schemeDetailsPage.clickOnLinkedInBtn();
        Set<String> windowId = getWindowHandles();
        for (String childWindow:windowId){
            driver.switchTo().window(childWindow);
            if(switchToWindowBasedOnId(childWindow).getTitle().equalsIgnoreCase(LinkedIn)){
                break;
            }
        }
        Assert.assertTrue(schemeDetailsPage.linkedInPageIsDisplayed(),"linkedIn page text is not displayed");
        log.info("linkedIn page text is not displayed");
        switchToWindowBasedOnId(parentWindowId);
    }

    @Then("click on copied button and verify that")
    public void clickOnCopiedButtonAndVerifyThat() {
        schemeDetailsPage.clickOnCopyLinkBtn();
        Assert.assertTrue(schemeDetailsPage.verifyCopyLinkedText(),"copied Linked page text is not displayed");
        log.info("copied Linked  page text is not displayed");

    }

    @And("click on schemes and click on all schemes")
    public void clickOnSchemesAndClickOnAllSchemes() {
        homePage.clickOnSchemesLink();
        schemesPage.clickOnAllSchemes();
    }


    @And("click on schemes and click on PMKVY and click on dashboard")
    public void clickOnSchemesAndClickOnPMKVYAndClickOnDashboard() {

        homePage.clickOnSchemesLink();
        schemesPage.clickPMKVYBtn();
        schemesPage.clickOnDashboardTab();
        waitWebDriver(10000);
    }

    @Then("click on application and verify that")
    public void clickOnApplicationAndVerifyThat() {
        dashboardPage.clickOnApplicationBtn();
        Assert.assertTrue(dashboardPage.applicationCardIsDisplayed(),"application card is not displayed");
        log.info("application card is not displayed");

    }

    @Then("click on view all and verify that")
    public void clickOnViewAllAndVerifyThat() {
        dashboardPage.clickOnViewAllBtn();
        Assert.assertTrue(dashboardPage.viewApplicationPageTitleIsDisplayed(),"view Application page title is not displayed");
        log.info("view Application page title is not displayed");

    }

    @Then("click on view application and verify that")
    public void clickOnViewApplicationAndVerifyThat() {
        dashboardPage.clickOnViewApplicationBtn();
        Assert.assertTrue(dashboardPage.viewApplicationPageTitleIsDisplayed(),"view Application page title is not displayed");
        log.info("view Application page title is not displayed");
    }

    @Then("click on accepted and verify that {string}")
    public void clickOnAcceptedAndVerifyThat(String expected) {
        dashboardPage.clickOnAcceptedBtn();
        Assert.assertTrue(dashboardPage.noRecordIsDisplayed(),"No Record is not displayed");
        log.info("No Record is not displayed");

    }

    @Then("click on rejected and verify that")
    public void clickOnRejectedAndVerifyThat() {
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);
        dashboardPage.clickOnRejectBtn();
        Assert.assertTrue(dashboardPage.noRecordIsDisplayed(),"No Record is not displayed");
        log.info("No Record  is not displayed");


    }


    @Then("click on history and verify that {string}")
    public void clickOnHistoryAndVerifyThat(String expected) {

        dashboardPage.clickOnHistoryBtn();
        waitWebDriver(2000);
        scrollDown();
        waitWebDriver(2000);
        Assert.assertEquals(dashboardPage.getPendingText(),expected,"pending text is not visible");
        log.info("pending text is not visible");

    }

    @Then("i verify that sort AtoZ {string} and verify that sort ZtoA {string}")
    public void iVerifyThatSortAtoZAndVerifyThatSortZtoA(String expected1, String expected2) throws InterruptedException {

        dashboardPage.clickOnHistoryBtn();
        dashboardPage.clickOnSortBtn();
        dashboardPage.clickOnAtoZBtn();
      //  Assert.assertTrue(dashboardPage.getTextOfZtoACard().startsWith(expected2),"card text is not start with A");
        log.info("card text is not start with A");

        dashboardPage.clickOnSortBtn();
        dashboardPage.clickOnZtoABtn();
      //  Assert.assertTrue(dashboardPage.getTextOfZtoACard().startsWith(expected2),"card text is not start with O");
        log.info("card text is not start with O");



    }


    @Then("i should able to search the record {string} and verify that {string} and also verify that reset button")
    public void iShouldAbleToSearchTheRecordAndVerifyThatAndAlsoVerifyThatResetButton(String sendKeys, String expected) throws InterruptedException {

        dashboardPage.clickOnApplicationBtn();
        dashboardPage.clickOnViewApplicationBtn();
        dashboardPage.sendKeyOnSearchTextField(sendKeys);
        dashboardPage.clickOnSearchBtn();
        Assert.assertEquals(dashboardPage.getTextOfOfficeAssesmentCard(),expected,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnResetBtn();
        Assert.assertEquals(dashboardPage.getTextOfGeneralCard(),expected,"card text is not matched");
        log.info("card text is not matched");




    }

    @Then("i should able to search courses and verify that {string}")
    public void iShouldAbleToSearchCoursesAndVerifyThat(String expected) throws InterruptedException {
        dashboardPage.clickOnCourseFilter();
        dashboardPage.clickOnOfficeAssismentCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfOfficeAssesmentCard(),expected,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnOfficeAssismentCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfOfficeAssesmentCard(),expected,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnDesinerDieCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfGeneralCard(),expected,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnResetBtn();



    }


    @Then("i should able to search courses and verify that {string},{string}")
    public void iShouldAbleToSearchCoursesAndVerifyThat(String expected1, String expected2) {

        dashboardPage.clickOnCourseFilter();
        dashboardPage.clickOnOfficeAssismentCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfOfficeAssesmentCard(),expected1,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnOfficeAssismentCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfOfficeAssesmentCard(),expected1,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnDesinerDieCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfGeneralCard(),expected2,"card text is not matched");
        log.info("card text is not matched");
        dashboardPage.clickOnResetBtn();
    }

    @Then("click on schemes filter and select checkbox and verify that {string}")
    public void clickOnSchemesFilterAndSelectCheckboxAndVerifyThat(String expected) {

        dashboardPage.clickOnSchemesFilter();
        dashboardPage.clickOnPMKVYCheckbox();
        Assert.assertEquals(dashboardPage.getTextOfGeneralCard(),expected,"card text is not matched");
        log.info("card text is not matched");


    }

    @Then("i click on one scheme option")
    public void iClickOnOneSchemeOption() {
        schemesPage.verifySchemeOption();
    }


    @Then("I click on applyNow button and course name")
    public void iClickOnApplyNowButtonAndCourseName() {
        schemesPage.verifyApplyNowButton();
    }


    @Then("I click on view details button and verified the course key feature")
    public void iClickOnViewDetailsButtonAndVerifiedTheCourseKeyFeature() {
        schemesPage.verifyViewDetailsButton();
        Assert.assertTrue(schemesPage.verifyApplyNow());
    }


    @Then("I click on view details and apply button")
    public void iClickOnViewDetailsAndApplyButton() {
        schemesPage.verifyViewDetailsAndApplyNowButton();
    }


    @Then("I verified the show interest page")
    public void iVerifiedTheShowInterestPage() {
        schemesPage.verifyRegularCheckBoxAndShowInterestButton();
    }


    @Then("I verified the start date dropdown")
    public void iVerifiedTheStartDateDropdown() {
        scrollDown();
        waitWebDriver(2000);
        schemesPage.verifyStartDateDropDown();
    }


    @Then("I verified the sub scheme filter")
    public void iVerifiedTheSubSchemeFilter() {
        schemesPage.verifySubSchemeOption();
    }


    @Then("I verified state dropdown filter")
    public void iVerifiedStateDropdownFilter() {
        schemesPage.verifyStateDropDown();
    }


    @Then("I verified the district dropdown")
    public void iVerifiedTheDistrictDropdown() {
        schemesPage.verifyDistrictDropDown();
    }


    @Then("I verified that show interest option is disabled")
    public void iVerifiedThatShowInterestOptionIsDisabled() {

        Assert.assertTrue(!isElementPresent(schemesPage.selectedBatchesText),"Selected batches text is displayed");

        Assert.assertTrue(!isElementPresent(schemesPage.showInterestButton),"Show Interest button is displayed");
        log.info("Show interest button is not displayed");


    }

    @Then("I verified show interest button is enabled")
    public void iVerifiedShowInterestButtonIsEnabled() {
        Assert.assertTrue(schemesPage.verifyShowInterestButtonIsEnabled());
    }


    @Then("I verified batch check box is unselected")
    public void iVerifiedBatchCheckBoxIsUnselected() {
        Assert.assertFalse(schemesPage.verifyBatchBox());
    }

    @Then("I verified the batch details box is displayed")
    public void iVerifiedTheBatchDetailsBoxIsDisplayed() {
        Assert.assertTrue(schemesPage.verifyBatchDetailsBox());
    }

    @Then("Verify click on skill courses under Recommendations for you")
    public void verifyClickOnSkillCoursesUnderRecommendationsForYou() throws InterruptedException {

        dashboardPage.clickOnSkillCoursesNearRecommendation();
        Assert.assertTrue(dashboardPage.skillCardIsDisplayed(), "Skill card is not displayed");
        log.info("Skill card is not displayed");

    }

    @Then("Verify click on job exchange under Recommendations for you")
    public void verifyClickOnJobExchangeUnderRecommendationsForYou() throws InterruptedException {
        dashboardPage.clickOnJobExchangeNearRecommendation();
        Assert.assertTrue(dashboardPage.jobExchangeCardIsDisplayed(), "Job card is not displayed");
        log.info("Job card is not displayed");

    }

    @Then("Verify click on skill centre under Recommendations for you")
    public void verifyClickOnSkillCentreUnderRecommendationsForYou() throws InterruptedException {
        dashboardPage.clickOnSkillCentreNearRecommendation();
        for (Boolean card : dashboardPage.skillCentreIsDisplayed()) {
            Assert.assertTrue(card, "skill centre card is not displayed");
            log.info("skill centre card is not displayed");
        }
    }


    @Then("Verify click on ebooks under Recommendations for you")
    public void verifyClickOnEbooksUnderRecommendationsForYou() throws InterruptedException {
        dashboardPage.clickOneBookNearRecommendation();
        for (Boolean card : dashboardPage.eBookCoursesCardIsDisplayed()) {
            Assert.assertTrue(card, "eBook card is not displayed");
            log.info("eBook card is not displayed");
        }
    }

    @Then("Verify summary under dashboard")
    public void verifySummaryUnderDashboard() {
        dashboardPage.scrollTillSummryElement();
        for (Boolean card : dashboardPage.allSummryCoursesDisplayed()) {
            Assert.assertTrue(card, "summary card is not displayed");
            log.info("summary card is not displayed");
        }

    }

    @Then("Verify my credits under dashboard")
    public void verifyMyCreditsUnderDashboard() {
        dashboardPage.scrollTillMyCredit();
        for (Boolean card : dashboardPage.allMyCreditCardDisplayed()) {
            Assert.assertTrue(card, "My Credit card is not displayed");
            log.info("My Credit card is not displayed");
        }
    }

    @Then("Verify your adhaar kyc is complete font colour {string}")
    public void verifyYourAdhaarKycIsCompleteFontColour(String color) {
        Assert.assertEquals(dashboardPage.getColourOfEKYCText(), color, "color is not matched");
        log.info("color is not matched");

    }

    @Then("Verify font color EDIT button {string}")
    public void verifyFontColorEDITButton(String color) {
        Assert.assertEquals(dashboardPage.getColourOfEditBtn(), color, "color is not matched");
        log.info("color is not matched");

    }

    @Then("Verify click on EDIT button")
    public void verifyClickOnEDITButton() {
        dashboardPage.clickOnEditBtn();
        Assert.assertTrue(profileDetailsPage.profilrDetailsPageIsDisplayed(), "color is not matched");
        log.info("color is not matched");
    }


    @Then("Verify photo encircle based on the percentage of profile completed {string}")
    public void verifyPhotoEncircleBasedOnThePercentageOfProfileCompleted(String tagName) {
        Assert.assertEquals(profileDetailsPage.getTagNameOfProfileImage(), tagName, " profile image is not present");
        log.info("profile image is not present");

    }

    @Then("Verify clicking on share icon on edit profile page")
    public void verifyClickingOnShareIconOnEditProfilePage() {
        profileDetailsPage.clickOnShareBtn();
        Assert.assertTrue(profileDetailsPage.sharaPageIsDisplayed(), " share page  is not displayed");
        log.info("share page  is not displayed");

    }

    @Then("Verify edit and delete icon for the address on edit profile page")
    public void verifyEditAndDeleteIconForTheAddressOnEditProfilePage() throws InterruptedException {

        profileDetailsPage.clickOnEditBtn();
        Assert.assertTrue(profileDetailsPage.editPageTextIsDisplayed(), " edit page  is not displayed");
        log.info("edit page  is not displayed");
        profileDetailsPage.clickOnDeleteBtn();
        Assert.assertTrue(profileDetailsPage.deletePageIsDisplayed(), " delete page  is not displayed");
        log.info("delete page  is not displayed");


    }


    @Then("click on add address button on profile")
    public void clickOnAddAddressButtonOnProfile() throws InterruptedException {
        dashboardPage.clickOnEditBtn();
        profileDetailsPage.clickOnAddAdressBtn();

    }

    @Then("Verify click on update button without changing the address")
    public void verifyClickOnUpdateButtonWithoutChangingTheAddress() throws InterruptedException {
        profileDetailsPage.clickOnUpdateBtn();
        Assert.assertTrue(profileDetailsPage.profilrDetailsPageIsDisplayed(), " update  is not completed");
        log.info("update  is not completed");
    }


    @Then("Verify editing address line first {string}")
    public void verifyEditingAddressLineFirst(String key) throws InterruptedException {
        profileDetailsPage.sendAddressLine1(key);
    }

    @Then("Verify editing address line second {string}")
    public void verifyEditingAddressLineSecond(String key) {
        profileDetailsPage.sendAddressLine2(key);
    }

    @Then("Verify editing state")
    public void verifyEditingState() throws InterruptedException {
        profileDetailsPage.clickStateDropDown();
        profileDetailsPage.selectState();
    }

    @Then("Verify editing district")
    public void verifyEditingDistrict() throws InterruptedException {

      /*  profileDetailsPage.clickDistrictDropDown();
        profileDetailsPage.selectDistrict();*/
    }

    @Then("Verify editing block")
    public void verifyEditingBlock() {

      /*  profileDetailsPage.clickOnBlockDropDown();
        profileDetailsPage.selectBlock();*/
    }


    @Then("Verify editing pincode {string}")
    public void verifyEditingPincode(String key) {

     /*   profileDetailsPage.sendPincode(key);*/
    }

    @Then("Verify editing city {string}")
    public void verifyEditingCity(String key) {

      /*  profileDetailsPage.sendCityAndVillage(key);*/
    }

    @Then("Verify above all the text field {string}")
    public void verifyAboveAllTheTextField(String expected) throws InterruptedException {


       /* profileDetailsPage.clickOnUpdateBtn();
        Thread.sleep(4000);
        System.out.println("==================" + profileDetailsPage.getTextUpdatedAdress());
        Assert.assertTrue(profileDetailsPage.getTextUpdatedAdress().contains(expected), " update address  is not matched");
        log.info("update address  is not matched");*/
    }

    @Then("verify that delete address")
    public void verifyThatDeleteAddress() {
        // dashboardPage.clickOnEditBtn();
        profileDetailsPage.clickOnDeleteBtn();
        profileDetailsPage.clickOnYesBtn();
        profileDetailsPage.clickOnDeleteBtn();
        profileDetailsPage.clickOnYesBtn();
        Assert.assertTrue(profileDetailsPage.addressBtnIsDisplayed(), " address is not deleted  ");
        log.info(" address is not deleted ");


    }


    @Then("Verify clicking on update button with empty mandatory fields {string},{string}")
    public void verifyClickingOnUpdateButtonWithEmptyMandatoryFields(String adressLine2, String expected) throws InterruptedException {

       /* profileDetailsPage.clickOnEditBtn();
        profileDetailsPage.sendAddressLine2(adressLine2);
        profileDetailsPage.clickOnUpdateBtn();
        Assert.assertTrue(profileDetailsPage.getTextUpdatedAdress().contains(adressLine2), " address is not deleted  ");
        log.info(" address is not deleted ");*/

    }


    @Then("Verify clicking on update button with empty non mandatory fields {string},{string},{string}")
    public void verifyClickingOnUpdateButtonWithEmptyNonMandatoryFields(String addressLine1, String pincode, String city) throws InterruptedException {


       /* profileDetailsPage.sendAddressLine1(addressLine1);
        profileDetailsPage.clickOnBlockDropDown();
        profileDetailsPage.clickStateDropDown();
        profileDetailsPage.selectState();
        profileDetailsPage.clickDistrictDropDown();
        profileDetailsPage.selectDistrict();
        profileDetailsPage.sendPincode(pincode);
        profileDetailsPage.sendCityAndVillage(city);
        profileDetailsPage.clickOnUpdateBtn();
        System.out.println("=====================" + profileDetailsPage.getTextUpdatedAdress());
        Assert.assertTrue(profileDetailsPage.getTextUpdatedAdress().contains(addressLine1), " manadatry field is not updated successfully ");
        log.info(" manadatry field is not updated successfully ");*/

    }


    @Then("click on edit button on dashboard and click on edit button on profile")
    public void clickOnEditButtonOnDashboardAndClickOnEditButtonOnProfile() throws InterruptedException {
        dashboardPage.clickOnEditBtn();
      //  profileDetailsPage.clickOnEditBtn();
        profileDetailsPage.clickOnAddAddress();

    }

    @Then("Verify clicking on language in side menu of user profile")
    public void verifyClickingOnLanguageInSideMenuOfUserProfile() throws InterruptedException {
        dashboardPage.clickOnEditBtn();
        profileDetailsPage.clickoNLanguageBtn();
        Assert.assertTrue(profileDetailsPage.languageTextIsDisplayed(), profileDetailsPage.languageTextIsDisplayed()+" is not displayed");
        log.info(profileDetailsPage.languageTextIsDisplayed()+ "is not displayed");
    }

    @Then("Verify selecting any language under read")
    public void verifySelectingAnyLanguageUnderRead() throws InterruptedException {
        profileDetailsPage.englishCheckBoxIsSelected();
        profileDetailsPage.clickOnSaveBtn();
        Assert.assertTrue(profileDetailsPage.languageSelectedTextIsDisplyed(), profileDetailsPage.languageSelectedTextIsDisplyed()+" is not displayed");
        log.info(profileDetailsPage.languageSelectedTextIsDisplyed()+ "is displayed");

    }

    @Then("I verify share option is available on user profile page")
    public void i_verify_share_option_is_available_on_user_profile_page(){
        homePage.clickOnSchemesLink();
        schemesPage.clickPMKVYBtn();
        schemesPage.clickOnDashabord();
        dashboardPage.clickOnEditBtn();

        Assert.assertTrue(isElementPresent(schemesPage.userProfilePageText),"User profile page text is not displayed");
        log.info("User profile page text is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.shareOption),"Share option is not available on user profile page");
        log.info("Share option is available on user profile page");
    }

    @Then("I verify user navigated to register page")
    public void i_verify_user_navigated_to_register_page(){
        clickPMKVYTab();

        schemesPage.clickOnRegisterButton();

        Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
        log.info("Welcome to Skill India Digital text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.termsAndConditionsLinkInWelcomePopup),"Terms and conditions hyperlink is not displayed");
        log.info("Terms and conditions hyperlink is displayed in welcome popup");

        Assert.assertTrue(isElementPresent(loginPage.privacyPolicyLinkInWelcomePopup),"Privacy policy hyperlink is not displayed ");
        log.info("Privacy policy hyperlink is displayed in welcome popup");

    }

    @Then("I verify user able to click on PMKVY and access all sections of PMKVY")
    public void i_verify_user_able_to_click_on_pmkvy_and_access_all_sections_of_pmkvy(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSchemesLink();
        schemesPage.clickPMKVYBtn();
        log.info("User is able to click on PMKVY successfully");

        schemesPage.clickOnCourses();

        Assert.assertTrue(isElementPresent(schemesPage.skillCoursesLink),"User is not navigated to Skill courses page");
        log.info("User is navigated to Skill Courses Page");
        homePage.clickOnSkillIndiaLogo();
        homePage.clickOnSchemesLink();
        schemesPage.clickPMKVYBtn();

        schemesPage.clickOnCentres();
        Assert.assertTrue(isElementPresent(schemesPage.skillCentresLink),"User is not navigated to Skill Centres page");
        log.info("User is navigated to Skill Centres Page");
        homePage.clickOnSkillIndiaLogo();
        homePage.clickOnSchemesLink();
        schemesPage.clickPMKVYBtn();
        schemesPage.clickOnBooks();
        Assert.assertTrue(isElementPresent(schemesPage.learningResourcesLink),"User is not navigated to Learning Resources page");
        log.info("User is navigated to Learning Resources Page");
        homePage.clickOnSkillIndiaLogo();
        homePage.clickOnSchemesLink();
        schemesPage.clickPMKVYBtn();

        schemesPage.clickOnAnalyticDashboard();
       // Assert.assertTrue(isElementPresent(schemesPage.analyticsDashboardImage),"User is not navigated to Analytics Dashboard page");
        log.info("User is navigated to Analytics Dashboard  Page");


    }

    @Then("I verify scheme filters functionality are working fine")
    public void i_verify_scheme_filters_functionality_are_working_fine(){
        schemesPage.enterSectorInSearchField();

        schemesPage.clickOnSearchedSector();

        schemesPage.clickOnSectorFilter();

        schemesPage.clickOnMinistryFilter();

        schemesPage.enterMinistryInSearchField();

        schemesPage.scrollTillSearchedMinistry();

        schemesPage.clickOnSearchedMinistry();

        schemesPage.clickOnMinistryFilter();

        schemesPage.scrollTillSkillingProgramFilter();

        schemesPage.clickOnSkillProgramFilter();

        schemesPage.enterTheSkillProgramInSearchField();

        schemesPage.clickOnSearchedSkillingProgram();

        schemesPage.clickOnSkillProgramFilter();

        Assert.assertTrue(isElementPresent(schemesPage.schemeCardPostFilter),"Scheme card is not displayed");
        log.info("Scheme card is displayed");

    }

    @Then("I verify Reset filter functionality working fine")
    public void i_verify_reset_filter_functionality_working_fine(){
        scrollDown();

        schemesPage.clickOnResetFilter();

        Assert.assertTrue(isElementPresent(schemesPage.schemeCardPostFilter),"Scheme card is not displayed");
        log.info("Scheme card is displayed");
    }

    @Then("I verified schemes are sorted in descending order")
    public void iVerifiedSchemesAreSortedInDeccendingOrder() {
        schemesPage.clickOnSortSchemeButton();

        schemesPage.clickOnZtoASortOption();

        char result1= schemesPage.verifyFirstSchemeFirstCharacter();
        char result2=schemesPage.verifySecondSchemeFirstCharacter();
        Assert.assertTrue(result1>=result2);
    }

    @Then("I verified schemes are sorted in ascending order")
    public void iVerifiedSchemesAreSortedInAccendingOrder() {
        schemesPage.clickOnSortSchemeButton();

        schemesPage.clickOnAtoZSortOption();

        char cr1 =schemesPage.verifyFirstSchemeFirstCharacter();
        char cr2 =schemesPage.verifySecondSchemeFirstCharacter();
        Assert.assertTrue(cr1<=cr2);
    }

    @Then("I verify share option of the scheme and cross option of the scheme")
    public void i_verify_share_option_of_the_scheme_and_cross_option_of_the_scheme(){

        schemesPage.clickOnShareOptionOfTheScheme();

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Scheme");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Scheme");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Scheme");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Scheme");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Scheme");

        schemesPage.clickOnCrossOptionOfSchemeShare();

        Assert.assertTrue(!isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Share option closed successfully");
    }

    @Then("I verify user is able to click on Page number in Skilling Program")
    public void i_verify_user_is_able_to_click_on_page_number_in_skilling_program(){
        Assert.assertTrue(isElementPresent(schemesPage.schemeCard),"Schemes cards are not displayed");
        log.info("Schemes card is displayed");

        skillCoursesPage.clickOnThirdPageNumber();

        Assert.assertTrue(isElementPresent(schemesPage.schemeCard),"Schemes cards are not displayed");
        log.info("Schemes card is displayed");

        skillCoursesPage.verifyColorOfTheSelectedPageNumber();

    }

    @Then("I verify user is able to see all the details of the Scheme card")
    public void i_verify_user_is_able_to_see_all_the_details_of_the_scheme_card(){
        schemesPage.clickOnSchemeCard();

        Assert.assertTrue(isElementPresent(schemesPage.schemeName),"Scheme Name is not displayed");
        log.info("Scheme Name is : " + getTextOfObject(schemesPage.schemeName));

        Assert.assertTrue(isElementPresent(schemesPage.ministryName),"Ministry Name is not displayed");
        log.info("Ministry Name is : " + getTextOfObject(schemesPage.ministryName));

        Assert.assertTrue(isElementPresent(schemesPage.subSchemeName),"Scheme Scheme Name is not displayed");
        log.info("Sub Scheme Name is : " + getTextOfObject(schemesPage.subSchemeName));

        Assert.assertTrue(isElementPresent(schemesPage.sectorName),"Sector Name is not displayed");
        log.info("Sector Name is : " + getTextOfObject(schemesPage.sectorName));

        Assert.assertTrue(isElementPresent(schemesPage.applyNowBtn),"Apply Now button is not displayed");
        log.info("Button Name is : " + getTextOfObject(schemesPage.applyNowBtn));
    }

    @Then("I verify All Scheme Details for any one scheme")
    public void i_verify_all_scheme_details_for_any_one_scheme(){
        Assert.assertTrue(isElementPresent(schemesPage.schemeName),"Scheme Name is not displayed");
        log.info("Scheme Name is : " + getTextOfObject(schemesPage.schemeName));

        Assert.assertTrue(isElementPresent(schemesPage.ministryNameInScheme),"Ministry Name is not displayed");
        log.info("Ministry Name is : " + getTextOfObject(schemesPage.ministryNameInScheme));

        Assert.assertTrue(isElementPresent(schemesPage.subSchemeName),"Scheme Scheme Name is not displayed");
        log.info("Sub Scheme Name is : " + getTextOfObject(schemesPage.subSchemeName));

        Assert.assertTrue(isElementPresent(schemesPage.sectorName),"Sector Name is not displayed");
        log.info("Sector Name is : " + getTextOfObject(schemesPage.sectorName));

        Assert.assertTrue(isElementPresent(schemesPage.applyNowBtn),"Apply Now button is not displayed");
        log.info("Button Name is : " + getTextOfObject(schemesPage.applyNowBtn));
    }

    @Then("I verify Sectors popup and Cross Option functionality")
    public void i_verify_sectors_popup_and_cross_option_functionality(){
        schemesPage.clickOnSectorMoreButton();

        Assert.assertTrue(isElementPresent(schemesPage.sectorDialoguePopup),"Sectors list popup is not displayed");
        log.info("Sectors list popup is displayed");

        scrollDown();
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);

        schemesPage.clickOnCrossIconOfPopup();

        Assert.assertTrue(!isElementPresent(schemesPage.sectorDialoguePopup),"Sectors list popup is displayed");
        log.info("Sectors list popup is not displayed");
    }

    @Then("I verify user is able to access NSDC Academy from Schemes Dropdown")
    public void i_verify_user_is_able_to_access_nsdc_academy_from_schemes_dropdown(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSchemesLink();

        schemesPage.clickOnNSDCAcademy();

        Assert.assertTrue(isElementPresent(schemesPage.nsdcIconInSkillCoursePage),"User is not navigated to NSDC Academy page");
        log.info("User is navigated to NSDC Academy page");

        schemesPage.clickOnApplyButton();

        Assert.assertTrue(isElementPresent(schemesPage.selectBatchesText),"Select Batches text is not displayed");
        log.info("Select Batches text is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.batchIDColumn),"Batch Id column is not displayed");
        log.info("Batch Id column is displayed");
    }

}
