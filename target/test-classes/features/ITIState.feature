Feature: ITI State Persona in Partner Role


  @Regression_Deprecated
  Scenario: Verify user is able to navigate to State Register Mobile number page and get Error Message
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking ITI State Register
    Then I verify error message post entering the new mobile number

  @Regression@StateReg
  Scenario: Verify State User is able to switch to new page using arrows in Pagination
    Given i navigate to Landing page
    When I verify click on login with state user
    Then I verify state user dashboard section for logged in state user
    Then I click on view all button in Dashboard
    Then I verify user is able navigate to next page and previous page by clicking pagination arrows for State user
    Then I verify User is navigated to particular page number in pagination



  @Regression@ITIReg
  Scenario: Verify ITI trainee is able to see all the details of Headers and Application details
    Given i navigate to Landing page
    When I verify click on login with ITI user
    Then I verify ITI dashboard section for logged in ITI user
    Then I verified the heaaders options
    Then I verify all the application details in ITI Trainee

  @Regression_Deprecated
  Scenario: Verify user is able to navigate to ITI Register Mobile number page and get Error Message
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking ITI Register
    Then I verify error message post entering the new mobile number











