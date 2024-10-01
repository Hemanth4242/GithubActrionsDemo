package com.qt.sid.bdd.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RegistrationPage {

	public WebDriver driver;

	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public long validnumber;

	By register = By.xpath("//button[@title='Click to Register / Login']");
	By tc=By.xpath("//div[@class='term-policy']//a[1]");
	By PP=By.xpath("//div[@class='term-policy']//a[2]");
	// By EnterMno = By.xpath("//input[@formcontrolname='MobileNumber']");
	By EnterMno = By.id("number");
	By invaliderror=By.xpath("//mat-error[@class='mat-error ng-star-inserted']");
	By clckenter = By.xpath("//div[@class='register-btn']//button");
	By regmobileno = By.xpath("//mat-error[@aria-live='polite']");
	By regwindow=By.xpath("//div[@class='header']//button");
	By otp1 = By.id("otp-0");
	By otp2 = By.id("otp-1");
	By otp3 = By.id("otp-2");
	By otp4 = By.id("otp-3");
	By otp5 = By.id("otp-4");
	By otp6 = By.id("otp-5");
	By verify = By.xpath("//div[@class='otp-verify-btn']//button");
	By wrongotp = By.xpath("//*[text()='Invalid or incorrect OTP']");
	By resend=By.xpath("//div[@class='otp-count-resend-btn']//button");
	By pin1 = By.id("pin-0");
	By pin2 = By.id("pin-1");
	By pin3 = By.id("pin-2");
	By pin4 = By.id("pin-3");
	By confpin1 = By.id("SecondPIN-0");
	By confpin2 = By.id("SecondPIN-1");
	By confpin3 = By.id("SecondPIN-2");
	By confpin4 = By.id("SecondPIN-3");
	By wrongpin = By.xpath("//*[text()='PIN does not match']");

	By setpin = By.xpath("//div[@class='pin-create-btn']//button");
	By closewindow = By.xpath("//div[@class='other-header']//button[2]");

	By name = By.xpath("//input[@formcontrolname='NickName']");
	By con = By.xpath(
			"/html/body/app-root/app-registration-container/app-registration/section/div/div/form/div/div/div[2]/button");
	By image = By.xpath("//*[@id=\"mat-dialog-0\"]/app-registration-confirm-box/div[1]/img");
	By uname = By.xpath(
			"/html/body/app-root/app-container/app-user-profile-dashboard/section/div/div/div[1]/div/app-user-info-detail/div/h5");

	public RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void ClickRegisterButton() {

		Assert.assertEquals(true, driver.findElement(register).isDisplayed());
		driver.findElement(register).click();
	}
	
	public void VerifyTClink() throws InterruptedException {
		
		Assert.assertEquals(true, driver.findElement(tc).isDisplayed());
		driver.findElement(tc).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	public void VerifyPolicylink() throws InterruptedException {
		
		Assert.assertEquals(true, driver.findElement(PP).isDisplayed());
		driver.findElement(PP).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	public void EnterInvalidmobilenumber() throws InterruptedException {
		
		driver.findElement(EnterMno).sendKeys("44444");
		//Assert.assertEquals(true, driver.findElement(invaliderror).isDisplayed());
		WebElement window=driver.findElement(regwindow);
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(window).click().build().perform();
		
	}
	public void EnterMobilenumber() throws IOException {
		/*
		 * fis = new FileInputStream(".\\src\\test\\resources\\TestData\\Test.xlsx"); wb
		 * = new XSSFWorkbook(fis); sh = wb.getSheet("Registration"); XSSFRow row =
		 * sh.getRow(1); XSSFCell cell = row.getCell(0); validnumber = (long)
		 * cell.getNumericCellValue();
		 */
		// driver.findElement(EnterMno).sendKeys(String.valueOf(validnumber));
		
		
		driver.findElement(EnterMno).sendKeys("1100000020");
	}

	public void submitclick() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(clckenter).click();
	}

	public void Regnumbervalidation() {

		WebElement r = driver.findElement(regmobileno);
		Assert.assertEquals(String.valueOf(validnumber), r.getText());
	}

	public void EnterOTP() throws InterruptedException {

		/*
		 * RestAssured.baseURI = "https://nsdc.uniteframework.io"; Response res =
		 * RestAssured.given().relaxedHTTPSValidation() .header("secret",
		 * "0cbbe8b0ec9133326b9e765b9def06aacbf2637bab622aa08f562e3c372e931b").when()
		 * .get("/v1/getOTP/6666666987/signup").then().extract().response();
		 * 
		 * String s = res.getBody().asString(); System.out.println("otp is : " + s);
		 * char c1 = s.charAt(0); char c2 = s.charAt(1); char c3 = s.charAt(2); char c4
		 * = s.charAt(3); char c5 = s.charAt(4); char c6 = s.charAt(5);
		 * 
		 * int o1 = Character.getNumericValue(c1); System.out.println(o1); int o2 =
		 * Character.getNumericValue(c2); int o3 = Character.getNumericValue(c3); int o4
		 * = Character.getNumericValue(c4); int o5 = Character.getNumericValue(c5); int
		 * o6 = Character.getNumericValue(c6); System.out.println(o6);
		 * driver.findElement(otp1).sendKeys(String.valueOf(o1));
		 * driver.findElement(otp2).sendKeys(String.valueOf(o2));
		 * driver.findElement(otp3).sendKeys(String.valueOf(o3));
		 * driver.findElement(otp4).sendKeys(String.valueOf(o4));
		 * driver.findElement(otp5).sendKeys(String.valueOf(o5));
		 * driver.findElement(otp6).sendKeys(String.valueOf(o6));
		 * 
		 */
		Thread.sleep(3000);
		WebElement op6 = driver.findElement(otp6);
		op6.click();
		op6.clear();
		WebElement op5 = driver.findElement(otp5);
		op5.click();
		op5.clear();
		WebElement op4 = driver.findElement(otp4);
		op4.click();
		op4.clear();
		WebElement op3 = driver.findElement(otp3);
		op3.click();
		op3.clear();
		WebElement op2 = driver.findElement(otp2);
		op2.click();
		op2.clear();
		WebElement op1 = driver.findElement(otp1);
		op1.click();
		op1.clear();

		Thread.sleep(3000);
		driver.findElement(otp4).clear();
		driver.findElement(otp3).clear();
		driver.findElement(otp2).clear();
		driver.findElement(otp1).clear();
		driver.findElement(otp1).sendKeys("1");
		driver.findElement(otp2).sendKeys("2");
		driver.findElement(otp3).sendKeys("3");
		driver.findElement(otp4).sendKeys("4");
		driver.findElement(otp5).sendKeys("5");
		driver.findElement(otp6).sendKeys("6");

	}

	public void VerifyOTP() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(verify).click();
	}

	public void VerifywithwrongOTP() {

		driver.findElement(otp1).sendKeys("1");
		driver.findElement(otp2).sendKeys("2");
		driver.findElement(otp3).sendKeys("3");
		driver.findElement(otp4).sendKeys("4");
		driver.findElement(otp5).sendKeys("5");
		driver.findElement(otp6).sendKeys("7");
		driver.findElement(verify).click();
		Assert.assertEquals(false, driver.findElement(wrongotp).isDisplayed());
	}
	
	public void Verifyresendbutton() {
		
		Assert.assertEquals(false, driver.findElement(resend).isEnabled());
	}

	public void SetPinnumber() throws IOException {

		/*
		 * fis = new FileInputStream(".\\src\\test\\resources\\TestData\\Test.xlsx"); wb
		 * = new XSSFWorkbook(fis); sh = wb.getSheet("Registration"); XSSFRow row1 =
		 * sh.getRow(1); XSSFCell cells = row1.getCell(1); int pinnumber1 = (int)
		 * cells.getNumericCellValue(); XSSFCell cells1 = row1.getCell(2); int
		 * pinnumber2 = (int) cells1.getNumericCellValue(); XSSFCell cells2 =
		 * row1.getCell(3); int pinnumber3 = (int) cells2.getNumericCellValue();
		 * XSSFCell cells3 = row1.getCell(4); int pinnumber4 = (int)
		 * cells3.getNumericCellValue();
		 */
		/*
		 * driver.findElement(pin1).sendKeys(String.valueOf(pinnumber1));
		 * driver.findElement(pin2).sendKeys(String.valueOf(pinnumber2));
		 * driver.findElement(pin3).sendKeys(String.valueOf(pinnumber3));
		 * driver.findElement(pin4).sendKeys(String.valueOf(pinnumber4));
		 */
		driver.findElement(pin1).sendKeys("1");
		driver.findElement(pin2).sendKeys("2");
		driver.findElement(pin3).sendKeys("3");
		driver.findElement(pin4).sendKeys("4");
	}

	public void SetConfirmPin() {

		driver.findElement(confpin1).sendKeys("1");
		driver.findElement(confpin2).sendKeys("2");
		driver.findElement(confpin3).sendKeys("3");
		driver.findElement(confpin4).sendKeys("4");
	}

	public void Verifywrongsetpin() {

		driver.findElement(confpin1).sendKeys("1");
		driver.findElement(confpin2).sendKeys("2");
		driver.findElement(confpin3).sendKeys("3");
		driver.findElement(confpin4).sendKeys("3");
		Assert.assertEquals(true, driver.findElement(wrongpin).isDisplayed());
	}

	public void clickaftersetpin() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(setpin).click();
	}

	public void closeAadharwindow() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(closewindow).click();
		Thread.sleep(5000);
		//driver.navigate().refresh();
		String expectedURL="https://uat-web-sid.betalaunch.in/user/profile/dashboard";
		Assert.assertEquals(expectedURL, driver.getCurrentUrl());
	}

	/*
	 * public void Enterusername() throws IOException {
	 * 
	 * fis = new FileInputStream(".\\src\\test\\resources\\TestData\\Test.xlsx"); wb
	 * = new XSSFWorkbook(fis); sh = wb.getSheet("Registration"); XSSFRow row1 =
	 * sh.getRow(1); XSSFCell cells = row1.getCell(5); String username =
	 * cells.getStringCellValue(); driver.findElement(name).sendKeys(username); }
	 * 
	 * public void clickaftername() {
	 * 
	 * driver.findElement(con).click(); }
	 * 
	 * public void verifysucessimage() throws InterruptedException {
	 * 
	 * Thread.sleep(3000); Assert.assertEquals(true,
	 * driver.findElement(image).isDisplayed()); }
	 * 
	 * public void verifyafterlogin() throws IOException, InterruptedException {
	 * 
	 * String expectedusername = driver.findElement(uname).getText();
	 * System.out.println(expectedusername); fis = new
	 * FileInputStream(".\\src\\test\\resources\\TestData\\Test.xlsx"); wb = new
	 * XSSFWorkbook(fis); sh = wb.getSheet("Registration"); XSSFRow row1 =
	 * sh.getRow(1); XSSFCell cells = row1.getCell(5); String actualusername =
	 * cells.getStringCellValue(); Thread.sleep(3000);
	 * Assert.assertEquals(actualusername, expectedusername);
	 * 
	 * }
	 */
}
