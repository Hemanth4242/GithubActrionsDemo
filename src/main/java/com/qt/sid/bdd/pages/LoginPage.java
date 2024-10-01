package com.qt.sid.bdd.pages;

import java.io.FileInputStream;
import java.util.List;

import gherkin.lexer.Es;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.sid.bdd.utils.FileReaderManager;
import org.testng.Assert;

public class LoginPage extends BasePage{

	public WebDriver driver;
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sh;

	@FindAll({
			@FindBy(xpath = "//button[text()=' Register ']" ),
			@FindBy(xpath = "//button[@title='Click to Register / Login']" )
	})
	public WebElement registerBtn;
	
	@FindBy(xpath = "//button[text()=' LOGIN ']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//h1[text()=' Welcome to Skill India Digital ']")
	public WebElement welcomeToSkillIndiaDigitalPopupText;

	@FindBy(xpath = "//*[@class='otp-filed']//input")
	public List<WebElement> otpField;

	@FindAll({
			@FindBy(xpath = "//h3[text()='Learner/Participant']"),
			@FindBy(xpath = "//h3[text()='Learner']")
	})
	public WebElement learnerRole;
	
	@FindBy(xpath = "//h3[text()='Partner']")
	public WebElement partnerRole;

	@FindBy(xpath = "//button[@title='Register']")
	public WebElement assertHomepage;


	@FindBy(xpath = "//*[contains(text(),'NSTI')]")
	public WebElement NSTIRole;
	@FindBy(xpath = "//*[contains(text(),'Apprenticeship SSC')]//following::button[1]")
	public WebElement ApprenticeshipSSCLoginBtn;

	@FindBy(xpath = "//*[contains(text(),'NSTI')]//following::button[1]")
	public WebElement NSTILoginBtn;

	@FindBy(xpath = "//*[contains(text(),'Apprenticeship SSC/AB')]")
	public WebElement ApprenticeshipSSCRole;

	@FindBy(xpath = "//*[contains(text(),'Admin')]")
	public WebElement NSDC_AdminRole;

	@FindBy(xpath = "//*[contains(text(),'RDSDE')]")
	public WebElement RDSDERole;
	
	@FindBy(xpath = "//h5[text()=' Let’s get started ']")
	public WebElement letsGetStartedInPopup;

	@FindBy(xpath = "//*[contains(@src,'skill-india-logo-register')]")
	public WebElement skillIndiaLogo;

	@FindBy(xpath = "//h3[text()='Welcome to Skill India Digital']")
	public WebElement WelcomeToSkillIndiaDigitalTextInMobileNumberPopup;

	@FindAll({
			@FindBy(xpath = "//*[text()=' Learner/Participant ']"),
			@FindBy(xpath = "//*[text()=' Learner ']")
	})
	public WebElement learnerRoleInMobNumPopup;

	@FindBy(xpath = "//*[contains(@class,'input-title ng-tns-c72')]")
	public WebElement flagAndCountryCode;
	
	@FindBy(id = "number")
	public WebElement mobileNumberEditField;
	
	@FindBy(xpath = "//*[text()='Mobile Number is ']")
	public WebElement mobNumMandatoryText;

	@FindAll({
			@FindBy(xpath = "//*[contains(text(),'Continue')]"),
			@FindBy(xpath = "//button[text()=' Continue ']")
	})
	public WebElement continueBtn;
	
	@FindBy(xpath = "//a[text()=' Terms & Conditions']")
	public WebElement termsAndConditionsLink;
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	public WebElement privacyPolicyLink;
	
	@FindBy(xpath = "//h3[text()='One Time Password (OTP)']")
	public WebElement OTPpageText;


	@FindBy(xpath = "//*[text()='Invalid mobile / request type / OTP']")
	public WebElement incorrectOTPErrorMessage;
	
	@FindBy(xpath = "//button[text()=' Edit ']")
	public WebElement editBtn;

	@FindBy(xpath = "//*[@alt='timer']")
	public WebElement timer;
	
	@FindBy(xpath = "//h3[text()=' Enter your Password ']")
	public WebElement enterYourPasswordText;

	@FindBy(xpath = "//*[text()='Incorrect Mobile Number or Password.']")
	public WebElement incorrectMobNumAndPasswordMsg;

	@FindAll({
			@FindBy(xpath = "//*[text()=' Forgot password ']"),
			@FindBy(xpath = "//span[text()=' Forgot password ']")
	})
	public WebElement forgotPasswordLink;
	
	@FindBy(id = "pin-0")
	public WebElement pinZero;
	
	@FindBy(id = "pin-1")
	public WebElement pinOne;
	
	@FindBy(id = "pin-2")
	public WebElement pinTwo;
	
	@FindBy(id = "pin-3")
	public WebElement pinThree;
	
	@FindBy(xpath = "(//button[text()=' LOGIN '])[2]")
	public WebElement loginBtnToLogin;
	
	@FindBy(xpath = "//a[text()=' My Dashboard ']")
	public WebElement myDashboardLink;


	@FindBy(xpath = "//button[normalize-space()='Skip']")
	public WebElement skipBtn;


	@FindBy(xpath = "//*[normalize-space()='Forgot password']/following::button")
	public WebElement loginButton;
	
	@FindBy(xpath = "(//span[@class='btn-text'])[4]")
	public WebElement profileSection;
	
	@FindBy(xpath = " //button[text()=' My Dashboard '] ")
	public WebElement profileMyDashboard;
	
	@FindBy(xpath = "//div[text()=' Settings ']")
	public WebElement settingsSection;
	
	@FindBy(xpath ="//span[text()='Manage Alerts']")
	public WebElement manageAlertsSection;
	
	@FindBy(xpath = "//button[text()=' Logout ']")
	public WebElement logoutBtn;

