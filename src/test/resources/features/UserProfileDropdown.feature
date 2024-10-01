Feature: User Profile Dropdown sections verification
Description: The purpose of this feature is to test user profile dropdown sections
 
 
@SanityRegression@UserProfileReg
Scenario: Verify view profile surveys polls and Favourite section from user profile dropdown
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify favourite section from user profile dropdown
	    Then I verify surveys and polls from user profile dropdown

@Sanity
Scenario: Verify My Activity Analysis And Preferences from user profile dropdown
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is navigated to My Activity Analysis Page
		Then I verify user is navigated to Preferences Page

	@Sanity@Regression@UserProfileReg
	Scenario: Verify user able to click on Documents Family and Banking Sections
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to click on Documents Family and Banking Sections

	@Sanity@Regression@UserProfileReg
	Scenario: Verify user able to share the profile and click on Download profile
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user able to share the profile and click on Download profile

	@Sanity@Regression@UserProfileReg
	Scenario: Verify settings icon and user able to click on Settings options
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify settings icon displayed on the dropdown
		Then I verify user is able to click on Preferences in Profile Dropdown
		Then I verify user is able to click on Change Password in Profile Dropdown
		Then I verify user is able to click on Privacy Consent in Profile Dropdown
		Then I verify user is able to click on Manage Alerts in Profile Dropdown
		Then I verify user is able to click on Logout in Profile Dropdown

	@Regression@UserProfileReg
	Scenario: Verify user is able to click on Personal Information My Dashboard View and Switch User Profile in Dropdown
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to click on Personal Information in User Profile
		Then I verify user is able to click on My Dashboard in Profile Dropdown
		Then I verify user is able to click on View under Survey and poll in Profile Dropdown
		Then I verify user is able to click on Switch User in Profile Dropdown

	@Regression@UserProfileReg
	Scenario: Verify user is able to Add the Communication Address in Personal Information Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the communication address in Personal Information

	@Sanity@Regression@UserProfileReg
	Scenario: Verify user is able to select the Language and Save in Language section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to select and save the language

	@Regression@UserProfileReg
	Scenario: Verify user is able to add the education qualification in Profile Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the Education qualification in Profile

	@Regression@UserProfileReg
	Scenario: Verify user is able to add the Experience in Profile Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the Work Experience in Profile

	@Regression@UserProfileReg
	Scenario: Verify user is able to add the Differently Abled section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the disability with percentage

	@Regression@UserProfileReg
	Scenario: Verify the application option and view application
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I click on scheme button
		Then I verify application and view application click and application information

	@Regression@UserProfileReg
	Scenario: Verify My Activity Analysis Extent Reports Date Range and Reset button
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is navigated to My Activity Analysis Page
		Then I verify My Activity Analysis options and its functionality

	@Regression@UserProfileReg
	Scenario: Verify validation message for Empty mandatory field in Add Communication Address
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify validation message for Empty mandatory field in Add Address

	@Regression@UserProfileReg
	Scenario: Verify user is able to edit and delete the education qualification in Profile Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the Education qualification in Profile
		Then I verify user is able to edit the education details and delete education details


	@Sanity@Regression@UserProfileReg
	Scenario: Verify user is able to edit and delete the Experience in Profile Section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the Work Experience in Profile
		Then I verify user is able to edit the experience and delete the experience details

	@Regression@UserProfileReg
	Scenario: Verify user is able to edit updated and delete the Differently Abled section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the disability with percentage
		Then I verify user is able edit updated and delete the disability of User

	@Sanity@Regression@UserProfileReg
	Scenario: Verify user is able to edit update and delete the Family Details section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the family details in Profile
		Then I verify user is able to edit update and delete the family details of User

	@Sanity@Regression@UserProfileReg
	Scenario: Verify user is able to edit update and delete the Banking details section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify view profile section from user profile dropdown
		Then I verify user is able to add the banking details in Profile
		Then I verify user is able to edit update and delete the banking details of User

	@Regression@UserProfileReg
	Scenario: Verify user is able to access offline section courses in Profile
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify sections under My Dashboard in Profile
		Then I verify offline courses displayed under offline section
		Then I verify Courses metadata in Offline section courses
		Then I verify user is able to share the Offline course from profile

	@Sanity
	Scenario: Verify learner is able to switch role to mobilizer role
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to switch the role in User profile


	@Sanity@Regression@UserProfileReg
	Scenario: Verify learner is able to access Online Offline Joined Completed and Applications sections
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify sections under My Dashboard in Profile
		Then I verify learner is able to access Online Offline Joined Completed And Applications sections of My Dashboard

	@Sanity@Regression@UserProfileReg
	Scenario: Verify learner is able to access My opportunities and Recommendatios for you options of My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access My Opportunities in My Dashboard
		Then I verify Learner is able to access Recommendations for you in My Dashboard

	@Sanity@Regression@UserProfileReg
	Scenario: Verify learner is able to access My Credits and Summary options of My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access My Credits in My Dashboard
		Then I verify Learner is able to access Summary section and view details of Summary

	@Sanity@Regression@UserProfileReg
	Scenario: Verify learner is able to access Edit button of My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access Edit button of My Dashboard
		Then I verify Learner is able to access PMKVY from Dashboard and Share the Skilling Program

	@Sanity@Regression@UserProfileReg
	Scenario: Verify learner is able to PMKVY from My Dashboard and apply Filters reset filters
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is navigated to Skilling Program section Post clicking PMKVY from Dashboard
		Then I verify scheme filters functionality are working fine
		Then I verify Reset filter functionality working fine
		Then I verified schemes are sorted in descending order
		Then I verified schemes are sorted in ascending order

	@Sanity
	Scenario: Verify learner is able to access Complete Your eKYC section in My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner without eKYC
		Then I verify user is able to access Complete Your eKYC section

	@Sanity
	Scenario: Verify learner is able access My Skill Courses in My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access My Skill Courses

	@Sanity@Regression@UserProfileReg
	Scenario: Verify learner is able access Upcoming Skill Courses section in My Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access Upcoming Skill Courses

	@Regression@UserProfileReg
	Scenario: Verify Learner is able to access Online Section Courses and share the online courses
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access Online tab online courses and Course Description
		Then I verify Learner is able to Share the Online courses

	@Regression@UserProfileReg
	Scenario: Verify Learner is able to access Joined Section Courses and share the Joined online courses
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access Online tab In Joined courses and Course Description
		Then I verify Learner is able to Share the Online courses

	@Regression@UserProfileReg
	Scenario: Verify Learner is able to access Completed Section Courses and share the Joined online courses
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		Then I verify Learner is able to access Courses under Completed section and Course Description
		Then I verify Learner is able to Share the Online courses


	@Sanity@Regression@UserProfileReg
	Scenario: Verify resend OTP functionality in Register flow
		Given i navigate to Landing page
		Then I verify role popup in register page
		Then I verify enter mobilenumber popup in register page
		When I verify enter mobilenumber and click continue
		Then I verify user is able to click on Resend OTP button

	@Regression@UserProfileReg
	Scenario: Verify user is able to access Offline Course from offline section in Dashboard and Offline Tag Color
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify sections under My Dashboard in Profile
		Then I verify user is able to navigate to Course details page and validate offline tag backgroundcolor


	@Regression@UserProfileReg
	Scenario: Verify user is able to access Online Course from online section in Dashboard and Online Tag Color
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify sections under My Dashboard in Profile
		Then I verify user is able to navigate to Course details page and validate online tag backgroundcolor

	@Regression@UserProfileReg
	Scenario: Verify user is able to access Joined Course from Joined section in Dashboard and Online Tag Color
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify sections under My Dashboard in Profile
		Then I verify user is able to navigate to joined Course details page and validate online tag backgroundcolor

	@Regression@UserProfileReg
	Scenario: Verify user is able to access Completed Course from Completed section in Dashboard and Completed Tag Color
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		Then I verify sections under My Dashboard in Profile
		Then I verify user is able to navigate to Completed Course details page and validate completed tag backgroundcolor

	@Regression@UserProfileReg
	Scenario: Verify user is able to access eShram from Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify sections under My Dashboard in Profile
		Then I verify Learner is able to access eShram from Dashboard

	@Regression@UserProfileReg
	Scenario: Verify user is able to access Job Exchange and Apprenticeships in Dashboard
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify Learner is able to access My Opportunities in My Dashboard

	@Regression@UserProfileReg
	Scenario: Verify Learner is able to access My Courses and My Credits from Profile
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is able to access My Courses and My Credits from Profile

