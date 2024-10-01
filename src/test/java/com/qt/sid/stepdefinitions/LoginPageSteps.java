package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;

import com.qt.sid.bdd.utils.FileReaderManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qt.sid.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoginPageSteps extends BasePage {

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;
    LoginPage loginPage;

    MyDashboardPage myDashboardPage;

    SchemesPage schemesPage;

    MyDashboard myDashboard;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public LoginPageSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().getLoginPage();
        myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
        schemesPage = testContext.getPageObjectManager().getSchemesPage();
        myDashboard = testContext.getPageObjectManager().getmyDashboard();



    }

	

    @Then("I verify role popup in register page")
    public void i_verify_role_popup_in_register_page() {
        Assert.assertEquals(getTextOfObject(loginPage.registerBtn),"REGISTER");

       loginPage.clickOnRegister();
       
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
    
    @Then("I verify enter mobilenumber popup in register page")
    public void i_verify_enter_mobilenumber_popup_in_register_page() {
       loginPage.selectLearnerRole();

        Assert.assertTrue(isElementPresent(loginPage.skillIndiaLogo),"Skill India Logo is not displayed in the popup");
        log.info("Skill India Logo is displayed");

        Assert.assertTrue(isElementPresent(loginPage.WelcomeToSkillIndiaDigitalTextInMobileNumberPopup),"Welcome to Skill India Digital text is not displayed in the popup");
        log.info("Welcome to Skill India Digital text is displayed");

       
       Assert.assertTrue(isElementPresent(loginPage.letsGetStartedInPopup),"Let's get started is not displayed in the popup");
       log.info("Let's get started text is displayed");
       
       Assert.assertTrue(isElementPresent(loginPage.learnerRoleInMobNumPopup),"Selected Learner role is not displayed");
       log.info("Selected Learner role is displayed in Enter mobile number popup");


       Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
       log.info("Mobile number field is displayed in popup");
       
       
       Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not displayed");
       log.info("Continue button is displayed");
       boolean continueBtn = loginPage.continueBtn.isEnabled();
       Assert.assertEquals(continueBtn,false,"By default continue button is disabled");
       
       Assert.assertTrue(isElementPresent(loginPage.termsAndConditionsLink),"Terms and conditions link is not displayed");
       log.info("Terms and conditions link is displayed");
       
       Assert.assertTrue(isElementPresent(loginPage.privacyPolicyLink),"Privacy policy link is not displayed");
       log.info("Privacy policy link is displayed in the popup");
       
       

    }



    @Then("I verify Mobile number is not valid message for invalid mobile number")
    public void i_verify_mobile_number_is_not_valid_message_for_invalid_mobile_number() {
        loginPage.selectLearnerRole();
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

        loginPage.clickOnClearMobileNumber();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.enterYourPasswordText),"Enter your password text is not displayed ");
        log.info("Enter your password text is displayed ");

    }

    @Then("I verify Invalid Mobile number or password message for invalid password")
    public void i_verify_invalid_mobile_number_or_password_message_for_invalid_password() {
        loginPage.enterPasswordValuesForAssessor();

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.incorrectMobNumAndPasswordMsg),"Incorrect Mobile number or password message is not displayed");
        log.info("Incorrect Mobile number or password message is displayed for wrong password");
    }


    @When("I verify enter mobilenumber and click continue")
    public void i_verify_enter_mobilenumber_and_click_continue(){
       loginPage.clickOnMobileNumberEditField();
      
       loginPage.sendMobileNumberForEdit();

       loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.otpSentMessage),"OTP sent message is not displayed");
        log.info("OTP sent successfully message is displayed");
       
       Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"One Time Password(OTP) text is not displayed ");
       log.info("One Time Password(OTP) text is displayed ");
       
       Assert.assertTrue(isElementPresent(loginPage.editBtn),"Edit button is not displayed");
       log.info("Edit button is displayed in Role popup");
       


    }

    @Then("I verify password page and Login button")
    public void i_verify_password_page_and_login_button(){
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

        loginPage.enterPasswordValues();

        boolean loginButtonAfterEnteringPassword = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginButtonAfterEnteringPassword,true);
        log.info("Login button enabled after entering the password");

        loginPage.clickOnLogin();

        loginPage.visibilityOfMyDashboard();
        Assert.assertTrue(isElementPresent(loginPage.myDashboardLink),"My Dashboard link is not displayed");
        log.info("My Dashboard link is displayed");
        log.info("Learner is able to login successfully");


    }
    
    @Then("I verify click on edit")
    public void i_verify_click_on_edit(){
    	
         loginPage.clickOnEdit();

         waitWebDriver(4000);
         waitForElementToAppear(loginPage.mobileNumberEditField);

        String enteredMobileNumber = ((JavascriptExecutor) driver).executeScript("return document.getElementById('number').value").toString();
        System.out.println(enteredMobileNumber);

         Assert.assertEquals(enteredMobileNumber,FileReaderManager.getInstance().getConfigReader().getMobileNumberForEditBtnVerify());

         Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
         log.info("Post clickign edit button redirected to Mobile number field is displayed");
         
         Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not displayed");
         log.info("Continue button is displayed");
        
    }
    
    
    @When("I verify click on login with learner")
    public void i_verify_click_on_login_with_learner(){
    	 loginPage.clickLoginButton();
    	 
    	 Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
         log.info("Learner role is displayed in Role popup");
         
         Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
         log.info("Partner role is displayed in Role popup");
         
    	 loginPage.selectLearnerRole();
    	 loginPage.clickOnMobileNumberEditField();
    	 
        
         loginPage.sendMobileNumberToTextField();
         
         loginPage.clickOnContinue();
        
         
         loginPage.enterPasswordValues();

         boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
         Assert.assertEquals(loginBtn,true);
         
         loginPage.clickOnLogin();
        
         loginPage.visibilityOfMyDashboard();
         Assert.assertTrue(isElementPresent(loginPage.myDashboardLink),"My Dashboard link is not displayed");
         log.info("My Dashboard link is displayed");
         log.info("Learner is able to login successfully");
        
      
    }

    @When("I verify click on login with learner without eKYC")
    public void i_verify_click_on_login_with_learne_without_ekyc(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectLearnerRole();
        loginPage.clickOnMobileNumberEditField();

        loginPage.sendRegisteredMobileNumberWithouteKYC();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginBtn,true);

        loginPage.clickOnLogin();

        loginPage.visibilityOfMyDashboard();
        Assert.assertTrue(isElementPresent(loginPage.myDashboardLink),"My Dashboard link is not displayed");
        log.info("My Dashboard link is displayed");
        log.info("Learner is able to login successfully");


    }

    @Then("I verify color of Login button post entering the password")
    public void i_verify_color_of_login_button_post_entering_the_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectLearnerRole();
        loginPage.clickOnMobileNumberEditField();


        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginBtn,true);

        loginPage.verifyTheColorOfLoginButton();
    }

    @Then("I verify welcome popup in Login page")
    public void i_verify_welcome_popup_in_login_page() {
        Assert.assertEquals(getTextOfObject(loginPage.loginBtn),"LOGIN");

        loginPage.verifyLoginButtonColor();

        loginPage.clickLoginButton();

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

    @Then("I verify user navigated to OTP page once user clicks on forgot password link")
    public void i_verify_user_navigated_to_otp_page_once_user_clicks_on_forgot_password_link() {
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
        log.info("Welcome to Skill India Digital text is displayed");

        loginPage.selectLearnerRole();
        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"User is not navigated to OTP page");
        log.info("User is navigated to OTP page and OTP sent successfully");

    }

    @Then("I verify user navigated to OTP page once user clicks on forgot password link for Learning Partner")
    public void i_verify_user_navigated_to_otp_page_once_user_clicks_on_forgot_password_link_for_learning_partner() {
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
        log.info("Welcome to Skill India Digital text is displayed");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard),"Learning partner card is not displayed");

        loginPage.clickOnLearningPartnerLoginBtn();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"User is not navigated to OTP page");
        log.info("User is navigated to OTP page and OTP sent successfully");

    }

    @Then("I verify Invalid OTP message for incorrect OTP entered")
    public void i_verify_invalid_otp_message_for_incorrect_otp_entered(){
        loginPage.enterInvalidOTP();

        Assert.assertTrue(isElementPresent(loginPage.incorrectOTPErrorMessage),"Incorrect OTP error message is not displayed");
        log.info("Incorrect OTP error message is displayed");
    }



    @When("I verify click on login with trainer")
    public void i_verify_click_on_login_with_trainer(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnTrainerLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainerRoleInMobileNumberField),"Trainer role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.sessionOverviewSection),"Session Overview section is not displayed");
        log.info("Session overview section is displayed");

    }

    
    @Then("I verify learner is able to logout")
    public void i_verify_learner_is_able_to_logout(){
    	//landingPage.scrollToPageEnd();
    	
    	 loginPage.clickOnProfile();
    	 landingPage.scrollToElement(loginPage.settingsSection);
    	 
    	 landingPage.scrollToElement(loginPage.manageAlertsSection);
    	
    	 
 //   	 loginPage.clickOnLogout();
//        
//         
//         Assert.assertTrue(isElementPresent(loginPage.registerBtn),"Register button is not displayed");
//         log.info("Register button is displayed");
//         
//         Assert.assertTrue(isElementPresent(loginPage.loginBtn),"Login button is not displayed");
//         log.info("Login button is displayed");
//        
    }

    @Then("I verify learner login page")
    public void iVerifyLearnerLoginPage() {
        Assert.assertEquals(myDashboardPage.getTextLoginAsLernerVerify(),"My Dashboard","expected is "+myDashboardPage.getTextLoginAsLernerVerify());
    }

    @When("Login to the application as a Partner tab mobilizer {string},{string}")
    public void loginToTheApplicationAsAPartnerTabMobilizer(String mobileNumber, String password) {
        loginPage.logoinAppAsMobilizer(mobileNumber,password);
    }

    @Then("I verify Mobilizer tab login page")
    public void iVerifyMobilizerTabLoginPage() {
    	//myDashboardPage.clickOnCloseBtn();
        waitWebDriver(3000);
        Assert.assertEquals(myDashboardPage.getTextLoginAsParnerVerify(),"Mobilizer","expected is "+myDashboardPage.getTextLoginAsParnerVerify());

    }

    
    @When("I verify click on login with learning partner")
    public void i_verify_click_on_login_with_learning_partner(){
    	 loginPage.clickLoginButton();
         
         Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
         log.info("Partner role is displayed in Role popup");
         
    	 loginPage.selectPartnerRole();
    	 
    	 Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard),"Learning partner card is not displayed");
    	 
    	 loginPage.clickOnLearningPartnerLoginBtn();
    	 
    	 loginPage.clickOnMobileNumberEditField();
    	 
        
         loginPage.sendLearningPartnerMobileNumberToTextField();
         
         loginPage.clickOnContinue();
        
         if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
             loginPage.enterPasswordValuesForLearningPartner();
             waitWebDriver(2000);
         }else{
             loginPage.enterPasswordValues();
             waitWebDriver(2000);
         }
         
         loginPage.clickOnLogin();

         waitWebDriver(5000);
        
         Assert.assertTrue(isElementPresent(loginPage.assertOverview),"Overview is not displayed");
         log.info("Overview is displayed");
         log.info("Learning Partner is able to login successfully");
        
      
    }

    @When("I verify click on login with learning partner for LMS")
    public void i_verify_click_on_login_with_learning_partner_for_lms(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard),"Learning partner card is not displayed");

        loginPage.clickOnLearningPartnerLoginBtn();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginBtn,true);

        loginPage.clickOnLogin();

        waitWebDriver(3000);

        Assert.assertTrue(isElementPresent(loginPage.assertOverview),"Overview is not displayed");
        log.info("Overview is displayed");
        log.info("Learning Partner is able to login successfully");


    }
    
    @Then("verify mobilizer navigated to My Dashboard Page")
    public void verify_mobilizer_navigated_to_my_dashboard_page() {
        loginPage.clickOnPartnerProfile();	
        
        loginPage.clickOnMyDashboard();
        
        Assert.assertEquals(myDashboardPage.getTextLoginAsParnerVerify(),"Mobilizer","expected is "+myDashboardPage.getTextLoginAsParnerVerify());
    }


    @Then("I verify user navigated to terms and conditions page from welcome popup")
    public void i_verify_user_navigated_to_terms_and_conditions_page_from_welcome_popup(){
        loginPage.clickOnTermsAndConditionsLinkInWelcomePopup();

        Assert.assertTrue(isElementPresent(loginPage.assertTermsAndConditionsPageText),"User is not navigated to terms and conditions page");
        log.info("User successfully navigated to Terms and conditions page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getWelcomePopupTermsAndConditions()),"User is not navigated to terms and conditions page");

        Set<String> s = driver.getWindowHandles();

        System.out.println(s.size());
        if(s.size()==1){
            log.info("User navigated to terms and conditions page in the same tab");
        }

    }


    @Then("I verify user navigated to privacy policy page from welcome popup in Login")
    public void i_verify_user_navigated_to_privacy_policy_page_from_welcome_popup_in_login(){
        loginPage.clickLoginButton();

        loginPage.clickOnPrivacyPolicyLinkInWelcomePopup();

        Assert.assertTrue(isElementPresent(loginPage.assertPrivacyPolicyText),"User is not navigated to Privacy policy page");
        log.info("User successfully navigated to Privacy policy page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getWelcomePopupPrivacyPolicy()),"User is not navigated to Privacy policy page");

        Set<String> s = driver.getWindowHandles();

        System.out.println(s.size());
        if(s.size()==1){
            log.info("User navigated to privacy policy page in the same tab");
        }
    }

    @Then("I verify user navigated to privacy policy page from welcome popup")
    public void i_verify_user_navigated_to_privacy_policy_page_from_welcome_popup(){
        loginPage.clickOnRegister();

        loginPage.clickOnPrivacyPolicyLinkInWelcomePopup();

        Assert.assertTrue(isElementPresent(loginPage.assertPrivacyPolicyText),"User is not navigated to Privacy policy page");
        log.info("User successfully navigated to Privacy policy page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getWelcomePopupPrivacyPolicy()),"User is not navigated to Privacy policy page");

        Set<String> s = driver.getWindowHandles();

        System.out.println(s.size());
        if(s.size()==1){
            log.info("User navigated to privacy policy page in the same tab");
        }
    }

    @Then("I verify user remains on the same page post clicking close option")
    public void i_verify_user_remains_on_the_same_page_post_clicking_close_option(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.closeBtnInWelcomePopup),"Close button is not displayed");
        log.info("Close button is displayed in welcome popup");

        loginPage.clickOnCloseButtonInWelcomePopup();

        Assert.assertTrue(isElementPresent(loginPage.assertPrivacyPolicyText),"User is not there on the Privacy policy page");
        log.info("User remains on the same Privacy policy page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getWelcomePopupPrivacyPolicy()),"User is not there on the Privacy policy page");
    }

    @Then("I verify back option in the registration page and verify navigates to previous page post clicking it")
    public void i_verify_back_option_in_the_registration_page_and_verify_navigates_to_previous_page_post_clicking_it(){
        loginPage.selectLearnerRole();

        Assert.assertTrue(isElementPresent(loginPage.backButtonInRegistrationPage),"Back hyperlink is not displayed in registration page");
        log.info("Back butotn hyperlink is displayed in Registration page");

        loginPage.clickOnBackButtonHyperlink();

        Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
        log.info("Welcome to Skill India Digital text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.defaultRoleSelected),"Default role is not selected");
        log.info("Default role is selected post clicking back button");


    }

    @Then("I verify user remains on the same page post clicking close option in registration page")
    public void i_verify_user_remains_on_the_same_page_post_clicking_close_option_in_registration_page(){
        loginPage.selectLearnerRole();

        Assert.assertTrue(isElementPresent(loginPage.closeOptionInRegistrationPage),"Close option is not displayed in registration page");
        log.info("Close option is displayed in registration page");

        loginPage.clickOnCloseOptionInRegistrationField();
        Assert.assertTrue(isElementPresent(loginPage.registerBtn),"User is not there on the home page");
        log.info("User remains on the same home page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getHomePageUrlToVerify()),"User is not there on the home page");

    }

    @Then("I verify user navigated to terms and conditions from Registration Page")
    public void i_verify_user_navigated_to_terms_and_conditions_from_registration_page(){
        loginPage.clickOnTermsAndConditionsLinkFromRegistrationPage();

        Assert.assertTrue(isElementPresent(loginPage.assertTermsAndConditionsPageText),"User is not navigated to terms and conditions page");
        log.info("User successfully navigated to Terms and conditions page ");

        Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getWelcomePopupTermsAndConditions()),"User is not navigated to terms and conditions page");

        Set<String> s = driver.getWindowHandles();

        System.out.println(s.size());
        if(s.size()==1){
            log.info("User navigated to terms and conditions page in the same tab");
        }
    }

    @Then("I verify user navigated to Privacy Policy from Registration Page")
    public void i_verify_user_navigated_to_privacy_policy_from_registration_page(){
        loginPage.clickOnRegister();
        loginPage.selectLearnerRole();
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

    @Then("I verify Continue button enabled after entering valid mobile number")
    public void i_verify_continue_button_enabled_after_entering_valid_mobile_number(){
        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberForEdit();

        Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not displayed");

        boolean value1 = loginPage.continueBtn.isEnabled();

        Assert.assertEquals(value1,true);
        log.info("Continue button is enable after entering the valide mobile number");

    }

    @Then("I verify continue button disabled by default")
    public void i_verify_continue_button_disabled_by_default(){
        Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not present on the registration page");
        log.info("Continue button is present on the registration page");

        boolean value3 = loginPage.continueBtn.isEnabled();

        Assert.assertEquals(value3,false);
        log.info("Continue button is disabled by default");
    }

    @Then("I verify mobile number required and mobile number not valid message and continue button disabled")
    public void i_verify_mobile_number_required_and_mobile_number_not_valid_message_and_continue_button_disabled(){
        loginPage.clickOnClearMobileNumber();

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberRequiredMsg),"Mobile number is required message is not displayed");
        log.info("Mobile number is required message is displayed");

        boolean value2 = loginPage.continueBtn.isEnabled();

        Assert.assertEquals(value2,false);
        log.info("Continue button is disabled after clearing the mobile number");

        loginPage.clickOnMobileNumberEditField();
        loginPage.sendInvalidMobileNumber();

        Assert.assertTrue(isElementPresent(loginPage.mobileIsNotValidMsg),"Mobile number is not valid message is not displayed");
        log.info("Mobile number is not valid message is displayed");

    }

    @Then("I verify learner navigated to OTP page and navigate back to mobile number field when click on Edit in OTP Page")
    public void i_verify_learner_navigated_to_otp_page_and_navigate_back_to_mobile_number_field_when_click_on_edit_in_otp_page(){

        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberForEdit();
        loginPage.clickOnContinue();

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"One Time Password(OTP) text is not displayed ");
        log.info("One Time Password(OTP) text is displayed ");

        Assert.assertTrue(isElementPresent(loginPage.enterSixDigitCodeText),"Enter 6 digit code received on your mobile number text is not displayed");
        log.info("Enter 6 digit code received on your mobile number text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.editBtn),"Edit button is not displayed");
        log.info("Edit button is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.timer),"Timer is not displayed");
        log.info("Timer is displayed in OTP page");

        loginPage.clickOnEdit();

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Post clicking edit button redirected to Mobile number field is displayed");

        loginPage.clickOnMobileNumberEditField();
        loginPage.sendMobileNumberForEdit();
        log.info("User able to enter mobile number");

    }

    @Then("I verify Continue button spelling in registration page")
    public void i_verify_continue_button_spelling_in_registration_page(){

        Assert.assertEquals(getTextOfObject(loginPage.continueBtn),"CONTINUE");
        log.info("Continue button font is properly displayed to the user");

        log.info("Continue button spelling is correct");

        loginPage.verifyContinueButtonColor();
    }


    @Then("I verify click on register with learning partner and Mobilizer")
    public void i_verify_click_on_register_with_learning_partner() {
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.partnerRole), "Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.registerAsText),"Register as text is not displayed");
        log.info("Register as text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard), "Learning partner card is not displayed");
        log.info("Learning Partner card is displayed");

        Assert.assertTrue(isElementPresent(loginPage.mobilizerRoleCard),"Mobilizer card is not displayed");
        log.info("Mobilizer card is displayed");

        loginPage.clickOnLearningPartnerRegister();

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard), "Selected Learning partner Role is not displayed");
        log.info("Selected Learning Partner role is displayed");

    }

    @Then("I verify trainer dashboard section with logged in trainer")
    public void i_verify_trainer_dashboard_section_with_logged_in_trainer(){
        waitForElementToAppear(loginPage.virtualSessions);
        Assert.assertTrue(isElementPresent(loginPage.virtualSessions),"Virtual sessions section is not displayed");
        log.info("Virtual sessions section is displayed");

        Assert.assertTrue(isElementPresent(loginPage.reviewsAndRatings),"Reviews and ratings section is not displayed");
        log.info("Reviews and ratings section is displayed");
    }

    @Then("I verify state user dashboard section for logged in state user")
    public void i_verify_state_user_dashboard_section_for_logged_in_state_user(){
        waitForElementToAppear(loginPage.requestForCorrectionSection);
        Assert.assertTrue(isElementPresent(loginPage.requestForCorrectionSection),"Request for Correction section is not displayed");
        log.info("Request for Correction section is displayed");

        Assert.assertTrue(isElementPresent(loginPage.ITITraineeDataUploadedSection),"ITI Trainee data uploaded section is not displayed");
        log.info("ITI Trainee data uploaded section is displayed");
    }

    @Then("I verify ITI dashboard section for logged in ITI user")
    public void i_verify_iti_dashboard_section_for_logged_in_iti_user(){
        waitForElementToAppear(loginPage.dashboardSection);
        Assert.assertTrue(isElementPresent(loginPage.dashboardSection),"Dashboard section is not displayed");
        log.info("Dashboard section is displayed");

        Assert.assertTrue(isElementPresent(loginPage.ITITraineeSection),"ITI Trainee section is not displayed");
        log.info("ITI Trainee section is displayed");
    }

    @Then("I verify training provider dashboard section for logged in training provider user")
    public void i_verify_training_provider_dashboard_section_for_logged_in_training_provider_user(){
        waitForElementToAppear(loginPage.ExploreNowBtn);
        Assert.assertTrue(isElementPresent(loginPage.ExploreNowBtn),"Explore now button is not displayed");
        log.info("Explore now button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfTrainingCenter),"Total no of Training center is not displayed");
        log.info("Total no of training center is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfSchemes),"Total no of schemes is not displayed");
        log.info("Total no of schemes is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfBatches),"Total no of batches is not displayed");
        log.info("Total no of batches is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfCandidatesTrained),"Total no of candidates trained is not displayed");
        log.info("Total no of candidates trained is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfCandidatesCertified),"Total no of candidates certified is not displayed");
        log.info("Total no of candidates certified is displayed");

    }

    @Then("I verify training centre dashboard section for logged in training centre user")
    public void i_verify_training_centre_dashboard_section_for_logged_in_training_centre_user(){
        waitForElementToAppear(loginPage.ExploreNowBtn);
        Assert.assertTrue(isElementPresent(loginPage.ExploreNowBtn),"Explore now button is not displayed");
        log.info("Explore now button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfSchemes),"Total no of schemes is not displayed");
        log.info("Total no of schemes is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfBatches),"Total no of batches is not displayed");
        log.info("Total no of batches is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfCandidatesTrained),"Total no of candidates trained is not displayed");
        log.info("Total no of candidates trained is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalNoOfCandidatesCertified),"Total no of candidates certified is not displayed");
        log.info("Total no of candidates certified is displayed");

    }

    @Then("I verify awarding body dashboard section for logged in awarding body user")
    public void i_verify_awarding_body_dashboard_section_for_logged_in_awarding_body_user(){
        waitForElementToAppear(loginPage.ExploreNowBtn);
        Assert.assertTrue(isElementPresent(loginPage.ExploreNowBtn),"Explore now button is not displayed");
        log.info("Explore now button is displayed");

        Assert.assertTrue(isElementPresent(loginPage.QPCreated),"QP Created is not displayed");
        log.info("QP Created  is displayed");

        Assert.assertTrue(isElementPresent(loginPage.QPApproved),"QP Approved is not displayed");
        log.info("QP Approved is displayed");

        Assert.assertTrue(isElementPresent(loginPage.NOSesCreated),"NOSes Created is not displayed");
        log.info("NOSes Created is displayed");

        Assert.assertTrue(isElementPresent(loginPage.NOSesApproved),"NOSes Approved is not displayed");
        log.info("NOSes Approved  is displayed");

    }

    @Then("I verify DGT Admin dashboard section for logged in DGT Admin user")
    public void i_verify_dgt_admin_dashboard_section_for_logged_in_dgt_admin_user(){
        waitForElementToAppear(loginPage.dashboardSection);

        Assert.assertTrue(isElementPresent(loginPage.overview),"Overview is not displayed");
        log.info("Overview is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardSection),"Dashboard is not displayed");
        log.info("Dashboard is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalTraineeUploaded),"Total Trainee uploaded is not displayed");
        log.info("Total Trainee uploaded  is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalTraineeSentBack),"Total Trainee Sent back is not displayed");
        log.info("Total Trainee Sent back is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalInvitesSent),"Total Invites Sent is not displayed");
        log.info("Total Invites Sent is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalTraineesRegistered),"Total Trainee Registered is not displayed");
        log.info("Total Trainee Registered is displayed");

        Assert.assertTrue(isElementPresent(loginPage.totalPRNGenerated),"Total PRN Generated is not displayed");
        log.info("Total PRN Generated is displayed");

        Assert.assertTrue(isElementPresent(loginPage.completeYourAadhaarEkyc),"Complete your Aadhaar eKYC is not displayed");
        log.info("Complete your Aadhaar eKYC is displayed");

        Assert.assertTrue(isElementPresent(loginPage.nationDropdown),"Nation dropdown is not displayed");
        log.info("Nation dropdown is displayed");

    }

    @Then("I verify Assessor dashboard section for logged in Assessor user")
    public void i_verify_assessor_dashboard_section_for_logged_in_assessor_user(){
        waitForElementToAppear(loginPage.dashboardSection);
        Assert.assertTrue(isElementPresent(loginPage.dashboardSection),"Dashboard is not displayed");
        log.info("Dashboard is displayed");

        Assert.assertTrue(isElementPresent(loginPage.assessorLink),"Assessor is not displayed");
        log.info("Assessor  is displayed");

        Assert.assertTrue(isElementPresent(loginPage.batchesAssigned),"Batches Assigned is not displayed");
        log.info("Batches Assigned is displayed");

        Assert.assertTrue(isElementPresent(loginPage.batchesAssessed),"Batches Assessed is not displayed");
        log.info("Batches Assessed is displayed");

        Assert.assertTrue(isElementPresent(loginPage.candidatesAssessed),"Candidates Assessed is not displayed");
        log.info("Candidates Assessed  is displayed");

        Assert.assertTrue(isElementPresent(loginPage.candidatesCertified),"Candidates Certified is not displayed");
        log.info("Candidates Certified is displayed");

    }

    @Then("I verify Assessment Agency dashboard section for logged in Assessment Agency user")
    public void i_verify_assessment_agency_dashboard_section_for_logged_in_assessment_agency_user(){
        waitForElementToAppear(loginPage.dashboardSection);
        Assert.assertTrue(isElementPresent(loginPage.dashboardSection),"Dashboard is not displayed");
        log.info("Dashboard is displayed");

        Assert.assertTrue(isElementPresent(loginPage.assessmentAgencyLink),"Assessment Agency is not displayed");
        log.info("Assessment Agency  is displayed");

        Assert.assertTrue(isElementPresent(loginPage.batchesAssigned),"Batches Assigned is not displayed");
        log.info("Batches Assigned is displayed");

        Assert.assertTrue(isElementPresent(loginPage.batchesAssessed),"Batches Assessed is not displayed");
        log.info("Batches Assessed is displayed");

        Assert.assertTrue(isElementPresent(loginPage.candidatesAssessed),"Candidates Assessed is not displayed");
        log.info("Candidates Assessed  is displayed");

        Assert.assertTrue(isElementPresent(loginPage.candidatesCertified),"Candidates Certified is not displayed");
        log.info("Candidates Certified is displayed");

    }

    @Then("I verify BTP user able to login to application and click on explore now button")
    public void i_verify_btp_user_able_to_login_to_application_and_click_on_explore_now_button(){
        Assert.assertTrue(isElementPresent(loginPage.BTPLinkInDashboard),"BTP Link is not displayed");
        log.info("BTP Link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardIsInProgressHeader),"Dashboard is in progress is not displayed");
        log.info("Dashboard is in progress is displayed");

        String parentWindow = driver.getWindowHandle();

        loginPage.clickOnExploreNowBtn();
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Assert.assertTrue(isElementPresent(loginPage.apprenticeshipOpportunities),"User is not navigated to Apprenticeship Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);


    }

    @Then("I verify TPA user able to login to application and click on explore now button")
    public void i_verify_tpa_user_able_to_login_to_application_and_click_on_explore_now_button(){
        Assert.assertTrue(isElementPresent(loginPage.TPALinkInDashboard),"TPA Link is not displayed");
        log.info("TPA Link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardIsInProgressHeader),"Dashboard is in progress is not displayed");
        log.info("Dashboard is in progress is displayed");


        loginPage.clickOnExploreNowBtn();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Assert.assertTrue(isElementPresent(loginPage.apprenticeshipOpportunities),"User is not navigated to Apprenticeship Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);


    }

    @Then("I verify NSDC Admin user able to login to application and click on explore now button")
    public void i_verify_NSDC_Admin_user_able_to_login_to_application_and_click_on_explore_now_button(){
        Assert.assertTrue(isElementPresent(loginPage.NSDCAdminLinkInDashboard),"NSDC Admin is not displayed");
        log.info("Establishment Link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardIsInProgressHeader),"Dashboard is in progress is not displayed");
        log.info("Dashboard is in progress is displayed");

        loginPage.clickOnExploreNowBtn();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Assert.assertTrue(isElementPresent(loginPage.apprenticeshipOpportunities),"User is not navigated to Apprenticeship Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify ApprenticeshipSSC user able to login to application and click on explore now button")
    public void i_verify_ApprenticeshipSSC_user_able_to_login_to_application_and_click_on_explore_now_button(){
        Assert.assertTrue(isElementPresent(loginPage.ApprenticeshipSSCLinkInDashboard),"ApprenticeshipSSC Link is not displayed");
        log.info("RDSDE Link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardIsInProgressHeader),"Dashboard is in progress is not displayed");
        log.info("Dashboard is in progress is displayed");


        loginPage.clickOnExploreNowBtn();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Assert.assertTrue(isElementPresent(loginPage.apprenticeshipOpportunities),"User is not navigated to Apprenticeship Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);


    }

    @Then("I verify NSTI dashboard section for logged in NSTI user")
    public void i_verify_NSTI_dashboard_section_for_logged_in_NSTI(){
        waitForElementToAppear(loginPage.dashboardSection);
        Assert.assertTrue(isElementPresent(loginPage.dashboardSection),"Dashboard is not displayed");
        log.info("Dashboard is displayed");

        Assert.assertTrue(isElementPresent(loginPage.NSTILink),"NSTI is not displayed");
        log.info("NSTI  is displayed");


    }

    @Then("I verify Establishment user able to login to application and click on explore now button")
    public void i_verify_establishment_user_able_to_login_to_application_and_click_on_explore_now_button(){
        Assert.assertTrue(isElementPresent(loginPage.establishmentLinkInDashboard),"Establishment Link is not displayed");
        log.info("Establishment Link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardIsInProgressHeader),"Dashboard is in progress is not displayed");
        log.info("Dashboard is in progress is displayed");

        loginPage.clickOnExploreNowBtn();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Assert.assertTrue(isElementPresent(loginPage.apprenticeshipOpportunities),"User is not navigated to Apprenticeship Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }


    @When("I verify click on login with state user")
    public void i_verify_click_on_login_with_state_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnStateUserLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.stateUserRole),"State role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")){
            // prod
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getStateCredForProdFromProperty());
        }else{
            // UAT
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getStateCredForUATFromProperty());
        }
        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.stateOverviewSection),"State Overview section is not displayed");
        log.info("State overview section is displayed");

    }


    @When("I verify click on login with ITI user")
    public void i_verify_click_on_login_with_iti_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnITILoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.ITIRole),"ITI role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")){
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getITICredForProdFromProperty());
        }else {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getITICredForUATFromProperty());
        }

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.ITIOverviewSection),"ITI Overview section is not displayed");
        log.info("ITI overview section is displayed");

    }

    @When("I verify click on login with DGT Admin user")
    public void i_verify_click_on_login_with_dgt_admin_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnDGTAdminLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.DGTAdminRole),"DGT Admin role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")){
             loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getDGTAdminCredForProdFromProperty());
        }else{
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getDGTAdminCredForUATFromProperty());
        }

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

    }

    @When("I verify click on login with Assessor user")
    public void i_verify_click_on_login_with_assessor_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnAssessorLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.assessorRole),"Assessor role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")){
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithLearner());
            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
            waitWebDriver(2000);
        }else{
            loginPage.mobileNumberEditField.sendKeys("8083957194");

            loginPage.clickOnContinue();
            loginPage.enterPasswordValuesForAssessor();
            waitWebDriver(2000);
        }
        loginPage.clickOnLogin();

    }

    @When("I verify click on login with Assessment Agency user")
    public void i_verify_click_on_login_with_assessment_agency_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnAssessmentAgencyLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.assessmentAgencyRole),"Assessment Agency role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.mobileNumberEditField.sendKeys("");
            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
            waitWebDriver(2000);

        }else{
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getAssessmentAgencyCredForUATFromProperty());

            loginPage.clickOnContinue();

            loginPage.enterPasswordValuesForAssessor();
            waitWebDriver(2000);
        }

        loginPage.clickOnLogin();

    }

    @When("I verify click on login with RDSDE user")
    public void i_verify_click_on_login_with_RDSDE(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnRDSDELoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.RDSDERole),"RDSDE role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextFieldWithRDSDERole();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        // Assert.assertTrue(isElementPresent(loginPage.TrainingProviderLink),"Training Provider link is not displayed");
        log.info("Training Provider link is displayed");

    }

    @Then("I verify RDSDE user able to login to application and click on explore now button")
    public void i_verify_RDSDE_user_able_to_login_to_application_and_click_on_explore_now_button(){
        Assert.assertTrue(isElementPresent(loginPage.RDSDELinkInDashboard),"RDSDE Link is not displayed");
        log.info("RDSDE Link is displayed");

        Assert.assertTrue(isElementPresent(loginPage.dashboardIsInProgressHeader),"Dashboard is in progress is not displayed");
        log.info("Dashboard is in progress is displayed");


        loginPage.clickOnExploreNowBtn();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Assert.assertTrue(isElementPresent(loginPage.apprenticeshipOpportunities),"User is not navigated to Apprenticeship Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);


    }

    @When("I verify click on login with BTP user")
    public void i_verify_click_on_login_with_btp_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnBTPLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.BTPRole),"BTP role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getBTPCredFromProperty());
            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
            waitWebDriver(2000);
        }else{
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getBTPCredFromProperty());

            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
            waitWebDriver(2000);
        }

        loginPage.clickOnLogin();

    }

    @When("I verify click on login with TPA user")
    public void noi_verify_click_on_login_with_tpa_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnTPALoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.TPARole),"TPA role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getTPACredFromProperty());
            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
            waitWebDriver(2000);
        }else {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getTPACredFromProperty());

            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
            waitWebDriver(2000);
        }

        loginPage.clickOnLogin();

    }

    @When("I verify click on login with Establishment user")
    public void i_verify_click_on_login_with_establishment_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnEstablishmentLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.establishmentRole),"Establishment role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getEstablishmentCredFromProperty());
            loginPage.clickOnContinue();

            loginPage.enterPasswordValuesForEstablishment();
            waitWebDriver(2000);
        }else {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getEstablishmentCredFromProperty());

            loginPage.clickOnContinue();

            loginPage.enterPasswordValuesForEstablishment();
            waitWebDriver(2000);
        }

        loginPage.clickOnLogin();

    }


    @When("I verify click on login with NSDC Admin user")
    public void i_verify_click_on_login_with_nsdc_admin_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnNSDCAdminLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.NSDC_AdminRole),"NSTI role is not selected");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.sendMobileNumberToNSDCAdminRole();
            loginPage.clickOnContinue();
            loginPage.enterPasswordValues();

        }else {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getEstablishmentCredFromProperty());
            loginPage.clickOnContinue();

            loginPage.enterPasswordValuesForEstablishment();
            waitWebDriver(2000);

        }

        loginPage.clickOnLogin();

        // Assert.assertTrue(isElementPresent(loginPage.TrainingProviderLink),"Training Provider link is not displayed");
        log.info("Training Provider link is displayed");

    }

    @When("I verify click on login with ApprenticeshipSSC user")
    public void i_verify_click_on_login_with_ApprenticeshipSSC(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnApprenticeshipSSCLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.ApprenticeshipSSCRole),"ApprenticeshipSSC role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToApprenticeshipSSCRole();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        // Assert.assertTrue(isElementPresent(loginPage.TrainingProviderLink),"Training Provider link is not displayed");
        log.info("Training Provider link is displayed");

    }


    @When("I verify click on login with NSTI user")
    public void i_verify_click_on_login_with_NSTI(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();
        loginPage.clickOnNSTILoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.NSTIRole),"NSTI role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToNSTIRole();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        // Assert.assertTrue(isElementPresent(loginPage.TrainingProviderLink),"Training Provider link is not displayed");
        log.info("Training Provider link is displayed");

    }



    @When("I verify click on login with training partner")
    public void i_verify_click_on_login_with_training_partner(){
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


        loginPage.enterPasswordValues();

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.TrainingProviderLink),"Training Provider link is not displayed");
        log.info("Training Provider link is displayed");

    }

    @When("I verify click on login with training center user")
    public void i_verify_click_on_login_with_training_center_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnTrainingCentreLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.trainingCentreRole),"Training Centre role is not selected");

        loginPage.clickOnMobileNumberEditField();

        if(driver.getCurrentUrl().contains("skillindiadigital.gov.in")) {
            loginPage.sendMobileNumberToTextField();

            loginPage.clickOnContinue();

            loginPage.enterPasswordValues();
        }else {
            loginPage.mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getTCUserCredForUATFromProperty());

            loginPage.clickOnContinue();

            loginPage.enterPasswordValuesForTC();
            waitWebDriver(2000);
        }

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.TrainingCentreLink),"Training Centre link is not displayed");
        log.info("Training Centre link is displayed");

    }

    @When("I verify click on login with awarding body user")
    public void i_verify_click_on_login_with_awarding_body_user(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.clickOnAwardingBodyLoginBtn();

        Assert.assertTrue(isElementPresent(loginPage.awardingBodyRole),"Awarding Body role is not selected");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginBtn,true);

        loginPage.clickOnLogin();

        Assert.assertTrue(isElementPresent(loginPage.awardingBodyLink),"Awarding Body link is not displayed");
        log.info("Awarding body link is displayed");

    }

    @Then("I verify back button and close button is working properly in Login")
    public void i_verify_back_button_and_close_button_is_working_properly_in_login(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectLearnerRole();

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"mobile number edit field is not displayed");

        loginPage.clickOnBackButtonHyperlink();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.clickOnCloseButtonInWelcomePopup();

        waitWebDriver(2000);
        Assert.assertTrue(!isElementPresent(loginPage.learnerRole),"Learner role is displayed and close button is not working properly");
        log.info("Close button is working properly");
    }

    @Then("I verify OTP page options when user clicks on Forgot password in Login Flow")
    public void i_verify_otp_page_options_when_user_clicks_on_forgot_password_in_login_flow(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectLearnerRole();

        loginPage.sendMobileNumber();

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

    @Then("I verify OTP page options when user clicks on Forgot password in Login Flow for TP")
    public void i_verify_otp_page_options_when_user_clicks_on_forgot_password_in_login_flow_for_tp(){
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

    @Then("I verify user navigated to Mobile number edit page post clicking Edit icon")
    public void i_verify_user_navigated_to_mobile_number_edit_page_post_clicking_edit_icon(){
        loginPage.clickOnEdit();

        waitWebDriver(4000);
        waitForElementToAppear(loginPage.mobileNumberEditField);

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField),"Mobile number field is not displayed");
        log.info("Post clicking edit button redirected to Mobile number field is displayed");

        Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not displayed");
        log.info("Continue button is displayed");
    }

    @Then("I verify user is able to click on back button")
    public void i_verify_user_is_to_click_on_back_button(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.mobilizerLoginBtn.click();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerRole),"Mobilizer role is not displayed");

        loginPage.clickOnBackButtonHyperlink();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerLoginBtn),"User not navigated to login page");
        log.info("User successfully navigated back to Login page");

    }

    @Then("I verify error message for the empty mobile field")
    public void i_verify_error_message_for_the_empty_mobile_field(){
        loginPage.mobilizerLoginBtn.click();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerRole),"Mobilizer role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnClearMobileNumber();
        log.info("User successfully cleared the mobile number");

        Assert.assertTrue(isElementPresent(loginPage.mobileNumberRequiredMsg),"Mobile number is required error message is not displayed");
        log.info("Mobile number is required error message is displayed");

    }

    @When("I verify user login with Mobilizer Role")
    public void i_verify_user_login_with_mobilizer_role(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.mobilizerLoginBtn.click();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerRole),"Mobilizer role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginBtn,true);

        loginPage.clickOnLogin();
        waitWebDriver(4000);
        Assert.assertEquals(myDashboardPage.getTextLoginAsParnerVerify(),"Mobilizer","expected is "+myDashboardPage.getTextLoginAsParnerVerify());

    }

    @Then("I verify user is able to copy the link successfully")
    public void i_verify_user_is_able_to_copy_the_link_successfully(){
        loginPage.clickOnCopyLinkButton();

        Assert.assertTrue(isElementPresent(loginPage.linkCopiedMessage),"Link copied message is not displayed");
        log.info("Link copied message is displayed");
    }

    @Then("I verify user is able to click on Forgot Password")
    public void i_verify_user_is_able_to_click_on_forgot_password(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.mobilizerLoginBtn.click();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerRole),"Mobilizer role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextField();

        loginPage.clickOnContinue();

        loginPage.clickOnForgotPasswordLink();

        Assert.assertTrue(isElementPresent(loginPage.OTPSentMessage),"OTP sent successfully message is not displayed");
        log.info("OTP sent successfully message is displayed");

        Assert.assertTrue(isElementPresent(loginPage.OTPpageText),"One Time Password text is not displayed");
        log.info("One Time Password text is displayed");
    }

    @When("I verify user Register with Mobilizer Role")
    public void i_verify_user_register_with_mobilizer_role(){
        loginPage.clickOnRegister();

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        loginPage.mobilizerRegisterbtn.click();

        Assert.assertTrue(isElementPresent(loginPage.mobilizerRole),"Mobilizer role is not displayed");

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendRegisteredMobilizerNumber();

        loginPage.clickOnContinue();


        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
        Assert.assertEquals(loginBtn,true);

        loginPage.clickOnLogin();
        waitWebDriver(4000);

    }

    @Then("I verify Error message is displayed for the mandatory field in Mobilizer Registration Form")
    public void i_verify_error_message_is_displayed_for_the_mandatory_field_in_mobilizer_registration_form(){
        Assert.assertTrue(isElementPresent(loginPage.mobilizerRegistrationFormText),"User is not navigated to mobilizer Registration form");
        log.info("User is navigated to Mobilizer Registration Form");

        loginPage.clickOnBranchNameAndBankName();

        Assert.assertTrue(isElementPresent(loginPage.bankNameIsRequiredErrorMessage),"Validation message is not displayed for the mandatory fields");
        log.info("Validation message is displayed for the mandatory fields");
    }

    @Then("I verify user able to fill all the details in Mobilizer Registration Form")
    public void i_verify_user_able_to_fill_all_the_details_in_mobilizer_registration_form(){
        loginPage.clickAndEnterBankName();

        loginPage.clickAndEnterBranchName();

        loginPage.clickAndEnterAccountNumber();

        loginPage.clickAndEnterAccountHolderName();

        loginPage.scrollTillTheStateDropdown();

        loginPage.clickAndEnterIFSCCode();

        loginPage.clickAndEnterPAN();

        loginPage.clickOnStateDropdown();
        log.info("User is able to click on State dropdown and Dropdown list appears");
        loginPage.selectAndhraState();

        loginPage.clickOnDistrictDropdown();

        loginPage.selectDistrict();

        boolean loginBtn = loginPage.continueBtn.isEnabled();
        Assert.assertEquals(loginBtn,true);

        Assert.assertTrue(isElementPresent(loginPage.continueBtn),"Continue button is not displayed and disabled");
        log.info("Continue button is displayed and enabled");

    }

    @Then("I verify user is able view the content on the Learning Partner Card")
    public void i_verify_user_is_able_view_the_content_on_the_learning_partner_card(){
        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.registerAsText));
        Assert.assertTrue(isElementPresent(loginPage.LearningPartnerIcon));
        Assert.assertTrue(isElementPresent(loginPage.learningPartnerEyeIcon));
        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard));
        Assert.assertTrue(isElementPresent(loginPage.aboutLearningPartnerText));
        Assert.assertTrue(isElementPresent(loginPage.learningPartnerRegisterbtn));
        log.info("User is able to view the contents of Learning partner card in Register flow");

    }

    @Then("I click on Learning Partner Register button")
    public void i_click_on_learning_partner_register_button(){
        loginPage.clickOnLearningPartnerRegisterBtn();
    }

    @Then("I verify all the details in Mobile number field for Learning Partner")
    public void i_verify_all_the_details_in_mobile_number_field_for_learning_partner(){
        loginPage.clickOnLearningPartnerRegisterBtn();
        Assert.assertTrue(isElementPresent(loginPage.LearningPartnerIcon));
        Assert.assertTrue(isElementPresent(loginPage.welcomeToSIDinPopup));
        Assert.assertTrue(isElementPresent(loginPage.learningPartnerRole));
        Assert.assertTrue(isElementPresent(loginPage.mobileNumberEditField));
        Assert.assertTrue(isElementPresent(loginPage.continueBtn));
        Assert.assertTrue(isElementPresent(loginPage.termsAndConditionsLink));
        Assert.assertTrue(isElementPresent(loginPage.privacyPolicyLink));

        log.info("User is able to view all the details in Mobile Number field for Learning Partner");

    }

    @Then("I verify mobile number is not valid message for invalid mobile number in Learning Partner")
    public void i_verify_mobile_number_is_not_valid_message_for_invalid_mobile_number_in_learning_partner(){
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

    @Then("I verify user is able to click on back button successfully")
    public void i_verify_user_is_able_to_click_on_back_button_successfully(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard),"Learning partner card is not displayed");

        loginPage.clickOnLearningPartnerLoginBtn();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendLearningPartnerMobileNumberToTextField();

        loginPage.clickOnBackButtonHyperlink();

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard),"Learning partner card is not displayed");

        Assert.assertTrue(isElementPresent(loginPage.partnerLoginBtn),"Partner login button is not displayed");
    }

    @Then("I verify user should be able to click on Cross button of the Popup")
    public void i_verify_user_should_be_able_to_click_on_cross_button_of_the_popup(){
        loginPage.clickOnLearningPartnerLoginBtn();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendLearningPartnerMobileNumberToTextField();

        loginPage.clickOnCloseOptionInRegistrationField();

        //Assert.assertTrue(!isElementPresent(loginPage.learningPartnerRole),"Learning Partner role is displayed");
    }

    @Then("I verify user able to clear the entered mobile number after clicking cross icon")
    public void i_verify_user_able_to_clear_the_entered_mobile_number_after_clicking_cross_icon(){
        loginPage.clickLoginButton();

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        loginPage.selectPartnerRole();

        Assert.assertTrue(isElementPresent(loginPage.assertLearningPartnerCard),"Learning partner card is not displayed");

        loginPage.clickOnLearningPartnerLoginBtn();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendLearningPartnerMobileNumberToTextField();

        loginPage.clickOnClearMobileNumber();

        waitForElementToAppear(loginPage.mobileNumberEditField);

        String enteredMobileNumber = ((JavascriptExecutor) driver).executeScript("return document.getElementById('number').value").toString();
        System.out.println(enteredMobileNumber);

        Assert.assertEquals(enteredMobileNumber,"");
        log.info("User is able to clear the Entered Mobile number");
    }


    @When("I verify click on login with learner load {string} {string}")
    public void i_verify_click_on_login_with_learner_load(String string, String pwd) throws InterruptedException {

        loginPage.clickLoginButton();

        loginPage.selectLearnerRole();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextFieldload(string);

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();

        loginPage.clickOnLogin();

        homePage.clickOnSkillCourses();

        waitWebDriver(3000);
        driver.findElement(By.id("search")).sendKeys("Kisan Drone");
        driver.findElement(By.id("search")).click();
        waitWebDriver(3000);
        homePage.clickOnGoToCourseOne();
        waitWebDriver(3000);

        try{
            object_Click(homePage.continueBtn);
        }catch (Exception e){
            object_Click(homePage.enrollBtn);
            waitWebDriver(3000);
            waitWebDriver(9000);
            waitWebDriver(3000);
            object_Click(homePage.continueBtn);
            waitWebDriver(2000);
        }

        waitWebDriver(3000);
        String parent =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();



        Iterator<String> I1 = windows.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                try{
                    object_Click(homePage.resumeBtn);
                }catch (Exception e){
                    object_Click(homePage.startBtn);
                }
            }
        }
        waitWebDriver(5000);

        Assert.assertTrue(isElementPresent(homePage.titleHead),"Title head is not displayed");

    }

    @Then("I verify Dashboard options for logged in LMS user")
    public void i_verify_dashboard_options_for_logged_in_lms_user(){
        Assert.assertTrue(isElementPresent(loginPage.assertOverview),"Overview option is not displayed");

        Assert.assertTrue(isElementPresent(loginPage.courseStatus),"Course Status is not displayed");

        Assert.assertTrue(isElementPresent(loginPage.havingTroubleSection),"Having Trouble section is not displayed");

        Assert.assertTrue(isElementPresent(loginPage.faqSection),"FAQ section is not displayed");
    }

    @Then("I verify user is able to click on Resend OTP button")
    public void i_verify_user_is_able_to_click_on_resend_otp_button(){
       loginPage.clickOnResendOTPButton();

       Assert.assertTrue(isElementPresent(loginPage.otpSentMessage),"OTP sent message is not displayed");
       log.info("OTP sent successfully message is displayed");
    }

    @When("I verify color of Login button post entering correct PIN")
    public void i_verify_color_of_login_button_post_entering_correct_pin(){
            loginPage.clickLoginButton();

            Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
            log.info("Learner role is displayed in Role popup");

            Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
            log.info("Partner role is displayed in Role popup");

            loginPage.selectLearnerRole();
            loginPage.clickOnMobileNumberEditField();


            loginPage.sendMobileNumberToTextField();

            loginPage.clickOnContinue();


            loginPage.enterPasswordValues();

            boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();
            Assert.assertEquals(loginBtn,true);

            loginPage.verifyBackgroundColorOfLoginButton();

    }

    @Then("I verify Awarding Body is able to click on Explore Now")
    public void i_verify_awarding_body_is_able_to_clikc_on_explore_now(){
        loginPage.clickOnExploreNowBtn();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(loginPage.awardingBodyRegistrationFormHeaderText),"User is not navigated to SIP portal");
                log.info("User is navigated to SIP Portal");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify Mobilizer is able to download the QR Code and Share QR Code")
    public void i_verify_mobilizer_is_able_to_download_the_qr_code_and_share_qr_code(){
        loginPage.clickOnDownloadQRCode();
        log.info("QR Code downloaded successfully in qr_code.png name");

        loginPage.clickOnReferQRCodeButton();

        Assert.assertTrue(isElementPresent(loginPage.shareThisMobilizerPopup),"Share this mobilizer popup is not displayed");
        log.info("Share this mobilizer popup is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the QR Code");

        loginPage.clickOnCloseSharePopup();
    }

    @Then("I verify Mobilizer is able to Share Candidate Mobilizer Analysis")
    public void i_verify_mobilizer_is_able_to_share_candidate_mobilizer_analysis(){
        loginPage.clickOnReferNowButton();

        Assert.assertTrue(isElementPresent(loginPage.shareThisMobilizerPopup),"Share this mobilizer popup is not displayed");
        log.info("Share this mobilizer popup is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the QR Code");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the QR Code");

        loginPage.clickOnCloseSharePopup();
    }

    @Then("I verify Mobilizer is able to apply filters and reset filters")
    public void i_verify_mobilizer_is_able_to_apply_filters_and_reset_filters(){
        loginPage.verifyMyReferalsInMobilizerDashboard();

        myDashboard.clickOnCalendar();

        myDashboard.clickOnChooseMonthAndYear();

        myDashboard.selectYear();

        myDashboard.selectMonth();

        myDashboard.selectDate();

        myDashboard.selectDate();

        loginPage.clickOnSortFilter();

        loginPage.selectRegisterOptionFromDropdown();

        Assert.assertTrue(isElementPresent(loginPage.appliedRegisterInSort),"Applied Register is not displayed");
        log.info("Applied Register is displayed");

        loginPage.clickOnResetFilter();

        Assert.assertFalse(isElementPresent(loginPage.appliedRegisterInSort),"Filter reset not worked properly");
        log.info("Reset filter applied successfully");

    }

    @When("I verify click on login with learner to check assessment {string} {string}")
    public void i_verify_click_on_login_with_learner_to_check_assessment(String string, String pwd) throws InterruptedException {

        loginPage.clickLoginButton();

        loginPage.selectLearnerRole();

        loginPage.clickOnMobileNumberEditField();

        loginPage.sendMobileNumberToTextFieldload(string);

        loginPage.clickOnContinue();

        loginPage.enterPasswordValues();

        boolean loginBtn = loginPage.loginBtnToLogin.isEnabled();

        loginPage.clickOnLogin();

      //  loginPage.clickOnSkip();
    }

    @Then("I verify learner is able to access the Assessment")
    public void i_verify_learner_is_able_to_access_the_assessment(){
        loginPage.clickOnTakeTest();

       // loginPage.clickOnSliderOne();

        loginPage.clickOnJoinNowBtn();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                loginPage.clickOnViewAllBtn();

                loginPage.clickOnStartBtn();

                for(int i=0; i<11; i++){
                    loginPage.clickOnAnswerRadioBtn();

                    loginPage.clickOnNextBtn();
                }
                loginPage.clickOnAnswerRadioBtn();

                loginPage.clickOnFinishBtn();

                loginPage.clickOnFinish2Btn();

                Assert.assertTrue(isElementPresent(loginPage.gotoHomeBtn),"Go To Home is not displayed");
                log.info("Go To Home button is displayed");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify Learner is able to access the Assessment and see the Assessment")
    public void i_verify_learner_is_able_to_access_the_assessment_and_see_the_assessment(){
        loginPage.clickOnTakeTest();

        loginPage.clickOnTakeTestAssessmentButton();

        waitWebDriver(7000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(loginPage.assessmentCard),"Assessment Card is not displayed");
                log.info("Assessment card is displayed");
                Assert.assertTrue(isElementPresent(loginPage.assessmentStartButton),"start button is not displayed");
                log.info("Start button is displayed");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }
}
