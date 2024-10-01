package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;

public class OpportunitiesPage extends BasePage{

    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;


    public OpportunitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

  
    
    @FindBy(xpath = "//div[@class='header-section']/*[text()=' Job Exchange ']" )
    public WebElement verifyOpportunityPage;

    @FindAll({
            @FindBy(xpath = "(//h4[normalize-space(text())='Business Development Executive'])[1]"),
            @FindBy(xpath = "(//h4[normalize-space(text())='Sales Executive'])[1]"),
            @FindBy(xpath = "(//*[@class='card-detail'])[1]")
    })
    public WebElement jobExchangeOption;
    @FindBy(xpath = "//a[text()=' Job Exchange ']")
    public WebElement jobExchangePage;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement jobExchangeSearchField;

    @FindBy(xpath ="//button[normalize-space(text())='Sort']")
    public WebElement courseSortDropdownButton;

    @FindBy(xpath = "//button[text()=' A to Z ']")
    public WebElement courseSortDropdownAccendingOrder;

    @FindAll({
            @FindBy(xpath = "(//*[@class='main-title'])[2]"),
            @FindBy(xpath = "//h4[text()=' ACCONTANT ']"),
            @FindBy(xpath = "//h4[text()=' Accountant ']"),
            @FindBy(xpath = "//h4[text()=' Accounts Receivable-Collections-Field ']")
    })
    public WebElement sortedCourse1;

    @FindAll({
            @FindBy(xpath = "(//*[@class='main-title'])[3]"),
            @FindBy(xpath = "//h4[text()=' Agri Warehouse Supervisor ']"),
            @FindBy(xpath = "//h4[text()=' Agri Warehouse Supervisor ']"),
            @FindBy(xpath = "//h4[text()=' Assembler ']")
    })
    public WebElement sortedCourse2;

    @FindBy(xpath = "//button[text()=' Z to A ']")
    public WebElement courseSortDropdownDecendingOrder;

    @FindAll({
            @FindBy(xpath = "(//*[@class='main-title'])[1]"),
            @FindBy(xpath ="(//h4[normalize-space(text())='Team Member'])[1]"),
            @FindBy(xpath ="(//h4[normalize-space(text())='Welder'])[1]")
    })
    public WebElement decSortedCourse1;

    @FindAll({
            @FindBy(xpath = "(//*[@class='main-title'])[2]"),
            @FindBy(xpath = "(//h4[normalize-space(text())='Welder'])[2]"),
            @FindBy(xpath = "//h4[normalize-space(text())='Stewards']"),
            @FindBy(xpath = "//h4[normalize-space(text())='Trainee']")
    })
    public WebElement decSortedCourse2;

    @FindBy(xpath="//*[text()=' Apparel ']")
    public WebElement jobCourseRadioButton;

    @FindBy(xpath = "(//h4[normalize-space(text())='HMV DRIVER'])[1]")
    public WebElement jobCourseRadioButtonFilterResult;

    public boolean getTextOpportunityPageText(){
        return isElementPresent(verifyOpportunityPage);
    }
    
    public void verifyJobEXchangePage(){
        waitVisibleElement(jobExchangePage,60);
        Assert.assertTrue(jobExchangePage.isDisplayed());
    }
    
    public void verifyCourseNameClick(){
        waitWebDriver(3000);
        waitVisibleElement(jobExchangeOption,60);
        clickWithJavaScript(jobExchangeOption);
    }

    public void verifyCourseDropDownButton(){
        waitVisibleElement(courseSortDropdownButton,60);
        object_Click(courseSortDropdownButton);
    }

    public void verifyCourseDropdownAccendingOrderOption() {
    	waitWebDriver(3000);
        waitVisibleElement(courseSortDropdownAccendingOrder, 60);
        object_Click(courseSortDropdownAccendingOrder);

    }

    public char verifyCourse1FirstCharacter(){
        String course1 =getTextOfObject(sortedCourse1);
        char course1FirstChar =course1.charAt(0);
        return course1FirstChar;
    }
    public char verifyCourse2FirstCharacter(){
        String course2 =getTextOfObject(sortedCourse2);
         char course2FirstChar =course2.charAt(0);
         return course2FirstChar;
    }

    public void verifyCourseDeccendingOrder(){
        waitVisibleElement(courseSortDropdownDecendingOrder,60);
        object_Click(courseSortDropdownDecendingOrder);
    }

    public char verifyDecCoursr1FirstCharacter(){
        String course1Fc =getTextOfObject(decSortedCourse1);
        char course1Value =course1Fc.charAt(0);
        return  course1Value;

    }

    public char verifyDecCoursr2FirstCharacter(){

        String course2Fc =getTextOfObject(decSortedCourse2);
        char course2Value =course2Fc.charAt(0);
        return course2Value;

    }

    public void verifyJobCourseFilter(){
        waitClickableElement(jobCourseRadioButton,60);
        object_Click(jobCourseRadioButton);
    }


    public String verifyJobCourseRadioButtonFilterResult(){
        waitVisibleElement(jobCourseRadioButtonFilterResult,60);
        String value=getTextOfObject(jobCourseRadioButtonFilterResult);
        System.out.println(value);
        return value;
    }

    public void verifyJobExchangeSearchField(String enterValue) throws InterruptedException {
        waitVisibleElement(jobExchangeSearchField,60);
        enterValueInTextBox(jobExchangeSearchField,enterValue);
        Thread.sleep(5000);
    }

    public void verifyJobExchangeSearchFieldClear(){
        waitVisibleElement(jobExchangeSearchField,60);
        jobExchangeSearchField.clear();
    }
    
    public String verifyJobExchangeName() throws InterruptedException {
        Thread.sleep(60);
        waitVisibleElement(jobExchangeOption,60);
        String jobExchangeName= getTextOfObject(jobExchangeOption).trim();
        System.out.println(jobExchangeName);
       return jobExchangeName;
    }
}
