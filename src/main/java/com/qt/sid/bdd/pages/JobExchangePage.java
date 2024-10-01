package com.qt.sid.bdd.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qt.sid.bdd.utils.FileReaderManager;

public class JobExchangePage extends BasePage {

    public WebDriver driver;
    @FindBy(xpath = "//span[text()=' Job Exchange ']")
    private WebElement Jobsexchange;

    @FindBy(xpath = "//span[text()='Skill Centre']")
    private WebElement SkillCentre;

    @FindBy(xpath = "//a[@href='/scheme/list']")
    private WebElement PMKVY;
    
    @FindBy(xpath = "//*[text()=' Jobs ']")
    public WebElement jobsSection;
    
    @FindBy(xpath = "//*[text()=' Apprenticeships ']")
    public WebElement apprenticeshipsSection;

    @FindBy(xpath = "//*[text()=' Apprenticeship ' ]")
    public WebElement apprenticeshipTag;
    
    @FindBy(xpath = "//*[text()=' Below ₹5,000 ']")
    public WebElement below5k;

    @FindBy(xpath = "//*[text()=' ₹5,000 - ₹10,000 ']")
    public WebElement between5kTo10k;
    
    @FindBy(xpath = "//*[text()=' ₹10,000 - ₹15,000 ']")
    public WebElement between10To15k;
    
    @FindBy(xpath = "//*[text()=' ₹15,000+ ']")
    public WebElement above15K;
    
    @FindBy(xpath = "//button[@aria-label='Right Scroll']")
    public WebElement rightNavigation;
    
    @FindBy(id = "sector-search")
    public WebElement searchField;
    
    @FindBy(xpath = "//*[text()=' Apparel ']")
    public WebElement selAgricultureSector;

    @FindBy(xpath = "//*[text()=' Automotive ']")
    public WebElement selAutomotiveSector;

    @FindBy(xpath = "//*[text()=' Agriculture ']")
    public WebElement agricultureIndustry;
    
    @FindBy(xpath = "//div[@class='ng-tns-c59-6']")
    public WebElement searchIcon;
    
    @FindBy(xpath = "//div[@class='card']")
    public WebElement jobCardDetails;
    
    @FindBy(xpath = "//button[@aria-label='Left Scroll']")
    public WebElement leftNavigation;
    
    
   @FindBy(xpath = "//h5[text()='Job']")
   public WebElement assertJobCard;
   
   @FindBy(xpath = "//h5[text()=' Apprenticeship ']")
   public WebElement assertAppreticeShipCard;

   @FindBy(xpath = "//*[text()=' Industry ']")
   public WebElement industryFilter;

   @FindAll({
       @FindBy(xpath = "//*[text()=' Country ']"),
       //@FindBy(xpath = "//*[text()=' Location ']")
   })
   public WebElement locationFilter;
   
   @FindBy(id = "country-search")
   public WebElement countrysearch;
   
   @FindBy(xpath = "//*[text()=' India ']")
   public WebElement selIndia;
   
   @FindBy(xpath = "//p[text()=' AHMADABAD, GUJARAT ']")
   public WebElement assertSelectedLocationJobCard;

   @FindAll({
           @FindBy(xpath = "//button[text()=' RESET ']"),
           @FindBy(xpath = "//button[text()=' Reset ']"),
           @FindBy(xpath = "//button[text()=' RESET FILTER ']")
   })
   public WebElement resetBtn;
   
   @FindBy(xpath = "//a[text()='2']")
   public WebElement assertPage2;
   
   @FindBy(xpath = "//li[@class='page-item']")
   public WebElement assertNavigationIcon;

   @FindBy(xpath = "//button[text()=' Apply ']")
   public WebElement applyBtn;

   @FindBy(xpath = "(//button[@class='btn-share'])[1]")
   public WebElement shareIcon;

   @FindBy(xpath = "(//button[@title='Favorite'])[1]")
   public WebElement favoriteIcon;

