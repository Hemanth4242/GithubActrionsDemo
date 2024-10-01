Feature: NSDC Admin Feature

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to add the Banner End date
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to add the Banner End date in Banner upload

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to select Banner Redirection in the same page
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to select banner redirection in the same page

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to select Banner Redirection to the Different page
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to select banner redirection in different page

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to Preview the uploaded banner
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to Preview the Uploaded banner

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to Edit the Uploaded banner under Manage banner
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to edit the uploaded banner in Manage banner

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to Create the Assessment
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to create an Assessment and submit

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to Send back the Created the Assessment
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to create an Assessment and submit
    Then I verify NSDC Admin is able to send back the created Assessment

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to Edit the Send back Assessment and submit
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to create an Assessment and submit
    Then I verify NSDC Admin is able to send back the created Assessment
    Then I verify NSDC Admin is able to Edit the send back assessment and submit

  @Regression_22
  Scenario: Verify NSDCAdmin user is able to Create Assessment and Approve and Publish the Assessment
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to create an Assessment and submit
    Then I verify NSDC Admin is able Approve and Publish the Assessment

  @Regression_22
  Scenario: Verify Minimum characters in Assessment Description and Assessment Title
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to enter the minimum characters in the Assessment Title
    Then I verify NSDC Admin is able to enter the minimum characters in the Assessment description

  @Regression_22
  Scenario: Verify Maximum characters in Assessment Description and Assessment Title
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to enter the maximum characters in the Assessment Title
    Then I verify NSDC Admin is able to enter the maximum characters in the Assessment description

  @Regression_22
  Scenario: Verify User is not able to see Published by details on the Assessment
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to create an Assessment and submit
    Then I verify user is not able to see the Published by details on the Assessment

  @Regression_2222
  Scenario Outline: Verify Announcement Creation
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify NSDC Admin is able to create an Assessment and submit "<AsseessmentTitle>" "<Publishedfor>" <Publishdate> "<Description>"
    Examples:
      |     AsseessmentTitle                         |  Publishedfor ||  Publishdate ||  Description |
      |     UAT Testing eeeeeeeeeeeeeeeeeee          |      Trainer  ||     9       | | testing desctiooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooon|


  @Regression_AdminNew
  Scenario: To verify courses
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify all elements are displayed

  @Regression_Admin
  Scenario: To verify courses
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify all validation on the title filed
      |Testing|
      |TestingTestingTestingTestingte|
      |TestingTestingTestingTestingtes|

  @Regression_Admin
  Scenario: To verify courses
    Given i navigate to Landing page
    When I verify click on login with NSDC Admin user
    Then I verify all validation on the description filed
      |TestingDescription|
      |TestingDescriptionTestingTestingTestingte|
      |TestingTestingTestingTestingtes|
