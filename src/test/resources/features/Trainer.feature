Feature: Trainer Persona in Partner Role


  @Regression@TrainerReg
  Scenario: Verify Trainer is able to click on Sessions Overview SessionsCalender and Logout
    Given i navigate to Landing page
    When I verify click on login with trainer
    Then I verify trainer dashboard section with logged in trainer
    Then I verify trainer is able to click on Session Overview Session Calender and My Sessions
    Then I verify Trainer is able to Logout

  @Regression@TrainerReg
  Scenario: Verify Trainer is able to create a session filling all the mandatory fields
    Given i navigate to Landing page
    When I verify click on login with trainer
    Then I verify trainer dashboard section with logged in trainer
    Then I verify trainer is able to fill all the mandatory fields in Create Session

  @Regression@TrainerReg
  Scenario: Verify Error message when trainer keeps the username empty in Connect
    Given i navigate to Landing page
    When I verify click on login with trainer
    Then I verify trainer dashboard section with logged in trainer
    Then I verify trainer get error message for empty username field