   @FindBy(xpath = "(//*[@class='main-title'])[1]")
   public WebElement jobTitle;

   @FindBy(xpath = "(//*[@class='company-name'])[1]")
   public WebElement companyName;

   @FindBy(xpath = "(//*[@class='location'])[1]")
   public WebElement locationOnCard;

   @FindBy(xpath = "(//*[@class='management'])[1]")
   public WebElement jobType;

   @FindBy(xpath = "(//*[contains(text(),' Posted On')])[1]")
   public WebElement postedDateOnCard;

   @FindAll({
           @FindBy(xpath = "(//*[@class='price ng-star-inserted'])[1]"),
           @FindBy(xpath = "(//*[@class='price'])[1]")
   })
   public WebElement salaryOnCard;

   @FindBy(xpath = "(//button[text()=' View Details '])[1]")
   public WebElement viewDetailsButton;

   @FindBy(xpath = "(//*[text()='Job'])[1]")
   public WebElement jobTagOnCard;

   @FindBy(xpath = "//*[contains(text(),'Candidate Login & Register')]")
   public WebElement candidateRegisterPage;

   @FindBy(xpath = "//*[text()='Job Description']")
   public WebElement assertJobDescription;

   @FindBy(xpath = "//*[text()='Popular Job Exchange']")
   public WebElement popularJobExchange;

   @FindBy(xpath = "(//*[text()='Popular Job Exchange']//following::*[text()='Job'])[1]")
   public WebElement jobUnderPopular;

   @FindBy(xpath = "(//*[text()='Popular Job Exchange']//following::*[text()=' Apprenticeship '])[1]")
   public WebElement apprenticeshipUnderPopular;

   @FindBy(xpath = "(//*[text()='Popular Job Exchange']//following::*[text()=' View Details '])[1]")
   public WebElement viewDetailsUnderPopular;

   @FindBy(id="slick-slide-control342")
   public WebElement slider3;

   @FindBy(id="slick-slide-control352")
   public WebElement apprenticeSlider3;

   @FindBy(xpath = "//*[@class='social-btn']//button[2]")
   public WebElement shareOptionInsideViewDetails;

   @FindBy(xpath = "//*[text()=' Share this Job ']")
   public WebElement shareThisJobText;

   @FindBy(xpath = "//*[@class='social-btn']//button[3]")
   public WebElement favoriteOption;

   @FindBy(xpath = "//*[text()='Job has been added to your favourite list']")
   public WebElement jobAddedToFavoriteMsg;

   @FindBy(xpath = "//*[text()='Job has been removed from your favourite list']")
   public WebElement jobRemovedFromFavoriteMsg;

   @FindBy(xpath = "//button[text()=' Apply Now ']")
   public WebElement applyNowBtn;

   @FindBy(xpath = "//*[@title='NSDC JobX']")
   public WebElement NSDCLogo;

   @FindBy(xpath = "//*[text()=' Apply Now ']")
   public WebElement applyNowOnApprenticeshipPage;


   @FindBy(xpath = "//*[text()=' Kaushal Mahotsav ']")
   public WebElement kaushalMahotsavHeader;


   @FindBy(xpath = "//*[contains(text(),'Skill Centres in']")
   public WebElement skillCentreSection;

   @FindBy(xpath = "(//*[text()='Courses Offered']/following::button)[1]")
   public WebElement viewDetailsOfSkillCentre;

   @FindBy(xpath = "//*[@class='mat-dialog-title']")
   public WebElement skillCentreTitle;

   @FindBy(xpath = "//a[contains(@href,'mailto')]")
   public WebElement emailSection;

   @FindBy(xpath = "//*[@class='training-center-mobile']")
   public WebElement mobileNumberSection;

   @FindBy(xpath = "//*[text()=' Courses Offered ']")
   public WebElement coursesOfferedSection;

