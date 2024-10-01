package com.qt.sid.bdd.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PMKVYPage {

	public WebDriver driver;

	By PMKVY = By.xpath("//li[@class='nav-item pmkvy-icon']//a");
	By dashboard = By.xpath("//div[@role='menu']//button[1]");
	By courses = By.xpath("//div[@role='menu']//button[2]");
	By coursecard = By.xpath("//div[@class='skill-course-card-v2']");
	By Centres = By.xpath("//div[@role='menu']//button[3]");
	By view_details_button = By.xpath("//button[@class='btn-teritory-style1']");
	By closetrainingwindow = By.xpath("//div[@class='training-btn']//button[3]");
	By Books = By.xpath("//div[@role='menu']//button[4]");

	public PMKVYPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void VerifyPMKVYtab() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(PMKVY).click();
	}

	public void Verifydashboard() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(dashboard).click();

	}

	public void Verifycourses() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(courses).click();

	}

	public void Selectcourse() throws InterruptedException {

		Thread.sleep(2000);
		List<WebElement> courselist = driver.findElements(coursecard);
		for (int i = 0; i <= courselist.size(); i++) {

			if (i == 0) {

				WebElement list = courselist.get(i);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(3000);
				break;

			}

		}

		driver.navigate().back();

	}

	public void Verifycentres() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(Centres).click();

	}

	public void Click_view_details_button() throws InterruptedException {

		Thread.sleep(2000);
		List<WebElement> viewdetails = driver.findElements(view_details_button);
		for (int i = 0; i <= viewdetails.size(); i++) {

			if (i == 1) {
				Thread.sleep(2000);
				WebElement list = viewdetails.get(i);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				//list.click();
			}
		}

	}

	public void VerifyTrainingcentrewindow() {

		driver.findElement(closetrainingwindow).click();
	}

	public void VerifyBooks() throws InterruptedException {

		
		driver.findElement(Books).click();
		Thread.sleep(2000);

	}

}
