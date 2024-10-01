Feature: Landing page Footer Tests 
Description: The purpose of this feature is to test Footer.
 
@Sanity@Regression@HomePageReg
Scenario: Verify Landing page Footer are working fine
		Given i navigate to Landing page
		Then I verify the footers Links of What We offer
		|Skill Courses|
		|Skill Centre|
		|Job Exchange|
		|PMKVY4.0|
		|eBooks|

@Sanity@Regression@HomePageReg
Scenario: Verify Landing page Footer social media links are working fine
		Given i navigate to Landing page
		Then I verify the Footer Links other sectors links
		|Job Roles|
		|Sectors|
		|Skill India Map|
		|Recommendation|

@Sanity@Regression@HomePageReg
Scenario: Verify Landing page Footer Who we are links are working fine
		Given i navigate to Landing page
		Then I verify the Footer Links of Others Services
		|MinisrtySkillDevLink|
		|PublicGrievances|
		|IndiaGOVIn|
	    |TowardOfNew|

	@Sanity@Regression@HomePageReg
	Scenario: Verify Landing page Footer social media links are working fine
		Given i navigate to Landing page
		Then I verify the Footer Links social media links
			|FaceBook|
			|LinkedIn|
			|Twitter|
			|Youtube|

	@Sanity@Regression@HomePageReg
	Scenario: Verify Landing page Footer Who we are links are working fine
		Given i navigate to Landing page
		Then I verify the Footer Links of Who we are
			|ABOUT US|
			|TERMS & CONDITIONS|
			|PRIVACY POLICY|
			|DISCLAIMER|
			|CONTACT US|