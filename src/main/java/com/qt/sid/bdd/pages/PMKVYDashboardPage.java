package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PMKVYDashboardPage extends BasePage {


	WebDriver driver;

	public PMKVYDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Training Partner Summary']")
	private WebElement overviewVerify;

	@FindBy(xpath = "//span[text()='Select Candidate Status:']")
	private WebElement candidatesVerify;

	@FindBy(xpath = "//span[text()='Select Batches Status:']")
	private WebElement batchesVerify;

	@FindBy(xpath = "//span[text()='Training Centre Target']")
	private WebElement trainingCentereVerify;

	public boolean verifyOverview() {
		return overviewVerify.isDisplayed();
	}

	public boolean verifyCandidates() {
		Assert.assertTrue(candidatesVerify.isDisplayed());
		return candidatesVerify.isDisplayed();

	}

	public boolean verifyBatches() {
		Assert.assertTrue(batchesVerify.isDisplayed());
		return batchesVerify.isDisplayed();
	}

	public boolean verifyTrainingCentere() {
		Assert.assertTrue(trainingCentereVerify.isDisplayed());
		return trainingCentereVerify.isDisplayed();
	}


}