   @FindBy(xpath = "(//*[text()='Share Location'])[1]")
   public WebElement sendOption;

   @FindBy(xpath = "(//*[text()='Share Location'])[2]")
   public WebElement shareOption;

   @FindBy(xpath = "//*[text()='Close']")
   public WebElement closeBtn;

   @FindBy(xpath = "//*[contains(text(),'Job Exchange in')]")
   public WebElement jobExchangeSection;

   @FindAll({
           @FindBy(xpath = "(//button[text()=' View Details '])[1]"),
           @FindBy(xpath = "((//*[text()='Job'])[3]/following::button)[1]")
   })
   public WebElement viewDetailsOfJobExchange;

   @FindBy(xpath = "//*[@class='card-detail']")
   public List<WebElement> jobCards;

   @FindBy(xpath = "//*[text()=' Share this Opportunities ']")
   public WebElement jobSharePopupText;

   @FindBy(xpath = "//*[@class='title']//following::button[2]")
   public WebElement shareIconInPopularJob;

   @FindBy(xpath = "//*[@title='Close']")
   public WebElement closeIconInPopularJobSharepopup;

   @FindBy(xpath = "//*[@class='title']//following::button[3]")
   public WebElement favoriteIconInPopularJob;

   @FindBy(xpath = "(//*[text()='Popular Job Exchange']//following::button[text()=' View Details '])[1]")
   public WebElement viewDetailsOfPopularJob;


   @FindBy(xpath = "(//*[@class='dot-index-0'])[1]")
   public WebElement slider1;


   @FindBy(xpath = "//*[@class='p-0']")
   public List<WebElement> jobDescriptionDetails;

   @FindBy(xpath = "//*[text()='Functional Area']//following::h3[1]")
   public WebElement functionalAreaOfJob;

   @FindBy(xpath = "//*[text()='Qualification']//following::h3[1]")
   public WebElement qualificationForJob;

   @FindBy(xpath = "//*[text()='Language Preference']//following::h3[1]")
   public WebElement languagePreferenceForJob;

   @FindBy(xpath = "//*[text()='Contact Person Name']//following::h3[1]")
   public WebElement contactPersonanName;

   @FindBy(xpath = "//*[text()=' Contact Person Designation ']//following::h3[1]")
   public WebElement contactPersonanDesignation;

   @FindBy(xpath = "//*[text()='Mobile Number']//following::h3[1]")
   public WebElement mobileNumberOfContactPerson;

   @FindBy(xpath = "//*[text()='Email ID']//following::h3[1]")
   public WebElement emailIdOfContactPerson;

   @FindBy(xpath = "//*[text()='Job Exchange in Agriculture']")
   public WebElement jobExchangeForSelectedIndustry;

    @FindBy(xpath = "//*[text()='Job Exchange in Apparel']")
    public WebElement jobExchangeForApparelSelectedIndustry;

    @FindBy(xpath = "//*[text()=' Skill Centres in Apparel ']")
    public WebElement skillCentreForApparelSelectedIndustry;

    @FindBy(xpath = "//*[text()=' Skill Courses in Automotive ']")
    public WebElement skillCourseForAutomotiveSelectedIndustry;

   @FindBy(xpath = "//*[text()=' Skill Courses in Agriculture ']")
   public WebElement skillCoursesForSelectedIndustry;

   @FindBy(xpath = "//*[text()=' Skill Centres in Agriculture ']")
   public WebElement skillCentresForSelectedIndustry;

   @FindBy(xpath = " (//button[text()=' View All '])[1]")
   public WebElement viewAllBtn1;

    @FindBy(xpath = " (//button[text()=' View All '])[2]")
    public WebElement viewAllBtn2;
    @FindBy(xpath = " (//button[text()=' View All '])[3]")
    public WebElement viewAllBtn3;

   @FindBy(xpath = "//*[@class='slick-dots']//li")
   public List<WebElement> pageMovers;

