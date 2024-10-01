package com.qt.sid.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class NotificationPage {

	public WebDriver driver;

	By userprofile_link = By.xpath("//span[text()=\" Kondabala \"]");
	//By userprofile_link_new = By.xpath("//span[text()=\" User \"]");
	By manage_alerts = By.xpath("//span[text()=\"Manage Alerts\"]");
	//By skill_courses_alerts = By.xpath("//a[text()=\" Skill Courses \"]");
	By skill_courses_alerts = By.xpath("//div[@class='manage-section-content']//div//a");
	By add_now_button = By.xpath("//span[text()=\" Add now \"]");
	By Notification_option = By.xpath("//span[@class=\"mat-checkbox-inner-container\"]");
	By save_button = By.xpath("//button[@class=\"btn-primary-style1\"]");
	By minimize_button = By.xpath("//div[@data-testid=\"minimizeButton\"]");
	By over_lay_container = By.xpath("//div[@class=\"cdk-overlay-container\"]");
	By notification_update_msg = By.xpath("//span[text()=\"Notification settings are updated\"]");
	By notificationlink = By.xpath("//button[@title='Notifications']");
	By notificationicon = By.xpath("//div[@class='setting-btn']//button");
	By Notificationchoice = By.xpath("//div[@class='checkbox-list']//mat-checkbox");
	By learnskill = By.xpath("//div[@class='checkbox-list mb-30']//mat-checkbox[1]");
	// By sector=By.xpath("//div[@class='row']//mat-form-field//mat-select");
	By sector = By.xpath(
			"//*[@id=\"cdk-accordion-child-3\"]/div/app-notification/div/div/div/app-notification-course/div/div/div[2]/div[1]/div/app-sector-dropdown/mat-form-field/div/div[1]/div[4]");
	By dropdownlist = By.xpath("//mat-option[@role='option']");
	By jobrole = By.xpath(
			"/html/body/app-root/app-container/app-notification/div/div/div[2]/app-notification-course/div/div[2]/div[2]/div/div[2]/app-job-role-dropdown/mat-form-field/div/div[1]/div[3]/mat-select/div");
    By selectnotification=By.xpath("//p[@class='mat-line']");
    By markall=By.xpath("//div[@class='setting-btn']//button[1]");
    
	public NotificationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void open_userprofile() throws InterruptedException {

		Thread.sleep(3000);
		Assert.assertEquals(true, driver.findElement(userprofile_link).isDisplayed());
		driver.findElement(userprofile_link).click();
		
	}
	
	public void open_managealerts() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement s = driver.findElement(manage_alerts);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", s);
		
	}
	
	public void ClickSkillCourses(){

		driver.findElement(skill_courses_alerts).click();
		
	}
	
	public void AddSkillCourses() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement add = driver.findElement(add_now_button);
		js.executeScript("arguments[0].click()", add);
		Thread.sleep(3000);
	}
	


	public void Verifynotificationicon() throws InterruptedException {

		Assert.assertEquals(true, driver.findElement(notificationicon).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(notificationicon).click();
	}
	
	public void Choosenotification_option() throws InterruptedException {

		List<WebElement> notificationoption = driver.findElements(Notification_option);
		for (int i = 0; i <=notificationoption.size(); i++) {

			if (i == 1 ) {

				WebElement list = notificationoption.get(i);
				System.out.println(list.getText());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(2000);
			}
			if (i == 2 ) {

				WebElement list = notificationoption.get(i);
				System.out.println(list.getText());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(2000);
			}

		}

	}

	public void Choosenotificationmode() throws InterruptedException {

		List<WebElement> notificationoption = driver.findElements(Notification_option);
		for (int i = 0; i <=notificationoption.size(); i++) {

			if (i == 3 ) {

				WebElement list = notificationoption.get(i);
				System.out.println(list.getText());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", list);
				Thread.sleep(2000);
			}
		}

	}

	public void Savebutton() {

		WebElement s = driver.findElement(save_button);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", s);
	}

	public void Clicksector() throws InterruptedException {
		//driver.switchTo().frame(0);
		WebElement sr = driver.findElement(sector);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", sr);

	}
	
	public void Verifynotification_msg() throws InterruptedException {

		boolean message = driver.findElement(notification_update_msg).isDisplayed();
		if (message) {
			System.out.println("Message is displayed");
		} else {
			System.out.println("Message is not dispalyed");
		}
		
		Thread.sleep(2000);
	
	}


	public void Selectsectorlist() throws InterruptedException {

		List<WebElement> seclist = driver.findElements(dropdownlist);
		for (int i = 0; i <= seclist.size(); i++) {
			if (i == 1) {
				seclist.get(i).click();
				Thread.sleep(3000);
			//	driver.switchTo().frame("//iframe[@title=\"Twitter settings iframe\"]");
				//driver.switchTo().frame("//iframe[@title=\"Twitter analytics iframe\"]");
				//driver.switchTo().parentFrame();
			}
		}

	}

	public void Clickjobrole() throws InterruptedException {
		WebElement jr = driver.findElement(jobrole);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", jr);

	}

	public void Selectjobrolelist() throws InterruptedException {

		List<WebElement> jobrrolelist = driver.findElements(dropdownlist);
		for (int i = 0; i <= jobrrolelist.size(); i++) {
			if (i < 2) {
				Thread.sleep(2000);
				WebElement jlist = jobrrolelist.get(i);
				Thread.sleep(3000);
				System.out.println(jlist.getText());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", jlist);
			}
		}

	}
	
	public void ClickNotificationicon() throws InterruptedException {
		
		
		WebElement n=driver.findElement(notificationlink);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", n);
		Thread.sleep(2000);
	}
	
	public void ClickMarkread() {
		
		driver.findElement(markall).click();
	}
	
	public void ClickNotififcationlist() throws InterruptedException {
		
		driver.findElement(selectnotification).click();
		Thread.sleep(2000);
	}

}
