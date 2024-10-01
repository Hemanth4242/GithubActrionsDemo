package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SurveysPollPage  extends BasePage{
	
	public WebDriver driver;

	@FindAll({
			@FindBy(xpath = "(//*[@class='user-profile-dashboard-space'])[1]"),
			@FindBy(xpath = "//div[text()='View']"),
			@FindBy(xpath = "//div[text()=' View ']")
	})
	public WebElement viewSuveysBtn;
	
	@FindBy(xpath = "//a[text()=' Surveys&Polls ']")
	public WebElement surveysAndPollsText;
	
	@FindBy(xpath = "//button[text()=' Surveys ']")
	public WebElement surveyBtn;
	
	@FindBy(xpath = "//button[text()=' Polls ']")
	public WebElement pollsBtn;

	@FindBy(xpath = "//h3[text()='Surveys & Polls']")
	public WebElement verifySurvayPollsPage;
	
	

	public SurveysPollPage(WebDriver driver) {
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnViewSurveysAndPolls() {
		waitTillTheElementIsVisibleAndClickable(viewSuveysBtn);
		object_Click(viewSuveysBtn);
		waitWebDriver(2000);
	}
	
	public void clickOnSurveyBtn() {
		waitTillTheElementIsVisibleAndClickable(surveyBtn);
		object_Click(surveyBtn);
	}
	
	public void clickOnPollsBtn() {
		waitTillTheElementIsVisibleAndClickable(pollsBtn);
		object_Click(pollsBtn);
	}

	public String getTextSurvaysPollsPage() {
		return  getTextOfObject(verifySurvayPollsPage);
	}
	
	
}