   @FindBy(xpath = "(//*[contains(text(),' Skill Centres')]/following::button[@title='Favorite' ])[1]")
   public WebElement favoriteSectionOfSkillCentre;

   @FindBy(xpath = "//*[text()=' Share this Apprenticeship ']")
   public WebElement shareThisApprenticeshipTextInPopup;

   @FindBy(xpath = "//button[@title='Share Button']")
   public WebElement shareButtonInSkillCourse;

   @FindBy(xpath = "//*[text()=' Share this Course ']")
   public WebElement shareThisCoursePopupText;


   @FindBy(xpath = "//*[@class='dot-index-0']")
   public WebElement sliderOnPopularJobExchange;

   @FindBy(xpath = "(//*[text()='Popular Job Exchange']/following::button[@title='Favorite'])[1]")
   public WebElement shareOptionInApprenticeship;

   @FindBy(xpath = "//*[text()='Apprenticeship Description']")
   public WebElement apprenticeshipDescription;


   @FindBy(xpath = "//*[text()='Description ']")
   public WebElement descriptionOfApprenticeship;


   @FindBy(xpath = "//*[text()=' Functional Area ']/following::h3[1]")
   public WebElement functionalAreaOfApprenticeship;


   @FindBy(xpath = "//*[text()=' Qualification ']/following::h3[1]")
   public WebElement qualificationOfApprenticeship;


   @FindBy(xpath = "//*[text()=' Language ']/following::h3[1]")
   public WebElement languageOfApprenticeship;


   @FindBy(xpath = "//*[text()=' Contact Person Name ']/following::h3[1]")
   public WebElement contactPersonNameOfApprenticeship;


   @FindBy(xpath = "//*[text()=' Contact Person Designation ']/following::h3[1]")
   public WebElement contactPersonDesignationOfApprenticeship;


   @FindBy(xpath = "//*[text()=' Mobile Number ']/following::h3[1]")
   public WebElement mobileNumberOfApprenticeshipCP;


   @FindBy(xpath = "//*[text()=' Email ID ']/following::h3[1]")
   public WebElement emailIDOfApprenticeshipCP;





    public JobExchangePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String checkJobExchangepage() {
        return getTextOfObject(Jobsexchange);
    }
    public void clickSkillCentreLink() {
        waitTillTheElementIsVisibleAndClickable(SkillCentre);
        object_Click(SkillCentre);
    }
    public void clickPMKVYLink() {
        clickWithJavaScript(PMKVY);
    }
    
    public void clickOnJobExchange() {
    	waitTillTheElementIsVisibleAndClickable(Jobsexchange);
    	object_Click(Jobsexchange);
        waitWebDriver(3000);
    }
    
    public void clickOnApprenticeship() {
        waitWebDriver(2000);
    	waitTillTheElementIsVisibleAndClickable(apprenticeshipsSection);
    	object_Click(apprenticeshipsSection);
        waitWebDriver(2000);
    }
    
    public void visibilityOfApprenticeshipCards() {
    	waitTillTheElementIsVisibleAndClickable(assertAppreticeShipCard);
    }


    public void clickOnBelow5k() {
    	waitTillTheElementIsVisibleAndClickable(below5k);
    	object_Click(below5k);
        waitWebDriver(3000);
    }

    public void clickOnBetween5kTo10K() {
        waitTillTheElementIsVisibleAndClickable(between5kTo10k);
        object_Click(between5kTo10k);
        waitWebDriver(3000);
    }

    public void waitTillTheApprenticeshipCardsDisplay(){
        waitWebDriver(4000);
        waitTillTheElementIsVisibleAndClickable(apprenticeshipTag);
        waitWebDriver(2000);
    }
    
    public void clickOnBetween10to15K() {
    	waitTillTheElementIsVisibleAndClickable(between10To15k);
    	object_Click(between10To15k);
        waitWebDriver(3000);
    }
    
