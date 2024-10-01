Feature: PMKVY eshram And My virtual Training sessions
Description: The purpose of this feature is to test user profile options
 
@Sanity@Regression
Scenario: Verify PMKVY eshram and My Virtual Training sessions
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify PMKVY in User profile section
		Then I verify eshram in user profile section
		Then I verify my virtual training sessions in user profile section
		


