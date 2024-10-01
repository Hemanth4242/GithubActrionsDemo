package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SettingsPage  extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Preferences']")
	public WebElement preferencesBtn;
	
	@FindBy(xpath = "//a[text()=' Settings ']")
	public WebElement settingsText;
	
	@FindBy(xpath = "//mat-panel-title[text()=' Account Preferences ']")
	public WebElement accountPreferencesSection;
	
	@FindBy(xpath = "//mat-panel-title[text()=' Change Password ']")
	public WebElement changePasswordSection;
	
	@FindBy(xpath = "//mat-panel-title[text()=' Privacy Consent ']")
	public WebElement privacyConsentSection;
	
	@FindBy(xpath = "//mat-panel-title[text()=' Manage Alerts']")
	public WebElement manageAlertsSection;
	
	

	public SettingsPage(WebDriver driver) {
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	
	public void clickOnPreferences() {
		scrollToElement(preferencesBtn);
		waitTillTheElementIsVisibleAndClickable(preferencesBtn);
		object_Click(preferencesBtn);
	}
	
	
	
}