    public void clickOnAbove15k() {
        waitWebDriver(2000);
        clickOnRightNavigation();
        waitWebDriver(2000);
    	waitTillTheElementIsVisibleAndClickable(above15K);
    	object_Click(above15K);
        waitWebDriver(2000);
    }
    
    public void clickOnJobs() {
    	waitTillTheElementIsVisibleAndClickable(jobsSection);
    	object_Click(jobsSection);
    	waitWebDriver(2000);
    }
    
    public void clickOnRightNavigation() {
    	waitTillTheElementIsVisibleAndClickable(rightNavigation);
    	object_Click(rightNavigation);
    }
    
    public void clickOnLeftNavigation() {
    	waitTillTheElementIsVisibleAndClickable(leftNavigation);
    	object_Click(leftNavigation);
    }
    
    public void clickOnIndustrySearchField() {
    	waitTillTheElementIsVisibleAndClickable(searchField);
    	object_Click(searchField);
    	
    }

    public void clickOnAgricultureIndustryFilter(){
        waitTillTheElementIsVisibleAndClickable(agricultureIndustry);
        object_Click(agricultureIndustry);
        waitWebDriver(3000);
    }

    public void clickOnApparelIndustryFilter(){
        waitTillTheElementIsVisibleAndClickable(selAgricultureSector);
        object_Click(selAgricultureSector);
        waitWebDriver(3000);
    }

    public void clickOnAutomotiveIndustryFilter(){
        scrollToElement(selAutomotiveSector);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(selAutomotiveSector);
        object_Click(selAutomotiveSector);
        waitWebDriver(3000);
    }
    
    public void sendIndustryValueInSearchField() {
    	searchField.sendKeys(FileReaderManager.getInstance().getConfigReader().getIndustry());
    	waitTillTheElementIsVisibleAndClickable(selAgricultureSector);
    	object_Click(selAgricultureSector);
    }

    public void clickOnIndustryFilter(){
        waitTillTheElementIsVisibleAndClickable(industryFilter);
        clickWithJavaScript(industryFilter);
        waitWebDriver(2000);
    }


    public void clickOnLocationFilter() {
    	waitTillTheElementIsVisibleAndClickable(locationFilter);
    	clickWithJavaScript(locationFilter);
    }
    
    public void countrySearchField() {
    	scrollDown();
    	waitWebDriver(2000);
        scrollUp();
        waitWebDriver(1000);
    	waitTillTheElementIsVisibleAndClickable(countrysearch);
    	object_Click(countrysearch);
        countrysearch.sendKeys(FileReaderManager.getInstance().getConfigReader().getLocation());
    	waitWebDriver(5000);
    	waitTillTheElementIsVisibleAndClickable(selIndia);
    	object_Click(selIndia);
        waitWebDriver(200);
        object_Click(locationFilter);
        waitWebDriver(2000);
    }

    public void clickOnApplyBtn(){
        waitTillTheElementIsVisibleAndClickable(applyBtn);
        object_Click(applyBtn);
    }
    
    public void clickOnResetBtn() {
    	//scrollDown();
    	waitWebDriver(3000);
    	waitTillTheElementIsVisibleAndClickable(resetBtn);
    	clickWithJavaScript(resetBtn);
    }
    
    public void clickOnNextPageInPagination() {
    	scrollToElement(assertPage2);
    	waitWebDriver(1000);
    	scrollUp();
    	waitWebDriver(4000);
    	waitTillTheElementIsVisibleAndClickable(assertPage2);
    	object_Click(assertPage2);
    	isElementPresent(assertNavigationIcon);
    }

    public void clickOnViewDetailsOfApprenticeship(){
        waitTillTheElementIsVisibleAndClickable(viewDetailsButton);
        clickWithJavaScript(viewDetailsButton);
        waitWebDriver(2000);
    }

