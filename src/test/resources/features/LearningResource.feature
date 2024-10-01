Feature: Learning resource option

@Sanity@Regression@LearningResourceReg
Scenario: To verify user can view and download ebook
  Given i navigate to Landing page
  When I verify click on login with learner
  Then I click on learning resource option
  Then I click on the ebook name
  Then I verified user can view the eBook
  Then I verified user can download eBook
