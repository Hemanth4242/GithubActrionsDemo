package com.qt.sid.bdd.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApperenticeshipsPage {

	public WebDriver driver;

	By jobsexchange = By.xpath("//span[text()=' Job Exchange ']");
	By Apperenticeships = By.xpath("//div[@class='filter-list filter-btn']//button[2]");
	By Apperenticeship_course = By.xpath("//button[@class=\"btn-teritory-style1\"]");
	By App_share = By.xpath("//div[@class='apprenticeship-card-btn']//button[1]");

	By App_Whatsapp = By.xpath("//div[@class='social-btn']//a[1]");

	By App_Facebook = By.xpath("//div[@class='social-btn']//a[2]");

	By App_Twitter = By.xpath("//div[@class='social-btn']//a[3]");

	By App_Linkdin = By.xpath("//div[@class='social-btn']//a[4]");

	// By App_copyLink = By.xpath("//button[@class=\"mat-focus-indicator copy-link
	// mat-button mat-button-base\"]");

	By closewinodw = By.xpath("//div[@class='dialog-header']//button");

	//By Appclose = By.xpath("//div[@class='dialog-header']//button");

	By App_Industry = By.xpath("(//mat-accordion[@class='mat-accordion']//span)[2]");

	By App_Search = By.xpath("//input[@id='search']");

	By LocationTab = By.xpath("//div[@class='filters-main-block']//mat-expansion-panel[2]//mat-expansion-panel-header");

	By App_sector_List = By.xpath("//div[@class='panel-data-list']//p");

	By App_Location_list = By.xpath("//div[@class='panel-data-list ng-star-inserted']//p//mat-radio-button");

	By App_Rest = By.xpath("//div[@class='reset-applybtn']//button");

	By App_Tab1 = By.xpath(
			"(//button[@class='mat-focus-indicator btn-fav mat-button mat-button-base ng-star-inserted']//span)[1]");

	By App_Tab2 = By.xpath(
			"(//button[@class='mat-focus-indicator btn-fav mat-button mat-button-base ng-star-inserted']//span)[4]");

	By App_Tab3 = By.xpath(
			"(//button[@class='mat-focus-indicator btn-fav mat-button mat-button-base ng-star-inserted']//span)[7]");

	By App_Pagination_LastPage = By.xpath("(//a[@class='page-link'])[9]");

	By App_PAgination_part_number = By.xpath("(//a[@class='page-link'])[5]");

	By App_PAgination_FirstPage = By.xpath("(//a[@class='page-link'])[1]");

	By User_Profile = By.xpath("//span[(text()=' Kondabala ')]");

	By App_Logout = By.xpath("(//button[@class='mat-focus-indicator mat-menu-item'])[9]");
	
	By AllTab = By.xpath("//div[@class='filter-list filter-btn']//button");
	
	By AllPagination = By.xpath(" //div[@class='ng-star-inserted']//app-pagination//li");

	public ApperenticeshipsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	public void verifyAlltab() throws InterruptedException {
		
		driver.findElement(jobsexchange).click();
		
		Thread.sleep(2000);
		
		List<WebElement> AllTab1 = driver.findElements(AllTab);
		for (int i = 1; i < AllTab1.size(); i++) {

				WebElement list = AllTab1.get(i);
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(3000);

			}
		}

	public void clickonApperenticeship() throws InterruptedException {

		driver.findElement(jobsexchange).click();
		driver.findElement(Apperenticeships).click();
		System.out.println("Successfully clicked on Apperenticeships");

		Thread.sleep(3000);
	}

	public void clickonSearch() throws InterruptedException {
		WebElement Apperen_Search = driver.findElement(App_Search);
		Apperen_Search.click();
		Apperen_Search.sendKeys("Delhi");
		Thread.sleep(3000);
		Apperen_Search.clear();
		Thread.sleep(3000);

	}

//	public void clickonApp_Industry() throws InterruptedException {
//
//		driver.findElement(App_Industry).click();
//		System.out.println("Successfully clicked on industry");
//		Thread.sleep(2000);
//
//	}

	public void SelectIndustry() throws InterruptedException {

		List<WebElement> Industrylist = driver.findElements(App_sector_List);

		for (int i = 0; i < Industrylist.size(); i++) {

			if (i == 1) {
				WebElement list = Industrylist.get(i);
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(3000);
			}
		}

	}

	public void ClickonLocationTab() throws InterruptedException {

		WebElement locationtab = driver.findElement(LocationTab);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");

		js.executeScript("arguments[0].click()", locationtab);
		Thread.sleep(2000);

	}

	public void SelectAppLocation() throws InterruptedException {

		List<WebElement> ApperenticeLocations = driver.findElements(App_Location_list);
		for (int i = 0; i < ApperenticeLocations.size(); i++) {

			if (i == 1) {

				Thread.sleep(2000);
				WebElement Location = ApperenticeLocations.get(i);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,200)");

				js.executeScript("arguments[0].click()", Location);
				System.out.println("Sucessfully clicked on Location");
				Thread.sleep(2000);

			}

		}

	}

	public void selectApperenticeships() throws InterruptedException {

		List<WebElement> Apperenticelist = driver.findElements(Apperenticeship_course);

		for (int i = 0; i < Apperenticelist.size(); i++) {

			if (i == 1) {
				WebElement list = Apperenticelist.get(i);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(2000);

				// to handle window

				Set<String> wh = driver.getWindowHandles();
				Iterator<String> it = wh.iterator();
				String parentwindow = it.next();
				String Childwindow = it.next();
				driver.switchTo().window(Childwindow);
				Thread.sleep(4000);
				driver.close();
				driver.switchTo().window(parentwindow);
				Thread.sleep(2000);

			}
		}

	}

	public void App_Rest() throws InterruptedException {

		WebElement reset = driver.findElement(App_Rest);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", reset);

	}

	public void switchtab5000() throws InterruptedException {

		WebElement tab1 = driver.findElement(App_Tab1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,150)");

		js.executeScript("arguments[0].click()", tab1);
		Thread.sleep(3000);
		System.out.println("clicked on 0-5");

	}

	public void switchtab10000() throws InterruptedException {

		WebElement tab2 = driver.findElement(App_Tab2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,150)");

		js.executeScript("arguments[0].click()", tab2);
		Thread.sleep(3000);
		System.out.println("clicked on 5-10");

	}

	public void switchtab15000() throws InterruptedException {

		WebElement tab3 = driver.findElement(App_Tab3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,150)");

		js.executeScript("arguments[0].click()", tab3);
		Thread.sleep(3000);
		System.out.println("clicked on 10-15");

	}

	public void selectApp_share() throws InterruptedException {

		List<WebElement> Sharelist = driver.findElements(App_share);

		for (int i = 0; i < Sharelist.size(); i++) {

			if (i == 1) {

				WebElement share = Sharelist.get(i);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", share);
				Thread.sleep(2000);

			}

		}

	}

	public void whatsapp_navigation() throws InterruptedException {

		WebElement whatsapp = driver.findElement(App_Whatsapp);
		whatsapp.click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);
	

	}

	public void Facebook_Navigation() throws InterruptedException {

		WebElement facebook = driver.findElement(App_Facebook);
		facebook.click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);


	}

	public void Twitter_Navigation() throws InterruptedException {

		WebElement Twitter = driver.findElement(App_Twitter);
		Twitter.click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);

	}

	public void Linkdin_navigation() throws InterruptedException {

		WebElement Linkdin = driver.findElement(App_Linkdin);
		Linkdin.click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);

	}

	public void Verifysharewindow() throws InterruptedException {

		driver.findElement(closewinodw).click();
		Thread.sleep(1000);

	}
	
	
	public void verifyAllPagination() throws InterruptedException {
		
		List<WebElement> allpagination = driver.findElements(AllPagination);
		for (int i = 0; i < allpagination.size(); i++) {
		
				WebElement list = allpagination.get(i);
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,200)");
				js.executeScript("arguments[0].click()", list);
				js.executeScript("arguments[0].scrollIntoView();", list);
				Thread.sleep(3000);

			}
		
		
		
	}

	public void ClickonPagination() throws InterruptedException {

		WebElement Pagination_Last = driver.findElement(App_Pagination_LastPage);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		js.executeScript("arguments[0].scrollIntoView();", Pagination_Last);

		// js.executeScript("window.scrollTo(0,500)");
		js.executeScript("arguments[0].click()", Pagination_Last);
		js.executeScript("arguments[0].scrollIntoView();", Pagination_Last);
		System.out.println("Successfully clicked on Last page of PAgination");
		System.out.println("clicked on Last Page");
		Thread.sleep(3000);

		WebElement Pagination_particularNumber = driver.findElement(App_PAgination_part_number);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		
		// js.executeScript("window.scrollTo(0,500)");
		js2.executeScript("arguments[0].click()", Pagination_particularNumber);
		js2.executeScript("arguments[0].scrollIntoView();", Pagination_particularNumber);
		System.out.println("Successfully clicked on Page no 3 of PAgination");
		Thread.sleep(3000);

		WebElement Pagination_First = driver.findElement(App_PAgination_FirstPage);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].click()", Pagination_First);
		js1.executeScript("arguments[0].scrollIntoView();", Pagination_First);
		System.out.println("Successfully clicked on First page of PAgination");
		Thread.sleep(3000);

	}


}
