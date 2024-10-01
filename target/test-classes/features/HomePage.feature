Feature: Home Page Module Features
Description: The purpose of this feature is to test Switch between tabs And Opportunities Near
 
@Sanity@Regression@HomePageReg
Scenario: Verify switch between skillcourses jobexchange and skill centres tab
		Given i navigate to Landing page
		Then I verify switch between skillcourses skillcentres and jobexchange
		Then I verify navigated skillindiamap clicking opportunities near you
		
		
@Sanity@Regression@HomePageReg
Scenario: Verify Learning Resources tab and Important links tab
		Given i navigate to Landing page
		Then I verify learning resources tab functionality
		Then I verify important links tab functionality
		Then I verify all important links access functionality

	@Sanity@Regression@HomePageReg
	Scenario: Verify About Us in Important links tab
		Given i navigate to Landing page
		Then I verify all important links access functionality About US

	@Sanity@Regression@HomePageReg
	Scenario: Verify Sectors in Important links tab
		Given i navigate to Landing page
		Then I verify all important links access functionality Sectors

	@Regression@HomePageReg
	Scenario: Verify user able to navigate to Government of India link
		Given i navigate to Landing page
		Then I verify user navigated to Government of India Link


	@Regression@HomePageReg
	Scenario: Verify user navigated to course details job description and skill centre details
		Given i navigate to Landing page
		Then I verify user navigated to course details page post clicking go to course
		Then I verify user navigated to job description page post clicking view details
		Then I verify user navigated to skill centre details popup post clicking view details


	@Regression@HomePageReg
	Scenario: To verify the color Welcome to Skill India Digital
		Given i navigate to Landing page
		Then I click on registration button and selected learner and verified welcome  text color

	@Regression@HomePageReg
	Scenario: To verify the headers menus
		Given i navigate to Landing page
		Then I verified the heaaders options


	@Sanity@Regression@HomePageReg
	Scenario: verify search functionality is working fine
		Given i navigate to Landing page
		Then I verify courses employment opportunities and skill centres by entering keyword in search field

	@Sanity@Regression@HomePageReg
	Scenario: Verify Location And Skip to MainContent
		Given i navigate to Landing page
		Then I verify location and switch between locations
		Then I verify skiptoMainContent and most popular section


	@Sanity@Regression@HomePageReg
	Scenario: Verify Contrast And Font size
		Given i navigate to Landing page
		Then I verify contrast in main page
		Then I verify decrease and increase of app font size

	@Sanity@Regression@HomePageReg
	Scenario: verify user able to access Notifications
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click Notification Bell icon from the top menu
		Then I verify the notification icon "No new notifications"

	@Sanity@Regression@HomePageReg
	Scenario Outline: To verify if user can search for respective Skill Courses/Job Exchange/Skill Centre results from the searchbar
		Given i navigate to Landing page
		Then scroll down and click "<Tab>" and enter the keyword "<Keyword>" and  click on search button And verify redireted "<Expected>"
		Examples:
			| Tab           | Expected      | Keyword                        |
			| Skill Courses | Skill Courses | Ketchup Processing Technician  |
			| Job Exchange  | Job Exchange  | Business Development Executive |
			| Skill Centre  | Skill Centre  | OLIVE G World Bank             |

	@Sanity@Regression@HomePageReg
	Scenario: To verify the navigation of Opportunities Near You button
		Given i navigate to Landing page
		When Scroll down to the Opportunities Near You section and click Opportunities Near You button
		Then Verify the navigation page "skill-india-map"

	@Sanity@Regression@HomePageReg
	Scenario: verify if user can find skill course as per the selected interest area
		Given i navigate to Landing page
		And Enter interest type in the "Agricultural" section and select it
		And Click Find Skill Courses button
		Then verify skill course page is displayed "Skill Courses"

	@Sanity@Regression@HomePageReg
	Scenario: verify if user can find job role as per the selected role type
		Given i navigate to Landing page
		And Enter job exchange in the "Trainer" section
		And Click Find Job Exchange button
		Then verify that expected element is displayed "1+ Employment Opportunities"

	@Sanity@Regression@HomePageReg
	Scenario: verify if user is navigated to the Recommendation page on selecting education type from "Not sure where to begin" section
		Given i navigate to Landing page
		And  In Not sure where to begin section, select the education type "Below 10th Standard" and click Next button
		Then verify career-counseling page should be displayed "Do you have any work experience?"

	@Regression@HomePageReg
	Scenario: verify Skill India Logo and Schemes dropdown
		Given i navigate to Landing page
		Then I verify user able to click on Skill India Logo in Home page
		Then I verify Scheme dropdown options and click On PMKVY

	@Regression@HomePageReg
	Scenario: verify user able to access all the headers of the home page
		Given i navigate to Landing page
		Then I verify user is able to access all the headers of the home page

	@Regression@HomePageReg
	Scenario: verify Learner is able to access virtual training sessions
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Logged in Learner is able to access virtual training sessions

	@Regression@HomePageReg
	Scenario: verify Learner is able to access playstore and footer virtual training session
		Given i navigate to Landing page
		Then I verify user is able to access virtual training sessions of footer section
		Then I verify user is able to redirected to playstore

	@Sanity@Regression@HomePageReg
	Scenario: verify Learner is able to access app store
		Given i navigate to Landing page
		Then I verify user is able to redirected to App store

	@Regression@HomePageReg
	Scenario: verify welcome popup when user clicks on Register under build a skilled section
		Given i navigate to Landing page
		Then I verify user is able to access register button under build a skilled section

	@Regression_BannerRemoved
	Scenario: verify user navigated to schemes page post clicking PMKVY Banner in HomePage
		Given i navigate to Landing page
		Then I verify user navigated to schemes page post clicking PMKVY

	@Regression@HomePageReg
	Scenario: verify user navigated to Skill Centre page post clicking Learn More
		Given i navigate to Landing page
		Then I verify user navigated to Skill Centre page post clicking Learn More under Look a Skill Centre

	@Regression@HomePageReg
	Scenario: verify all courses displayed under All tab of Learning resources
		Given i navigate to Landing page
		Then I click on learning resource option
		Then I verify courses displayed post clicking All tab

	@Regression@HomePageReg
	Scenario: verify Learner is able to access About Us and Click on + icon
		Given i navigate to Landing page
		Then I verify user is able to access About Us of footer section and Click on plus icon

	@Regression@HomePageReg
	Scenario: verify Learner is able to view all options under user profile
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify all options under user profile section

	@Regression@HomePageReg
	Scenario: verify user should be able to enter location name in skill universities
		Given i navigate to Landing page
		Then I verify important links tab functionality
		Then I verify user able to enter location name

	@Regression@HomePageReg
	Scenario: verify user should be able to access dashboard options
		Given i navigate to Landing page
		Then I verify dashboard options in Home page
		Then I verify user navigated particular dashboards post clicking dashboards

	@Regression@HomePageReg
	Scenario: verify user should be able to access Contact Us page
		Given i navigate to Landing page
		Then I verify user is able to access Contact Us page

	@Regression@HomePageReg
	Scenario: verify user is able to access Video content and verify share options
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on learning resource option
		Then I verify user able to access Video under Learning Resources
		Then I verify user is able to share the Video learning resource
		Then I verify user is able to click on cross button of the share popup

	@Regression@HomePageReg
	Scenario: verify user is able to access PDF content and verify share options
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on learning resource option
		Then I verify user able to access PDF under Learning Resources
		Then I verify user is able to share the Video learning resource
		Then I verify user is able to click on cross button of the share popup

	@Regression@HomePageReg
	Scenario: verify user is able to Apply filters and Reset filters in Learning Resources
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on learning resource option
		Then I verify user is able to interact and select the content type
		Then I verify user is able to interact with content category and select content category
		Then I verify user is able to select the Language from dropdown
		Then I verify user is able to Reset the applied filters

	@Regression@HomePageReg
	Scenario: verify user access Sectors and share the Job Opportunities
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify important links tab functionality
		Then I verify user is able to view details of Sector Card
		Then I verify user is able to share the opportunities under sectors

	@Regression@HomePageReg
	Scenario: verify user is able to add the job to Favorites in Sectors
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify important links tab functionality
		Then I verify user is able to view details of Sector Card
		Then I verify user is able to add the job to favorite section and remove from favorite section

	@Regression@HomePageReg
	Scenario: verify color of Roles And Responsibilities and verify user redirected post clicking Apply now
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify important links tab functionality
		Then I verify user is able to view details of Sector Card
		Then I verify user able to see Roles and Responsibilities color in Orange
		Then I verify user redirected to NSDC jobx portal post clicking Apply Now

	@Regression@HomePageReg
	Scenario: verify Apply filters Reset filters and verify redirection post clicking view details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify important links tab functionality
		Then I verify user is able to select type location and Apply and Reset filters
		Then I verify user redirected post clicking View details of Skill University card
		Then I verify user navigated to SIM from Skill Universities

	@Regression@HomePageReg
	Scenario: verify user should be able to access convergence dashboard
		Given i navigate to Landing page
		Then I verify dashboard options in Home page
		Then I verify user navigated to Convergence Dashboard

	@Regression@HomePageReg
	Scenario: verify the color of the Headers of Home Page
		Given i navigate to Landing page
		Then I verify the Orange color of the Headers of HomePage


	@Sanity_Removed
	Scenario: verify the banner navigation for Guest user
		Given i navigate to Landing page
		Then I verify user is navigated to Login Page post clicking India Skills Banner

	@Sanity_Removed
	Scenario: verify the banner navigation for Registered User with eKYC
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is navigated india skills page for Registered user with eKYC

	@Sanity_Removed
	Scenario: verify the banner navigation for Registered User without eKYC
		Given i navigate to Landing page
		When I verify click on login with learner without eKYC
		Then I verify user is navigated to complete eKYC page post clicking india skills banner

	@Sanity
	Scenario: verify user is navigated to Announcements section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is navigated to Announcements section from homepage widget

	@Sanity@Regression@HomePageReg
	Scenario: verify user is navigated to Dashboards section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Dashboard section options in side widget
		Then I verify user is navigated to India Skills dashboard
		Then I verify user is navigated to Digital Learning Analytics Dashboard
		Then I verify user is navigated to NSDC International Dashboard
		Then I verify user is navigated to PM Vishwakarma Summary Dashboard

	@Sanity@Regression@HomePageReg
	Scenario: verify user is able to access all the Quick Links in Footer section
		Given i navigate to Landing page
		Then I verify user is able to access Sector Skill Council Link
		Then I verify user is able to access National Career Service Link
		Then I verify user is able to access A and A Knowledge Bank Link
		Then I verify user is able to access AA Faqs Link
		Then I verify user is able to access MOHUA Link

	@Sanity@Regression@HomePageReg
	Scenario: verify user is able to access Quick Links in Footer section
		Given i navigate to Landing page
		Then I verify user is able to access PMKVY AC Guidelines Link
		Then I verify user is able to access Standalone NOS Listing Link
		Then I verify user is able to access Borrowed QP Listing Link
		Then I verify user is able to access SCPWD Borrowed QP Link
		Then I verify user is able to access QP Listing Link
		Then I verify user is able to access important links Link

	@Sanity@Regression@HomePageReg
	Scenario: verify user is able to access Important Links Quick Links
		Given i navigate to Landing page
		Then I verify user is able to access important links Link
		Then I verify user is access first quick link of Important link
		Then I verify user is access second quick link of Important link
		Then I verify user is access third quick link of Important link
		Then I verify user is access fourth quick link of Important link
		Then I verify user is access fifth quick link of Important link

	@Sanity
	Scenario: verify user is able to access Building a Skill India section of Homepage
		Given i navigate to Landing page
		Then I verify user is able navigate to Building a Skill India Section

	@Sanity
	Scenario: verify user is access Skill India Connect and View All
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access Skill India Connect and click on View Details

	@Sanity@Regression@HomePageReg
	Scenario: verify user is navigated to Apprenticeship and PMKVY Dashboards section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Dashboard section options in side widget
		Then I verify Learner is able to access Apprenticeship and PMKVY Dashboard Section

	@Sanity
	Scenario: verify user navigated to Skill Course Job Exchange and Skill Centre page post clicking Learn More
		Given i navigate to Landing page
		Then I verify user is able to navigate to Skill Course page from Learn more
		Then I verify user is able to navigate to Job Exchange page from Learn more
		Then I verify user is able to navigate to Skill Centre page from Learn more

	@Sanity
	Scenario: verify the HomePage banner navigation for Guest user
		Given i navigate to Landing page
		Then I verify user is navigated to Login Page post clicking Banner


	@Sanity
	Scenario: verify the sample chatbot query
		Given i navigate to Landing page
		Then I verify a sample skill course query in Chatbot

	@Sanity@Regression@HomePageReg
	Scenario: verify user is navigated to Apprenticeship Dashboards options
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Dashboard section options in side widget
		Then I verify user is able to navigate to Apprenticeship Dashboard
		Then I verify user is able to navigate to NAPS DBT Dashboard

	@Sanity@Regression@HomePageReg
	Scenario: verify user is navigated to PMKVY Dashboards options
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Dashboard section options in side widget
		Then I verify PMKVY Dashboard Links in Right side widget
		Then I verify user is navigated to Summary Dashboard
		Then I verify user is navigated to Premium Analytics Dashboard
		Then I verify user is navigated to State Level Performance Dashboard

	@Regression@HomePageReg
	Scenario: verify user is navigated to Help & Support and Schemes page from Homepage footer
		Given i navigate to Landing page
		Then I verify user is navigated to Help and Support page
		Then I verify user is navigated to Skilling Program page post clicking Schemes Link

	@Regression@HomePageReg
	Scenario: verify user is able to fill all the mandatory field and submit the query in Contact Us
		Given i navigate to Landing page
		Then I verify user is able to fill all the mandatory fields in Contact us

	@Regression@HomePageReg
	Scenario: verify user is able access Contact Number in Contact Us
		Given i navigate to Landing page
		Then I verify user is able to access Contact Number in Contact Us page

	@Regression@HomePageReg
	Scenario: verify user is able access View Larger Map for Address in Contact Us
		Given i navigate to Landing page
		Then I verify user is able to access view larger map for Address in Contact us page

	@Regression@HomePageReg
	Scenario: verify user is able to redirect to Directions and Reviews page and access Zoom In and Out in Contact Us
		Given i navigate to Landing page
		Then I verify user is able to redirect to Directions from Contact Us
		Then I verify user is able to redirect to Reviews from Contact Us
		Then I verify user is able to click on Zoom In and Zoom Out in Contact Us Address map





