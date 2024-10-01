package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qt.sid.bdd.utils.FileReaderManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class CourseCreatePage extends BasePage {

    public WebDriver driver;
   
    @FindBy(xpath = "//span[text()='Create Course']")
    public WebElement createCourseTab;
    
    @FindBy(xpath = "//h2[text()='Easy Steps to Create Course']")
    public WebElement easyStepsToCreateCourseText;
    
    @FindBy(xpath = "//h3[text()='Tell us about your Course!']")
    public WebElement tellUsText;
    
    @FindBy(xpath = "//h4[text()=' Details ']")
    public WebElement detailsSection;
    
    @FindBy(xpath = "//h4[text()=' Sector ']")
    public WebElement sectorSection;
    
    @FindBy(xpath = "//h4[text()=' Fees ']")
    public WebElement feesSection;
    
    @FindBy(xpath = "//button[text()=' NEXT ']")
    public WebElement nextBtn;
    
    @FindBy(xpath = "//button[text()=' BACK ']")
    public WebElement backBtn;
    
    @FindBy(xpath = "//button[text()=' Continue ']")
    public WebElement continueBtn;
    
    @FindBy(id = "courseName")
    public WebElement courseNameField;
    
    @FindBy(xpath = "//span[text()='Select Language']")
    public WebElement selectLanguageField;
    
    @FindBy(xpath = "//span[text()='English']")
    public WebElement selectEnglish;
    
    @FindBy(xpath = "//span[text()='Select Course Mode']")
    public WebElement selectCourseModeField;
    
    @FindBy(xpath = "//span[text()='Online']")
    public WebElement onlineMode;
    
    @FindBy(xpath = "//span[text()='Offline']")
    public WebElement offlineMode;
    
    @FindBy(xpath = "//h3[text()='Tell us the sector you are planning to create course in']")
    public WebElement sectorFieldText;
    
    @FindBy(xpath = "//h3[text()='Let us begin with some basics!']")
    public WebElement letUsBeginTextInFeesSection;
    
    @FindBy(xpath = "//h5[text()='Select Course Fees Type']")
    public WebElement selectCourseFeeText;
    
    @FindBy(xpath = "//button[text()=' FREE ']")
    public WebElement freeCourse;
    
    @FindBy(xpath = "//button[text()=' PAID ']")
    public WebElement paidCourse;
    
    @FindBy(xpath = "//span[text()='Select Sector']")
    public WebElement selectSectorField;
    
    @FindBy(xpath = "//span[text()=' Agriculture ']")
    public WebElement agricultureSector;
    
    @FindBy(xpath = "//input[@placeholder='Enter Sub Sector']")
    public WebElement subSectorField;

    @FindBy(xpath = "(//span[@class='btn-text'])[3]")
    public WebElement subSectorText;

    @FindBy(xpath = "//*[text()=' is required']")
    public WebElement validationMessage;

    @FindBy(xpath = "//*[text()='Course List']")
    public WebElement courseListSection;

    @FindBy(xpath = "//a[text()='Course Creation']")
    public WebElement courseCreationLink;

    @FindBy(xpath = "(//*[@class='option-edit-btn'])[1]")
    public WebElement courseDetailsEditBtn;

    @FindBy(xpath = "//*[text()='Course Details']")
    public WebElement courseDetailsPopupText;

    @FindBy(xpath = "//button[text()=' CANCEL ']")
    public WebElement cancelBtn;

    @FindBy(xpath = "(//button[text()=' SAVE '])[5]")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[text()='Course Details']/following::*[@class='mat-button-wrapper']")
    public WebElement crossIcon;

    @FindBy(xpath = "//*[@formcontrolname='CourseMode']")
    public WebElement courseModeField;

    @FindBy(xpath = "//*[text()='Offline']")
    public WebElement offlineModeInEdit;

    @FindBy(xpath = "//*[@formcontrolname='CourseLanguage']")
    public WebElement courseLanguageField;

    @FindBy(xpath = "//*[text()='Hindi']")
    public WebElement hindiLanguage;


    @FindBy(xpath = "(//*[@class='option-edit-btn'])[2]")
    public WebElement sectorEditIcon;

    @FindBy(xpath = "//*[text()='Sector']")
    public WebElement sectorTextInPopup;

    @FindBy(xpath = "//*[text()='Sector']/following::*[@class='mat-button-wrapper']")
    public WebElement sectorPopupCrossIcon;

    @FindBy(xpath = "//*[@formcontrolname='Sector']")
    public WebElement sectorDropdown;

    @FindBy(xpath = "//*[text()=' Aerospace and Aviation ']")
    public WebElement aerospaceSector;

    @FindBy(xpath = "//*[@formcontrolname='SubSector']")
    public WebElement subsectorField1;

    @FindBy(xpath = "(//*[@class='option-edit-btn'])[3]")
    public WebElement feesEditBtn;

    @FindBy(xpath = "//*[text()='Fees']")
    public WebElement feesTextInPopup;

    @FindBy(xpath = "//*[text()='Fees']/following::*[@class='mat-button-wrapper']")
    public WebElement crossIconInFeesPopup;

    @FindBy(xpath = "//button[text()=' FREE ']")
    public WebElement freeBtn;

    @FindBy(xpath = "//button[text()=' PAID ']")
    public WebElement paidBtn;

    @FindBy(xpath = "//*[@formcontrolname='CourseStandardFees']")
    public WebElement courseFeesField;

    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveBtnInFeesPopup;

    @FindBy(xpath = "//button[text()=' Cancel ']")
    public WebElement cancelBtnInFeesPopup;


    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboardInLP;

    @FindBy(xpath = "//*[text()='Approved Courses']")
    public WebElement approvedCoursesSection;

    @FindBy(xpath = "//button[@title='View All']")
    public WebElement viewAllButton;

    @FindBy(xpath = "//*[text()=' Approved ']")
    public WebElement approvedSection;

    @FindBy(xpath = "//button[@title='Contact US']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[text()=' Submit Query ']")
    public WebElement submitQueryText;

    @FindBy(id = "keyword")
    public WebElement keywordfield;

    @FindBy(xpath = "(//*[contains(@class,'click-img')])[1]")
    public WebElement plusIcon;

    @FindBy(xpath = "//*[@class='tag-selected-option']")
    public WebElement selectedTag;

    @FindBy(id = "duration")
    public WebElement durationInHHHMM;

    @FindBy(xpath = "//*[@formcontrolname='CourseAvailability']")
    public WebElement courseAvailability;

    @FindBy(xpath = "//*[text()='Open for 365 days ']")
    public WebElement openFor365DaysOption;

    @FindBy(xpath = "//*[text()='Fixed Schedule ']")
    public WebElement fixedScheduleOption;

    @FindBy(xpath = "//*[@aria-label='Open calendar']")
    public List<WebElement> calenderIcon;

    @FindBy(xpath = "//*[@aria-label='Choose month and year']")
    public WebElement chooseMonthAndYear;

    @FindBy(xpath = "//*[text()=' 2024 ']")
    public WebElement selectYear;

    @FindBy(xpath = "//*[text()=' DEC ']")
    public WebElement selectMonth;

    @FindBy(xpath = "//*[text()=' 1 ']")
    public WebElement selectDate;

    @FindBy(xpath = "//*[@formcontrolname='CourseAlignedto']")
    public WebElement courseAlignedTo;

    @FindBy(xpath = "//*[text()='NSQF']")
    public WebElement nsqfOption;

    @FindBy(xpath = "//*[text()='NON_NSQF']")
    public WebElement nonNSQFOption;

    @FindBy(xpath = "//*[@formcontrolname='LearningOutcomes']")
    public WebElement learningOutcomesField;

    @FindBy(xpath = "//button[text()=' NEXT ']")
    public WebElement nextButton;

    @FindBy(xpath = "//*[text()='Overview Updated successfully']")
    public WebElement overviewUpdateMessage;

    @FindAll({
            @FindBy(xpath = "//button[text()=' SAVE ']"),
            @FindBy(xpath = "//*[@formcontrolname='LearningOutcomes']//following::button[1]")
    })
    public WebElement SaveButton;

    @FindBy(xpath = "//*[text()='Course List']")
    public WebElement courseList;

    @FindBy(xpath = "//*[text()='LMS Studio']")
    public WebElement lmsStudio;

    @FindBy(xpath = "//*[text()=' Draft ']")
    public WebElement draft;

    @FindBy(xpath = "(//*[text()=' View Details '])[1]")
    public WebElement viewDetailsOfCourse;

    @FindBy(xpath = "//button[text()=' edit ']")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Prerequisite']")
    public WebElement prerequisiteText;

    @FindBy(xpath = "//*[text()='Select Age Requirement']")
    public WebElement selectAgeRequirementDropdown;

    @FindBy(xpath = "//*[text()='Above 18 ']")
    public WebElement above18Age;

    @FindBy(xpath = "//*[@formcontrolname='EducationalQualification']")
    public WebElement educationQualificationDropdown;

    @FindBy(xpath = "//*[text()='5th Pass ']")
    public WebElement fifthPass;

    @FindBy(xpath = "//*[text()='Select Industry Experience']")
    public WebElement selectIndustryExperience;

    @FindBy(xpath = "//*[text()='1-2 ']")
    public WebElement selectExperienceOnetoTwo;

    @FindBy(xpath = "//*[@formcontrolname='LearningTools']")
    public WebElement learningToolsField;

    @FindBy(xpath = "//*[text()='Pre-Requisite Updated successfully']")
    public WebElement preRequisiteUpdateMsg;

    @FindBy(xpath = "(//button[text()=' SAVE '])[2]")
    public WebElement preRequisiteSaveBtn;

    @FindBy(xpath = "(//button[text()=' NEXT '])[2]")
    public WebElement preRequisiteNextBtn;

    @FindBy(xpath = "(//*[@class='add-img img-upload'])[1]")
    public WebElement uploadImageBtn;

    @FindBy(xpath = "(//*[@class='add-img img-upload'])[2]")
    public WebElement uploadVideoBtn;

    @FindBy(xpath = "//*[@placeholder='Enter Topic of Content']")
    public WebElement topicOfContent;

    @FindBy(xpath = "(//*[contains(@class,'click-img')])[3]")
    public WebElement addTopicIcon;

    @FindBy(xpath = "//*[@class='option-dlt']")
    public WebElement deleteOption;

    @FindBy(xpath = "//*[@formcontrolname='CourseShortDescription']")
    public WebElement courseDescription;

    @FindBy(xpath = "(//button[text()=' SAVE '])[3]")
    public WebElement contentSaveBtn;

    @FindBy(xpath = "(//button[text()=' NEXT '])[3]")
    public WebElement contentNextBtn;

    @FindBy(xpath = "//*[text()='Assessment & Certification']")
    public WebElement assessmentAndCertificationText;

    @FindBy(xpath = "//*[text()='Sort']")
    public WebElement sortOption;

    @FindBy(xpath = "//*[text()='A to Z']")
    public WebElement AtoZSortOption;

    @FindBy(xpath = "//*[text()='Z to A']")
    public WebElement ZtoASortOption;

    @FindBy(xpath = "//*[text()='Select Course Assessment']")
    public WebElement courseAssessmentDropdown;

    @FindBy(xpath = "//*[text()='Self Pace Assessment ']")
    public WebElement selfPaceAssessment;

    @FindBy(xpath = "//*[text()='Proctor Assessment ']")
    public WebElement proctorAssessment;

    @FindBy(xpath = "//*[@formcontrolname='CertificateEnabled']")
    public WebElement certificateEnabledDropdown;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement yesOption;

    @FindBy(xpath = "//*[text()='No']")
    public WebElement noOption;

    @FindBy(xpath = "(//button[text()=' SAVE '])[4]")
    public WebElement assessmentSaveBtn;

    @FindBy(xpath = "(//button[text()=' NEXT '])[4]")
    public WebElement assessmentNextBtn;

    @FindBy(xpath = "//*[text()='Assessment & Certification Updated successfully']")
    public WebElement assessmentUpdatedMsg;

    @FindBy(xpath = "//*[text()='Select Certificate Type']")
    public WebElement certificateTypeDropdown;

    @FindBy(xpath = "//*[text()='Certificate of Participation']")
    public WebElement certificateOfParticipation;

    @FindBy(xpath = "//*[text()='Certificate of Completion']")
    public WebElement certificateOfCompletion;

    @FindBy(xpath = "//*[@formcontrolname='CertificateProvider']")
    public WebElement certificateProviderEditField;

    @FindBy(xpath = "//*[text()='Reviewer Details']")
    public WebElement reviewerDetailsText;

    @FindBy(xpath = "//*[@formcontrolname='CourseUrl']")
    public WebElement courseUrlField;

    @FindBy(xpath = "//*[@formcontrolname='CourseCode']")
    public WebElement courseCodeField;

    @FindBy(xpath = "//*[@formcontrolname='Username']")
    public WebElement usernameField;

    @FindBy(xpath = "//*[@formcontrolname='Password']")
    public WebElement passwordField;

    @FindBy(xpath = "//button[text()=' SUBMIT FOR REVIEW ']")
    public WebElement submitForReviewBtn;

    @FindBy(xpath = "//button[text()=' BACK ']")
    public WebElement backButton;

    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement coursesLink;

    @FindBy(xpath = "//a[text()='Libraries']")
    public WebElement librariesLink;

    @FindBy(xpath = "//*[contains(text(),'New Course')]")
    public WebElement newCourseBtn;

    @FindBy(xpath = "//*[contains(text(),'New Library')]")
    public WebElement newLibraryBtn;

    @FindBy(xpath = "//*[contains(text(),'Go back to SID')]")
    public WebElement goBackToSIDBtn;

    @FindBy(id = "new-course-name")
    public WebElement courseNameEditField;

    @FindBy(id = "new-course-org")
    public WebElement orgNameEditField;

    @FindBy(xpath = "(//input[@value='Create'])[1]")
    public WebElement createBtn;

    @FindBy(id = "new-library-name")
    public WebElement libraryNameField;

    @FindBy(id = "new-library-org")
    public WebElement libraryOrgField;

    @FindBy(id = "new-library-number")
    public WebElement libraryCodeField;

    @FindBy(xpath = "(//input[@value='Create'])[2]")
    public WebElement createNewLibraryBtn;




    public CourseCreatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void clickOnCreateCourseTab() {
    	waitTillTheElementIsVisibleAndClickable(createCourseTab);
    	object_Click(createCourseTab);
    }
    
    public void clickOnNextBtn() {
    	waitTillTheElementIsVisibleAndClickable(nextBtn);
    	clickWithJavaScript(nextBtn);
    	
    }
    public void clickOnBackBtn() {
    	waitTillTheElementIsVisibleAndClickable(backBtn);
    	object_Click(backBtn);
    	
    }
    public void clickOnContinueBtn() {
    	waitTillTheElementIsVisibleAndClickable(continueBtn);
    	object_Click(continueBtn);
        waitWebDriver(3000);
    }
    
    public void enterCourseTitleLanguageAndCourseMode() {
    	object_Click(courseNameField);
    	courseNameField.sendKeys(FileReaderManager.getInstance().getConfigReader().getBengaluruCity());
    	waitWebDriver(3000);
    	waitTillTheElementIsVisibleAndClickable(selectLanguageField);
    	object_Click(selectLanguageField);
    	
    	object_Click(selectEnglish);
        waitWebDriver(2000);
    	scrollDown();
    	waitWebDriver(3000);
        scrollUp();
        waitWebDriver(2000);
    	waitTillTheElementIsVisibleAndClickable(selectCourseModeField);
    	object_Click(selectCourseModeField);
    	
    	object_Click(onlineMode);
    }

    public void clickOnFreeCourse() {
    	waitTillTheElementIsVisibleAndClickable(freeCourse);
    	object_Click(freeCourse);
    }

    public void clickOnCourseTitle(){
        waitTillTheElementIsVisibleAndClickable(courseNameField);
        object_Click(courseNameField);
    }

    public void clickOnCourseLanguage(){
        waitTillTheElementIsVisibleAndClickable(selectLanguageField);
        object_Click(selectLanguageField);
    }

    public void clickOnCourseMode(){
        waitTillTheElementIsVisibleAndClickable(selectCourseModeField);
        object_Click(selectCourseModeField);
    }
    
    public void selectSectorAndClickOnNext() {
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);
    	object_Click(selectSectorField);
    	
    	waitTillTheElementIsVisibleAndClickable(agricultureSector);
    	clickWithJavaScript(agricultureSector);
    	waitWebDriver(3000);
    	clickWithJavaScript(subSectorField);
        waitWebDriver(2000);

    }

    public void clickOnCourseDetailsEditBtn(){
        waitTillTheElementIsVisibleAndClickable(courseDetailsEditBtn);
        object_Click(courseDetailsEditBtn);
        waitWebDriver(2000);
    }

    public void clickOnCrossIconOfCourseDetailsPopup(){
        waitTillTheElementIsVisibleAndClickable(crossIcon);
        object_Click(crossIcon);
        waitWebDriver(2000);
    }

    public void clickOnCrossIconOfSectorPopup(){
        waitTillTheElementIsVisibleAndClickable(sectorPopupCrossIcon);
        object_Click(sectorPopupCrossIcon);
        waitWebDriver(2000);
    }
    public void clickOnCancelButton(){
        waitTillTheElementIsVisibleAndClickable(cancelBtn);
        object_Click(cancelBtn);
        waitWebDriver(2000);
    }

    public void clickOnCourseNameAndEdit(){
        waitTillTheElementIsVisibleAndClickable(courseNameField);
        object_Click(courseNameField);
        courseNameField.clear();
        waitWebDriver(2000);
        courseNameField.sendKeys("AutomationCourse");
        waitWebDriver(2000);
    }

    public void clickOnCourseModeAndEdit(){
        waitTillTheElementIsVisibleAndClickable(courseModeField);
        object_Click(courseModeField);
        waitWebDriver(1000);
        waitTillTheElementIsVisibleAndClickable(offlineModeInEdit);
        object_Click(offlineModeInEdit);
        waitWebDriver(2000);

    }

    public void clickOnCourseLanguageAndEdit(){
        waitTillTheElementIsVisibleAndClickable(courseLanguageField);
        object_Click(courseLanguageField);
        waitWebDriver(1000);
        waitTillTheElementIsVisibleAndClickable(hindiLanguage);
        object_Click(hindiLanguage);
        waitWebDriver(2000);
    }

    public void clickOnSaveButton(){
        waitTillTheElementIsVisibleAndClickable(saveBtn);
        clickWithJavaScript(saveBtn);
        waitWebDriver(2000);
    }

    public void clickOnSectorEditBtn(){
        waitTillTheElementIsVisibleAndClickable(sectorEditIcon);
        object_Click(sectorEditIcon);
        waitWebDriver(2000);
    }

    public void clickOnSectorDropdown(){
        waitTillTheElementIsVisibleAndClickable(sectorDropdown);
        object_Click(sectorDropdown);
        waitWebDriver(1000);
    }

    public void selectTheAerospaceSector(){
        waitTillTheElementIsVisibleAndClickable(aerospaceSector);
        object_Click(aerospaceSector);
        waitWebDriver(1000);
    }

    public void clickOnSubsectorAndEnterTheValue(){
        waitTillTheElementIsVisibleAndClickable(subsectorField1);
        clickWithJavaScript(subsectorField1);
        subsectorField1.sendKeys("Automation");
        waitWebDriver(2000);
    }

    public void clickOnFeeEditBtn(){
        waitTillTheElementIsVisibleAndClickable(feesEditBtn);
        object_Click(feesEditBtn);
        waitWebDriver(2000);
    }

    public void clickOnCrossIconOfFeesPopup(){
        waitTillTheElementIsVisibleAndClickable(crossIconInFeesPopup);
        object_Click(crossIconInFeesPopup);
        waitWebDriver(2000);
    }

    public void clickOnCancelBtnOfFeesPopup(){
        waitTillTheElementIsVisibleAndClickable(cancelBtnInFeesPopup);
        object_Click(cancelBtnInFeesPopup);
        waitWebDriver(2000);
    }

    public void clickOnPaidBtn(){
        waitTillTheElementIsVisibleAndClickable(paidBtn);
        object_Click(paidBtn);
        waitWebDriver(2000);
    }

    public void clickOnSaveBtnOfFeesPopup(){
        waitTillTheElementIsVisibleAndClickable(saveBtnInFeesPopup);
        object_Click(saveBtnInFeesPopup);
        waitWebDriver(2000);
    }

    public void clickOnCourseFeesSectionAndEnterTheValue(){
        waitTillTheElementIsVisibleAndClickable(courseFeesField);
        object_Click(courseFeesField);
        courseFeesField.sendKeys("1000");
        waitWebDriver(2000);
    }

    public void clickOnDashboardInLearningPartner(){
        waitTillTheElementIsVisibleAndClickable(dashboardInLP);
        object_Click(dashboardInLP);
        waitWebDriver(2000);
    }

    public void clickOnApprovedSectionInDashboard(){
        waitWebDriver(2000);
        scrollToElement(approvedCoursesSection);
        waitWebDriver(1000);
        scrollUp();
        waitTillTheElementIsVisibleAndClickable(approvedCoursesSection);
        object_Click(approvedCoursesSection);
        waitWebDriver(2000);
    }

    public void clickOnViewAllInDashboard(){
        waitWebDriver(2000);
        scrollToElement(viewAllButton);
        waitWebDriver(1000);
        scrollUp();
        waitTillTheElementIsVisibleAndClickable(viewAllButton);
        clickWithJavaScript(viewAllButton);
        waitWebDriver(2000);
    }

    public void clickOnContactUsInLPDashboard(){
        waitWebDriver(2000);
        scrollToElement(contactUsButton);
        waitWebDriver(1000);
        scrollUp();
        waitTillTheElementIsVisibleAndClickable(contactUsButton);
        object_Click(contactUsButton);
        waitWebDriver(2000);
    }

    public void clickOnKeywordAndEnterKeyword(){
        waitTillTheElementIsVisibleAndClickable(keywordfield);
        object_Click(keywordfield);
        waitWebDriver(1000);
        keywordfield.sendKeys("Security");
        waitWebDriver(2000);
    }

    public void clickOnPlusIconToAddKeyword(){
        waitTillTheElementIsVisibleAndClickable(plusIcon);
        object_Click(plusIcon);
        waitWebDriver(2000);
    }

    public void clickOnDurationAndEnterTheDuration(){
        waitTillTheElementIsVisibleAndClickable(durationInHHHMM);
        object_Click(durationInHHHMM);
        waitWebDriver(1000);
        durationInHHHMM.sendKeys("001:30");
        waitWebDriver(3000);
    }

    public void clickOnCourseAvailability(){
        waitTillTheElementIsVisibleAndClickable(courseAvailability);
        object_Click(courseAvailability);
        waitWebDriver(1000);
    }

    public void clickOnFixedSchedule(){
        waitTillTheElementIsVisibleAndClickable(fixedScheduleOption);
        object_Click(fixedScheduleOption);
        waitWebDriver(2000);
    }

    public void clickOnStartDateCalender(){
        waitTillTheElementIsVisibleAndClickable(calenderIcon.get(0));
        object_Click(calenderIcon.get(0));
        waitWebDriver(2000);
    }

    public void clickOnEnddateCalender(){
        waitTillTheElementIsVisibleAndClickable(calenderIcon.get(1));
        object_Click(calenderIcon.get(1));
        waitWebDriver(2000);
    }

    public void selectDateFromTheCalender(){
        waitTillTheElementIsVisibleAndClickable(chooseMonthAndYear);
        object_Click(chooseMonthAndYear);
        waitWebDriver(2000);
        object_Click(selectYear);
        waitWebDriver(1000);
        object_Click(selectMonth);
        waitWebDriver(1000);
        object_Click(selectDate);
        waitWebDriver(3000);
    }

    public void clickOnCourseAlignedTo(){
        waitTillTheElementIsVisibleAndClickable(courseAlignedTo);
        object_Click(courseAlignedTo);
        waitWebDriver(2000);
    }

    public void clickOnNonNSQFOption(){
        waitTillTheElementIsVisibleAndClickable(nonNSQFOption);
        object_Click(nonNSQFOption);
        waitWebDriver(2000);
    }

    public void clickOnLearningOutcomeAndEnterTheOutcome(){
        waitTillTheElementIsVisibleAndClickable(learningOutcomesField);
        object_Click(learningOutcomesField);
        waitWebDriver(1000);
        learningOutcomesField.sendKeys("Educating Purpose");
        waitWebDriver(2000);
    }

    public void clickOnSaveButtonOnEnteringMandatoryFields(){
        waitTillTheElementIsVisibleAndClickable(SaveButton);
        object_Click(SaveButton);
        waitWebDriver(2000);
    }

    public void clickOnNextButton(){
        waitTillTheElementIsVisibleAndClickable(nextButton);
        object_Click(nextButton);
        waitWebDriver(2000);
    }

    public void clickOnCourseList(){
        waitTillTheElementIsVisibleAndClickable(courseList);
        object_Click(courseList);
        waitWebDriver(2000);
    }

    public void clickOnLMSStudio(){
        waitTillTheElementIsVisibleAndClickable(lmsStudio);
        object_Click(lmsStudio);
        waitWebDriver(2000);
    }

    public void clickOnDraftSection(){
        waitTillTheElementIsVisibleAndClickable(draft);
        object_Click(draft);
        waitWebDriver(2000);
    }

    public void clickOnViewDetailsOfCourse(){
        waitWebDriver(1000);
        scrollDown();
        waitTillTheElementIsVisibleAndClickable(viewDetailsOfCourse);
        object_Click(viewDetailsOfCourse);
        waitWebDriver(2000);
    }

    public void clickOnEditButtonOfCourse(){
        waitTillTheElementIsVisibleAndClickable(editButton);
        object_Click(editButton);
        waitWebDriver(2000);
    }

    public void clickOnAgeRequirementDropdown(){
        waitTillTheElementIsVisibleAndClickable(selectAgeRequirementDropdown);
        object_Click(selectAgeRequirementDropdown);
        waitWebDriver(1000);
    }

    public void selectTheAgeFromDropdown(){
        waitTillTheElementIsVisibleAndClickable(above18Age);
        object_Click(above18Age);
        waitWebDriver(1000);
    }

    public void clickOnEducationQualification(){
        waitTillTheElementIsVisibleAndClickable(educationQualificationDropdown);
        object_Click(educationQualificationDropdown);
        waitWebDriver(1000);
    }

    public void selectTheQualification(){
        waitTillTheElementIsVisibleAndClickable(fifthPass);
        object_Click(fifthPass);
        waitWebDriver(1000);
    }

    public void clickOnExperienceDropdown(){
        waitTillTheElementIsVisibleAndClickable(selectIndustryExperience);
        object_Click(selectIndustryExperience);
        waitWebDriver(1000);
    }

    public void selectIndustryExperienceFromDropdown(){
        waitTillTheElementIsVisibleAndClickable(selectExperienceOnetoTwo);
        object_Click(selectExperienceOnetoTwo);
        waitWebDriver(1000);
    }

    public void clickOnLearningToolsAndEnterTheData(){
        waitTillTheElementIsVisibleAndClickable(learningToolsField);
        object_Click(learningToolsField);
        learningToolsField.sendKeys("Selenium");
        waitWebDriver(2000);
    }

    public void clickOnPreRequisiteSaveButton(){
        waitTillTheElementIsVisibleAndClickable(preRequisiteSaveBtn);
        object_Click(preRequisiteSaveBtn);
        waitWebDriver(1000);
    }

    public void clickOnPreRequisiteNextButton(){
        waitTillTheElementIsVisibleAndClickable(preRequisiteNextBtn);
        object_Click(preRequisiteNextBtn);
        waitWebDriver(1000);
    }

    public void uploadTheImageInContent(){
        waitWebDriver(2000);
        WebElement ele = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
        ele.sendKeys(System.getProperty("user.dir")+"\\testdata\\Nature.jpg");
        waitWebDriver(5000);
        waitWebDriver(5000);
    }

    public void uploadTheVideoFileInContent(){
        waitWebDriver(2000);
        WebElement ele = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
        ele.sendKeys(System.getProperty("user.dir")+"\\testdata\\Sample.mp4");
        waitWebDriver(5000);
        waitWebDriver(5000);
    }

    public void clickOnContentTopic(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(topicOfContent);
        object_Click(topicOfContent);
        waitWebDriver(1000);
        topicOfContent.sendKeys("SecurityContent");
        waitWebDriver(1000);
    }

    public void clickOnAddTopicIcon(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(addTopicIcon);
        object_Click(addTopicIcon);
        waitWebDriver(2000);
    }

    public void clickOnDeleteBtn(){
        waitTillTheElementIsVisibleAndClickable(deleteOption);
        object_Click(deleteOption);
        waitWebDriver(2000);
    }

    public void clickOnDescriptionAndAdd(){
        waitTillTheElementIsVisibleAndClickable(courseDescription);
        object_Click(courseDescription);
        waitWebDriver(2000);
        courseDescription.sendKeys("Content Security");
        waitWebDriver(1000);
    }

    public void clickOnContentSaveBtn(){
        waitTillTheElementIsVisibleAndClickable(contentSaveBtn);
        object_Click(contentSaveBtn);
        waitWebDriver(2000);
    }

    public void clickOnContentNextBtn(){
        waitTillTheElementIsVisibleAndClickable(contentNextBtn);
        object_Click(contentNextBtn);
        waitWebDriver(2000);
    }

    public void clickOnSortOption(){
        waitTillTheElementIsVisibleAndClickable(sortOption);
        object_Click(sortOption);
        waitWebDriver(2000);
    }

    public void clickOnAtoZSortOption(){
        waitTillTheElementIsVisibleAndClickable(AtoZSortOption);
        object_Click(AtoZSortOption);
        waitWebDriver(2000);
    }

    public void clickOnZtoASortOption(){
        waitTillTheElementIsVisibleAndClickable(ZtoASortOption);
        object_Click(ZtoASortOption);
        waitWebDriver(2000);
    }

    public void clickOnAssessmentTypeDropdown(){
        waitTillTheElementIsVisibleAndClickable(courseAssessmentDropdown);
        object_Click(courseAssessmentDropdown);
        waitWebDriver(1000);
    }

    public void selectSelfPaceAssessment(){
        waitTillTheElementIsVisibleAndClickable(selfPaceAssessment);
        object_Click(selfPaceAssessment);
        waitWebDriver(1000);
    }

    public void clickOnCertificateEnabledDropdown(){
        waitTillTheElementIsVisibleAndClickable(certificateEnabledDropdown);
        object_Click(certificateEnabledDropdown);
        waitWebDriver(1000);
    }

    public void clickOnYesOption(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(yesOption);
        object_Click(yesOption);
        waitWebDriver(1000);
    }

    public void clickOnNoOption(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(noOption);
        object_Click(noOption);
        waitWebDriver(1000);
    }

    public void clickOnCertificateTypeDropdown(){
        waitTillTheElementIsVisibleAndClickable(certificateTypeDropdown);
        object_Click(certificateTypeDropdown);
        waitWebDriver(1000);
    }

    public void selectParticipationCertificateType(){
        waitTillTheElementIsVisibleAndClickable(certificateOfParticipation);
        object_Click(certificateOfParticipation);
        waitWebDriver(1000);
    }

    public void clickAndEnterCertificateProvider(){
        waitTillTheElementIsVisibleAndClickable(certificateProviderEditField);
        object_Click(certificateProviderEditField);
        waitWebDriver(1000);
        certificateProviderEditField.sendKeys("NSDC");
        waitWebDriver(1000);
    }

    public void clickOnAssessmentSaveBtn(){
        waitTillTheElementIsVisibleAndClickable(assessmentSaveBtn);
        object_Click(assessmentSaveBtn);
        waitWebDriver(1000);
    }


    public void clickOnAssessmentNextBtn(){
        waitTillTheElementIsVisibleAndClickable(assessmentNextBtn);
        object_Click(assessmentNextBtn);
        waitWebDriver(1000);
    }

    public void clickAndEnterCourseURL(){
        waitTillTheElementIsVisibleAndClickable(courseUrlField);
        object_Click(courseUrlField);
        courseUrlField.sendKeys("https://www.google.com/");
        waitWebDriver(2000);
    }

    public void clickAndEnterCourseCode(){
        waitTillTheElementIsVisibleAndClickable(courseCodeField);
        object_Click(courseCodeField);
        courseCodeField.sendKeys("2509");
        waitWebDriver(2000);
    }

    public void clickAndEnterUsernameField(){
        waitTillTheElementIsVisibleAndClickable(usernameField);
        object_Click(usernameField);
        usernameField.sendKeys("NSDCAdmin");
        waitWebDriver(2000);
    }

    public void clickAndEnterPasswordField(){
        waitTillTheElementIsVisibleAndClickable(passwordField);
        object_Click(passwordField);
        passwordField.sendKeys("1234");
        waitWebDriver(2000);
    }

    public void clickOnCourses(){
        waitTillTheElementIsVisibleAndClickable(coursesLink);
        object_Click(coursesLink);
        waitWebDriver(1000);
    }

    public void clickOnLibraries(){
        waitTillTheElementIsVisibleAndClickable(librariesLink);
        object_Click(librariesLink);
        waitWebDriver(1000);
    }

    public void clickOnNewCourseBtn(){
        waitTillTheElementIsVisibleAndClickable(newCourseBtn);
        object_Click(newCourseBtn);
        waitWebDriver(1000);
    }

    public void clickAndEnterCourseName(){
        waitTillTheElementIsVisibleAndClickable(courseNameEditField);
        object_Click(courseNameEditField);
        courseNameEditField.sendKeys("AutomationCourse");
        waitWebDriver(2000);
    }

    public void clickAndEnterOrgName(){
        waitTillTheElementIsVisibleAndClickable(orgNameEditField);
        object_Click(orgNameEditField);
        orgNameEditField.sendKeys("NSDC");
        waitWebDriver(2000);
    }

    public void clickOnNewLibraryBtn(){
        waitTillTheElementIsVisibleAndClickable(newLibraryBtn);
        object_Click(newLibraryBtn);
        waitWebDriver(1000);
    }
    public void clickAndEnterLibraryName(){
        waitTillTheElementIsVisibleAndClickable(libraryNameField);
        object_Click(libraryNameField);
        libraryNameField.sendKeys("AutomationLibrary");
        waitWebDriver(2000);
    }

    public void clickAndEnterLibraryOrgName(){
        waitTillTheElementIsVisibleAndClickable(libraryOrgField);
        object_Click(libraryOrgField);
        libraryOrgField.sendKeys("NSDCLibrary");
        waitWebDriver(2000);
    }

    public void clickAndEnterLibraryCode(){
        waitTillTheElementIsVisibleAndClickable(libraryCodeField);
        object_Click(libraryCodeField);
        libraryCodeField.sendKeys("NSDCLIB");
        waitWebDriver(2000);
    }


}
