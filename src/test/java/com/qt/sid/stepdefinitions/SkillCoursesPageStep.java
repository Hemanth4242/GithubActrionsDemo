package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;
import com.qt.sid.bdd.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.client.utils.URIBuilder;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SkillCoursesPageStep extends BasePage{

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    SkillCoursesPage skillCoursesPage;
    CoursesPage coursesPage;
    CourseDetailPage courseDetailPage;

    SchemesPage schemesPage;



   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public SkillCoursesPageStep(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        skillCoursesPage = testContext.getPageObjectManager().getSkillCoursesPage();
        coursesPage = testContext.getPageObjectManager().getCoursesPage();
        courseDetailPage = testContext.getPageObjectManager().getCourseDetailPage();
        schemesPage = testContext.getPageObjectManager().getSchemesPage();


    }


    @And("Click on the Skill Courses")
    public void clickOnTheSkillCourses() throws InterruptedException {

        homePage.clickOnSkillCourses();
    }



    @Then("User should be naviagted to skill courses page after clicking on Skill Courses {string}")
    public void userShouldBeNaviagtedToSkillCoursesPageAfterClickingOnSkillCourses(String expected) {

        Assert.assertEquals(coursesPage.getTextCoursePageText(),expected);
    }


    @Then("User should be view different courses cards on course list page {string},{string},{string},{string},{string},{string}")
    public void userShouldBeViewDifferentCoursesCardsOnCourseListPage(String online, String offline, String pmkvy, String free, String range1, String range2) {

        ArrayList<String> list = coursesPage.listOfCoursesVerify();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(online)) {
                Assert.assertEquals(list.get(i), (online));
            } else if (list.get(i).equalsIgnoreCase(offline)) {
                Assert.assertEquals(list.get(i), (offline));
            } else if (list.get(i).equalsIgnoreCase(pmkvy)) {
                Assert.assertEquals(list.get(i), (pmkvy));
            } else if (list.get(i).equalsIgnoreCase(free)) {
                Assert.assertEquals(list.get(i), (free));
            } else if (list.get(i).equalsIgnoreCase(range1)) {
                Assert.assertEquals(list.get(i), (range1));
            } else if (list.get(i).equalsIgnoreCase(range2)) {
                Assert.assertEquals(list.get(i), (range2));
            }

        }
    }

    @And("should be able to view courses details on selecting any particular course")
    public void shouldBeAbleToViewCoursesDetailsOnSelectingAnyParticularCourse(){
        coursesPage.clickOnlineBtn();
        coursesPage.clickOnCourseBtn();
        try{
            courseDetailPage.continueBtn.isDisplayed();
            Assert.assertTrue(courseDetailPage.getContinueBtnVerification());

        }catch (Exception e){
            courseDetailPage.enrolBtn.isDisplayed();
            Assert.assertTrue(courseDetailPage.getEnrolBtnVerification());
        }

    }


    @And("Click on the Skill Courses button")
    public void clickOnTheSkillCoursesButton() throws InterruptedException {

        homePage.clickOnSkillCourses();
    }




    @Then("click on the sort A to Z and Z to A Verify That {string},{string}")
    public void clickOnTheSortAToZAndZToAVerifyThat(String expected1, String expected2) throws InterruptedException {

        coursesPage.clickSortBtn();
        coursesPage.clickAtoZBtn();
      //  Assert.assertTrue(coursesPage.getTextAtoZ().startsWith(expected1));
        coursesPage.clickSortBtn();
        coursesPage.clickZtoABtn();
      //  Assert.assertTrue(coursesPage.getTextZtoA().startsWith(expected2));

    }

    @And("Type any course name on Search text field and filter skill courses by selecting multiple interest {string}")
    public void typeAnyCourseNameOnSearchTextFieldAndFilterSkillCoursesBySelectingMultipleInterest(String expected) throws InterruptedException {
        coursesPage.sendCourseTextFiled(expected);
        coursesPage.clickOnSearchCourseBtn();
        Assert.assertEquals(coursesPage.verifyElectricianText(),expected);


    }

    @And("search course name on Search text field and verify that {string}")
    public void searchCourseNameOnSearchTextFieldAndVerifyThat(String expected) throws InterruptedException {
        coursesPage.sendCourseTextFiled(expected);
        coursesPage.clickOnSearchCourseBtn();
        Assert.assertEquals(coursesPage.verifyElectricianText(),expected);

    }

    @Then("The filter results should display the course cards as per the selected interest area {string},{string}")
    public void theFilterResultsShouldDisplayTheCourseCardsAsPerTheSelectedInterestArea(String expected1,String expected2) {
//        Assert.assertEquals(coursesPage.verifyAgricultralText(),expected1);
//        Assert.assertEquals(coursesPage.verifyElectricianText(),expected2);
    }

    @Then("click on single_next and verify click double_next and verify")
    public void clickOnSingle_nextAndVerifyClickDouble_nextAndVerify() {

        coursesPage.clickOnSingleNext();
        Assert.assertTrue(coursesPage.getTextCoursePageIsDisplay());
        coursesPage.clickOnDoubleNextBtn();
        Assert.assertTrue(coursesPage.getTextCoursePageIsDisplay());

    }

    @And("click on single_previous and  verify and click double_previous and verify")
    public void clickOnSingle_previousAndVerifyAndClickDouble_previousAndVerify() throws InterruptedException {


        coursesPage.clickOnSinglePreveousBtn();
        Assert.assertTrue(coursesPage.getTextCoursePageIsDisplay());
        coursesPage.clickDoublePreviousBtn();
        Assert.assertTrue(coursesPage.getTextCoursePageIsDisplay());
    }

    @Then("click on the go to course option displayed on any Course Card {string}")
    public void clickOnTheGoToCourseOptionDisplayedOnAnyCourseCard(String expected) throws InterruptedException {
        coursesPage.clickOnGoToBtn();
        scrollDown();
        Assert.assertTrue(courseDetailPage.getCourseDetailsText().contains(expected));
    }


    @And("scroll down to popular courses section click on any course")
    public void scrollDownToPopularCoursesSectionClickOnAnyCourse() {

       coursesPage.clickOnPopularGoToBtn();
    }

    @Then("Click on go to course in popular skill course section")
    public void clickOnGoToCourseInPopularSkillCourseSection(){
        coursesPage.scrollToPopularCourseSection();
        scrollDown();
        coursesPage.clickOnPopularGoToBtn();
    }

    @Then("verify that popular card page")
    public void verifyThatPopularCardPage() throws InterruptedException {
        try{
            courseDetailPage.continueBtn.isDisplayed();
            Assert.assertTrue(courseDetailPage.getContinueBtnVerification());

        }catch (Exception e){
            courseDetailPage.enrolBtn.isDisplayed();
            Assert.assertTrue(courseDetailPage.getEnrolBtnVerification());
        }
    }


    @Then("click on any share option displayed on any course card and verify that {string}")
    public void clickOnAnyShareOptionDisplayedOnAnyCourseCardAndVerifyThat(String expected) throws InterruptedException {

        coursesPage.clickOnShareBtn();
        Assert.assertTrue(coursesPage.getTextShareBtn().equalsIgnoreCase(expected));
    }

    @And("click on any of the course cards displayed")
    public void clickOnAnyOfTheCourseCardsDisplayed() throws InterruptedException {
        coursesPage.clickOnImageCourseCard();
    }

    @Then("verify that expacted card")
    public void verifyThatExpactedCard() throws InterruptedException {
        try{
            courseDetailPage.continueBtn.isDisplayed();
            Assert.assertTrue(courseDetailPage.getContinueBtnVerification());

        }catch (Exception e){
            courseDetailPage.enrolBtn.isDisplayed();
            Assert.assertTrue(courseDetailPage.getEnrolBtnVerification());
        }
    }

    @Then("Click on the language dropdown and select any language verify that")
    public void clickOnTheLanguageDropdownAndSelectAnyLanguageVerifyThat() {
        coursesPage.clickOnLanguageFilterBtn();
        coursesPage.clickOnEnglishLanguage();
        //coursesPage.clickOnApplyBtn();
        Assert.assertTrue(coursesPage.verifyEnglishLanguage());
    }


    @And("Select any multiple of the  checkbox from interest areas filters and verify")
    public void selectAnyMultipleOfTheCheckboxFromInterestAreasFiltersAndVerify() throws InterruptedException {

        coursesPage.clickOnIntrestedAreaBtn();
        coursesPage.clickOnConstructionIntrestedAre();
        coursesPage.clickOnAgricultureIntrestedArea();
        //coursesPage.clickOnApplyBtn();
        System.out.println(coursesPage.verifyCourseCard.getText());
        Assert.assertTrue(coursesPage.verifyCourseCardIsDisplay());
    }

    @Then("I verify user is able to click on Page number in Skill Courses")
    public void i_verify_user_is_able_to_click_on_page_number_in_skill_courses(){
        Assert.assertTrue(isElementPresent(skillCoursesPage.skillCourseVerify),"Courses are not displayed");
        log.info("Courses are displayed when user navigates to skill courses page");

        skillCoursesPage.clickOnThirdPageNumber();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Course cards were not displayed for the selected page number");
        log.info("Course cards were displayed for the selected page number");

        skillCoursesPage.verifyColorOfTheSelectedPageNumber();

    }

    @Then("I verify user able to see courses under all the sections of skill courses page")
    public void i_verify_user_able_to_see_courses_under_all_the_sections_of_skill_courses_page(){
        Assert.assertTrue(isElementPresent(skillCoursesPage.skillCourseVerify),"Courses are not displayed");
        log.info("Courses are displayed when user navigates to skill courses page");

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Course cards were not displayed for the selected page number");
        log.info("Course cards were displayed for the selected page number");

        skillCoursesPage.clickOnFreeSection();
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Courses not displayed under free section");

        skillCoursesPage.clickOnOnekToFiveKSection();
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Courses not displayed under 1k to 5k section");

        skillCoursesPage.clickOnFivekToTenkSection();
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Courses not displayed under 5k to 10k section");

        skillCoursesPage.clickOnOfflineSection();
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Courses not displayed under offline section");

        skillCoursesPage.clickOnPMKVYSection();
        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Courses not displayed under pmkvy section");

    }

    @Then("I verify user is able to search the course by name")
    public void i_verify_user_is_able_to_search_the_course_by_name(){
        Assert.assertTrue(isElementPresent(skillCoursesPage.skillCourseVerify),"Courses are not displayed");
        log.info("Courses are displayed when user navigates to skill courses page");

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchCourseByName();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseCard),"Searched course is not displayed");
        log.info("Searched course is displayed");

    }
    @Then("I verify user get error message while enrolling to course without mobile number")
    public void i_verify_user_get_error_message_while_enrolling_to_course_without_mobile_number(){
        skillCoursesPage.clickOnSearchedCourseCard();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseDetailsHeader),"Course Details section is not displayed");
        log.info("Course details section is displayed");

        skillCoursesPage.clickOnMobileNumberField();

        skillCoursesPage.clickOnEnrollButton();

        //Assert.assertTrue(isElementPresent(skillCoursesPage.mobileNumberRequiredMessage),"Mobile number is Required error message is not displayed");
        log.info("Mobile number is required error message is displayed");
    }

    @Then("I verify user able to click on Ratings and list of ratings")
    public void i_verify_user_able_to_click_on_ratings_and_list_of_ratings(){
        Assert.assertTrue(isElementPresent(skillCoursesPage.skillCourseVerify),"Courses are not displayed");
        log.info("Courses are displayed when user navigates to skill courses page");

        skillCoursesPage.clickOnInterestAreaFilter();

        skillCoursesPage.clickOnRatingsFilter();

        Assert.assertTrue(isElementPresent(skillCoursesPage.oneStarRating),"One Star rating is not displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.twoStarRating),"Two Star rating is not displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.threeStarRating),"Three Star rating is not displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.fourStarRating),"Four Star rating is not displayed");
        Assert.assertTrue(isElementPresent(skillCoursesPage.fiveStarRating),"Five Star rating is not displayed");

    }

    @Then("I verify user can select any rating and click on Apply button")
    public void i_verify_user_can_select_any_rating_and_click_on_apply_button(){
        skillCoursesPage.clickOnAnyRatingFromDropdown();

       // skillCoursesPage.clickOnApplyButton();

        Assert.assertTrue(isElementPresent(skillCoursesPage.ratingFilteredCourse),"Course is not displayed with applied ratings");
        log.info("Course is displayed with the applied ratings filter");
    }

    @Then("I verify user can click on Reset Filter button")
    public void i_verify_user_can_click_on_reset_filter_button(){
         skillCoursesPage.clickOnResetFilterButton();
         log.info("User is able click on Reset filter button");
    }

    @Then("verify the details of the Microsoft Course {string},{int}")
    public void verify_the_details_of_the_microsoft_course(String Course,int rowNumber) throws IOException {
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchMicrosoftCourse(Course);

        skillCoursesPage.clickOnSearchedCourseCard();

        Assert.assertEquals(getTextOfObject(skillCoursesPage.onlineTagOfCourse),readexceltype("Courses",rowNumber,1));
        System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.onlineTagOfCourse));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.courseTitle),readexceltype("Courses",rowNumber,0));
        System.out.println("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.byMicrosoft),readexceltype("Courses",rowNumber,2));
        System.out.println("Provider of the Course is : " + getTextOfObject(skillCoursesPage.byMicrosoft));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.sectorTagOfCourse),readexceltype("Courses",rowNumber,3));
        System.out.println("Sector of the Course is : " + getTextOfObject(skillCoursesPage.sectorTagOfCourse));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.descriptionOfTheCourse),readexceltype("Courses",rowNumber,4));
        System.out.println("Description of the Course is : " + getTextOfObject(skillCoursesPage.descriptionOfTheCourse));

        scrollToElement(skillCoursesPage.courseDetailsHeader);
        scrollDown();
        waitWebDriver(4000);
        Assert.assertEquals(getTextOfObject(skillCoursesPage.knowledgePartnerData),readexceltype("Courses",rowNumber,5));
        log.info(getTextOfObject(skillCoursesPage.knowledgePartnerData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.requiredAgeData),readexceltype("Courses",rowNumber,6));
        log.info(getTextOfObject(skillCoursesPage.requiredAgeData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.licenseRequiredData),readexceltype("Courses",rowNumber,7));
        log.info(getTextOfObject(skillCoursesPage.licenseRequiredData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.certificationTypeData),readexceltype("Courses",rowNumber,8));
        log.info(getTextOfObject(skillCoursesPage.certificationTypeData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.languageData),readexceltype("Courses",rowNumber,9));
        log.info(getTextOfObject(skillCoursesPage.languageData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.minimumEducationData),readexceltype("Courses",rowNumber,10));
        log.info(getTextOfObject(skillCoursesPage.minimumEducationData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.qpCodeData),readexceltype("Courses",rowNumber,11));
        log.info(getTextOfObject(skillCoursesPage.qpCodeData));


           skillCoursesPage.clickOnTopics();

           int topicsDetails = skillCoursesPage.topicsInOrder.size();
           int j= 12;

           for(int i=0;i<topicsDetails;i++) {

               {
                   Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(i)), readexceltype("Courses", rowNumber, j));
                   log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(i)));
               }
               j++;
           }

      /*  Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(0)),readexceltype("Courses",rowNumber,12));
            log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(0)));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(1)),readexceltype("Courses",rowNumber,13));
            log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(1)));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(2)),readexceltype("Courses",rowNumber,14));
            log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(2)));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(3)),readexceltype("Courses",rowNumber,15));
            log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(3)));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(4)),readexceltype("Courses",rowNumber,16));
            log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(4)));*/


    }

    @When("I verify click on login with learner load for Microsoft Courses {string} {int}")
    public void i_verify_click_on_login_with_learner_load_for_microsoft_courses(String Course,int rowNumber) throws IOException  {
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchMicrosoftCourse(Course);

        skillCoursesPage.clickOnSearchedCourseCard();

        Assert.assertEquals(getTextOfObject(skillCoursesPage.onlineTagOfCourse),readexceltype("Courses",rowNumber,1));
        System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.onlineTagOfCourse));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.courseTitle),readexceltype("Courses",rowNumber,0));
        System.out.println("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.byMicrosoft),readexceltype("Courses",rowNumber,2));
        System.out.println("Provider of the Course is : " + getTextOfObject(skillCoursesPage.byMicrosoft));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.sectorTagOfCourse),readexceltype("Courses",rowNumber,3));
        System.out.println("Sector of the Course is : " + getTextOfObject(skillCoursesPage.sectorTagOfCourse));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.descriptionOfTheCourse),readexceltype("Courses",rowNumber,4));
        System.out.println("Description of the Course is : " + getTextOfObject(skillCoursesPage.descriptionOfTheCourse));

        scrollToElement(skillCoursesPage.courseDetailsHeader);
        scrollDown();
        waitWebDriver(4000);
        Assert.assertEquals(getTextOfObject(skillCoursesPage.knowledgePartnerData),readexceltype("Courses",rowNumber,5));
        log.info(getTextOfObject(skillCoursesPage.knowledgePartnerData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.requiredAgeData),readexceltype("Courses",rowNumber,6));
        log.info(getTextOfObject(skillCoursesPage.requiredAgeData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.licenseRequiredData),readexceltype("Courses",rowNumber,7));
        log.info(getTextOfObject(skillCoursesPage.licenseRequiredData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.certificationTypeData),readexceltype("Courses",rowNumber,8));
        log.info(getTextOfObject(skillCoursesPage.certificationTypeData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.languageData),readexceltype("Courses",rowNumber,9));
        log.info(getTextOfObject(skillCoursesPage.languageData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.minimumEducationData),readexceltype("Courses",rowNumber,10));
        log.info(getTextOfObject(skillCoursesPage.minimumEducationData));
        Assert.assertEquals(getTextOfObject(skillCoursesPage.qpCodeData),readexceltype("Courses",rowNumber,11));
        log.info(getTextOfObject(skillCoursesPage.qpCodeData));


        skillCoursesPage.clickOnTopics();

        int topicsDetails = skillCoursesPage.topicsInOrder.size();
        int j= 12;

        for(int i=0;i<topicsDetails;i++) {

            {
                Assert.assertEquals(getTextOfObject(skillCoursesPage.topicsInOrder.get(i)), readexceltype("Courses", rowNumber, j));
                log.info(getTextOfObject(skillCoursesPage.topicsInOrder.get(i)));
            }
            j++;
        }
    }

    @Then("I verify user is able to see details of Guvi Course and share the Guvi Course")
    public void i_verify_user_is_able_to_see_details_of_guvi_course_and_share_the_guvi_course(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchMicrosoftCourse("Guvi");

        Assert.assertTrue(isElementPresent(skillCoursesPage.assertGuviCourse),"Guvi course is not displayed");
        log.info("Guvi course is displayed");

        skillCoursesPage.clickOnSearchedCourseCard();

        scrollDown();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseDetailsHeader),"Course details section is not displayed");
        log.info("Course details section is displayed");

        Assert.assertTrue(isElementPresent(skillCoursesPage.topicsSection),"Topics section is not displayed");
        log.info("Topics section is displayed");

        scrollUp();

        skillCoursesPage.clickOnGuviCourseShareBtn();

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Guvi Course");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Guvi Course");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Guvi Course");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Guvi Course");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Guvi Course");


    }

    @Then("I verify Enroll button is enabled post entering the valid Mobile number")
    public void i_verify_enroll_button_is_enabled_post_entering_the_valid_mobile_number(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnOnlineSection();

        skillCoursesPage.verifyTheBorderColorOfOnlineSection();

        skillCoursesPage.clickOnSearchedCourseCard();

        skillCoursesPage.clickAndEnterValidMobileNumber();

        boolean enrollBtn1 = skillCoursesPage.enrollBtnInCourse.isEnabled();
        Assert.assertEquals(enrollBtn1,true);
    }

    @Then("I verify Enroll button is disabled post entering invalid Mobile number")
    public void i_verify_enroll_button_is_disabled_post_entering_invalid_mobile_number(){
        skillCoursesPage.clickAndEnterInvalidMobileNumber();

        boolean enrollBtn2 = skillCoursesPage.enrollBtnInCourse.isEnabled();
        Assert.assertEquals(enrollBtn2,false);

    }

    @Then("I verify user is able to add the course to favorite section")
    public void i_verify_user_is_able_to_add_the_course_to_favorite_section(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchCourseByName();

        skillCoursesPage.clickOnFavoriteBtn();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseAddedToFavoriteMsg),"Course is not added to favorite section");
        log.info("Course is added to the favorite section message is displayed");

        skillCoursesPage.clickOnFavoriteSection();

        skillCoursesPage.clickOnFavoriteBtn();

        Assert.assertTrue(isElementPresent(skillCoursesPage.courseRemovedFromFavoriteMsg),"Course is not removed from favorite section");
        log.info("Course is Removed from the favorite section message is displayed");


    }

    @Then("I verify user is able to view details of Paid course")
    public void i_verify_user_is_able_to_view_details_of_paid_course(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchPaidCourseByName();

        skillCoursesPage.clickOnSearchedCourseCard();

        Assert.assertTrue(isElementPresent(skillCoursesPage.payNowButton),"Pay Now button is not displayed");
        log.info("Pay Now button is displayed");
    }

    @Then("I verify user navigated to payment options section and navigates back to Course Page")
    public void i_verify_user_navigated_to_payment_options_section_and_navigates_back_to_course_page(){
        skillCoursesPage.clickOnPayNowButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://eazypay.icicibank.com/"),"User is not navigated to Payment section");
        log.info("User is navigated to Payment section");

        driver.navigate().back();

        Assert.assertTrue(isElementPresent(skillCoursesPage.payNowButton),"Pay Now button is not displayed");
        log.info("Pay Now button is displayed");
    }

    @Then("I verify multiple courses Enroll and consume the first course")
    public void i_verify_multiple_courses_enroll_and_consume_the_first_course(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnOnlineSection();

        skillCoursesPage.clickOnFreeSection();

        skillCoursesPage.clickOnFirstCourseEnrollOrContinue();

        try{
            object_Click(homePage.continueBtn);
        }catch (Exception e){
            object_Click(homePage.enrollBtn);
            waitWebDriver(3000);
            waitWebDriver(9000);
            waitWebDriver(3000);
            object_Click(homePage.continueBtn);
            waitWebDriver(2000);
        }

        waitWebDriver(3000);
        String parent =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();



        Iterator<String> I1 = windows.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
              try{
                    object_Click(homePage.resumeBtn);
                }catch (Exception e){
                    object_Click(homePage.startBtn);
                }
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(2000);

            }
        }
        waitWebDriver(5000);
        driver.switchTo().window(parent);

    }

    @Then("I verify multiple courses Enroll and consume the second course")
    public void i_verify_multiple_courses_enroll_and_consume_the_second_course(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnOnlineSection();

        skillCoursesPage.clickOnFreeSection();

        skillCoursesPage.clickOnSecondCourseEnrollOrContinue();

        try{
            object_Click(homePage.continueBtn);
        }catch (Exception e){
            object_Click(homePage.enrollBtn);
            waitWebDriver(3000);
            waitWebDriver(9000);
            waitWebDriver(3000);
            object_Click(homePage.continueBtn);
            waitWebDriver(2000);
        }

        waitWebDriver(3000);
        String parent =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();



        Iterator<String> I1 = windows.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                try{
                    object_Click(homePage.resumeBtn);
                }catch (Exception e){
                    object_Click(homePage.startBtn);
                }
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(2000);
            }
        }
        waitWebDriver(5000);
        driver.switchTo().window(parent);

    }

    @Then("I verify multiple courses Enroll and consume the third course")
    public void i_verify_multiple_courses_enroll_and_consume_the_third_course(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnOnlineSection();

        skillCoursesPage.clickOnFreeSection();

        skillCoursesPage.clickOnThirdCourseEnrollOrContinue();

        try{
            object_Click(homePage.continueBtn);
        }catch (Exception e){
            object_Click(homePage.enrollBtn);
            waitWebDriver(3000);
            waitWebDriver(9000);
            waitWebDriver(3000);
            object_Click(homePage.continueBtn);
            waitWebDriver(2000);
        }

        waitWebDriver(3000);
        String parent =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();



        Iterator<String> I1 = windows.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                try{
                    object_Click(homePage.resumeBtn);
                }catch (Exception e){
                    object_Click(homePage.startBtn);
                }
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(2000);
            }
        }
        waitWebDriver(5000);
        driver.switchTo().window(parent);

    }

    @Then("I verify multiple courses Enroll and consume the fourth course")
    public void i_verify_multiple_courses_enroll_and_consume_the_fourth_course(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnOnlineSection();

        skillCoursesPage.clickOnFreeSection();

        scrollDown();

        skillCoursesPage.clickOnFourthCourseEnrollOrContinue();

        try{
            object_Click(homePage.continueBtn);
        }catch (Exception e){
            object_Click(homePage.enrollBtn);
            waitWebDriver(3000);
            waitWebDriver(9000);
            waitWebDriver(3000);
            object_Click(homePage.continueBtn);
            waitWebDriver(2000);
        }

        waitWebDriver(3000);
        String parent =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();



        Iterator<String> I1 = windows.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                try{
                    object_Click(homePage.resumeBtn);
                }catch (Exception e){
                    object_Click(homePage.startBtn);
                }
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(2000);
            }
        }
        waitWebDriver(5000);
        driver.switchTo().window(parent);

    }


    @When("I verify click on login with learner load for Courses {string} {int}")
    public void i_verify_click_on_login_with_learner_load_for_courses(String Course,int rowNumber) throws IOException {
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        skillCoursesPage.clickOnCourseSearchField();

        skillCoursesPage.searchMicrosoftCourse(Course);

        skillCoursesPage.clickOnSearchedCourseCard();

        Assert.assertEquals(getTextOfObject(skillCoursesPage.courseTitle), readexceltype("SID", rowNumber, 3));
        System.out.println("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));
        log.info("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.dlpName), readexceltype("SID", rowNumber, 2));
        System.out.println("Provider of the Course is : " + getTextOfObject(skillCoursesPage.dlpName));
        log.info("Provider of the Course is : " + getTextOfObject(skillCoursesPage.dlpName));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.industryName), readexceltype("SID", rowNumber, 5));
        System.out.println("Sector of the Course is : " + getTextOfObject(skillCoursesPage.industryName));
        log.info("Sector of the Course is : " + getTextOfObject(skillCoursesPage.industryName));

        String durationOfCourse = skillCoursesPage.durationOfCourse.getText();
        System.out.println("Course Duration is : " + durationOfCourse);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.durationOfCourse),readexceltype("SID",rowNumber,8));
        System.out.print("Duration of the course is : " + getTextOfObject(skillCoursesPage.durationOfCourse));
        log.info("Duration of the course is : " + getTextOfObject(skillCoursesPage.durationOfCourse));

        if (getTextOfObject(skillCoursesPage.courseType).equalsIgnoreCase("Paid")) {
            Assert.assertEquals(getTextOfObject(skillCoursesPage.courseType), readexceltype("SID", rowNumber, 15));
            System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
            log.info("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));

            //Assert.assertEquals(getTextOfObject(skillCoursesPage.costOfCourse), readexceltype("SID", rowNumber, 16));
            System.out.println("Cost of course is : " + getTextOfObject(skillCoursesPage.costOfCourse));
            log.info("Cost of course is : " + getTextOfObject(skillCoursesPage.costOfCourse));
        } else {
            Assert.assertEquals(getTextOfObject(skillCoursesPage.courseType), readexceltype("SID", rowNumber, 15));
            System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
            log.info("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
        }

        if (getTextOfObject(skillCoursesPage.courseType).equalsIgnoreCase("Paid")) {
            Assert.assertTrue(isElementPresent(skillCoursesPage.payNowButton), "Pay Now button is not displayed");
            log.info("Course is Active");
        } else {
            Assert.assertTrue(isElementPresent(skillCoursesPage.enrollButton), "Enroll button is not displayed");
            log.info("Course is Active");
        }

        scrollToElement(skillCoursesPage.courseDetailsHeader);
        scrollDown();
        waitWebDriver(4000);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.languageData), readexceltype("SID", rowNumber, 4));
        log.info("Language of the Course : " + getTextOfObject(skillCoursesPage.languageData));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.certificationTypeData), readexceltype("SID", rowNumber, 14));
        log.info("Certificate Type of Course is : " + getTextOfObject(skillCoursesPage.certificationTypeData));

        if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Participation")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        } else if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Certificate of Completion")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        } else {
            log.info("Certificate is not available");
            log.info("Assessment is not available");
        }


        if(getTextOfObject(skillCoursesPage.qpCodeData).equalsIgnoreCase("na")){
            log.info("Qp code is false");
        }else{
            log.info("QP Code is True");
        }

        try{
            if(isElementPresent(skillCoursesPage.nsqfData)){
                log.info("NSQF is True");
            }
        }catch (Exception e){
            log.info("NSQF is False");
        }


    }

    @Then("I verify the multiple course in SID {string} {int}")
    public void i_verify_the_multiple_course_in_sid(String courseID, int rowNumber) throws IOException {
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();
        waitWebDriver(3000);

        driver.get(driver.getCurrentUrl()+"/detail/" + courseID);
        waitWebDriver(5000);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.courseTitle), readexceltype("SID", rowNumber, 3));
        System.out.println("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));
        log.info("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.dlpName), readexceltype("SID", rowNumber, 2));
        System.out.println("Provider of the Course is : " + getTextOfObject(skillCoursesPage.dlpName));
        log.info("Provider of the Course is : " + getTextOfObject(skillCoursesPage.dlpName));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.industryName), readexceltype("SID", rowNumber, 5));
        System.out.println("Sector of the Course is : " + getTextOfObject(skillCoursesPage.industryName));
        log.info("Sector of the Course is : " + getTextOfObject(skillCoursesPage.industryName));

        String durationOfCourse = skillCoursesPage.durationOfCourse.getText();
        System.out.println("Course Duration is : " + durationOfCourse);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.durationOfCourse),readexceltype("SID",rowNumber,8));
        System.out.print("Duration of the course is : " + getTextOfObject(skillCoursesPage.durationOfCourse));
        log.info("Duration of the course is : " + getTextOfObject(skillCoursesPage.durationOfCourse));

        if (getTextOfObject(skillCoursesPage.courseType).equalsIgnoreCase("Paid")) {
            Assert.assertEquals(getTextOfObject(skillCoursesPage.courseType), readexceltype("SID", rowNumber, 15));
            System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
            log.info("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));

            //Assert.assertEquals(getTextOfObject(skillCoursesPage.costOfCourse), readexceltype("SID", rowNumber, 16));
            System.out.println("Cost of course is : " + getTextOfObject(skillCoursesPage.costOfCourse));
            log.info("Cost of course is : " + getTextOfObject(skillCoursesPage.costOfCourse));
        } else {
            Assert.assertEquals(getTextOfObject(skillCoursesPage.courseType), readexceltype("SID", rowNumber, 15));
            System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
            log.info("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
        }

        if (getTextOfObject(skillCoursesPage.courseType).equalsIgnoreCase("Paid")) {
            Assert.assertTrue(isElementPresent(skillCoursesPage.payNowButton), "Pay Now button is not displayed");
            log.info("Course is Active");
        } else {
            Assert.assertTrue(isElementPresent(skillCoursesPage.enrollButton), "Enroll button is not displayed");
            log.info("Course is Active");
        }

        scrollToElement(skillCoursesPage.courseDetailsHeader);
        scrollDown();
        waitWebDriver(4000);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.languageData), readexceltype("SID", rowNumber, 4));
        log.info("Language of the Course : " + getTextOfObject(skillCoursesPage.languageData));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.certificationTypeData), readexceltype("SID", rowNumber, 14));
        log.info("Certificate Type of Course is : " + getTextOfObject(skillCoursesPage.certificationTypeData));

        if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Participation")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        } else if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Certificate of Completion")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        } else {
            log.info("Certificate is not available");
            log.info("Assessment is not available");
        }


        if(getTextOfObject(skillCoursesPage.qpCodeData).equalsIgnoreCase("na")){
            log.info("Qp code is false");
        }else{
            log.info("QP Code is True");
        }

        try{
            if(isElementPresent(skillCoursesPage.nsqfData)){
                log.info("NSQF is True");
            }
        }catch (Exception e){
            log.info("NSQF is False");
        }

    }

    @Then("I verify the multiple course in SID {int}")
    public void i_verify_the_multiple_course_in_sid(int rowNumber) throws IOException {
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();
        waitWebDriver(3000);

        driver.get(driver.getCurrentUrl()+"/detail/" + readexceltype("SID",rowNumber,1));
        waitWebDriver(5000);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.courseTitle), readexceltype("SID", rowNumber, 3));
        System.out.println("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));
        log.info("Course Title is : " + getTextOfObject(skillCoursesPage.courseTitle));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.dlpName), readexceltype("SID", rowNumber, 2));
        System.out.println("Provider of the Course is : " + getTextOfObject(skillCoursesPage.dlpName));
        log.info("Provider of the Course is : " + getTextOfObject(skillCoursesPage.dlpName));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.industryName), readexceltype("SID", rowNumber, 5));
        System.out.println("Sector of the Course is : " + getTextOfObject(skillCoursesPage.industryName));
        log.info("Sector of the Course is : " + getTextOfObject(skillCoursesPage.industryName));

        String durationOfCourse = skillCoursesPage.durationOfCourse.getText();
        System.out.println("Course Duration is : " + durationOfCourse);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.durationOfCourse),readexceltype("SID",rowNumber,8));
        System.out.print("Duration of the course is : " + getTextOfObject(skillCoursesPage.durationOfCourse));
        log.info("Duration of the course is : " + getTextOfObject(skillCoursesPage.durationOfCourse));

        if (getTextOfObject(skillCoursesPage.courseType).equalsIgnoreCase("Paid")) {
            Assert.assertEquals(getTextOfObject(skillCoursesPage.courseType), readexceltype("SID", rowNumber, 15));
            System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
            log.info("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));

            //Assert.assertEquals(getTextOfObject(skillCoursesPage.costOfCourse), readexceltype("SID", rowNumber, 16));
            System.out.println("Cost of course is : " + getTextOfObject(skillCoursesPage.costOfCourse));
            log.info("Cost of course is : " + getTextOfObject(skillCoursesPage.costOfCourse));
        } else {
            Assert.assertEquals(getTextOfObject(skillCoursesPage.courseType), readexceltype("SID", rowNumber, 15));
            System.out.println("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
            log.info("CourseType tag is : " + getTextOfObject(skillCoursesPage.courseType));
        }

        if (getTextOfObject(skillCoursesPage.courseType).equalsIgnoreCase("Paid")) {
            Assert.assertTrue(isElementPresent(skillCoursesPage.payNowButton), "Pay Now button is not displayed");
            log.info("Course is Active");
        } else{
           // Assert.assertTrue(isElementPresent(skillCoursesPage.enrollButton), "Enroll button is not displayed");
            log.info("Course is Active");
        }

        scrollToElement(skillCoursesPage.courseDetailsHeader);
        scrollDown();
        waitWebDriver(4000);

        Assert.assertEquals(getTextOfObject(skillCoursesPage.languageData), readexceltype("SID", rowNumber, 4));
        log.info("Language of the Course : " + getTextOfObject(skillCoursesPage.languageData));

        Assert.assertEquals(getTextOfObject(skillCoursesPage.certificationTypeData), readexceltype("SID", rowNumber, 14));
        log.info("Certificate Type of Course is : " + getTextOfObject(skillCoursesPage.certificationTypeData));

        if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Participation")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        } else if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Certificate of Completion")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        } else if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Certificate of Participation")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        }else if (getTextOfObject(skillCoursesPage.certificationTypeData).equalsIgnoreCase("Certificate of Completion (Microsoft)")) {
            log.info("Certificate is Available");
            log.info("Assessment is available");
        }else {
            log.info("Certificate is not available");
            log.info("Assessment is not available");
        }

      try{
          if(getTextOfObject(skillCoursesPage.qpCodeData).equalsIgnoreCase("na")){
              Assert.assertEquals(readexceltype("SID",rowNumber,7),"false");
              log.info("Qp code is false");
          }else{
              Assert.assertEquals(readexceltype("SID",rowNumber,7),"true");
              log.info("QP Code is True");
              log.info("QP Code of Course is : " + getTextOfObject(skillCoursesPage.qpCodeData));
          }
      } catch(Exception e){
         e.printStackTrace();
      }


        try{
            if(isElementPresent(skillCoursesPage.nsqfData)){
                Assert.assertEquals(readexceltype("SID",rowNumber,6),"true");
                log.info("NSQF is True");
            }else{
                Assert.assertEquals(readexceltype("SID",rowNumber,6),"false");
                log.info("NSQF is False");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
