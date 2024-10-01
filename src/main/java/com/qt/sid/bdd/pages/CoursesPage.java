package com.qt.sid.bdd.pages;

import com.qt.sid.bdd.utils.ConfigFileReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.*;

public class CoursesPage extends BasePage{


    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;
    ConfigFileReader configFileReader;


    public CoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader = new ConfigFileReader();
    }

    @FindBy(xpath = "//div[@class='header-section']/*[@CLASS='header-title']" )
    public WebElement verifyCoursesPage;

    @FindBy(xpath = "//button[contains(@class,'mat-focus-indicator btn-fav mat-button mat-button-base')]" )
    public List<WebElement> listOfCourses;

    @FindBy(xpath = "//span[text()=' Online ']/parent::button" )
    public WebElement onlineBtn;

    @FindBy(xpath = "//button[text()=' Go To Course ']" )
    public WebElement goToCourseBtn;

    @FindBy(xpath = "//button[@class='sorting-btn ng-star-inserted']" )
    public WebElement sortBtn;

    @FindBy(xpath = "//button[normalize-space()='A to Z']" )
    public WebElement AtoZBtn;

    @FindBy(xpath = "//button[normalize-space()='Z to A']" )
    public WebElement ZtoABtn;

    @FindBy(xpath = "//div[@class='course-titlle']/*" )
    public WebElement verifyCoursesTextAtoZ;

    @FindBy(xpath = "//div[@class='course-titlle']/*")
    public WebElement verifyCoursesTextZtoA;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchCoursesTextField;

    @FindBy(xpath = "//span[contains(text(),'Agriculture')]/ancestor::mat-checkbox")
    public WebElement agriculterSelect;

    @FindBy(xpath = "//span[contains(text(),'Electronics')]/ancestor::mat-checkbox")
    public WebElement electricaSelect;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-suffix ng-tns')]/div)[1]")
    public WebElement searchCourseBtn;

    @FindBy(xpath = "//h3[@title='Kisan Drone Operator']")
    public WebElement verifyAgriculture;

    @FindBy(xpath = "//h3[@title='Welding Technician']")
    public WebElement verifyTechnician;

    @FindBy(xpath = "//button[@title='Reset Filter Button']")
    public WebElement clickOnResetBtn;

    @FindBy(xpath = "(//li[@class='page-item']/a)[1]")
    public WebElement singleNext;

    @FindBy(xpath = "(//li[@class='page-item']/a)[2]")
    public WebElement doubleNext;

    @FindBy(xpath = "(//*[@class='page-item']/a)[2]")
    public WebElement singlePrevious;

    @FindBy(xpath = "(//li[@class='page-item']/a)[1]")
    public WebElement doublePrevious;

    @FindBy(xpath = "//span[text()='Favourite  ']")
    public WebElement Skill_CoursesTest;

    @FindBy(xpath = "//div[contains(@class,'col-12 ng-star-inserted')]//button[contains(.,'Go To Course')]")
    public WebElement goToBtn;

    @FindAll({
            @FindBy(xpath = "(//span[text()='Go To Course'])[2]"),
            @FindBy(xpath = "//span[text()='Go To Course']")
    })
    public WebElement popularGoToBtn;

    @FindBy(xpath = "//button[@title='Share Button']")
    public WebElement shareBtn;

    @FindBy(xpath = "//*[@class='mat-dialog-title']")
    public WebElement verifySharetext;

    @FindBy(xpath = "//div[@class='skill-course-card-img']")
    public WebElement clickImgaeCourseCard;

    @FindBy(xpath = "//mat-panel-title[.=' Language ']")
    public WebElement languageFilterBtn;


    @FindBy(xpath = "//mat-panel-title[.=' Interest Area ']/ancestor::mat-expansion-panel-header/parent::mat-expansion-panel")
    public WebElement itrestedAreaFilterBtn;

    @FindBy(xpath = "//mat-panel-title[.=' Ratings ']")
    public WebElement ratingBtn;

    @FindBy(xpath = "//span[text()=' English ']/ancestor::mat-checkbox/label")
    public WebElement englishLangua;

    @FindBy(xpath = "//span[text()=' Hindi ']/ancestor::mat-checkbox")
    public WebElement hindiLanguage;

    @FindBy(xpath = "//div[@class='course-titlle']/*")
    public WebElement verifyEnglishLanguage;

    @FindBy(xpath = "//*[text()=' Kisan Drone Operator ']")
    public WebElement verifyHindiLanguage;

    @FindBy(xpath = "//span[text()=' Construction ']/ancestor::mat-checkbox/label")
    public WebElement selectOnConstructionIntrestedAre;

    @FindBy(xpath = "//button[text()=' Go To Course ']")
    public WebElement verifyCourseCard;

    @FindBy(xpath = "//*[text()=' Agriculture ']")
    public WebElement selectOnAgricultureIntrestedArea;

    @FindBy(xpath = "//*[text()=' Kisan Drone Operator ']")
    public WebElement verifyConstructionAndAgriculture;



    @FindAll({
            @FindBy(xpath = "//h3[@title='Welding Technician']"),
            @FindBy(xpath = "//div[@class='skill-course-card-v2']")
    })
    public WebElement weldindTeck;

    @FindBy(xpath = "//button[text()=' Apply ']")
    public WebElement applyBtn;


    @FindBy(xpath = "//h2[text()='Popular Skill Courses']")
    public WebElement popularSkillCoursesSection;


    public void clickOnApplyBtn(){
        scrollToElement(applyBtn);
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(applyBtn);

        clickWithJavaScript(applyBtn);
    }


    public String verifyConstructionAndAgriculture(){
        waitTillTheElementIsVisibleAndClickable(verifyConstructionAndAgriculture);
        return getTextOfObject(verifyConstructionAndAgriculture);
    }

    public void clickOnAgricultureIntrestedArea(){

        waitTillTheElementIsVisibleAndClickable(selectOnAgricultureIntrestedArea);
         clickWithJavaScript(selectOnAgricultureIntrestedArea);
    }

    public boolean verifyCourseCardIsDisplay(){
        waitTillTheElementIsVisibleAndClickable(verifyCourseCard);
        return isElementPresent(verifyCourseCard);
    }



    public void clickOnConstructionIntrestedAre() throws InterruptedException {
        Thread.sleep(3000);
        clickWithJavaScript(selectOnConstructionIntrestedAre);
    }

    public String verifyHindiLanguage(){
        waitTillTheElementIsVisibleAndClickable(verifyHindiLanguage);
         return getTextOfObject(verifyHindiLanguage);
    }
    public boolean verifyEnglishLanguage(){
        waitTillTheElementIsVisibleAndClickable(verifyEnglishLanguage);
        return isElementPresent(verifyEnglishLanguage);
    }

    public void clickOnHindiLanguage(){
        waitTillTheElementIsVisibleAndClickable(hindiLanguage);
        clickWithJavaScript(hindiLanguage);
    }

    public void clickOnEnglishLanguage(){
        waitTillTheElementIsVisibleAndClickable(englishLangua);
        scrollToElement(englishLangua);
        clickWithJavaScript(englishLangua);
    }

    public void verifyEnglishCourseCard(){
        //waitTillTheElementIsVisibleAndClickable(clickImgaeCourseCard);
        object_Click(hindiLanguage);
    }



    public void clickOnTatingBtn(){
        //waitTillTheElementIsVisibleAndClickable(clickImgaeCourseCard);
        clickWithJavaScript(ratingBtn);
    }

    public void clickOnIntrestedAreaBtn(){

        clickWithJavaScript(itrestedAreaFilterBtn);
    }

    public void clickOnLanguageFilterBtn(){
        waitTillTheElementIsVisibleAndClickable(languageFilterBtn);
        scrollToElement(languageFilterBtn);
        clickWithJavaScript(languageFilterBtn);

    }


    public void clickOnImageCourseCard(){
        //waitTillTheElementIsVisibleAndClickable(clickImgaeCourseCard);
        waitWebDriver(3000);
        clickWithJavaScript(clickImgaeCourseCard);
        waitWebDriver(2000);
    }


    public String getTextShareBtn(){
        waitTillTheElementIsVisibleAndClickable(verifySharetext);
        return getTextOfObject(verifySharetext);
    }

    public void clickOnShareBtn(){
        waitWebDriver(3000);
        waitTillTheElementIsVisibleAndClickable(shareBtn);
        clickWithJavaScript(shareBtn);
    }


    public void clickOnPopularGoToBtn(){

        waitTillTheElementIsVisibleAndClickable(popularGoToBtn);
        clickWithJavaScript(popularGoToBtn);
    }

    public void clickOnGoToBtn(){
        waitWebDriver(5000);
        waitTillTheElementIsVisibleAndClickable(goToBtn);
        clickWithJavaScript(goToBtn);
        waitWebDriver(2000);
    }

    public String verifyThatSkillCourseText(){
        waitTillTheElementIsVisibleAndClickable(Skill_CoursesTest);
        return getTextOfObject(Skill_CoursesTest);
    }

    public void clickOnSinglePreveousBtn(){
        waitTillTheElementIsVisibleAndClickable(singlePrevious);
        scrollToElement(singlePrevious);
        clickWithJavaScript(singlePrevious);
        waitWebDriver(2000);
    }

    public void clickDoublePreviousBtn(){
        waitTillTheElementIsVisibleAndClickable(doublePrevious);
        scrollToElement(doublePrevious);
        clickWithJavaScript(doublePrevious);
        waitWebDriver(2000);
    }

    public void clickOnDoubleNextBtn(){
        waitTillTheElementIsVisibleAndClickable(doubleNext);
        scrollToElement(doubleNext);
        clickWithJavaScript(doubleNext);
        waitWebDriver(2000);
    }

    public void clickOnSingleNext(){
        waitClickableElement(singleNext, (int) configFileReader.getExplicitWaitTime());
        scrollToElement(singleNext);
        clickWithJavaScript(singleNext);
        waitWebDriver(2000);
    }

    public void setClickOnResetBtn(){
        waitTillTheElementIsVisibleAndClickable(clickOnResetBtn);
         clickWithJavaScript(clickOnResetBtn);
    }

    public String verifyElectricianText(){
        waitTillTheElementIsVisibleAndClickable(verifyTechnician);
        return getTextOfObject(verifyTechnician);
    }

    public boolean getTextCoursePageIsDisplay(){
        waitTillTheElementIsVisibleAndClickable(verifyCoursesPage);
        return isElementPresent(verifyCoursesPage);}

    public String verifyAgricultralText(){
        waitTillTheElementIsVisibleAndClickable(verifyAgriculture);
        return getTextOfObject(verifyAgriculture);
    }

    public void clickOnSearchCourseBtn(){
    	waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(searchCourseBtn);
        clickWithJavaScript(searchCourseBtn);
    }

    public void clickOnElectrical(){
        waitTillTheElementIsVisibleAndClickable(electricaSelect);
        electricaSelect.isSelected();
    }

    public void clickOnAgriculture(){
        waitTillTheElementIsVisibleAndClickable(agriculterSelect);
        agriculterSelect.isSelected();
    }

    public void sendCourseTextFiled(String value){
    	waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(searchCoursesTextField);
        enterValueInTextBox(searchCoursesTextField,value);
    }

    public String getTextAtoZ(){
        //waitTillTheElementIsVisibleAndClickable(verifyCoursesTextZtoA);
       return getTextOfObject(verifyCoursesTextZtoA);
    }

    public String getTextZtoA(){
       // waitTillTheElementIsVisibleAndClickable(verifyCoursesTextAtoZ);
        return getTextOfObject(verifyCoursesTextAtoZ);
    }

    public void clickZtoABtn(){
       // waitTillTheElementIsVisibleAndClickable(ZtoABtn);
        clickWithJavaScript(ZtoABtn);
        waitWebDriver(2000);
    }

    public void clickAtoZBtn(){
       // waitTillTheElementIsVisibleAndClickable(AtoZBtn);
        clickWithJavaScript(AtoZBtn);
        waitWebDriver(2000);
    }

    public void clickSortBtn() throws InterruptedException {
       // waitTillTheElementIsVisibleAndClickable(sortBtn);
        scrollToElement(sortBtn);
        clickWithJavaScript(sortBtn);
    }

    public void clickOnCourseBtn(){
        clickWithJavaScript(goToCourseBtn);
    }

    public void clickOnlineBtn(){
    	waitWebDriver(3000);
         clickWithJavaScript(onlineBtn);
    }

    public String getTextCoursePageText(){
        return verifyCoursesPage.getText();
    }

    public ArrayList<String> listOfCoursesVerify() {
        ArrayList<String> list = new ArrayList<>();
        for(WebElement ele :listOfCourses) {
            list.add(getTextOfObject(ele));
        }    return list;}


    public boolean verifyJoinNowOptions(){
        waitForElementToAppear(weldindTeck);
        boolean value =weldindTeck.isDisplayed();
        return  value;

    }

    public void scrollToPopularCourseSection(){
        waitWebDriver(2000);
        scrollToElement(popularSkillCoursesSection);
        waitWebDriver(2000);
    }




}