    public void clickOnViewDetailsOfJob(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(viewDetailsButton);
        clickWithJavaScript(viewDetailsButton);
        waitWebDriver(2000);
    }

    public void scrollToPopularJobExchangeSection(){
        waitWebDriver(2000);
        scrollToElement(popularJobExchange);
        waitWebDriver(2000);
    }
    public void clickOnViewDetailsOfJobUnderPopularSection(){
        waitTillTheElementIsVisibleAndClickable(viewDetailsButton);
        clickWithJavaScript(viewDetailsButton);
        waitWebDriver(2000);
    }

    public void clickOnPaginationInPopularSection(){
        waitWebDriver(1000);
        clickWithJavaScript(slider3);
        waitWebDriver(2000);
    }

    public void clickOnApprenticePaginationInPopularSection(){
        waitWebDriver(1000);
        clickWithJavaScript(apprenticeSlider3);
        waitWebDriver(2000);
    }

    public void clickOnShareOptionInJob(){
        waitTillTheElementIsVisibleAndClickable(shareOptionInsideViewDetails);
        object_Click(shareOptionInsideViewDetails);
        waitWebDriver(2000);
    }

    public void clickOnFavoriteOption(){
        waitTillTheElementIsVisibleAndClickable(favoriteOption);
        object_Click(favoriteOption);
        waitWebDriver(1000);
    }

    public void clickOnApplyNowButton(){
        waitTillTheElementIsVisibleAndClickable(applyNowBtn);
        object_Click(applyNowBtn);
        waitWebDriver(5000);
    }

    public void scrollTillSkillCentreSection(){
        waitWebDriver(2000);
        scrollToElement(skillCentreSection);
        waitWebDriver(3000);
    }

    public void clickOnViewDetailsOfSkillCentre(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(viewDetailsOfSkillCentre);
        clickWithJavaScript(viewDetailsOfSkillCentre);
        waitWebDriver(2000);
    }

    public void scrollTillJobExchangeSection(){
        waitWebDriver(2000);
        scrollToElement(jobExchangeSection);
        waitWebDriver(3000);
    }

    public void clickOnViewDetailsOfJobExchange(){
        waitTillTheElementIsVisibleAndClickable(viewDetailsOfJobExchange);
        object_Click(viewDetailsOfJobExchange);
        waitWebDriver(2000);
    }

