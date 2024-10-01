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

public class DisclaimerPage extends BasePage{

	public WebDriver driver;

	@FindBy(xpath = "//h1[text()=' Disclaimer ']")
	private WebElement DisclaimerText;

	@FindAll({
			@FindBy(xpath = "//*[text()='Contact Us ']"),
			@FindBy(xpath = "//a[@href='https://support.nsdcindia.org/portal/en/signin']")
	})
	private WebElement ContactUsLink;

	@FindBy(xpath = "//h5[text()='Contact Us']")
	public WebElement ContactUsText;


	public DisclaimerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String checkDisclaimerpage()  {
		waitVisibleElement(DisclaimerText,50);
		return getTextOfObject(DisclaimerText);
	}

	public String checkContactUspage()  {
		waitVisibleElement(ContactUsText,50);
		return getTextOfObject(ContactUsText);
	}

	public void clickContactUsLink() {
		waitTillTheElementIsVisibleAndClickable(ContactUsLink);
		clickWithJavaScript(ContactUsLink);
	}

}
