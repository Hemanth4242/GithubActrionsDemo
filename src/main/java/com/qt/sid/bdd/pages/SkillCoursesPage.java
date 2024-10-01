package com.qt.sid.bdd.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import gherkin.lexer.Fa;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SkillCoursesPage extends BasePage {

    public WebDriver driver;

    @FindBy(xpath = "//span[text()='Skill Courses']")
    private WebElement SkillCourse;

    @FindBy(xpath = "//h1[contains(text(),'Skill Courses')]")
    public WebElement SkillCourseHeader;

    @FindBy(xpath = "//span[text()=' Job Exchange ']")
    private WebElement JobExchange;

    @FindAll({
            @FindBy(xpath = "//a[text()=' Skill Centre ']"),
            @FindBy(xpath = "//a[@href='/training-centres']")
    })
    private WebElement SkillCentre;

    @FindBy(xpath = "//h1[contains(text(),'Skill Courses')]")
    public WebElement skillCourseVerify;

    @FindBy(xpath = "//*[@class='skill-course-card-v2']")
    public WebElement courseCard;

    @FindBy(xpath = "//a[text()='3']")
    public WebElement pageNumber3;

    @FindBy(xpath = "//button[text()=' Free ']")
    public WebElement freeSection;

    @FindBy(xpath = "//button[text()=' 1000 - 5000 ']")
    public WebElement onekToFivekSection;

    @FindBy(xpath = "//button[text()=' 5000 - 10000 ']")
    public WebElement fivekToTenkSection;

    @FindBy(xpath = "//button[text()=' Offline ']")
    public WebElement offlineSection;

    @FindBy(xpath = "//button[text()=' Online ']")
    public WebElement onlineSection;

    @FindBy(xpath = "//button[text()=' PMKVY ']")
    public WebElement pmkvySection;

    @FindBy(id = "search")
    public WebElement searchTextField;

    @FindBy(xpath = "//*[@title='Kisan Drone Operator']")
    public WebElement kisanDroneCourse;

    @FindBy(xpath = "//*[text()=' Course Details']")
    public WebElement courseDetailsHeader;

    @FindBy(xpath = "//input[@aria-label='Mobile number']")
    public WebElement mobileNumberField;

    @FindBy(xpath = "//button[text()=' Enroll ']")
    public WebElement enrollButton;

    @FindBy(xpath = "//button[text()=' Pay Now ']")
    public WebElement payNowButton;

    @FindBy(xpath = "//*[text()='Mobile Number is ']/b")
    public WebElement mobileNumberRequiredMessage;

    @FindBy(xpath = "//*[text()=' Interest Area ']")
    public WebElement interestAreaFilter;

    @FindBy(xpath = "//*[text()=' Ratings ']")
    public WebElement ratingsFilter;

    @FindAll({
            @FindBy(xpath = "(//*[@class='star-text'])[1]"),
            @FindBy(xpath = "//*[contains(text(),'1 star')]")
    })
    public WebElement oneStarRating;

    @FindAll({
            @FindBy(xpath = "(//*[@class='star-text'])[2]"),
            @FindBy(xpath = "//*[contains(text(),'2 star')]")
    })
    public WebElement twoStarRating;

    @FindAll({
            @FindBy(xpath = "(//*[@class='star-text'])[3]"),
            @FindBy(xpath = "//*[contains(text(),'3 star')]")
    })
    public WebElement threeStarRating;

    @FindAll({
            @FindBy(xpath = "(//*[@class='star-text'])[4]"),
            @FindBy(xpath = "//*[contains(text(),'4 star')]")
    })
    public WebElement fourStarRating;

    @FindAll({
            @FindBy(xpath = "(//*[@class='star-text'])[5]"),
            @FindBy(xpath = "//*[contains(text(),'5 star')]")
    })
    public WebElement fiveStarRating;

    @FindBy(xpath = "//button[text()=' Apply ']")
    public WebElement applyButton;

    @FindBy(xpath = "//*[@class='skill-course-card-v2']//span[contains(text(),'4')]")
    public WebElement ratingFilteredCourse;

    @FindBy(xpath = "//button[text()=' RESET FILTER ']")
    public WebElement resetFilterButton;

    @FindBy(xpath = "//button[@title='Favorite Button']")
    public WebElement favoriteBtn;

    @FindBy(xpath = "//*[text()='Course has been added to your favourite list']")
    public WebElement courseAddedToFavoriteMsg;

    @FindBy(xpath = "//*[text()='Course has been removed from your favourite list']")
    public WebElement courseRemovedFromFavoriteMsg;

    @FindBy(xpath = "//*[@class='btn-favorit ng-star-inserted']")
    public WebElement FavoriteSection;


    //=========================MicrosoftCourse Objects====
    @FindBy(xpath = "(//*[text()=' Online '])[1]")
    public WebElement onlineTagOfCourse;

    @FindBy(xpath = "//*[@class='course-title']")
    public WebElement courseTitle;

    @FindBy(xpath = "//*[text()=' By: Microsoft']")
    public WebElement byMicrosoft;

    @FindBy(xpath = "//*[text()=' By: Microsoft']//following::span[1]")
    public WebElement sectorTagOfCourse;

    @FindBy(xpath = "//*[@class='description-details ng-star-inserted']")
    public WebElement descriptionOfTheCourse;

    @FindBy(xpath = "//*[text()=' Knowledge Partner ']//following::p[1]")
    public WebElement knowledgePartnerData;

    @FindBy(xpath = "//*[text()=' Required Age ']//following::p[1]")
    public WebElement requiredAgeData;

    @FindBy(xpath = "//*[text()=' Skill / Licenses Required ']//following::p[1]")
    public WebElement licenseRequiredData;

    @FindBy(xpath = "//*[text()=' Certification Type ']//following::p[1]")
    public WebElement certificationTypeData;

    @FindBy(xpath = "//*[text()=' Languages ']//following::p[1]")
    public WebElement languageData;

    @FindBy(xpath = "//*[text()=' Minimum Education ']//following::p[1]")
    public WebElement minimumEducationData;

    @FindBy(xpath = "//*[text()='QP Code']//following::p[1]")
    public WebElement qpCodeData;

    @FindBy(xpath = "//*[text()=' Topics ']")
    public WebElement topicsSection;

    @FindBy(xpath = "//*[@class='button-title']")
    public List<WebElement> topicsInOrder;

    @FindBy(xpath = "//*[text()='GUVI GEEK NETWORK PRIVATE LIMITED']")
    public WebElement assertGuviCourse;

    @FindBy(xpath = "(//button[@title='Share'])[1]")
    public WebElement shareGuviCourseBtn;

    @FindBy(id = "number")
    public WebElement mobileNumberFieldInCourse;

    @FindBy(xpath = "//button[text()=' Enroll ']")
    public WebElement enrollBtnInCourse;

    @FindBy(xpath = "//*[@class='skill-course-card-v2']")
    public List<WebElement> skillCourseCardList;

    @FindBy(xpath = "//*[@class='nsdctext']")
    public WebElement dlpName;

    @FindBy(xpath = "//*[@class='detail-sector-tag sector-name ng-star-inserted']")
    public WebElement industryName;

    @FindBy(xpath = "//*[@class='duration ps-2 ng-star-inserted']")
    public WebElement durationOfCourse;

    @FindBy(xpath = "//*[@class='cost ps-2 ng-star-inserted']")
    public WebElement courseType;

    @FindBy(xpath = "//*[@class='cost']")
    public WebElement costOfCourse;

    @FindBy(xpath = "//*[text()=' NSQF Level ']//following::p[1]")
    public WebElement nsqfData;

    @FindBy(xpath = "//*[@class='course-titlle']")
    public WebElement courseNameTitle;

    @FindBy(xpath = "//*[@class='nsdc-text']")
    public WebElement courseOrganizationName;

    @FindBy(xpath = "//*[text()=' Online ']")
    public WebElement onlineTagOfCourseCard;

    @FindBy(xpath = "//*[@class='skill-course-card-img']")
    public WebElement courseImage;

    @FindBy(xpath = "//button[@title='Share Button']")
    public WebElement courseShareButton;

    @FindBy(xpath = "//button[@title='Favorite Button']")
    public WebElement courseFavoriteButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user-group']")
    public WebElement noOfStudentsSection;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-clock']")
    public WebElement courseDurationInCard;

    @FindBy(xpath = "//*[@class='rating ng-star-inserted']")
    public WebElement ratingsOnCourseCard;

    @FindBy(xpath = "//*[@class='discription-area']")
    public WebElement courseDescriptionArea;

    @FindBy(xpath = "//*[text()=' Go To Course ']")
    public WebElement goToCourseOnCourseCard;


    public SkillCoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickJobExchangeLink() {
        waitTillTheElementIsVisibleAndClickable(JobExchange);
        object_Click(JobExchange);
    }
    public String checkSkillCoursepage() {
        waitForElementToAppear(SkillCourseHeader);
        return getTextOfObject(SkillCourse);
    }
    public void waitTillElementOfSkillCourse() {
        waitForElementToAppear(SkillCourseHeader);
        object_Click(SkillCourseHeader);
    }
    public void clickSkillCentreLink() {
        waitWebDriver(2000);
        clickWithJavaScript(SkillCentre);
        waitWebDriver(2000);
    }

    public String verifySkillCoursePage(){
        return getTextOfObject(skillCourseVerify);
    }

    public void clickOnThirdPageNumber(){
        waitWebDriver(2000);
        scrollToElement(pageNumber3);
        waitWebDriver(2000);
        scrollUp();
        waitTillTheElementIsVisibleAndClickable(pageNumber3);
        object_Click(pageNumber3);
        waitWebDriver(2000);
    }

    public void verifyColorOfTheSelectedPageNumber(){
        waitWebDriver(2000);
        scrollToElement(pageNumber3);
        waitWebDriver(2000);
        scrollUp();

        String color =pageNumber3.getCssValue("color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void clickOnFreeSection(){
        waitTillTheElementIsVisibleAndClickable(freeSection);
        clickWithJavaScript(freeSection);
        waitWebDriver(2000);
    }

    public void clickOnOnekToFiveKSection(){
        waitTillTheElementIsVisibleAndClickable(onekToFivekSection);
        clickWithJavaScript(onekToFivekSection);
        waitWebDriver(2000);
    }

    public void clickOnFivekToTenkSection(){
        waitTillTheElementIsVisibleAndClickable(fivekToTenkSection);
        clickWithJavaScript(fivekToTenkSection);
        waitWebDriver(2000);
    }

    public void clickOnOfflineSection(){
        waitTillTheElementIsVisibleAndClickable(offlineSection);
        clickWithJavaScript(offlineSection);
        waitWebDriver(2000);
    }

    public void clickOnOnlineSection(){
        waitTillTheElementIsVisibleAndClickable(onlineSection);
        clickWithJavaScript(onlineSection);
        waitWebDriver(2000);
    }

    public void clickOnPMKVYSection(){
        waitTillTheElementIsVisibleAndClickable(pmkvySection);
        clickWithJavaScript(pmkvySection);
        waitWebDriver(2000);
    }

    public void clickOnCourseSearchField(){
        waitTillTheElementIsVisibleAndClickable(searchTextField);
        object_Click(searchTextField);
        waitWebDriver(2000);
        searchTextField.clear();
        waitWebDriver(2000);
    }

    public void searchCourseByName(){
        searchTextField.sendKeys("Kisan Drone Operator");
        waitWebDriver(3000);
    }

    public void searchPaidCourseByName(){
        searchTextField.sendKeys("OET NURSES");
        waitWebDriver(3000);
    }

    public void clickOnPayNowButton(){
        waitTillTheElementIsVisibleAndClickable(payNowButton);
        object_Click(payNowButton);
        waitWebDriver(5000);
    }

    public void clickOnFavoriteBtn(){
        waitTillTheElementIsVisibleAndClickable(favoriteBtn);
        object_Click(favoriteBtn);
        waitWebDriver(1000);
    }

    public void clickOnFavoriteSection(){
        waitTillTheElementIsVisibleAndClickable(FavoriteSection);
        clickWithJavaScript(FavoriteSection);
        waitWebDriver(5000);
    }

    public void searchMicrosoftCourse(String course){
        searchTextField.sendKeys(course);
        waitWebDriver(3000);
    }
    public void clickOnSearchedCourseCard(){
        waitTillTheElementIsVisibleAndClickable(courseCard);
        object_Click(courseCard);
        waitWebDriver(2000);
    }

    public void clickOnMobileNumberField(){
        waitTillTheElementIsVisibleAndClickable(mobileNumberField);
        object_Click(mobileNumberField);
        waitWebDriver(2000);
    }
    public void clickOnEnrollButton(){
        clickWithJavaScript(enrollButton);
        waitWebDriver(1000);
        clickWithJavaScript(enrollButton);
    }

    public void clickOnInterestAreaFilter(){
        waitTillTheElementIsVisibleAndClickable(interestAreaFilter);
        object_Click(interestAreaFilter);
    }

    public void clickOnRatingsFilter(){
        waitWebDriver(2000);
        scrollDown();
        waitWebDriver(2000);
        waitTillTheElementIsVisibleAndClickable(ratingsFilter);
        object_Click(ratingsFilter);
        waitWebDriver(2000);
    }

    public void clickOnAnyRatingFromDropdown(){
        waitTillTheElementIsVisibleAndClickable(fourStarRating);
        object_Click(fourStarRating);
    }

    public void clickOnApplyButton(){
        waitTillTheElementIsVisibleAndClickable(applyButton);
        object_Click(applyButton);
        waitWebDriver(2000);
    }

    public void clickOnResetFilterButton(){
        waitTillTheElementIsVisibleAndClickable(resetFilterButton);
        clickWithJavaScript(resetFilterButton);
        waitWebDriver(2000);
    }

    public void clickOnTopics(){
        waitTillTheElementIsVisibleAndClickable(topicsSection);
        clickWithJavaScript(topicsSection);
        waitWebDriver(3000);
    }

    public void clickOnGuviCourseShareBtn(){
        waitTillTheElementIsVisibleAndClickable(shareGuviCourseBtn);
        clickWithJavaScript(shareGuviCourseBtn);
        waitWebDriver(3000);
    }

    public void verifyTheBorderColorOfOnlineSection(){
        String color =onlineSection.getCssValue("border-color");
        String bc = Color.fromString(color).asHex();
        String expectedColor="#df6e12";
        Assert.assertEquals(bc,expectedColor);
    }

    public void clickAndEnterValidMobileNumber(){
        waitTillTheElementIsVisibleAndClickable(mobileNumberFieldInCourse);
        object_Click(mobileNumberFieldInCourse);
        waitWebDriver(1000);
        mobileNumberField.sendKeys("9148574673");
        waitWebDriver(1000);
    }

    public void clickAndEnterInvalidMobileNumber(){
        waitTillTheElementIsVisibleAndClickable(mobileNumberFieldInCourse);
        object_Click(mobileNumberFieldInCourse);
        mobileNumberFieldInCourse.clear();
        waitWebDriver(1000);
        mobileNumberFieldInCourse.sendKeys("1111111111");
        waitWebDriver(1000);
    }

    public void clickOnFirstCourseEnrollOrContinue(){
        waitTillTheElementIsVisibleAndClickable(skillCourseCardList.get(0));
        object_Click(skillCourseCardList.get(0));
        waitWebDriver(2000);
    }

    public void clickOnSecondCourseEnrollOrContinue(){
        waitTillTheElementIsVisibleAndClickable(skillCourseCardList.get(1));
        object_Click(skillCourseCardList.get(1));
        waitWebDriver(2000);
    }

    public void clickOnThirdCourseEnrollOrContinue(){
        waitTillTheElementIsVisibleAndClickable(skillCourseCardList.get(2));
        object_Click(skillCourseCardList.get(2));
        waitWebDriver(2000);
    }

    public void clickOnFourthCourseEnrollOrContinue(){
        waitTillTheElementIsVisibleAndClickable(skillCourseCardList.get(3));
        object_Click(skillCourseCardList.get(3));
        waitWebDriver(2000);
    }


}
