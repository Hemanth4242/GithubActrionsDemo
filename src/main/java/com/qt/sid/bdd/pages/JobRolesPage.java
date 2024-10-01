package com.qt.sid.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JobRolesPage extends BasePage {

    public WebDriver driver;
    @FindBy(xpath = "//span[text()=' Job Exchange ']")
    private WebElement Jobsexchange;

    @FindBy(xpath = "//span[text()='Skill Centre']")
    private WebElement SkillCentre;

    @FindBy(xpath = "//a[@href='/job-role/list']")
    private WebElement JobRoles;

    public JobRolesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String checkJobExchangepage() {
        return getTextOfObject(Jobsexchange);
    }
    public void clickSkillCentreLink() {
        waitTillTheElementIsVisibleAndClickable(SkillCentre);
        object_Click(SkillCentre);
    }
    public void clickJobRolesLink() {
        clickWithJavaScript(JobRoles);
    }

}
