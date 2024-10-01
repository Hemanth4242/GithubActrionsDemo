Feature: Skill Centre Page Verification
Description: The purpose of this feature is to test skill centre page features

@Sanity@Regression@SkillCentreReg
Scenario: Verify navigated to skill centre page and all the sections
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify jobcards displayed for all sections of skill centres
		
@Sanity@Regression@SkillCentreReg
Scenario: Verify learner is able apply filters and reset all the applied filters
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify learner is able to apply location filter industry filter and course filter
		Then I verify learner is able to reset the applied filters
		
		
@Sanity@Regression@SkillCentreReg
Scenario: Verify learner is able to search and sort the skill centres
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify search functionality and sort functionality


	@Regression@SkillCentreReg
	Scenario: verify color of Location Radio button and Reset button of Skill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify Location and Interest Area section in Skill Centre page
		Then I verify color of location radio button post selecting radio button

	@Regression@SkillCentreReg
	Scenario: Verify all the information displayed on the Skill Centre Card
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify all the information available on the ITI card in Skill Centre page

	@Regression@SkillCentreReg
	Scenario: Verify facebook linkedin twitter and youtube links are working fine in Skill Centre
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify the Footer Links social media links
			|FaceBook|
			|LinkedIn|
			|Twitter|
			|Youtube|

	@Regression@SkillCentreReg
	Scenario: verify Learner is able to access footer virtual training session in Skill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify user is able to access virtual training sessions of footer section
		Then I verify all completed training sessions

	@Regression@SkillCentreReg
	Scenario: Verify SkillCourses SKillCentre JobExchange and PMKVY in SKill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify the footers Links of What We offer
			|Skill Courses|
			|Skill Centre|
			|Job Exchange|
			|PMKVY4.0|
			|eBooks|

	@Regression@SkillCentreReg
	Scenario: Verify JobRoles Sectors SkillIndiaMap and Recommendation in SKill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify the Footer Links other sectors links
			|Job Roles|
			|Sectors|
			|Skill India Map|
			|Recommendation|

	@Regression@SkillCentreReg
	Scenario: Verify AboutUS TermsOfUse PrivacyPolicy Disclaimer and Contact Us in Skill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify the Footer Links of Who we are
			|ABOUT US|
			|TERMS & CONDITIONS|
			|PRIVACY POLICY|
			|DISCLAIMER|
			|CONTACT US|

	@Regression@SkillCentreReg
	Scenario: Verify all the information displayed on the Skill India Centers Card
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify all the information available on the Skill India Center card in Skill Centre page

	@Regression@SkillCentreReg
	Scenario: Verify pagination arrows and pagination should work fine in SKill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill india map
		Then I verify navigated to skill centre page
		Then I verify user is able navigate to next page and previous page by clicking pagination arrows
		Then I verify User is navigated to particular page number in pagination

	@Regression@SkillCentreReg
	Scenario: Verify Orange color of Skill India Centers and JSS in Skill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify Skill India Centers Color changed to Orange post selecting it
		Then I verify JSS Color changed to Orange post selecting it

	@Regression@SkillCentreReg
	Scenario: Verify user able to access view details in PMKVY section of SKill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify learner is able to access View details of PMKVY section skill centres

	@Regression@SkillCentreReg
	Scenario: Verify user able to add skill centres to favorite section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify user is able to add skill centres to favorite section from ITI
		Then I verify user is able to add skill centres to favorite section from JSS
		Then I verify user is able to add skill centres to favorite section from PMKVY
		Then I verify user is able to add skill centres to favorite section from SkillIndiaCentres

	@Regression@SkillCentreReg
	Scenario: Verify user able to share skill centres from all sections
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify user is able to share skill centres from ITI section
		Then I verify user is able to share skill centres from JSS section
		Then I verify user is able to share skill centres from PMKVY section
		Then I verify user is able to share skill centres from SkillIndiaCentres section

	@Regression@SkillCentreReg
	Scenario: Verify user able to access location and navigated to SIM from all sections of Skill Centre Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify user navigated to SIM from ITI section location
		Then I verify user navigated to SIM from JSS section location
		Then I verify user navigated to SIM from PMKVY section location
		Then I verify user navigated to SIM from SkillIndiaCentres section location

	@Regression@SkillCentreReg
	Scenario: Verify background color of Login button post entering PIN
		Given i navigate to Landing page
		When I verify color of Login button post entering correct PIN

	@Regression_2
	Scenario: Handled Automatic Opening of Chatbot issue
		Given i navigate to Landing page to handle webchatbot
		When I verify color of Login button post entering correct PIN

	@Regression@SkillCentreReg
	Scenario: verify the color of the Headers of Home Page
		Given i navigate to Landing page
		Then I verify the Orange color of the Headers of HomePage

	@Regression@SkillCentreReg
	Scenario: Verify the font color of ITI option post selecting ITI Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify Orange color of the ITI text post selecting ITI

	@Regression@SkillCentreReg
	Scenario: Verify all the information displayed on the JSS Card
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify all the information available on the JSS card in Skill Centre page

	@Regression@SkillCentreReg
	Scenario: Verify user is able to click on Courses Offered in Skill India Centre card
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify user is able to click on Courses Offered in Skill India Centers card

	@Regression@SkillCentreReg
	Scenario: Verify Color of the PMKVY Section in Skill Centre
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify color of PMKVY post mouse hover on it

	@Regression@SkillCentreReg
	Scenario: Verify Color of the location name in Skill Centre
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify color of the location name post mouse hover on it

	@Regression@SkillCentreReg
	Scenario: Verify Color of the Interest Area in Skill Centre
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify navigated to skill centre page
		Then I verify interest area option color changed to orange






