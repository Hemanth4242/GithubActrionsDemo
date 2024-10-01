Feature: DGT Admin Persona


  @Regression_Deprecated
  Scenario: Verify user is able to navigate to DGT Admin Register Mobile number page and get Error Message
    Given i navigate to Landing page
    When I verify user navigated to Mobile number field post clicking DGT Register
    Then I verify error message post entering the new mobile number
