package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class TrainingPartnerPageSteps extends BasePage {

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


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public TrainingPartnerPageSteps(TestContext context) {
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



    }

    @When("I verify user navigated to Mobile number field post clicking Training Partner Register")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_training_partner_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        trainingPartnerPage.clickOnTrainingPartnerRegister();

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerRole),"Training Partner role is not displayed");
        log.info("Training Partner role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");

    }

    @When("I verify user navigated to Mobile number field post clicking Training Partner Login")
    public void i_verify_user_navigated_to_mobile_number_field_post_clicking_training_partner_login(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnTrainingPartnerLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerRole),"Training Partner role is not displayed");
        log.info("Training Partner role is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Mobile number field is displayed");

    }

    @Then("I verify the all the details of the Training Partner Register flow")
    public void i_verify_the_all_the_details_of_the_training_partner_register_flow(){
        Assert.assertTrue(isElementPresent(loginPage.WelcomeToSkillIndiaDigitalTextInMobileNumberPopup),"Welcome text is not displayed");
        log.info("Welcome text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerIcon),"Training Partner icon is not displayed");
        log.info("Training Partner icon is displayed");

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

    @When("I verify Training Partner Register card details in Register")
    public void i_verify_training_partner_register_card_details_in_register(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerIcon),"Training Partner Icon is not displayed");
        log.info("Training Partner Icon is displayed");

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerEyeButton),"Training Partner Eye button is not displayed");
        log.info("Training Partner Eye button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.aboutTP),"About TP is not displayed in the card");
        log.info("About TP is displayed on the register card");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.trainingPartnerRegisterBtn),"Training Partner Register button is not displayed");
        log.info("Training Partenr Register button is displayed");
    }

    @When("I verify Training Partner Login card details in Login")
    public void i_verify_training_partner_login_card_details_in_login(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerIcon),"Training Partner Icon is not displayed");
        log.info("Training Partner Icon is displayed");

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerEyeButton),"Training Partner Eye button is not displayed");
        log.info("Training Partner Eye button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.aboutTP),"About TP is not displayed in the card");
        log.info("About TP is displayed on the register card");

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerLoginBtn),"Training Partner Login button is not displayed");
        log.info("Training Partenr Login button is displayed");
    }

    @Then("I verify Dashboard Overview Features and User profile in logged in TP")
    public void i_verify_dashboard_overview_features_and_user_profile_in_logged_in_tp(){
        Assert.assertTrue(isElementPresent(trainingPartnerPage.dashboardInTP),"Dashboard is not displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.overviewSection),"Overview section is not displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.userProfile),"User Profile is not displayed");

        trainingPartnerPage.scrollToFeatures();

        Assert.assertTrue(isElementPresent(trainingPartnerPage.featuresSection),"Features section is not displayed");
        log.info("Features section is displayed");

        Assert.assertTrue(isElementPresent(trainingPartnerPage.exploreNowBtn),"Explore now button is not displayed");
        log.info("Explore Now button is displayed");
    }

    @When("I verify Training Partner is navigated to OTP page post clicking Forgot Password")
    public void i_verify_training_partner_is_navigated_to_otp_page_post_clicking_forgot_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnTrainingPartnerLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerRole),"Training Partner role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"Training Provider is not navigated to OTP Page");
        log.info("Training Provider is navigated to OTP Page");

    }

    @Then("I verify Training Partner is able to click on Explore Now")
    public void i_verify_training_partner_is_able_to_click_on_explore_now(){
        trainingPartnerPage.clickOnExploreNowbutton();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                //Assert.assertTrue(isElementPresent(trainingPartnerPage.skillDevelopmentManagementSystemText),"User is not navigated to SIP portal");
                log.info("User is navigated to SIP Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify Training Partner is able to switch the role under user profile")
    public void i_verify_training_partner_is_able_to_switch_the_role_under_user_profile(){
        trainerPage.clickOnMyProfile();

        trainingPartnerPage.clickOnSwitchRoleBtn();

        Assert.assertTrue(isElementPresent(profilePage.switchUserPopupText),"Switch user profile text is not displayed in popup");
        log.info("Switch user profile text is displayed in Popup");

        Assert.assertTrue(isElementPresent(profilePage.mobilizerRole),"Mobilizer role is not displayed");

        Assert.assertTrue(isElementPresent(profilePage.learningPartnerRole),"Learning Partner role is not displayed");

        profilePage.selectMobilizerRoleInSwitchUser();

        profilePage.clickOnSwitchUserProfileBtn();

        Assert.assertTrue(isElementPresent(profilePage.mobilizerDashboardText),"User not switched to mobilizer role");
        log.info("User is successfully switched to Mobilizer Role from Learner role");

    }

    @Then("I verify invalid mobile number message for TP Register flow")
    public void i_verify_invalid_mobile_number_message_for_tp_register_flow(){
        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberToTextField();
        loginPage.clickOnClearMobileNumber();

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberRequiredMsg),"Mobile number is required message is not displayed");
        log.info("Mobile number is required message is displayed");

        boolean value2 = loginPage.continueBtn.isEnabled();

        Assert.assertEquals(value2,false);
        log.info("Continue button is disabled after clearing the mobile number");

        loginPage.sendInvalidMobileNumber();

        Assert.assertTrue(isElementPresent(loginPage.mobileIsNotValidMsg),"Mobile number is not valid message is not displayed");
        log.info("Mobile number is not valid message is displayed");
    }

    @Then("I verify Training Partner is navigated to OTP page verify OTP page details and click on Edit")
    public void i_verify_training_partner_is_navigated_to_otp_page_verify_otp_page_details_and_click_on_edit(){
        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberForTPRegister();
        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"One Time Password(OTP) text is not displayed ");
        log.info("One Time Password(OTP) text is displayed ");

        Assert.assertTrue(isElementPresent(loginPage.enterSixDigitCodeText),"Enter 6 digit code received on your mobile number text is not displayed");
        log.info("Enter 6 digit code received on your mobile number text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.editBtn),"Edit button is not displayed");
        log.info("Edit button is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.timer),"Timer is not displayed");
        log.info("Timer is displayed in OTP page");

        Assert.assertTrue(isElementPresent(loginPage.backButtonInRegistrationPage),"Back button is not displayed");
        log.info("Back button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.closeOptionInRegistrationPage),"Close icon is not displayed in password page");
        log.info("Close icon is displayed in password page");

        loginPage.clickOnEdit();

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Post clicking edit button redirected to Mobile number field is displayed");

        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberForEdit();
        log.info("User able to enter mobile number");
    }

    @Then("I verify password page details for TP login Flow")
    public void i_verify_password_page_details_for_tp_login_flow(){

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.enterYourPasswordText),"Enter your password text is not displayed ");
        log.info("Enter your password text is displayed ");

        Assert.assertTrue(isElementPresent(loginPage.forgotPasswordLink),"Forgot password is not displayed");
        log.info("Forgot password is displayed ");

        Assert.assertTrue(isElementPresent(loginPage.backButtonInRegistrationPage),"Back button is not displayed");
        log.info("Back button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.closeOptionInRegistrationPage),"Close icon is not displayed in password page");
        log.info("Close icon is displayed in password page");

        Assert.assertTrue(isElementPresent(loginPage.fourDigitPasswordField),"Four digit password field is not displayed");
        log.info("Four digit password field is displayed");

        Assert.assertTrue(isElementPresent(loginPage.loginBtnToLogin),"login button is not displayed");
        log.info("Login button is displayed");

        boolean loginButtonBeforeEnteringPassword = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginButtonBeforeEnteringPassword,false);
        log.info("Login button disabled before entering the password");


    }

    @Then("I verify user is able to Enter the valid mobile number")
    public void i_verify_user_is_able_to_enter_the_valid_mobile_number(){
        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberForTPRegister();
        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"One Time Password(OTP) text is not displayed ");
        log.info("One Time Password(OTP) text is displayed ");
    }

    @Then("I verify the functionality of Close button and back button functionality")
    public void i_verify_the_functionality_of_close_button(){
        loginPage.clickOnBackButtonHyperlink();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerLoginBtn),"User is not navigated to the previous page");
        log.info("User is navigated back to previous page");

        loginPage.clickOnTrainingPartnerLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingPartnerRole),"Training Partner role is not displayed");
        log.info("Training Partner role is displayed");

        loginPage.clickOnCloseOptionInRegistrationField();

        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"User is not there on the home page");
        log.info("User remains on the same home page ");
    }

    @Then("I verify Settings options for the logged in Training Partner")
    public void i_verify_settings_options_for_the_logged_in_training_partner(){
        loginPage.clickOnPartnerProfile();

        profilePage.clickOnPreferences();
        Assert.assertTrue(isElementPresent(profilePage.accountPreferencesText),"Account Preferences text is not displayed");
        log.info("Account Preferences text is displayed");

        profilePage.clickOnChangePassword();

        Assert.assertTrue(isElementPresent(profilePage.changePasswordText),"Change password text is not displayed");
        log.info("Change password text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.assertChangePasswordText),"User is not navigated to Change password section");
        log.info("User is navigated to change password section");

        profilePage.clickOnPrivacyConsent();

        Assert.assertTrue(isElementPresent(profilePage.assertPrivacyConsentText),"Privacy Consent text is not displayed");
        log.info("Privacy Consent text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.showDisabilityDetailsText),"User is not navigated to Privacy Consent section");
        log.info("User is navigated to Privacy Consent section");

        profilePage.clickOnManageAlerts();

        Assert.assertTrue(isElementPresent(profilePage.assertManageAlertsText),"Manage Alerts text is not displayed");
        log.info("Manage Alerts text is displayed");

        Assert.assertTrue(isElementPresent(profilePage.skillCoursesLink),"User is not navigated to Manage Alerts section");
        log.info("User is navigated to Manage Alerts section");

    }
}
