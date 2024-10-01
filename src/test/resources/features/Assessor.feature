Feature: Assessor Persona in Partner Role


  @Regression@AssessorReg
  Scenario: Verify user is able to navigate to Assessor Register Mobile number page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Assessor Register

  @Regression@AssessorReg
  Scenario: Verify Assessor user access Dashboard Features and User profile sections
    Given i navigate to Landing page
    When I verify click on login with Assessor user
    Then I verify Assessor dashboard section for logged in Assessor user
    Then I verify Overview ExploreMore Features and User profile

  @Sanity@Regression@AssessorReg
  Scenario: Verify Assessor is able to click on Explore Now
    Given i navigate to Landing page
    When I verify click on login with Assessor user
    Then I verify Assessor is able to click on Explore Now

  @Regression@AssessorReg
  Scenario: Verify Assessor is able to switch role to mobilizer role
    Given i navigate to Landing page
    When I verify click on login with Assessor user
    Then I verify Training Partner is able to switch the role under user profile


  @Regression@AssessorReg
  Scenario: Verify Assessor is able to navigate to OTP page post clicking Forgot Password
    Given i navigate to Landing page
    When I verify Assessor is navigated to OTP page post clicking Forgot Password

  @Regression@AssessorReg
  Scenario: Verify Assessor is able to view Surveys and Polls Page from Profile
    Given i navigate to Landing page
    When I verify click on login with Assessor user
    Then I verify Assessor user is able to click on view Surveys and Poll
    Then I verify Assessor able to access dashboard from user profile

  @Regression@AssessorReg
  Scenario: Verify Assessor is able to Logout from SID
    Given i navigate to Landing page
    When I verify click on login with Assessor user
    Then I verify Assessor is able to Logout successfully








