package com.qt.sid.bdd.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage extends BasePage{

	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='View Profile']")
	public WebElement viewProfile;
	
	@FindBy(xpath = "//a[text()='User Profile']")
	public WebElement profilePageText;

	@FindBy(xpath = "//*[text()=' Documents ']")
	public WebElement documentsSection;

	@FindBy(xpath = "//*[text()=' Complete your Aadhaar eKYC ']")
	public WebElement completeYourAadhaarEkycSection;

	@FindBy(xpath = "//*[text()=' Sync documents with DigiLocker ']")
	public WebElement syncDocumentsWithDigilockerSection;

	@FindBy(xpath = "//*[text()=' Family ']")
	public WebElement familySection;

	@FindBy(xpath = "//*[text()='Relation/Name']")
	public WebElement relationOrNameSection;

	@FindBy(xpath = "//button[text()=' Add More ']")
	public WebElement addMoreButton;

	@FindBy(xpath = "(//button[text()=' Add More '])[2]")
	public WebElement addMoreButton2;

	@FindBy(xpath = "//*[text()=' Banking ']")
	public WebElement bankingSection;

	@FindBy(xpath = "//*[text()='Bank Name']")
	public WebElement bankNameSection;

	@FindBy(xpath = "//*[text()='Holder Name']")
	public WebElement holderNameSection;

	@FindBy(xpath = "//button[text()=' Download Profile ']")
	public WebElement downloadProfileBtn;

	@FindBy(xpath = "//button[@title='Share']")
	public WebElement shareButton;

	@FindBy(xpath = "//*[text()=' Share this User Profile ']")
	public WebElement shareProfileTextInPopup;


	@FindBy(xpath = "//*[text()=' Settings ']")
	public WebElement settingsOption;

	@FindBy(xpath = "//*[text()='Preferences']")
	public WebElement preferencesInDropdown;

	@FindBy(xpath = "//*[text()='Account Preferences']")
	public WebElement accountPreferencesText;

	@FindBy(xpath = "//*[text()=' Set what kind of content you would like to view on Skill India Digital ']")
	public WebElement assertPreferencesText;

	@FindAll({
			@FindBy(xpath = "//*[text()='Change Password']"),
			@FindBy(xpath = "//*[text()=' Change Password ']")
	})
	public WebElement changePasswordInDropdown;

	@FindBy(xpath = "//*[text()='Change PIN']")
	public WebElement changePinInSettings;

	@FindBy(xpath = "//*[text()='Change Account Password']")
	public WebElement changePasswordText;

	@FindBy(xpath = "//*[text()='Set a new Password for Skill India Digital']")
	public WebElement assertChangePasswordText;

	@FindAll({
			@FindBy(xpath = "//*[text()='Privacy Consent']"),
			@FindBy(xpath = "//*[text()=' Privacy Consent ']")
	})
	public WebElement privacyConsentInDropdown;

	@FindBy(xpath = "//*[text()='Set what others see when they view your profile.']")
	public WebElement assertPrivacyConsentText;

	@FindBy(xpath = "//*[text()=' Show disability details ']")
	public WebElement showDisabilityDetailsText;

	@FindAll({
			@FindBy(xpath = "//*[text()='Manage Alerts']"),
			@FindBy(xpath = "//*[text()=' Manage Alerts']")
	})
	public WebElement manageAlertsInDropdown;

	@FindBy(xpath = "//a[text()=' Skill Courses ']")
	public WebElement skillCoursesLink;

	@FindBy(xpath = "//*[contains(text(),' Select the kind of alerts you get for your courses')]")
	public WebElement assertManageAlertsText;

	@FindBy(xpath = "//button[text()=' Logout ']")
	public WebElement logoutInDropdown;

	@FindBy(xpath = "//*[text()=' Personal Information ']")
	public WebElement personalInformation;

	@FindBy(xpath = "//*[text()=' My Dashboard ']")
	public WebElement myDashboardInDropdown;

	@FindBy(xpath = "//a[text()=' My Dashboard ']")
	public WebElement MyDashboardHeaderLink;

	@FindBy(xpath = "//*[text()='Hi, Greetings of the day!']")
	public WebElement greetingTextInMyDashabord;

	@FindBy(xpath = "//*[text()=' Survey & Poll ']")
	public WebElement surveyAndPollSection;

	@FindBy(xpath = "//*[text()=' View ']")
	public WebElement viewInDropdown;

	@FindBy(xpath = "//button[text()=' Surveys ']")
	public WebElement surveysButton;

	@FindBy(xpath = "//button[text()=' Polls ']")
	public WebElement pollsButton;

	@FindBy(xpath = "//button[text()=' Switch User ']")
	public WebElement switchUserInDropdown;

	@FindBy(xpath = "//*[text()='Switch User']")
	public WebElement switchUserPopupText;

	@FindBy(xpath = "//*[text()='Mobilizer']")
	public WebElement mobilizerRole;

	@FindBy(xpath = "//*[text()='Learning Partner']")
	public WebElement learningPartnerRole;

	@FindBy(xpath = "//button[text()=' SWITCH PROFILE ']")
	public WebElement switchProfileBtn;

	@FindBy(xpath = "//*[text()='Candidate Mobilizer Analysis']")
	public WebElement mobilizerDashboardText;

	@FindBy(xpath = "(//*[text()='Communication Address'])[1]")
	public WebElement communicationAddressHeader;

	@FindBy(xpath = "//button[@title='Edit']")
	public WebElement editBtnInPersonalInformation;

	@FindBy(xpath = "//button[@title='Delete']")
	public WebElement deleteBtnInPersonalInformation;

	@FindBy(xpath = "//button[text()=' Yes ']")
	public WebElement yesConfirmation;

	@FindBy(xpath = "//*[text()='Address Details Removed Successfully']")
	public WebElement addressRemovedMsg;

	@FindBy(xpath = "//button[text()=' Add Address ']")
	public WebElement addAddressBtn;

	@FindBy(xpath = "(//*[text()='Communication Address'])[2]")
	public WebElement communicationAddressText;

    @FindBy(id="Address1")
	public WebElement addressLine1;

	@FindBy(id="Address2")
	public WebElement addressLine2;

	@FindBy(xpath = "//*[text()='Address Line 1 is ']")
	public WebElement validationMessageForEmptyAddress;

	@FindAll({
			@FindBy(xpath = "//*[contains(text(),'Select state')]"),
			@FindBy(xpath = "//*[text()='Select state']")
	})
	public WebElement selectStateDropdown;

	@FindBy(xpath = "//*[text()='ANDHRA PRADESH']")
	public WebElement selectAndhra;

	@FindBy(xpath = "//*[text()='Select district']")
	public WebElement selectDistrictDropdown;


	@FindBy(xpath ="(//*[@class='mat-option-text'])[1]")
	public WebElement selectDistrictFromDropdown;

	@FindBy(id = "pinCode")
	public WebElement pincodeField;

	@FindBy(id = "cityInput")
	public WebElement cityInputField;

	@FindBy(xpath = "//button[text()=' Add ']")
	public WebElement addButton;

	@FindBy(xpath = "//*[text()=' Language ']")
	public WebElement languageSection;

	@FindBy(xpath = "(//label[text()='Read'])[1]")
	public WebElement selectEnglishLanguage;

	@FindBy(xpath = "//button[text()=' Save ']")
	public WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Language settings updated successfully']")
	public WebElement languageUpdatedMsg;

	@FindBy(xpath = "//*[text()=' Education ']")
	public WebElement educationSection;

	@FindBy(xpath = "//*[text()='Education Details Removed Successfully']")
	public WebElement educationDetailsRemovedMsg;

	@FindBy(id = "universityName")
	public WebElement universityName;

	@FindBy(xpath = "//*[text()='Enter Degree/Specialization']")
	public WebElement degreeField;

	@FindBy(xpath = "//*[text()=' Graduation ']")
	public WebElement graduationDegree;

	@FindBy(xpath = "//*[text()='Select Education/Stream']")
	public WebElement streamField;

	@FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
	public WebElement selectStream;

	@FindBy(xpath = "//*[@aria-label='Open calendar']")
	public WebElement calenderSection;

	@FindBy(xpath = "//*[text()=' 2015 ']")
	public WebElement selectPassoutYear;

	@FindBy(xpath = "//*[text()=' JUL ']")
	public WebElement selectPassoutMonth;

	@FindBy(xpath = "//*[text()='Education details added successfully']")
	public WebElement educationDetailsAddedMsg;

	@FindBy(xpath = "//*[text()=' Experience ']")
	public WebElement experienceSection;

	@FindBy(xpath = "//*[text()='Work Experience Removed Successfully']")
	public WebElement workExperienceRemovedMsg;

	@FindBy(xpath = "//*[@formcontrolname='JobTitle']")
	public WebElement jobTitle;

	@FindAll({
			@FindBy(xpath = "//*[text()='Job Type']"),
			@FindBy(xpath = "//*[text()='Enter Job Type']")
	})
	public WebElement jobType;

	@FindBy(xpath = "//*[text()=' Permanent ']")
	public WebElement permanentJob;

	@FindBy(xpath = "//*[@formcontrolname='CompanyName']")
	public WebElement companyName;

	@FindBy(xpath = "//*[@class='mat-checkbox-inner-container']")
	public WebElement currentCompanyChkBox;

	@FindBy(id = "salary")
	public WebElement salaryField;

	@FindBy(xpath = "//*[text()='Work experience added successfully']")
	public WebElement workExperienceAddedMsg;

	@FindBy(xpath = "//*[text()=' Differently Abled ']")
	public WebElement differentlyAbledSection;

	@FindBy(xpath = "//*[text()='Disability Details Removed Successfully']")
	public WebElement disabilityRemovedMsg;

	@FindBy(xpath = "//*[@formcontrolname='DisabilityType']")
	public WebElement disabilityType;

	@FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
	public WebElement selectDisability;

	@FindBy(xpath = "(//*[@class='mat-option-text'])[2]")
	public WebElement selectDisability2;

	@FindBy(xpath = "//*[@class='mat-slider-focus-ring']")
	public WebElement selectPercentage;

	@FindBy(xpath = "//*[text()='Differently Abled details added successfully']")
	public WebElement disabilityAddedMsg;


	@FindBy(xpath = "//a[text()='Learning Partner Profile']")
	public WebElement learningPartnerProfileLink;

	@FindBy(xpath = "//*[text()='Basic Details']")
	public WebElement basicDetailsText;

	@FindBy(xpath = "//button[text()=' Switch User ']")
	public WebElement switchUserBtn;

	@FindBy(xpath = "//*[text()='Learner']")
	public WebElement learnerRoleInSwicthUser;


	@FindBy(xpath = "//*[@formcontrolname='Qualification']")
	public WebElement qualification;


	@FindBy(xpath = "(//*[@class='mat-option-text'])[2]")
	public WebElement selectStream2;

	@FindBy(xpath = "//*[text()=' Update ']")
	public WebElement updateEducationDetailsBtn;


	@FindBy(id = "familyFirstName")
	public WebElement firstName;

	@FindBy(id = "familyLastName")
	public WebElement lastName;

	@FindBy(xpath = "//*[@formcontrolname='RelationName']")
	public WebElement selectRelationDropdown;

	@FindBy(xpath = "//*[text()=' Father ']")
	public WebElement fatherRelation;

	@FindBy(xpath = "//*[text()=' Brother ']")
	public WebElement brotherRelation;

	@FindBy(xpath = "(//*[text()='Occupation'])[2]")
	public WebElement occupationDropdown;

	@FindBy(xpath = "//*[text()=' Self-employed ']")
	public WebElement selfEmployedOccupation;

	@FindBy(id = "familyage")
	public WebElement age;

	@FindBy(xpath = "//*[text()='AnnualIncome']")
	public WebElement annualIncomeDropdown;

	@FindBy(xpath = "//*[text()=' 3-5 Lakhs INR ']")
	public WebElement threeToFiveLakhsSalary;


	@FindBy(id = "bankName")
	public WebElement bankName;

	@FindBy(id = "accountNumber")
	public WebElement accountNumber;

	@FindBy(id = "accountHolderName")
	public WebElement accountHolderName;

	@FindBy(id = "ifsc")
	public WebElement ifsc;

	@FindBy(id = "branchName")
	public WebElement branchName;


	@FindBy(xpath = "//*[text()=' My Skill Courses ']")
	public WebElement mySkillCoursesInDashboard;

	@FindBy(xpath = "//*[text()=' Online ']")
	public WebElement onlineSection;


	@FindBy(xpath = "//*[text()=' Completed ']")
	public WebElement completedSection;


	@FindBy(xpath = "//*[text()=' Joined ']")
	public WebElement joinedSection;


	@FindBy(xpath = "//*[text()=' Offline ']")
	public WebElement offlineSection;

	@FindBy(xpath = "//*[text()=' Applications ']")
	public WebElement applicationsSection;

	@FindBy(xpath = "(//*[text()=' Offline '])[2]")
	public WebElement offlineTagOnCourse;

	@FindBy(xpath = "//*[text()=' Course Details']")
	public WebElement courseDetailsForOfflineCourse;

	@FindBy(xpath = "//*[@class='course-titlle']")
	public WebElement courseTitleInOffline;

	@FindBy(xpath = "//*[@class='discription-area']")
	public WebElement courseDescriptionInOffline;

	@FindBy(xpath = "//*[text()=' 18+ Students ']")
	public WebElement noOfStudentsInOfflineCourse;

	@FindBy(xpath = "//*[text()=' NA Hours ']")
	public WebElement courseDurationInOffline;

	@FindBy(xpath = "//button[@title='Share Button']")
	public WebElement shareButtonInOfflineCourse;

	@FindBy(xpath = "//*[text()=' Share this Course ']")
	public WebElement shareThisCoursePopupText;

	@FindBy(xpath = "//*[@title='Close']")
	public WebElement crossButtonInSharePopup;

	@FindBy(xpath = "//button[@title='whatsapp']")
	public WebElement whatsAppShareOption;

	@FindBy(xpath = "//button[@title='facebook']")
	public WebElement facebookShareOption;

	@FindBy(xpath = "//button[@title='twitter']")
	public WebElement twitterShareOption;

	@FindBy(xpath = "//button[@title='linkedin']")
	public WebElement linkedinShareOption;

	@FindBy(xpath = "//button[@title='Copy']")
	public WebElement copyLinkOption;

	@FindBy(xpath = "//*[@class='skill-course-card-v2']")
	public WebElement courseCard;

	@FindBy(xpath = "//p[text()=' Online ']")
	public WebElement onlineTag;

	@FindBy(xpath = "//*[text()=' You do not have any completed courses yet. ']")
	public WebElement noCompletedCoursesText;

	@FindBy(xpath = "//*[@class='scheme-application-card']")
	public WebElement cardUnderApplications;

	@FindBy(xpath = "//*[@class='hand-icon-tag']")
	public WebElement handIconTag;


	@FindBy(xpath = "//*[text()='My Opportunities']")
	public WebElement myOpportunitiesSection;

	@FindBy(xpath = "//h4[text()=' My Opportunities ']")
	public WebElement myOpportunitiesHeader;

	@FindBy(xpath = "(//*[@class='tab-btn-list']//following::*[text()=' Job Exchange '])[1]")
	public WebElement JobExchangeSection;

	@FindBy(xpath = "//*[text()='Job']")
	public WebElement jobTag;

	@FindBy(xpath = "//*[text()=' Apprenticeships ']")
	public WebElement apprenticeshipsSection;

	@FindBy(xpath = "//*[normalize-space()='Recommendations For You']")
	public WebElement recommendationsForYouSection;

	@FindBy(xpath = "//h4[normalize-space()='Recommendations For You']")
	public WebElement recommendationsForYouHeader;

	@FindBy(xpath = "(//h4[normalize-space()='Recommendations For You']//following::h5)[1]")
	public WebElement recommendationsList;

	@FindBy(xpath = "//*[text()='My Credits']")
	public WebElement myCreditsSection;

	@FindBy(xpath = "//h4[normalize-space()='My Credits']")
	public WebElement myCreditsHeader;

	@FindBy(xpath = "//*[@class='overlay']")
	public WebElement disabledCardsUnderMyCredits;

	@FindBy(xpath = "//*[text()='Summary']")
	public WebElement summarySection;

	@FindBy(xpath = "//h4[text()=' Summary ']")
	public WebElement summaryHeader;

	@FindBy(xpath = "//*[text()=' Skill Courses Applied ']")
	public WebElement skillCoursesAppliedSection;

	@FindBy(xpath = "//*[text()=' Job Exchange Opportunities Applied ']")
	public WebElement jobExchangeOpportunitiesAppliedSection;

	@FindBy(xpath = "//*[text()=' Apprenticeships Applied ']")
	public WebElement apprenticeshipsAppliedSection;

	@FindBy(xpath = "//button[text()=' View Detail ']")
	public WebElement viewDetailButton;

	@FindBy(xpath = "//*[text()=' In Progress Skill Courses ']")
	public WebElement inProgressSkillCoursesHeader;

	@FindBy(xpath = "//*[text()='PMKVY ']")
	public WebElement PMKVYSection;

	@FindBy(xpath = "//*[text()=' Skilling Program ']")
	public WebElement skillingProgramHeader;

	@FindBy(xpath = "//*[text()=' Share this Skilling Program ']")
	public WebElement shareThisSkillingProgramPopup;

	@FindBy(xpath = "//button[text()=' Apply ']")
	public WebElement applyBtn;

	@FindBy(xpath = "//button[text()=' Apply Now ']")
	public WebElement applyNowBtn;

	@FindBy(xpath = "//*[text()='By OTP ']")
	public WebElement byOTPOption;

	@FindBy(xpath = "//*[text()=' Complete your Aadhaar eKYC']")
	public WebElement completeYourAadhaareKYCSectionInMyDashboard;

	@FindBy(xpath = "//*[@placeholder='Select E-KYC Option']")
	public WebElement ekycDropdown;

	@FindBy(xpath = "//button[text()=' Continue ']")
	public WebElement continueButton;

	@FindBy(xpath = "//*[text()='Please Provide Your Aadhaar Number']")
	public WebElement pleaseProvideYourAadhaarNumberText;

	@FindBy(id = "aadhaarNumberInput")
	public WebElement aadhaarNumberInputField;

	@FindBy(id  = "flexCheckDefault")
	public WebElement checkBoxInAadhaar;


	@FindAll({
			@FindBy(xpath = "//button[text()=' Continue ']"),
			@FindBy(xpath = "//button[text()=' Generate OTP ']")
	})
	public WebElement generateOTPButton;

	@FindBy(xpath = "//*[text()='Enter OTP to Verify Aadhaar']")
	public WebElement enterOTPToVerifyAadhaarText;

	@FindBy(xpath = "//*[text()='My Skill Courses']")
	public WebElement mySkillCoursesSection;

	@FindBy(xpath = "//*[text()='Upcoming Skill Courses']")
	public WebElement upcomingSkillCoursesSection;

	@FindBy(xpath = "//button[contains(@aria-label,'1 of')]")
	public WebElement sliderOne;

	@FindBy(xpath = "(//*[@class='course-titlle'])[1]")
	public WebElement onlineCourseTitle;

	@FindBy(xpath = "(//*[@class='discription'])[1]")
	public WebElement onlineCourseDiscription;

	@FindBy(xpath = "(//*[contains(text(),'Hours')])[1]")
	public WebElement timeDuraitonOfCourseCard;

	@FindBy(xpath = "(//button[@title='Share Button'])[1]")
	public WebElement shareOnlineCourseBtn;

	@FindBy(xpath = "(//*[contains(text(),'+ Students ')])[1]")
	public WebElement studentsCount;

	@FindBy(xpath = "//button[text()=' View All ']")
	public WebElement viewAllBtnOption;

	@FindBy(xpath = "(//button[text()='1'])[1]")
	public WebElement courseSliderOne;

	@FindBy(xpath = "(//button[text()=' Go To Course '])[1]")
	public WebElement goToCourseBtn;

	@FindBy(xpath = "//*[text()=' Course Details']")
	public WebElement courseDetailsHeader;

	@FindBy(xpath = "//span[text()=' Offline ']")
	public WebElement offlineTag;

	@FindBy(xpath = "//span[text()=' Online ']")
	public WebElement onlineTagOnCourseDetailsPage;

	@FindBy(xpath = "//span[text()=' Completed ']")
	public WebElement completedTagOnCourseDetailsPage;

	@FindBy(xpath = "//*[normalize-space()='e-SHRAM']")
	public WebElement eShramOption;

	@FindBy(xpath = "//button[normalize-space()='My Courses']")
	public WebElement myCoursesSectionInProfile;

	@FindBy(xpath = "//button[normalize-space()='My Credits']")
	public WebElement myCreditsSectionInProfile;




	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);

	}
	
	public void clickOnViewProfile() {
		waitTillTheElementIsVisibleAndClickable(viewProfile);
		object_Click(viewProfile);
	}
	
	public void visibilityOfProfileSection() {
		waitTillTheElementIsVisibleAndClickable(profilePageText);
		waitWebDriver(2000);
	}

	public void clickOnDocuments(){
		waitTillTheElementIsVisibleAndClickable(documentsSection);
		object_Click(documentsSection);
		waitWebDriver(2000);
	}

	public void clickOnFamily(){
		waitWebDriver(2000);
		scrollToElement(familySection);
		waitWebDriver(2000);
		object_Click(familySection);
		waitWebDriver(2000);
	}

	public void clickOnBanking(){
		waitWebDriver(2000);
		scrollToElement(bankingSection);
		waitWebDriver(2000);
		object_Click(bankingSection);
		waitWebDriver(2000);
	}

	public void clickOnDownloadProfile(){
		waitTillTheElementIsVisibleAndClickable(downloadProfileBtn);
		object_Click(downloadProfileBtn);
		waitWebDriver(3000);
	}

	public void clickOnShareProfileButton(){
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(shareButton);
		object_Click(shareButton);
		waitWebDriver(2000);
	}

	public void visibilityOfSettingsOption(){
		waitWebDriver(2000);
		scrollToElement(settingsOption);
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(settingsOption);
		waitWebDriver(2000);
	}

	public void clickOnPreferences(){
		waitTillTheElementIsVisibleAndClickable(preferencesInDropdown);
		object_Click(preferencesInDropdown);
		waitWebDriver(2000);
	}

	public void clickOnChangePassword(){
		waitTillTheElementIsVisibleAndClickable(changePasswordInDropdown);
		object_Click(changePasswordInDropdown);
		waitWebDriver(2000);
	}

	public void clickOnChangePin(){
		waitTillTheElementIsVisibleAndClickable(changePinInSettings);
		object_Click(changePinInSettings);
		waitWebDriver(2000);
	}

	public void clickOnPrivacyConsent(){
		waitTillTheElementIsVisibleAndClickable(privacyConsentInDropdown);
		object_Click(privacyConsentInDropdown);
		waitWebDriver(2000);
	}

	public void clickOnManageAlerts(){
		waitTillTheElementIsVisibleAndClickable(manageAlertsInDropdown);
		object_Click(manageAlertsInDropdown);
		waitWebDriver(2000);
	}

	public void clickOnPersonalInformation(){
		waitTillTheElementIsVisibleAndClickable(personalInformation);
		object_Click(personalInformation);
		waitWebDriver(2000);
	}

	public void clickOnMyDashboardInProfileDropdown(){
		waitTillTheElementIsVisibleAndClickable(myDashboardInDropdown);
		object_Click(myDashboardInDropdown);
		waitWebDriver(2000);
	}

	public void clickOnViewUnderSurveysAndPolls(){
		waitTillTheElementIsVisibleAndClickable(viewInDropdown);
		object_Click(viewInDropdown);
		waitWebDriver(2000);
	}

	public void clickOnSwitchUserInDropdown(){
		waitTillTheElementIsVisibleAndClickable(switchUserInDropdown);
		object_Click(switchUserInDropdown);
		waitWebDriver(2000);
	}

	public void selectMobilizerRoleInSwitchUser(){
		waitTillTheElementIsVisibleAndClickable(mobilizerRole);
		object_Click(mobilizerRole);
		waitWebDriver(2000);
	}

	public void clickOnSwitchUserProfileBtn(){
		waitTillTheElementIsVisibleAndClickable(switchProfileBtn);
		object_Click(switchProfileBtn);
		waitWebDriver(3000);
	}

	public void scrollTillCommunicationAddress(){
		waitWebDriver(3000);
		scrollToElement(communicationAddressHeader);
		waitWebDriver(2000);
	}

	public void addTheCommunicationAddress(){
		waitWebDriver(3000);

		try{
			if(deleteBtnInPersonalInformation.isDisplayed()){
				clickOnDeleteBtn();
				clickOnYesConfirmation();
				Assert.assertTrue(isElementPresent(addressRemovedMsg),"Added address removed successfully message is not displayed");
			}else{
				log.info("Delete button is not displayed");
			}
		}catch (Exception e){
			e.printStackTrace();
		}

		handleChatbotPopup();

		clickOnAddAddressBtn();

		addAddressInLineOne();
		addAddressInLineTwo();

		clickOnStateDropdown();
		selectState();
		clickOnDistrictDropdown();
		selectDistrict();

		clickAndEnterPincode();
		scrollDown();
		clickOnCity();

	}

	public void verifyValidationMessageForMandatoryFieldEmpty(){
		waitWebDriver(3000);

		try{
			if(deleteBtnInPersonalInformation.isDisplayed()){
				clickOnDeleteBtn();
				clickOnYesConfirmation();
				Assert.assertTrue(isElementPresent(addressRemovedMsg),"Added address removed successfully message is not displayed");
			}else{
				log.info("Delete button is not displayed");
			}
		}catch (Exception e){
			e.printStackTrace();
		}

		//handleChatbotPopup();

		clickOnAddAddressBtn();

		clickOnAddressLineOne();

		clickOnAddressLineTwo();
	}

	public void clickOnDeleteBtn(){
		waitTillTheElementIsVisibleAndClickable(deleteBtnInPersonalInformation);
		object_Click(deleteBtnInPersonalInformation);
		waitWebDriver(3000);
	}

	public void clickOnYesConfirmation(){
		waitTillTheElementIsVisibleAndClickable(yesConfirmation);
		object_Click(yesConfirmation);
		waitWebDriver(1000);
	}

	
	public void clickOnAddAddressBtn(){
		waitTillTheElementIsVisibleAndClickable(addAddressBtn);
		object_Click(addAddressBtn);
		waitWebDriver(2000);
	}

	public void addAddressInLineOne(){
		waitTillTheElementIsVisibleAndClickable(addressLine1);
		object_Click(addressLine1);
		addressLine1.sendKeys("39");
		waitWebDriver(2000);
	}

	public void clickOnAddressLineOne(){
		waitTillTheElementIsVisibleAndClickable(addressLine1);
		object_Click(addressLine1);
		waitWebDriver(2000);
	}

	public void clickOnAddressLineTwo(){
		waitTillTheElementIsVisibleAndClickable(addressLine2);
		object_Click(addressLine2);
		waitWebDriver(2000);
	}


	public void addAddressInLineTwo(){
		waitTillTheElementIsVisibleAndClickable(addressLine2);
		object_Click(addressLine2);
		addressLine2.sendKeys("Suddahalli Village");
		waitWebDriver(2000);
	}

	public void clickOnStateDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectStateDropdown);
		clickWithJavaScript(selectStateDropdown);
		waitWebDriver(2000);
	}

	public void selectState(){
		waitTillTheElementIsVisibleAndClickable(selectAndhra);
		clickWithJavaScript(selectAndhra);
		waitWebDriver(2000);
	}

	public void clickOnDistrictDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectDistrictDropdown);
		object_Click(selectDistrictDropdown);
		waitWebDriver(2000);
	}

	public void selectDistrict(){
		waitTillTheElementIsVisibleAndClickable(selectDistrictFromDropdown);
		object_Click(selectDistrictFromDropdown);
		waitWebDriver(2000);
	}

	public void clickAndEnterPincode(){
		waitTillTheElementIsVisibleAndClickable(pincodeField);
		object_Click(pincodeField);
		pincodeField.sendKeys("562101");
		waitWebDriver(3000);
	}

	public void clickOnCity(){
		waitWebDriver(3000);
		scrollToElement(cityInputField);
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(cityInputField);
		object_Click(cityInputField);
		cityInputField.sendKeys("Anakapalli");
		waitWebDriver(2000);
	}

	public void clickOnAddButton(){
		waitTillTheElementIsVisibleAndClickable(addButton);
		object_Click(addButton);
		waitWebDriver(5000);

	}

	public void clickOnLanguageSection(){
		waitWebDriver(5000);
		waitTillTheElementIsVisibleAndClickable(languageSection);
		object_Click(languageSection);
		waitWebDriver(2000);
	}

	public void unselectAndSelectTheEnglishLanguage(){
		waitWebDriver(2000);
//		waitTillTheElementIsVisibleAndClickable(selectEnglishLanguage);
//		clickWithJavaScript(selectEnglishLanguage);
//		waitWebDriver(1000);
//		clickWithJavaScript(selectEnglishLanguage);
		waitWebDriver(2000);
	}

	public void clickOnSaveBtn(){
		waitWebDriver(1000);
		scrollToElement(saveBtn);
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(saveBtn);
		object_Click(saveBtn);
		waitWebDriver(1000);
	}

	public void clickOnEducationSection(){
		waitTillTheElementIsVisibleAndClickable(educationSection);
		object_Click(educationSection);
		waitWebDriver(2000);
		scrollDown();
		waitWebDriver(2000);

	}

	public void addTheEducationDetails(){
		waitWebDriver(3000);

		try{
			if(deleteBtnInPersonalInformation.isDisplayed()){
				clickOnDeleteBtn();
				clickOnYesConfirmation();
				Assert.assertTrue(isElementPresent(educationDetailsRemovedMsg),"EducationDetails removed successfully message is not displayed");
			}else{
				log.info("Delete button is not displayed");
			}
		}catch (Exception e){
			e.printStackTrace();
		}

		handleChatbotPopup();

		clickOnAddMoreBtn();

		clickOnUniversityField();

		enterTheUniversityName();

		clickOnDegreeDropdown();

		selectTheDegree();

		clickOnStream();

		selectTheStream();

		clickOnCalender();

	}

	public void clickOnAddMoreBtn(){
		waitWebDriver(5000);
		waitTillTheElementIsVisibleAndClickable(addMoreButton);
		object_Click(addMoreButton);
		waitWebDriver(2000);
	}

	public void clickOnAddMoreBtnInBanking(){
		waitWebDriver(5000);
		waitTillTheElementIsVisibleAndClickable(addMoreButton2);
		object_Click(addMoreButton2);
		waitWebDriver(2000);
	}

	public void handleChatbotPopup(){
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='haptik-xdk']")));
		waitWebDriver(3000);
		clickWithJavaScript(driver.findElement(By.xpath("//*[@class='minimized-view-v2-icon open']")));

		driver.switchTo().defaultContent();
	}
	public void clickOnUniversityField(){
		waitTillTheElementIsVisibleAndClickable(universityName);
		object_Click(universityName);
		waitWebDriver(2000);
	}

	public void enterTheUniversityName(){
		universityName.sendKeys("SJCIT");
		waitWebDriver(2000);
	}

	public void clickOnDegreeDropdown(){
		waitTillTheElementIsVisibleAndClickable(degreeField);
		object_Click(degreeField);
		waitWebDriver(2000);
	}

	public void selectTheDegree(){
		waitTillTheElementIsVisibleAndClickable(graduationDegree);
		object_Click(graduationDegree);
		waitWebDriver(2000);
	}

	public void clickOnStream(){
		waitTillTheElementIsVisibleAndClickable(streamField);
		object_Click(streamField);
		waitWebDriver(2000);
	}

	public void selectTheStream(){
		waitTillTheElementIsVisibleAndClickable(selectStream);
		object_Click(selectStream);
		waitWebDriver(2000);
	}

	public void clickOnCalender(){
		waitTillTheElementIsVisibleAndClickable(calenderSection);
		object_Click(calenderSection);
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(selectPassoutYear);
		object_Click(selectPassoutYear);
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(selectPassoutMonth);
		object_Click(selectPassoutMonth);
		waitWebDriver(2000);

	}

	public void clickOnExperience(){
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(experienceSection);
		object_Click(experienceSection);
		waitWebDriver(2000);
		scrollDown();
		waitWebDriver(2000);
	}

	public void addTheExperience(){
		waitWebDriver(3000);

		try{
			if(deleteBtnInPersonalInformation.isDisplayed()){
				clickOnDeleteBtn();
				clickOnYesConfirmation();
				Assert.assertTrue(isElementPresent(workExperienceRemovedMsg),"Experience removed successfully message is not displayed");
			}else{
				log.info("Delete button is not displayed");
			}
		}catch (Exception e){
			e.printStackTrace();
		}

		handleChatbotPopup();

		clickOnAddMoreBtn();

		clickOnJobTitleandEnterTheTitle();

		jobTypeAndSelectJobType();

		clickOnCompanyNameAndEnterTheName();

		clickOnCalender();

		clickOnCheckBox();

		scrollDown();

		clickOnSalaryAndEnterTheSalary();

	}

	public void clickOnJobTitleandEnterTheTitle(){
		waitTillTheElementIsVisibleAndClickable(jobTitle);
		object_Click(jobTitle);
		waitWebDriver(1000);
		jobTitle.sendKeys("Senior Test Engineer");
		waitWebDriver(2000);
	}

	public void jobTypeAndSelectJobType(){
		waitTillTheElementIsVisibleAndClickable(jobType);
		clickWithJavaScript(jobType);
		waitWebDriver(1000);
		clickWithJavaScript(permanentJob);
		waitWebDriver(2000);
	}

	public void clickOnCompanyNameAndEnterTheName(){
		waitTillTheElementIsVisibleAndClickable(companyName);
		object_Click(companyName);
		waitWebDriver(1000);
		companyName.sendKeys("Qualitrix");
		waitWebDriver(2000);
	}

   public void clickOnCheckBox(){
		waitTillTheElementIsVisibleAndClickable(currentCompanyChkBox);
		object_Click(currentCompanyChkBox);
		waitWebDriver(2000);
   }

   public void clickOnSalaryAndEnterTheSalary(){
		waitWebDriver(1000);
		scrollDown();
		waitTillTheElementIsVisibleAndClickable(salaryField);
		object_Click(salaryField);
		waitWebDriver(2000);
		salaryField.sendKeys("400000");
		waitWebDriver(2000);
   }

   public void clickOnSalaryAndUpdateSalary(){
	   waitWebDriver(1000);
	   scrollDown();
	   waitTillTheElementIsVisibleAndClickable(salaryField);
	   object_Click(salaryField);
	   salaryField.clear();
	   waitWebDriver(2000);
	   salaryField.sendKeys("1000000");
	   waitWebDriver(2000);
   }

   public void clickOnDifferentlyAbledSection(){
	   waitWebDriver(2000);
	   waitTillTheElementIsVisibleAndClickable(differentlyAbledSection);
	   object_Click(differentlyAbledSection);
	   waitWebDriver(2000);
	   scrollDown();
	   waitWebDriver(2000);
   }

   public void addTheDisability(){
	   waitWebDriver(3000);

	   try{
		   if(deleteBtnInPersonalInformation.isDisplayed()){
			   clickOnDeleteBtn();
			   clickOnYesConfirmation();
			   Assert.assertTrue(isElementPresent(disabilityRemovedMsg),"Disability removed successfully message is not displayed");
		   }else{
			   log.info("Delete button is not displayed");
		   }
	   }catch (Exception e){
		   e.printStackTrace();
	   }

	   handleChatbotPopup();

	   clickOnAddMoreBtn();

	   clickOnDisabilityType();

	   selectDisability();

	   clickOnDisabilityPercentage();

   }

   public void clickOnDisabilityType(){
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(disabilityType);
		object_Click(disabilityType);
		waitWebDriver(2000);
   }

   public void selectDisability(){
		waitTillTheElementIsVisibleAndClickable(selectDisability);
		object_Click(selectDisability);
		waitWebDriver(2000);
   }

	public void selectDisability2(){
		waitTillTheElementIsVisibleAndClickable(selectDisability2);
		object_Click(selectDisability2);
		waitWebDriver(2000);
	}



   public void clickOnDisabilityPercentage(){
	   WebElement slider = driver.findElement(By.xpath("//*[@formcontrolname='DisabilityPercentage']"));
	   Actions move = new Actions(driver);
	   Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
	   action.perform();
	/*	waitTillTheElementIsVisibleAndClickable(selectPercentage);
		object_Click(selectPercentage);*/
		waitWebDriver(2000);
   }

   public void clickOnSwitchUserButton(){
		waitTillTheElementIsVisibleAndClickable(switchUserBtn);
		object_Click(switchUserBtn);
		waitWebDriver(3000);
   }

   public void clickOnLearnerRoleInSwitchUser(){
		waitTillTheElementIsVisibleAndClickable(learnerRoleInSwicthUser);
		object_Click(learnerRoleInSwicthUser);
		waitWebDriver(3000);
   }

   public void clickOnEditButtonInEducation(){
		waitTillTheElementIsVisibleAndClickable(editBtnInPersonalInformation);
		object_Click(editBtnInPersonalInformation);
		waitWebDriver(2000);
   }

   public void clickOnQualificationInEducation(){
	   waitTillTheElementIsVisibleAndClickable(qualification);
	   object_Click(qualification);
	   waitWebDriver(2000);
   }

   public void clickOnStreamTwoInQualification(){
	   waitTillTheElementIsVisibleAndClickable(selectStream2);
	   object_Click(selectStream2);
	   waitWebDriver(2000);
   }

   public void clickOnUpdateEducationDetails(){
	   waitTillTheElementIsVisibleAndClickable(updateEducationDetailsBtn);
	   object_Click(updateEducationDetailsBtn);
	   waitWebDriver(2000);
   }

   public void clickAndEnterFirstName(){
		waitTillTheElementIsVisibleAndClickable(firstName);
		object_Click(firstName);
		firstName.sendKeys("Zamal");
		waitWebDriver(2000);
   }

   public void clickAndEnterLastName(){
	   waitTillTheElementIsVisibleAndClickable(lastName);
	   object_Click(lastName);
	   lastName.sendKeys("Abdul");
	   waitWebDriver(2000);
   }

   public void clickOnRelationDropdown(){
		waitTillTheElementIsVisibleAndClickable(selectRelationDropdown);
		object_Click(selectRelationDropdown);
		waitWebDriver(2000);
   }

   public void selectRelationOfFamily(){
		waitTillTheElementIsVisibleAndClickable(fatherRelation);
		object_Click(fatherRelation);
		waitWebDriver(2000);
   }

   public void updateTheRelation(){
		waitTillTheElementIsVisibleAndClickable(brotherRelation);
		object_Click(brotherRelation);
		waitWebDriver(2000);
   }
   public void clickOnOccupationDropdown(){
	   waitTillTheElementIsVisibleAndClickable(occupationDropdown);
	   object_Click(occupationDropdown);
	   waitWebDriver(2000);
   }

   public void selectTheOccupation(){
		waitTillTheElementIsVisibleAndClickable(selfEmployedOccupation);
		object_Click(selfEmployedOccupation);
		waitWebDriver(2000);
   }

   public void clickAndEnterAge(){
	   waitTillTheElementIsVisibleAndClickable(age);
	   object_Click(age);
	   age.sendKeys("25");
	   waitWebDriver(2000);
   }

   public void updateTheAge(){
	   waitTillTheElementIsVisibleAndClickable(age);
	   object_Click(age);
	   age.clear();
	   age.sendKeys("50");
	   waitWebDriver(2000);
   }

   public void clickOnAnualIncomeDropdown(){
	   waitTillTheElementIsVisibleAndClickable(annualIncomeDropdown);
	   object_Click(annualIncomeDropdown);
	   waitWebDriver(2000);
   }

   public void selectAnnualIncome(){
		waitTillTheElementIsVisibleAndClickable(threeToFiveLakhsSalary);
		object_Click(threeToFiveLakhsSalary);
		waitWebDriver(2000);
   }

   public void addFamilyDetails(){
	   waitWebDriver(3000);

	   try{
		   if(deleteBtnInPersonalInformation.isDisplayed()){
			   clickOnDeleteBtn();
			   clickOnYesConfirmation();
			   Assert.assertTrue(isElementPresent(disabilityRemovedMsg),"Disability removed successfully message is not displayed");
		   }else{
			   log.info("Delete button is not displayed");
		   }
	   }catch (Exception e){
		   e.printStackTrace();
	   }

	   handleChatbotPopup();

	   clickOnAddMoreBtn();

	   clickAndEnterFirstName();

	   clickAndEnterLastName();

	   clickOnRelationDropdown();

	   selectRelationOfFamily();

	   clickOnOccupationDropdown();

	   selectTheOccupation();

	   clickAndEnterAge();

	   clickOnAnualIncomeDropdown();

	   selectAnnualIncome();

   }

   public void clickAndEnterBankName(){
		waitTillTheElementIsVisibleAndClickable(bankName);
		object_Click(bankName);
		bankName.sendKeys("SBM");
		waitWebDriver(2000);
   }

   public void updateTheBankName(){
		object_Click(bankName);
		bankName.clear();
		bankName.sendKeys("State Bank Of India");
		waitWebDriver(2000);
   }

   public void clickAndEnterAccountNumber(){
	   waitTillTheElementIsVisibleAndClickable(accountNumber);
	   object_Click(accountNumber);
	   accountNumber.sendKeys("123456789");
	   waitWebDriver(2000);
   }

   public void clickAndEnterAccountHolderName(){
	   waitTillTheElementIsVisibleAndClickable(accountHolderName);
	   object_Click(accountHolderName);
	   accountHolderName.sendKeys("Manjunath");
	   waitWebDriver(2000);
   }

   public void clickAndEnterIFSC(){
	   waitTillTheElementIsVisibleAndClickable(ifsc);
	   object_Click(ifsc);
	   ifsc.sendKeys("SBIN0007908");
	   waitWebDriver(2000);
   }

   public void clickAndEnterBranchName(){
	   waitTillTheElementIsVisibleAndClickable(branchName);
	   object_Click(branchName);
	   branchName.sendKeys("Bangalore");
	   waitWebDriver(2000);
   }

   public void addBankingDetails(){
	   waitWebDriver(3000);

	   try{
		   if(deleteBtnInPersonalInformation.isDisplayed()){
			   clickOnDeleteBtn();
			   clickOnYesConfirmation();
			   Assert.assertTrue(isElementPresent(disabilityRemovedMsg),"Disability removed successfully message is not displayed");
		   }else{
			   log.info("Delete button is not displayed");
		   }
	   }catch (Exception e){
		   e.printStackTrace();
	   }

	   handleChatbotPopup();

	   clickOnAddMoreBtnInBanking();

       clickAndEnterBankName();

	   clickAndEnterAccountNumber();

	   clickAndEnterAccountHolderName();

	   clickAndEnterIFSC();

	   clickAndEnterBranchName();

   }

   public void clickOnOfflineSection(){
		waitTillTheElementIsVisibleAndClickable(offlineSection);
		object_Click(offlineSection);
		waitWebDriver(2000);
   }

   public void clickOnOfflineTagOnCourse(){
	   waitTillTheElementIsVisibleAndClickable(offlineTagOnCourse);
	   object_Click(offlineTagOnCourse);
	   waitWebDriver(2000);
   }

   public void clickOnShareOfflineCourse(){
		scrollToElement(shareButtonInOfflineCourse);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(2000);
	   waitTillTheElementIsVisibleAndClickable(shareButtonInOfflineCourse);
	   clickWithJavaScript(shareButtonInOfflineCourse);
	   waitWebDriver(2000);
   }

   public void clickOnWhatsAppShare(){
		waitTillTheElementIsVisibleAndClickable(whatsAppShareOption);
		object_Click(whatsAppShareOption);
		waitWebDriver(3000);
   }

	public void clickOnFacebookShare(){
		waitTillTheElementIsVisibleAndClickable(facebookShareOption);
		object_Click(facebookShareOption);
		waitWebDriver(3000);
	}

	public void clickOnTwitterShare(){
		waitTillTheElementIsVisibleAndClickable(twitterShareOption);
		object_Click(twitterShareOption);
		waitWebDriver(3000);
	}

	public void clickOnLinkedinShare(){
		waitTillTheElementIsVisibleAndClickable(linkedinShareOption);
		object_Click(linkedinShareOption);
		waitWebDriver(3000);
	}

	public void clickOnCopyLink(){
		waitTillTheElementIsVisibleAndClickable(copyLinkOption);
		object_Click(copyLinkOption);
		waitWebDriver(3000);
	}

	public void clickOnCloseOption(){
		waitTillTheElementIsVisibleAndClickable(crossButtonInSharePopup);
		object_Click(crossButtonInSharePopup);
		waitWebDriver(2000);
	}

	public void verifyWhatsAppShare(){
		clickOnWhatsAppShare();

		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();


		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();


			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				waitWebDriver(3000);
				// Assert.assertTrue(isElementPresent(landingPage.facebookPageText));
				waitWebDriver(3000);
				driver.close();
				waitWebDriver(4000);
			}
		}
		driver.switchTo().window(parent);

	}


	public void verifyFacebookShare(){
		clickOnFacebookShare();

		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();


		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();


			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				waitWebDriver(3000);
				// Assert.assertTrue(isElementPresent(landingPage.facebookPageText));
				waitWebDriver(3000);
				driver.close();
				waitWebDriver(4000);
			}
		}
		driver.switchTo().window(parent);

	}

	public void verifyTwitterShare(){
		clickOnTwitterShare();

		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();


		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();


			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				waitWebDriver(3000);
				// Assert.assertTrue(isElementPresent(landingPage.facebookPageText));
				waitWebDriver(3000);
				driver.close();
				waitWebDriver(4000);
			}
		}
		driver.switchTo().window(parent);

	}

	public void verifyLinkedInShare(){
		clickOnLinkedinShare();

		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();


		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();


			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				waitWebDriver(3000);
				// Assert.assertTrue(isElementPresent(landingPage.facebookPageText));
				waitWebDriver(3000);
				driver.close();
				waitWebDriver(4000);
			}
		}
		driver.switchTo().window(parent);

	}

	public void verifyCopyLinkInShare(){
		clickOnCopyLink();

		log.info("Link copied successfully");

	}

	public void clickOnOnlineSection(){
		waitTillTheElementIsVisibleAndClickable(onlineSection);
		object_Click(onlineSection);
		waitWebDriver(2000);
	}

	public void clickOnCompletedSection(){
		waitTillTheElementIsVisibleAndClickable(completedSection);
		clickWithJavaScript(completedSection);
		waitWebDriver(2000);
	}

	public void clickOnJoinedSection(){
		waitTillTheElementIsVisibleAndClickable(joinedSection);
		object_Click(joinedSection);
		waitWebDriver(2000);
	}

	public void clickOnApplicationsSection(){
		waitTillTheElementIsVisibleAndClickable(applicationsSection);
		object_Click(applicationsSection);
		waitWebDriver(2000);
	}

	public void clickOnMyOpportunities(){
		scrollToElement(myOpportunitiesSection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(myOpportunitiesSection);
		object_Click(myOpportunitiesSection);
		waitWebDriver(2000);
	}

	public void clickOnJobsSection(){
		waitTillTheElementIsVisibleAndClickable(JobExchangeSection);
		object_Click(JobExchangeSection);
		waitWebDriver(2000);
	}

	public void clickOnApprenticeshipSection(){
		waitTillTheElementIsVisibleAndClickable(apprenticeshipsSection);
		object_Click(apprenticeshipsSection);
		waitWebDriver(2000);
	}

	public void clickOnRecommendationsForYouSection(){
		waitTillTheElementIsVisibleAndClickable(recommendationsForYouSection);
		object_Click(recommendationsForYouSection);
		waitWebDriver(2000);
	}

	public void clickOnMyCredits(){
		scrollToElement(myCreditsSection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(myCreditsSection);
		object_Click(myCreditsSection);
		waitWebDriver(2000);
	}

	public void clickOnSummarySection(){
		scrollToElement(summarySection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(summarySection);
		object_Click(summarySection);
		waitWebDriver(2000);
	}

	public void clickOnViewDetailOfSkillCoursesUnderSummary(){
		waitTillTheElementIsVisibleAndClickable(viewDetailButton);
		object_Click(viewDetailButton);
		waitWebDriver(5000);
	}

	public void clickOnPMKVYFromDashboard(){
		scrollToElement(PMKVYSection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(PMKVYSection);
		object_Click(PMKVYSection);
		waitWebDriver(2000);
	}

	public void clickOnApplyButton(){
		waitTillTheElementIsVisibleAndClickable(applyBtn);
		object_Click(applyBtn);
		waitWebDriver(1000);
	}

	public void clickOnApplyNowButton(){
		waitTillTheElementIsVisibleAndClickable(applyNowBtn);
		object_Click(applyNowBtn);
		waitWebDriver(1000);
	}

	public void clickOnCompleteYourAadhaareKYCSection(){
		waitTillTheElementIsVisibleAndClickable(completeYourAadhaareKYCSectionInMyDashboard);
		clickWithJavaScript(completeYourAadhaareKYCSectionInMyDashboard);
		waitWebDriver(1000);
	}

	public void clickOneKYCOptionDropdown(){
		waitTillTheElementIsVisibleAndClickable(ekycDropdown);
		clickWithJavaScript(ekycDropdown);
		waitWebDriver(1000);
	}

	public void clickOnContinueButton(){
		waitTillTheElementIsVisibleAndClickable(continueButton);
		clickWithJavaScript(continueButton);
		waitWebDriver(1000);
	}


	public void clickOnByOTP(){
		waitTillTheElementIsVisibleAndClickable(byOTPOption);
		clickWithJavaScript(byOTPOption);
		waitWebDriver(1000);
	}

	public void clickOnAadhaarInputFieldandEnterAadhaarNumber(){
		waitTillTheElementIsVisibleAndClickable(aadhaarNumberInputField);
		object_Click(aadhaarNumberInputField);
		aadhaarNumberInputField.sendKeys("429143095252");
		waitWebDriver(2000);
	}

	public void clickOnCheckToSendOTPForAadhaarVerify(){
		waitTillTheElementIsVisibleAndClickable(checkBoxInAadhaar);
		clickWithJavaScript(checkBoxInAadhaar);
		waitWebDriver(1000);
	}

	public void clickOnGenerateOTPButton(){
		waitTillTheElementIsVisibleAndClickable(generateOTPButton);
		clickWithJavaScript(generateOTPButton);
		waitWebDriver(1000);
	}

	public void clickOnMySkillCourses(){
		waitWebDriver(1000);
		scrollToElement(mySkillCoursesSection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		clickWithJavaScript(mySkillCoursesSection);
		waitWebDriver(1000);
	}

	public void clickOnUpcomingSkillCourses(){
		waitWebDriver(1000);
		scrollToElement(upcomingSkillCoursesSection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		clickWithJavaScript(upcomingSkillCoursesSection);
		waitWebDriver(1000);
	}

	public void clickOnSliderOne(){
		waitWebDriver(1000);
		scrollToElement(viewAllBtnOption);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		clickWithJavaScript(sliderOne);
		waitWebDriver(1000);
	}

	public void scrollToViewCompletedCourses(){
		waitWebDriver(1000);
		scrollToElement(viewAllBtnOption);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
	}

	public void clickOnShareOnlineCourse(){
		waitWebDriver(2000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(shareOnlineCourseBtn);
		object_Click(shareOnlineCourseBtn);
		waitWebDriver(1000);
	}

	public void clickOnCourseSliderOne(){
		scrollToElement(courseSliderOne);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		object_Click(courseSliderOne);
	}

	public void clickOnGoToCourseBtn(){
		waitTillTheElementIsVisibleAndClickable(goToCourseBtn);
		object_Click(goToCourseBtn);
	}

	public void verifyOfflineTagBackgroundColor(){
		String color =offlineTag.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#042cb0";
		Assert.assertEquals(bc,expectedColor);
	}

	public void verifyOnlineTagBackgroundColor(){
		String color =onlineTagOnCourseDetailsPage.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#042cb0";
		Assert.assertEquals(bc,expectedColor);
	}

	public void verifyCompletedTagBackgroundColor(){
		String color =completedTagOnCourseDetailsPage.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#042cb0";
		Assert.assertEquals(bc,expectedColor);
	}

	public void clickOneShramOptionInDashboard(){
		scrollToElement(eShramOption);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(eShramOption);
		object_Click(eShramOption);
	}

	public void clickOnMyCourses(){
		waitTillTheElementIsVisibleAndClickable(myCoursesSectionInProfile);
		object_Click(myCoursesSectionInProfile);
	}

	public void clickOnMyCreditsInProfile(){
		waitTillTheElementIsVisibleAndClickable(myCreditsSectionInProfile);
		object_Click(myCreditsSectionInProfile);
	}




















}
