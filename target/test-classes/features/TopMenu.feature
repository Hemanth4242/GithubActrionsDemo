Feature:  To verify the top menu element
Description: The purpose of this feature is we will automate all top most menu


	@Sanity
	Scenario: To verify if user can search for respective Skill Courses/Job Exchange/Skill Centre results from the searchbar
		Given i navigate to Landing page
		When Click Searchbar icon from the top menu and enter
		Then  I verify that redirected page "data-placeholder",expecte is "Search Skill Courses, Skill Centres and Opportunities"







