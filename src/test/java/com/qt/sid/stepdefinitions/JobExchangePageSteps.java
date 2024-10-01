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
import org.testng.Assert;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JobExchangePageSteps extends BasePage{

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

    LoginPage loginPage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public JobExchangePageSteps(TestContext context) {
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
        loginPage = testContext.getPageObjectManager().getLoginPage();
        




    }

        @Then("I verify user is able to navigate to available tabs page in job exchange page")
        public void i_verify_user_is_able_to_navigate_to_available_tabs_page_in_job_exchange_page() {
        	jobExchangePage.clickOnJobExchange();
        	
        	jobExchangePage.clickOnApprenticeship();
        	waitTillTheElementIsVisibleAndClickable(jobExchangePage.jobCardDetails);
        	Assert.assertTrue(isElementPresent(jobExchangePage.jobCardDetails),"Apprenticeships cards is not displayed");
        	log.info("Apprenticeships card is displayed");
        	
        	//jobExchangePage.clickOnBelow5k();
        	
        	jobExchangePage.clickOnBetween10to15K();
        	
        	jobExchangePage.clickOnRightNavigation();
        	
        	//jobExchangePage.clickOnAbove15k();	
        	
        }
        
        
        @Then("I verify jobcards displayed for searched industry in search field")
        public void i_verify_jobcards_displayed_for_searched_industry_in_search_field() {
            jobExchangePage.clickOnLeftNavigation();
        	
        	jobExchangePage.clickOnJobs();
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.jobCardDetails),"Jobs card details is not displayed");
        	log.info("Jobs cards details is displayed");
        	
        	jobExchangePage.clickOnIndustrySearchField();
        	
        	jobExchangePage.sendIndustryValueInSearchField();
        	
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.jobCardDetails),"Jobs card details is not displayed");
        	log.info("Jobs cards details is displayed");
        	
        	
        }
        
        @Then("I verify different Job Cards Displayed post clicking Jobs")
        public void i_verify_different_job_card_displayed_post_clicking_jobs() {
        	jobExchangePage.clickOnJobExchange();
        	
        	jobExchangePage.clickOnJobs();
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.assertJobCard),"Different Job cards is not displayed");
        	log.info("Different Job cards is displayed");
        }
        
        @Then("I verify different Apprenticeship Cards Displayed post clicking apprenticeship")
        public void i_verify_different_apprenticeship_card_displayed_post_clicking_apprenticeship() {
        	
        	jobExchangePage.clickOnApprenticeship();
        	
        	jobExchangePage.visibilityOfApprenticeshipCards();
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.assertAppreticeShipCard),"Different Apprenticeships cards is not displayed");
        	log.info("Different Apprenticeships cards is displayed");
        }

        
        @Then("I verify jobs based on applied location filters")
        public void i_verify_jobs_based_on_applied_location_filters() {
        	jobExchangePage.clickOnJobExchange();

            jobExchangePage.clickOnIndustryFilter();
        	
        	jobExchangePage.clickOnLocationFilter();
        	
        	jobExchangePage.countrySearchField();

            //jobExchangePage.clickOnApplyBtn();
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.jobCardDetails),"Job is not displayed based on applied location filter ");
        	log.info("Job is displayed based on applied location filter");
        }
        
        @Then("I verify removed filters post clicking reset button")
        public void i_verify_removed_filters_post_clicking_reset_button() {

        	jobExchangePage.clickOnResetBtn();
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.assertJobCard),"Different Job cards is not displayed");
        	log.info("Different Job cards is displayed");
        
        }
        
        @Then("I verify pagination is working in JobExchange")
        public void i_verify_pagination_is_working_in_jobexchange() {
        	jobExchangePage.clickOnJobExchange();
        	
        	jobExchangePage.clickOnNextPageInPagination();
        	
        	Assert.assertTrue(isElementPresent(jobExchangePage.assertJobCard)," Job cards is not displayed");
        	log.info(" Job cards is displayed");
        
        }

        @Then("I verify all the information on the Job Card displayed")
        public void i_verify_all_the_information_on_the_job_card_displayed(){
            jobExchangePage.clickOnJobs();

            Assert.assertTrue(isElementPresent(jobExchangePage.assertJobCard),"Different Job cards is not displayed");
            log.info("Different Job cards is displayed");

            Assert.assertTrue(isElementPresent(jobExchangePage.jobTitle),"Job Title is not displayed on the job card");
            log.info("Job Title is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Job Tag is not displayed on the job card");
            log.info("Job Tag is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.shareIcon),"Share option is not displayed on the job card");
            log.info("Share option is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.favoriteIcon),"Favorite option is not displayed on the job card");
            log.info("Favorite option is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.companyName),"Company name is not displayed on the job card");
            log.info("Company name is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.locationOnCard),"Location is not displayed on the job card");
            log.info("Location is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.jobType),"Job type is not displayed on the job card");
            log.info("Job Type is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.salaryOnCard),"Salary is not displayed on the job card");
            log.info("Salary is displayed on the job card");

            Assert.assertTrue(isElementPresent(jobExchangePage.viewDetailsButton),"View Details button is not displayed on the job card");
            log.info("View details button is displayed on the job card");

        }

        @Then("I verify apprenticeships under all the sections of Job Exchange page")
        public void i_verify_apprenticeships_under_all_the_sections_of_job_exchange_page(){
             jobExchangePage.clickOnApprenticeship();

            jobExchangePage.waitTillTheApprenticeshipCardsDisplay();

            Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipTag),"Different Apprenticeships cards is not displayed");
            log.info("Different Apprenticeships cards is displayed");

            jobExchangePage.clickOnBelow5k();

            jobExchangePage.waitTillTheApprenticeshipCardsDisplay();

            Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipTag),"Below 5K Apprenticeships cards is not displayed");
            log.info("Below 5K  Apprenticeships cards is displayed");

            jobExchangePage.clickOnBetween5kTo10K();

            jobExchangePage.waitTillTheApprenticeshipCardsDisplay();

            Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipTag),"5k to 10k Apprenticeships cards is not displayed");
            log.info("5k to 10k Apprenticeships cards is displayed");

            jobExchangePage.clickOnBetween10to15K();

            jobExchangePage.waitTillTheApprenticeshipCardsDisplay();

            Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipTag),"10K to 15K Apprenticeships cards is not displayed");
            log.info("10K to 15K Apprenticeships cards is displayed");

            jobExchangePage.clickOnAbove15k();

            /*jobExchangePage.waitTillTheApprenticeshipCardsDisplay();

            Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipTag),"Above 15K Apprenticeships cards is not displayed");
            log.info("Above 15K Apprenticeships cards is displayed");*/

        }

    @Then("I verify Jobs under all the sections of Job Exchange page")
    public void i_verify_jobs_under_all_the_sections_of_job_exchange_page(){
        jobExchangePage.clickOnJobs();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Different Job cards is not displayed");
        log.info("Different Job cards is displayed");

        jobExchangePage.clickOnBelow5k();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Below 5K Job cards is not displayed");
        log.info("Below 5K  Job cards is displayed");

        jobExchangePage.clickOnBetween5kTo10K();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"5k to 10k Job cards is not displayed");
        log.info("5k to 10k Job cards is displayed");

        jobExchangePage.clickOnBetween10to15K();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"10K to 15K Job cards is not displayed");
        log.info("10K to 15K Job cards is displayed");

        jobExchangePage.clickOnAbove15k();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Above 15K Job cards is not displayed");
        log.info("Above 15K Job cards is displayed");

    }

        @Then("I verify user is able to click on View Details of Apprenticeship")
        public void i_verify_user_is_able_to_click_on_view_details_of_apprenticeship(){
           waitWebDriver(3000);
           jobExchangePage.clickOnApprenticeship();
           waitWebDriver(1000);
           scrollDown();
           waitWebDriver(1000);
           jobExchangePage.clickOnViewDetailsOfApprenticeship();
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);

                    Assert.assertTrue(isElementPresent(jobExchangePage.candidateRegisterPage),"Candidate Login and Register section is not displayed");
                    log.info("Candidate Login and Register section is displayed");
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }
            driver.switchTo().window(parent);

        }

    @Then("I verify all the information on the Apprenticeship Card displayed")
    public void i_verify_all_the_information_on_the_apprenticeship_card_displayed(){
        jobExchangePage.clickOnApprenticeship();

        Assert.assertTrue(isElementPresent(jobExchangePage.assertAppreticeShipCard),"Different Apprenticeship cards is not displayed");
        log.info("Different Apprenticeship cards is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTitle),"Apprenticeship Title is not displayed on the job card");
        log.info("Apprenticeship Title is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.assertAppreticeShipCard),"Apprenticeship Tag is not displayed on the job card");
        log.info("Apprenticeship Tag is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.favoriteIcon),"Share option is not displayed on the Apprenticeship card");
        log.info("Share option is displayed on the Apprenticeship card");

       /* Assert.assertTrue(isElementPresent(jobExchangePage.favoriteIcon),"Favorite option is not displayed on the job card");
        log.info("Favorite option is displayed on the job card");*/

        Assert.assertTrue(isElementPresent(jobExchangePage.companyName),"Company name is not displayed on the Apprenticeship card");
        log.info("Company name is displayed on the Apprenticeship card");

        Assert.assertTrue(isElementPresent(jobExchangePage.locationOnCard),"Location is not displayed on the Apprenticeship card");
        log.info("Location is displayed on the Apprenticeship card");

        Assert.assertTrue(isElementPresent(jobExchangePage.postedDateOnCard),"Job type is not displayed on the Apprenticeship card");
        log.info("Job Type is displayed on the Apprenticeship card");

        Assert.assertTrue(isElementPresent(jobExchangePage.salaryOnCard),"Salary is not displayed on the Apprenticeship card");
        log.info("Salary is displayed on the Apprenticeship card");

        Assert.assertTrue(isElementPresent(jobExchangePage.viewDetailsButton),"View Details button is not displayed on the Apprenticeship card");
        log.info("View details button is displayed on the Apprenticeship card");

    }

    @Then("I verify user navigated to Job details post clicking View Details button")
    public void i_verify_user_navigated_to_job_details_post_clicking_view_details_button(){
        jobExchangePage.clickOnJobs();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Job Tag is not displayed on the job card");
        log.info("Job Tag is displayed on the job card");

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.assertJobDescription),"Job Description is not dispalyed");
        log.info("Job Description is displayed");
    }

    @Then("I verify user is able to view job details from Popular Job Exchange Section")
    public void i_verify_user_is_able_to_view_job_details_from_popular_job_exchange_section(){
        jobExchangePage.clickOnJobs();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Job Tag is not displayed on the job card");
        log.info("Job Tag is displayed on the job card");

        jobExchangePage.scrollToPopularJobExchangeSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobUnderPopular),"Job tag under popular job exchange section is not displayed");
        log.info("Job tab under popular job exchange section is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.viewDetailsUnderPopular),"View details under popular section is not displayed");
        log.info("View details under popular section is displayed");

        jobExchangePage.clickOnViewDetailsOfJobUnderPopularSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.assertJobDescription),"Job Description is not dispalyed");
        log.info("Job Description is displayed");

    }

    @Then("I verify pagination is working properly in Popular Job Exchange section")
    public void i_verify_pagination_is_working_properly_in_popular_job_exchange_section(){
        jobExchangePage.clickOnJobs();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Job Tag is not displayed on the job card");
        log.info("Job Tag is displayed on the job card");

        jobExchangePage.scrollToPopularJobExchangeSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobUnderPopular),"Job tag under popular job exchange section is not displayed");
        log.info("Job tab under popular job exchange section is displayed");

        jobExchangePage.clickOnPaginationInPopularSection();
    }

    @Then("I verify pagination is working properly in Popular Job Exchange section for Apprenticeships")
    public void i_verify_pagination_is_working_properly_in_popular_job_exchange_section_for_apprenticeships(){
        jobExchangePage.clickOnApprenticeship();

        Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipTag),"Apprenticeship Tag is not displayed on the job card");
        log.info("Apprenticeship Tag is displayed on the job card");

        jobExchangePage.scrollToPopularJobExchangeSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.apprenticeshipUnderPopular),"Apprenticeship tag under popular job exchange section is not displayed");
        log.info("Apprenticeship tab under popular job exchange section is displayed");

        jobExchangePage.clickOnApprenticePaginationInPopularSection();
    }

    @Then("I verify click on view details of Jobs in Job Exchange page")
    public void i_verify_click_on_view_details_of_jobs_in_job_exchange_page(){
        jobExchangePage.clickOnJobs();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");
    }

    @Then("I verify share options displayed post clicking Share button")
    public void i_verify_share_options_displayed_post_clicking_share_button(){
        jobExchangePage.clickOnShareOptionInJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareThisJobText),"Share this job text is not displayed");
        log.info("Share this job text is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Job");

    }

    @Then("I verify job is added to favorite section in view details")
    public void i_verify_job_is_added_to_favorite_section_in_view_details(){
        Assert.assertTrue(isElementPresent(jobExchangePage.favoriteOption),"Favorite option is not displayed");
        log.info("Favorite option is displayed");

        jobExchangePage.clickOnFavoriteOption();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobAddedToFavoriteMsg),"Job added to favorite message is not displayed");
        log.info("Job added to favorite message is displayed");

        jobExchangePage.clickOnFavoriteOption();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobRemovedFromFavoriteMsg),"Job removed from favorite message is not displayed");
        log.info("Job removed from favorite message is displayed");

    }

    @Then("I verify user navigated to seperate tab post clicking ApplyNow button")
    public void i_verify_user_navigated_to_seperate_tab_post_clicking_applynow_button(){
        jobExchangePage.clickOnApplyNowButton();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(5000);
                Assert.assertTrue(isElementPresent(jobExchangePage.NSDCLogo),"NSDC Logo is not displayed");
                Assert.assertTrue(isElementPresent(jobExchangePage.kaushalMahotsavHeader),"Kaushal Mahotsav header is not displayed");
                Assert.assertTrue(driver.getCurrentUrl().contains("https://nsdcjobx.com/homejob_view?id"), " New tab is not displayed ");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify all the information of Skill Centre in View details of Job under skill Centre")
    public void i_verify_all_the_information_of_skill_centre_in_view_details_of_job_under_skill_centre(){

        jobExchangePage.scrollTillSkillCentreSection();

        jobExchangePage.clickOnViewDetailsOfSkillCentre();

        Assert.assertTrue(isElementPresent(jobExchangePage.skillCentreTitle),"Title is not displayed in Popup");
        Assert.assertTrue(isElementPresent(jobExchangePage.emailSection),"Email is not displayed in popup");
        Assert.assertTrue(isElementPresent(jobExchangePage.mobileNumberSection),"Mobile number is not displayed in popup");
        Assert.assertTrue(isElementPresent(jobExchangePage.coursesOfferedSection),"Courses offered section is not displayed");
        Assert.assertTrue(isElementPresent(jobExchangePage.sendOption),"Send option is not displayed");
        Assert.assertTrue(isElementPresent(jobExchangePage.shareOption),"Share option is not displayed");
        Assert.assertTrue(isElementPresent(jobExchangePage.closeBtn),"Close option is not displayed");

    }

    @Then("I verify user navigated to Job details page post clicking View Details")
    public void i_verify_user_navigated_to_job_details_page_post_clicking_view_details(){
           jobExchangePage.scrollTillJobExchangeSection();

           jobExchangePage.clickOnViewDetailsOfJobExchange();

           Assert.assertTrue(isElementPresent(jobExchangePage.applyNowBtn),"Apply Now button is not displayed");
           log.info("Apply now button is displayed and user navigated to successfully");
    }

    @Then("I verify the jobs displayed under Jobs and Color of Reset button")
    public void i_verify_the_jobs_displayed_under_jobs_and_color_of_reset_button(){
         jobExchangePage.clickOnJobs();

         Assert.assertTrue(isElementPresent(jobExchangePage.jobCards.get(0)),"Job Cards is not displayed");
         log.info("Job Listing is displayed under the Job Section");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobCards.get(1)),"Job Cards is not displayed");
        log.info("Job Listing is displayed under the Job Section");

        scrollToElement(jobExchangePage.resetBtn);
        waitWebDriver(3000);
        scrollUp();
        waitWebDriver(2000);

        jobExchangePage.verifyColorOfResetButton();

    }

    @Then("I verify user is able to share the Job")
    public void i_verify_user_is_able_to_share_the_job(){
        jobExchangePage.clickOnShareOptionOnJobCard();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobSharePopupText),"Popup is not displayed");
        log.info("Popup is displayed post clicking Share option of the job card");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Job");
    }

    @Then("I verify the user is able to add the job to Favorite section")
    public void i_verify_the_user_is_able_to_add_the_job_to_favorite_section(){
        jobExchangePage.clickOnFavoriteBtnofJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobAddedToFavoriteMsg),"Job is not added to favorite section");
        log.info("Job is added to the favorite section message is displayed");

        skillCoursesPage.clickOnFavoriteSection();

        jobExchangePage.clickOnFavoriteBtnofJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobRemovedFromFavoriteMsg),"Job is not removed from favorite section");
        log.info("Job is Removed from the favorite section message is displayed");
    }

    @Then("I verify all the details on the Job Card under Popular Job Exchange section")
    public void i_verify_all_the_details_on_the_job_card_under_popular_job_exchange_section(){
        Assert.assertTrue(isElementPresent(jobExchangePage.assertJobCard),"Different Job cards is not displayed");
        log.info("Different Job cards is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTitle),"Job Title is not displayed on the job card");
        log.info("Job Title is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Job Tag is not displayed on the job card");
        log.info("Job Tag is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.shareIcon),"Share option is not displayed on the job card");
        log.info("Share option is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.favoriteIcon),"Favorite option is not displayed on the job card");
        log.info("Favorite option is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.companyName),"Company name is not displayed on the job card");
        log.info("Company name is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.locationOnCard),"Location is not displayed on the job card");
        log.info("Location is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobType),"Job type is not displayed on the job card");
        log.info("Job Type is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.salaryOnCard),"Salary is not displayed on the job card");
        log.info("Salary is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.viewDetailsButton),"View Details button is not displayed on the job card");
        log.info("View details button is displayed on the job card");
    }

    @Then("I verify user is able to share the Popular job")
    public void i_verify_user_is_able_to_share_the_popular_job(){
        jobExchangePage.clickOnSliderOne();

        jobExchangePage.clickOnViewDetailsOfPopularJobCard();

        jobExchangePage.clickOnShareOptionOfPopularJob();

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Job");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Job");

        jobExchangePage.clickOnCloseSharePopup();
    }

    @Then("I verify user is able to add the popular job to favorite section")
    public void i_verify_user_is_able_to_add_the_popular_job_to_favorite_section(){
        jobExchangePage.clickOnFavoriteOptionOfPopularJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobAddedToFavoriteMsg),"Job is not added to favorite section ");
        log.info("Job is added to the favorite section message is displayed");
        waitWebDriver(5000);
        waitWebDriver(3000);
        jobExchangePage.clickOnFavoriteOptionOfPopularJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobRemovedFromFavoriteMsg),"Job is not removed from favorite section ");
        log.info("Job is removed from the favorite section message is displayed");


    }

    @Then("I verify the details of the Job under Description section")
    public void i_verify_the_details_of_the_job_under_description_section(){
        scrollToElement(jobExchangePage.assertJobDescription);
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(jobExchangePage.jobDescriptionDetails.get(0)),"Job Description is not displayed");
        log.info(jobExchangePage.jobDescriptionDetails.get(0));

        Assert.assertTrue(isElementPresent(jobExchangePage.jobDescriptionDetails.get(1)),"Job Description is not displayed");
        log.info(jobExchangePage.jobDescriptionDetails.get(1));

        Assert.assertTrue(isElementPresent(jobExchangePage.functionalAreaOfJob),"Functional area is not displayed");
        log.info("Functional Area is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.qualificationForJob),"Qualification is not displayed");
        log.info("Qualification is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.languagePreferenceForJob),"Language Preference is not displayed");
        log.info("Language Preference is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.contactPersonanName),"Contact Person is not displayed");
        log.info("Contact Person is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.contactPersonanDesignation),"Contact Person designation is not displayed");
        log.info("Contact Person designation is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.mobileNumberOfContactPerson),"Mobile number is not displayed");
        log.info("Mobile Number is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.emailIdOfContactPerson),"Email ID is not displayed");
        log.info("Email ID is displayed");


    }

    @Then("I verify user is able to see Skill Course Job Exchange and Skill Centres of selected Industry")
    public void i_verify_user_is_able_to_see_skill_course_job_exchange_and_skill_centres_of_selected_industry(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifyJobExchangeSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobExchangeForSelectedIndustry),"Job Exchange section for the selected industry is not displayed");
        log.info("Job Exchange section for the selected industry is displayed");

        jobExchangePage.verifySkillCoursesSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.skillCoursesForSelectedIndustry),"Skill Courses section for the selected industry is not displayed");
        log.info("Skill Courses section for the selected industry is displayed");

        jobExchangePage.verifySkillCentresSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.skillCentresForSelectedIndustry),"Skill Centres section for the selected industry is not displayed");
        log.info("Skill Centres section for the selected industry is displayed");
    }

    @Then("I verify all the information under Job Exchange section in View details page")
    public void i_verify_all_the_information_under_job_exchange_section_in_view_details_page(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifyJobExchangeSection();

        Assert.assertTrue(isElementPresent(jobExchangePage.assertJobCard),"Different Job cards is not displayed");
        log.info("Different Job cards is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTitle),"Job Title is not displayed on the job card");
        log.info("Job Title is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobTagOnCard),"Job Tag is not displayed on the job card");
        log.info("Job Tag is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.shareIcon),"Share option is not displayed on the job card");
        log.info("Share option is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.favoriteIcon),"Favorite option is not displayed on the job card");
        log.info("Favorite option is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.companyName),"Company name is not displayed on the job card");
        log.info("Company name is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.locationOnCard),"Location is not displayed on the job card");
        log.info("Location is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.jobType),"Job type is not displayed on the job card");
        log.info("Job Type is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.salaryOnCard),"Salary is not displayed on the job card");
        log.info("Salary is displayed on the job card");

        Assert.assertTrue(isElementPresent(jobExchangePage.viewDetailsButton),"View Details button is not displayed on the job card");
        log.info("View details button is displayed on the job card");

    }

    @Then("I verify user is able to access view all button")
    public void i_verify_user_is_able_to_access_view_all_button(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifyJobExchangeSection();

        jobExchangePage.clickOnViewAllOfJobExchange();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobsSection),"User is not navigated to Jobs Section");
        log.info("User is navigated to Jobs Section");
    }

    @Then("I verify user is able to add the job to favorite section")
    public void i_verify_user_is_able_to_add_the_job_to_favorite_section(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifyJobExchangeSection();

        jobExchangePage.clickOnFavoriteBtnofJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobAddedToFavoriteMsg),"Job is not added to favorite section");
        log.info("Job is added to the favorite section message is displayed");

        jobExchangePage.clickOnFavoriteBtnofJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobRemovedFromFavoriteMsg),"Job is not removed from favorite section");
        log.info("Job is Removed from the favorite section message is displayed");

    }

    @Then("I verify pagination or page mover is working fine")
    public void i_verify_pagination_or_page_mover_is_working_fine(){
        jobExchangePage.clickOnApparelIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifyJobExchangeSectionForApparel();

        jobExchangePage.clickOnFirstPageMoverInJobExchange();
        log.info("User is able to move the page successfully using page movers");

        jobExchangePage.clickOnSecondPageMoverInJobExchange();
        log.info("User is able to move the page successfully using page movers");
    }

    @Then("I verify all the information under Skill Centre section in View details page")
    public void i_verify_all_the_information_under_skill_centre_section_in_view_details_page(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCentresSection();

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

    @Then("I verify user is able to add skill centre to favorite section")
    public void i_verify_user_is_able_to_add_skill_centre_to_favorite_section(){
        jobExchangePage.clickOnFavoriteBtnOfSkillCentre();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteAddedMsg),"Favorite added message is not displayed");
        log.info("Favorite added message is displayed");

        jobExchangePage.clickOnFavoriteBtnOfSkillCentre();

        Assert.assertTrue(isElementPresent(skillCentrepage.favoriteRemovedMsg),"Favorite removed message is not displayed");
        log.info("Favorite removed message is displayed");
    }

    @Then("I verify user is able to access View all from Skill Centres section")
    public void i_verify_user_is_able_to_access_view_all_from_skill_centres_section(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCentresSection();

        jobExchangePage.clickOnViewAllOfSkillCentre();

        Assert.assertTrue(isElementPresent(skillCentrepage.iTISection),"User is not navigated to skill centre section");
        log.info("User is navigated to Skill Centre section");
    }

    @Then("I verify pagination or page mover is working fine for Skill Centre")
    public void i_verify_pagination_or_page_mover_is_working_fine_for_skill_centre(){
        jobExchangePage.clickOnApparelIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCentreSectionForApparel();

        jobExchangePage.clickOnFirstPageMoverInSkillCentre();
        log.info("User is able to move the page successfully using page movers");

        jobExchangePage.clickOnSecondPageMoverInSkillCentre();
        log.info("User is able to move the page successfully using page movers");
    }

    @Then("I verify all the information under Skill Course section in View details page")
    public void i_verify_all_the_information_under_skill_course_section_in_view_details_page(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCoursesSection();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseNameTitle),"Course Name is not displayed");
        log.info("Course Name is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseOrganizationName),"Course Organization Name is not displayed");
        log.info("Course Organization Name is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.onlineTagOfCourseCard),"Online tag is not displayed");
        log.info("Online tag is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseImage),"Course Image is not displayed");
        log.info("Course Image is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseShareButton),"Course Share button is not displayed");
        log.info("Course Share button is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseFavoriteButton),"Course Favorite button is not displayed");
        log.info("Course Favorite button is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.noOfStudentsSection),"Number of Students is not displayed");
        log.info("Number of Students is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseDurationInCard),"Course Duration is not displayed");
        log.info("Course Duration is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.ratingsOnCourseCard),"Course ratings is not displayed");
        log.info("Course ratings is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseDescriptionArea),"Course description is not displayed");
        log.info("Course description is displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.goToCourseOnCourseCard),"Go to Course is not displayed");
        log.info("Go to course is displayed");
    }

    @Then("I verify user is able to share the Apprenticeships and share options")
    public void i_verify_user_is_able_to_share_the_apprenticeships_and_share_options(){
        jobExchangePage.clickOnApprenticeship();

        jobExchangePage.clickOnShareOptionInApprenticeship();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareThisApprenticeshipTextInPopup),"Share popup is not displayed");
        log.info("Share popup is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Apprenticeship");
    }

    @Then("I verify user is able to share the skill course under view details")
    public void i_verify_user_is_able_to_share_the_skill_course_under_view_details(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCoursesSection();

        jobExchangePage.clickOnShareOptionInSkillCourse();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareThisCoursePopupText),"Share popup is not displayed");
        log.info("Share popup is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Skill Course");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Skill Course");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Skill Course");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Skill Course");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Skill Course");
    }

    @Then("I verify user is able to access View all from Skill Courses section")
    public void i_verify_user_is_able_to_access_view_all_from_skill_courses_section(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCoursesSection();

        jobExchangePage.clickOnViewAllOfSkillCourse();

        Assert.assertTrue(isElementPresent(skillCoursesPage.onlineSection),"User is not navigated to skill course section");
        log.info("User is navigated to Skill course section");
    }

    @Then("I verify user is able to add skill course to favorite section")
    public void i_verify_user_is_able_to_add_skill_course_to_favorite_section(){
        jobExchangePage.clickOnAgricultureIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCoursesSection();

        skillCoursesPage.clickOnFavoriteBtn();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseAddedToFavoriteMsg),"Course is not added to favorite section");
        log.info("Course is added to the favorite section message is displayed");

        skillCoursesPage.clickOnFavoriteBtn();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseRemovedFromFavoriteMsg),"Course is not removed from favorite section");
        log.info("Course is Removed from the favorite section message is displayed");
    }

    @Then("I verify pagination or page mover is working fine for Skill Course")
    public void i_verify_pagination_or_page_mover_is_working_fine_for_skill_course(){

        jobExchangePage.clickOnAutomotiveIndustryFilter();

        jobExchangePage.clickOnViewDetailsOfJob();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareOptionInsideViewDetails),"Share option is not displayed");
        log.info("Share option is displayed");

        jobExchangePage.verifySkillCourseSectionForAutomotive();

        jobExchangePage.clickOnFirstPageMoverInSkillCentre();
        log.info("User is able to move the page successfully using page movers");

        jobExchangePage.clickOnSecondPageMoverInSkillCentre();
        log.info("User is able to move the page successfully using page movers");
    }

    @Then("I verify user is able to share the Apprenticeship in Popular Job Exchange Section")
    public void i_verify_user_is_able_to_share_the_apprenticeship_in_popular_job_exchange_section(){
        jobExchangePage.clickOnApprenticeship();

        jobExchangePage.scrollToPopularJobExchangeSection();

        jobExchangePage.clickOnShareOptionInPopularJobExchange();

        Assert.assertTrue(isElementPresent(jobExchangePage.shareThisApprenticeshipTextInPopup),"Share popup is not displayed");
        log.info("Share popup is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Apprenticeship");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Apprenticeship");
    }

    @Then("I verify all the information on the view details of Apprenticeships")
    public void i_verify_all_the_information_on_the_view_details_of_apprenticeships(){
        jobExchangePage.clickOnApprenticeship();

        jobExchangePage.clickOnViewDetailsOfJob();

        jobExchangePage.verifyApprenticeshipDescription();

        Assert.assertTrue(isElementPresent(jobExchangePage.descriptionOfApprenticeship),"Description of Apprenticeship is not displayed");
        log.info("Description of Apprenticeship is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.functionalAreaOfApprenticeship),"Functional Area of Apprenticeship is not displayed");
        log.info("Functional Area of Apprenticeship is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.qualificationOfApprenticeship),"Qualification of Apprenticeship is not displayed");
        log.info("Qualification of Apprenticeship is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.languageOfApprenticeship),"Language of Apprenticeship is not displayed");
        log.info("Language of Apprenticeship is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.contactPersonNameOfApprenticeship),"Contact Persona of Apprenticeship is not displayed");
        log.info("Contact Person of Apprenticeship is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.contactPersonDesignationOfApprenticeship),"Contact Person Designation of Apprenticeship is not displayed");
        log.info("Contact Person Designation of Apprenticeship is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.mobileNumberOfApprenticeshipCP),"Mobile number of Apprenticeship CP is not displayed");
        log.info("Mobile number of Apprenticeship CP is displayed");

        Assert.assertTrue(isElementPresent(jobExchangePage.emailIDOfApprenticeshipCP),"Email ID of Apprenticeship CP is not displayed");
        log.info("Email ID of Apprenticeship CP is displayed");

    }

    @Then("I verify User navigated to Login section post clicking View Details on Apprenticeship")
    public void i_verify_user_navigated_to_login_section_post_clicking_view_details_on_apprenticeship(){
        jobExchangePage.clickOnApprenticeship();

        jobExchangePage.clickOnViewDetailsOfApprenticeship();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectLearnerRole();
        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(jobExchangePage.applyNowOnApprenticeshipPage),"User is not navigated to Apprenticeship page");
        log.info("User logged in and navigated to Apprenticeship details page");

    }


}
