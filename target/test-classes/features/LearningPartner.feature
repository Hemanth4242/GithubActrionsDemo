Feature: Learning partner features

  @Sanity@Regression@LearningPartnerReg
  Scenario: Verify functionality of course creation flow as learning partner
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create

  @Regression@LearningPartnerReg
  Scenario: Verify user is able to view all contents of Learning Partner and get validation message for invalid mobile number
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify user is able view the content on the Learning Partner Card
    Then I verify all the details in Mobile number field for Learning Partner
    Then I verify mobile number is not valid message for invalid mobile number in Learning Partner

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is navigated to OTP Page and verify OTP Page details
    Given i navigate to Landing page
    Then I verify role popup in register page
    Then I verify user is able view the content on the Learning Partner Card
    Then I click on Learning Partner Register button
    Then I verify learner navigated to OTP page and navigate back to mobile number field when click on Edit in OTP Page

  @Regression@LearningPartnerReg
  Scenario: Verify Cross button and back button works fine in Learning Partner
    Given i navigate to Landing page
    Then I verify user is able to click on back button successfully
    Then I verify user should be able to click on Cross button of the Popup
    Then I verify user able to clear the entered mobile number after clicking cross icon

  @Sanity@Regression@LearningPartnerReg
  Scenario: Verify login as learning partner My dashboard and accessing all sections
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify partner navigated to My Dashboard Page
    Then verify partner able to access all tabs of course list

  @Sanity
  Scenario: Verify partner is able apply filters in course list page
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify partner able to apply filters in course list

  @Regression@LearningPartnerReg
  Scenario: Verify learning Partner is able to click on Profile options
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then I verify view profile section from user profile dropdown for Learning Partner
    Then I verify Learning Partner is able to click on Dashboard in Profile dropdown
    Then I verify Partner is able to view Switch Profile button enabled post selecting The role

  @Regression@LearningPartnerReg
  Scenario: Verify learning Partner is able to Logout
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then I verify Learning Partner is able to Logout successfully

  @Regression@LearningPartnerReg
  Scenario: Verify validation message for mandatory fields
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then I verify validation message is displayed for mandatory fields

  @Regression@LearningPartnerReg
  Scenario: Verify user navigated to Course details page post clicking Edit button
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify course details popup by clicking Edit icon

  @Regression@LearningPartnerReg
  Scenario: Verify user navigated to Sectors page post clicking Edit button
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify sector details and edit the details by clicking Edit icon

  @Regression@LearningPartnerReg
  Scenario: Verify user navigated to Fees Page post clicking Edit button
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify Fees details and edit the details by clicking Edit icon

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner access Approved Courses section and Contact Us in Dashboard
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then I verify Learning Partner is able to access Approved courses
    Then I verify Learning Partner is able to access Contact US button in Dashboard

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is able to update the Overview section of Course
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify learning partner able to enter Keyword StartDate EndDate and Save

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is able to update the prerequisite in Course
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify learning partner able to enter Keyword StartDate EndDate and Save
    Then I verify learning partner is able to enter the prerequisites

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is able to add the content details in the Course
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify learning partner able to enter Keyword StartDate EndDate and Save
    Then I verify learning partner is able to enter the prerequisites
    Then I verify Learning partner is able to enter content details and click on Next button

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is able to access Course List and access Edit the course
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then I verify learning partner is able to sort the courses
    Then I verify the learning partner is able access the Edit button of the course

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is able to add the Assessment and Certificate details in the Course
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify learning partner able to enter Keyword StartDate EndDate and Save
    Then I verify learning partner is able to enter the prerequisites
    Then I verify Learning partner is able to enter content details and click on Next button
    Then I verify Learning Partner is able to enter Assessment and Certification details

  @Regression@LearningPartnerReg
  Scenario: Verify Learning Partner is able to Enter the Reviewer Details of Course
    Given i navigate to Landing page
    When I verify click on login with learning partner
    Then verify navigated to course creation page post clicking create course
    Then enter course title language and course mode
    Then enter course sector and click on next
    Then select fees type and click on back button
    Then verify click on continue btn post entering all details in course create
    Then I verify learning partner able to enter Keyword StartDate EndDate and Save
    Then I verify learning partner is able to enter the prerequisites
    Then I verify Learning partner is able to enter content details and click on Next button
    Then I verify Learning Partner is able to enter Assessment and Certification details
    Then I verify Learning Partner is able to enter the Reviewer details




