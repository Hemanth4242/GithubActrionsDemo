package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class AwardingBodyPage extends BasePage {


    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;

    @FindBy(xpath = "//*[contains(text(),'Awarding Body')]//following::button[1]")
    public WebElement awardingBodyRegisterBtn;

    public AwardingBodyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAwardingBodyRegister(){
        scrollToElement(awardingBodyRegisterBtn);
        waitWebDriver(2000);
        object_Click(awardingBodyRegisterBtn);
    }



}
