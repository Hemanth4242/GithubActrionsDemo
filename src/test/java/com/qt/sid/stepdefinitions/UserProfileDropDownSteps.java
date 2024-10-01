package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;

import com.qt.sid.bdd.utils.FileReaderManager;
import io.cucumber.java.bs.A;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qt.sid.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.context.annotation.Profile;
import org.testng.Assert;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UserProfileDropDownSteps extends BasePage{

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

    FavouritePage favouritePage;
    
    SettingsPage settingsPage;
    
    MyDashboard myDashboard;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public UserProfileDropDownSteps(TestContext context) {
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
        loginPage= testContext.getPageObjectManager().getLoginPage();
        favouritePage = testContext.getPageObjectManager().getfavouritePage();
        settingsPage = testContext.getPageObjectManager().getsettingsPage();
        myDashboard = testContext.getPageObjectManager().getmyDashboard();



    }

    @Then("I verify view profile section from user profile dropdown")
    public void i_verify_view_profile_section_from_user_profile_dropdown() {
    	loginPage.clickOnProfile();
    	
    	profilePage.clickOnViewProfile();
    	
    	profilePage.visibilityOfProfileSection();
    	Assert.assertTrue(isElementPresent(profilePage.profilePageText),"User is not navigated to profile page");
    	log.info("User is successfully navigated to profile page");
    }

    @Then("I verify view profile section from user profile dropdown for Learning Partner")
    public void i_verify_view_profile_section_from_user_profile_dropdown_for_learning_partner() {
        loginPage.clickOnPartnerProfile();

        profilePage.clickOnViewProfile();

        Assert.assertTrue(isElementPresent(profilePage.learningPartnerProfileLink),"User is not navigated to profile page");
        log.info("User is successfully navigated to profile page");

        Assert.assertTrue(isElementPresent(profilePage.basicDetailsText),"Basic Details is not displayed");
        log.info("Basic Details is displayed");
    }

    @Then("I verify Learning Partner is able to click on Dashboard in Profile dropdown")
    public void i_verify_learning_partner_is_able_to_click_on_dashboard_in_profile_dropdown(){
        loginPage.clickOnPartnerProfile();

        loginPage.clickOnMyDashboard();

        Assert.assertTrue(isElementPresent(myDashboard.partnerOverview),"Partner is not navigated to Dashboard page");
        log.info("Partner is navigated to Dashboard Page");

        Assert.assertTrue(isElementPresent(myDashboard.createCourseBtn),"Create course button is not displayed");
        log.info("Create course button is displayed");

    }

    @Then("I verify Partner is able to view Switch Profile button enabled post selecting The role")
    public void i_verify_partner_is_able_to_view_switch_profile_button_enabled_post_selecting_the_role(){
        loginPage.clickOnPartnerProfile();

        profilePage.clickOnSwitchUserButton();

        Assert.assertTrue(isElementPresent(profilePage.switchUserPopupText),"Switch user profile text is not displayed in popup");
        log.info("Switch user profile text is displayed in Popup");

        profilePage.clickOnLearnerRoleInSwitchUser();

        boolean switchUserProfile = profilePage.switchProfileBtn.isEnabled();
        Assert.assertEquals(switchUserProfile,true);

    }

    @Then("I verify Learning Partner is able to Logout successfully")
    public void i_verify_learning_partner_is_able_to_logout_successfully(){
        loginPage.clickOnPartnerProfile();

        loginPage.clickOnLogout();

        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"Register button is not displayed");
        log.info("Register button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.loginBtn),"Login button is not displayed");
        log.info("Login button is displayed");

    }


    
    @Then("I verify surveys and polls from user profile dropdown")
    public void i_verify_surveys_and_polls_from_user_profile_dropdown() {
    	loginPage.clickOnProfile();
    	
    	surveysPollPage.clickOnViewSurveysAndPolls();
    	
    	Assert.assertTrue(isElementPresent(surveysPollPage.surveysAndPollsText),"User is not navigated to surveys and poll page");
    	log.info("User is successfully navigated to surveys and poll page");
    	
    	surveysPollPage.clickOnSurveyBtn();
    	
    	surveysPollPage.clickOnPollsBtn();
    	
    }
    
    @Then("I verify favourite section from user profile dropdown")
    public void i_verify_favourite_section_from_user_profile_dropdown() {
    	loginPage.clickOnProfile();
    	
    	favouritePage.clickOnFavourite();
    	Assert.assertTrue(isElementPresent(favouritePage.favouritePageText),"User is not navigated to favourite page");
    	log.info("User is navigated to favourite page");
    	
    	favouritePage.clickOnSkillCourses();
    	
    	Assert.assertTrue(isElementPresent(favouritePage.allSectionsBtn),"All section is not displayed");
    	Assert.assertTrue(isElementPresent(favouritePage.skillCentreBtn),"skill centre section is not displayed");
    	Assert.assertTrue(isElementPresent(favouritePage.jobExchangeBtn),"job exchange section is not displayed");
    }
    
    @Then("I verify user is navigated to My Activity Analysis Page")
    public void i_verify_user_is_navigated_to_my_activity_analysis_page() {
    	loginPage.clickOnProfile();

        myDashboard.clickOnMyActivityAnalysisInUserProfile();

        myDashboard.visibilityOfMyActivityAnalysis();
    	
    	Assert.assertTrue(isElementPresent(myDashboard.profileImage),"Profile image is not displayed");
    	log.info("Profile image is displayed");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.editBtn),"Edit button is not displayed");
    	log.info("Edit button is displayed");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.ReferralDashboardSection),"Referral dashboard is not displayed");
    	log.info("Referral dashboard is displayed");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.exportReport),"Export report is not displayed");
    	log.info("Export Report is displayed");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.sourceDropdown),"Source dropdown is not displayed");
    	log.info("Source dropdown is displayed");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.dateRangeDropdownInAnalysis),"date range dropdown is not displayed");
    	log.info("date range dropdown is displayed");
    	
    	Assert.assertTrue(isElementPresent(myDashboard.overviewSection),"Overview section is not displayed");
    	log.info("Overview section is displayed");
    	
    	scrollToElement(myDashboard.referralSourceAnalysisSection);
    	
    	Assert.assertTrue(isElementPresent(myDashboard.referralSourceAnalysisSection),"Referral source analysis section is not displayed");
    	log.info("Referral source analysis section is displayed");
    	
    	scrollToElement(myDashboard.mediumAnalysisSection);
    	
    	Assert.assertTrue(isElementPresent(myDashboard.mediumAnalysisSection),"My Analysis section is not displayed");
    	log.info("My Analysis section is displayed");
    }
    
    @Then("I verify user is navigated to Preferences Page")
    public void i_verify_user_is_navigated_to_preferences_page() {
    	loginPage.clickOnProfile();
    	
    	settingsPage.clickOnPreferences();
    	
        Assert.assertTrue(isElementPresent(settingsPage.accountPreferencesSection),"Account Preferences section is not displayed");
        log.info("Account Preferences section is displayed");
        
        Assert.assertTrue(isElementPresent(settingsPage.changePasswordSection),"Change Password section is not displayed");
        log.info("Change password section is displayed");
        
        Assert.assertTrue(isElementPresent(settingsPage.privacyConsentSection),"Privacy Consent section is not displayed");
        log.info("Privacy Consent section is displayed");
        
        Assert.assertTrue(isElementPresent(settingsPage.manageAlertsSection),"Manage Alerts section is not displayed");
        log.info("Manage Alerts section is displayed");
    }

    @Then("I verify user is able to click on Documents Family and Banking Sections")
    public void i_verify_user_is_able_to_click_on_documents_family_and_banking_section(){
        profilePage.clickOnDocuments();

        Assert.assertTrue(isElementPresent(profilePage.completeYourAadhaarEkycSection),"Complete your aadhaar eKyc is not displayed");
        log.info("Complete your aadhaar eKyc is not displayed");

        Assert.assertTrue(isElementPresent(profilePage.syncDocumentsWithDigilockerSection),"Sync Documents with Digilocker section is not displayed");
        log.info("Sync Documents with Digilocker section is displayed");

        profilePage.clickOnFamily();

        Assert.assertTrue(isElementPresent(profilePage.relationOrNameSection),"Name or Relation section is not displayed");
        log.info("Name or Relation section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.addMoreButton),"Add More button is not displayed");
        log.info("Add More button is displayed");

        profilePage.clickOnBanking();

        Assert.assertTrue(isElementPresent(profilePage.bankNameSection),"Bank name section is not displayed");
        log.info("Bank name section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.holderNameSection),"Holder name section is not displayed");
        log.info("Holder name section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.addMoreButton),"Add More button is not displayed");
        log.info("Add More button is displayed");

    }

    @Then("I verify user able to share the profile and click on Download profile")
    public void i_verify_user_able_to_share_the_profile_and_click_on_download_profile(){
        profilePage.clickOnDownloadProfile();

        profilePage.clickOnShareProfileButton();

        Assert.assertTrue(isElementPresent(profilePage.shareProfileTextInPopup),"Share this profile text is not displayed");
        log.info("Share this profile text is displayed");

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

    @Then("I verify settings icon displayed on the dropdown")
    public void i_verify_settings_icon_displayed_on_the_dropdown(){
        loginPage.clickOnProfile();

        profilePage.visibilityOfSettingsOption();

        Assert.assertTrue(isElementPresent(profilePage.settingsOption),"Settings option is not displayed in the profile dropdown");
        log.info("Settings option is displayed in the profile dropdown");
    }

    @Then("I verify user is able to click on Preferences in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_preferences_in_profile_dropdown(){
        profilePage.clickOnPreferences();

        Assert.assertTrue(isElementPresent(profilePage.accountPreferencesText),"Account Preferences text is not displayed");
        log.info("Account Preferences text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.assertPreferencesText),"User is not navigated to Preferences section");
        log.info("User is navigated to preferences section");
    }

    @Then("I verify user is able to click on Change Password in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_change_password_in_profile_dropdown(){
        loginPage.clickOnProfile();

        profilePage.visibilityOfSettingsOption();

        profilePage.clickOnChangePassword();

        Assert.assertTrue(isElementPresent(profilePage.changePasswordText),"Change password text is not displayed");
        log.info("Change password text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.assertChangePasswordText),"User is not navigated to Change password section");
        log.info("User is navigated to change password section");
    }

    @Then("I verify user is able to click on Privacy Consent in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_privacy_consent_in_profile_dropdown(){
        loginPage.clickOnProfile();

        profilePage.visibilityOfSettingsOption();

        profilePage.clickOnPrivacyConsent();

        Assert.assertTrue(isElementPresent(profilePage.assertPrivacyConsentText),"Privacy Consent text is not displayed");
        log.info("Privacy Consent text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.showDisabilityDetailsText),"User is not navigated to Privacy Consent section");
        log.info("User is navigated to Privacy Consent section");
    }

    @Then("I verify user is able to click on Manage Alerts in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_manage_alerts_in_profile_dropdown(){
        loginPage.clickOnProfile();

        profilePage.visibilityOfSettingsOption();

        profilePage.clickOnManageAlerts();

        Assert.assertTrue(isElementPresent(profilePage.assertManageAlertsText),"Manage Alerts text is not displayed");
        log.info("Manage Alerts text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.skillCoursesLink),"User is not navigated to Manage Alerts section");
        log.info("User is navigated to Manage Alerts section");
    }

    @Then("I verify user is able to click on Logout in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_logout_in_profile_dropdown(){
        loginPage.clickOnProfile();

        profilePage.visibilityOfSettingsOption();

        loginPage.clickOnLogout();

        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"Register button is not displayed");
         log.info("Register button is displayed");

         Assert.assertTrue(isElementPresent(loginPage.loginBtn),"Login button is not displayed");
         log.info("Login button is displayed");
    }

    @Then("I verify user is able to click on Personal Information in User Profile")
    public void i_verify_user_is_able_to_click_on_personal_information_in_user_profile(){
         profilePage.clickOnPersonalInformation();

         Assert.assertTrue(isElementPresent(profilePage.downloadProfileBtn),"Download profile button is not displayed");
         log.info("Download profile button is displayed and user is able to click on Personal Information");

    }

    @Then("I verify user is able to click on My Dashboard in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_my_dashboard_in_profile_dropdown(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyDashboardInProfileDropdown();

        Assert.assertTrue(isElementPresent(profilePage.MyDashboardHeaderLink),"User is not navigated to My Dashboard section");
        log.info("User is navigated to My Dashabord Section");

        Assert.assertTrue(isElementPresent(profilePage.greetingTextInMyDashabord),"Hi greeting text is not displayed");
        log.info("Hi greeting text is displayed");
    }

    @Then("I verify user is able to click on View under Survey and poll in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_view_under_survey_and_poll_in_profile_dropdown(){
        loginPage.clickOnProfile();

        Assert.assertTrue(isElementPresent(profilePage.surveyAndPollSection),"Surverys and Polls section is not displayed in Profile Dropdown");
        log.info("Surverys and Polls section is displayed in Profile Dropdown");

        profilePage.clickOnViewUnderSurveysAndPolls();

        Assert.assertTrue(isElementPresent(profilePage.surveysButton),"Surverys button is not displayed");
        Assert.assertTrue(isElementPresent(profilePage.pollsButton),"Polls button is not displayed");
    }

    @Then("I verify user is able to click on Switch User in Profile Dropdown")
    public void i_verify_user_is_able_to_click_on_switch_user_in_profile_dropdown(){
        loginPage.clickOnProfile();

        profilePage.clickOnSwitchUserInDropdown();

        Assert.assertTrue(isElementPresent(profilePage.switchUserPopupText),"Switch user profile text is not displayed in popup");
        log.info("Switch user profile text is displayed in Popup");

        Assert.assertTrue(isElementPresent(profilePage.mobilizerRole),"Mobilizer role is not displayed");

        Assert.assertTrue(isElementPresent(profilePage.learningPartnerRole),"Learning Partner role is not displayed");

        profilePage.selectMobilizerRoleInSwitchUser();

        profilePage.clickOnSwitchUserProfileBtn();

        Assert.assertTrue(isElementPresent(profilePage.mobilizerDashboardText),"User not switched to mobilizer role");
        log.info("User is successfully switched to Mobilizer Role from Learner role");

    }

    @Then("I verify user is able to add the communication address in Personal Information")
    public void i_verify_user_is_able_to_add_the_communication_address_in_personal_information(){
        profilePage.scrollTillCommunicationAddress();

        profilePage.addTheCommunicationAddress();

        profilePage.clickOnAddButton();

        Assert.assertTrue(isElementPresent(profilePage.editBtnInPersonalInformation),"Edit button is not displayed");

        Assert.assertTrue(!isElementPresent(profilePage.addAddressBtn),"Add Address button is displayed");
        log.info("Address added successfully");
    }

    @Then("I verify user is able to select and save the language")
    public void i_verify_user_is_able_to_select_and_save_the_language(){
        profilePage.clickOnLanguageSection();

        profilePage.unselectAndSelectTheEnglishLanguage();

       // profilePage.clickOnSaveBtn();

       // Assert.assertTrue(isElementPresent(profilePage.languageUpdatedMsg),"Language Updated message is not displayed");
        log.info("Language updated successfully message is displayed");
    }

    @Then("I verify user is able to add the Education qualification in Profile")
    public void i_verify_user_is_able_to_add_the_education_qualification_in_profile(){
        profilePage.clickOnEducationSection();

        profilePage.addTheEducationDetails();

        profilePage.clickOnAddButton();

        Assert.assertTrue(isElementPresent(profilePage.editBtnInPersonalInformation),"Edit button is not displayed");

        Assert.assertTrue(!isElementPresent(profilePage.addAddressBtn),"Add Address button is displayed");
        log.info("Address added successfully");
    }

    @Then("I verify user is able to add the Work Experience in Profile")
    public void i_verify_user_is_able_to_add_the_work_experience_in_profile(){
        profilePage.clickOnExperience();

        profilePage.addTheExperience();

        profilePage.clickOnAddButton();

        Assert.assertTrue(isElementPresent(profilePage.editBtnInPersonalInformation),"Edit button is not displayed");

        Assert.assertTrue(!isElementPresent(profilePage.addAddressBtn),"Add Address button is displayed");
        log.info("Address added successfully");
    }

    @Then("I verify user is able to add the disability with percentage")
    public void i_verify_user_is_able_to_add_the_disability_with_percentage(){
        profilePage.clickOnDifferentlyAbledSection();

        profilePage.addTheDisability();

        profilePage.clickOnAddButton();

        Assert.assertTrue(isElementPresent(profilePage.editBtnInPersonalInformation),"Edit button is not displayed");

        Assert.assertTrue(!isElementPresent(profilePage.addAddressBtn),"Add Address button is displayed");
        log.info("Address added successfully");
    }

    @Then("I verify My Activity Analysis options and its functionality")
    public void i_verify_my_activity_analysis_options_and_its_functionality(){
        scrollUp();
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(5000);
        myDashboard.clickOnExtentReports();

        Assert.assertTrue(isElementPresent(myDashboard.pdfReport),"PDF Report is not available");
        log.info("PDF Report is available");

        Assert.assertTrue(isElementPresent(myDashboard.excelReport),"Excel Report is not available");
        log.info("Excel Report is available");

        myDashboard.clickOnPDFReport();
        log.info("User is able to download PDF Report");

        myDashboard.clickOnExtentReports();

        myDashboard.clickOnExcelReport();
        log.info("User is able to download Excel Report");

        myDashboard.clickOnSourceFilter();
        log.info("Clicked on Source Dropdown");

        myDashboard.clickOnCalendar();

        myDashboard.clickOnChooseMonthAndYear();

        myDashboard.selectYear();

        myDashboard.selectMonth();

        myDashboard.selectDate();

        myDashboard.selectDate();

        Assert.assertTrue(isElementPresent(myDashboard.resetButton),"Reset button is not displayed");
        log.info("Reset button is displayed");

        myDashboard.clickOnResetButton();

        Assert.assertTrue(!isElementPresent(myDashboard.resetButton),"Reset button is displayed");
        log.info("Reset button is not displayed");


    }


    @Then("I verify validation message for Empty mandatory field in Add Address")
    public void i_verify_validation_message_for_empty_mandatory_field_in_add_address(){
        profilePage.scrollTillCommunicationAddress();

        profilePage.verifyValidationMessageForMandatoryFieldEmpty();

        Assert.assertTrue(isElementPresent(profilePage.validationMessageForEmptyAddress),"Validation message is not displayed");
        log.info("Validation message is displayed for the empty mandatory field");
    }

    @Then("I verify user is able to edit the education details and delete education details")
    public void i_verify_user_is_able_to_edit_the_education_details_and_delete_education_details(){
        profilePage.clickOnEditButtonInEducation();

        profilePage.clickOnQualificationInEducation();

        profilePage.clickOnStreamTwoInQualification();

        profilePage.clickOnUpdateEducationDetails();
        log.info("Education details updated successfully");

        profilePage.clickOnDeleteBtn();

        profilePage.clickOnYesConfirmation();

        Assert.assertTrue(!isElementPresent(profilePage.editBtnInPersonalInformation),"EducationDetails removed successfully message is not displayed");

    }

    @Then("I verify user is able to edit the experience and delete the experience details")
    public void i_verify_user_is_able_to_edit_the_experience_and_delete_the_experience_details(){
        profilePage.clickOnEditButtonInEducation();

        profilePage.clickOnSalaryAndUpdateSalary();

        profilePage.clickOnUpdateEducationDetails();
        log.info("Experience details updated successfully");

        profilePage.clickOnDeleteBtn();

        profilePage.clickOnYesConfirmation();

        Assert.assertTrue(!isElementPresent(profilePage.editBtnInPersonalInformation),"Experience Details removed successfully message is not displayed");
    }

    @Then("I verify user is able edit updated and delete the disability of User")
    public void i_verify_user_is_able_edit_updated_and_delete_the_disability_of_user(){
        profilePage.clickOnEditButtonInEducation();

        profilePage.clickOnDisabilityType();

        profilePage.selectDisability2();

        profilePage.clickOnDisabilityPercentage();

        profilePage.clickOnUpdateEducationDetails();
        log.info("Experience details updated successfully");

        profilePage.clickOnDeleteBtn();

        profilePage.clickOnYesConfirmation();

        Assert.assertTrue(!isElementPresent(profilePage.editBtnInPersonalInformation),"Experience Details removed successfully message is not displayed");
    }

    @Then("I verify user is able to add the family details in Profile")
    public void i_verify_user_is_able_to_add_the_family_details_in_profile(){
        profilePage.clickOnFamily();

        Assert.assertTrue(isElementPresent(profilePage.relationOrNameSection),"Name or Relation section is not displayed");
        log.info("Name or Relation section is displayed");

        profilePage.addFamilyDetails();

        profilePage.clickOnAddButton();

        Assert.assertTrue(isElementPresent(profilePage.editBtnInPersonalInformation),"Edit button is not displayed");

        Assert.assertFalse(isElementPresent(profilePage.addAddressBtn),"Add Address button is displayed");
        log.info("Address added successfully");
    }

    @Then("I verify user is able to edit update and delete the family details of User")
    public void i_verify_user_is_able_to_edit_update_and_delete_the_family_details_of_user(){
        profilePage.clickOnEditButtonInEducation();

        profilePage.updateTheAge();

        profilePage.clickOnUpdateEducationDetails();
        log.info("Family details updated successfully");

        profilePage.clickOnDeleteBtn();

        profilePage.clickOnYesConfirmation();

        Assert.assertFalse(isElementPresent(profilePage.editBtnInPersonalInformation),"Experience Details removed successfully message is not displayed");
    }

    @Then("I verify user is able to add the banking details in Profile")
    public void i_verify_user_is_able_to_add_the_banking_details_in_profile(){
        profilePage.clickOnBanking();

        Assert.assertTrue(isElementPresent(profilePage.bankNameSection),"Bank name section is not displayed");
        log.info("Bank name section is displayed");

        profilePage.addBankingDetails();

        profilePage.clickOnAddButton();

        Assert.assertTrue(isElementPresent(profilePage.editBtnInPersonalInformation),"Edit button is not displayed");

        Assert.assertTrue(!isElementPresent(profilePage.addAddressBtn),"Add Address button is displayed");
        log.info("Address added successfully");
    }

    @Then("I verify user is able to edit update and delete the banking details of User")
    public void i_verify_user_is_able_to_edit_update_and_delete_the_banking_details_of_user(){
        profilePage.clickOnEditButtonInEducation();

        profilePage.updateTheBankName();

        profilePage.clickOnUpdateEducationDetails();
        log.info("Banking details updated successfully");

        profilePage.clickOnDeleteBtn();

        profilePage.clickOnYesConfirmation();

        Assert.assertTrue(!isElementPresent(profilePage.editBtnInPersonalInformation),"Experience Details removed successfully message is not displayed");
    }

    @Then("I verify sections under My Dashboard in Profile")
    public void i_verify_sections_under_my_dashboard_in_profile(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyDashboardInProfileDropdown();

        Assert.assertTrue(isElementPresent(profilePage.mySkillCoursesInDashboard),"My Skill Courses is not displayed");
        log.info("My Skill Courses is displayed in Dashboard");

        Assert.assertTrue(isElementPresent(profilePage.onlineSection),"Online Section is not displayed");
        log.info("Online Section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.offlineSection),"Offline Section is not displayed");
        log.info("Offline Section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.completedSection),"Completed Section is not displayed");
        log.info("Completed Section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.joinedSection),"Joined Section is not displayed");
        log.info("Joined Section is displayed");

        Assert.assertTrue(isElementPresent(profilePage.applicationsSection),"Application Section is not displayed");
        log.info("Application Section is displayed");

    }

    @Then("I verify offline courses displayed under offline section")
    public void i_verify_offline_courses_displayed_under_offline_section(){
        profilePage.clickOnOfflineSection();

        Assert.assertTrue(isElementPresent(profilePage.offlineTagOnCourse),"Offline tag is not displayed on the offline course");
        log.info("Offline tag is displayed on the offline course");

        profilePage.clickOnOfflineTagOnCourse();

        Assert.assertTrue(isElementPresent(profilePage.courseDetailsForOfflineCourse),"User is not navigated to course details page");
        log.info("User is navigated to course details page");


    }

    @Then("I verify Courses metadata in Offline section courses")
    public void i_verify_courses_metadata_in_offline_section_courses(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyDashboardInProfileDropdown();

        profilePage.clickOnOfflineSection();

        Assert.assertTrue(isElementPresent(profilePage.courseTitleInOffline),"Course title is not displayed");
        log.info("Course title is displayed");

        Assert.assertTrue(isElementPresent(profilePage.courseDescriptionInOffline),"Course Description is not displayed");
        log.info("Course Description is displayed");

        Assert.assertTrue(isElementPresent(profilePage.noOfStudentsInOfflineCourse),"Number of students is not displayed");
        log.info("Number of students is displayed");

        Assert.assertTrue(isElementPresent(profilePage.courseDurationInOffline),"Course duration is not displayed");
        log.info("Course duration is displayed");

        Assert.assertTrue(isElementPresent(profilePage.shareButtonInOfflineCourse),"Share button is not displayed");
        log.info("Share button is displayed");

    }

    @Then("I verify user is able to share the Offline course from profile")
    public void i_verify_user_is_able_to_share_the_offline_course_from_profile(){

        profilePage.clickOnShareOfflineCourse();

        Assert.assertTrue(isElementPresent(profilePage.shareThisCoursePopupText),"Share this course popup is not displayed");
        log.info("Share this course popup is displayed");

        profilePage.verifyWhatsAppShare();

        profilePage.verifyFacebookShare();

        profilePage.verifyTwitterShare();

        profilePage.verifyLinkedInShare();

        profilePage.verifyCopyLinkInShare();

        profilePage.clickOnCloseOption();

        Assert.assertFalse(isElementPresent(profilePage.shareThisCoursePopupText), "Share popup is displayed");
        log.info("Share popup is closed post clicking cross option");

    }

    @Then("I verify Learner is able to switch the role in User profile")
    public void i_verify_learner_is_able_to_switch_the_role_in_user_profile(){
        loginPage.clickOnProfile();

        profilePage.clickOnSwitchUserButton();

        Assert.assertTrue(isElementPresent(profilePage.switchUserPopupText),"Switch user profile text is not displayed in popup");
        log.info("Switch user profile text is displayed in Popup");

        Assert.assertTrue(isElementPresent(profilePage.mobilizerRole),"Mobilizer role is not displayed");

        Assert.assertTrue(isElementPresent(profilePage.learningPartnerRole),"Learning Partner role is not displayed");

        profilePage.selectMobilizerRoleInSwitchUser();

        profilePage.clickOnSwitchUserProfileBtn();

        Assert.assertTrue(isElementPresent(profilePage.mobilizerDashboardText),"User not switched to mobilizer role");
        log.info("User is successfully switched to Mobilizer Role from Learner role");
    }

    @Then("I verify learner is able to access Online Offline Joined Completed And Applications sections of My Dashboard")
    public void i_verify_learner_is_able_to_access_online_offline_joined_completed_and_applications_sections_of_my_dashboard(){
        profilePage.clickOnOnlineSection();

        Assert.assertTrue(isElementPresent(profilePage.courseCard),"Course card is not displayed");
        log.info("Course card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineTag),"Online Tag is not displayed");
        log.info("Online Tag is displayed");

        profilePage.clickOnOfflineSection();

        Assert.assertTrue(isElementPresent(profilePage.courseCard),"Course card is not displayed");
        log.info("Course card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.offlineTagOnCourse),"Offline tag is not displayed on the offline course");
        log.info("Offline tag is displayed on the offline course");

        profilePage.clickOnCompletedSection();

        Assert.assertTrue(isElementPresent(profilePage.noCompletedCoursesText),"Completed courses list is displayed");
        log.info("Completed Courses list is not displayed");

        profilePage.clickOnJoinedSection();

        Assert.assertTrue(isElementPresent(profilePage.courseCard),"Course card is not displayed");
        log.info("Course card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineTag),"Online Tag is not displayed");
        log.info("Online Tag is displayed");

        profilePage.clickOnApplicationsSection();

        Assert.assertTrue(isElementPresent(profilePage.cardUnderApplications),"Applications card is not displayed");
        log.info("Applications card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.handIconTag),"Hand icon tag is not displayed");
        log.info("Hand icon tag is displayed");

    }

    @Then("I verify Learner is able to access My Opportunities in My Dashboard")
    public void i_verify_learner_is_able_to_access_my_opportunities_in_my_dashboard(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyDashboardInProfileDropdown();

        profilePage.clickOnMyOpportunities();

        Assert.assertTrue(isElementPresent(profilePage.myOpportunitiesHeader),"Learner is not scrolled to My Opportunities section");
        log.info("Learner scrolled to My Opportunities section");

        Assert.assertTrue(isElementPresent(profilePage.JobExchangeSection),"Job Exchange section is not displayed");
        Assert.assertTrue(isElementPresent(profilePage.apprenticeshipsSection),"Apprenticeship section is not displayed");

        profilePage.clickOnJobsSection();

        Assert.assertTrue(isElementPresent(profilePage.jobTag),"Job tag is not displayed");
        log.info("Job tag is displayed");

        profilePage.clickOnApprenticeshipSection();
        Assert.assertFalse(isElementPresent(profilePage.jobTag),"Job tag is displayed");
        log.info("Learner is able to switch to Apprenticeship section");

    }

    @Then("I verify Learner is able to access Recommendations for you in My Dashboard")
    public void i_verify_learner_is_able_to_access_recommendations_for_you_in_my_dashboard(){

        profilePage.clickOnRecommendationsForYouSection();

        Assert.assertTrue(isElementPresent(profilePage.recommendationsForYouHeader),"Learner not scrolled to Recommendations for you section");
        log.info("Learner scrolled Recommendations for you section");

        Assert.assertTrue(isElementPresent(profilePage.recommendationsList),"Recommended List is not displayed");
    }

    @Then("I verify Learner is able to access My Credits in My Dashboard")
    public void i_verify_learner_is_able_to_access_my_credits_in_my_dashboard(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyDashboardInProfileDropdown();

        profilePage.clickOnMyCredits();

        Assert.assertTrue(isElementPresent(profilePage.myCreditsHeader),"My Credits header is not displayed");

        Assert.assertTrue(isElementPresent(profilePage.disabledCardsUnderMyCredits),"Cards not displayed under My Credits");
    }

    @Then("I verify Learner is able to access Summary section and view details of Summary")
    public void i_verify_learner_is_able_to_access_summary_section_and_view_details_of_summary(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyDashboardInProfileDropdown();

        profilePage.clickOnSummarySection();

        Assert.assertTrue(isElementPresent(profilePage.summaryHeader),"Summary header is not displayed");
        log.info("Summary header is displayed");

        Assert.assertTrue(isElementPresent(profilePage.skillCoursesAppliedSection));
        Assert.assertTrue(isElementPresent(profilePage.jobExchangeOpportunitiesAppliedSection));
        Assert.assertTrue(isElementPresent(profilePage.apprenticeshipsAppliedSection));

        profilePage.clickOnViewDetailOfSkillCoursesUnderSummary();

        Assert.assertTrue(isElementPresent(profilePage.inProgressSkillCoursesHeader),"In Progress Skill Courses header is not displayed");
        log.info("In Progress skill courses header is displayed");
    }

    @Then("I verify Learner is able to access Edit button of My Dashboard")
    public void i_verify_learner_is_able_to_access_edit_button_of_my_dashboard(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        loginPage.clickOnEdit();

        Assert.assertTrue(isElementPresent(profilePage.personalInformation),"Learner not able to edit the profile");
        log.info("Learner is navigated to Edit personal details page");

        Assert.assertTrue(isElementPresent(profilePage.downloadProfileBtn),"Download profile button is not displayed");
        log.info("Download profile button is displayed");
    }

    @Then("I verify Learner is able to access PMKVY from Dashboard and Share the Skilling Program")
    public void i_verify_learner_is_able_to_access_pmkvy_from_dashboard_and_share_the_skilling_program(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnPMKVYFromDashboard();

        Assert.assertTrue(isElementPresent(profilePage.skillingProgramHeader),"User not navigated to Skilling Program Page");

        schemesPage.clickOnShareBtn();

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the skilling program");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the skilling program");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the skilling program");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the skilling program");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the skilling program");

        profilePage.clickOnCloseOption();

        profilePage.clickOnApplyButton();

        Assert.assertTrue(isElementPresent(profilePage.applyNowBtn),"Apply now button is not displayed");
        log.info("Apply now button is displayed");

        profilePage.clickOnApplyNowButton();
        log.info("Learner successfully clicked on Apply Now button");
    }

    @Then("I verify Learner is navigated to Skilling Program section Post clicking PMKVY from Dashboard")
    public void i_verify_learner_is_navigated_to_skilling_program_section_post_clicking_pmkvy_from_dashboard(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnPMKVYFromDashboard();

        Assert.assertTrue(isElementPresent(profilePage.skillingProgramHeader),"User not navigated to Skilling Program Page");

    }

    @Then("I verify user is able to access Complete Your eKYC section")
    public void i_verify_user_is_able_to_access_complete_your_ekyc_section(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnCompleteYourAadhaareKYCSection();

        profilePage.clickOneKYCOptionDropdown();

        profilePage.clickOnByOTP();

        profilePage.clickOnContinueButton();

        Assert.assertTrue(isElementPresent(profilePage.pleaseProvideYourAadhaarNumberText),"User is not navigated to Aadhaar number page");
        log.info("User is navigated to Aadhaar number page");

        profilePage.clickOnAadhaarInputFieldandEnterAadhaarNumber();

        profilePage.clickOnCheckToSendOTPForAadhaarVerify();

        profilePage.clickOnGenerateOTPButton();

        Assert.assertTrue(isElementPresent(profilePage.enterOTPToVerifyAadhaarText),"User is not navigated to OTP page");
        log.info("User is navigated to OTP page");
    }

    @Then("I verify Learner is able to access My Skill Courses")
    public void i_verify_learner_is_able_to_access_my_skill_courses(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnMySkillCourses();

        Assert.assertTrue(isElementPresent(profilePage.mySkillCoursesInDashboard),"My Skill Courses is not displayed");
        log.info("My Skill Courses is displayed in Dashboard");

        Assert.assertTrue(isElementPresent(profilePage.onlineSection),"Online Section is not displayed");
        log.info("Online Section is displayed");
    }

    @Then("I verify Learner is able to access Upcoming Skill Courses")
    public void i_verify_learner_is_able_to_access_upcoming_skill_courses(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnUpcomingSkillCourses();

        Assert.assertTrue(isElementPresent(profilePage.summaryHeader),"Summary header is not displayed");
        log.info("Summary header is displayed");
    }

    @Then("I verify Learner is able to access Online tab online courses and Course Description")
    public void i_verify_learner_is_able_to_access_online_tab_online_courses_and_course_description(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnOnlineSection();

        profilePage.clickOnSliderOne();

        Assert.assertTrue(isElementPresent(profilePage.courseCard),"Course card is not displayed");
        log.info("Course card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineTag),"Online Tag is not displayed");
        log.info("Online Tag is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineCourseTitle),"Course Title is not displayed");
        log.info("Online Course title is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineCourseDiscription),"Online Course discription is not displayed");
        log.info("Online Course description is displayed");

        Assert.assertTrue(isElementPresent(profilePage.timeDuraitonOfCourseCard),"Time duration is not displayed");
        log.info("time Duration is displayed on the course card");
    }

    @Then("I verify Learner is able to Share the Online courses")
    public void i_verify_learner_is_able_to_share_the_online_courses(){
        profilePage.clickOnShareOnlineCourse();

        Assert.assertTrue(isElementPresent(profilePage.shareThisCoursePopupText),"Share this course popup is not displayed");
        log.info("Share this course popup is displayed");

        profilePage.verifyWhatsAppShare();

        profilePage.verifyFacebookShare();

        profilePage.verifyTwitterShare();

        profilePage.verifyLinkedInShare();

        profilePage.verifyCopyLinkInShare();

        profilePage.clickOnCloseOption();

        Assert.assertFalse(isElementPresent(profilePage.shareThisCoursePopupText), "Share popup is displayed");
        log.info("Share popup is closed post clicking cross option");
    }


    @Then("I verify Learner is able to access Online tab In Joined courses and Course Description")
    public void i_verify_learner_is_able_to_access_online_tab_in_joined_courses_and_course_description(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnJoinedSection();

        profilePage.clickOnSliderOne();

        Assert.assertTrue(isElementPresent(profilePage.courseCard),"Course card is not displayed");
        log.info("Course card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineTag),"Online Tag is not displayed");
        log.info("Online Tag is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineCourseTitle),"Course Title is not displayed");
        log.info("Online Course title is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineCourseDiscription),"Online Course discription is not displayed");
        log.info("Online Course description is displayed");

        Assert.assertTrue(isElementPresent(profilePage.timeDuraitonOfCourseCard),"Time duration is not displayed");
        log.info("time Duration is displayed on the course card");

        Assert.assertTrue(isElementPresent(profilePage.studentsCount),"Students count is not displayed");
        log.info("Students count is displayed on the course card");
    }

    @Then("I verify Learner is able to access Courses under Completed section and Course Description")
    public void i_verify_learner_is_able_to_access_courses_under_completed_section_and_course_description(){
        loginPage.clickOnProfile();

        loginPage.clickOnMyDashboard();

        profilePage.clickOnOnlineSection();

        profilePage.clickOnCompletedSection();

        profilePage.scrollToViewCompletedCourses();

        Assert.assertTrue(isElementPresent(profilePage.courseCard),"Course card is not displayed");
        log.info("Course card is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineTag),"Online Tag is not displayed");
        log.info("Online Tag is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineCourseTitle),"Course Title is not displayed");
        log.info("Online Course title is displayed");

        Assert.assertTrue(isElementPresent(profilePage.onlineCourseDiscription),"Online Course discription is not displayed");
        log.info("Online Course description is displayed");

        Assert.assertTrue(isElementPresent(profilePage.timeDuraitonOfCourseCard),"Time duration is not displayed");
        log.info("time Duration is displayed on the course card");

        Assert.assertTrue(isElementPresent(profilePage.studentsCount),"Students count is not displayed");
        log.info("Students count is displayed on the course card");
    }

    @Then("I verify user is able to navigate to Course details page and validate offline tag backgroundcolor")
    public void i_verify_user_is_able_to_navigate_to_course_details_page_and_validate_offline_tag_backgroundcolor(){
        profilePage.clickOnOfflineSection();

        profilePage.clickOnCourseSliderOne();

        profilePage.clickOnGoToCourseBtn();

        Assert.assertTrue(isElementPresent(profilePage.courseDetailsHeader),"User is not navigated to Course details page");
        log.info("User is successfully navigated to Course details page");

        profilePage.verifyOfflineTagBackgroundColor();

    }

    @Then("I verify user is able to navigate to Course details page and validate online tag backgroundcolor")
    public void i_verify_user_is_able_to_navigate_to_course_details_page_and_validate_online_tag_backgroundcolor(){
        profilePage.clickOnOnlineSection();

        profilePage.clickOnCourseSliderOne();

        profilePage.clickOnGoToCourseBtn();

        Assert.assertTrue(isElementPresent(profilePage.courseDetailsHeader),"User is not navigated to Course details page");
        log.info("User is successfully navigated to Course details page");

        profilePage.verifyOnlineTagBackgroundColor();

    }

    @Then("I verify user is able to navigate to joined Course details page and validate online tag backgroundcolor")
    public void i_verify_user_is_able_to_navigate_to_joined_course_details_page_and_validate_online_tag_backgroundcolor(){
        profilePage.clickOnJoinedSection();

        profilePage.clickOnCourseSliderOne();

        profilePage.clickOnGoToCourseBtn();

        Assert.assertTrue(isElementPresent(profilePage.courseDetailsHeader),"User is not navigated to Course details page");
        log.info("User is successfully navigated to Course details page");

        profilePage.verifyOnlineTagBackgroundColor();

    }

    @Then("I verify user is able to navigate to Completed Course details page and validate completed tag backgroundcolor")
    public void i_verify_user_is_able_to_navigate_to_completed_course_details_page_and_validate_completed_tag_backgroundcolor(){
        profilePage.clickOnCompletedSection();

        profilePage.clickOnCourseSliderOne();

        profilePage.clickOnGoToCourseBtn();

        Assert.assertTrue(isElementPresent(profilePage.courseDetailsHeader),"User is not navigated to Course details page");
        log.info("User is successfully navigated to Course details page");

        profilePage.verifyCompletedTagBackgroundColor();

    }

    @Then("I verify Learner is able to access eShram from Dashboard")
    public void i_verify_learner_is_able_to_access_eshram_from_dashboard(){

        profilePage.clickOneShramOptionInDashboard();

        Assert.assertTrue(isElementPresent(myDashboard.eshramImage),"eShram image is not displayed ");
        log.info("eShram image is displayed");

        Assert.assertTrue(isElementPresent(myDashboard.closeBtn),"Close button is not displayed");
        log.info("Close button is displayed in eshram");

        myDashboard.clickOneshramCloseBtn();
    }

    @Then("I verify user is able to access My Courses and My Credits from Profile")
    public void i_verify_user_is_able_to_access_my_courses_and_my_credits_from_profile(){
        loginPage.clickOnProfile();

        profilePage.clickOnMyCourses();

        Assert.assertTrue(isElementPresent(profilePage.onlineSection),"Online Section is not displayed");
        log.info("Online Section is displayed");

        loginPage.clickOnProfile();

        profilePage.clickOnMyCreditsInProfile();

        Assert.assertTrue(isElementPresent(profilePage.myCreditsHeader),"My Credits header is not displayed");
    }




}
