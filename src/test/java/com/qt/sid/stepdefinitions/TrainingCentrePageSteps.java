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
import java.util.Set;

public class TrainingCentrePageSteps extends BasePage {

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

    TrainingCentrePage trainingCentrePage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public TrainingCentrePageSteps(TestContext context) {
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
        trainingCentrePage = testContext.getPageObjectManager().getTrainingCentrePage();



    }




    @When("I verify Training Centre is navigated to OTP page post clicking Forgot Password")
    public void i_verify_training_centre_is_navigated_to_otp_page_post_clicking_forgot_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnTrainingCentreLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreRole),"Training Centre role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"Training Centre is not navigated to OTP Page");
        log.info("Training centre is navigated to OTP Page");

    }

    @Then("I verify Training Centre is able to click on Explore Now")
    public void i_verify_training_centre_is_able_to_click_on_explore_now(){
        trainingCentrePage.clickOnExploreNowbutton();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                //Assert.assertTrue(isElementPresent(trainingCentrePage.trainingCentreRegistrationPageText),"User is not navigated to SIP portal");
                log.info("User is navigated to SIP Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify Training Centre dashboard details for logged in TC")
    public void i_verify_training_centre_dashboard_details_for_logged_in_tc(){
        Assert.assertTrue(isElementPresent(trainingCentrePage.trainingCentreOrgName),"Training Centre Organization name is not displayed");
        log.info("Training Centre Organization name is displayed");

        Assert.assertTrue(isElementPresent(trainingCentrePage.trainingCentreEmail),"Training Centre email is not displayed");
        log.info("Training Centre Email is displayed");

        Assert.assertTrue(isElementPresent(trainingCentrePage.trainingCentreAddress),"Training Centre Address is not displayed");
        log.info("Training Centre Address is displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.userProfile),"User Profile is not displayed");
        log.info("User Profile is displayed");
    }

    @When("I verify Training Centre Login card details in Login")
    public void i_verify_training_centre_login_card_details_in_login(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreIcon),"Training Centre Icon is not displayed");
        log.info("Training Centre Icon is displayed");

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreEyeButton),"Training Centre Eye button is not displayed");
        log.info("Training Centre Eye button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.aboutTC),"About TC is not displayed in the card");
        log.info("About TC is displayed on the register card");

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreLoginBtn),"Training Centre Login button is not displayed");
        log.info("Training Centre Login button is displayed");
    }

    @When("I verify user navigated to Mobile number field post clicking Training Centre Login")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_training_centre_login(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnTrainingCentreLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreRole),"Training Centre role is not displayed");
        log.info("Training Centre role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");

    }

    @Then("I verify the all the details of the Training Centre Login flow")
    public void i_verify_the_all_the_details_of_the_training_centre_login_flow(){
        Assert.assertTrue(isElementPresent(loginPage.WelcomeToSkillIndiaDigitalTextInMobileNumberPopup),"Welcome text is not displayed");
        log.info("Welcome text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreIcon),"Training Centre icon is not displayed");
        log.info("Training Centre icon is displayed");

        Assert.assertTrue(isElementPresent(loginPage.flagAndCountryCode),"Flag and country code is not displayed");
        log.info("Flag and country code is displayed");

        Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not displayed");
        log.info("Continue button is displayed");
        boolean continueBtn = loginPage.continueBtn.isEnabled();
        Assert.assertEquals(continueBtn,false,"By default continue button is disabled");

        Assert.assertTrue(isElementPresent(loginPage.termsAndConditionsLink),"Terms and conditions link is not displayed");
        log.info("Terms and conditions link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.privacyPolicyLink),"Privacy policy link is not displayed");
        log.info("Privacy policy link is displayed in the popup");
    }

    @Then("I verify user navigated to Privacy Policy from Login Page")
    public void i_verify_user_navigated_to_privacy_policy_from_login_page(){
        loginPage.clickLoginButton();
        loginPage.selectPartnerRole();
        loginPage.clickOnTrainingCentreLoginBtn();
        loginPage.clickOnPrivacyPolicyLinkFromRegistrationPage();

        Assert.assertTrue(isElementPresent(loginPage.assertPrivacyPolicyText),"User is not navigated to Privacy policy page");
        log.info("User successfully navigated to Privacy policy page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getWelcomePopupPrivacyPolicy()),"User is not navigated to Privacy policy page");

        Set<String> s = driver.getWindowHandles();

        System.out.println(s.size());
        if(s.size()==1){
            log.info("User navigated to privacy policy page in the same tab");
        }
    }

    @Then("I verify the functionality of Close button and back button functionality in TC")
    public void i_verify_the_functionality_of_close_button_and_back_button_functionality_in_tc(){
        loginPage.clickOnBackButtonHyperlink();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerLoginBtn),"User is not navigated to the previous page");
        log.info("User is navigated back to previous page");

        loginPage.clickOnTrainingCentreLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreRole),"Training Centre role is not displayed");
        log.info("Training Centre role is displayed");

        loginPage.clickOnCloseOptionInRegistrationField();

        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"User is not there on the home page");
        log.info("User remains on the same home page ");
    }

    @Then("I verify OTP page options when user clicks on Forgot password in Login Flow for TC")
    public void i_verify_otp_page_options_when_user_clicks_on_forgot_password_in_login_flow_for_tc(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnTrainingCentreLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreRole),"Training Centre role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.forgotPasswordLink),"Forgot password link is not displayed");

        loginPage.clickOnForgotPasswordLink();

        log.info("User is navigated to OTP Screen");
        Assert.assertTrue(isElementPresent(loginPage.editBtn),"Edit icon is not displayed");
        log.info("Edit icon is displayed");
        log.info("User is navigated to OTP Screen");


        boolean resendButton = loginPage.resendButton.isEnabled();
        Assert.assertEquals(resendButton,false);
        log.info("Resend button is not enabled");

        Assert.assertTrue(isElementPresent(loginPage.otpField.get(1)),"OTP field is not displayed");
        log.info("OTP field is displayed");

        Assert.assertTrue(isElementPresent(loginPage.timer),"Timer is not displayed");
        log.info("OTP Timer is displayed");

        Assert.assertTrue(isElementPresent(loginPage.backButtonInRegistrationPage),"Back button is not displayed");
        log.info("Back button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.closeOptionInRegistrationPage),"Close option is not displayed");
        log.info("Close option is displayed");


        Assert.assertTrue(isElementPresent(loginPage.resendButton),"Resend button is not displayed");
        log.info("Resend button is displayed");

    }

    @Then("I verify Settings options for the logged in Training Centre")
    public void i_verify_settings_options_for_the_logged_in_training_centre(){
        loginPage.clickOnPartnerProfile();

        profilePage.clickOnPreferences();

        Assert.assertTrue(isElementPresent(profilePage.accountPreferencesText),"Account Preferences text is not displayed");
        log.info("Account Preferences text is displayed");

        loginPage.clickOnPartnerProfile();

        profilePage.clickOnChangePin();

        Assert.assertTrue(isElementPresent(profilePage.changePasswordText),"Change password text is not displayed");
        log.info("Change password text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.assertChangePasswordText),"User is not navigated to Change password section");
        log.info("User is navigated to change password section");

        loginPage.clickOnPartnerProfile();

        profilePage.clickOnPrivacyConsent();

        Assert.assertTrue(isElementPresent(profilePage.assertPrivacyConsentText),"Privacy Consent text is not displayed");
        log.info("Privacy Consent text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.showDisabilityDetailsText),"User is not navigated to Privacy Consent section");
        log.info("User is navigated to Privacy Consent section");

        loginPage.clickOnPartnerProfile();

        loginPage.clickOnLogout();

        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"Register button is not displayed");
        log.info("Register button is displayed");

    }


    @Then("I verify OTP page options when user clicks on Forgot password in TC Login Flow")
    public void i_verify_otp_page_options_when_user_clicks_on_forgot_password_in_tc_login_flow(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnTrainingCentreLoginBtn();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.forgotPasswordLink),"Forgot password link is not displayed");

        loginPage.clickOnForgotPasswordLink();

        log.info("User is navigated to OTP Screen");
        Assert.assertTrue(isElementPresent(loginPage.editBtn),"Edit icon is not displayed");
        log.info("Edit icon is displayed");
        log.info("User is navigated to OTP Screen");


        boolean resendButton = loginPage.resendButton.isEnabled();
        Assert.assertEquals(resendButton,false);
        log.info("Resend button is not enabled");

        Assert.assertTrue(isElementPresent(loginPage.otpField.get(1)),"OTP field is not displayed");
        log.info("OTP field is displayed");

        Assert.assertTrue(isElementPresent(loginPage.timer),"Timer is not displayed");
        log.info("OTP Timer is displayed");

        Assert.assertTrue(isElementPresent(loginPage.backButtonInRegistrationPage),"Back button is not displayed");
        log.info("Back button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.closeOptionInRegistrationPage),"Close option is not displayed");
        log.info("Close option is displayed");


        Assert.assertTrue(isElementPresent(loginPage.resendButton),"Resend button is not displayed");
        log.info("Resend button is displayed");

    }

}