	@FindAll({
			@FindBy(xpath = "//h3[text()='Learner/Participant']"),
			@FindBy(xpath = "//h3[text()='Learner']"),
			@FindBy(xpath = "//div[@class='role-img']/img[@alt='Learner']")
	})
	private WebElement lernerLink;

	@FindBy(xpath = "//input[@id='number']")
	private WebElement mobileNumberTextfield;

	@FindBy(xpath = "//div[@class='pin-filed text-center text-md-start']/input")
	private List<WebElement> passwordTextField;

	@FindBy(xpath = "//button[@class='btn-primary-style1 ng-star-inserted']")
	private WebElement login;

	@FindBy(xpath = "//div[@class='role-img']/img[@alt='Partner']")
	private WebElement partnerLink;
	@FindBy(xpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//div[1]//div[2]//button[1]")
	public WebElement mobilizerLoginBtn;

	@FindBy(xpath = "//*[text()='Mobilizer']//following::button[1]")
	public WebElement mobilizerRegisterbtn;
	
	@FindBy(xpath = "//h3[text()='Learning Partner']")
	public WebElement assertLearningPartnerCard;
	
	@FindBy(xpath = "( //button[text()=' Login '])[1]")
	public WebElement partnerLoginBtn;

	@FindBy(xpath = "//h2[text()='Register As']")
	public WebElement registerAsText;

    @FindBy(xpath = "//*[text()=' Mobilizer ']")
    public WebElement mobilizerRole;
	@FindBy(xpath = "//h3[text()='Mobilizer']")
	public WebElement mobilizerRoleCard;

	@FindBy(xpath = "(//button[text()=' Register '])[1]")
	public WebElement learningPartnerRegisterbtn;

	@FindBy(xpath = "(//button[text()=' Register '])[2]")
	public WebElement mobilizerRegisterBtn;

	@FindBy(xpath = "//h3[text()=' Learning Partner ']")
	public WebElement assertSelectedLearningPartner;

	@FindBy(xpath = "//*[text()='Copy link to invite']")
	public WebElement copyLinkToInviteText;

	@FindBy(xpath = "//button[@title='Copy']")
	public WebElement copyLinkBtn;

	@FindBy(xpath = "//*[text()='Link has been copied to clipboard.']")
	public WebElement linkCopiedMessage;

	@FindBy(xpath = "//h3[text()='Overview']")
	public WebElement assertOverview;
	
	@FindBy(xpath = "(//span[@class='btn-text'])[3]")
	public WebElement partnerProfile;

	@FindBy(xpath = "//span[text()=' Terms & Conditions ']")
	public WebElement termsAndConditionsLinkInWelcomePopup;

	@FindBy(xpath = "//h1[text()=' Terms of Use & Disclaimer ']")
	public WebElement assertTermsAndConditionsPageText;

	@FindBy(xpath = "//span[text()=' Privacy Policy ']")
	public WebElement privacyPolicyLinkInWelcomePopup;

	@FindBy(xpath = "//h1[text()=' Privacy Policy ']")
	public WebElement assertPrivacyPolicyText;

	@FindAll({
			@FindBy(xpath = "//*[@aria-label='close']"),
			@FindBy(xpath = "(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[2]")
	})
	public WebElement closeBtnInWelcomePopup;

	@FindBy(xpath = "//button[text()=' Back ']")
	public WebElement backButtonInRegistrationPage;


	@FindBy(xpath = "//div[@class='role-card active']")
	public WebElement defaultRoleSelected;

	@FindAll({
			@FindBy(xpath = "//*[@class='close-button ng-star-inserted']"),
			@FindBy(xpath = "//mat-icon[text()='clear']")
	})
	public WebElement closeOptionInRegistrationPage;

	@FindBy(xpath = "//*[@class='pin-filed text-center text-md-start']")
	public WebElement fourDigitPasswordField;

	@FindBy(xpath = "(//button[@aria-label='Clear'])[4]")
	public WebElement clearMobileNumberBtn;

	@FindBy(xpath = "//*[text()='Mobile Number is ']//b[text()='required']")
	public WebElement mobileNumberRequiredMsg;

	@FindBy(xpath = "//*[text()='Mobile Number is ']//b[text()='not valid']")
	public WebElement mobileIsNotValidMsg;

	@FindBy(xpath = "//h6[text()=' Enter 6-digit code received on your mobile number ']")
	public WebElement enterSixDigitCodeText;

	@FindBy(xpath = "//*[contains(text(),'Trainer')]//following::button[1]")
    public WebElement trainerLogin;

	@FindBy(xpath ="//h3[text()=' Trainer ']")
	public WebElement trainerRoleInMobileNumberField;

	@FindBy(xpath = "//h1[text()='Session Overview']")
	public WebElement sessionOverviewSection;

	@FindAll({
            @FindBy(xpath = "//*[text()='Live training sessions']"),
			@FindBy(xpath = "//*[text()='Virtual Sessions']")
	})
	public WebElement virtualSessions;



	@FindBy(xpath = "//*[text()='Reviews & Ratings']")
	public WebElement reviewsAndRatings;


	@FindAll({
			@FindBy(xpath = "(//button[text()=' Login '])[4]"),
			@FindBy(xpath = "//*[contains(text(),'State')]//following::button[1]")
	})
	public WebElement stateUserLogin;

	@FindBy(xpath = "//h3[text()=' State ']")
	public WebElement stateUserRole;

	@FindBy(xpath = "//*[text()='Request for Correction']")
	public WebElement requestForCorrectionSection;

	@FindBy(xpath = "//*[text()='ITI Trainee Data Uploaded']")
	public WebElement ITITraineeDataUploadedSection;

	@FindBy(xpath = "//*[contains(text(),'Overview')]")
	public WebElement stateOverviewSection;

	@FindAll({
			@FindBy(xpath = "(//button[text()=' Login '])[8]"),
			@FindBy(xpath = "//*[contains(text(),'ITI')]//following::button[1]")
	})
	public WebElement ITIPersonaLogin;

	@FindBy(xpath = "//h3[text()=' ITI ']")
	public WebElement ITIRole;

	@FindBy(xpath = "//*[text()='Dashboard']")
	public WebElement dashboardSection;

	@FindBy(xpath = "//h2[contains(text(),'National Skill training Institute')]")
	public WebElement NSTILink;

	@FindBy(xpath = "//*[text()='ITI Trainee']")
	public WebElement ITITraineeSection;

	@FindBy(xpath = "//h2[text()='Overview']")
	public WebElement ITIOverviewSection;

	@FindBy(xpath = "//*[contains(text(),'Training Partner')]//following::button[1]")
	public WebElement trainingPartnerLoginBtn;

	@FindBy(xpath = "//h3[text()=' Training Partner ']")
	public WebElement trainingPartnerRole;

	@FindBy(xpath = "//a[text()=' Training Provider ']")
	public WebElement TrainingProviderLink;

	@FindBy(xpath = "//*[@alt='Training Partner']")
	public WebElement trainingPartnerIcon;

	@FindBy(xpath = "//*[@alt='Training Partner']//following::button[1]")
	public WebElement trainingPartnerEyeButton;

	@FindBy(xpath = "//*[text()='Build a skilled workforce through industry-relevant training.']")
	public WebElement aboutTP;


	@FindBy(xpath = "//button[text()=' Explore Now ']")
	public WebElement ExploreNowBtn;

	@FindBy(xpath = "//*[text()='Total no. of Training Center']")
	public WebElement totalNoOfTrainingCenter;

	@FindAll({
			@FindBy(xpath = "//*[text()='Total no. of Skilling Program']"),
			@FindBy(xpath = "//*[text()='Total no. of Schemes']"),
			@FindBy(xpath = "//*[text()='Skilling Program']")
	})
	public WebElement totalNoOfSchemes;

	@FindAll({
			@FindBy(xpath = "//*[text()='Batches']"),
			@FindBy(xpath = "//*[text()='Total no. of Batches']")
	})
	public WebElement totalNoOfBatches;

	@FindAll({
			@FindBy(xpath = "//*[text()='Candidates Trained']"),
			@FindBy(xpath = "//*[text()='Total no. of Candidates Trained']")
	})
	public WebElement totalNoOfCandidatesTrained;

	@FindAll({
			@FindBy(xpath = "//*[text()='Candidates Certified']"),
			@FindBy(xpath = "//*[text()='Total no. of Candidates Certified']")
	})
	public WebElement totalNoOfCandidatesCertified;


	@FindBy(xpath = "//*[contains(text(),'Training Centre')]//following::button[1]")
	public WebElement trainingCentreLoginBtn;

	@FindBy(xpath = "//*[@alt='Training Centre']")
	public WebElement trainingCentreIcon;

	@FindBy(xpath = "//*[@alt='Training Centre']//following::button[1]")
	public WebElement trainingCentreEyeButton;

	@FindBy(xpath = "//*[text()='Provide specialized facilities for comprehensive skill development.']")
	public WebElement aboutTC;

	@FindBy(xpath = "//h3[text()=' Training Centre ']")
	public WebElement trainingCentreRole;

	@FindBy(xpath = "//a[text()=' Training Centre ']")
	public WebElement TrainingCentreLink;


	@FindBy(xpath = "//*[contains(text(),'Awarding Body')]//following::button[1]")
	public WebElement awardingBodyLoginBtn;

	@FindBy(xpath = "//h3[text()=' Awarding Body ']")
	public WebElement awardingBodyRole;

	@FindBy(xpath = "//a[text()=' Awarding Body ']")
	public WebElement awardingBodyLink;

	@FindBy(xpath = "//*[text()='QP Created']")
	public WebElement QPCreated;

	@FindBy(xpath = "//*[text()='QP Approved']")
	public WebElement QPApproved;

	@FindBy(xpath = "//*[text()='NOSes Created']")
	public WebElement NOSesCreated;

	@FindBy(xpath = "//*[text()='NOSes Approved']")
	public WebElement NOSesApproved;


	@FindBy(xpath = "//*[text()='DGT Admin']//following::button[1]")
	public WebElement DGTAdminLoginBtn;

	@FindBy(xpath = "//h3[text()=' DGT Admin ']")
	public WebElement DGTAdminRole;

	@FindAll({
			@FindBy(xpath = "//*[text()='Apprenticeship Opportunities']"),
			@FindBy(xpath = "//*[text()=' Dashboard ']")
	})
	public WebElement apprenticeshipOpportunities;

	@FindAll({
			@FindBy(xpath = "//*[text()='Total Trainee Records Uploaded']"),
			@FindBy(xpath = "//*[text()='Total Trainee Uploaded']")
	})
	public WebElement totalTraineeUploaded;

	@FindAll({
			@FindBy(xpath = "//*[text()='Total Trainee Records Sent Back']"),
			@FindBy(xpath = "//*[text()='Total Trainee Sent back']")
	})
	public WebElement totalTraineeSentBack;


	@FindBy(xpath = "//*[text()='Total Invites Sent']")
	public WebElement totalInvitesSent;

	@FindBy(xpath = "//*[text()=' Overview ']")
	public WebElement overview;

	@FindBy(xpath = "//*[text()=' Complete your Aadhaar eKYC']")
	public WebElement completeYourAadhaarEkyc;

	@FindBy(xpath = "//*[text()='Total Trainees registered']")
	public WebElement totalTraineesRegistered;

	@FindBy(xpath = "//*[text()='Total Permanent Registration Number generated']")
	public WebElement totalPRNGenerated;


	@FindBy(xpath = "//*[text()='Nation']")
	public WebElement nationDropdown;

	@FindBy(xpath = "//*[contains(text(),'Assessor')]//following::button[1]")
	public WebElement assessorLoginBtn;

	@FindBy(xpath = "//h3[text()=' Assessor ']")
	public WebElement assessorRole;

	@FindBy(xpath = "//a[text()=' Assessor ']")
	public WebElement assessorLink;

	@FindBy(xpath = "//*[text()='Batches Assigned']")
	public WebElement batchesAssigned;

	@FindBy(xpath = "//*[text()='Batches Assessed']")
	public WebElement batchesAssessed;

	@FindBy(xpath = "//*[text()='Candidates Assessed']")
	public WebElement candidatesAssessed;

	@FindBy(xpath = "//*[text()='Candidates Certified']")
	public WebElement candidatesCertified;

	@FindBy(xpath = "//*[contains(text(),'Assessment Agency')]//following::button[1]")
	public WebElement assessmentAgencyLoginBtn;

	@FindBy(xpath = "//*[contains(text(),'RDSDE')]//following::button[1]")
	public WebElement RDSDELoginBtn;

	@FindBy(xpath = "//h3[text()=' Assessment Agency ']")
	public WebElement assessmentAgencyRole;

	@FindBy(xpath = "//a[text()=' Assessment Agency ']")
	public WebElement assessmentAgencyLink;


	@FindBy(xpath = "//*[contains(text(),'Basic Training Providers')]//following::button[1]")
	public WebElement BTPLoginBtn;


	@FindBy(xpath = "//h3[text()=' Basic Training Providers - BTP ']")
	public WebElement BTPRole;

	@FindBy(xpath = "//a[text()=' Basic Training Providers - BTP ']")
	public WebElement BTPLinkInDashboard;

	@FindBy(xpath = "//a[text()=' NSDC-Admin ']")
	public WebElement  NSDCAdminLinkInDashboard;

	@FindBy(xpath = "//*[contains(text(),'Dashboard is in progress')]")
	public WebElement dashboardIsInProgressHeader;

	@FindBy(xpath = "//a[text()=' Apprenticeship SSC/AB ']")
	public WebElement  ApprenticeshipSSCLinkInDashboard;

	@FindBy(xpath = "//a[text()=' Regional Directorate Skill Development Entrepreneurship - RDSDE ']")
	public WebElement RDSDELinkInDashboard;


   @FindBy(xpath = "//*[contains(text(),'TPA')]//following::button[1]")
   public WebElement TPALoginBtn;

   @FindBy(xpath = "//h3[text()=' TPA ']")
   public WebElement TPARole;

   @FindBy(xpath = "//a[text()=' TPA ']")
   public WebElement TPALinkInDashboard;


   @FindBy(xpath = "//*[contains(text(),'Establishment')]//following::button[1]")
   public WebElement EstablishmentLoginBtn;

	@FindBy(xpath = "//*[contains(text(),'NSDC Admin')]//following::button[1]")
	public WebElement nsdcAdminLoginBtn;

   @FindBy(xpath = "//h3[text()=' Establishment ']")
   public WebElement establishmentRole;

	@FindBy(xpath = "//h3[text()=' Admin ']")
	public WebElement adminRole;

   @FindBy(xpath = "//a[text()=' Establishment ']")
   public WebElement establishmentLinkInDashboard;

   @FindBy(xpath = "//*[text()=' Resend ']")
   public WebElement resendButton;

   @FindBy(xpath = "//*[text()='OTP has been sent successfully']")
   public WebElement OTPSentMessage;

   @FindBy(xpath = "//*[text()='Complete Mobiliser Registration']")
   public WebElement mobilizerRegistrationFormText;

   @FindBy(id = "bankName")
   public WebElement bankNameField;

   @FindBy(id = "BranchName")
   public WebElement branchNameField;

   @FindBy(xpath = "//*[@formcontrolname='AccountNumber']")
   public WebElement accountNumberField;

   @FindBy(id = "accountHolderName")
   public WebElement accountHolderNameField;

   @FindBy(xpath = "//*[@formcontrolname='IfscCode']")
   public WebElement ifscCodeField;

   @FindBy(xpath = "//*[@formcontrolname='Pan']")
   public WebElement panNumberField;

   @FindBy(xpath = "//*[@formcontrolname='State']")
   public WebElement stateDropdown;

   @FindBy(xpath = "//*[@formcontrolname='District']")
   public WebElement districtDropdown;

   @FindBy(xpath = "//*[text()='ANDHRA PRADESH']")
   public WebElement selectStateAndhra;

   @FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
   public WebElement selectDistrictFromDropdown;

   @FindBy(xpath = "//*[text()='Bank Name']")
   public WebElement bankNameIsRequiredErrorMessage;

   @FindBy(xpath = "//*[@alt='Learning Partner']")
   public WebElement LearningPartnerIcon;

   @FindBy(xpath = "//*[contains(@alt,'Learning Partner')]//following::*[@class='i-icon'][1]")
   public WebElement learningPartnerEyeIcon;

   @FindBy(xpath = "//*[text()='Share your expertise and services to empower communities and foster knowledge-sharing.']")
   public WebElement aboutLearningPartnerText;

   @FindBy(xpath = "//*[contains(text(),'Learning Partner')]//following::button[1]")
   public WebElement learningPartnerRegisterBtn;

   @FindBy(xpath = "//*[text()='Welcome to Skill India Digital']")
   public WebElement welcomeToSIDinPopup;

   @FindBy(xpath = "//*[text()=' Learning Partner ']")
   public WebElement learningPartnerRole;

   @FindBy(xpath = "//*[text()='Course Status']")
   public WebElement courseStatus;

   @FindBy(xpath = "//*[text()='Having Trouble?']")
   public WebElement havingTroubleSection;

   @FindBy(xpath = "//*[text()='faq']")
   public WebElement faqSection;

   @FindBy(xpath = "//*[text()='OTP has been sent successfully']")
   public WebElement otpSentMessage;

   @FindBy(xpath = "//*[normalize-space()='Awarding Body Registration Form']")
   public WebElement awardingBodyRegistrationFormHeaderText;


   @FindBy(xpath = "//button[@title='download']")
   public WebElement qrCode;

   @FindBy(xpath = "//button[normalize-space()='Refer QR Now']")
   public WebElement referQRNowButton;

   @FindBy(xpath = "//*[normalize-space()='Share this Mobilizer']")
   public WebElement shareThisMobilizerPopup;

   @FindBy(xpath = "//*[@title='Close']")
   public WebElement closeSharePopup;

   @FindBy(xpath = "//button[normalize-space()='Refer Now']")
   public WebElement referNowButton;

   @FindBy(xpath = "//*[text()='My Referrals']")
   public WebElement myReferralsSection;


   @FindBy(xpath = "//*[@class='sorting-btn']")
   public WebElement sortFilter;

   @FindBy(xpath = "//*[text()=' Register ']")
   public WebElement registerOptionInSortFilter;

   @FindBy(xpath = "//*[text()='Register']")
   public WebElement appliedRegisterInSort;

   @FindBy(xpath = "//button[normalize-space()='Reset']")
   public WebElement resetFilterButton;

   //Assessment

	@FindBy(xpath = "//button[text()='Take Test']")
	public WebElement takeTestButton;

	@FindBy(xpath = "//button[text()=' TAKE TEST ']")
	public WebElement takeTestMockButton;

	@FindBy(xpath = "//*[@class='ui card card__3Lra1']")
	public WebElement assessmentCard;


	@FindBy(xpath = "//*[text()='Start']")
	public WebElement assessmentStartButton;


	@FindBy(xpath = "//button[@aria-label='1 of 2']")
	public WebElement slider1;

	@FindBy(xpath = "(//button[text()=' join now '])[1]")
	public WebElement joinNowButton;

	@FindBy(xpath = "//button[text()='View All']")
	public WebElement viewAllButton;

	@FindBy(xpath = "(//a[text()='Start'])[2]")
	public WebElement startButton;

	@FindBy(xpath = "(//*[@role='radio'])[4]")
	public WebElement answerRadioBtn;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	public WebElement nextBtn;

	@FindBy(xpath = "//button[text()='Next Section']")
	public WebElement nextSectionBtn;

	@FindBy(xpath = "//button[text()='Finish']")
	public List<WebElement> finishBtn;


	@FindBy(xpath = "//button[text()='Go To Home']")
	public WebElement gotoHomeBtn;



	public LoginPage(WebDriver driver) {
		 this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegister() {
		object_Click(registerBtn);
	}

	public void homePageElementAssert() {
		getTextOfObject(assertHomepage);
	}


	public void selectLearnerRole() {
		waitTillTheElementIsVisibleAndClickable(learnerRole);
		object_Click(learnerRole);
	}
	
	public void selectPartnerRole() {
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(partnerRole);
		clickWithJavaScript(partnerRole);
	}

	public void clickOnNSTILoginBtn() {
		scrollToElement(NSTILoginBtn);
		waitWebDriver(2000);
		object_Click(NSTILoginBtn);
	}


	public void clickOnApprenticeshipSSCLoginBtn() {
		scrollToElement(ApprenticeshipSSCLoginBtn);
		waitWebDriver(2000);
		object_Click(ApprenticeshipSSCLoginBtn);
	}


	public void clickOnLearningPartnerRegisterBtn(){
		waitTillTheElementIsVisibleAndClickable(learningPartnerRegisterBtn);
		object_Click(learningPartnerRegisterBtn);
		waitWebDriver(2000);
	}
	public void clickOnMobileNumberEditField() {
		waitTillTheElementIsVisibleAndClickable(mobileNumberEditField);
		object_Click(mobileNumberEditField);
	}

	public void sendMobileNumberToNSTIRole() {
		mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithNSTIRole());
	}

	public void sendMobileNumberToApprenticeshipSSCRole() {
		mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithApprenticeshipSSCRole());
	}

