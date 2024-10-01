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

public class CourseCreatePageSteps extends BasePage{

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
    
    CourseCreatePage courseCreatePage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public CourseCreatePageSteps(TestContext context) {
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
        courseCreatePage = testContext.getPageObjectManager().getCourseCreatePage();
        




    }

    
    @Then("verify navigated to course creation page post clicking create course")
    public void verify_navigated_to_course_creation_page_post_clicking_create_course() {
    	courseCreatePage.clickOnCreateCourseTab();
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.easyStepsToCreateCourseText),"Easy Steps to Create Course text is not displayed");
    	log.info("Easy Steps to Create Course text is displayed");
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.detailsSection),"Details section is not displayed");
    	log.info("Details section is displayed");
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.sectorSection),"Sectors section is not displayed");
    	log.info("Sector section is displayed");
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.feesSection),"Fees section is not displayed");
    	log.info("Fees section is displayed");
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.tellUsText),"Tell us about your Course! text is not displayed");
    	log.info("Tell us about your Course! text is displayed");
    }
    
    @Then("enter course title language and course mode")
    public void enter_course_title_language_and_course_mode() {
    	courseCreatePage.enterCourseTitleLanguageAndCourseMode();
    	
    	scrollDown();
    	
    	courseCreatePage.clickOnNextBtn();
    }
   
    @Then("enter course sector and click on next")
    public void enter_course_sector_and_click_on_next() {
    	Assert.assertTrue(isElementPresent(courseCreatePage.sectorFieldText),"Partner is not navigated to sector field");
    	log.info("Partner is able to navigate to sector field successfully");
    	
    	courseCreatePage.selectSectorAndClickOnNext();
    	
    	courseCreatePage.clickOnNextBtn();
    	
    }
    
    @Then("select fees type and click on back button")
    public void select_fees_type_and_click_on_back_button() {
    	Assert.assertTrue(isElementPresent(courseCreatePage.letUsBeginTextInFeesSection),"Let us begin with some basics! text is not displayed");
    	log.info("Let us begin with some basics! text is displayed");
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.selectCourseFeeText),"Select Course Fees Type text is not displayed");
    	log.info("Select Course Fees Type text is displayed");
    	
    	courseCreatePage.clickOnFreeCourse();
    	
    	courseCreatePage.clickOnBackBtn();
    	
    	Assert.assertTrue(isElementPresent(courseCreatePage.sectorFieldText),"Sector field is not displayed");
    	log.info("Sector field is displayed post clicking back button");
    	
    }
    
    @Then("verify click on continue btn post entering all details in course create")
    public void verify_click_on_continue_btn_post_entering_all_details_in_course_create() {
    	courseCreatePage.clickOnNextBtn();
    	
    	courseCreatePage.clickOnContinueBtn();

    }

    @Then("I verify validation message is displayed for mandatory fields")
    public void i_verify_validation_message_is_displayed_for_mandatory_fields(){
         courseCreatePage.clickOnCourseTitle();

         courseCreatePage.clickOnCourseLanguage();

        object_Click(courseCreatePage.selectEnglish);
        waitWebDriver(2000);
        scrollDown();
        waitWebDriver(3000);
        scrollUp();
        waitWebDriver(2000);

         courseCreatePage.clickOnCourseMode();

         Assert.assertTrue(isElementPresent(courseCreatePage.validationMessage),"Validation message is not displayed for the mandatory fields");
         log.info("Validation message is displayed for the mandatory fields");
    }


    @Then("I verify course details popup by clicking Edit icon")
    public void i_verify_course_details_popup_by_clicking_edit_icon(){
        Assert.assertTrue(isElementPresent(courseCreatePage.courseCreationLink),"Course creation link is not displayed");
        log.info("Course creation link is displayed");

        courseCreatePage.clickOnCourseDetailsEditBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.courseDetailsPopupText),"Course details popup is not displayed");
        log.info("Course details popup is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.crossIcon),"Cross icon is not displayed");
        log.info("Cross icon is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.cancelBtn),"Cancel button is not displayed");
        log.info("Cancel button is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.saveBtn),"Save button is not displayed");
        log.info("Save button is displayed");

        courseCreatePage.clickOnCancelButton();

        Assert.assertTrue(!isElementPresent(courseCreatePage.courseDetailsPopupText),"Course details popup text is displayed");

        courseCreatePage.clickOnCourseDetailsEditBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.courseDetailsPopupText),"Course details popup is not displayed");
        log.info("Course details popup is displayed");

        courseCreatePage.clickOnCrossIconOfCourseDetailsPopup();

        Assert.assertTrue(!isElementPresent(courseCreatePage.courseDetailsPopupText),"Course details popup text is displayed");

        courseCreatePage.clickOnCourseDetailsEditBtn();

        courseCreatePage.clickOnCourseNameAndEdit();

        courseCreatePage.clickOnCourseModeAndEdit();

        courseCreatePage.clickOnCourseLanguageAndEdit();

        courseCreatePage.clickOnSaveButton();

        Assert.assertTrue(!isElementPresent(courseCreatePage.courseDetailsPopupText),"Course details popup text is displayed");

    }

    @Then("I verify sector details and edit the details by clicking Edit icon")
    public void i_verify_sector_details_and_edit_the_details_by_clicking_edit_icon(){
        Assert.assertTrue(isElementPresent(courseCreatePage.courseCreationLink),"Course creation link is not displayed");
        log.info("Course creation link is displayed");

        courseCreatePage.clickOnSectorEditBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.sectorTextInPopup),"Sector popup is not displayed");
        log.info("Sector popup is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.sectorPopupCrossIcon),"Cross icon is not displayed");
        log.info("Cross icon is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.cancelBtn),"Cancel button is not displayed");
        log.info("Cancel button is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.saveBtn),"Save button is not displayed");
        log.info("Save button is displayed");

        courseCreatePage.clickOnCancelButton();

        Assert.assertTrue(!isElementPresent(courseCreatePage.sectorTextInPopup),"Sector popup text is displayed");

        courseCreatePage.clickOnSectorEditBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.sectorTextInPopup),"Sector popup is not displayed");
        log.info("Sector popup is displayed");

        courseCreatePage.clickOnCrossIconOfSectorPopup();

        Assert.assertTrue(!isElementPresent(courseCreatePage.sectorTextInPopup),"Sector popup text is displayed");

        courseCreatePage.clickOnSectorEditBtn();

        courseCreatePage.clickOnSubsectorAndEnterTheValue();

        courseCreatePage.clickOnSectorDropdown();

        courseCreatePage.selectTheAerospaceSector();

        courseCreatePage.clickOnSaveButton();

        Assert.assertTrue(!isElementPresent(courseCreatePage.sectorTextInPopup),"Sector popup text is displayed");
    }

    @Then("I verify Fees details and edit the details by clicking Edit icon")
    public void i_verify_fees_details_and_edit_the_details_by_clicking_edit_icon(){
        Assert.assertTrue(isElementPresent(courseCreatePage.courseCreationLink),"Course creation link is not displayed");
        log.info("Course creation link is displayed");

        courseCreatePage.clickOnFeeEditBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.feesTextInPopup),"Fees popup is not displayed");
        log.info("Fees popup is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.crossIconInFeesPopup),"Cross icon is not displayed");
        log.info("Cross icon is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.cancelBtnInFeesPopup),"Cancel button is not displayed");
        log.info("Cancel button is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.saveBtnInFeesPopup),"Save button is not displayed");
        log.info("Save button is displayed");

        courseCreatePage.clickOnCancelBtnOfFeesPopup();

        Assert.assertTrue(!isElementPresent(courseCreatePage.feesTextInPopup),"Fees popup text is displayed");

        courseCreatePage.clickOnFeeEditBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.feesTextInPopup),"Fees popup is not displayed");
        log.info("Fees popup is displayed");

        courseCreatePage.clickOnCrossIconOfFeesPopup();

        Assert.assertTrue(!isElementPresent(courseCreatePage.feesTextInPopup),"Fees popup text is displayed");

        courseCreatePage.clickOnFeeEditBtn();

        courseCreatePage.clickOnPaidBtn();

        courseCreatePage.clickOnCourseFeesSectionAndEnterTheValue();

        courseCreatePage.clickOnSaveBtnOfFeesPopup();

        Assert.assertTrue(!isElementPresent(courseCreatePage.feesTextInPopup),"Fees popup text is displayed");
    }

    @Then("I verify Learning Partner is able to access Approved courses")
    public void i_verify_learning_partner_is_able_to_access_approved_courses(){
        courseCreatePage.clickOnApprovedSectionInDashboard();

        courseCreatePage.clickOnViewAllInDashboard();

        Assert.assertTrue(isElementPresent(courseCreatePage.approvedSection),"Approved section is not displayed");
        log.info("Approved section is displayed");

    }

    @Then("I verify Learning Partner is able to access Contact US button in Dashboard")
    public void i_verify_learning_partner_is_able_to_access_contact_us_button_in_dashboard(){
        courseCreatePage.clickOnDashboardInLearningPartner();

        courseCreatePage.clickOnContactUsInLPDashboard();

        Assert.assertTrue(isElementPresent(courseCreatePage.submitQueryText),"LP is not navigated to Contact us page");
        log.info("Learning Partner is able to access Contact us page");
    }

    @Then("I verify learning partner able to enter Keyword StartDate EndDate and Save")
    public void i_verify_learning_partner_able_to_enter_keyword_startdate_enddate_and_save(){
       courseCreatePage.clickOnKeywordAndEnterKeyword();

       courseCreatePage.clickOnPlusIconToAddKeyword();

       Assert.assertTrue(isElementPresent(courseCreatePage.selectedTag),"Selected tag is not added");
       log.info("Selected tag is added to list");

       scrollDown();

       courseCreatePage.clickOnDurationAndEnterTheDuration();

       courseCreatePage.clickOnCourseAvailability();

       Assert.assertTrue(isElementPresent(courseCreatePage.openFor365DaysOption),"Open for 365 days option is not displayed");

       Assert.assertTrue(isElementPresent(courseCreatePage.fixedScheduleOption),"Fixed schedule option is not displayed");

       courseCreatePage.clickOnFixedSchedule();

       courseCreatePage.clickOnStartDateCalender();

       courseCreatePage.selectDateFromTheCalender();

       courseCreatePage.clickOnEnddateCalender();

        courseCreatePage.selectDateFromTheCalender();

       courseCreatePage.clickOnCourseAlignedTo();

       Assert.assertTrue(isElementPresent(courseCreatePage.nsqfOption),"NSQF option is not displayed");

       Assert.assertTrue(isElementPresent(courseCreatePage.nonNSQFOption),"Non NSQF option is not displayed");

       courseCreatePage.clickOnNonNSQFOption();

       scrollDown();

       courseCreatePage.clickOnLearningOutcomeAndEnterTheOutcome();

       courseCreatePage.clickOnSaveButtonOnEnteringMandatoryFields();

       Assert.assertTrue(isElementPresent(courseCreatePage.overviewUpdateMessage),"Overview updated successfully message is not displayed");
       log.info("Overview updated successfully message is displayed");

       courseCreatePage.clickOnNextButton();

    }

    @Then("I verify learning partner is able to enter the prerequisites")
    public void i_verify_learning_partner_is_able_to_enter_the_prerequisites(){
         Assert.assertTrue(isElementPresent(courseCreatePage.prerequisiteText),"User is not landed on Prerequisite page");
         log.info("User is landed on the Pre-requisite page");

         courseCreatePage.clickOnAgeRequirementDropdown();

         courseCreatePage.selectTheAgeFromDropdown();

         courseCreatePage.clickOnEducationQualification();

         courseCreatePage.selectTheQualification();

         courseCreatePage.clickOnExperienceDropdown();

         courseCreatePage.selectIndustryExperienceFromDropdown();

         courseCreatePage.clickOnLearningToolsAndEnterTheData();

         scrollDown();
         waitWebDriver(1000);
         scrollUp();

         courseCreatePage.clickOnPreRequisiteSaveButton();

         Assert.assertTrue(isElementPresent(courseCreatePage.preRequisiteUpdateMsg),"Pre-requisite updated message is not displayed");
         log.info("Pre-requisite updated message is displayed");

         courseCreatePage.clickOnPreRequisiteNextButton();

    }

    @Then("I verify the learning partner is able access the Edit button of the course")
    public void i_verify_the_learning_partner_is_able_access_the_edit_button_of_the_course(){
         courseCreatePage.clickOnCourseList();

         courseCreatePage.clickOnDraftSection();

         courseCreatePage.clickOnViewDetailsOfCourse();

         courseCreatePage.clickOnEditButtonOfCourse();
         log.info("Learning partner is able to click on Edit button of course");
    }

    @Then("I verify learning partner is able to sort the courses")
    public void i_verify_learning_partner_is_able_to_sort_the_courses(){
        courseCreatePage.clickOnCourseList();

        courseCreatePage.clickOnSortOption();

        courseCreatePage.clickOnZtoASortOption();

        courseCreatePage.clickOnZtoASortOption();

        courseCreatePage.clickOnAtoZSortOption();
    }

    @Then("I verify Learning partner is able to enter content details and click on Next button")
    public void i_verify_learning_partner_is_able_to_enter_content_details_and_click_on_next_button(){
         courseCreatePage.uploadTheImageInContent();

         courseCreatePage.uploadTheVideoFileInContent();

         scrollDown();

         courseCreatePage.clickOnContentTopic();

         courseCreatePage.clickOnAddTopicIcon();

         Assert.assertTrue(isElementPresent(courseCreatePage.deleteOption),"Topic is not added successfully");
         log.info("Topic is added successfully");

         courseCreatePage.clickOnDeleteBtn();

        courseCreatePage.clickOnContentTopic();

        courseCreatePage.clickOnAddTopicIcon();

        courseCreatePage.clickOnDescriptionAndAdd();

        scrollDown();

        courseCreatePage.clickOnContentSaveBtn();

        courseCreatePage.clickOnContentNextBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.assessmentAndCertificationText),"LP is not navigated to next page");
        log.info("LP is navigated to Assessment and Certification page");

    }

    @Then("I verify Learning Partner is able to enter Assessment and Certification details")
    public void i_verify_learning_partner_is_able_to_enter_assessment_and_certification_details(){
        courseCreatePage.clickOnAssessmentTypeDropdown();

        Assert.assertTrue(isElementPresent(courseCreatePage.selfPaceAssessment),"Self pace assessment option is not displayed");
        Assert.assertTrue(isElementPresent(courseCreatePage.proctorAssessment),"Proctor Assessment option is not displayed");

        courseCreatePage.selectSelfPaceAssessment();

        scrollDown();
        waitWebDriver(1000);
        scrollUp();

        courseCreatePage.clickOnCertificateEnabledDropdown();

        Assert.assertTrue(isElementPresent(courseCreatePage.yesOption),"Yes option is not displayed");
        Assert.assertTrue(isElementPresent(courseCreatePage.noOption),"No option is not displayed");

        courseCreatePage.clickOnYesOption();

        courseCreatePage.clickOnCertificateTypeDropdown();

        Assert.assertTrue(isElementPresent(courseCreatePage.certificateOfParticipation),"Certificate of Participation option is not displayed");
        Assert.assertTrue(isElementPresent(courseCreatePage.certificateOfCompletion),"Certificate of Completion option is not displayed");

        courseCreatePage.selectParticipationCertificateType();

        courseCreatePage.clickAndEnterCertificateProvider();

        courseCreatePage.clickOnCertificateEnabledDropdown();

        scrollUp();

        courseCreatePage.clickOnNoOption();

        courseCreatePage.clickOnAssessmentSaveBtn();

        courseCreatePage.clickOnAssessmentNextBtn();

        Assert.assertTrue(isElementPresent(courseCreatePage.assessmentUpdatedMsg),"Assessment updated message is not displayed");
        log.info("Assessment and Certification updated message is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.reviewerDetailsText),"Reviewer Details text is not displayed");

    }

    @Then("I verify Learning Partner is able to enter the Reviewer details")
    public void i_verify_learning_partner_is_able_to_enter_the_reviewer_details(){
        courseCreatePage.clickAndEnterCourseURL();

        courseCreatePage.clickAndEnterCourseCode();

        courseCreatePage.clickAndEnterUsernameField();

        courseCreatePage.clickAndEnterPasswordField();

        Assert.assertTrue(isElementPresent(courseCreatePage.submitForReviewBtn),"Submit For Review button is not displayed");
        log.info("Submit for Review button is displayed");

        Assert.assertTrue(isElementPresent(courseCreatePage.backButton),"Back button is not displayed");
        log.info("Back button is displayed");
    }

    @Then("I verify Learning Partner is navigated to LMS studio and verify studio details")
    public void i_verify_learning_partner_is_navigated_to_lms_studio_and_verify_studio_details(){
        courseCreatePage.clickOnCourseList();
        courseCreatePage.clickOnCourseList();
        courseCreatePage.clickOnLMSStudio();

        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(courseCreatePage.coursesLink),"User is not navigated to Studio");
                log.info("User is navigated to studio");
                waitWebDriver(3000);
               // driver.close();
                courseCreatePage.clickOnCourses();

                courseCreatePage.clickOnLibraries();

                Assert.assertTrue(isElementPresent(courseCreatePage.newCourseBtn),"New Course button is not displayed");
                log.info("New Course button is displayed");

                Assert.assertTrue(isElementPresent(courseCreatePage.newLibraryBtn),"New Library button is not displayed");
                log.info("New Library button is displayed");

                Assert.assertTrue(isElementPresent(courseCreatePage.goBackToSIDBtn),"Go back to SID button is not displayed");
                log.info("Go back to SID button is displayed");

                waitWebDriver(4000);
            }
        }
    }

    @Then("I verify Learning Partner is able to enter course name and org details")
    public void i_verify_learning_partner_is_able_to_enter_course_name_and_org_details(){
           courseCreatePage.clickOnNewCourseBtn();

           courseCreatePage.clickAndEnterCourseName();

           courseCreatePage.clickAndEnterOrgName();

           boolean createBtn = courseCreatePage.createBtn.isEnabled();
           Assert.assertEquals(createBtn,true);
    }


    @Then("I verify Learning Partner is able to enter Library name and org details")
    public void i_verify_learning_partner_is_able_to_enter_library_name_and_org_details(){
        courseCreatePage.clickOnNewLibraryBtn();

        courseCreatePage.clickAndEnterLibraryName();

        courseCreatePage.clickAndEnterLibraryOrgName();

        scrollDown();

        courseCreatePage.clickAndEnterLibraryCode();

        boolean createBtn1 = courseCreatePage.createNewLibraryBtn.isEnabled();
        Assert.assertEquals(createBtn1,true);
    }

}
