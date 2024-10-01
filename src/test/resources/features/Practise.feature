Feature: User is able to navigate to landing Page
  Description: The purpose of this feature is to see user can navigate to landingPage or not

  @Practise
  Scenario: Verify user is able to select agriculture course
    Given i navigate to Landing page
    And i click on skill course section
    Then i enter Agriculture text in search bar
    When i select agriculture course
    Then i select sort dropdown
    When i select low to high and verify

#  @Practise
  Scenario: Verify user is able to login and select course
    Given i navigate to Landing page
    And  i click on login button
    Then i select learnerParticipant
    And i enter the mobile number

