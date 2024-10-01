package com.qt.sid.bdd.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;


public class SchemesPage extends BasePage{

    public WebDriver driver;

    @FindAll({
            @FindBy(xpath = "//a[text()=' Skilling Program ']"),
            @FindBy(xpath = "//h1[text()=' Schemes ']"),
            @FindBy(xpath = "//a[text()=' Schemes ']")
    })
    private WebElement Schemes;

    @FindBy(xpath = "//span[text()='PMKVY']/parent::button")
    public WebElement PMKVYBtn;


    @FindBy(xpath = "//button[normalize-space()='Analytics Dashboard']")
    private WebElement analiticDashboardTab;

    @FindBy(xpath = "//button[text()=' Dashboard ']")
    public WebElement dashboardUnderPMKVY;

    @FindBy(xpath = "//a[text()='eBooks']")
    private WebElement eBooks;

    @FindBy(xpath = "(//*[name()='svg']//*[@class='tileContentContainer'])[3]")
    private WebElement overviewTab;

    @FindBy(xpath = "(//*[name()='path'][@class='fill ui-role-button-fill sub-selectable'])[4]")
    private WebElement candidatesTab;

    @FindBy(xpath = "(//*[name()='path'][@class='fill ui-role-button-fill sub-selectable'])[5]")
    private WebElement batchesTab;

    @FindBy(xpath = "(//*[name()='path'][@class='fill ui-role-button-fill sub-selectable'])[6]")
    private WebElement trainingCentreTab;


    @FindAll({
            @FindBy(xpath = "//button[text()=' All Skilling Program ']"),
            @FindBy(xpath = "//button[text()=' All Schemes ']"),
    })
    public WebElement allSchemesBtn;

    @FindBy(xpath = "//button[text()=' Register ']")
    public WebElement registerOptionInSchemes;

    @FindBy(xpath = "//button[text()=' Courses ']")
    public WebElement coursesOptionInSchemes;

    @FindBy(xpath = "//button[text()=' Centres ']")
    public WebElement centresOptionInSchemes;

    @FindBy(xpath = "//button[text()=' Books ']")
    public WebElement booksOptionInSchemes;

    @FindBy(xpath = "//button[text()=' Analytics Dashboard ']")
    public WebElement analyticsDashboardOptionInSchemes;

    
    @FindBy(xpath = "//a[text()=' Skilling Program ']")
    public WebElement schemesPageText;
    
    @FindBy(xpath = "(//div[@class='schemes-cards-block'])[1]")
    public WebElement schemeCard;
    
    @FindBy(xpath = "//button[text()=' Apply Now ']")
    public WebElement applyNowBtn;
    
    @FindBy(xpath = "//h2[text()='Job Role in PMKVY Scheme']")
    public WebElement jobRoleText;
    
    @FindBy(xpath = "//button[text()=' View All ']")
    public WebElement viewAllBtn;
    
    @FindBy(xpath = "//h1[text()='Courses']")
    public WebElement coursePageText;
    
    @FindBy(xpath = "//button[text()=' Books ']")
    public WebElement booksBtn;
    
    @FindBy(xpath = "//a[text()='Learning Resources']")
    public WebElement learningResourcesPageText;
    
    @FindBy(id = "searchContent")
    public WebElement searchField;
    
    @FindBy(xpath = "//mat-panel-title[text()=' Content Type ']")
    public WebElement contentTypeFilter;

    @FindAll({
            @FindBy(xpath = "//*[text()=' VIDEO ']"),
            @FindBy(xpath = "//span[text()='Video']")
    })
    public WebElement videoContentType;

    @FindAll({
            @FindBy(xpath = "//*[text()=' PDF ']"),
            @FindBy(xpath = "//span[text()='Pdf']")
    })
    public WebElement pdfContentType;
    
    @FindBy(xpath = "//mat-panel-title[text()=' Content Category ']")
    public WebElement contentCategoryFilter;
    
