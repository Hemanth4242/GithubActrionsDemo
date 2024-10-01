Feature:  To verify the Skill Courses
Description: The purpose of this feature is we will cover all important link


	@Sanity@Regression@SkillCourseReg
	Scenario: To verify if user can access skill courses page
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then  User should be naviagted to skill courses page after clicking on Skill Courses "Skill Courses"


	@Sanity@Regression@SkillCourseReg
	Scenario:To verify all the different types courses are displayed on courses list page and user is able to view course details on selecting any particular course
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then  User should be view different courses cards on course list page "Online","Offline","PMKVY","Free","1000 - 5000","5000 - 10000"
	    And   should be able to view courses details on selecting any particular course


	@Sanity@Regression@SkillCourseReg
	Scenario:To verify the user is able to sort the courses displayed in "A to Z" or "Z to A" order from Sort dropdown
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses button
		Then  click on the sort A to Z and Z to A Verify That "A","W"


	@Sanity@Regression@SkillCourseReg
	Scenario:To verify the "Search filter functionality" functionality on Skill Courses page
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
	    Then  search course name on Search text field and verify that "Welding Technician"


	@Sanity@Regression@SkillCourseReg
	Scenario:To verify the user is able to filter skill courses by selecting multiple interest areas checkboxes
		Given i navigate to Landing page
		When  I verify click on login with learner
		And   Click on the Skill Courses
		And   Select any multiple of the  checkbox from interest areas filters and verify




	@Sanity@Regression@SkillCourseReg
	Scenario:To verify the user is able to navigate to next page or previous page on selecting any pagination number
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then  click on single_next and verify click double_next and verify
		And   click on single_previous and  verify and click double_previous and verify

	@Sanity@Regression@SkillCourseReg
	Scenario:To Verify the "Go to Course" option displayed on courses
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then  click on the go to course option displayed on any Course Card "Course Details"

	@Sanity
	Scenario:To verfiy the user is able to select and naviagte to selected course page after clicking on popular course
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then  Click on go to course in popular skill course section
		Then  verify that popular card page



	@Sanity@Regression@SkillCourseReg
	Scenario:To verify the share options displayed on course card
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then  click on any share option displayed on any course card and verify that "Share this Course"


	@Sanity
	Scenario:To verify the user is able to view and clicking on any course cards displayed on skill courses page
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		And  click on any of the course cards displayed
		Then verify that expacted card

	@Sanity@Regression@SkillCourseReg
	Scenario:To verify the user is able to filter courses by selecting any particular languages
		Given i navigate to Landing page
		When  Login to the application as a Learner "7053397849","1"
		And   Click on the Skill Courses
		Then   Click on the language dropdown and select any language verify that
		
	@Sanity
    Scenario: To verify the important link skill universities option
    Given i navigate to Landing page
    When I verify click on login with learner
    Then I click on important link option and selected skilled universities
    Then I selected private option from the type filter
    Then I selected location from the location filter
    Then I verified the search result
    Then I cleared the filter result

	@Regression@SkillCourseReg
	Scenario: verify user able to click on pagenumbers in skill courses page
		Given i navigate to Landing page
		When I verify click on login with learner
		And Click on the Skill Courses
		Then I verify user is able to click on Page number in Skill Courses

	@Regression@SkillCourseReg
	Scenario: verify user able to see courses under Offline PMKVY Free and Paid sections of Skill Course Page
		Given i navigate to Landing page
		When I verify click on login with learner
		And Click on the Skill Courses
		Then I verify user able to see courses under all the sections of skill courses page

	@Regression@SkillCourseReg
	Scenario: verify user is able to search the course by name and verify error message
		Given i navigate to Landing page
		And Click on the Skill Courses
		Then I verify user is able to search the course by name
		Then I verify user get error message while enrolling to course without mobile number

	@Regression@SkillCourseReg
	Scenario: Verify Ratings section in Skill Courses Page
		Given i navigate to Landing page
		When I verify click on login with learner
		And Click on the Skill Courses
		Then I verify user able to click on Ratings and list of ratings
		Then I verify user can select any rating and click on Apply button
		Then I verify user can click on Reset Filter button


	@Regression@SkillCourseReg
	Scenario: verify details of Microsoft courses
		Given i navigate to Landing page
		When I verify click on login with learner
		Then verify the details of the Microsoft Course "Python Functions",0

	@Regression@SkillCourseReg
	Scenario: verify details of Guvi courses and verify share options
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is able to see details of Guvi Course and share the Guvi Course

	@Regression@SkillCourseReg
	Scenario: verify the Enroll button enabled post entering the Mobile number
		Given i navigate to Landing page
		Then I verify Enroll button is enabled post entering the valid Mobile number
		Then I verify Enroll button is disabled post entering invalid Mobile number

	@Regression@SkillCourseReg
	Scenario: verify user is able to add the selected course to favorite section
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is able to add the course to favorite section

	@Sanity
	Scenario Outline: Verify users is able to Continue the course and see the Course details
		Given i navigate to Landing page
		When I verify click on login with learner load "<username>" "<password>"
		Examples:
			| username  | password  |
			| 9148574673 | 1234 |

	@Regression@SkillCourseReg
	Scenario: verify user is able to access paid course and Payment details
		Given i navigate to Landing page
		When I verify click on login with learner
		Then I verify user is able to view details of Paid course
		Then I verify user navigated to payment options section and navigates back to Course Page

	@Regression_2
	Scenario Outline: To verify Microsoft courses
		Given i navigate to Landing page
		When I verify click on login with learner
		When I verify click on login with learner load for Microsoft Courses "<Course>" <RowNumber>
		Examples:
			|     Course                                   |   RowNumber   |
			| Python Functions                             | 0             |
		    | Design cloud solutions for the public sector | 1             |
		    | Configure Hyper                              | 2             |









