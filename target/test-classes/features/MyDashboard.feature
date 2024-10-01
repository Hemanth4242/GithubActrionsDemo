Feature: Verify PMKVY4.0 and eSHRAM in My Dashboard
Description: The purpose of this feature is to test PMKVY4.0 and eSHRAM functionalities
 
@Sanity
Scenario: Verify PMKVY4.0 and eSHRAM in My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify PMKVY in my dashboard
		Then I verify eshram in my dashboard
		
		
@Sanity
Scenario: Verify My Skill courses sections and Course Details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify learner able to access my skill courses all sections
		Then I verify navigated to course details page	
		
		
@Sanity
Scenario: Verify user navigated to My Dashboard My Courses and My credits sections from user profile dropdown
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is navigated to my dashboard page
		Then I verify user is navigated to my courses section
		Then I verify user is navigated to my credits section


