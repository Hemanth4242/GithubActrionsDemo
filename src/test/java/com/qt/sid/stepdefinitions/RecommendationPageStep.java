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

public class RecommendationPageStep extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    WebDriverWait wait;
    JavascriptExecutor js;
    LookupResultPage lookupResultPage;
    RecommendationPage recommendationPage;

    Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public RecommendationPageStep(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        lookupResultPage=testContext.getPageObjectManager().getLookupResultPage();
        recommendationPage = testContext.getPageObjectManager().getRecommendationPage();

    }

    @When("Click Recommendation tab from the op menu")
    public void clickRecommendationTabFromTheOpMenu() {
    homePage.clickOnRecommendationLink();
    }

    @And("fill all the self assessment text field {string},{string},{string},{string}")
    public void fillAllTheSelfAssessmentTextField(String year, String month, String country, String intrestArea) throws InterruptedException {
        recommendationPage.getselfAssessmentTextFill(year,month,country,intrestArea);
   }

    @Then("Verify the behavior assessment {string}")
    public void verifyTheBehaviorAssessment(String expected) {
        Assert.assertEquals(lookupResultPage.verifyLookupResultPage(),expected,"Expected Value is "+expected+" Achual value is "+lookupResultPage.verifyLookupResultPage());
    }

    @Then("I verify all education qualification fields in Recommendation")
    public void i_verify_all_education_qualification_fields_in_recommendation(){
        Assert.assertTrue(isElementPresent(recommendationPage.higestQualificationQuestion));
        Assert.assertTrue(isElementPresent(recommendationPage.belowClass10));
        Assert.assertTrue(isElementPresent(recommendationPage.class10));
        Assert.assertTrue(isElementPresent(recommendationPage.class12));
        Assert.assertTrue(isElementPresent(recommendationPage.diploma));
        Assert.assertTrue(isElementPresent(recommendationPage.graducation));
        Assert.assertTrue(isElementPresent(recommendationPage.postGraduation));

    }

    @Then("I verify Yes or No options available in Experience Page")
    public void i_verify_yes_or_no_options_available_in_experience_page(){
        recommendationPage.clickHighestEduBtn();

        recommendationPage.clickNextBtn();

         Assert.assertTrue(isElementPresent(recommendationPage.experienceQuestion),"Experience Question is not displayed");

         Assert.assertTrue(isElementPresent(recommendationPage.YesButton1),"Yes button is not displayed");
         log.info("Yes button is displayed");

         Assert.assertTrue(isElementPresent(recommendationPage.NoButton1),"No button is not displayed");
         log.info("No button is displayed");

         recommendationPage.clickWorkExperianceBtn();

         Assert.assertTrue(isElementPresent(recommendationPage.totalWorkExperience),"Total Work Experience text is not displayed");
         log.info("Total Work Experience text is displayed");

         Assert.assertTrue(isElementPresent(recommendationPage.noOfYearTextfield),"Year Text field is not displayed");
         Assert.assertTrue(isElementPresent(recommendationPage.noOfMonthTextfield),"Month Text field is not displayed");

         recommendationPage.clickOnNoButtonInExperiencePage();

         Assert.assertTrue(!isElementPresent(recommendationPage.totalWorkExperience),"Total Work Experience text is displayed");
         log.info("Total Work Experience text is not displayed");

         Assert.assertTrue(!isElementPresent(recommendationPage.noOfYearTextfield),"Year Text field is displayed");
         Assert.assertTrue(!isElementPresent(recommendationPage.noOfMonthTextfield),"Month Text field is displayed");
    }

    @Then("I verify within India and International Opportunity for relocate option {string},{string}")
    public void i_verify_within_india_and_international_opportunity_for_relocate_option(String year, String month){
        recommendationPage.clickHighestEduBtn();

        recommendationPage.clickNextBtn();

        recommendationPage.clickWorkExperianceBtn();

        recommendationPage.sendNoOfYearTextfield(year);
        recommendationPage.sendNoOfMonthTextfield(month);
        recommendationPage.clickNextBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.YesButton2),"Yes button is not displayed");
        Assert.assertTrue(isElementPresent(recommendationPage.NoButton2),"No button is not displayed");

        recommendationPage.clickOnLocationYesButton();

        Assert.assertTrue(isElementPresent(recommendationPage.withinIndiaOption),"Within India option is not displayed");
        Assert.assertTrue(isElementPresent(recommendationPage.internationalOpportunities),"International Opportunity option is not displayed");

    }

    @Then("I verify state and district values should be selected to proceed")
    public void i_verify_state_and_district_values_should_be_selected_to_proceed(){
        recommendationPage.clickOnWithinIndia();

        Assert.assertTrue(isElementPresent(recommendationPage.stateDropdown),"State dropdown is not displayed");
        Assert.assertTrue(isElementPresent(recommendationPage.districtDropdown),"District dropdown is not displayed");

        recommendationPage.clickOnStateDropdown();

        recommendationPage.selectStateValueFromDropdown();

        recommendationPage.clickOnDistrictDropdown();

        recommendationPage.selectDistrictValueFromDropdown();

        recommendationPage.clickNextBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.tellUsYourInterestText),"Tell us your interest Area text is not displayed");

        Assert.assertTrue(isElementPresent(recommendationPage.intrestedAreaTextfield),"Interest Area text field is not displayed");
    }

    @Then("I verify country options and post selecting Country to proceed")
    public void i_verify_country_option_and_post_selecting_country_to_proceed(){
        recommendationPage.clickOnInternationalOpportunities();

        Assert.assertTrue(isElementPresent(recommendationPage.countryDropdown),"Country dropdown is not displayed");
        log.info("Country dropdown is displayed");

        recommendationPage.clickOnCountryDropdown();

        recommendationPage.selectAfghanCountry();

        recommendationPage.clickNextBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.tellUsYourInterestText),"Tell us your interest Area text is not displayed");

        Assert.assertTrue(isElementPresent(recommendationPage.intrestedAreaTextfield),"Interest Area text field is not displayed");

    }

    @Then("I verify suggestions based on the selected interest Area without selecting location {string}")
    public void i_verify_suggestions_based_on_the_selected_interest_area_without_selecting_location(String interestArea){
        recommendationPage.clickOnNoButtonInLocation();

        recommendationPage.clickNextBtn();

        recommendationPage.sendIntrestedAreaTextfield(interestArea);
        recommendationPage.clickMatOptionIntrestedArea();
        recommendationPage.clickNextBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.suggestionsText),"Suggestions page is not displayed");
        log.info("Suggestions page is displayed ");

        Assert.assertTrue(isElementPresent(recommendationPage.backToRecommendationButton),"Back to Recommendation button is not displayed");
        log.info("Back to Recommendation button is displayed");

    }

    @Then("I verify disabled Next button and Dark Blue color Post selecting Highest Education")
    public void i_verify_disabled_next_button_and_dark_blue_color_post_selecting_highest_education(){

        boolean highestEducationNextBtn = recommendationPage.nextBtn.isEnabled();
        Assert.assertEquals(highestEducationNextBtn,false);

        recommendationPage.selectEducationAndVerifycolorOfHighestEducation();

        boolean highestEducationNextBtn1 = recommendationPage.nextBtn.isEnabled();
        Assert.assertEquals(highestEducationNextBtn1,true);

        recommendationPage.clickNextBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.experienceQuestion),"Experience Question is not displayed");
        log.info("User navigated to next page post clicking Next button");

        recommendationPage.clickOnBackButton();

        Assert.assertTrue(isElementPresent(recommendationPage.higestQualificationQuestion),"User not navigated back to Highest Education qualification page");
        log.info("User navigated to highest education post clicking back button");

    }

    @Then("I verify user is able to fill the recommendations and access suggestions")
    public void i_verify_user_is_able_to_fill_the_recommendations_and_access_suggestions(){
        recommendationPage.clickHighestEduBtn();

        recommendationPage.clickNextBtn();

        recommendationPage.clickOnNoButtonInExperiencePage();

        recommendationPage.clickNextBtn();

        recommendationPage.clickOnNoButtonInLocation();

        recommendationPage.clickNextBtn();

        recommendationPage.clickEnterAndSelectInterestArea();

        recommendationPage.clickNextBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.suggestionsText),"Suggestions text is not displayed");
        log.info("Suggestions text is displayed");

        Assert.assertTrue(isElementPresent(recommendationPage.backToRecommendationButton),"Back to Recommendation button is not displayed");
        log.info("Back to Recommendation button is displayed");
    }

    @Then("I verify user is able to select one suggestion and click on Submit button")
    public void i_verify_user_is_able_to_select_one_suggestion_and_click_on_submit_button(){
        recommendationPage.clickOnSuggestionRadioBtn();

        recommendationPage.clickOnNoButton();

        recommendationPage.clickOnSubmitBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.activeRecommendationText),"Active recommendation text is not displayed");
        log.info("Active Recommendation text is displayed");

        Assert.assertTrue(isElementPresent(recommendationPage.backToCounselingBtn),"Back to Counseling Button is not displayed");
        log.info("Back to Counseling button is displayed");

        Assert.assertTrue(isElementPresent(recommendationPage.assertionTextInRecommendation),"User not navigated to Suggested recommendations");

        Assert.assertTrue(isElementPresent(recommendationPage.viewAnswers),"View Answers is not displayed");
        log.info("View Answers is displayed");
    }

    @Then("I verify user is navigated to Job Exchange page from Recommendation")
    public void i_verify_user_is_navigated_to_job_exchange_page_from_recommendation(){
       recommendationPage.clickOnViewDetailsOfRecommendedJob();

       Assert.assertTrue(isElementPresent(recommendationPage.jobsSection),"User is not navigated to Job Exchange section");
       log.info("User is navigated to Job Exchange Section");
    }

    @Then("I verify user is navigated to Skilling Program page")
    public void i_verify_user_is_navigated_to_skilling_program_page(){
        recommendationPage.clickOnInterestedSkillSection();

        Assert.assertTrue(isElementPresent(recommendationPage.courseTitle),"Course title is not displayed");
        log.info("course title is displayed");

        recommendationPage.clickOnApplyNowBtn();

        Assert.assertTrue(isElementPresent(recommendationPage.skillHeaderSection),"User not navigated to Skilling Program section");
        log.info("User navigated to Skilling Program section");





    }

}
