package com.qt.sid.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GISPage {

	public WebDriver driver;
	
	By map = By.linkText("Skill India Map");
	// By SkillCentre = By.xpath("//li[@class='group'][1]//input");
	By filter = By.xpath("//ul[@id='checkboxes']//li[1]");
	By state = By.xpath("//mat-select[@placeholder='Select State']");
	By statelist = By.xpath("//mat-option[@role='option']");
	By district = By.xpath("//mat-select[@placeholder='Select District']");
	By districtlist = By.xpath("//mat-option[@role='option']");
	By apply = By.id("filtersearch");
	By closefilter = By.xpath("//div[@class='side-panel-filter']//button");
	By District = By.xpath("//li[@class='group'][2]//ul//li[1]//input");
	By State = By.xpath("//li[@class='group'][2]//ul//li[2]//input");
	By country = By.xpath("//li[@class='group'][2]//ul//li[3]//input");
	By Satelitemap = By.xpath("//a[@class='satstrtviewsty']//div");
	By Zoomin = By.id("zoomin");
	By Zoomout = By.id("zoomout");
	By jobExchange = By.id("employment_info");
	By Apprenticeships=By.id("apprenticeships_info");
	By Searchplace = By.xpath("//input[@placeholder='Search India Digital']");
	By clicksearch = By.id("btnsearch");
	//By list = By.xpath("//ul[@class='autocomplete']//li");
	By list=By.xpath("//li[@data-search=\"0\"]");
	// By Skillcentre = By.xpath("//mat-select[@role='combobox']");
	By Skillcentre = By.xpath("//div[@class='job-button-list mobview']//div[1]//div");
	// By centrelist =
	// By.xpath("//mat-option[@role='option']//mat-pseudo-checkbox");
	By centrelist = By.xpath("//mat-checkbox[@name='checkbox-overview']");
	By fullscreen = By.id("onFullScreenOpen");
	By halfscreen = By.id("offFullScreenClose");
	By direction = By.id("dir_logo");
	By title = By.xpath("//a[@data-trigger='#my_offcanvas1']");
	By Legend = By.xpath("//ul[@id='checkboxes']//li[2]");
	By Measurement = By.xpath("//ul[@id='checkboxes']//li[4]");
	By selectmeasurement = By.xpath("//mat-select[@placeholder='Select Measurement']");
	By measurementvalue = By.xpath("//mat-option[@value='LineString']");
	By selectvalue = By.xpath("(//*[@id=\"type\"])[2]");
	By unitvalue = By.xpath("//mat-option[@value='KM']");
	By clear = By.id("clear");
	By start = By.id("startmesrment");
	By location = By.xpath("//span[@class='mapsideicon']");

	public GISPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void VerifyGISTab() {

		driver.findElement(map).click();
	}

	public void Verifyfilter() {

		Assert.assertEquals(true, driver.findElement(filter).isDisplayed());
		driver.findElement(filter).click();

	}

	public void VerifyState() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(state).click();
		List<WebElement> slist = driver.findElements(statelist);
		for (int i = 0; i <= slist.size(); i++) {
			if (i == 1) {
				slist.get(i).click();
				
			}
		}

	}

	public void VerifyDistrict() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(district).click();
		List<WebElement> dlist = driver.findElements(districtlist);
		for (int i = 0; i <= dlist.size(); i++) {
			if (i == 1) {
				
				dlist.get(i).click();
			
			}
		}

	}

	public void Applyfilter() throws InterruptedException {

		
		driver.findElement(apply).click();
	}

	public void closefilter() {

		driver.findElement(closefilter).click();
	}

	public void VerifySatelitemap() throws InterruptedException {

		Thread.sleep(2000);
		Assert.assertEquals(true, driver.findElement(Satelitemap).isDisplayed());
		WebElement map = driver.findElement(Satelitemap);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", map);
	}

	public void VerifyZoomIn() {

		driver.findElement(Zoomin).click();
	}

	public void VerifyZoomOut() {

		driver.findElement(Zoomout).click();
	}

	public void Verifyjobexchange() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(jobExchange).click();
		/*
		 * Thread.sleep(3000); driver.findElement(jobExchange).click();
		 */
	}

	public void VerifyApprenticeships() {
		
		driver.findElement(Apprenticeships).click();
	}
	
	public void Verifysearch() throws InterruptedException {

		Assert.assertEquals(true, driver.findElement(Searchplace).isEnabled());
		driver.findElement(Searchplace).sendKeys("Delhi");
		
	}

	public void Selectplacelist() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(list).click();
		//driver.findElement(clicksearch).click();
		
	}

	public void VerifySkillCentre() throws InterruptedException {

		
		WebElement s = driver.findElement(Skillcentre);
		s.click();
	}

	public void SelectSkillCentre() throws InterruptedException {

		
		List<WebElement> values = driver.findElements(centrelist);
		for (int i = 0; i <= values.size(); i++) {
			if (i < 3) {

				values.get(i).click();
				Thread.sleep(2000);
			}
		}

	}

	public void Verifyfullscreenoption() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(fullscreen).click();
	}

	public void Verifyhalfscreenoption() {

		driver.findElement(halfscreen).click();
	}

	public void Verifydirectioninmap() {

		WebElement direct = driver.findElement(direction);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", direct);

	}

	public void Verifylegend() throws InterruptedException {

		driver.findElement(Legend).click();
		
	}

	public void VerifyMeasurement() throws InterruptedException {

		driver.findElement(Measurement).click();
	
	}

	public void SelectMeasurementvalue() {

		driver.findElement(selectmeasurement).click();
		driver.findElement(measurementvalue).click();
	}

	public void SelectUnitvalue() {

		driver.findElement(selectvalue).click();
		driver.findElement(unitvalue).click();
	}

	public void startmeasurement() {

		driver.findElement(start).click();
	}

	public void Verifylocationbutton() throws InterruptedException {

		driver.findElement(location).click();
		Thread.sleep(2000);
	}
}
