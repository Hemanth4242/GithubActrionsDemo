package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PractisePage extends  BasePage{

    public WebDriver driver;

    @FindBy(xpath = "//button[text()=' LOGIN ']")
    public WebElement loginBtn;

    @FindBy(xpath = "//h3[text()='Partner']")
    public WebElement  assertLoginPage;


    @FindBy(xpath = "//h5[text()=' Let’s get started ']")
    public WebElement  assertMobileNumberFIled;

    @FindBy(xpath = "//h3[text()='Learner/Participant']")
    public WebElement learnerParticipantBtn;


    @FindBy(xpath = "//input[@id='number']")
    public WebElement mobileNumberFiled;



//    Scenario : Verify Skill India Digital Agriculture course in skill course

    @FindBy(xpath = "//span[text()='Skill Courses']")
    public WebElement skillCourseOption;

    @FindBy(xpath = "//input[@id='coursesearch']")
    public WebElement sectorsSearchBar;


    @FindBy(xpath = "//h3[text()='Agriculture']")
    public WebElement agricultureCourse;

    @FindBy(xpath = "//button[@class='sorting-btn']")
    public WebElement sortDropDown;

    @FindBy(xpath = "//*[@id='MainContent']/div[1]/div/div/div/div/div/button[1]")
    public WebElement lowToHighOpt;

    @FindBy(xpath = "//h2[text()=' Certificate Course in Plant Breeding ']")
    public WebElement assertCourse;







    public PractisePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickOnLoginBtn() {
        waitTillTheElementIsVisibleAndClickable(loginBtn);
        object_Click(loginBtn);
    }

    public void clickOnLearnerParticipantBtn() {
        waitTillTheElementIsVisibleAndClickable(learnerParticipantBtn);
        object_Click(learnerParticipantBtn);
    }

    public void clickAndEnterMobileNumber(){
        waitTillTheElementIsVisibleAndClickable(mobileNumberFiled);
        object_Click(mobileNumberFiled);
        enterValueInTextBox(mobileNumberFiled,"9618997677");
    }


    //    Scenario : Verify Skill India Digital Agriculture course in skill course

    public void clickOnSkillCourse(){
        waitTillTheElementIsVisibleAndClickable(skillCourseOption);
        object_Click(skillCourseOption);
    }

    public void clickSectorsSearch(){
        waitTillTheElementIsVisibleAndClickable(sectorsSearchBar);
        object_Click(sectorsSearchBar);
        enterValueInTextBox(sectorsSearchBar,"Agriculture");

    }

    public void clickOnAgriculture(){
        waitTillTheElementIsVisibleAndClickable(agricultureCourse);
        object_Click(agricultureCourse);

    }

    public void clickOnSortDropDown(){
        waitTillTheElementIsVisibleAndClickable(sortDropDown);
        object_Click(sortDropDown);
    }

    public void clickOnLowToHighOpt(){
        waitTillTheElementIsVisibleAndClickable(lowToHighOpt);
        object_Click(lowToHighOpt);
    }









}
