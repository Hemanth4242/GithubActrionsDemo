Feature: Verify Recommendation Feature
  Description: The purpose of this feature is to test  complete a self assessment

  @Sanity@Regression@RecommendationReg
  Scenario: To verify if user can complete a self assessment
    Given i navigate to Landing page
    When Click Recommendation tab from the op menu
    And  fill all the self assessment text field "4","1","India","Agricultural"
    Then Verify the behavior assessment "Suggestions"

  @Regression@RecommendationReg
  Scenario: verify Yes or No options and Experience in year and month is not displayed for Selected No option
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify all education qualification fields in Recommendation
    Then I verify Yes or No options available in Experience Page

  @Regression@RecommendationReg
  Scenario: Verify within India state  district and International Opportunities options in Location of Recommendation
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify within India and International Opportunity for relocate option "2","4"
    Then I verify state and district values should be selected to proceed

  @Regression@RecommendationReg
  Scenario: Verify Country options in International Opportunities in Location of Recommendation
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify within India and International Opportunity for relocate option "2","6"
    Then I verify country options and post selecting Country to proceed

  @Regression@RecommendationReg
  Scenario: Verify Suggestions without selecting relocation in Recommendation flow
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify within India and International Opportunity for relocate option "2","5"
    Then I verify suggestions based on the selected interest Area without selecting location "Agricultural"
    Then Verify the behavior assessment "Suggestions"

  @Regression@RecommendationReg
  Scenario: verify Higher Education details Back button and Next button functionality
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify all education qualification fields in Recommendation
    Then I verify disabled Next button and Dark Blue color Post selecting Highest Education

  @Sanity
  Scenario: verify user navigated to Job Exchange page from Recommendation
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify user is able to fill the recommendations and access suggestions
    Then I verify user is able to select one suggestion and click on Submit button
    Then I verify user is navigated to Job Exchange page from Recommendation

  @Sanity
  Scenario: verify user navigated to Skilling Program page from Recommendation
    Given i navigate to Landing page
    When I verify click on login with learner
    When Click Recommendation tab from the op menu
    Then I verify user is able to fill the recommendations and access suggestions
    Then I verify user is able to select one suggestion and click on Submit button
    Then I verify user is navigated to Skilling Program page