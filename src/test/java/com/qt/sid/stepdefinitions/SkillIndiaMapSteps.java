package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;

import com.qt.sid.bdd.utils.FileReaderManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qt.sid.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;


import java.time.Duration;
import java.util.List;

public class SkillIndiaMapSteps extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;
    LoginPage loginPage;
    SkillIndiaMapPage skillIndiaMapPage;

   


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public SkillIndiaMapSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        skillIndiaMapPage = testContext.getPageObjectManager().getSkillIndiaMapPage();
     



    }

	

    @When("I verify navigated to skill india map")
    public void i_verify_navigated_to_skill_india_map() {
       
    	skillIndiaMapPage.clickOnSkillIndiaMap();
    	
    	Assert.assertTrue(isElementPresent(skillIndiaMapPage.satelliteViewOption),"User is not navigated to skill india map");
    	log.info("Navigated to skill india map");
       

    }
    
    @Then("I verify relevant options and information")
    public void i_verify_relevant_options_and_information() {
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterOption),"Search field in skill india map page is not displayed");
       log.info("Search field in skill india map page is displayed");
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.legendOption),"Legend option is not displayed");
       log.info("Legend option is displayed");
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.dragAndZoomOption),"Drag and zoom option is not displayed");
       log.info("Drag and zoom option is displayed");
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.measurementOption),"Measurement option is not displayed");
       log.info("Measurement option is displayed");
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.satelliteViewOption),"Satellite view option is not displayed");
       log.info("Satellite view option is displayed");
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.fullScreenBtn),"Full Screen button is not displayed");
       log.info("Full Screen button is displayed");
       
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.zoomOut),"Zoom out option is not displayed");
       log.info("Zoom out option is displayed");
       
       Assert.assertTrue(isElementPresent(skillIndiaMapPage.zoomIn),"Zoom in option is not displayed");
       log.info("Zoom in option is displayed");
     

    }
    
    @Then("I verify satellite view of skill india map")
    public void i_verify_satellite_view_of_skill_india_map() {
    	skillIndiaMapPage.clickOnSatelliteView();
   
    	log.info("User is able to switch to satellite view successfully");
    	
    	skillIndiaMapPage.clickOnFullScreen();
    	
    	log.info("Skill India Map in Full screen");
    
    }
    
    @Then("I verify Full Screen of skill india map and zoom out")
    public void i_verify_full_screen_of_skill_india_map_zoom_out() {
    	skillIndiaMapPage.clickOnFullScreen();
   
    	log.info("Skill India Map switched normal screen");
    	
    	skillIndiaMapPage.clickOnZoomOutBtn();
    	
    	log.info("User is able to zoom out skill india map successfully");
    
    }
    
    @Then("I verify zoom in functionality of Skill India Map")
    public void i_verify_zoom_in_functionality_of_skill_india_map() {
        skillIndiaMapPage.doubleClickOnZoomInBtn();
    	
    	log.info("User is able to zoom in skill india map successfully");
    }


    @Then("I verify learner is able to access Job Exchange and Skill Centre in SIM")
    public void i_verify_learner_is_able_to_access_job_exchange_and_skill_centre_in_sim(){
        skillIndiaMapPage.clickOnJobExchangeInSIM();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.assertJobs),"Jobs is not displayed in Job Exchange");
        log.info("Jobs is displayed in Job exchange of Skill India Map");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.assertApprenticeships),"Apprenticeships is not displayed in Job Exchange");
        log.info("Apprenticeships is displayed in Job exchange of Skill India Map");

        skillIndiaMapPage.clickOnSkillCentreInSIM();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.assertPMKVY),"PMKVY is not displayed in skill centre");
        log.info("PMKVY is displayed in SKill Centre of Skill India Map");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.assertJSS),"JSS is not displayed in skill centre");
        log.info("JSS is displayed in Skill Centre of Skill India Map");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.assertITI),"ITI is not displayed in Skill centre");
        log.info("ITI is displayed in Skill Centre of SKill India Map");
    }

    @Then("I verify search functionality in Skill India Map")
    public void i_verify_search_functionality_in_skill_india_map(){
        skillIndiaMapPage.clickOnSearchField();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.clearedSearchField),"Search field is not empty");
        log.info("Search Edit field is empty in Skill India map Page");
        skillIndiaMapPage.searchCityInSIM();

        skillIndiaMapPage.clickOnSearchIcon();

       // skillIndiaMapPage.clickOnClearSearchButton();

      //  Assert.assertTrue(isElementPresent(skillIndiaMapPage.clearedSearchField),"Search field is not empty");
        log.info("Search Edit field is empty in Skill India map Page");
    }

    @Then("I verify filter dropdowns in skill india map")
    public void i_verify_filter_dropdowns_in_skill_india_map(){

        skillIndiaMapPage.clickOnFilter();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterText),"Filter text is not displayed");
        log.info("Filter text is displayed ");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.stateDropdown),"State dropdown is not displayed");
        log.info("State dropdown is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.districtDropdown),"District dropdown is not displayed");
        log.info("District dropdown is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.applyBtn),"Apply button is not displayed");
        log.info("Apply button is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.clearBtn),"Clear button is not displayed");
        log.info("Clear button is displayed");

        boolean value1 = skillIndiaMapPage.applyBtn.isEnabled();

        //Assert.assertEquals(value1,true);
        log.info("Continue button is disabled by default");

        skillIndiaMapPage.clickOnStateDropdown();

        skillIndiaMapPage.selectStateValueFromDropdown();

        skillIndiaMapPage.clickOnDistrictDropdown();

        //skillIndiaMapPage.scrollToRequiredDistrictDropdown();
        log.info("User is able to scroll the district dropdown ");
        skillIndiaMapPage.selectDistrictValueFromDropdown();

        waitWebDriver(2000);
        scrollUp();

        skillIndiaMapPage.clickOnFilter();

        boolean a2 = isElementPresent(skillIndiaMapPage.filterText);
        //Assert.assertEquals(a2,false);
        log.info("Filter option closed once again we click on filter option");

    }

    @Then("I verify legend option in skill india map")
    public void i_verify_legend_option_in_skill_india_map(){
        skillIndiaMapPage.clickOnLegend();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.mapLegendText),"Map legend text is not displayed");
        log.info("Map legend text is displayed");

        skillIndiaMapPage.clickOnLegend();

    }

    @Then("I verify clear search functionality in Skill India Map")
    public void i_verify_clear_search_functionality_in_skill_india_map() {
        skillIndiaMapPage.clickOnSearchField();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.clearedSearchField), "Search field is not empty");
        log.info("Search Edit field is empty in Skill India map Page");
        skillIndiaMapPage.searchCityInSIM();

        skillIndiaMapPage.clickOnClearButtonToClearSearch();

        skillIndiaMapPage.clickOnShowYourLocation();
    }

    @Then("I verify measurement options in Skill India Map")
    public void i_verify_measurement_options_in_skill_india_map(){
        skillIndiaMapPage.clickOnMeasurement();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.measurementText),"Measurement text is not displayed");
        Assert.assertTrue(isElementPresent(skillIndiaMapPage.defaultLineSelected),"Defalut line is not selected");
        Assert.assertTrue(isElementPresent(skillIndiaMapPage.defaultKilometerSelected),"Default kilometer is not selected");
        Assert.assertTrue(isElementPresent(skillIndiaMapPage.showSegmentLengthsChkBox),"Show segment length checkbox is not displayed");
        Assert.assertTrue(isElementPresent(skillIndiaMapPage.clearPreviousMeasureChkBox),"Clear previous measurement is not displayed");
        Assert.assertTrue(isElementPresent(skillIndiaMapPage.startBtn),"Start button is not displayed");
        Assert.assertTrue(isElementPresent(skillIndiaMapPage.measurementClearBtn),"Clear button is not displayed");

        boolean startBtnEnabled =  skillIndiaMapPage.startBtn.isEnabled();

        Assert.assertEquals(startBtnEnabled,true);

        skillIndiaMapPage.clickOnLineMeasurement();

        skillIndiaMapPage.selectAreaMeasurement();

        skillIndiaMapPage.clickOnKilometerUnit();

        skillIndiaMapPage.selectMetreUnit();

        skillIndiaMapPage.clickOnClearBtn();

        log.info("Measurement popup is closed post clicking clear button");
    }

    @Then("I verify user not able to enter numbers in search field of SIM")
    public void i_verify_user_not_able_to_enter_numbers_in_search_field_of_sim() {
        skillIndiaMapPage.clickOnSearchField();

        skillIndiaMapPage.enterNumbersInSearchField();

        String enteredNumber = getTextOfObject(skillIndiaMapPage.searchEditField);


        Assert.assertNotEquals(enteredNumber,"123456");

        log.info("User not able to enter numbers and special characters in search field");

    }

    @Then("I verify Map Legend options in skill india map")
    public void i_verify_map_legend_options_in_skill_india_map(){
        skillIndiaMapPage.clickOnLegend();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.mapLegendText),"Map legend text is not displayed");
        log.info("Map legend text is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.stateMapLegendOption),"State Legend option is not displayed");
        log.info("State legend option is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.districtMapLegendOption),"District Legend option is not displayed");
        log.info("District legend option is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.IITMapLegendOption),"ITI Legend option is not displayed");
        log.info("ITI legend option is displayed");

        waitWebDriver(3000);

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.JSSMapLegendOption),"JSS Legend option is not displayed");
        log.info("JSS legend option is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.PMKVYMapLegendOption),"PMKVY Legend option is not displayed");
        log.info("PMKVY legend option is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.skillUniversityMapLegendOption),"Skill University Legend option is not displayed");
        log.info("Skill University legend option is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.feeBasedMapLegendOption),"Fee Based Legend option is not displayed");
        log.info("Fee Based legend option is displayed");

        scrollToElement(skillIndiaMapPage.polytechnicMapLegendOption);
        log.info("User is able to scroll the Map legend options");
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.polytechnicMapLegendOption),"State Legend option is not displayed");
        log.info("State legend option is displayed");

    }

    @Then("I verify select state filter from dropdowns and scroll state filter dropdown")
    public void i_verify_select_state_filter_from_dropdowns_and_scroll_state_filter_dropdown(){

        skillIndiaMapPage.clickOnFilter();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterText),"Filter text is not displayed");
        log.info("Filter text is displayed ");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.stateDropdown),"State dropdown is not displayed");
        log.info("State dropdown is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.districtDropdown),"District dropdown is not displayed");
        log.info("District dropdown is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.applyBtn),"Apply button is not displayed");
        log.info("Apply button is displayed");

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.clearBtn),"Clear button is not displayed");
        log.info("Clear button is displayed");

        skillIndiaMapPage.clickOnStateDropdown();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.selectState),"State Dropdown is not displayed");
        log.info("State dropdown is displayed");

        scrollToElement(skillIndiaMapPage.assertKarnatakaState);
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.assertKarnatakaState),"State filter Scroll bar is not working properly");
        log.info("State filter Scroll bar is working fine");
        waitWebDriver(2000);

        skillIndiaMapPage.clickOnClearAllSearchBtn();
        waitWebDriver(2000);

    }

    @Then("I verify user cannot see district dropdown values without selecting state value in filter")
    public void i_verify_user_cannot_see_district_dropdown_values_without_selecting_state_value_in_filter(){
        skillIndiaMapPage.clickOnFilter();

        skillIndiaMapPage.clickOnDistrictDropdown();

        Assert.assertFalse(isElementPresent(skillIndiaMapPage.selectDistrict),"District dropdown values is displayed without selecting state value");
        log.info("District dropdown values is not displayed without selecting state value from state dropdown");
    }

    @Then("I verify disabled apply button and close the filter option")
    public void i_verify_disabled_apply_button_and_close_the_filter_option(){
        skillIndiaMapPage.clickOnFilter();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterText),"Filter is not displayed");
        log.info("Filter is displayed post clicking Filter");

        boolean applyBtn1 = !skillIndiaMapPage.applyBtn.isEnabled();

        Assert.assertEquals(applyBtn1,false);

        skillIndiaMapPage.clickOnFilter();

       // Assert.assertTrue(!isElementPresent(skillIndiaMapPage.stateDropdown),"Filter is displayed");
        log.info("Filter is not displayed post clicking Filter");

    }

    @Then("I verify user is able to close the measurement popup and clear search")
    public void i_verify_user_is_able_to_close_the_measurement_popup_and_clear_search(){
        skillIndiaMapPage.clickOnMeasurement();

        skillIndiaMapPage.clickOnLineMeasurement();

        skillIndiaMapPage.selectAreaMeasurement();

        skillIndiaMapPage.clickOnKilometerUnit();

        skillIndiaMapPage.selectMetreUnit();

        skillIndiaMapPage.clickOnClearBtn();

        log.info("Measurement popup is closed post clicking clear button");

        skillIndiaMapPage.clickOnMeasurement();

        scrollDown();
        waitWebDriver(2000);
        scrollUp();

        skillIndiaMapPage.clickOnClearBtn();

        skillIndiaMapPage.clickOnClearSearchButtonInSIM();
    }


    @Then("I verify Learner is able to access Gap Analysis")
    public void i_verify_learner_is_able_to_access_gap_analysis(){
        skillIndiaMapPage.clickOnGapAnalysis();

        skillIndiaMapPage.clickOnResetButton();
    }

    @Then("I verify the Minimum and Maximum Total Population values in Gap Analysis")
    public void i_verify_the_minimum_and_maximum_total_population_values_in_gap_analysis(){
        skillIndiaMapPage.clickOnGapAnalysis();

        skillIndiaMapPage.clickOnSkillCentreInGapAnalysis();

        skillIndiaMapPage.selectTheSkillCentre();

        skillIndiaMapPage.clickAndEnterMinimumValueInPopulation();

        skillIndiaMapPage.clickAndEnterMaximumValueInPopulation();

    }

    @Then("I verify Learner is able to enter the input values in Gap Analysis filters")
    public void i_verify_learner_is_able_to_enter_the_input_values_in_gap_analysis_filters(){
       skillIndiaMapPage.clickOnGapAnalysis();

       skillIndiaMapPage.clickOnSkillCentreInGapAnalysis();

       skillIndiaMapPage.selectTheSkillCentre();

       skillIndiaMapPage.clickAndEnterMinimumValueInPopulation();
    }

    @Then("I verify Learer is able to enter minimum and maximum area covered in Gap Analysis")
    public void i_verify_learner_is_able_to_enter_minimum_and_maximum_area_covered_in_gap_analysis(){
        skillIndiaMapPage.clickOnGapAnalysis();

        skillIndiaMapPage.clickOnSkillCentreInGapAnalysis();

        skillIndiaMapPage.selectTheSkillCentre();

        skillIndiaMapPage.clickAndEnterMinimumAreaCoveredInSqKms();

        skillIndiaMapPage.clickAndEnterMaximumAreaCoveredInSqKms();
    }


}
