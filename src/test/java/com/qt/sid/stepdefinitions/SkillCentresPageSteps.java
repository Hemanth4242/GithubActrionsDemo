package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;

import com.qt.sid.bdd.utils.FileReaderManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qt.sid.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;


import java.time.Duration;
import java.util.List;

public class SkillCentresPageSteps extends BasePage{

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


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public SkillCentresPageSteps(TestContext context) {
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
        




    }

        @Then("I verify navigated to skill centre page")
        public void i_verify_navigated_to_skill_centre_page() {
        	skillCentrepage.clickOnSkillCentres();
        	
        	skillCentrepage.navigatedToSkillCentresPage();
        	
        	Assert.assertTrue(isElementPresent(skillCentrepage.skillCentrePageText),"User is not navigated to Skill centre page");
        	log.info("User is successfully navigated to skill centre page");
        	
        }
        
        
        @Then("I verify jobcards displayed for all sections of skill centres")
        public void i_verify_jobcards_displayed_for_all_sections_of_skill_centres() {
        	skillCentrepage.clickOnITI();
        	
        	skillCentrepage.visibilityOfContentCard();
        	log.info("ITI card details is displayed");
        	skillCentrepage.clickOnJSS();
        	
        	skillCentrepage.visibilityOfContentCard();
        	log.info("JSS card details is displayed");
        	skillCentrepage.clickOnPMKVYSection();
        	
        	skillCentrepage.visibilityOfContentCard();
        	log.info("PMKVY card details is displayed");
        	skillCentrepage.clickOnSkillIndiaCentres();
        	
        	skillCentrepage.visibilityOfContentCard();
        	log.info("Skill india centres card details is displayed");
        }
        
        
        @Then("I verify learner is able to apply location filter industry filter and course filter")
        public void i_verify_learner_is_able_to_apply_location_filter_industry_filter_and_course_filter() {
        	skillCentrepage.clickOnLocationSearchField();
        	
            skillCentrepage.enterStateValueInLocationFilter();
        	
        	skillCentrepage.selectStateFromLocation();
        	
        	skillCentrepage.clickOnLocationFilter();
        	
        	skillCentrepage.clickOnIndustryFilter();
        	
        	skillCentrepage.selectIndustry();
        	
        	skillCentrepage.clickOnIndustryFilter();

            scrollDown();
            waitWebDriver(2000);
            scrollUp();
        	
        	skillCentrepage.clickOnCoursesFilter();
        	
        	skillCentrepage.clickOnCourseSearchField();
        	
        	skillCentrepage.enterCourseValueInCourseFilter();
        	
        	skillCentrepage.selectCourse();
        	
        	skillCentrepage.clickOnCoursesFilter();

            //skillCentrepage.clickOnApplyBtn();
        	
        	Assert.assertTrue(isElementPresent(skillCentrepage.cardDetails),"Filters not applied properly");
        	log.info("Filters applied successfully");
        		
        }
        
        @Then("I verify learner is able to reset the applied filters")
        public void i_verify_learner_is_able_to_reset_the_applied_filters() {

        	scrollDown();
        	
        	skillCentrepage.clickOnResetBtn();
        }

        
        @Then("I verify search functionality and sort functionality")
        public void i_verify_search_functionality_and_sort_functionality() {
        	skillCentrepage.clickOnSortBtn();
        	
        	skillCentrepage.selectSortZtoA();
        	
        	Assert.assertTrue(isElementPresent(skillCentrepage.cardDetails),"Skill centre page is not sorted from z to a");
        	log.info("Skill centre page is sorted from a to z ");
        	
            skillCentrepage.clickOnSortBtn();
        	
        	skillCentrepage.selectSortAtoZ();
        	
        	Assert.assertTrue(isElementPresent(skillCentrepage.cardDetails),"Skill centre page is not sorted from z to a");
        	log.info("Skill centre page is sorted from a to z ");
        	
        	
        	skillCentrepage.clickOnSkillCentreSearchField();
        	
        	skillCentrepage.enterSkillCentreValueFromConfig();
        	
        	Assert.assertTrue(isElementPresent(skillCentrepage.cardDetails),"Search field is not working properly");
        	log.info("Search functionality is working properly");
        	
        }


