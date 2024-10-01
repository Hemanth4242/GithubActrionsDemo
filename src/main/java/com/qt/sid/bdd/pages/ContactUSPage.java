package com.qt.sid.bdd.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class ContactUSPage extends BasePage {

    public WebDriver driver;
    public FileInputStream fis;
    public XSSFWorkbook wb;
    public XSSFSheet sh;

	/*@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement ContactUsText;*/

    @FindBy(id = "portal_name")
    private WebElement ContactUsText;

    public ContactUSPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String checkContactUSpage() {
        waitVisibleElement(ContactUsText, 50);
        return getTextOfObject(ContactUsText);
    }

}
