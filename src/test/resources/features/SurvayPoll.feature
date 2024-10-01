Feature:  To verify the important link
Description: The purpose of this feature is we will cover all important link


	@Sanity@Regression@SurveysReg
	Scenario: To verify if user can access the Survey & Poll page
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click Survey & Poll tab from the right side panel
		Then  verify that page "Surveys & Polls"
		Then verify user able to navigate to surveys and polls page








