package com.qt.sid.bdd.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LeaningResourcesPage {

	public WebDriver driver;

	By learning = By.id("learning");
	By videotab = By.xpath("//div[@class='filter-list filter-btn pt-1']//button[2]");
	By documentab = By.xpath("//div[@class='filter-list filter-btn pt-1']//button[3]");
	By Contenttype = By.xpath("(//div[@class='panel-data-list'])[1]//p//mat-checkbox");
	By contentcategory = By
			.xpath("//div[@class='filters-main-block']//mat-expansion-panel[2]//mat-expansion-panel-header");
	By Categorylist = By.xpath("(//div[@class='panel-data-list'])[2]//p//mat-checkbox");
	By Launguage = By.xpath(
			"/html/body/app-root/app-container/app-content-list/section/div[2]/div[2]/div[1]/div[2]/div/div[2]/mat-accordion/mat-expansion-panel[3]/mat-expansion-panel-header/span[1]/mat-panel-title");
	By Languagelist = By.xpath("(//div[@class='panel-data-list'])[3]//p//mat-checkbox");
	By Reset = By.xpath("(//div[@class='reset-got-mobile'])//button[1]");
	By contentcard = By.xpath("//div[@class='skill-course-card-v2']");
	// By download = By.xpath("(//button[@class='btn-teritory-style1'])[1]");
	By download = By.xpath("//div[@class='nsdc']//button[1]");
	// By share = By.xpath("(//div[@class='skill-course-card-v2'])[1]//button[1]");
	By share = By.xpath("//div[@class='skill-course-card-v2']//button[1]");
	By whatsapp = By.xpath("//div[@class='social-btn']//a[1]");
	By facebook = By.xpath("//div[@class='social-btn']//a[2]");
	By twitter = By.xpath("//div[@class='social-btn']//a[3]");
	By linkedln = By.xpath("//div[@class='social-btn']//a[4]");
	By closewinodw = By.xpath("//div[@class='dialog-header']//button");

	public LeaningResourcesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void ClickLearningresourcebutton() {

		driver.findElement(learning).click();
	}

	public void ClickVideotab() {

		driver.findElement(videotab).click();
	}

	public void ClickDocumenttab() {

		driver.findElement(documentab).click();
	}

	public void ChooseContenttype() throws InterruptedException {

		Thread.sleep(2000);
		List<WebElement> contentlist = driver.findElements(Contenttype);
		for (int i = 0; i < contentlist.size(); i++) {

			if (i == 1) {

				Thread.sleep(2000);
				contentlist.get(i).click();
				break;
			}
		}

	}

	public void ClickContentcategory() throws InterruptedException {

		Thread.sleep(2000);
		WebElement content=driver.findElement(contentcategory);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", content);
		
	}

	public void Choosecontentcategory() {

		List<WebElement> categorylist = driver.findElements(Categorylist);
		for (int i = 0; i < categorylist.size(); i++) {
			if (i == 1) {
				WebElement cclist = categorylist.get(i);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", cclist);
				break;
			}
		}
	}

	public void ClickLaunguage() throws InterruptedException {

		Thread.sleep(2000);
		WebElement l = driver.findElement(Launguage);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", l);

	}

	public void ChooseLanguage() {

		List<WebElement> languagelist = driver.findElements(Languagelist);

		for (int i = 0; i < languagelist.size(); i++) {

			if (i == 1) {

				languagelist.get(i).click();
				break;
			}
		}
	}

	public void ClickReset() throws InterruptedException {

		Thread.sleep(2000);
		WebElement reset=driver.findElement(Reset);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", reset);
		
	}

	public void ClickContentcard() throws InterruptedException {

		Thread.sleep(2000);
		List<WebElement> contentcardlist = driver.findElements(contentcard);

		for (int i = 0; i < contentcardlist.size(); i++) {

			if (i == 1) {
				contentcardlist.get(i).click();
			}
			
		}
	}

	public void Clickdownloadbutton() throws InterruptedException {

		Thread.sleep(2000);
		WebElement dwnld=driver.findElement(download);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", dwnld);
	}

	public void Clicksharebutton() throws InterruptedException {

		Thread.sleep(2000);
		WebElement shre=driver.findElement(share);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", shre);
	}

	public void VerifysharethroughWhatsapp() throws InterruptedException {

		Assert.assertEquals(true, driver.findElement(whatsapp).isDisplayed());
		driver.findElement(whatsapp).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);
	}

	public void Verifysharethroughfacebook() throws InterruptedException {

		
		Assert.assertEquals(true, driver.findElement(facebook).isDisplayed());
		driver.findElement(facebook).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentwindow);
	}

	public void VerifysharethroughTwitter() throws InterruptedException {

		
		Assert.assertEquals(true, driver.findElement(twitter).isDisplayed());
		driver.findElement(twitter).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentwindow);
	}

	public void VerifysharethroughLinkedln() throws InterruptedException {

	
		Assert.assertEquals(true, driver.findElement(linkedln).isDisplayed());
		driver.findElement(linkedln).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentwindow);
	}

	public void Verifysharewindow() throws InterruptedException {

		driver.findElement(closewinodw).click();
		Thread.sleep(1000);
	}

}
