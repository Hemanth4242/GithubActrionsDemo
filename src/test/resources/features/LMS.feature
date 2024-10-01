Feature: LMS Feature Validation


  @Regression@LMSReg
  Scenario: Verify Learning Partner is navigated to OTP page post clicking Forgot Password
    Given i navigate to Landing page
    Then I verify user navigated to OTP page once user clicks on forgot password link for Learning Partner

  @Regression@LMSReg
  Scenario: Verify Learning Partner is able to access Course List
    Given i navigate to Landing page
    When I verify click on login with learning partner for LMS
    Then I verify learning partner is able to sort the courses
    Then verify partner able to access all tabs of course list

  @Regression@LMSReg
  Scenario: Verify Learning Partner is navigated to LMS Studio
    Given i navigate to Landing page
    When I verify click on login with learning partner for LMS
    Then I verify Learning Partner is navigated to LMS studio and verify studio details

  @Regression@LMSReg
  Scenario: Verify Create course option is enabled in LMS Studio
    Given i navigate to Landing page
    When I verify click on login with learning partner for LMS
    Then I verify Learning Partner is navigated to LMS studio and verify studio details
    Then I verify Learning Partner is able to enter course name and org details

  @Regression@LMSReg
  Scenario: Verify Create New Library option is enabled in LMS Studio
    Given i navigate to Landing page
    When I verify click on login with learning partner for LMS
    Then I verify Learning Partner is navigated to LMS studio and verify studio details
    Then I verify Learning Partner is able to enter Library name and org details