        @Then("I verify Location and Interest Area section in Skill Centre page")
        public void i_verify_location_and_interest_area_section_in_skill_centre_page(){
            skillCentrepage.clickOnLocationFilter();

            Assert.assertTrue(isElementPresent(skillCentrepage.locationFilter),"Location filter is not displayed");
            log.info("Location filter is displayed in Skill Centre page");

            Assert.assertTrue(isElementPresent(skillCentrepage.industryFilter),"Interest Area filter is not displayed below location filter");
            log.info("Interest Area filter is displayed below Location filter");

        }


        @Then("I verify color of location radio button post selecting radio button")
        public void i_verify_color_of_location_radio_button_post_selecting_radio_button(){
            skillCentrepage.clickOnLocationFilter();

            skillCentrepage.clickOnRadioButtonInLocation();

            skillCentrepage.verifyOrangeColorOfSelectedRadioButton();

            skillCentrepage.clickOnLocationFilter();

            scrollToElement(skillCentrepage.resetBtn);
            scrollUp();

            skillCentrepage.verifyResetButtonColor();

        }

        @Then("I verify all the information available on the ITI card in Skill Centre page")
        public void i_verify_all_the_information_available_on_the_iti_card_in_skill_centre_page(){
            skillCentrepage.clickOnITI();

            Assert.assertTrue(isElementPresent(skillCentrepage.locationIconOnCard),"Location icon is not displayed on the card");
            log.info("Location icon is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.shareIconOnCard),"Share icon is not displayed on the card");
            log.info("Share icon is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.favoriteIconOnCard),"favorite icon is not displayed on the card");
            log.info("Favorite icon is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.centreAndLocationNameOnCard),"Centre and location name is not displayed on the card");
            log.info("Centre and Location name is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.emailOnCard),"Email ID is not displayed on the card");
            log.info("Email ID is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.phoneNumberOnCard),"Phone number is not displayed on the card");
            log.info("Phone number is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.coursesOfferedOnCard),"Courses offered option is not displayed on the card");
            log.info("Courses Offered option is displayed on the card");
            Assert.assertTrue(isElementPresent(skillCentrepage.viewDetailsOnCard),"View Details option is not displayed on the card");
            log.info("View Details option is displayed on the card");


        }

    @Then("I verify all the information available on the Skill India Center card in Skill Centre page")
    public void i_verify_all_the_information_available_on_the_skill_india_center_card_in_skill_centre_page(){
        skillCentrepage.clickOnSkillIndiaCentres();

        Assert.assertTrue(isElementPresent(skillCentrepage.locationIconOnCard),"Location icon is not displayed on the card");
        log.info("Location icon is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.shareIconOnCard),"Share icon is not displayed on the card");
        log.info("Share icon is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteIconOnCard),"favorite icon is not displayed on the card");
        log.info("Favorite icon is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.centreAndLocationNameOnCard),"Centre and location name is not displayed on the card");
        log.info("Centre and Location name is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.emailOnCard),"Email ID is not displayed on the card");
        log.info("Email ID is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.phoneNumberOnCard),"Phone number is not displayed on the card");
        log.info("Phone number is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.coursesOfferedOnCard),"Courses offered option is not displayed on the card");
        log.info("Courses Offered option is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.viewDetailsOnCard),"View Details option is not displayed on the card");
        log.info("View Details option is displayed on the card");


    }

    @Then("I verify user is able navigate to next page and previous page by clicking pagination arrows")
    public void i_verify_user_is_able_navigate_to_next_page_and_previous_page_by_clicking_pagination_arrows(){
        skillCentrepage.verifyFirstPageNumberColorHighlighted();

        skillCentrepage.verifyUserNavigatedToNextPagePostClickingRightArrow();

        skillCentrepage.verifyUserNavigatesBackToPreviousPage();

        skillCentrepage.verifyFirstPageNumberColorHighlighted();

    }



    @Then("I verify User is navigated to particular page number in pagination")
    public void i_verify_user_is_navigated_to_particular_page_number_in_pagination(){
        skillCentrepage.verifyClickOnParticularPageNumber();

        String color =skillCentrepage.thirdPageNumber.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);

    }

    @Then("I verify Skill India Centers Color changed to Orange post selecting it")
    public void i_verify_skill_india_centers_color_changed_to_Orange_post_selecting_it(){
        skillCentrepage.clickOnSkillIndiaCentres();

        String color =skillCentrepage.skillIndiaCentresSection.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    @Then("I verify JSS Color changed to Orange post selecting it")
    public void i_verify_jss_color_changed_to_orange_post_selecting_it(){
        skillCentrepage.clickOnJSS();

        String color =skillCentrepage.jSSSection.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    @Then("I verify learner is able to access View details of PMKVY section skill centres")
    public void i_verify_learner_is_able_to_access_view_details_of_pmkvy_section_skill_centres(){
        skillCentrepage.clickOnPMKVYSection();

        skillCentrepage.clickOnViewDetails();

        Assert.assertTrue(isElementPresent(skillCentrepage.closeIconInViewDetailsPopup),"View Details popup is not displayed");
        log.info("View Details popup is displayed post clicking view details");
    }

    @Then("I verify user is able to add skill centres to favorite section from ITI")
    public void i_verify_user_is_able_to_add_skill_centres_to_favorite_section_from_iti(){
        skillCentrepage.clickOnITI();

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteAddedMsg),"Favorite added message is not displayed");
        log.info("Favorite added message is displayed");

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteCountAdded),"Favorite section count is not increased");
        log.info("Favorite section count is increased by one");

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteRemovedMsg),"Favorite removed message is not displayed");
        log.info("Favorite removed message is displayed");

    }

    @Then("I verify user is able to add skill centres to favorite section from JSS")
    public void i_verify_user_is_able_to_add_skill_centres_to_favorite_section_from_jss(){
        skillCentrepage.clickOnJSS();

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteAddedMsg),"Favorite added message is not displayed");
        log.info("Favorite added message is displayed");

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteCountAdded),"Favorite section count is not increased");
        log.info("Favorite section count is increased by one");

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteRemovedMsg),"Favorite removed message is not displayed");
        log.info("Favorite removed message is displayed");

    }

    @Then("I verify user is able to add skill centres to favorite section from PMKVY")
    public void i_verify_user_is_able_to_add_skill_centres_to_favorite_section_from_pmkvy(){
        skillCentrepage.clickOnPMKVYSection();

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteAddedMsg),"Favorite added message is not displayed");
        log.info("Favorite added message is displayed");

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteCountAdded),"Favorite section count is not increased");
        log.info("Favorite section count is increased by one");

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteRemovedMsg),"Favorite removed message is not displayed");
        log.info("Favorite removed message is displayed");

    }

    @Then("I verify user is able to add skill centres to favorite section from SkillIndiaCentres")
    public void i_verify_user_is_able_to_add_skill_centres_to_favorite_section_from_skillindiacentres(){
        skillCentrepage.clickOnSkillIndiaCentres();

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteAddedMsg),"Favorite added message is not displayed");
        log.info("Favorite added message is displayed");

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteCountAdded),"Favorite section count is not increased");
        log.info("Favorite section count is increased by one");

        skillCentrepage.clickOnFavorite();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteRemovedMsg),"Favorite removed message is not displayed");
        log.info("Favorite removed message is displayed");

    }

    @Then("I verify user is able to share skill centres from ITI section")
    public void i_verify_user_is_able_to_share_skill_centres_from_iti_section(){
        skillCentrepage.clickOnITI();

        skillCentrepage.clickOnShareIcon();

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

        skillCentrepage.clickOnCloseSharePopup();
    }

    @Then("I verify user is able to share skill centres from JSS section")
    public void i_verify_user_is_able_to_share_skill_centres_from_jss_section(){
        skillCentrepage.clickOnJSS();

        skillCentrepage.clickOnShareIcon();

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

        skillCentrepage.clickOnCloseSharePopup();
    }

    @Then("I verify user is able to share skill centres from PMKVY section")
    public void i_verify_user_is_able_to_share_skill_centres_from_pmkvy_section(){
        skillCentrepage.clickOnPMKVYSection();

        skillCentrepage.clickOnShareIcon();

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

        skillCentrepage.clickOnCloseSharePopup();
    }

    @Then("I verify user is able to share skill centres from SkillIndiaCentres section")
    public void i_verify_user_is_able_to_share_skill_centres_from_skillindiacentres_section(){
        skillCentrepage.clickOnSkillCentres();

        skillCentrepage.clickOnShareIcon();

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

        skillCentrepage.clickOnCloseSharePopup();
    }

    @Then("I verify user navigated to SIM from ITI section location")
    public void i_verify_user_navigated_to_sim_from_iti_section_location(){
        skillCentrepage.clickOnITI();

        skillCentrepage.clickOnLocationIcon();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterOption),"User is not navigated to Skill India Map");
        log.info("User is navigated to skill india map");

        skillCentrepage.clickOnSkillCentres();

        skillCentrepage.navigatedToSkillCentresPage();
    }

    @Then("I verify user navigated to SIM from JSS section location")
    public void i_verify_user_navigated_to_sim_from_jss_section_location(){
        skillCentrepage.clickOnJSS();

        skillCentrepage.clickOnLocationIcon();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterOption),"User is not navigated to Skill India Map");
        log.info("User is navigated to skill india map");

        skillCentrepage.clickOnSkillCentres();

        skillCentrepage.navigatedToSkillCentresPage();
    }

    @Then("I verify user navigated to SIM from PMKVY section location")
    public void i_verify_user_navigated_to_sim_from_pmkvy_section_location(){
        skillCentrepage.clickOnPMKVYSection();

        skillCentrepage.clickOnLocationIcon();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterOption),"User is not navigated to Skill India Map");
        log.info("User is navigated to skill india map");

        skillCentrepage.clickOnSkillCentres();

        skillCentrepage.navigatedToSkillCentresPage();
    }

    @Then("I verify user navigated to SIM from SkillIndiaCentres section location")
    public void i_verify_user_navigated_to_sim_from_skillindiacentres_section_location(){
        skillCentrepage.clickOnSkillIndiaCentres();

        skillCentrepage.clickOnLocationIcon();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterOption),"User is not navigated to Skill India Map");
        log.info("User is navigated to skill india map");

    }

    @Then("I verify Orange color of the ITI text post selecting ITI")
    public void i_verify_orange_color_of_the_iti_text_post_selecting_iti(){
        skillCentrepage.clickOnITI();

        skillCentrepage.verifyOrangeColorFontOfITI();
    }

    @Then("I verify all the information available on the JSS card in Skill Centre page")
    public void i_verify_all_the_information_available_on_the_jss_card_in_skill_centre_page(){
        skillCentrepage.clickOnITI();

        skillCentrepage.clickOnJSS();

        Assert.assertTrue(isElementPresent(skillCentrepage.locationIconOnCard),"Location icon is not displayed on the card");
        log.info("Location icon is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.shareIconOnCard),"Share icon is not displayed on the card");
        log.info("Share icon is displayed on the card");
       // Assert.assertTrue(isElementPresent(skillCentrepage.favoriteIconOnCard),"favorite icon is not displayed on the card");
       // log.info("Favorite icon is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.centreAndLocationNameOnCard),"Centre and location name is not displayed on the card");
        log.info("Centre and Location name is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.emailOnCard),"Email ID is not displayed on the card");
        log.info("Email ID is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.phoneNumberOnCard),"Phone number is not displayed on the card");
        log.info("Phone number is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.coursesOfferedOnCard),"Courses offered option is not displayed on the card");
        log.info("Courses Offered option is displayed on the card");
        Assert.assertTrue(isElementPresent(skillCentrepage.viewDetailsOnCard),"View Details option is not displayed on the card");
        log.info("View Details option is displayed on the card");


    }

    @Then("I verify user is able to click on Courses Offered in Skill India Centers card")
    public void i_verify_user_is_able_to_click_on_courses_offered_in_skill_india_centers_card(){
        skillCentrepage.clickOnITI();

        skillCentrepage.clickOnSkillIndiaCentres();

        skillCentrepage.clickOnCoursesOffered();

        Assert.assertTrue(isElementPresent(skillCentrepage.coursesOfferedDialogBox),"User is not able to click on Courses Offered");
        log.info("User is able to click on Courses Offered");
    }

    @Then("I verify color of PMKVY post mouse hover on it")
    public void i_verify_color_of_pmkvy_post_mouse_hover_on_it(){
        waitWebDriver(2000);

        Actions action = new Actions(driver);
        action.moveToElement(skillCentrepage.pMKVYSection).perform();

        waitWebDriver(2000);
        skillCentrepage.verifyColorOfPMKVYSection();
    }

    @Then("I verify color of the location name post mouse hover on it")
    public void i_verify_color_of_the_location_name_post_mouse_hover_on_it(){
        waitWebDriver(2000);

        Actions action = new Actions(driver);
        action.moveToElement(skillCentrepage.locationName).perform();
        waitWebDriver(2000);
        skillCentrepage.verifyColorOfLocationName();
    }

    @Then("I verify interest area option color changed to orange")
    public void i_verify_interest_area_option_color_changed_to_orange(){
        skillCentrepage.clickOnLocationFilter();

        skillCentrepage.clickOnIndustryFilter();

        skillCentrepage.selectIndustry();

        skillCentrepage.verifyColorOfSelectedInterestArea();
    }

}
