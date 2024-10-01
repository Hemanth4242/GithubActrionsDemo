package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicyPage extends BasePage{

	public WebDriver driver;

	@FindBy(xpath = "//h2[text()='About Skill India Digital']")
	private WebElement AboutUsText;

	@FindBy(xpath = "//h1[text()=' Privacy Policy ']")
	private WebElement PrivacyPolicyText;

	@FindBy(xpath = "//a[@href='/disclaimer']")
	private WebElement DisclaimerLink;

	public PrivacyPolicyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String checkPrivacyPolicyage()  {
		waitVisibleElement(PrivacyPolicyText,50);
		return getTextOfObject(PrivacyPolicyText);
	}
	public void clickDisclaimerLink() {
		waitTillTheElementIsVisibleAndClickable(DisclaimerLink);
		clickWithJavaScript(DisclaimerLink);
	}
}
