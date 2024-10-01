Feature: Training Parnter Persona in Partner Role


  @Regression@TrainingPartnerReg
  Scenario: Verify user is able to navigate to Training Partner Register Mobile number page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Register
    Then I verify the all the details of the Training Partner Register flow

  @Regression@TrainingPartnerReg
  Scenario: Verify user is able to navigate to Training Partner Login Mobile number page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Login
    Then I verify the all the details of the Training Partner Register flow

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner is able to login to application and verify Explore Now button
    Given i navigate to Landing page
    When I verify click on login with training partner
    Then I verify training provider dashboard section for logged in training provider user
    Then I verify Dashboard Overview Features and User profile in logged in TP

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner is able to navigate to OTP page post clicking Forgot Password
    Given i navigate to Landing page
    When I verify Training Partner is navigated to OTP page post clicking Forgot Password

  @Sanity@Regression@TrainingPartnerReg
  Scenario: Verify Training Partner is able to click on Explore Now
    Given i navigate to Landing page
    When I verify click on login with training partner
    Then I verify Training Partner is able to click on Explore Now

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner is able to switch role to mobilizer role
    Given i navigate to Landing page
    When I verify click on login with training partner
    Then I verify Training Partner is able to switch the role under user profile

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner is able to view Surveys and Polls Page from Profile
    Given i navigate to Landing page
    When I verify click on login with training partner
    Then I verify Assessment Agency user is able to click on view Surveys and Poll

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner Icon Eye button About TP and Register button
    Given i navigate to Landing page
    When I verify Training Partner Register card details in Register

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner Icon Eye button About TP and Login button
    Given i navigate to Landing page
    When I verify Training Partner Login card details in Login

  @Regression@TrainingPartnerReg
  Scenario: Verify TP is able to navigate to Terms and Conditions and Privacy Policy page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Register
    Then I verify user navigated to terms and conditions from Registration Page
    Then I verify user navigated to Privacy Policy from Registration Page

  @Regression@TrainingPartnerReg
  Scenario: Verify TP is able to navigate to Terms and Conditions and Privacy Policy page in Login
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Login
    Then I verify user navigated to terms and conditions from Registration Page
    Then I verify user navigated to Privacy Policy from Registration Page

  @Regression@TrainingPartnerReg
  Scenario: Verify invalid Mobile number message in TP Register flow for Invalid Number
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Register
    Then I verify invalid mobile number message for TP Register flow

  @Regression@TrainingPartnerReg
  Scenario: Verify invalid Mobile number message in TP Login flow for Invalid Number
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Login
    Then I verify invalid mobile number message for TP Register flow

  @Regression@TrainingPartnerReg
  Scenario: Verify TP is navigated to OTP page and OTP page details
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Register
    Then I verify Training Partner is navigated to OTP page verify OTP page details and click on Edit

  @Regression@TrainingPartnerReg
  Scenario: Verify TP is navigated to Password page and password page details
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Login
    Then I verify password page details for TP login Flow

  @Regression@TrainingPartnerReg
  Scenario: Verify invalid OTP message in Register flow when entering invalid OTP
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Register
    Then I verify user is able to Enter the valid mobile number
    Then I verify Invalid OTP message for incorrect OTP entered

  @Regression@TrainingPartnerReg
  Scenario: Verify Incorrect Mobile Number or Password message for Invalid Password in TP Login
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Login
    Then I verify password page details for TP login Flow
    Then I verify Invalid Mobile number or password message for invalid password

  @Regression@TrainingPartnerReg
  Scenario: Verify Close and Back button functionality in TP login flow
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Partner Login
    Then I verify the functionality of Close button and back button functionality

  @Regression@TrainingPartnerReg
  Scenario: Verify Training Partner Settings Option in Profile
    Given i navigate to Landing page
    When I verify click on login with training partner
    Then I verify Settings options for the logged in Training Partner

  @Regression@TrainingPartnerReg
  Scenario: Verify Forgot Password Page details in Login Flow Of Training Partner
    Given i navigate to Landing page
    Then I verify OTP page options when user clicks on Forgot password in Login Flow for TP
    Then I verify user navigated to Mobile number edit page post clicking Edit icon

