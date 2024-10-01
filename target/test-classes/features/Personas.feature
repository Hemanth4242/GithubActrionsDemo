Feature: Verify All personas working fine of SID

  @Regression@Personas
  Scenario: Verify Learning Partner persona User is able to Login to the App and verify Dashboard details
    Given i navigate to Landing page
    When I verify click on login with learning partner for LMS
    Then I verify Dashboard options for logged in LMS user

  @Sanity@Regression@Personas
  Scenario: To verify Mobilizer persona user able to login to application
    Given i navigate to Landing page
    When  Login to the application as a Partner tab mobilizer "8971773952","1"
    Then  I verify Mobilizer tab login page
    Then verify mobilizer navigated to My Dashboard Page

  @Sanity@Regression@Personas@rerun
  Scenario: Verify Trainer persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with trainer
    Then I verify trainer dashboard section with logged in trainer

  @Sanity@Regression@Personas@rerun
  Scenario: Verify ITI State persona User is able to login to application
    Given i navigate to Landing page
    When I verify click on login with state user
    Then I verify state user dashboard section for logged in state user

  @Sanity@Regression@Personas
  Scenario: Verify Training Partner persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with training partner
    Then I verify training provider dashboard section for logged in training provider user

  @Sanity@Regression@Personas
  Scenario: Verify Training centre persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with training center user
    Then I verify training centre dashboard section for logged in training centre user

  @Sanity@Regression@Personas@rerun
  Scenario: Verify Awarding Body persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with awarding body user
    Then I verify awarding body dashboard section for logged in awarding body user

  @Sanity@Regression@Personas
  Scenario: Verify ITI persona User is able to login to application
    Given i navigate to Landing page
    When I verify click on login with ITI user
    Then I verify ITI dashboard section for logged in ITI user

  @Sanity@Regression@Personas
  Scenario: Verify Assessor persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with Assessor user
    Then I verify Assessor dashboard section for logged in Assessor user

  @Sanity_2@Regression@Personas
  Scenario: Verify Assessment Agency persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with Assessment Agency user
    Then I verify Assessment Agency dashboard section for logged in Assessment Agency user

  @Sanity@Regression@Personas
  Scenario: Verify Establishment persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with Establishment user
    Then I verify Establishment user able to login to application and click on explore now button

  @Sanity@Regression@Personas
  Scenario: Verify BTP persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with BTP user
    Then I verify BTP user able to login to application and click on explore now button

  @Sanity@Regression@Personas@RDSDE
  Scenario: Verify RDSDE persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with RDSDE user
    Then I verify RDSDE user able to login to application and click on explore now button

  @Sanity@Regression@Personas
  Scenario: Verify TPA persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with TPA user
    Then I verify TPA user able to login to application and click on explore now button

  @Sanity@Regression_22@Personas@NSDCADMIN
  Scenario: Verify NSDCAdmin persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin user able to login to application and click on explore now button

  @Sanity@Regression@Personas
  Scenario: Verify ApprenticeshipSSC persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with ApprenticeshipSSC user
    Then I verify ApprenticeshipSSC user able to login to application and click on explore now button

  @Sanity@Regression@Personas
  Scenario: Verify DGT Admin persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with DGT Admin user
    Then I verify DGT Admin dashboard section for logged in DGT Admin user

  @Sanity@Regression@Personas@NSTI
  Scenario: Verify NSTI persona user is able to login to application
    Given i navigate to Landing page
    When I verify click on login with NSTI user
    Then I verify NSTI dashboard section for logged in NSTI user
