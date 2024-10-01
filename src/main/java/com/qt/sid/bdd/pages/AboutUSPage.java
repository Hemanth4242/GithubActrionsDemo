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

import java.io.FileInputStream;
import java.io.IOException;

public class AboutUSPage extends BasePage {

    public WebDriver driver;
    @FindBy(xpath = "//h2[text()='About Skill India Digital']")
    private WebElement AboutUsText;

    @FindAll({
            @FindBy(xpath = "//a[text()=' Terms of use ']"),
            @FindBy(xpath = "//a[@href='/terms-condition']")
    })
    private WebElement TermAndConditionLink;

    public AboutUSPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String checkAboutUspage() {
        waitVisibleElement(AboutUsText, 50);
        return getTextOfObject(AboutUsText);
    }
    public void clickTermAndConditions() {
        waitTillTheElementIsVisibleAndClickable(TermAndConditionLink);
        clickWithJavaScript(TermAndConditionLink);
    }

}
