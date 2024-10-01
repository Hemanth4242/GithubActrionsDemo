Feature: Verify Skill India Map details
Description: The purpose of this feature is to test Skill India Map functionalities
 
@Sanity@Regression@SkillIndiaMapReg
Scenario: Verify Skill India Map
		Given i navigate to Landing page
		When I verify navigated to skill india map
		Then I verify relevant options and information
		Then I verify satellite view of skill india map
		Then I verify Full Screen of skill india map and zoom out
		Then I verify zoom in functionality of Skill India Map

	@Regression@SkillIndiaMapReg
	Scenario: Verify Learner able to access Job Exchange and Skill Centre in Skill India Map
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify learner is able to access Job Exchange and Skill Centre in SIM

	@Regression@SkillIndiaMapReg
	Scenario: Verify Learner able to Search Filter and Click on Legend in Skill India Map
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify search functionality in Skill India Map
		Then I verify filter dropdowns in skill india map
		Then I verify legend option in skill india map

	@Regression@SkillIndiaMapReg
	Scenario: Verify Learner able to access Measurement and clear search option in Skill India Map
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify clear search functionality in Skill India Map
		Then I verify measurement options in Skill India Map

	@Regression@SkillIndiaMapReg
	Scenario: Verify user not able to enter numbers or special characters in search field of SIM
		Given i navigate to Landing page
		When I verify navigated to skill india map
		Then I verify user not able to enter numbers in search field of SIM

	@Regression@SkillIndiaMapReg
	Scenario: Verify Learner able to see Legend options and scroll the legend bar successfully
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify legend option in skill india map
		Then I verify Map Legend options in skill india map

	@Regression@SkillIndiaMapReg
	Scenario: Verify Learner able to access state dropdown and scroll bar state dropdown
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify select state filter from dropdowns and scroll state filter dropdown


	@Regression@SkillIndiaMapReg
	Scenario: Verify Learner is not able to see any dropdown values without selecting state value
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify user cannot see district dropdown values without selecting state value in filter

	@Regression@SkillIndiaMapReg
	Scenario: Verify disabled Apply button and Close the filter functionality
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify disabled apply button and close the filter option

	@Regression@SkillIndiaMapReg
	Scenario: Verify user is able to clear search and close the Measurement popup in SIM
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify user is able to close the measurement popup and clear search

	@Sanity
	Scenario: Verify Learner able to access clear search option in Skill India Map
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify clear search functionality in Skill India Map

	@Regression_22
	Scenario: Verify Learner able to access Reset Filters in Gap Analysis
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify Learner is able to access Gap Analysis
		Then I verify the Minimum and Maximum Total Population values in Gap Analysis

	@Regression_22
	Scenario: Verify Learner able to access and Enter input values in Gap Analysis filters
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify Learner is able to enter the input values in Gap Analysis filters

	@Regression_22
	Scenario: Verify Learner able to validate Minimum and Maximum Area Covered in Gap Analysis
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify navigated to skill india map
		Then I verify Learer is able to enter minimum and maximum area covered in Gap Analysis