    @FindBy(xpath = "//*[text()=' Language ']")
    public WebElement languageFilter;
    
    @FindBy(xpath = "//span[text()='English']")
    public WebElement englishLanguage;
    
    @FindBy(xpath = "//button[text()=' RESET  ']")
    public WebElement resetBtn;
    
    @FindBy(xpath = "(//div[@class='skill-course-card-v2'])[1]")
    public WebElement learningResourceCard;
    
    @FindBy(xpath = "//button[text()=' Download ']")
    public WebElement downloadBtn;
    
    @FindBy(xpath = "//button[@title='Share']")
    public WebElement shareBtn;
    
    @FindBy(xpath = "//h1[text()=' Share this Content ']")
    public WebElement shareThisContentText;
    
    @FindBy(xpath = "//*[@aria-label='whatsapp']")
    public WebElement whatsappLink;
    
    @FindBy(xpath = "//*[@aria-label='facebook']")
    public WebElement facebookLink;
    
    @FindBy(xpath = "//*[@aria-label='twitter']")
    public WebElement twitterLink;
    
    @FindBy(xpath = "//*[@aria-label='linkedin']")
    public WebElement linkedInLink;
    
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-link']")
    public WebElement shareLink;

    @FindBy(xpath = "//div[@class='schemes-cards-block']//button[text()=' Apply ']")
    public WebElement applyBtn;


    @FindAll({
            @FindBy(xpath="//h2[@title='Pradhan Mantri Kaushal Vikas Yojna']/following::h4[text()='Special Projects']"),
            @FindBy(xpath = "//h2[text()=' Pradhan Mantri Kaushal Vikas Yojna ']")
    })
    public WebElement schemeOption;

    @FindBy(xpath = "//*[@title='Search schemes']")
    public WebElement searchSchemesOption;


    @FindBy(xpath="//button[normalize-space(text())='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//*[@title='Pradhan Mantri Kaushal Vikas Yojna']")
    public WebElement selectPradhanMantriKaushalVikasYojna;

    @FindAll({
            @FindBy(xpath = "//div[@class='skill-course-card-img'][1]"),
            @FindBy(xpath="//h3[normalize-space(text())='Associate Designer-Die and Mould for Plastic including toys']")
    })
    public WebElement courseName;
    @FindBy(xpath = "//button[normalize-space(text())='View details']")
    public WebElement viewDetailsButton;
    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    public WebElement keyLearnings;

    @FindBy(xpath = "//label[@class='mat-checkbox-layout']")
    public WebElement regularCheckBox;

    @FindBy(xpath = "//button[normalize-space(text())='Show Interest']")
    public WebElement showInterestButton;

    @FindBy(xpath = "//*[text()='Selected Batches']")
    public WebElement selectedBatchesText;

    @FindBy(xpath = "(//span[normalize-space(text())='Start Date'])[2]")
    public WebElement startDate;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    public WebElement startDateDropDownOption;

    @FindBy(xpath = "//span[normalize-space(text())='Sub Scheme']")
    public WebElement subSchemeDropdown;

    @FindBy(xpath="//span[normalize-space(text())='Short Term Training']")
    public WebElement subSchemeDropDownOption;

    @FindBy(xpath = "(//span[normalize-space(text())='State & UT'])[1]")
    public WebElement stateDropDownFilter;

    @FindAll({
            @FindBy(xpath="//*[@placeholder='Search']/following::*[@role='option']"),
            @FindBy(xpath="//span[normalize-space(text()='ODISHA') and @class='mat-option-text']")
    })
    public WebElement stateDropDownOption;

    @FindAll({
            @FindBy(xpath = "//span[text()='TAMIL NADU']"),
            @FindBy(xpath = "//span[text()='ODISHA']")
    })
    public WebElement stateDropDownDefault;

    @FindBy(xpath = "(//span[normalize-space(text())='District'])[1]")
    public WebElement districtDropDown;

