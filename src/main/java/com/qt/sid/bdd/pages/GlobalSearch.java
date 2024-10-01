package com.qt.sid.bdd.pages;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobalSearch {

	public WebDriver driver;
	public FileInputStream fis;

	By Searchicon = By.xpath("//div[@class=\"responsive-menu d-flex\"]//button");
	By globalsearch = By.id("searchInput");
	//By search = By.xpath("(//span[@class=\"mat-button-wrapper\"])[8]");
	By search=By.xpath("//div[@class='search-popup ng-star-inserted']//mat-form-field//button[1]");
	By courseview=By.xpath("//div[@role='tabpanel']//app-skill-course-card-v2//div[1]");
	By jobview=By.xpath("//div[@role='tabpanel']//app-job-card//a/div");
	By viewall_button = By.xpath("(//span[text()=\" View All \"])[1]");
	By viewdetails_button = By.xpath("(//span[text()=\" View Details \"])[1]");
	By delhi_location = By.xpath("//div[@role='tabpanel']//app-job-card//a/div");
	By Maharashtra_location = By.xpath("//div[@role='tabpanel']//app-job-card//a/div");
	By no_search_found = By.xpath("//p[text() = \"We're sorry! There's no search result found at the moment\"]");

	public GlobalSearch(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void coursesearch() throws InterruptedException {

		driver.findElement(Searchicon).click();
		driver.findElement(globalsearch).sendKeys("Pickle");
		Thread.sleep(3000);
		driver.findElement(search).click();
		driver.findElement(courseview).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void employmentsearch() throws InterruptedException {

		driver.findElement(Searchicon).click();
		driver.findElement(globalsearch).sendKeys("agriculture");
		Thread.sleep(3000);
		driver.findElement(search).click();
		driver.findElement(jobview).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void skillcentresearch() throws InterruptedException {

		driver.findElement(Searchicon).click();
		driver.findElement(globalsearch).sendKeys("electronics");
		Thread.sleep(3000);
		driver.findElement(search).click();
		driver.findElement(viewall_button).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void joblocationsearch() throws InterruptedException {

		driver.findElement(Searchicon).click();
		driver.findElement(globalsearch).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.findElement(search).click();
		WebElement vd = driver.findElement(delhi_location);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", vd);
		js.executeScript("arguments[0].click()", vd);
		// driver.findElement(viewdetails_button).click();
		//Thread.sleep(5000);
//		boolean location = driver.findElement(delhi_location).isDisplayed();
//		if (location) {
//			System.out.println("Element is dispalyed");
//		} else {
//			System.out.println("Element is not dispalyed");
//		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void longtext_search() throws InterruptedException {

		driver.findElement(Searchicon).click();
		driver.findElement(globalsearch).sendKeys("I want job in Pune");
		Thread.sleep(3000);
		driver.findElement(search).click();
		Thread.sleep(2000);
		WebElement vd = driver.findElement(Maharashtra_location);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", vd);
		js.executeScript("arguments[0].click()", vd);
		// driver.findElement(viewdetails_button).click();
//		Thread.sleep(5000);
//		boolean location = driver.findElement(Maharashtra_location).isDisplayed();
//		if (location) {
//			System.out.println("Element is dispalyed");
//		} else {
//			System.out.println("Element is not dispalyed");
//		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void randomword_search() throws InterruptedException {

		driver.findElement(Searchicon).click();
		driver.findElement(globalsearch).sendKeys("rtyrytryrytrytr");
		Thread.sleep(3000);
		driver.findElement(search).click();
		boolean location = driver.findElement(no_search_found).isDisplayed();
		if (location) {
			System.out.println("Element is dispalyed");
		} else {
			System.out.println("Element is not dispalyed");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
	}
}
