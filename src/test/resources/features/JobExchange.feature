Feature: JobExchange Page Verification
Description: The purpose of this feature is to test Job Exchange page features
 
@Sanity@Regression@JobExchangeReg
Scenario: Verify navigated to JobExchange and searched Industry sector details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is able to navigate to available tabs page in job exchange page
		Then I verify jobcards displayed for searched industry in search field
		
		
@Sanity@Regression@JobExchangeReg
Scenario: Verify different job cards and apprenticeship cards displayed
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify different Job Cards Displayed post clicking Jobs
		Then I verify different Apprenticeship Cards Displayed post clicking apprenticeship
		
@Sanity@Regression@JobExchangeReg
Scenario: Verify Location based job cards and Reset button functionality
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify jobs based on applied location filters
		Then I verify removed filters post clicking reset button
		
@Sanity@Regression@JobExchangeReg
Scenario: Verify navigation is working in Pagination
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify pagination is working in JobExchange

	@Sanity@Regression@JobExchangeReg
	Scenario: To verify if user click on job exchange button than available job exchange option should displayed
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verified user is navigated to job exchange page
		Then I verified the different job exchange options


	@Sanity@Regression@JobExchangeReg
	Scenario: To verify that if user click on course detail then details should be displayed
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I click on course name
		Then I verified the course details

	@Sanity@Regression@JobExchangeReg
	Scenario: To verify that user can sort the courses in ascending order
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I click on course dropDown
		Then I sorted the courses in ascending order
		Then I verified courses are sorted in ascending order

	@Sanity@Regression@JobExchangeReg
	Scenario: To verify that user can sort the courses in descending order
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I click on course dropDown
		Then I sorted the course in descending order
		Then I verified courses are sorted in descending order

	@Sanity@Regression@JobExchangeReg
	Scenario: To verify job course filter
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I click on course radio button
		Then I verified the job course search result

	@Sanity@Regression@JobExchangeReg
	Scenario: To verify the job exchange search result
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I enter text in the input field
		Then I verified the different job exchange options
		Then I cleared the search input field

	@Regression@JobExchangeReg
	Scenario: verify all the information on the Job Card displayed in Job Exchange
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information on the Job Card displayed

	@Regression@JobExchangeReg
	Scenario: verify user is able to access all the sections of Job Exchange Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify apprenticeships under all the sections of Job Exchange page

	@Regression@JobExchangeReg
	Scenario: verify user is able to access view details of Apprenticeship
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to click on View Details of Apprenticeship

	@Regression@JobExchangeReg
	Scenario: verify all the information on the Apprenticeship Card displayed in Job Exchange
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information on the Apprenticeship Card displayed

	@Regression@JobExchangeReg
	Scenario: Verify Job details and post clicking Job card view details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user navigated to Job details post clicking View Details button

	@Sanity@Regression@JobExchangeReg
	Scenario: Verify Job details in Popular Job Exchange Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to view job details from Popular Job Exchange Section

	@Regression@JobExchangeReg
	Scenario: Verify Pagination works properly in Popular Job Exchange Section for Jobs
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination is working properly in Popular Job Exchange section

	@Regression@JobExchangeReg
	Scenario: Verify Pagination works properly in Popular Job Exchange Section for Apprenticeships
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination is working properly in Popular Job Exchange section for Apprenticeships

	@Regression@JobExchangeReg
	Scenario: Verify Pagination works properly in Job Exchange Page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able navigate to next page and previous page by clicking pagination arrows
		Then I verify User is navigated to particular page number in pagination

	@Regression@JobExchangeReg
	Scenario: Verify all the share options displayed for the particular Job in View details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify click on view details of Jobs in Job Exchange page
		Then I verify share options displayed post clicking Share button

	@Regression@JobExchangeReg
	Scenario: Verify all the Favorite option displayed for the particular Job in View details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify click on view details of Jobs in Job Exchange page
		Then I verify job is added to favorite section in view details

	@Sanity@Regression@JobExchangeReg
	Scenario: Verify user redirected to new tab post clicking Apply Now button
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify click on view details of Jobs in Job Exchange page
		Then I verify user navigated to seperate tab post clicking ApplyNow button

	@Regression@JobExchangeReg
	Scenario: Verify skill centre details in Popup of Job exchange page
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify click on view details of Jobs in Job Exchange page
		Then I verify all the information of Skill Centre in View details of Job under skill Centre

	@Regression@JobExchangeReg
	Scenario: Verify user navigated to Job details page from Job exchange under view details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify click on view details of Jobs in Job Exchange page
		Then I verify user navigated to Job details page post clicking View Details

	@Regression@JobExchangeReg
	Scenario: Verify the color of Login Button post entering the password
		Given i navigate to Landing page
		Then I verify color of Login button post entering the password

	@Regression@JobExchangeReg
	Scenario: Verify Jobs displayed under Jobs section and Color of Reset button
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify the jobs displayed under Jobs and Color of Reset button

	@Regression@JobExchangeReg
	Scenario: verify the share options of the Job card
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to share the Job

	@Regression@JobExchangeReg
	Scenario: verify user is able to add the job to Favorite section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify the user is able to add the job to Favorite section

	@Regression@JobExchangeReg
	Scenario: verify user is able to access all the sections of Job Exchange Page for Jobs
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify Jobs under all the sections of Job Exchange page

	@Regression@JobExchangeReg
	Scenario: Verify all details of Job card under Popular Job Exchange section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination is working properly in Popular Job Exchange section
		Then I verify all the details on the Job Card under Popular Job Exchange section

	@Regression@JobExchangeReg
	Scenario: Verify share option and favorite option in Popular Job Exchange section job
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination is working properly in Popular Job Exchange section
		Then I verify user is able to share the Popular job
		Then I verify user is able to add the popular job to favorite section

	@Regression@JobExchangeReg
	Scenario: Verify all the details under the Job Description of Job
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify click on view details of Jobs in Job Exchange page
		Then I verify the details of the Job under Description section

	@Regression@JobExchangeReg
	Scenario: Verify user is able to view Skill Course Job Exchange and Skill Centres in View Details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to see Skill Course Job Exchange and Skill Centres of selected Industry

	@Regression@JobExchangeReg
	Scenario: Verify all details of Job under Job Exchange section of View details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information under Job Exchange section in View details page

	@Regression@JobExchangeReg
	Scenario: Verify user is able to access View all under JobExchange section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to access view all button

	@Regression@JobExchangeReg
	Scenario: Verify user is able to add the job to Favorite section from Job Exchange section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to add the job to favorite section

	@Regression@JobExchangeReg
	Scenario: Verify pagination working fine in Job Exchange section in view Details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination or page mover is working fine

	@Regression@JobExchangeReg
	Scenario: Verify all details of Skill Centre under Skill Centre section of View details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information under Skill Centre section in View details page

	@Regression@JobExchangeReg
	Scenario: Verify user is able to add Skill Centre to favorite section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information under Skill Centre section in View details page
		Then I verify user is able to add skill centre to favorite section

	@Regression@JobExchangeReg
	Scenario: Verify user is able to access View all under Skill Centre section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to access View all from Skill Centres section


	@Regression@JobExchangeReg
	Scenario: Verify pagination working fine in Skill Centre section in view Details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination or page mover is working fine for Skill Centre

	@Regression@JobExchangeReg
	Scenario: Verify all details of Skill Course under Skill Course section of View details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information under Skill Course section in View details page

	@Regression@JobExchangeReg
	Scenario: Verify user is able to share the Apprenticeships
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to share the Apprenticeships and share options

	@Regression@JobExchangeReg
	Scenario: Verify user is able to share the course under Job Exchange view details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to share the skill course under view details

	@Regression@JobExchangeReg
	Scenario: Verify user is able to access View all under Skill Course section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to access View all from Skill Courses section

	@Regression@JobExchangeReg
	Scenario: Verify user is able to add Skill Course to favorite section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to add skill course to favorite section

	@Regression@JobExchangeReg
	Scenario: Verify pagination working fine in Skill Course section in view Details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify pagination or page mover is working fine for Skill Course

	@Regression@JobExchangeReg
	Scenario: verify share option on the Apprenticeship Card displayed in Popular Job Exchange
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify user is able to share the Apprenticeship in Popular Job Exchange Section

	@Regression@JobExchangeReg
	Scenario: verify user is able to view all the information on the Apprenticeship View details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on job exchange button
		Then I verify all the information on the view details of Apprenticeships

	@Sanity
	Scenario: verify user is able to navigate to View details of Apprenticeship post Login
		Given i navigate to Landing page
		Then I click on job exchange button
		Then I verify User navigated to Login section post clicking View Details on Apprenticeship






