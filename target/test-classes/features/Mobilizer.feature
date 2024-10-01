Feature: Mobilizer Persona


  @Regression@MobilizerReg
  Scenario: Verify Mobilizer login Page and Error Message for Empty mobile field
    Given i navigate to Landing page
    Then I verify user is able to click on back button
    Then I verify error message for the empty mobile field

  @Regression@MobilizerReg
  Scenario: Verify Mobilizer user is able to copy the link
    Given i navigate to Landing page
    When I verify user login with Mobilizer Role
    Then I verify user is able to copy the link successfully

  @Regression@MobilizerReg
  Scenario: Verify user is able to click on Forgot Password in Mobilizer
    Given i navigate to Landing page
    Then I verify user is able to click on Forgot Password

  @Regression@MobilizerReg
  Scenario: Verify Mobilizer Registration form details
    Given i navigate to Landing page
    When I verify user Register with Mobilizer Role
    Then I verify Error message is displayed for the mandatory field in Mobilizer Registration Form
    Then I verify user able to fill all the details in Mobilizer Registration Form

  @Sanity
  Scenario: Verify Mobilizer is able to Download QRCode Share QR and ReferNow functionality
    Given i navigate to Landing page
    When  Login to the application as a Partner tab mobilizer "9148574673","1"
    Then I verify Mobilizer is able to download the QR Code and Share QR Code
    Then I verify Mobilizer is able to Share Candidate Mobilizer Analysis

  @Sanity
  Scenario: Verify Mobilizer is able to access Date Sort and Reset filters
    Given i navigate to Landing page
    When  Login to the application as a Partner tab mobilizer "9148574673","1"
    Then I verify Mobilizer is able to apply filters and reset filters





