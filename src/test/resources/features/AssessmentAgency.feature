Feature: Assessment Agency Persona in Partner Role

  @Sanity_2@Regression@AssessmentAgencyReg
  Scenario: Verify Assessment Agency user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with Assessment Agency user
    Then I verify Assessment Agency dashboard section for logged in Assessment Agency user

  @Regression_Notrun
  Scenario: Verify user is able to navigate to Assessment Agency Register Mobile number page
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking Assessment Agency Register

  @Regression@AssessmentAgencyReg
  Scenario: Verify Assessment Agency user access Dashboard Features and User profile sections
    Given i navigate to Landing page
    When I verify click on login with Assessment Agency user
    Then I verify Assessment Agency dashboard section for logged in Assessment Agency user
    Then I verify Overview ExploreMore Features and User profile

  @Sanity_2@Regression@AssessmentAgencyReg
  Scenario: Verify Assessment Agency is able to click on Explore Now
    Given i navigate to Landing page
    When I verify click on login with Assessment Agency user
    Then I verify Assessment Agency is able to click on Explore Now

  @Regression@AssessmentAgencyReg
  Scenario: Verify Assessment Agency is able to switch role to mobilizer role
    Given i navigate to Landing page
    When I verify click on login with Assessment Agency user
    Then I verify Training Partner is able to switch the role under user profile


  @Regression@AssessmentAgencyReg
  Scenario: Verify Assessment Agency is able to navigate to OTP page post clicking Forgot Password
    Given i navigate to Landing page
    When I verify Assessment Agency is navigated to OTP page post clicking Forgot Password

  @Regression@AssessmentAgencyReg
  Scenario: Verify Assessment Agency is able to view Surveys and Polls Page from Profile
    Given i navigate to Landing page
    When I verify click on login with Assessment Agency user
    Then I verify Assessment Agency user is able to click on view Surveys and Poll








