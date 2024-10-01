package com.qt.sid.bdd.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sectorspage extends BasePage{

    public WebDriver driver;

    @FindBy(xpath = "//a[@href='skill-india-map']")
    private WebElement SkillIndiaMap;
    @FindBy(xpath = "//a[@href='/job-role/list']")
    private WebElement JobRoles;

    @FindAll({
            @FindBy(xpath = "//a[text()=' Recommendation ']"),
            @FindBy(xpath = "//a[@href='/wizard/career-counseling']")
    })
    private WebElement Recommendation;
    @FindBy(xpath = "//h3[text()='Construction']")
    private WebElement ConstructionText;
    public Sectorspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickJobRolesLink() {
        clickWithJavaScript(JobRoles);
    }
    public void clickSkillIndiaMapLink() {
        clickWithJavaScript(SkillIndiaMap);
    }
    public void clickRecommendationLink() {
        clickWithJavaScript(Recommendation);
    }
    public String checkSectorpage()  {
        waitVisibleElement(ConstructionText,50);
        return getTextOfObject(ConstructionText);
    }
}
