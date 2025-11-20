Feature: Role popup and MobileNumber popup in Login Page
  Description: The purpose of this feature is to test role popup and mobile number popu

# 3.8.0 maven-compiler-plugin test
  @GithubActions
  Scenario: Verify Login and Logout functionality
    Given i navigate to Landing page
   # When I verify click on login with learner
    #Then I verify learner is able to logout


  @Regression@LoginPageReg
  Scenario: Verify Login Page Welcome popup and color of Login button
    Given i navigate to Landing page
    Then I verify welcome popup in Login page
    Then I verify user navigated to terms and conditions page from welcome popup
    Then I verify user navigated to privacy policy page from welcome popup in Login


  @Regression@LoginPageReg
  Scenario: Verify Login button and Password page while user performs login
    Given i navigate to Landing page
    Then I verify welcome popup in Login page
    Then I verify enter mobilenumber popup in register page
    Then I verify password page and Login button

  @Regression@LoginPageReg
  Scenario: Verify Mobile number not valid and Invalid Mobile and Password
    Given i navigate to Landing page
    Then I verify welcome popup in Login page
    Then I verify Mobile number is not valid message for invalid mobile number
    Then I verify Invalid Mobile number or password message for invalid password


  @Regression@LoginPageReg
  Scenario: Verify invalid OTP message when user click on Forgot password and Enter invalid OTP
    Given i navigate to Landing page
    Then I verify user navigated to OTP page once user clicks on forgot password link
    Then I verify Invalid OTP message for incorrect OTP entered

  @Regression@LoginPageReg
  Scenario: Verify close button and back button working fine in Login flow
    Given i navigate to Landing page
    Then I verify back button and close button is working properly in Login


  @Regression@LoginPageReg
  Scenario: Verify Forgot Password Page details in Login Flow
    Given i navigate to Landing page
    Then I verify OTP page options when user clicks on Forgot password in Login Flow
    Then I verify user navigated to Mobile number edit page post clicking Edit icon


  @Regression@LoginPageReg
  Scenario: verify tooltip of the Login button
    Given i navigate to Landing page
    Then I verify mouse hover on Login and verify tooltip

  @Regression@LoginPageReg
  Scenario: Verify Forgot Password and Resend OTP functionality flow
    Given i navigate to Landing page
    Then I verify OTP page options when user clicks on Forgot password in Login Flow
    Then I verify user is able to click on Resend OTP button


  @Hemanth
  Scenario: Verify Login and Logout functionality
    Given i navigate to Landing page
    And   I verify the the HomePage






