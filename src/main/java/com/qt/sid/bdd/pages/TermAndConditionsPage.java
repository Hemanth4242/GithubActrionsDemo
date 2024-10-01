package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermAndConditionsPage extends BasePage{

	public WebDriver driver;

	@FindBy(xpath = "//h1[text()=' Terms of Use & Disclaimer ']")
	private WebElement TermsAndConditionsText;

	@FindAll({
			@FindBy(xpath = "//a[text()=' Privacy Policy ']"),
			@FindBy(xpath = "//a[@href='/privacy-policy']")
	})
	private WebElement PrivacyPoliceLink;

	public TermAndConditionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String checkTermsAndConditionspage()  {
		waitVisibleElement(TermsAndConditionsText,50);
		return getTextOfObject(TermsAndConditionsText);
	}
	public void clickPrivacyPoliceLink() {
		waitTillTheElementIsVisibleAndClickable(PrivacyPoliceLink);
		clickWithJavaScript(PrivacyPoliceLink);
	}
}
