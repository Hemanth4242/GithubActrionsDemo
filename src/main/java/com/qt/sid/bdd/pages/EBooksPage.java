package com.qt.sid.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EBooksPage extends BasePage {

    public WebDriver driver;

    @FindBy(xpath = "//h3[text()='eBooks']")
    private WebElement Ebooks;

    public EBooksPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String checkEbookspage() {
        return getTextOfObject(Ebooks);
    }


}