    @FindAll({
            @FindBy(xpath = "//span[normalize-space(text())='Thanjavur']"),
            @FindBy(xpath = "//span[normalize-space(text())='KENDUJHAR']")
    })
    public WebElement districtDropDownOption;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']"),
            @FindBy(xpath = "//span[text()='Thanjavur']"),
            @FindBy(xpath = "//span[text()='KENDUJHAR']")
    })
    public WebElement districtDropDownDefault;

    @FindAll({
            @FindBy(xpath = "//div[@class='batches-card']"),
            @FindBy(xpath = "//div[@class='batches-card ng-star-inserted']")
    })
    public WebElement batchDetails;

    @FindBy(xpath = "//button[text()=' Dashboard ']")
    public WebElement dashboardOption;

    @FindBy(xpath = "//a[text()='User Profile']")
    public WebElement userProfilePageText;


    @FindBy(xpath = "//button[@title='Share']")
    public WebElement shareOption;

    @FindBy(id = "schemeSearch")
    public WebElement schemeSearchField;

    @FindBy(xpath = "//*[@class='kw kw-search-md']")
    public WebElement searchIcon;

    @FindBy(xpath = "//a[text()=' Skill Courses ']")
    public WebElement skillCoursesLink;

    @FindBy(xpath = "//a[text()='Skill Centre']")
    public WebElement skillCentresLink;

    @FindBy(xpath = "//a[text()='Learning Resources']")
    public WebElement learningResourcesLink;

    @FindBy(xpath = "(//*[@class='imageBackground'])[2]")
    public WebElement analyticsDashboardImage;

    @FindBy(xpath = "//*[text()=' Sectors ']")
    public WebElement sectorsFilter;


    @FindBy(id = "sectorSearch")
    public WebElement sectorSearchField;

    @FindBy(xpath = "//*[contains(text(),' Apparel, Madeups & Home Furnishing ')]")
    public WebElement apparelSector;

    @FindBy(xpath = "//*[text()=' Ministry ']")
    public WebElement ministryFilter;

    @FindBy(id = "ministrySearch")
    public WebElement ministrySearchField;

    @FindBy(xpath = "//*[text()=' Ministry of Skill Development and Entrepreneurship ']")
    public WebElement ministryOfSkillDevelopmentAndEntrepreneurship;

    @FindBy(xpath = "(//*[text()=' Skilling Program '])[3]")
    public WebElement skillProgramFilter;

    @FindBy(id = "schemeTypeSearch")
    public WebElement allSchemesSearchField;

    @FindBy(xpath = "//*[text()=' Special Projects ']")
    public WebElement specialProjectsScheme;

    @FindBy(xpath = "//*[@class='schemes-cards-block']")
    public WebElement schemeCardPostFilter;

    @FindBy(xpath = "//button[text()=' RESET FILTER ']")
    public WebElement resetSchemeFilter;

    @FindBy(xpath = "(//h2[@title])[1]")
    public WebElement firstSchemeTitle;

    @FindBy(xpath = "(//h2[@title])[2]")
    public WebElement secondSchemeTitle;

    @FindBy(xpath = "//button[normalize-space(text())='Sort']")
    public WebElement sortButton;

    @FindBy(xpath = "//button[text()=' A to Z ']")
    public WebElement sortAtoZOption;

    @FindBy(xpath = "//button[text()=' Z to A ']")
    public WebElement sortZtoAOption;

    @FindBy(xpath = "(//button[@title='Share'])[1]")
    public WebElement shareSchemeOption;

    @FindBy(xpath = "//button[@title='Close']")
    public WebElement crossOptionOfSchemeShare;

    @FindBy(xpath = "//h1[@title]")
    public WebElement schemeName;

    @FindBy(xpath = "//*[@class='tag']")
    public WebElement ministryName;

    @FindBy(xpath = "(//*[@class='tag'])[1]")
    public WebElement ministryNameInScheme;

    @FindBy(xpath = "//*[@class='sub-scheme-name']")
    public WebElement subSchemeName;

    @FindBy(xpath = "//*[text()='Sectors :']//following::li[1]")
    public WebElement sectorName;

    @FindBy(xpath = "//*[@class='sector-list']")
    public WebElement sectorList;

    @FindBy(xpath = "//*[contains(text(),'+ more')]")
    public WebElement sectorMoreButton;

    @FindBy(xpath = "//*[text()='Sectors']")
    public WebElement sectorDialoguePopup;

    @FindBy(xpath = "//button[@class='dialog-close']")
    public WebElement sectorsPopupCloseIcon;

    @FindBy(xpath = "//button[normalize-space()='NSDC Academy']")
    public WebElement nsdcAcademyInDropdown;

    @FindBy(xpath = "//*[@alt='NSDC Academy Icon']")
    public WebElement nsdcIconInSkillCoursePage;

    @FindBy(xpath = "//button[normalize-space()='Apply']")
    public List<WebElement> applyBtnList;

    @FindBy(xpath = "//*[normalize-space()='Select Batches']")
    public WebElement selectBatchesText;

    @FindBy(xpath = "//*[normalize-space()='Batch ID']")
    public WebElement batchIDColumn;



    public void clickOnSchemeSearchAndSendValidKeyword(){
        object_Click(schemeSearchField);
        schemeSearchField.sendKeys("PMKVY");
        waitWebDriver(2000);
        object_Click(searchIcon);
    }

    public void clickOnApllyBtn() {
        waitWebDriver(3000);
        clickWithJavaScript(applyBtn);
    }


    public void clickPMKVYBtn() {
        clickWithJavaScript(PMKVYBtn);
        waitWebDriver(2000);
    }

    public void clickAnaliticDashboardTab() {
        clickWithJavaScript(analiticDashboardTab);
    }

    public void clickOnDashboardTab(){
        clickWithJavaScript(dashboardUnderPMKVY);
    }

    public void clickOverviewTab() {
        waitTillTheElementIsVisibleAndClickable(overviewTab);
        clickWithJavaScript(overviewTab);
    }

    public void clickCandidatesTab() {
        waitWebDriver(5000);
        int framecount = driver.findElements(By.tagName("iFrame")).size();
        System.out.println(framecount);
        driver.switchTo().frame(0);
        waitTillTheElementIsVisibleAndClickable(candidatesTab);
        object_Click(candidatesTab);
        waitWebDriver(2000);


    }

    public void clickBatchesTab() {
        waitTillTheElementIsVisibleAndClickable(batchesTab);
        object_Click(batchesTab);
        waitWebDriver(2000);

    }

    public void clickTrainingCentreTab() {
        waitTillTheElementIsVisibleAndClickable(trainingCentreTab);
        object_Click(trainingCentreTab);
        waitWebDriver(2000);


    }


    public SchemesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String checkSchemespage() {
        return getTextOfObject(Schemes);
    }
    public void clickEBooksLink() {
        clickWithJavaScript(eBooks);
    }
    
    public void clickOnAllSchemes() {
    	waitTillTheElementIsVisibleAndClickable(allSchemesBtn);
    	clickWithJavaScript(allSchemesBtn);
        waitWebDriver(4000);
    }

    public void clickOnRegisterButton(){
        waitWebDriver(2000);
        object_Click(registerOptionInSchemes);
        waitWebDriver(2000);
    }
    
    public void clickOnSchemeCard() {
    	
    	waitTillTheElementIsVisibleAndClickable(schemeCard);
    	clickWithJavaScript(schemeCard);
    }
    
    public void clickOnViewAll() {
        waitWebDriver(3000);
    	waitTillTheElementIsVisibleAndClickable(viewAllBtn);
    	clickWithJavaScript(viewAllBtn);
    }
    
    public void scrollToViewAllSection() {
    	scrollDown();
    	waitWebDriver(2000);
    	scrollDown();
    	waitTillTheElementIsVisibleAndClickable(viewAllBtn);
    }

    public void clickOnBooks() {
    	waitTillTheElementIsVisibleAndClickable(booksBtn);
    	clickWithJavaScript(booksBtn);
        waitWebDriver(3000);
    }
    
    public void clickOnSearchField() {
    	object_Click(searchField);
    }
    
    public void clickOnContentTypeFilter() {
    	waitTillTheElementIsVisibleAndClickable(contentTypeFilter);
    	object_Click(contentTypeFilter);
    }
    
    public void selectVideoTypeContent() {
    	waitTillTheElementIsVisibleAndClickable(videoContentType);
    	object_Click(videoContentType);
    }
    
    public void selectPDFTypeContent() {
    	waitTillTheElementIsVisibleAndClickable(pdfContentType);
    	object_Click(pdfContentType);
    }
    
    public void clickOnContentCategory() {
    	waitTillTheElementIsVisibleAndClickable(contentCategoryFilter);
    	object_Click(contentCategoryFilter);
    }
    
    public void clickOnLanguage() {
    	scrollDown();
        waitWebDriver(2000);
        scrollUp();
        waitWebDriver(1000);
    	waitTillTheElementIsVisibleAndClickable(languageFilter);
    	object_Click(languageFilter);
    }
    
    public void selectEnglishLanguage() {
    	waitTillTheElementIsVisibleAndClickable(englishLanguage);
    	clickWithJavaScript(englishLanguage);
    }
    
    public void clickOnResetBtn() {
    	waitTillTheElementIsVisibleAndClickable(resetBtn);
    	clickWithJavaScript(resetBtn);
    }
    
    public void clickOnLearningResourceCard() {
    	waitWebDriver(3000);
    	waitTillTheElementIsVisibleAndClickable(learningResourceCard);
    	object_Click(learningResourceCard);
    }
    
    public void clickOnDownloadBtn() {
    	waitTillTheElementIsVisibleAndClickable(downloadBtn);
    	object_Click(downloadBtn);
    }
    
    public void clickOnShareBtn() {
    	waitTillTheElementIsVisibleAndClickable(shareBtn);
    	object_Click(shareBtn);
    }

    public void verifySchemeOptionForCoursePage(){

        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(schemeOption);
        object_Click(schemeOption);
    }

    public void verifySchemeOption(){
        waitWebDriver(2000);
        object_Click(searchSchemesOption);
        searchSchemesOption.sendKeys("PMKVY");

        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(schemeOption);
        clickWithJavaScript(schemeOption);
        waitWebDriver(200);
    }

    public void verifyApplyNowButton(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(applyNowButton);
        object_Click(applyNowButton);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(courseName);
        object_Click(courseName);

    }

    public void verifyViewDetailsButton(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(viewDetailsButton);
        object_Click(viewDetailsButton);
        waitWebDriver(2000);
        object_Click(keyLearnings);

    }

    public boolean verifyApplyNow(){
        waitWebDriver(2000);
        boolean value =applyNowButton.isDisplayed();
        return value;
    }

    public void verifyViewDetailsAndApplyNowButton(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(viewDetailsButton);
        object_Click(viewDetailsButton);
        waitWebDriver(5000);
        //clickWithJavaScript(applyNowButton);
        scrollToElement(selectPradhanMantriKaushalVikasYojna);
        clickWithJavaScript(selectPradhanMantriKaushalVikasYojna);
        waitWebDriver(2000);

    }

    public void verifyRegularCheckBoxAndShowInterestButton(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(regularCheckBox);
        clickWithJavaScript(regularCheckBox);
        waitWebDriver(2000);
        Assert.assertTrue(showInterestButton.isEnabled());
        waitWebDriver(2000);
        //object_Click(regularCheckBox);
    }

    public void verifyStartDateDropDown(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(startDate);
        clickWithJavaScript(startDate);
        waitWebDriver(1000);
        clickWithJavaScript(startDateDropDownOption);
    }

    public void verifySubSchemeOption(){
        waitWebDriver(2000);
       // waitTillTheElementIsVisibleAndClickable(subSchemeDropDownOption);
       // clickWithJavaScript(subSchemeDropDownOption);
       // waitWebDriver(2000);
      //  clickWithJavaScript(subSchemeDropDownOption);
      //  waitWebDriver(1000);
        clickWithJavaScript(subSchemeDropdown);
        waitWebDriver(1000);
       // clickWithJavaScript(subSchemeDropDownOption);

    }

    public void verifyStateDropDown(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(stateDropDownFilter);
        object_Click(stateDropDownFilter);
        waitWebDriver(1000);
        clickWithJavaScript(stateDropDownOption);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(stateDropDownDefault);
        object_Click(stateDropDownDefault);
        waitWebDriver(2000);
        clickWithJavaScript(stateDropDownOption);
    }

    public void verifyDistrictDropDown(){
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(districtDropDown);
        object_Click(districtDropDown);
        waitWebDriver(1000);
        clickWithJavaScript(districtDropDownOption);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(districtDropDownDefault);
        object_Click(districtDropDownDefault);
        waitWebDriver(2000);
       // clickWithJavaScript(districtDropDownOption);
    }

    public boolean verifyShowInterestIsNotDisplayed(){
        waitWebDriver(2000);
        boolean value = showInterestButton.isDisplayed();
        System.out.println(value);
        return value;

    }



    public boolean verifyShowInterestButtonIsEnabled(){
        waitWebDriver(2000);
        object_Click(regularCheckBox);
        boolean value =showInterestButton.isEnabled();
        return value;
    }


    public boolean verifyBatchBox(){
        waitWebDriver(2000);
        object_Click(regularCheckBox);
        boolean value =regularCheckBox.isSelected();
        return value;

    }

    public boolean verifyBatchDetailsBox(){
        waitWebDriver(3000);
        clickWithJavaScript(regularCheckBox);
        boolean value =batchDetails.isDisplayed();
        waitWebDriver(2000);
        //object_Click(regularCheckBox);
        return value;
    }

    public void clickOnDashabord(){
        waitTillTheElementIsVisibleAndClickable(dashboardOption);
        clickWithJavaScript(dashboardOption);
    }

    public void clickOnCourses(){
        waitTillTheElementIsVisibleAndClickable(coursesOptionInSchemes);
        clickWithJavaScript(coursesOptionInSchemes);
        waitWebDriver(7000);
    }

    public void clickOnCentres(){
        waitTillTheElementIsVisibleAndClickable(centresOptionInSchemes);
        clickWithJavaScript(centresOptionInSchemes);
        waitWebDriver(3000);
    }

    public void clickOnBooksInSchemes(){
        waitTillTheElementIsVisibleAndClickable(booksOptionInSchemes);
        object_Click(booksOptionInSchemes);
        waitWebDriver(3000);
    }

    public void clickOnAnalyticDashboard(){
        waitTillTheElementIsVisibleAndClickable(analyticsDashboardOptionInSchemes);
        clickWithJavaScript(analyticsDashboardOptionInSchemes);
        waitWebDriver(5000);
    }

    public void clickOnSectorFilter(){
        waitTillTheElementIsVisibleAndClickable(sectorsFilter);
        object_Click(sectorsFilter);
        waitWebDriver(5000);
    }

    public void enterSectorInSearchField(){
        object_Click(sectorSearchField);
        sectorSearchField.sendKeys("Apparel");
        waitWebDriver(1000);
    }

    public void clickOnSearchedSector(){
        waitTillTheElementIsVisibleAndClickable(apparelSector);
        object_Click(apparelSector);
        waitWebDriver(2000);
    }

    public void clickOnMinistryFilter(){
        waitTillTheElementIsVisibleAndClickable(ministryFilter);
        object_Click(ministryFilter);
        waitWebDriver(5000);
    }

    public void enterMinistryInSearchField(){
        object_Click(ministrySearchField);
        ministrySearchField.sendKeys("Ministry of Skill Development");
        waitWebDriver(1000);
    }

    public void scrollTillSearchedMinistry(){
        waitWebDriver(1000);
        scrollToElement(ministryOfSkillDevelopmentAndEntrepreneurship);
        waitWebDriver(1000);
        scrollUp();
        waitWebDriver(1000);
    }

    public void scrollTillSkillingProgramFilter(){
        waitWebDriver(1000);
        scrollToElement(skillProgramFilter);
        waitWebDriver(1000);
        scrollUp();
        waitWebDriver(1000);
    }

    public void clickOnSearchedMinistry(){
        waitTillTheElementIsVisibleAndClickable(ministryOfSkillDevelopmentAndEntrepreneurship);
        object_Click(ministryOfSkillDevelopmentAndEntrepreneurship);
        waitWebDriver(2000);
    }

    public void clickOnSkillProgramFilter(){
        waitTillTheElementIsVisibleAndClickable(skillProgramFilter);
        object_Click(skillProgramFilter);
        waitWebDriver(5000);
    }

    public void enterTheSkillProgramInSearchField(){
        object_Click(allSchemesSearchField);
        allSchemesSearchField.sendKeys("Special Projects");
        waitWebDriver(1000);
    }

    public void clickOnSearchedSkillingProgram(){
        waitTillTheElementIsVisibleAndClickable(specialProjectsScheme);
        object_Click(specialProjectsScheme);
        waitWebDriver(2000);
    }

    public void clickOnResetFilter(){
        waitTillTheElementIsVisibleAndClickable(resetSchemeFilter);
        object_Click(resetSchemeFilter);
        waitWebDriver(2000);
    }

    public char verifyFirstSchemeFirstCharacter(){
        String course1Fc =getTextOfObject(firstSchemeTitle);
        char course1Value =course1Fc.charAt(0);
        return  course1Value;

    }

    public char verifySecondSchemeFirstCharacter(){

        String course2Fc =getTextOfObject(secondSchemeTitle);
        char course2Value =course2Fc.charAt(0);
        return course2Value;

    }

    public void clickOnSortSchemeButton(){
        waitTillTheElementIsVisibleAndClickable(sortButton);
        object_Click(sortButton);
        waitWebDriver(2000);
    }

    public void clickOnAtoZSortOption(){
        waitTillTheElementIsVisibleAndClickable(sortAtoZOption);
        object_Click(sortAtoZOption);
        waitWebDriver(5000);
    }

    public void clickOnZtoASortOption(){
        waitTillTheElementIsVisibleAndClickable(sortZtoAOption);
        object_Click(sortZtoAOption);
        waitWebDriver(5000);
    }

    public void clickOnShareOptionOfTheScheme(){
        waitTillTheElementIsVisibleAndClickable(shareSchemeOption);
        object_Click(shareSchemeOption);
        waitWebDriver(2000);
    }

    public void clickOnCrossOptionOfSchemeShare(){
        waitTillTheElementIsVisibleAndClickable(crossOptionOfSchemeShare);
        object_Click(crossOptionOfSchemeShare);
        waitWebDriver(2000);
    }

    public void clickOnSectorMoreButton(){
        waitTillTheElementIsVisibleAndClickable(sectorMoreButton);
        object_Click(sectorMoreButton);
        waitWebDriver(2000);
    }

    public void clickOnCrossIconOfPopup(){
        waitTillTheElementIsVisibleAndClickable(sectorsPopupCloseIcon);
        object_Click(sectorsPopupCloseIcon);
        waitWebDriver(2000);
    }

    public void clickOnNSDCAcademy(){
        waitTillTheElementIsVisibleAndClickable(nsdcAcademyInDropdown);
        object_Click(nsdcAcademyInDropdown);
        waitWebDriver(2000);
    }

    public void clickOnApplyButton(){
        waitTillTheElementIsVisibleAndClickable(applyBtnList.get(0));
        clickWithJavaScript(applyBtnList.get(0));
        waitWebDriver(2000);
    }


}
