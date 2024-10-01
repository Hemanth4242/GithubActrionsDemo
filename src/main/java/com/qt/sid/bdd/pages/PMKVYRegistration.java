package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PMKVYRegistration {
	
	public WebDriver driver;
	
	By Login = By.xpath("//button[@title='Click to Register / Login']");
	By Mno = By.id("number");
	By clck = By.xpath("//div[@class='register-btn']//button");
	By pin1 = By.id("pin-0");
	By pin2 = By.id("pin-1");
	By pin3 = By.id("pin-2");
	By pin4 = By.id("pin-3");
	By clck1 = By.xpath("//div[@class='pin-create-btn']//button");
    By pmkvylink=By.xpath("//a[@href='/pmkvy']");
    By applybutton=By.xpath("//button[@class='mat-focus-indicator skill-btn mat-button mat-button-base']");
	By personal=By.id("mat-expansion-panel-header-0");
	By salutation=By.xpath("//mat-select[@formcontrolname='Salutation']");
	By salutationvalue=By.xpath("//mat-option[@value='Mr']");
	By name=By.xpath("//input[@formcontrolname='FullName']");
	By gender=By.xpath("//mat-select[@formcontrolname='Gender']");
	By gendervalue=By.xpath("//mat-option[@role='option']");
	By religion=By.xpath("//mat-select[@formcontrolname='Religion']");
	By religionvalue=By.id("mat-option-13");
	By category=By.xpath("//mat-select[@formcontrolname='Category']");
	By categoryvalue=By.id("mat-option-18");
    By family=By.id("mat-expansion-panel-header-1");
	By Contact=By.id("mat-expansion-panel-header-2");
	By disability=By.id("mat-expansion-panel-header-3");
	By domicile=By.id("mat-expansion-panel-header-4");
	By address=By.id("mat-expansion-panel-header-5");
	By trainingdetails=By.id("mat-expansion-panel-header-6");
	
	
	public PMKVYRegistration(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public void Login() throws InterruptedException {
		
		driver.findElement(Login).click();
		driver.findElement(Mno).sendKeys("8919139193");
		driver.findElement(clck).click();
		driver.findElement(pin1).sendKeys("1");
		driver.findElement(pin2).sendKeys("2");
		driver.findElement(pin3).sendKeys("3");
		driver.findElement(pin4).sendKeys("4");
		driver.findElement(clck1).click();
		Thread.sleep(5000);
	}

	public void Clickpmkvylink() throws InterruptedException {
		
		Assert.assertEquals(true, driver.findElement(pmkvylink).isDisplayed());
		WebElement pm=driver.findElement(pmkvylink);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", pm);
		
	
	}
	
     public void Verifyapplynowbutton() {
    	 
    	Assert.assertEquals(true, driver.findElement(applybutton).isDisplayed());
    	 driver.findElement(applybutton).click();
    	 
     }
     
     public void Verifypersonaltab() throws InterruptedException {
    	 
    	 Assert.assertEquals(true, driver.findElement(personal).isDisplayed());
    	 driver.findElement(personal).click();
    	 Thread.sleep(2000);
	
     }
		
    public void Clickfamilytab() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement fam=driver.findElement(family);
		js.executeScript("arguments[0].click()", fam);	
		
		WebElement con=driver.findElement(Contact);
		js.executeScript("arguments[0].click()", con);	
		
		WebElement dis=driver.findElement(disability);
		js.executeScript("arguments[0].click()", dis);	
		
		WebElement dom=driver.findElement(domicile);
		js.executeScript("arguments[0].click()", dom);	
		
		Thread.sleep(3000);
		WebElement add=driver.findElement(address);
		js.executeScript("arguments[0].click()", add);	
		
		WebElement train=driver.findElement(trainingdetails);
		
		js.executeScript("arguments[0].click()", train);
	}
    
    public void Verifysalutationfield(){
    	
    	Assert.assertEquals(true, driver.findElement(salutation).isDisplayed());
    	
    	driver.findElement(salutation).click();
    }
    
    public void Selectsalutationvalue() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	driver.findElement(salutationvalue).click();
    	Assert.assertEquals(true, driver.findElement(salutation).isSelected());
    }
    
    public void Verifyname() {
    	
    	Assert.assertEquals(true, driver.findElement(name).isDisplayed());
    	Assert.assertEquals(true, driver.findElement(name).isEnabled());
    	driver.findElement(name).sendKeys("Chowdary");
    }
    
    public void Verifygender() {
    	
    	
    	Assert.assertEquals(true, driver.findElement(gender).isDisplayed());
    	driver.findElement(gender).click();
    }
    
    public void Selectgendervalue() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.findElement(gendervalue).click();
    	Assert.assertEquals(true, driver.findElement(gendervalue).isSelected());
    }
    
    public void VerifyReligion() {
    	
    	
    	Assert.assertEquals(true, driver.findElement(religion).isDisplayed());
    	driver.findElement(religion).click();
    }
    
    public void Selectreligionvalue() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.findElement(religionvalue).click();
    	Assert.assertEquals(true, driver.findElement(religion).isSelected());
    }
    
    public void Verifycategory() {
    	
    	
    	Assert.assertEquals(true, driver.findElement(category).isDisplayed());
    	driver.findElement(category).click();
    }
    
    public void Selectcategoryvalue() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.findElement(categoryvalue).click();
    	Assert.assertEquals(true, driver.findElement(category).isSelected());
    }
	
}
