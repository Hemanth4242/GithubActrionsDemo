package com.qt.sid.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PreferencePage {

	public WebDriver driver;  

	By userprofile_link = By.xpath("//span[text()=\" Kondabala \"]");
	//By userprofile_link_new = By.xpath("//span[text()=\" User \"]");
	By preference_button = By.xpath("//button[contains(.,'Preferences')]");
	By save_edit_button = By.xpath("(//button[@class=\"btn-primary-style1 ng-star-inserted\"])[1]");
	By location_select_icon = By.xpath("/html/body/app-root/app-wizard-container/app-user-profile-setting-prefrences/section/div[2]/div/div/mat-accordion/mat-expansion-panel[1]/div/div/app-account-preferences/div/div[1]/div/mat-form-field/div/div[1]/div[4]");
	By select_location = By.xpath("//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted\"]");
	By location_preference_msg = By.xpath("//span[contains(.,'Location preferences updated successfully')]");
	By Sector_select_icon = By.xpath("/html/body/app-root/app-wizard-container/app-user-profile-setting-prefrences/section/div[2]/div/div/mat-accordion/mat-expansion-panel[1]/div/div/app-account-preferences/div/div[2]/div/mat-form-field/div/div[1]/div[4]");
	By select_Sector = By.xpath("//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted\"]");
	By Sector_save_edit_button = By.xpath("(//button[@class=\"btn-primary-style1 ng-star-inserted\"])[2]");
	By Sector_preference_msg = By.xpath("//span[contains(.,'Sector preferences updated successfully')]");
	By selected_checkbox = By.xpath("//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted mat-pseudo-checkbox-checked\"]");
	//By selected_sector_checkbox = By.xpath("//*[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted mat-pseudo-checkbox-checked\"]");
	
	public PreferencePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void open_preferencepage() throws InterruptedException {

		WebElement s = driver.findElement(preference_button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", s);
		Thread.sleep(2000);
	}
	
	public void save_edit_preferred_location() throws InterruptedException {

		WebElement s = driver.findElement(save_edit_button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", s);
		Thread.sleep(2000);
	}
	
	public void select_location() throws InterruptedException {

		//Assert.assertEquals(true, driver.findElement(location_preference_button).isDisplayed());
		driver.findElement(location_select_icon).click();
		Thread.sleep(3000);
		List<WebElement> selectlocation = driver.findElements(select_location);
		for (int i = 0; i <=selectlocation.size(); i++) {
			if (i == 3 ) {
				WebElement list = selectlocation.get(i);
				System.out.println(list.getText());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(3000);
			}
		}
	}
	
	public void Verifylocation_pref_msg() throws InterruptedException {

		boolean message = driver.findElement(location_preference_msg).isDisplayed();
		if (message) {
			System.out.println("Message is displayed");
		} else {
			System.out.println("Message is not dispalyed");
		}
		
		Thread.sleep(2000);
		
	}
	
	public void select_Sector() throws InterruptedException {

		//Assert.assertEquals(true, driver.findElement(location_preference_button).isDisplayed());
		//driver.findElement(Sector_select_icon).click();
		WebElement sector = driver.findElement(Sector_select_icon);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", sector);
		Thread.sleep(3000);
		List<WebElement> selectlocation = driver.findElements(select_Sector);
		for (int i = 0; i <=selectlocation.size(); i++) {
			if (i <3 ) {
				WebElement list = selectlocation.get(i);
				System.out.println(list.getText());
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click()", list);
				Thread.sleep(2000);
			}
		}
	}
	
	public void save_preferred_Sector() throws InterruptedException {

		WebElement s = driver.findElement(Sector_save_edit_button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", s);
	}
	
	public void Verifysector_pref_msg() throws InterruptedException {

		boolean message = driver.findElement(Sector_preference_msg).isDisplayed();
		if (message) {
			System.out.println("Message is displayed");
		} else {
			System.out.println("Message is not dispalyed");
		}
		
		Thread.sleep(2000);
	}
	


	

	}
		


	
	
	

