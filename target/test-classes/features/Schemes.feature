Feature: To verify if user can access all tabs in Analytics Dashboard page
  Description: The purpose of this feature is to test Analytics Dashboard page

  @Sanity_ExpectedFailure
  Scenario: To verify if user can complete a self assessment
    Given i navigate to Landing page
    When Click Schemes dropdown from the top menu
    And  Click PMKVY tab
    And Click Analytics Dashboard tab
    And Click "<Tab>" tab

      
      
@Sanity@Regression@SchemesReg
  Scenario: verify user navigated to courses Page
    Given i navigate to Landing page
    When Click Schemes dropdown from the top menu
    Then verify the All Schemes Page and click on Apply now
    Then verify user navigated to courses page post clicking View All
    
    
@Sanity
  Scenario: verify user able apply filters in learning resources
    Given i navigate to Landing page
    When Click Schemes dropdown from the top menu
    Then verify user is able to navigate to learning resource page
    Then Verify user able to apply content type filters in learning resouces page
    Then Verify user able to apply content category and language filter and click on Reset button
    
@Sanity
  Scenario: Verify user able to navigate to learning resource page and share the learning resource
    Given i navigate to Landing page
    When Click Schemes dropdown from the top menu
    Then verify user is able to navigate to learning resource page
    Then verify user is able to download and share the learning resource

  @Sanity@Regression@SchemesReg
  Scenario: Verify clicking on PMKVY scheme
    Given i navigate to Landing page
    When  Login to the application as a Learner "7053397849","1"
    And  click on schemes
    Then click on all schemes and verify that "Skilling Program"
    Then click on apply and verify that
    Then click on the applyNow button and verify that
    Then click on courses and verify that


  @Regression@SchemesReg
  Scenario: Verify clicking on PMKVY scheme and share
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then navigate to the click on share button and verify that
    Then click on whatsapp button "Whatsapp" and verify redirected page
    Then click on facebook button "Facebook" and verify redirected page
    Then click on twitter button "Twitter" and verify redirected page
    Then click on linkedIn button "LinkedIn" and verify redirected page
    Then click on copied button and verify that





  @RegressionNotRun
  Scenario: It should show the course details and having apply now button on the page
    Given i navigate to Landing page
    When  Login to the application as a Learner "9148574673","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  click on application and verify that
    Then  click on view application and verify that
    Then  click on accepted and verify that "Approval is pending for this batch."
    Then  click on history and verify that "Approval is pending for this batch."
    Then  click on rejected and verify that
    Then  i verify that sort AtoZ "A" and verify that sort ZtoA "O"

  @RegressionNotRun
  Scenario: verify application and view all
    Given i navigate to Landing page
    When  Login to the application as a Learner "9148574673","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  click on application and verify that
    Then  click on view all and verify that

  @RegressionNotRun
  Scenario: verify that search icon filter and checkbox
    Given i navigate to Landing page
    When  Login to the application as a Learner "9148574673","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  i should able to search the record "Office Assistant" and verify that "Office Assistant" and also verify that reset button
    Then  i should able to search courses and verify that "Office Assistant","Associate Designer-Die and Mould for Plastic including toys"
    Then  click on schemes filter and select checkbox and verify that "Office Assistant"

  @RegressionNotRun
  Scenario: verify dashboard feature in schemes
    Given i navigate to Landing page
    When  Login to the application as a Learner "9148574673","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  Verify click on skill courses under Recommendations for you
    Then  Verify click on job exchange under Recommendations for you
    Then  Verify click on skill centre under Recommendations for you
    Then  Verify click on ebooks under Recommendations for you
    Then  Verify summary under dashboard
    Then  Verify my credits under dashboard
    Then  Verify your adhaar kyc is complete font colour "rgba(223, 110, 18, 1)"
    Then  Verify font color EDIT button "rgba(255, 255, 255, 1)"



  @RegressionNotRun
  Scenario: verify edit feature on dashboard schemes
    Given i navigate to Landing page
    When  Login to the application as a Learner "9148574673","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  Verify click on EDIT button
    Then  Verify photo encircle based on the percentage of profile completed "img"
    Then  Verify clicking on share icon on edit profile page
    Then click on whatsapp button "Whatsapp" and verify redirected page
    Then click on facebook button "Facebook" and verify redirected page
    Then click on twitter button "Twitter" and verify redirected page
    Then click on linkedIn button "LinkedIn" and verify redirected page
    Then click on copied button and verify that
    Then  Verify edit and delete icon for the address on edit profile page




  @RegressionNotRun
  Scenario: verify edit icon on edit profile in dashboard
    Given i navigate to Landing page
    When  Login to the application as a Learner "7053397849","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  click on edit button on dashboard and click on edit button on profile
    Then  Verify editing address line first "J-73 Anant Ram Dairy Complex"
    Then  Verify editing address line second "first flour dairy complax"
    Then  Verify editing state
    Then  Verify editing district
    Then  Verify editing block
    Then  Verify editing pincode "851205"
    Then  Verify editing city "Rasounk"
    Then  Verify above all the text field "J- Anant Ram Dairy Complex, first flour dairy complax, Rasounk,"

  @RegressionNotRun
  Scenario: verify edit icon on edit profile in dashboard
    Given i navigate to Landing page
    When  Login to the application as a Learner "7053397849","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  click on edit button on dashboard and click on edit button on profile
    Then  Verify clicking on update button with empty non mandatory fields "J- Anant Ram Dairy Complex","851205","Rasounk"
    Then  Verify clicking on update button with empty mandatory fields "first flour dairy complax","J- Anant Ram Dairy Complex, J- Anant Ram Dairy Complex, Rasounk, KHAGARIA, BIHAR."


  @Regression@SchemesReg
  Scenario: verify that different language selecting on profile page
    Given i navigate to Landing page
    When  Login to the application as a Learner "9148574673","1"
    And   click on schemes and click on PMKVY and click on dashboard
    Then  Verify clicking on language in side menu of user profile
    Then  Verify selecting any language under read

  @Regression@SchemesReg
  Scenario: Verify clicking on view details pop up
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details button and verified the course key feature

  @Regression@SchemesReg
  Scenario: verify show interest button for the selected batch in PMKVY scheme
    Given i navigate to Landing page
    When  Login to the application as a Learner "7053397849","1"
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified the show interest page

  @RegressionNotRun
  Scenario: Verify selecting scheme filter on show interest page
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified the start date dropdown

  @RegressionNotRun
  Scenario: Verify sub scheme filter on show interest page
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified the sub scheme filter

  @RegressionNotRun
  Scenario: Verify start date filter on show interest page
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified the start date dropdown


  @RegressionNotRun
  Scenario: Verify state filter on show interest page
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified state dropdown filter

  @RegressionNotRun
  Scenario: Verify district filter on show interest page
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified the district dropdown

  @Regression@SchemesReg
  Scenario: Verify show interest should be disabled when no batch is selected
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified that show interest option is disabled

  @RegressionNotRun
  Scenario: Verify show interest button is enabled when batch is selected
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified show interest button is enabled

  @RegressionNotRun
  Scenario: Verify removing selected batch option
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified batch check box is unselected

  @RegressionNotRun
  Scenario: Verify batch details box above show interest button is displayed
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I click on applyNow button and course name
    Then I click on view details and apply button
    Then I verified the batch details box is displayed


  @Regression@SchemesReg
  Scenario: Verify schemes all available options
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on scheme button
    Then I verified scheme all available options
    Then I verified pmkvy sub scheme all available options
    Then I click on scheme button
    Then I click on scheme button
    Then I click on pmkvy and dashboard and verified all available options

  @Regression@SchemesReg
  Scenario: Verify my skill courses all available options
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on scheme button
    Then I click on pmkvy and dashboard and verified my skill courses all available options
    Then I verified the courses displayed are online

  @RegressionNotRun
  Scenario: Verify join now under offline
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on scheme button
    Then I click on pmkvy and dashboard and verified offLine join now option

  @RegressionNotRun
  Scenario: To verify the click on completed option and explore button
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on scheme button
    Then I click on pmkvy and dashboard and verified the click and explore option


  @RegressionNotRun
  Scenario: To verify Recommendations for you option
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on scheme button
    Then I click on recommendation for you and verified the recommended options

  @Regression@SchemesReg
  Scenario: verify user navigated to Register page post clicking Register in Schemes
    Given i navigate to Landing page
    When Click Schemes dropdown from the top menu
    Then I verify user navigated to register page

  @Sanity@Regression@SchemesReg
  Scenario: verify user navigated to courses centres books and analytics dashboard
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I verify user able to click on PMKVY and access all sections of PMKVY

  @Sanity
  Scenario: verify user is navigated to Batch section page from NSDC Academy
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I verify user is able to access NSDC Academy from Schemes Dropdown

  @Sanity@Regression@SchemesReg
  Scenario: Verify All skilling Program filter options and functionality
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then I verify scheme filters functionality are working fine
    Then I verify Reset filter functionality working fine
    Then I verified schemes are sorted in descending order
    Then I verified schemes are sorted in ascending order

  @Regression@SchemesReg
  Scenario: Verify Sort functionality is working fine in All Skilling Programs of Schemes
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then I verified schemes are sorted in descending order
    Then I verified schemes are sorted in ascending order

  @Regression@SchemesReg
  Scenario: Verify Share option of the scheme and cross option of share functionality
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then I verify share option of the scheme and cross option of the scheme

  @Regression@SchemesReg
  Scenario: verify user able to click on pagenumbers in skilling Programs page
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then I verify user is able to click on Page number in Skilling Program

  @Regression@SchemesReg
  Scenario: verify user able to see the details of Scheme Card
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then I verify user is able to see all the details of the Scheme card

  @Regression@SchemesReg
  Scenario: verify user is able to see all the details of Scheme,Sectors list and Cross option
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on schemes button and selected all schemes option
    Then i click on one scheme option
    Then I verify All Scheme Details for any one scheme
    Then I verify Sectors popup and Cross Option functionality