	public void sendMobileNumberToNSDCAdminRole() {
		mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithNSDCAdminRole());
	}

	public void sendMobileNumberToTextFieldWithRDSDERole() {
		mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithRDSDE());
	}
	
	public void clickOnContinue() {

		object_Click(continueBtn);
		waitWebDriver(2000);
	}
	
	public void clickOnEdit() {
		waitTillTheElementIsVisibleAndClickable(editBtn);
		object_Click(editBtn);
	}
	
	public void clickLoginButton() {
		object_Click(loginBtn);
	}

	public void verifyLoginToolTip(){
		waitTillTheElementIsVisibleAndClickable(loginBtn);
		Actions ac = new Actions(driver);
		ac.moveToElement(loginBtn).build().perform();
		WebElement toolTip = driver.findElement(By.xpath("//button[@title='LOGIN']"));

		String toolTIP = toolTip.getText();

		log.info(toolTIP);

		if(toolTIP.equalsIgnoreCase("LOGIN")){
			log.info("Testcase passed");
		}else{
			log.info("Testcase failed");
		}
	}
	
	public void clickOnLogin() {
		waitTillTheElementIsVisibleAndClickable(loginBtnToLogin);
		object_Click(loginBtnToLogin);
		waitWebDriver(3000);
	}

	public void clickOnSkip(){
		waitTillTheElementIsVisibleAndClickable(skipBtn);
		object_Click(skipBtn);
		waitWebDriver(3000);
	}
	public void clickOnForgotPasswordLink(){
		waitTillTheElementIsVisibleAndClickable(forgotPasswordLink);
		object_Click(forgotPasswordLink);
		waitWebDriver(2000);
	}
	public void visibilityOfMyDashboard() {
		waitTillTheElementIsVisibleAndClickable(myDashboardLink);
	}
	
	public void clickOnProfile() {
		waitWebDriver(3000);
		waitTillTheElementIsVisibleAndClickable(profileSection);
		object_Click(profileSection);
	}
	
	public void clickOnPartnerProfile() {
		waitTillTheElementIsVisibleAndClickable(partnerProfile);
		object_Click(partnerProfile);
	}
	
	public void clickOnMyDashboard() {
		waitTillTheElementIsVisibleAndClickable(profileMyDashboard);
		object_Click(profileMyDashboard);
	}
	
	public void clickOnLogout() {
		waitTillTheElementIsVisibleAndClickable(logoutBtn);
		object_Click(logoutBtn);
		waitWebDriver(3000);
	}

	public void clickOnExploreNowBtn(){
		scrollToElement(ExploreNowBtn);
		waitWebDriver(2000);
		clickWithJavaScript(ExploreNowBtn);
		waitWebDriver(6000);
	}
	public void sendMobileNumberToTextField() {
	    mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithLearner());
	 }

	 public void sendRegisteredMobilizerNumber(){
		waitWebDriver(2000);
		mobileNumberTextfield.sendKeys("8904449622");
		waitWebDriver(1000);
	 }

	public void sendRegisteredMobileNumberWithouteKYC(){
		waitWebDriver(2000);
		mobileNumberTextfield.sendKeys("8431705744");
		waitWebDriver(1000);
	}

	public void sendLearningPartnerMobileNumberToTextField() {
		mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForLoginWithLearningPartner());
	}

	public void sendMobileNumberForEdit() {
	    mobileNumberEditField.sendKeys(FileReaderManager.getInstance().getConfigReader().getMobileNumberForEditBtnVerify());
	}

	public void sendMobileNumberForTPRegister(){
		mobileNumberEditField.sendKeys("7406893211");
	}

	public void sendMobileNumber() {
		mobileNumberEditField.sendKeys("9591429465");
	}

	public void sendInvalidMobileNumber(){
		mobileNumberEditField.sendKeys("91485");
		waitWebDriver(3000);
	}

	public void enterPasswordValues() {
		pinZero.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinZero());
		pinOne.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinOne());
		pinTwo.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinTwo());
		pinThree.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinThree());
	}

	public void verifyTheColorOfLoginButton(){
		String color =loginBtnToLogin.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#e86800";
		Assert.assertEquals(bc,expectedColor);
	}

	public void enterPasswordValuesForAssessor() {
		pinZero.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinNine());
		pinOne.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinEight());
		pinTwo.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinSeven());
		pinThree.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinSix());
	}

	public void enterPasswordValuesForTC() {
		pinZero.sendKeys(FileReaderManager.getInstance().getConfigReader().getZeroPinNumber());
		pinOne.sendKeys(FileReaderManager.getInstance().getConfigReader().getZeroPinNumber());
		pinTwo.sendKeys(FileReaderManager.getInstance().getConfigReader().getZeroPinNumber());
		pinThree.sendKeys(FileReaderManager.getInstance().getConfigReader().getZeroPinNumber());
	}

	public void enterPasswordValuesForEstablishment() {
		waitWebDriver(2000);
		pinZero.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinZero());
		pinOne.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinNine());
		pinTwo.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinNine());
		pinThree.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinOne());
		waitWebDriver(2000);
	}

	public void enterPasswordValuesForLearningPartner() {
		waitWebDriver(2000);
		pinZero.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinZero());
		pinOne.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinZero());
		pinTwo.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinZero());
		pinThree.sendKeys(FileReaderManager.getInstance().getConfigReader().getPinZero());
	}
	
	public void visibilityOfSettingsSection() {
		
		waitWebDriver(3000);
		scrollToElement(settingsSection);
		waitWebDriver(2000);
		scrollToElement(settingsSection);
		waitTillTheElementIsVisibleAndClickable(settingsSection);
	}
	public void logoinAppAsLerner(WebDriver driver, String mobilenumber,String password ){
		object_Click(loginBtn);
		object_Click(lernerLink);
		waitTillTheElementIsVisibleAndClickable(mobileNumberTextfield);
		mobileNumberTextfield.sendKeys(mobilenumber);
		clickWithJavaScript(continueBtn);
		for(WebElement element : passwordTextField){
			element.sendKeys(password);
			int x = Integer.parseInt(password);
			x++;
			password = String.valueOf(x);
		}
		object_Click(login);
		waitWebDriver(3000);
	}

	public void logoinAppAsMobilizer( String mobilenumber,String password ){
		loginBtn.click();
		partnerLink.click();
		mobilizerLoginBtn.click();
		mobileNumberTextfield.sendKeys(mobilenumber);
		continueBtn.click();
		for(WebElement element : passwordTextField){
			element.sendKeys(password);
			int x = Integer.parseInt(password);
			x++;
			password = String.valueOf(x);
		}
		login.click();
	}
	
	
	public void clickOnLearningPartnerLoginBtn() {
		object_Click(partnerLoginBtn);
	}

	public void clickOnTrainerLoginBtn() {
		object_Click(trainerLogin);
	}

	public void clickOnStateUserLoginBtn() {
		waitWebDriver(2000);
		clickWithJavaScript(stateUserLogin);
		waitWebDriver(2000);
	}

	public void clickOnITILoginBtn() {
		waitWebDriver(2000);
		object_Click(ITIPersonaLogin);
		waitWebDriver(2000);
	}

	public void clickOnDGTAdminLoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(DGTAdminLoginBtn);
		waitWebDriver(3000);
		object_Click(DGTAdminLoginBtn);
	}

	public void clickOnAssessorLoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(assessorLoginBtn);
		waitWebDriver(3000);
		object_Click(assessorLoginBtn);
	}

	public void clickOnAssessmentAgencyLoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(assessmentAgencyLoginBtn);
		waitWebDriver(3000);
		object_Click(assessmentAgencyLoginBtn);
	}

	public void clickOnRDSDELoginBtn() {
		scrollToElement(RDSDELoginBtn);
		waitWebDriver(2000);
		object_Click(RDSDELoginBtn);
	}

	public void clickOnBTPLoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(BTPLoginBtn);
		waitWebDriver(3000);
		object_Click(BTPLoginBtn);
	}

	public void clickOnTPALoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(TPALoginBtn);
		waitWebDriver(3000);
		object_Click(TPALoginBtn);
	}

	public void clickOnEstablishmentLoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(EstablishmentLoginBtn);
		waitWebDriver(3000);
		object_Click(EstablishmentLoginBtn);
	}

	public void clickOnNSDCAdminLoginBtn() {
		scrollDown();
		waitWebDriver(2000);
		scrollToElement(nsdcAdminLoginBtn);
		waitWebDriver(3000);
		object_Click(nsdcAdminLoginBtn);
	}



	public void clickOnTrainingPartnerLoginBtn() {
		scrollToElement(trainingPartnerLoginBtn);
		waitWebDriver(2000);
		object_Click(trainingPartnerLoginBtn);
	}

	public void clickOnTrainingCentreLoginBtn() {
		scrollToElement(trainingCentreLoginBtn);
		waitWebDriver(2000);
		object_Click(trainingCentreLoginBtn);
	}

	public void clickOnAwardingBodyLoginBtn() {
		scrollToElement(awardingBodyLoginBtn);
		waitWebDriver(2000);
		object_Click(awardingBodyLoginBtn);
	}
	public void clickOnTermsAndConditionsLinkInWelcomePopup(){object_Click(termsAndConditionsLinkInWelcomePopup);}

	public void clickOnPrivacyPolicyLinkInWelcomePopup(){object_Click(privacyPolicyLinkInWelcomePopup);}

	public void clickOnCloseButtonInWelcomePopup(){object_Click(closeBtnInWelcomePopup);}

	public void clickOnBackButtonHyperlink(){
		waitWebDriver(2000);
		clickWithJavaScript(backButtonInRegistrationPage);
	}

	public void clickOnCloseOptionInRegistrationField(){object_Click(closeOptionInRegistrationPage);}

	public void clickOnTermsAndConditionsLinkFromRegistrationPage(){object_Click(termsAndConditionsLink);}

	public void clickOnPrivacyPolicyLinkFromRegistrationPage(){object_Click(privacyPolicyLink);}

	public void clickOnClearMobileNumber(){
		waitTillTheElementIsVisibleAndClickable(clearMobileNumberBtn);
		object_Click(clearMobileNumberBtn);
	}

	public void clickOnLearningPartnerRegister(){
		waitTillTheElementIsVisibleAndClickable(learningPartnerRegisterbtn);
		clickWithJavaScript(learningPartnerRegisterbtn);
	}

	public void clickOnMobilizerRegister(){
		waitTillTheElementIsVisibleAndClickable(mobilizerRegisterBtn);
		clickWithJavaScript(mobilizerRegisterBtn);
	}

	public void verifyContinueButtonColor(){
		String color =continueBtn.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#df6e12";
		Assert.assertEquals(bc,expectedColor);

		String fontColor =continueBtn.getCssValue("color");
		String fc =Color.fromString(fontColor).asHex();
		String ec ="#ffffff";
		Assert.assertEquals(fc,ec);

	}


	public void verifyLoginButtonColor(){
		String color =loginBtn.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#000000";
		Assert.assertEquals(bc,expectedColor);

		String fontColor =loginBtn.getCssValue("color");
		String fc =Color.fromString(fontColor).asHex();
		String ec ="#df6e12";
		Assert.assertEquals(fc,ec);

	}

	public void enterInvalidOTP(){
		otpField.get(0).sendKeys("1");
		otpField.get(1).sendKeys("1");
		otpField.get(2).sendKeys("1");
		otpField.get(3).sendKeys("1");
		otpField.get(4).sendKeys("1");
		otpField.get(5).sendKeys("1");
	}

	public void clickOnResendButton(){
		waitTillTheElementIsVisibleAndClickable(resendButton);
		object_Click(resendButton);
	}

	public void clickOnCopyLinkButton(){
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(copyLinkBtn);
		object_Click(copyLinkBtn);
		waitWebDriver(1000);
	}

	public void clickAndEnterBankName(){
		waitTillTheElementIsVisibleAndClickable(bankNameField);
		object_Click(bankNameField);
		waitWebDriver(1000);
		bankNameField.sendKeys("XYZ");
		waitWebDriver(2000);
	}

	public void clickAndEnterBranchName(){
		waitTillTheElementIsVisibleAndClickable(branchNameField);
		object_Click(branchNameField);
		waitWebDriver(1000);
		branchNameField.sendKeys("CBPur");
		waitWebDriver(2000);
	}

	public void clickAndEnterAccountNumber(){
		waitTillTheElementIsVisibleAndClickable(accountNumberField);
		object_Click(accountNumberField);
		waitWebDriver(1000);
		accountNumberField.sendKeys("123456789");
		waitWebDriver(2000);
	}

	public void clickAndEnterAccountHolderName(){
		waitTillTheElementIsVisibleAndClickable(accountHolderNameField);
		object_Click(accountHolderNameField);
		waitWebDriver(1000);
		accountHolderNameField.sendKeys("Manjunath");
		waitWebDriver(2000);
	}

	public void scrollTillTheStateDropdown(){
		waitWebDriver(2000);
		scrollToElement(stateDropdown);
		waitWebDriver(1000);
		scrollDown();
		waitWebDriver(2000);
	}

	public void clickAndEnterIFSCCode(){
		waitTillTheElementIsVisibleAndClickable(ifscCodeField);
		object_Click(ifscCodeField);
		waitWebDriver(1000);
		ifscCodeField.sendKeys("SBIN0007908");
		waitWebDriver(2000);
	}

	public void clickAndEnterPAN(){
		waitTillTheElementIsVisibleAndClickable(panNumberField);
		object_Click(panNumberField);
		waitWebDriver(1000);
		panNumberField.sendKeys("CDBPM4733N");
		waitWebDriver(2000);
	}
	public void clickOnBranchNameAndBankName(){
		waitTillTheElementIsVisibleAndClickable(bankNameField);
		object_Click(bankNameField);
		waitWebDriver(1000);
		waitTillTheElementIsVisibleAndClickable(branchNameField);
		object_Click(branchNameField);
		waitWebDriver(1000);
	}

	public void clickOnStateDropdown(){
		waitTillTheElementIsVisibleAndClickable(stateDropdown);
		object_Click(stateDropdown);
		waitWebDriver(2000);
	}

	public void selectAndhraState(){
		waitTillTheElementIsVisibleAndClickable(selectStateAndhra);
		object_Click(selectStateAndhra);
		waitWebDriver(2000);
	}

	public void clickOnDistrictDropdown(){
		waitTillTheElementIsVisibleAndClickable(districtDropdown);
		object_Click(districtDropdown);
		waitWebDriver(2000);
	}

	public void selectDistrict(){
		waitTillTheElementIsVisibleAndClickable(selectDistrictFromDropdown);
		object_Click(selectDistrictFromDropdown);
		waitWebDriver(2000);
	}



	public void sendMobileNumberToTextFieldload(String us) {
		mobileNumberEditField.sendKeys(us);
	}

	public void clickOnResendOTPButton(){
		waitWebDriver(30000);

		waitWebDriver(30000);

		waitWebDriver(30000);

		waitWebDriver(5000);

		waitTillTheElementIsVisibleAndClickable(resendButton);
		object_Click(resendButton);
		waitWebDriver(2000);
	}

	public void verifyBackgroundColorOfLoginButton(){
		waitWebDriver(2000);
		String color =loginButton.getCssValue("background-color");
		String bc = Color.fromString(color).asHex();
		String expectedColor="#e86800";
		Assert.assertEquals(bc,expectedColor);
	}

	public void clickOnDownloadQRCode(){
		waitTillTheElementIsVisibleAndClickable(qrCode);
		object_Click(qrCode);
		waitWebDriver(2000);
	}

	public void clickOnReferQRCodeButton(){
		waitTillTheElementIsVisibleAndClickable(referQRNowButton);
		object_Click(referQRNowButton);
		waitWebDriver(2000);
	}

	public void clickOnReferNowButton(){
		waitTillTheElementIsVisibleAndClickable(referNowButton);
		object_Click(referNowButton);
		waitWebDriver(2000);
	}

	public void clickOnCloseSharePopup(){
		waitTillTheElementIsVisibleAndClickable(closeSharePopup);
		object_Click(closeSharePopup);
		waitWebDriver(2000);
	}

	public void verifyMyReferalsInMobilizerDashboard(){
		scrollToElement(myReferralsSection);
		waitWebDriver(1000);
		scrollUp();
		waitWebDriver(1000);
	}

	public void clickOnSortFilter(){
		waitTillTheElementIsVisibleAndClickable(sortFilter);
		object_Click(sortFilter);
		waitWebDriver(2000);
	}

	public void selectRegisterOptionFromDropdown(){
		waitTillTheElementIsVisibleAndClickable(registerOptionInSortFilter);
		object_Click(registerOptionInSortFilter);
		waitWebDriver(2000);
	}

	public void clickOnResetFilter(){
		waitTillTheElementIsVisibleAndClickable(resetFilterButton);
		object_Click(resetFilterButton);
		waitWebDriver(2000);
	}

	//Assessment

	public void clickOnTakeTest(){
		waitTillTheElementIsVisibleAndClickable(takeTestButton);
		object_Click(takeTestButton);
		waitWebDriver(2000);
	}

	public void clickOnTakeTestAssessmentButton(){
		waitTillTheElementIsVisibleAndClickable(takeTestMockButton);
		object_Click(takeTestMockButton);
		waitWebDriver(2000);
	}

	public void clickOnSliderOne(){
		waitTillTheElementIsVisibleAndClickable(slider1);
		object_Click(slider1);

	}

	public void clickOnJoinNowBtn(){
		waitTillTheElementIsVisibleAndClickable(joinNowButton);
		object_Click(joinNowButton);
		waitWebDriver(2000);
	}

	public void clickOnViewAllBtn(){
		waitTillTheElementIsVisibleAndClickable(viewAllButton);
		object_Click(viewAllButton);
		waitWebDriver(2000);
	}

	public void clickOnStartBtn(){
		scrollToElement(startButton);
		waitWebDriver(2000);
		waitTillTheElementIsVisibleAndClickable(startButton);
		object_Click(startButton);
		waitWebDriver(2000);
	}

	public void clickOnAnswerRadioBtn(){
		waitTillTheElementIsVisibleAndClickable(answerRadioBtn);
		object_Click(answerRadioBtn);
		waitWebDriver(2000);
	}

	public void clickOnNextBtn(){
		waitTillTheElementIsVisibleAndClickable(nextBtn);
		object_Click(nextBtn);
		waitWebDriver(2000);
	}

	public void clickOnNextSectionBtn(){
		waitTillTheElementIsVisibleAndClickable(nextSectionBtn);
		object_Click(nextSectionBtn);
		waitWebDriver(2000);
	}

	public void clickOnFinishBtn(){
		waitTillTheElementIsVisibleAndClickable(finishBtn.get(0));
		object_Click(finishBtn.get(0));
		waitWebDriver(2000);
	}

	public void clickOnFinish2Btn(){
		waitTillTheElementIsVisibleAndClickable(finishBtn.get(1));
		object_Click(finishBtn.get(1));
		waitWebDriver(2000);
	}


}
