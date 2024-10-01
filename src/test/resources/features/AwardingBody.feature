Feature: Awarding Body Persona in Partner Role


  @Regression@AwardingBodyReg
  Scenario: Verify Awarding Body is able to navigate to OTP page post clicking Forgot Password
    Given i navigate to Landing page
    When I verify Awarding Body is navigated to OTP page post clicking Forgot Password

  @Regression@AwardingBodyReg
  Scenario: Verify user is able to navigate to Awarding Body Register Mobile number page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Awarding Body Register

  @Sanity
  Scenario: Verify Awarding Body user is able to access Explore Now button
    Given i navigate to Landing page
    When I verify click on login with awarding body user
    Then I verify Awarding Body is able to click on Explore Now








