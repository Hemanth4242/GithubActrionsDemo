package com.qt.sid.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerCounselingPage extends BasePage {

    public WebDriver driver;

    public CareerCounselingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Do you have any work experience?']")
    private WebElement careerCounselingPage;

    @FindBy(xpath = "//h5[contains(.,'Brief Job Description')]")
    private WebElement breafDescription;


    public String verifyLookupResultPage(){
        return getTextOfObject(careerCounselingPage);
    }

    public String getTextBrefDescription(){
        return breafDescription.getText();
    }

}
