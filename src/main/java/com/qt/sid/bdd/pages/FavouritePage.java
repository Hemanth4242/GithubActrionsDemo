package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FavouritePage  extends BasePage{
	
	public WebDriver driver;
	
   @FindBy(xpath = "//button[text()=' Favourite ']")
   public WebElement favouriteSection;
   
   @FindBy(xpath = "//a[text()=' Favourite ']")
   public WebElement favouritePageText;
   
   @FindBy(xpath = "//button[text()=' All ']")
   public WebElement allSectionsBtn;
   
   @FindBy(xpath = "//button[text()=' Skill Courses ']")
   public WebElement skillCoursesSectionBtn;
   
   @FindBy(xpath = "//button[text()=' Job Exchange ']")
   public WebElement jobExchangeBtn;
   
   @FindBy(xpath = "//button[text()=' Skill Centre ']")
   public WebElement skillCentreBtn;
	

	public FavouritePage(WebDriver driver) {
			this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnFavourite() {
		scrollToElement(favouriteSection);
		waitTillTheElementIsVisibleAndClickable(favouriteSection);
		clickWithJavaScript(favouriteSection);
	}
	
	public void clickOnSkillCourses() {
		waitTillTheElementIsVisibleAndClickable(skillCoursesSectionBtn);
		object_Click(skillCoursesSectionBtn);
	}
	
	
	
	
}