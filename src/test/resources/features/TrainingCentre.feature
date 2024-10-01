Feature: Training Centre Persona in Partner Role


  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre is able to navigate to OTP page post clicking Forgot Password
    Given i navigate to Landing page
    When I verify Training Centre is navigated to OTP page post clicking Forgot Password

  @Sanity@Regression@TrainingCentreReg
  Scenario: Verify Training Centre is able to click on Explore Now
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify Training Centre is able to click on Explore Now

  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre is able to switch role to mobilizer role
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify Training Partner is able to switch the role under user profile

  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre Dashboard Overview Features Explore Now and UserProfile
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify Dashboard Overview Features and User profile in logged in TP

  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre Dashboard details
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify Training Centre dashboard details for logged in TC

  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre is able to view Surveys and Polls Page from Profile
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify Assessment Agency user is able to click on view Surveys and Poll

  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre Icon Eye button About TC and Login button
    Given i navigate to Landing page
    When I verify Training Centre Login card details in Login

  @Regression@TrainingCentreReg
  Scenario: Verify user is able to navigate to Training Centre Login Mobile number page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Centre Login
    Then I verify the all the details of the Training Centre Login flow

  @Regression@TrainingCentreReg
  Scenario: Verify invalid Mobile number message in TC Login flow for Invalid Number
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Centre Login
    Then I verify invalid mobile number message for TP Register flow

  @Regression@TrainingCentreReg
  Scenario: Verify TC is able to navigate to Terms and Conditions and Privacy Policy page in Login
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Centre Login
    Then I verify user navigated to terms and conditions from Registration Page
    Then I verify user navigated to Privacy Policy from Login Page

  @Regression@TrainingCentreReg
  Scenario: Verify TC is navigated to Password page and password page details
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Centre Login
    Then I verify password page details for TP login Flow

  @Regression@TrainingCentreReg
  Scenario: Verify Incorrect Mobile Number or Password message for Invalid Password in TC Login
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Centre Login
    Then I verify password page details for TP login Flow
    Then I verify Invalid Mobile number or password message for invalid password

  @Regression@TrainingCentreReg
  Scenario: Verify Close and Back button functionality in TC login flow
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Training Centre Login
    Then I verify the functionality of Close button and back button functionality in TC

  @Regression@TrainingCentreReg
  Scenario: Verify Forgot Password Page details in Login Flow Of Training Centre
    Given i navigate to Landing page
    Then I verify OTP page options when user clicks on Forgot password in Login Flow for TC
    Then I verify user navigated to Mobile number edit page post clicking Edit icon

  @Regression@TrainingCentreReg
  Scenario: Verify Training Centre Settings Option in Profile
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify Settings options for the logged in Training Centre

  @Regression@TrainingCentreReg
  Scenario: Verify Forgot Password and Resend OTP functionality flow in Training Centre
    Given i navigate to Landing page
    Then I verify OTP page options when user clicks on Forgot password in TC Login Flow
    Then I verify user is able to click on Resend OTP button