    public void verifyColorOfResetButton(){
        String color =resetBtn.getCssValue("background-color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void clickOnShareOptionOnJobCard(){
        waitTillTheElementIsVisibleAndClickable(shareIcon);
        object_Click(shareIcon);
        waitWebDriver(2000);
    }

    public void clickOnFavoriteBtnofJob(){
        waitTillTheElementIsVisibleAndClickable(favoriteIcon);
        object_Click(favoriteIcon);
        waitWebDriver(2000);
    }

    public void clickOnShareOptionOfPopularJob(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(shareIcon);
        clickWithJavaScript(shareIcon);
        waitWebDriver(2000);
    }

    public void clickOnFavoriteOptionOfPopularJob(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(favoriteIconInPopularJob);
        object_Click(favoriteIconInPopularJob);
        waitWebDriver(2000);
    }

    public void clickOnCloseSharePopup(){
        waitTillTheElementIsVisibleAndClickable(closeIconInPopularJobSharepopup);
        object_Click(closeIconInPopularJobSharepopup);
        waitWebDriver(2000);
    }

    public void clickOnViewDetailsOfPopularJobCard(){
        waitTillTheElementIsVisibleAndClickable(viewDetailsOfPopularJob);
        object_Click(viewDetailsOfPopularJob);
        waitWebDriver(2000);
    }

    public void clickOnSliderOne(){
        object_Click(slider1);
        waitWebDriver(2000);
    }

    public void verifyJobExchangeSection(){
        waitWebDriver(2000);
        scrollToElement(jobExchangeForSelectedIndustry);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(3000);
    }

    public void verifyJobExchangeSectionForApparel(){
        waitWebDriver(2000);
        scrollToElement(jobExchangeForApparelSelectedIndustry);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(3000);
    }

    public void verifySkillCentreSectionForApparel(){
        waitWebDriver(2000);
        scrollToElement(skillCentreForApparelSelectedIndustry);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(3000);
    }

    public void verifySkillCourseSectionForAutomotive(){
        waitWebDriver(2000);
        scrollToElement(skillCourseForAutomotiveSelectedIndustry);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(3000);
    }

    public void verifySkillCoursesSection(){
        waitWebDriver(2000);
        scrollToElement(skillCoursesForSelectedIndustry);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(1000);
    }

    public void verifySkillCentresSection(){
        waitWebDriver(2000);
        scrollToElement(skillCentresForSelectedIndustry);
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(1000);
    }

    public void clickOnViewAllOfJobExchange(){
        waitTillTheElementIsVisibleAndClickable(viewAllBtn1);
        object_Click(viewAllBtn1);
        waitWebDriver(3000);
    }

    public void clickOnViewAllOfSkillCourse(){
        waitTillTheElementIsVisibleAndClickable(viewAllBtn2);
        object_Click(viewAllBtn2);
        waitWebDriver(3000);
    }
    public void clickOnViewAllOfSkillCentre(){
        waitTillTheElementIsVisibleAndClickable(viewAllBtn3);
        object_Click(viewAllBtn3);
        waitWebDriver(3000);
    }

    public void clickOnFirstPageMoverInJobExchange(){
        waitTillTheElementIsVisibleAndClickable(pageMovers.get(1));
        object_Click(pageMovers.get(1));
        waitWebDriver(3000);
    }

    public void clickOnFirstPageMoverInSkillCentre(){
        waitTillTheElementIsVisibleAndClickable(pageMovers.get(5));
        clickWithJavaScript(pageMovers.get(5));
        waitWebDriver(3000);
    }

    public void clickOnSecondPageMoverInJobExchange(){
        waitTillTheElementIsVisibleAndClickable(pageMovers.get(2));
        clickWithJavaScript(pageMovers.get(2));
        waitWebDriver(3000);
    }

    public void clickOnSecondPageMoverInSkillCentre(){
        waitTillTheElementIsVisibleAndClickable(pageMovers.get(6));
        clickWithJavaScript(pageMovers.get(6));
        waitWebDriver(3000);
    }

    public void clickOnFavoriteBtnOfSkillCentre(){
        waitTillTheElementIsVisibleAndClickable(favoriteSectionOfSkillCentre);
        object_Click(favoriteSectionOfSkillCentre);
        waitWebDriver(3000);
    }

    public void clickOnShareOptionInApprenticeship(){
        waitTillTheElementIsVisibleAndClickable(favoriteIcon);
        object_Click(favoriteIcon);
        waitWebDriver(3000);
    }

    public void clickOnShareOptionInSkillCourse(){
        waitTillTheElementIsVisibleAndClickable(shareButtonInSkillCourse);
        object_Click(shareButtonInSkillCourse);
        waitWebDriver(2000);
    }

    public void clickOnShareOptionInPopularJobExchange(){
        waitTillTheElementIsVisibleAndClickable(sliderOnPopularJobExchange);
        clickWithJavaScript(sliderOnPopularJobExchange);
        waitWebDriver(1000);
        scrollUp();
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(shareOptionInApprenticeship);
        clickWithJavaScript(shareOptionInApprenticeship);
        waitWebDriver(2000);
    }

    public void verifyApprenticeshipDescription(){
        scrollToElement(apprenticeshipDescription);
        waitTillTheElementIsVisibleAndClickable(apprenticeshipDescription);
        scrollDown();
        waitWebDriver(2000);
    }

    public void clickOnApplyNowOfApprenticeship(){

    }


    
}
