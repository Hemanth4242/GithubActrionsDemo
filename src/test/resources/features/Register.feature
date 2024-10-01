Feature: Register Page verification

  @Sanity@Regression@RegisterReg
  Scenario: Verify Landing page and Role Popup
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify enter mobilenumber popup in register page
    When I verify enter mobilenumber and click continue
    Then I verify click on edit

  @Regression@RegisterReg
  Scenario: Verify the color of the registration button
    Given i navigate to Landing page
    Then I verified the color of the button

  @Regression@RegisterReg
  Scenario: Verify user navigated to terms and conditions page and Privacy Policy page
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify user navigated to terms and conditions page from welcome popup
    Then I verify user navigated to privacy policy page from welcome popup
    Then I verify user remains on the same page post clicking close option

  @Regression@RegisterReg
  Scenario: Verify user navigate back to Welcome Popup Page post clicking Back hyperlink
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify back option in the registration page and verify navigates to previous page post clicking it
    Then I verify user remains on the same page post clicking close option in registration page

  @Regression@RegisterReg
  Scenario: Verify user navigated to Terms and conditions and Privacy Policy page from Registration Page
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify enter mobilenumber popup in register page
    Then I verify user navigated to terms and conditions from Registration Page
    Then I verify user navigated to Privacy Policy from Registration Page

  @Regression@RegisterReg
  Scenario: Verify continue button enabled disabled in registration page and edit option in OTP Page
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify enter mobilenumber popup in register page
    Then I verify Continue button enabled after entering valid mobile number
    Then I verify mobile number required and mobile number not valid message and continue button disabled
    Then I verify learner navigated to OTP page and navigate back to mobile number field when click on Edit in OTP Page

  @Regression@RegisterReg
  Scenario: Verify continue button displayed properly and by default disabled
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify enter mobilenumber popup in register page
    Then I verify continue button disabled by default
    Then I verify Continue button enabled after entering valid mobile number
    Then I verify Continue button spelling in registration page

  @Regression@RegisterReg
  Scenario: Verify Register as learning partner and Mobilizer in Registration Page
    Given i navigate to Landing page
    Then I verify click on register with learning partner and Mobilizer

  @Regression@RegisterReg
  Scenario: verify tooltip of the Register button
    Given i navigate to Landing page
    Then I verify mouse hover on Register and verify tooltip

