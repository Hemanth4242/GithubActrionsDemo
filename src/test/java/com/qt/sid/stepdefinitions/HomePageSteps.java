package com.qt.sid.stepdefinitions;

import com.qt.sid.bdd.helper.LoggerHelper;
import com.qt.sid.bdd.pages.*;

import com.qt.sid.bdd.utils.FileReaderManager;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qt.sid.bdd.utils.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePageSteps extends BasePage{

    TestContext testContext;
    HomePage homePage;
    WebDriver driver;
    LandingPage landingPage;
    RecommendationPage recommendationPage;

    JobExchangePage jobExchangePage;

    SkillCoursesPage skillCoursesPage;

    SkillCentrepage skillCentrepage;

    SkillIndiaMapPage skillIndiaMapPage;

    AboutUSPage aboutUSPage;

    TermAndConditionsPage termAndConditionsPage;

    PrivacyPolicyPage privacyPolicyPage;

    DisclaimerPage disclaimerPage;

    ContactUSPage contactUSPage;

    SchemesPage schemesPage;
    EBooksPage eBooksPage;

    Sectorspage sectorspage;
     
    ProfilePage profilePage;
    
    SurveysPollPage surveysPollPage;

    MyDashboard myDashboard;

    MyDashboardPage myDashboardPage;

    LoginPage loginPage;


   Logger log = LoggerHelper.getLogger(LoggerHelper.class);

    public HomePageSteps(TestContext context) {
        testContext = context;
        landingPage = testContext.getPageObjectManager().getlandingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = testContext.getDriverManager().getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        recommendationPage = testContext.getPageObjectManager().getRecommendationPage();
        skillCoursesPage = testContext.getPageObjectManager().getSkillCoursesPage();
        jobExchangePage = testContext.getPageObjectManager().getJobExchangePage();
        skillCentrepage = testContext.getPageObjectManager().getSkillCentrepage();
        skillIndiaMapPage = testContext.getPageObjectManager().getSkillIndiaMapPage();
        aboutUSPage = testContext.getPageObjectManager().getAboutUSPage();
        termAndConditionsPage = testContext.getPageObjectManager().getTermAndConditionsPage();
        privacyPolicyPage = testContext.getPageObjectManager().getPrivacyPolicyPage();
        disclaimerPage = testContext.getPageObjectManager().getDisclaimerPage();
        contactUSPage = testContext.getPageObjectManager().getContactUSPage();
        schemesPage = testContext.getPageObjectManager().getSchemesPage();
        eBooksPage = testContext.getPageObjectManager().getEBookspage();
        sectorspage = testContext.getPageObjectManager().getSectorspage();
        profilePage = testContext.getPageObjectManager().getprofilePage();
        surveysPollPage = testContext.getPageObjectManager().getsurveysPollPage();
        myDashboard= testContext.getPageObjectManager().getmyDashboard();
        myDashboardPage =  testContext.getPageObjectManager().getmyDashboardPage();
        loginPage= testContext.getPageObjectManager().getLoginPage();


    }

    @Given("i navigate to Landing page")
    public void i_navigateToLandingPage() {
        landingPage.navigateTo_LoginPage();

    }

    @And("I verify the the HomePage")
    public void i_verify_the_Homepage() {
        Assert.assertTrue(isElementPresent(loginPage.assertHomepage),"User not redirected to Homepage");
        log.info("User is on HomePage");
        System.out.println("Hi Succesfully came");

    }


    @Given("i navigate to Landing page to handle webchatbot")
    public void i_navigate_to_landing_page_to_handle_webchatbot() {
        landingPage.navigateTo_LoginPage();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='haptik-xdk']")));

        try{

            clickWithJavaScript(driver.findElement(By.xpath("//*[@class='minimized-view-v2-icon open']")));

        }catch (Exception e){
            clickWithJavaScript(driver.findElement(By.xpath("//*[@class='minimized-view-v2-icon ']")));

            waitWebDriver(2000);
            clickWithJavaScript(driver.findElement(By.xpath("//*[@class='minimized-view-v2-icon open']")));
        }

        driver.switchTo().defaultContent();
        waitWebDriver(2000);
    }

    @Then("I verify the Header Links")
    public void i_verify_the_header_links(io.cucumber.datatable.DataTable dataTable) {
        List<String> listData = dataTable.asList(String.class);
        String actualRecommendation = null;
        String expectedRecommendation = (String) listData.get(0);

        if (expectedRecommendation.equalsIgnoreCase("Recommendation")) {
            landingPage.clickRecommendationLink();
            actualRecommendation = recommendationPage.checkRecommendationpage();
            Assert.assertEquals(expectedRecommendation, actualRecommendation);
        }

        String actualSkillCourses = null;
        String expectedSkillCourses = (String) listData.get(1);

        if (expectedSkillCourses.equalsIgnoreCase("Skill Courses")) {
            recommendationPage.clickSkillCourseLink();
            skillCoursesPage.waitTillElementOfSkillCourse();
            actualSkillCourses = skillCoursesPage.checkSkillCoursepage();
            Assert.assertEquals(expectedSkillCourses, actualSkillCourses);

        }

        String actualJobExange = null;
        String expectedJobExchange = (String) listData.get(2);
        if (expectedJobExchange.equalsIgnoreCase("Job Exchange")) {
            skillCoursesPage.clickJobExchangeLink();
            actualJobExange = jobExchangePage.checkJobExchangepage();
            Assert.assertEquals(expectedJobExchange, actualJobExange);

        }

        String actualSkillCentre = null;
        String expectedSkillCentre = (String) listData.get(3);
        if (expectedSkillCentre.equalsIgnoreCase("Skill Centre")) {
            jobExchangePage.clickSkillCentreLink();
            actualSkillCentre = skillCentrepage.checkJobSkillCentrepage();
            Assert.assertEquals(expectedSkillCentre, actualSkillCentre);

        }

        String actualSkillIndiaMap = null;
        String expectedSkillIndiaMap = (String) listData.get(4);
        if (expectedSkillIndiaMap.equalsIgnoreCase("Skill India Map")) {
            skillCentrepage.clickJobIndiaMapLink();
            actualSkillIndiaMap = skillIndiaMapPage.checkSkillIndiaMapPage();
            Assert.assertEquals(expectedSkillIndiaMap, actualSkillIndiaMap);

        }

    }

    @Then("I verify the Footer Links social media links")
    public void i_verify_the_footer_links_social_media_links(io.cucumber.datatable.DataTable dataTable) {

        landingPage.scrollToPageEnd();
        List<String> listData = dataTable.asList(String.class);

        String actualFaceBookLink = null;
        String expectedFaceBookLink = (String) listData.get(0);



        if (expectedFaceBookLink.equalsIgnoreCase("FaceBook")) {
            landingPage.clickFaceBookLink();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(3000);
                    Assert.assertTrue(isElementPresent(landingPage.facebookPageText));
                   // Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getFaceBookTextFromProperty(), driver.getCurrentUrl());
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }
            driver.switchTo().window(parent);

        }

        landingPage.scrollToPageEnd();
        String actualLinkedIn = null;
        String expectedLinkedIn = (String) listData.get(1);

        if (expectedLinkedIn.equalsIgnoreCase("LinkedIn")) {
            landingPage.clickLinkedInLink();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(3000);
                    Assert.assertTrue(isElementPresent(landingPage.linkedInlogo));
                    //Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getLinkedInTextFromProperty(), driver.getCurrentUrl());
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }

            driver.switchTo().window(parent);

        }

        landingPage.scrollToPageEnd();
        String actualTwitter = null;
        String expectedTwitter = (String) listData.get(2);
        if (expectedTwitter.equalsIgnoreCase("Twitter")) {
            landingPage.clickTwitterLink();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(5000);
                    Assert.assertTrue(isElementPresent(landingPage.twitterLogo));
                    //Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getTwitterTextFromProperty()), " Skill india map is not displayed its return false");
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }
               waitWebDriver(4000);
                driver.switchTo().window(parent);

            }
            landingPage.scrollToPageEnd();
            String actualYoutube = null;
            String expectedYoutube = (String) listData.get(3);
            if (expectedYoutube.equalsIgnoreCase("Youtube")) {
                landingPage.clickYoutubeLink();
                waitWebDriver(3000);
                driver.switchTo().alert().accept();
                waitWebDriver(7000);
                String parent = driver.getWindowHandle();
                Set<String> s = driver.getWindowHandles();


                Iterator<String> I2 = s.iterator();

                while (I2.hasNext()) {

                    String child_window = I2.next();


                    if (!parent.equals(child_window)) {
                        driver.switchTo().window(child_window);
                        waitWebDriver(5000);
                        Assert.assertTrue(isElementPresent(landingPage.youtubeLogo));
                        //Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getYouTubeTextFromProperty(), driver.getCurrentUrl());
                        waitWebDriver(3000);
                        driver.close();
                        waitWebDriver(4000);
                    }

                }

                driver.switchTo().window(parent);
            }

    }

    @Then("I verify the Footer Links of Who we are")
    public void i_verify_the_footer_links_of_who_we_are(io.cucumber.datatable.DataTable dataTable) {
        landingPage.scrollToPageEnd();
        List<String> listData = dataTable.asList(String.class);

        String actualABOUTUS = null;


        String expectedABOUTUS = (String) listData.get(0);
        if (expectedABOUTUS.equalsIgnoreCase("ABOUT US")) {
            landingPage.clickAboutUsLink();
            actualABOUTUS = aboutUSPage.checkAboutUspage();
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getAboutUSTextFromProperty(), actualABOUTUS);
        }

        landingPage.scrollToPageEnd();
        String actualTERMSCONDITIONS = null;
        String expectedTERMSCONDITIONS = (String) listData.get(1);
        if (expectedTERMSCONDITIONS.equalsIgnoreCase("TERMS & CONDITIONS")) {
            aboutUSPage.clickTermAndConditions();
            actualTERMSCONDITIONS = termAndConditionsPage.checkTermsAndConditionspage();
            System.out.print("temr" + actualTERMSCONDITIONS);
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getTermsAndConditionsTextFromProperty(), actualTERMSCONDITIONS.trim());

        }
        landingPage.scrollToPageEnd();
        String actualPRIVACYPOLICY = null;
        String expectedPRIVACYPOLICY = (String) listData.get(2);
        if (expectedPRIVACYPOLICY.equalsIgnoreCase("PRIVACY POLICY")) {
            termAndConditionsPage.clickPrivacyPoliceLink();
            actualPRIVACYPOLICY = privacyPolicyPage.checkPrivacyPolicyage();
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getPrivacyPolicyTextFromProperty(), actualPRIVACYPOLICY);

        }
        landingPage.scrollToPageEnd();
        String actualDISCLAIMER = null;
        String expectedDISCLAIMER = (String) listData.get(3);
        if (expectedDISCLAIMER.equalsIgnoreCase("DISCLAIMER")) {
            privacyPolicyPage.clickDisclaimerLink();
            actualDISCLAIMER = disclaimerPage.checkDisclaimerpage();
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getDisclaimerTextFromProperty(), actualDISCLAIMER);

        }

        landingPage.scrollToPageEnd();
        String actualCONTACTUS = null;
        String expectedCONTACTUS = (String) listData.get(4);

        if (expectedCONTACTUS.equalsIgnoreCase("CONTACT US")) {
            disclaimerPage.clickContactUsLink();
            actualCONTACTUS = disclaimerPage.checkContactUspage();
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getContactUsTextFromProperty(), actualCONTACTUS);
        }

    }

    @Then("I verify the footers Links of What We offer")
    public void i_verify_the_footers_links_of_what_we_offer(io.cucumber.datatable.DataTable dataTable) {
        landingPage.scrollToPageEnd();
        List<String> listData = dataTable.asList(String.class);

        String actualSkillCourses = null;
        String expectedSkillCourses = (String) listData.get(0);

        if (expectedSkillCourses.equalsIgnoreCase("Skill Courses")) {
            landingPage.clickCoursesLink();
            actualSkillCourses = skillCoursesPage.checkSkillCoursepage();
            Assert.assertEquals(expectedSkillCourses, actualSkillCourses);

        }

        landingPage.scrollToPageEnd();
        String actualSkillCentre = null;
        String expectedSkillCentre = (String) listData.get(1);
        if (expectedSkillCentre.equalsIgnoreCase("Skill Centre")) {
            skillCoursesPage.clickSkillCentreLink();
            actualSkillCentre = skillCentrepage.checkJobSkillCentrepage();
            Assert.assertEquals(expectedSkillCentre, actualSkillCentre);

        }
        
        landingPage.scrollToPageEnd();
        String actualJobExange = null;
        String expectedJobExchange = (String) listData.get(2);
        if (expectedJobExchange.equalsIgnoreCase("Job Exchange")) {
            skillCentrepage.clickJobExchangeLink();
            actualJobExange = jobExchangePage.checkJobExchangepage();
            Assert.assertEquals(expectedJobExchange, actualJobExange);

        }
        waitWebDriver(4000);
        
        landingPage.scrollToPageEnd();
        String actualPMKVYScheme = null;
        String expectedRecommendation = (String) listData.get(3);

        if (expectedRecommendation.equalsIgnoreCase("PMKVY4.0")) {
            jobExchangePage.clickPMKVYLink();
            actualPMKVYScheme = schemesPage.checkSchemespage();
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getPMKVY4SchemeTextFromProperty(), actualPMKVYScheme);
        }
    /*
        landingPage.scrollToPageEnd();
        String actualeBooks = null;
        String expectedeBooks = (String) listData.get(4);
        if (expectedeBooks.equalsIgnoreCase("eBooks")) {
            schemesPage.clickEBooksLink();
            actualeBooks = eBooksPage.checkEbookspage();
            Assert.assertEquals(expectedeBooks, actualeBooks);

        }
*/
    }



    @Then("I verify the Footer Links other sectors links")
    public void i_verify_the_footer_links_other_sectors_links(io.cucumber.datatable.DataTable dataTable) {
        landingPage.scrollToPageEnd();
        List<String> listData = dataTable.asList(String.class);

        String actualSectors = null;
        String expectedSectors = (String) listData.get(0);
        String url = null;
        if (expectedSectors.equalsIgnoreCase("Sectors")) {
            landingPage.clickSectorsLink();
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getSectorsTextFromProperty(),sectorspage.checkSectorpage() );

        }

        landingPage.scrollToPageEnd();
        String actualJobRoles  = null;
        String expectedJobRoles = (String) listData.get(1);
        if (expectedJobRoles.equalsIgnoreCase("Job Roles")) {
            landingPage.clickSectorsLink();
            sectorspage.clickJobRolesLink();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getJobRolesTextFromProperty(), driver.getCurrentUrl());

        }
        landingPage.scrollToPageEnd();
        String actualSkillIndiaMap = null;
        String expectedSkillIndiaMap = (String) listData.get(2);
        if (expectedSkillIndiaMap.equalsIgnoreCase("Skill India Map")) {
            sectorspage.clickSkillIndiaMapLink();
            sectorspage.clickSkillIndiaMapLink();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            Assert.assertTrue(driver.getCurrentUrl().contains(FileReaderManager.getInstance().getConfigReader().getSkillIndiaMapTextFromProperty())," Skill india map is not displayed its return false");

        }
        landingPage.scrollToPageEnd();
        String actualRecommendation = null;
        String expectedRecommendation = (String) listData.get(3);

        if (expectedRecommendation.equalsIgnoreCase("Recommendation")) {
            sectorspage.clickRecommendationLink();
            sectorspage.clickRecommendationLink();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            actualRecommendation = recommendationPage.checkRecommendationpage();
            Assert.assertEquals(expectedRecommendation, actualRecommendation);
        }
    }


    @Then("I verify the Footer Links of Others Services")
    public void i_verify_the_footer_links_of_others_services(io.cucumber.datatable.DataTable dataTable) {
        landingPage.scrollToPageEnd();
        List<String> listData = dataTable.asList(String.class);
        String expectedMinisrtySkillDevLink = (String) listData.get(0);
        String parentWindow = driver.getWindowHandle();

        if (expectedMinisrtySkillDevLink.equalsIgnoreCase("MinisrtySkillDevLink")) {
            landingPage.clickMinisrtySkillDevLink();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(3000);
                    Assert.assertTrue(isElementPresent(landingPage.schemesAndInitiativesSection));
                   // Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getMinisrtySkillDevTextFromProperty(), driver.getCurrentUrl());
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }
            driver.switchTo().window(parent);

        }

        landingPage.scrollToPageEnd();
        String expectedNSDC = (String) listData.get(1);

        if (expectedNSDC.equalsIgnoreCase("PublicGrievances")) {
            landingPage.clickPublicGrievences();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(3000);
                    Assert.assertTrue(isElementPresent(landingPage.cpgramsLogo));
                    //Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getPublicGrievancesTextFromProperty(), driver.getCurrentUrl());
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }

            driver.switchTo().window(parent);
        }

        landingPage.scrollToPageEnd();
        String expectedAZADIMAHOTSAV = (String) listData.get(2);
        if (expectedAZADIMAHOTSAV.equalsIgnoreCase("IndiaGOVIn")) {
            landingPage.clickIndiaGovInLink();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I1 = s.iterator();

            while (I1.hasNext()) {

                String child_window = I1.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(3000);
                    Assert.assertTrue(isElementPresent(landingPage.indiaGovLogo));
                  //  Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getIndiaGOVInTextFromProperty(), driver.getCurrentUrl());
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }
            }

            driver.switchTo().window(parent);
        }
        landingPage.scrollToPageEnd();
        String expectedSKILLINDIA = (String) listData.get(3);
        if (expectedSKILLINDIA.equalsIgnoreCase("TowardOfNew")) {
            landingPage.clickTowardOfNewLink();
            waitWebDriver(3000);
            driver.switchTo().alert().accept();
            waitWebDriver(7000);
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();


            Iterator<String> I2 = s.iterator();

            while (I2.hasNext()) {

                String child_window = I2.next();


                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    waitWebDriver(5000);
                    Assert.assertTrue(isElementPresent(landingPage.ministryOfWomenAndChildDevelopmentText));
                   // Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getTowardOfNewTextFromProperty(), driver.getCurrentUrl());
                    waitWebDriver(3000);
                    driver.close();
                    waitWebDriver(4000);
                }

            }
            driver.switchTo().window(parent);

        }
    }

    
    @Then("I verify contrast in main page")
    public void i_verify_contrast_in_main_page(){
    	
        landingPage.contrastClick();
        log.info("Contrast is changed from high to low");
        
        
    }
    
    @Then("I verify decrease and increase of app font size")
    public void i_verify_decrease_and_increase_of_app_font_size(){
    	
          landingPage.contrastClick();
          log.info("Contrast is changed from low to high");
          
          
        landingPage.fontSizeClick();
        log.info("Clicked on font size button");
        
        Assert.assertTrue(isElementPresent(landingPage.decreseFontSizeBtn),"Decrease font size button is not displayed");
        log.info("Decrease font size button is displayed");
        
        Assert.assertTrue(isElementPresent(landingPage.standardFontSizeBtn),"Standard font size button is not displayed");
        log.info("Standard font size button is displayed");
        
        Assert.assertTrue(isElementPresent(landingPage.increaseFontSizeBtn),"Increase font size button is not displayed");
        log.info("Increase font size button is displayed");
        
        landingPage.decreaseFontSizeClick();
       
        landingPage.decreaseFontSizeClick();
       
        landingPage.standardFontSizeClick();
        
        
        Assert.assertTrue(isElementPresent(landingPage.decreseFontSizeBtn),"Decrease font size button is not displayed");
        log.info("Decrease font size button is displayed");
        
        Assert.assertTrue(isElementPresent(landingPage.increaseFontSizeBtn),"Increase font size button is not displayed");
        log.info("Increase font size button is displayed");
        
        landingPage.increaseFontSizeClick();
        
        landingPage.increaseFontSizeClick();
        
        landingPage.standardFontSizeClick();
       
        
        Assert.assertTrue(isElementPresent(landingPage.decreseFontSizeBtn),"Decrease font size button is not displayed");
        log.info("Decrease font size button is displayed");
        
        Assert.assertTrue(isElementPresent(landingPage.increaseFontSizeBtn),"Increase font size button is not displayed");
        log.info("Increase font size button is displayed");
        
    }
    
    @Then("I verify location and switch between locations")
    public void i_verify_location_and_switch_between_locations(){
    	 
        landingPage.locationClick();
        log.info("Clicked on location button");
        
        Assert.assertTrue(isElementPresent(landingPage.mumbaiCity),"Mumbai city is not displayed");
        log.info("Mumbai city is displayed");
        Assert.assertTrue(isElementPresent(landingPage.popularCitiesText),"Popular Cities text is not displayed");
        log.info("Popular Cities text is displayed");
        Assert.assertTrue(isElementPresent(landingPage.viewAllCitiesText),"View All Cities text is not displayed");
        log.info("View All Cities text is displayed");
        
        landingPage.clickOnMumbaiCity();
        
        landingPage.locationClick();
        landingPage.searchFieldClick();
        
        landingPage.switchToCity();
      
        log.info("Bengaluru city is selected for location");
        
        
    }
    
    @Then("I verify skiptoMainContent and most popular section")
    public void i_verify_skiptoMainContent_and_most_popular_section(){
    	
        landingPage.skipToMainContent();
        log.info("Clicked on Skip to Main Content button");
        
        landingPage.visibilityOfMostPopularSection();
        
        Assert.assertTrue(isElementPresent(landingPage.mostPopularSection),"Most popular section is not displayed post clicking skip to main content button");
        log.info("Most popular section is displayed post clicking skip to main content button");
        
        Assert.assertTrue(isElementPresent(landingPage.goToCourse),"Go to course is not displayed");
        log.info("Go to course is displayed");
        
    }
    
    @Then("I verify switch between skillcourses skillcentres and jobexchange")
    public void i_verify_switch_between_skillcourses_skillcentres_and_jobexchange(){
    	
        landingPage.skipToMainContent();
        log.info("Clicked on Skip to Main Content button");
        
        homePage.visibilityOfMostPopularSection();
       
        homePage.clickOnSkillCoursesFromMostPopularSection();
        log.info("Clicked on skill courses section");
        Assert.assertTrue(isElementPresent(homePage.skillCoursesSearchField),"User is not able to swith to skill courses");
        log.info("User is able to switch to skill courses in most popular sectoin");
        
        homePage.clickOnJobExchange();
        log.info("Clicked on job exchange section");
        
        Assert.assertTrue(isElementPresent(homePage.jobExchangeSearchField),"User is not able to swith to Job exchange");
        log.info("User is able to switch to job exchange in most popular sectoin");
        
        homePage.clickOnSkillCentre();
        log.info("Clicked on skill centres section");
        
        Assert.assertTrue(isElementPresent(homePage.skillCentresSearchField),"User is not able to swith to skill centres");
        log.info("User is able to switch to skill centres in most popular sectoin");
        
        log.info("User is able to switch between skill courses, job exchange and skill centres in most popular section");
        
        
    }
    
    @Then("I verify navigated skillindiamap clicking opportunities near you")
    public void i_verify_navigated_skillindiamap_clicking_opportunities_near_you(){
    	
        landingPage.scrollToElement(homePage.opportunitiesNearYou);
        log.info("scrolled till opportunities near");
       
        homePage.clickOnOpportunitiesNearYou();
        log.info("Clicked on opportunities near you");
        
        homePage.visibilityOfSkillIndiaMap();
        Assert.assertTrue(isElementPresent(homePage.assertSkillIndiaMap),"Skill India map is not displayed");
        log.info("User is navigated to skill india map post clicking opportunities near you");
        
    }
    
    @Then("I verify learning resources tab functionality")
    public void i_verify_learning_resources_tab_functionality(){

        myDashboardPage.verifyClickOnLearningResourceOption();
        log.info("Clicked on Learning resources tab");
        
        homePage.visibilityOfLearningResourcesPage();
        
        Assert.assertTrue(isElementPresent(homePage.allSection),"All resources section is not displayed");
        log.info("All resources section is displayed");
        Assert.assertTrue(isElementPresent(homePage.videoSection),"Video resources section is not displayed");
        log.info("Video resources section is displayed");
        Assert.assertTrue(isElementPresent(homePage.pdfSection),"PDF section is not displayed");
        log.info("PDF section is displayed");
        
    }
    
    @Then("I verify important links tab functionality")
    public void i_verify_important_links_tab_functionality(){
        waitWebDriver(2000);
        homePage.clickOnSkillIndiaLogo();
        homePage.clickOnImportantLinksTab();
        log.info("Clicked on Important links tab");

    }
    
    @Then("I verify all important links access functionality")
    public void i_verify_all_important_links_access_functionality(){

        homePage.clickOnSkillUniversities();
        
        log.info("Clicked on Skill universities link");
        
        Assert.assertTrue(isElementPresent(homePage.skillUniversitiesLink),"Unable to access skill universities link");
        log.info("User able to access skill universities link from important links");

    }

    @Then("I verify all important links access functionality About US")
    public void i_verify_all_important_links_access_functionality_about_us(){
        homePage.clickOnSkillIndiaLogo();
        homePage.clickOnImportantLinksTab();

        log.info("Clicked on Important links tab");
        homePage.clickOnAboutUs();

        log.info("Clicked on About us link");

        Assert.assertTrue(isElementPresent(homePage.aboutSKillIndiaDigitalPageText),"Unable to access About us link");
        log.info("User able to access about us link from important links");
    }

    @Then("I verify all important links access functionality Sectors")
    public void i_verify_all_important_links_access_functionality_sectors(){

        waitWebDriver(2000);
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnImportantLinksTab();

        log.info("Clicked on Important links tab");
        homePage.clickOnSectors();
        log.info("Clicked on sectors link successfully");
        waitWebDriver(2000);
    }

    @Then("I verify user navigated to Government of India Link")
    public void i_verify_user_navigated_to_government_of_india_link(){


        homePage.clickOnGovernmentOfIndiaLink();
        driver.switchTo().alert().accept();

      /* String parentWindow = driver.getWindowHandle();
        String childWindow = landingPage.getChildWindow1(driver);
        driver.switchTo().window(childWindow);*/

        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();


        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getGovernmentOfIndiaTextFromProperty(), driver.getCurrentUrl());
                driver.close();
            }
        }
        waitWebDriver(4000);
        driver.switchTo().window(parent);

    }

    @Then("I verify user navigated to course details page post clicking go to course")
    public void i_verify_user_navigated_to_course_details_page_post_clicking_go_to_course(){

        landingPage.skipToMainContent();
        log.info("Clicked on Skip to Main Content button");

        homePage.visibilityOfMostPopularSection();

        homePage.clickOnSkillCoursesFromMostPopularSection();
        log.info("Clicked on skill courses section");
        Assert.assertTrue(isElementPresent(homePage.skillCoursesSearchField),"User is not able to swith to skill courses");
        log.info("User is able to switch to skill courses in most popular sectoin");

        homePage.clickOnGoToCourse();

        scrollDown();
        Assert.assertTrue(isElementPresent(homePage.courseDetailsSection),"User is not navigated to course details page");
        log.info("User is successfully navigated to course details page");

    }

    @Then("I verify user navigated to job description page post clicking view details")
    public void i_verify_user_navigated_to_job_description_page_post_clicking_view_details(){
        homePage.clickOnSkillIndiaLogo();

        landingPage.skipToMainContent();
        log.info("Clicked on Skip to Main Content button");

        homePage.visibilityOfMostPopularSection();

        homePage.clickOnJobExchange();
        log.info("Clicked on job exchange section");

        Assert.assertTrue(isElementPresent(homePage.jobExchangeSearchField),"User is not able to swith to Job exchange");
        log.info("User is able to switch to job exchange in most popular sectoin");

        homePage.clickOnViewDetails();

        Assert.assertTrue(isElementPresent(homePage.jobDescriptionSection),"User is not navigated to job description page");
        log.info("User is successfully navigated to job description page");

    }

    @Then("I verify user navigated to skill centre details popup post clicking view details")
    public void i_verify_user_navigated_to_skill_centre_details_popup_post_clicking_view_details(){
        homePage.clickOnSkillIndiaLogo();

        landingPage.skipToMainContent();
        log.info("Clicked on Skip to Main Content button");

        homePage.visibilityOfMostPopularSection();

        homePage.clickOnSkillCentre();
        log.info("Clicked on skill centres section");
        scrollUp();

        Assert.assertTrue(isElementPresent(homePage.skillCentresSearchField),"User is not able to swith to skill centres");
        log.info("User is able to switch to skill centres in most popular sectoin");

        homePage.clickOnViewDetails();

        Assert.assertTrue(isElementPresent(homePage.courseDetailsInPopup),"User is not navigated to course details popup");
        log.info("User is successfully navigated to course details popup");
    }

    @Then("I verified the color of the button")
    public void iVerifiedTheColorOfTheButton() {
        homePage.verifyRegisterButtonColor();
    }

    @Then("I click on registration button and selected learner and verified welcome  text color")
    public void iClickOnRegistrationButtonAndSelectedLearnerAndVerifiedWelcomeTextColor() {
        homePage.verifyWelcomeToSkillIndiaTextColor();
    }


    @Then("I verified the heaaders options")
    public void iVerifiedTheHeaadersOptions() {
        String eHead ="भारत सरकार";
        Assert.assertEquals(eHead,homePage.verifyHeaderText());

        String head2 ="Government of India";
        Assert.assertEquals(head2,homePage.verifyHeaderText2());

        homePage.verifyHeaderText3();
    }

    @Then("I verify courses employment opportunities and skill centres by entering keyword in search field")
    public void i_verify_courses_employment_opportunities_and_skill_centres_by_entering_keyword_in_search_field(){
        homePage.clickOnSearchImage();

        homePage.clickOnSearchEditField();

        homePage.enterKeywordInSearchField();

        homePage.waitTillCoursesDisplayed();

        Assert.assertTrue(isElementPresent(homePage.coursesSection));

        Assert.assertTrue(isElementPresent(homePage.byMicrosoftCourses));

       /* scrollToElement(homePage.employmentOpportunitiesSection);

        homePage.waitTillEmploymentOpportunitiesDisplay();

        Assert.assertTrue(isElementPresent(homePage.employmentOpportunitiesSection));

        scrollToElement(homePage.skillCentreSection);

        homePage.waitTillSkillCentreDisplay();

        Assert.assertTrue(isElementPresent(homePage.skillCentreSection));*/
    }

    @Then("I verify user able to click on Skill India Logo in Home page")
    public void i_verify_user_able_to_click_on_skill_india_logo_in_home_page(){
        homePage.clickOnSkillIndiaLogo();
        log.info("User is able to click on Skill India Logo");
    }

    @Then("I verify Scheme dropdown options and click On PMKVY")
    public void i_verify_scheme_dropdown_options_and_click_on_pmkvy(){
        homePage.clickOnSchemesLink();

        Assert.assertTrue(isElementPresent(schemesPage.PMKVYBtn),"PMKVY option is not displayed in Schemes dropdown");
        log.info("PMKVY option is displayed in Schemes dropdown");

        Assert.assertTrue(isElementPresent(schemesPage.allSchemesBtn),"All Schemes option is not displayed in Schemes dropdown");
        log.info("All Schemes option is displayed in Schemes dropdown");

        schemesPage.clickPMKVYBtn();

        Assert.assertTrue(isElementPresent(schemesPage.registerOptionInSchemes),"Register option is not displayed in PMKVY");
        log.info("Register option is displayed in PMKVY");

        Assert.assertTrue(isElementPresent(schemesPage.coursesOptionInSchemes),"Course option is not displayed in PMKVY");
        log.info("Courses option is displayed in PMKVY");

        Assert.assertTrue(isElementPresent(schemesPage.centresOptionInSchemes),"Centres option is not displayed in PMKVY");
        log.info("Centres option is displayed in PMKVY");

        Assert.assertTrue(isElementPresent(schemesPage.booksOptionInSchemes),"Books option is not displayed in PMKVY");
        log.info("Books option is displayed in PMKVY");

        Assert.assertTrue(isElementPresent(schemesPage.analyticsDashboardOptionInSchemes),"Analytics Dashboard is not displayed in PMKVY");
        log.info("Analytics Dashboard is displayed in PMKVY");


    }

    @Then("I verify user is able to access all the headers of the home page")
    public void i_verify_user_is_able_to_access_all_the_headers_of_the_home_page(){
        homePage.clickOnRecommendationLink();

        Assert.assertTrue(isElementPresent(recommendationPage.highestEduBtn),"User is not landed on Recommendation page");
        log.info("User successfully landed on Recommendation page");

        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnSkillCourses();

        Assert.assertTrue(isElementPresent(skillCoursesPage.SkillCourseHeader),"User is not landed on Skill Courses page");
        log.info("User successfully landed on Skill Courses page");

        homePage.clickOnSkillIndiaLogo();

        myDashboardPage.clickOnJobExchangeOption();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobsSection),"User is not landed on Job Exchange Page");
        log.info("User is successfully landed on Job Exchange page");

        homePage.clickOnSkillIndiaLogo();

        skillCentrepage.clickOnSkillCentres();

        Assert.assertTrue(isElementPresent(skillCentrepage.skillCentrePageText),"User is not landed on Skill Centres Page");
        log.info("User is successfully landed on Skill Centres Page");

        homePage.clickOnSkillIndiaLogo();

        skillIndiaMapPage.clickOnSkillIndiaMap();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.satelliteViewOption),"User is not navigated to skill india map");
        log.info("user successfully navigated to skill india map");

        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnThreeDots();

        Assert.assertTrue(isElementPresent(homePage.virtualTrainingSessions),"Virtual Training Session option is not displayed");
        log.info("Virtual Training Session option is displayed");

        homePage.clickOnVirtualTrainingSession();

        Assert.assertTrue(isElementPresent(myDashboard.virtualSessionPageText),"Virtual Sessions text is not displayed");
        log.info("Virtual Sessions text is displayed post clicking My virtual training sessions in user profile");
    }

    @Then("I verify Logged in Learner is able to access virtual training sessions")
    public void i_verify_logged_in_learner_is_able_to_access_virtual_training_sessions(){
        homePage.clickOnThreeDots();

        Assert.assertTrue(isElementPresent(homePage.virtualTrainingSessions),"Virtual Training Session option is not displayed");
        log.info("Virtual Training Session option is displayed");

        homePage.clickOnVirtualTrainingSession();

        Assert.assertTrue(isElementPresent(myDashboard.virtualSessionPageText),"Virtual Sessions text is not displayed");
        log.info("Virtual Sessions text is displayed post clicking My virtual training sessions in user profile");
    }

    @Then("I verify user is able to access virtual training sessions of footer section")
    public void i_verify_user_is_able_to_access_virtual_training_sessions_of_footer_section(){
        homePage.scrollToPageEnd();

        homePage.clickOnFooterVirtualTrainingSession();

        Assert.assertTrue(isElementPresent(myDashboard.virtualSessionPageText),"Virtual Sessions text is not displayed");
        log.info("Virtual Sessions text is displayed post clicking My virtual training sessions in user profile");
    }

    @Then("I verify all completed training sessions")
    public void i_verify_all_completed_training_sessions(){
        myDashboard.clickOnCompletedSection();

        myDashboard.sizeOfCompletedSessions();

        Assert.assertTrue(isElementPresent(myDashboard.completedSessions.get(0)),"All completed training sessions is not displayed");
        log.info("All completed training sessions is displayed");

    }

    @Then("I verify user is able to redirected to playstore")
    public void i_verify_user_is_able_to_redirected_to_playstore(){
          homePage.clickOnSkillIndiaLogo();

          homePage.clickOnPlaystoreLink();

          Assert.assertTrue(isElementPresent(homePage.playStoreLogo),"User is not redirected to Playstore to download the app");
          log.info("User is redirected to Playstore to download the app");
    }

    @Then("I verify user is able to redirected to App store")
    public void i_verify_user_is_able_to_redirected_to_app_store(){

        homePage.clickOnAppStoreLink();

        Assert.assertTrue(isElementPresent(homePage.appStoreLogo),"User is not redirected to App store to download the app");
        log.info("User is redirected to App store to download the app");
    }

    @Then("I verify user is able to access register button under build a skilled section")
    public void i_verify_user_is_able_to_access_register_button_under_build_a_skilled_section(){
         homePage.clickOnRegisterUnderBuildASkilledSection();

        Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
        log.info("Welcome to Skill India Digital text is displayed");

        Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
        log.info("Learner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
        log.info("Partner role is displayed in Role popup");

        Assert.assertTrue(isElementPresent(loginPage.termsAndConditionsLinkInWelcomePopup),"Terms and conditions hyperlink is not displayed");
        log.info("Terms and conditions hyperlink is displayed in welcome popup");

        Assert.assertTrue(isElementPresent(loginPage.privacyPolicyLinkInWelcomePopup),"Privacy policy hyperlink is not displayed ");
        log.info("Privacy policy hyperlink is displayed in welcome popup");
    }

    @Then("I verify user navigated to schemes page post clicking PMKVY")
    public void i_verify_user_navigated_to_schemes_page_post_clicking_pmkvy(){
        homePage.clickOnPMKVYBannerInHomePage();

        Assert.assertTrue(isElementPresent(schemesPage.schemesPageText),"User is not navigated to Schemes page");
        log.info("User is navigated to schemes page post clicking PMKVY banner in Home Page");
    }

    @Then("I verify user navigated to Skill Centre page post clicking Learn More under Look a Skill Centre")
    public void i_verify_user_navigated_to_skill_centre_page_post_clicking_learn_more_under_look_a_skill_centre(){

        homePage.clickOnLearnMoreButton();

        Assert.assertTrue(isElementPresent(skillCentrepage.skillCentrePageText),"User is not navigated to Skill centre page");
        log.info("User is successfully navigated to skill centre page");

    }

    @Then("I verify courses displayed post clicking All tab")
    public void i_verify_courses_displayed_post_clicking_all_tab(){
          homePage.clickOnAllTab();

          Assert.assertTrue(isElementPresent(homePage.courseCard),"All courses is not displayed under all tab");
          log.info("All courses is displayed under all tab");
    }

    @Then("I verify user is able to access About Us of footer section and Click on plus icon")
    public void i_verify_user_is_able_to_access_about_us_of_footer_section_and_click_on_plus_icon(){
        homePage.scrollToPageEnd();

        homePage.clickOnFooterAboutUs();

        Assert.assertTrue(isElementPresent(homePage.aboutUsPageText),"About us page text is not displayed");
        log.info("About us page text is displayed");

        homePage.clickOnPlusIcon();

        Assert.assertTrue(isElementPresent(homePage.discoveryContent),"Discovery content is not displayed");
        log.info("Discovery content is displayed post clicking plus icon");
    }

    @Then("I verify all options under user profile section")
    public void i_verify_all_options_unser_user_profile_section(){
        loginPage.clickOnProfile();

        Assert.assertTrue(isElementPresent(homePage.myDashboard));
        Assert.assertTrue(isElementPresent(homePage.surveyAndPoll));
        Assert.assertTrue(isElementPresent(homePage.viewInProfile));
        Assert.assertTrue(isElementPresent(homePage.myActivities));
        Assert.assertTrue(isElementPresent(homePage.myCourses));
        Assert.assertTrue(isElementPresent(homePage.myCredits));
        scrollDown();
        Assert.assertTrue(isElementPresent(homePage.favourite));
        Assert.assertTrue(isElementPresent(homePage.myActivityAnalysis));
        Assert.assertTrue(isElementPresent(homePage.myVirtualTrainingSessions));
        //Assert.assertTrue(isElementPresent(homePage.mySkillingProgram));
        Assert.assertTrue(isElementPresent(homePage.pmkvy));
        Assert.assertTrue(isElementPresent(homePage.eshram));
        Assert.assertTrue(isElementPresent(homePage.settings));
        Assert.assertTrue(isElementPresent(homePage.preferences));
        Assert.assertTrue(isElementPresent(homePage.changePassword));
        Assert.assertTrue(isElementPresent(homePage.privacyConsent));
        Assert.assertTrue(isElementPresent(homePage.manageAlerts));
        scrollDown();
        Assert.assertTrue(isElementPresent(homePage.logout));

    }

    @Then("I verify user able to enter location name")
    public void i_verify_user_able_to_enter_location_name(){
        homePage.clickOnSkillUniversities();

        log.info("Clicked on Skill universities link");

        Assert.assertTrue(isElementPresent(homePage.skillUniversitiesLink),"Unable to access skill universities link");
        log.info("User able to access skill universities link from important links");

        homePage.clickOnTypeInSkillUniversities();

        homePage.clickOnLocationInSkillUniversities();

        homePage.clickOnSearchInLocation();

        homePage.enterLocationNameInSearch();

        Assert.assertTrue(isElementPresent(homePage.searchedLocation),"Search location is not displayed");
        log.info("Searched location is displayed");

    }

    @Then("I verify dashboard options in Home page")
    public void i_verify_dashboard_options_in_home_page(){
        homePage.clickOnDashboards();

        Assert.assertTrue(isElementPresent(homePage.PMKVYUnderDashboard),"PMKVY is not displayed");

        Assert.assertTrue(isElementPresent(homePage.NapsUnderDashboard),"Naps is not displayed");

        Assert.assertTrue(isElementPresent(homePage.ConvergenceUnderDashboard),"Convergence is not displayed");
    }

    @Then("I verify user navigated particular dashboards post clicking dashboards")
    public void i_verify_user_navigated_particular_dashboards_post_clicking_dashboards(){
        homePage.clickOnPMKVY();

        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnDashboards();

        homePage.clickOnNaps();

        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();


        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                Assert.assertEquals("https://dashboard.apprenticeshipindia.org/", driver.getCurrentUrl());
                driver.close();
            }
        }
        waitWebDriver(4000);
        driver.switchTo().window(parent);

    }

    @Then("I verify user is able to access Contact Us page")
    public void i_verify_user_is_able_to_access_contact_us_page(){
        homePage.clickOnContactUsInHomePage();

        String actualCONTACTUS = disclaimerPage.checkContactUspage();
        Assert.assertEquals(FileReaderManager.getInstance().getConfigReader().getContactUsTextFromProperty(), actualCONTACTUS);
    }

    @Then("I verify user able to access Video under Learning Resources")
    public void i_verify_user_able_to_access_video_under_learning_resources(){
        homePage.clickOnVideoSectionOfLearningResources();

        Assert.assertTrue(isElementPresent(homePage.videoContentCard.get(0)),"Video Content card list is not displayed");
        log.info("Video content card list is displayed");

        homePage.clickOnVideoCard();

        Assert.assertTrue(isElementPresent(homePage.downloadBtn),"User is not navigated to Content details of Video");
        log.info("User is navigated to content details of video");

    }

    @Then("I verify user able to access PDF under Learning Resources")
    public void i_verify_user_able_to_access_pdf_under_learning_resources(){
        homePage.clickOnPDFSectionOfLearningResources();

        Assert.assertTrue(isElementPresent(homePage.videoContentCard.get(0)),"PDF Content card list is not displayed");
        log.info("PDF content card list is displayed");

        homePage.clickOnVideoCard();

        Assert.assertTrue(isElementPresent(homePage.downloadBtn),"User is not navigated to Content details of PDF");
        log.info("User is navigated to content details of PDF");

    }

    @Then("I verify user is able to share the Video learning resource")
    public void i_verify_user_is_able_to_share_the_video_learning_resource(){
        homePage.clickOnShareButtonOfVideo();

        Assert.assertTrue(isElementPresent(homePage.shareThisContentPopupText),"Share this Content text in the popup is not displayed");
        log.info("Share this Content text in the popup is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Video Content");
    }

    @Then("I verify user is able to click on cross button of the share popup")
    public void i_verify_user_is_able_to_click_on_cross_button_of_the_share_popup(){
        homePage.clickOnCrossButtonOfVideo();

        Assert.assertTrue(!isElementPresent(homePage.shareThisContentPopupText),"Share this Content text in the popup is displayed");
        log.info("Share this Content text in the popup is not displayed");
    }

    @Then("I verify user is able to interact and select the content type")
    public void i_verify_user_is_able_to_interact_and_select_the_content_type(){
        Assert.assertTrue(isElementPresent(homePage.videoContentType),"Video content type is not displayed");

        Assert.assertTrue(isElementPresent(homePage.pdfContentType),"PDF content type is not displayed");

        homePage.selectContentTypeFromDropdown();

        homePage.clickOnContentType();

       /* boolean pdfSectionSelected = homePage.pdfSection.isSelected();
        Assert.assertEquals(pdfSectionSelected,true);*/

        scrollDown();
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(homePage.pmkvyContentCard),"Valid content is not displayed post applying Content type filter");
        log.info("Valid content is displayed post applying content type filter");

    }

    @Then("I verify user is able to interact with content category and select content category")
    public void i_verify_user_is_able_to_interact_with_content_category_and_select_content_category(){
        homePage.clickOnContentCategory();

        homePage.selectPMKVYContentCategory();

        homePage.clickOnContentCategory();

        scrollDown();
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(homePage.pmkvyContentCard),"Valid content is not displayed post applying Content type filter");
        log.info("Valid content is displayed post applying content type filter");
    }

    @Then("I verify user is able to select the Language from dropdown")
    public void i_verify_user_is_able_to_select_the_language_from_dropdown(){
        homePage.clickOnLanguage();

        homePage.selectEnglishLanguageFromDropdown();

        homePage.clickOnLanguage();

        scrollDown();
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(homePage.pmkvyContentCard),"Valid content is not displayed post applying Content type filter");
        log.info("Valid content is displayed post applying content type filter");

        Assert.assertTrue(isElementPresent(homePage.englishLanguage),"Language filter applied content is not displayed");

    }

    @Then("I verify user is able to Reset the applied filters")
    public void i_verify_user_is_able_to_reset_the_applied_filters(){
        homePage.clickOnResetButton();

        /*boolean allSection = homePage.allSection.isSelected();
        Assert.assertEquals(allSection,true);*/

        log.info("User is successfully able to Reset the applied filters");

    }

    @Then("I verify user is able to view details of Sector Card")
    public void i_verify_user_is_able_to_view_details_of_sector_card(){
        homePage.clickOnSectors();

        homePage.clickOnSectorCard();

        Assert.assertTrue(isElementPresent(homePage.totalCoursesInSector),"Total courses is not displayed");

        Assert.assertTrue(isElementPresent(homePage.totalApprenticeshipsInSector),"Total Apprenticeships is not displayed");

        Assert.assertTrue(isElementPresent(homePage.totalEmploymentOpportunitiesInSector),"Total Employment Opportunities is not displayed");

        Assert.assertTrue(isElementPresent(homePage.totalSkillCentresInSector),"Total Skill Centres is not displayed");
        scrollDown();
        waitWebDriver(2000);
    }

    @Then("I verify user is able to share the opportunities under sectors")
    public void i_verify_user_is_able_to_share_the_opportunities_under_sectors(){
        homePage.clickOnShareTheOpportunities();

        Assert.assertTrue(isElementPresent(homePage.shareThisOpportunitiesText),"Share this opportunities text is not displayed");
        log.info("Share this opportunities text is displayed");

        Assert.assertTrue(isElementPresent(schemesPage.whatsappLink),"Whatsapp link is not displayed");
        log.info("Whatsapp link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.facebookLink),"Facebook link is not displayed");
        log.info("Facebook link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.twitterLink),"Twitter link is not displayed");
        log.info("Twitter link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.linkedInLink),"LinkedIn link is not displayed");
        log.info("LinkedIn link is displayed to share the Video Content");

        Assert.assertTrue(isElementPresent(schemesPage.shareLink),"Share link is not displayed");
        log.info("Share link is displayed to share the Video Content");

        homePage.clickOnCrossButtonOfVideo();
    }

    @Then("I verify user is able to add the job to favorite section and remove from favorite section")
    public void i_verify_user_is_able_to_add_the_job_to_favorite_section_and_remove_from_favorite_section(){
        homePage.clickOnFavoriteOption();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobAddedToFavoriteMsg),"Job Added to Favorite message is not displayed");
        log.info("Job Added to Favorite message is displayed");

        myDashboardPage.clickOnJobExchangeOption();

        homePage.clickOnFavoriteSection();

        homePage.clickOnSelectedFavoriteButton();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobRemovedFromFavoriteMsg),"Job Removed from Favorite message is not displayed");
        log.info("Job Removed from Favorite message is displayed");
    }

    @Then("I verify user able to see Roles and Responsibilities color in Orange")
    public void i_verify_user_able_to_see_roles_and_responsibilities_color_in_orange(){
        scrollToElement(homePage.viewDetailsList.get(0));
        scrollUp();
        homePage.clickOnViewDetailsInSectors();

        waitWebDriver(5000);
        Assert.assertTrue(isElementPresent(homePage.ApplyNowBtn),"Apply now button is not displayed");
        log.info("Apply now button is displayed");

        homePage.clickOnRolesAndResponsibilities();

        homePage.verifyColorOfRolesAndResponsibilities();
        log.info("Roles and Responsibilities color changed to Orange");
    }

    @Then("I verify user redirected to NSDC jobx portal post clicking Apply Now")
    public void i_verify_user_redirected_to_nsdc_jobx_portal_post_clicking_apply_now(){
        homePage.clickOnApplyNow();

        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();


        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                Assert.assertTrue( driver.getCurrentUrl().contains("https://nsdcjobx.com/"),"User not navigated to JobX portal");
                driver.close();
            }
        }
        waitWebDriver(4000);
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to select type location and Apply and Reset filters")
    public void i_verify_user_is_able_to_select_type_location_and_apply_and_reset_filters(){
        homePage.clickOnSkillUniversities();

        log.info("Clicked on Skill universities link");

        Assert.assertTrue(isElementPresent(homePage.skillUniversitiesLink),"Unable to access skill universities link");
        log.info("User able to access skill universities link from important links");

        homePage.selectTypeFromDropdown();

        homePage.clickOnTypeInSkillUniversities();

        homePage.clickOnLocationInSkillUniversities();

        homePage.clickOnSearchInLocation();

        homePage.enterLocationNameInSearch();

        Assert.assertTrue(isElementPresent(homePage.searchedLocation),"Search location is not displayed");
        log.info("Searched location is displayed");

        homePage.selectTheLocationFromDropdown();

        homePage.clickOnLocationInSkillUniversities();

        homePage.clickOnApplyButtonInSkillUniversities();

        Assert.assertTrue(isElementPresent(homePage.skillUniversityCard),"Skill University card is not displayed");
        log.info("Skill University card is displayed for the applied filters");

        Assert.assertTrue(isElementPresent(homePage.appliedFilteredSkillUniversityCard),"Skill University card is not displayed");
        log.info("Skill University card is displayed for the applied filters");

        homePage.clickOnResetFilterButtonInSkillUniversities();

    }

    @Then("I verify user redirected post clicking View details of Skill University card")
    public void i_verify_user_redirected_post_clicking_view_details_of_skill_university_card(){
        homePage.clickOnViewDetailsOfSkillUniversityCard();

        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();


        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                Assert.assertTrue( driver.getCurrentUrl().contains("https://www.teamleaseuniversity.ac.in/"),"User not navigated to teamlease portal");
                driver.close();
            }
        }
        waitWebDriver(4000);
        driver.switchTo().window(parent);
    }

    @Then("I verify user navigated to SIM from Skill Universities")
    public void i_verify_user_navigated_to_sim_from_skill_universities(){
        scrollUp();

        homePage.clickOnLocationIconButton();

        Assert.assertTrue(isElementPresent(skillIndiaMapPage.filterOption),"User is not navigated to Skill India Map");
        log.info("User is navigated to skill india map");

    }

    @Then("I verify user navigated to Convergence Dashboard")
    public void i_verify_user_navigated_to_convergence_dashboard(){
        homePage.clickOnConvergence();

        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();


        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
              //  Assert.assertTrue( driver.getCurrentUrl().contains("https://www.teamleaseuniversity.ac.in/"),"User not navigated to teamlease portal");
                driver.close();
            }
        }
        waitWebDriver(4000);
        driver.switchTo().window(parent);

    }

    @Then("I verify mouse hover on Register and verify tooltip")
    public void i_verify_mouse_hover_on_register_and_verify_tooltip(){

        homePage.verifyRegisterToolTip();

    }

    @Then("I verify mouse hover on Login and verify tooltip")
    public void i_verify_mouse_hover_on_Login_and_verify_tooltip(){

        loginPage.verifyLoginToolTip();

    }

    @Then("I verify the Orange color of the Headers of HomePage")
    public void i_verify_the_orange_color_of_the_headers_of_homepage(){
        myDashboardPage.verifySchemesColor();

        homePage.verifyRecommendationColor();

        homePage.verifySkillCourseColor();

        homePage.verifyJobExchangeColor();

        homePage.verifySkillCentreColor();

        homePage.verifySkillIndiaMapColor();
    }

    @Then("I verify user is navigated to Login Page post clicking India Skills Banner")
    public void i_verify_user_is_navigated_to_login_page_post_clicking_india_skills_banner(){
        homePage.clickOnSkillIndiaLogo();

        homePage.scrollAndClickBanner();

        waitWebDriver(4000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
                log.info("Welcome to Skill India Digital text is displayed");

                Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
                log.info("Learner role is displayed in Role popup");

                Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
                log.info("Partner role is displayed in Role popup");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify user is navigated to Login Page post clicking Banner")
    public void i_verify_user_is_navigated_to_login_page_post_clicking_banner(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnBannerOne();

        waitWebDriver(4000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(loginPage.welcomeToSkillIndiaDigitalPopupText),"Welcome to Skill India Digital text is not displayed ");
                log.info("Welcome to Skill India Digital text is displayed");

                Assert.assertTrue(isElementPresent(loginPage.learnerRole),"Learner role is not displayed");
                log.info("Learner role is displayed in Role popup");

                Assert.assertTrue(isElementPresent(loginPage.partnerRole),"Partner role is not displayed");
                log.info("Partner role is displayed in Role popup");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is navigated india skills page for Registered user with eKYC")
    public void i_verify_user_is_navigated_india_skills_page_for_registered_user_with_ekyc(){
        homePage.clickOnSkillIndiaLogo();

        homePage.scrollAndClickBanner();
        waitWebDriver(4000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(homePage.indiaSkillsPageText),"User is not navigated to India Skills Page");
                log.info("User is navigated to India Skills page");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify user is navigated to complete eKYC page post clicking india skills banner")
    public void i_verify_user_is_navigated_to_complete_ekyc_page_post_clicking_india_skills_banner(){
        homePage.clickOnSkillIndiaLogo();

        homePage.scrollAndClickBanner();

        waitWebDriver(4000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                Assert.assertTrue(isElementPresent(homePage.completeeKYCPopup),"User is navigated to India Skills Page");
                log.info("User is navigated to complete Aadhar eKYC section");
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify user is navigated to Announcements section from homepage widget")
    public void i_verify_user_is_navigated_to_announcements_section_from_homepage_widget(){
        homePage.clickOnSkillIndiaLogo();

        homePage.verifyClickOnAnnouncemnetsOption();

        Assert.assertTrue(isElementPresent(homePage.announcementsPageText),"User is not navigated to Announcements Page");
        log.info("User is navigated to Announcements page successfully");

        Assert.assertTrue(isElementPresent(homePage.sortButtonInAnnouncements),"Sort button is not displayed");
        log.info("Sort button is displayed in Announcements");

    }

    @Then("I verify Dashboard section options in side widget")
    public void i_verify_dashboard_section_options_in_side_widget(){
        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnDashboardInWidget();

        Assert.assertTrue(isElementPresent(homePage.indiaSkillsOption),"India Skills Option is not displayed");
        Assert.assertTrue(isElementPresent(homePage.digitalLearningAnalyticsOption),"Digital Learning Analytics option is not displayed");
        Assert.assertTrue(isElementPresent(homePage.apprenticeshipOption),"Apprenticeship option is not displayed");
        Assert.assertTrue(isElementPresent(homePage.pmkvyOption),"PMKVY option is not displayed");
        Assert.assertTrue(isElementPresent(homePage.nsdcInternationalOption),"NSDC International Option is not displayed");
        Assert.assertTrue(isElementPresent(homePage.pmVishwakarmaSummaryOption),"PM Vishwakarma Summary option is not displayed");
    }

    @Then("I verify user is navigated to India Skills dashboard")
    public void i_verify_user_is_navigated_to_india_skills_dashboard(){
        homePage.clickOnIndiaSkillsDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);


    }

    @Then("I verify user is navigated to Digital Learning Analytics Dashboard")
    public void i_verify_user_is_navigated_to_digital_learning_analytics_dashboard(){
        homePage.clickOnDashboardInWidget();

        homePage.clickOnDigitalLearningAnalyticsDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is navigated to NSDC International Dashboard")
    public void i_verify_user_is_navigated_to_nsdc_international_dashboard(){
        homePage.clickOnDashboardInWidget();

        homePage.clickOnNSDCInternationalDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is navigated to PM Vishwakarma Summary Dashboard")
    public void i_verify_user_is_navigated_to_pm_vishwakarma_summary_dashboard(){
        homePage.clickOnDashboardInWidget();

        scrollToElement(homePage.pmVishwakarmaSummaryOption);
        waitWebDriver(2000);

        homePage.clickOnPMVishwakarmaSummaryDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access Sector Skill Council Link")
    public void i_verify_user_is_able_to_access_sector_skill_council_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnSectorSkillCouncilLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nsdcindia.org/sector-skill-councils"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access National Career Service Link")
    public void i_verify_user_is_able_to_access_national_career_service_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnNationalCareerServiceLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://www.ncs.gov.in/Pages/default.aspx"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access A and A Knowledge Bank Link")
    public void i_verify_user_is_able_to_access_a_and_a_knowledge_bank_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnAAKnowledgeBankLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/knowledge-bank"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access AA Faqs Link")
    public void i_verify_user_is_able_to_access_aa_faqs_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnAAFAQSLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/faqs"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access MOHUA Link")
    public void i_verify_user_is_able_to_access_mohua_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnMOHUALink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/NIPUN"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access PMKVY AC Guidelines Link")
    public void i_verify_user_is_able_to_access_pmkvy_ac_guidelines_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnPMKVYAandCGuidelinesLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://s3.ap-south-1.amazonaws.com/nsdctesttemplates"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }


    @Then("I verify user is able to access Standalone NOS Listing Link")
    public void i_verify_user_is_able_to_access_standalone_nos_listing_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnStanaloneNOsListingLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/nosListing"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access Borrowed QP Listing Link")
    public void i_verify_user_is_able_to_access_borrowed_qp_listing_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnBorrowedQpListingLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/borrowedqpListings"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access SCPWD Borrowed QP Link")
    public void i_verify_user_is_able_to_access_scpwd_borrowed_qp_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnSCPWDBorrowedQPLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/scpwdqpListing"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access QP Listing Link")
    public void i_verify_user_is_able_to_access_qp_listing_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnQPListingLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/qpListings"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to access important links Link")
    public void i_verify_user_is_able_to_access_important_links_link(){
        landingPage.scrollToPageEnd();

        homePage.clickOnImportantLinksLink();

        Assert.assertTrue(isElementPresent(homePage.importantLinksHeader),"User is not able to access important links page");
        log.info("User is able to access important links page");
    }

    @Then("I verify user is access first quick link of Important link")
    public void i_verify_user_is_access_first_quick_link_of_important_link(){
        homePage.clickOnFirstQuickLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://s3.ap-south-1.amazonaws.com/nsdctesttemplates/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is access second quick link of Important link")
    public void i_verify_user_is_access_second_quick_link_of_important_link(){
        homePage.clickOnSecondQuickLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://s3.ap-south-1.amazonaws.com/nsdctesttemplates/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is access third quick link of Important link")
    public void i_verify_user_is_access_third_quick_link_of_important_link(){
        homePage.clickOnThirdQuickLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://www.nqr.gov.in/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is access fourth quick link of Important link")
    public void i_verify_user_is_access_fourth_quick_link_of_important_link(){
        homePage.clickOnFourthQuickLink();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://ncvet.gov.in/guidelines/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is access fifth quick link of Important link")
    public void i_verify_user_is_access_fifth_quick_link_of_important_link(){
        homePage.clickOnFifthQuickLink();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://admin.skillindiadigital.gov.in/list-trainer-assessor"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able navigate to Building a Skill India Section")
    public void i_verify_user_is_able_navigate_to_building_a_skill_india_section(){
        homePage.verifyBuildingASkillIndia();

        Assert.assertTrue(isElementPresent(homePage.citizenCentricSection),"Citizen Centric section is not displayed");
        log.info("Citizen Centric section is displayed");

        Assert.assertTrue(isElementPresent(homePage.careerFocussedSection),"Career Focussed section is not displayed");
        log.info("Career Focussed section is displayed");

        Assert.assertTrue(isElementPresent(homePage.multilingualSection),"Multilingual section is not displayed");
        log.info("Multilingual section is displayed");
    }

    @Then("I verify Learner is able to access Skill India Connect and click on View Details")
    public void i_verify_learner_is_able_to_access_skill_india_connect_and_click_on_view_details(){
        homePage.clickOnSkillIndiaLogo();

        homePage.verifyAccessSkillIndiaConnect();

        Assert.assertTrue(isElementPresent(homePage.skillIndiaConnectSection),"Learner is not able to access Skill India Connect section");
        log.info("Learner is able to access Skill India Connect");

        homePage.verifyAndClickOnViewAllUnderSkillIndiaConnect();

        Assert.assertTrue(isElementPresent(homePage.skillIndiaConnectHeader),"Learner not able to access View All");
        log.info("Learner is able to access View All");

        Assert.assertTrue(isElementPresent(homePage.allSectionUnderSkillIndiaConnect),"All Section is not displayed");

        Assert.assertTrue(isElementPresent(homePage.lastWeekSectionUnderSkillIndiaConnect),"Last Week section is not displayed");

        homePage.clickOnViewDetailsOfSkillIndiaConnect();

        waitWebDriver(3000);
        driver.switchTo().alert().accept();
        waitWebDriver(3000);
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify Learner is able to access Apprenticeship and PMKVY Dashboard Section")
    public void i_verify_learner_is_able_to_access_apprenticeship_and_pmkvy_dashboard_section(){
        homePage.clickOnApprenticeships();

        homePage.clickOnSkillIndiaLogo();

        homePage.clickOnDashboardInWidget();

        homePage.clickOnPMKVYOption();

    }

    @Then("I verify user is able to navigate to Skill Course page from Learn more")
    public void i_verify_user_is_able_to_navigate_to_skill_course_page_from_learn_more(){
        homePage.scrollToLearnMoreOptionInHomePage();

        homePage.clickOnSkillCourseSlider();

        homePage.clickOnSkillCoursesLearnMoreButton();

        Assert.assertTrue(isElementPresent(skillCoursesPage.SkillCourseHeader),"User is not landed on Skill Courses page");
        log.info("User successfully landed on Skill Courses page");

    }

    @Then("I verify user is able to navigate to Job Exchange page from Learn more")
    public void i_verify_user_is_able_to_navigate_to_job_exchange_page_from_learn_more(){
        homePage.clickOnSkillIndiaLogo();

        homePage.scrollToLearnMoreOptionInHomePage();

        homePage.clickOnJobExchangeSlider();

        homePage.clickOnJobExchangeLearnMoreButton();

        Assert.assertTrue(isElementPresent(jobExchangePage.jobsSection),"User is not landed on Job Exchange Page");
        log.info("User is successfully landed on Job Exchange page");

    }

    @Then("I verify user is able to navigate to Skill Centre page from Learn more")
    public void i_verify_user_is_able_to_navigate_to_skill_centre_page_from_learn_more(){
        homePage.clickOnSkillIndiaLogo();

        homePage.scrollToLearnMoreOptionInHomePage();

        homePage.clickOnSkillCentreSlider();

        homePage.clickOnSkillCentreLearnMoreButton();

        Assert.assertTrue(isElementPresent(skillCentrepage.skillCentrePageText),"User is not landed on Skill Centres Page");
        log.info("User is successfully landed on Skill Centres Page");

    }

    @Then("I verify a sample skill course query in Chatbot")
    public void i_verify_a_sample_skill_course_query_in_chatbot(){

        homePage.clickOnChatBot();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='haptik-xdk']")));

        homePage.clickOnSkillCoursesInChatBot();

        Assert.assertTrue(isElementPresent(homePage.agricultureinChatbot));

        Assert.assertTrue(isElementPresent(homePage.automotiveInChatbot));

        homePage.clickOnAutomotive();

        Assert.assertTrue(isElementPresent(homePage.onlineOrOfflineMessageInChatbot));

        homePage.clickOnOnlineInChatbot();

        homePage.clickOnEnglishLanguage();

        Assert.assertTrue(isElementPresent(homePage.enrollNowInChatbot));

        Assert.assertTrue(isElementPresent(homePage.viewMoreInChatbot));


    }

    @Then("I verify user is able to navigate to Apprenticeship Dashboard")
    public void i_verify_user_is_able_to_navigate_to_apprenticeship_dashboard(){
        homePage.clickOnApprenticeships();

        homePage.clickOnApprenticeshipDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://dashboard.apprenticeshipindia.org/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify user is able to navigate to NAPS DBT Dashboard")
    public void i_verify_user_is_able_to_navigate_to_naps_dbt_dashboard(){
        homePage.clickOnDashboardInWidget();

        homePage.clickOnApprenticeships();

        homePage.clickOnNAPSDBTDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify PMKVY Dashboard Links in Right side widget")
    public void i_verify_pmkvy_dashboard_links_in_right_side_widget(){
        homePage.clickOnPMKVYOption();

        Assert.assertTrue(isElementPresent(homePage.summaryDashboard),"Summary Dashboard is not displayed");

        Assert.assertTrue(isElementPresent(homePage.premiumAnalyticsDashboard),"Premium Analytics Dashboard is not displayed");

        Assert.assertTrue(isElementPresent(homePage.stateLevelPerformanceDashboard),"State Level Performance Dashboard is not displayed");

    }

    @Then("I verify user is navigated to Summary Dashboard")
    public void i_verify_user_is_navigated_to_summary_dashboard(){
        homePage.clickOnSummaryDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://www.skillindiadigital.gov.in/pmkvy-dashboard"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is navigated to Premium Analytics Dashboard")
    public void i_verify_user_is_navigated_to_premium_analytics_dashboard(){
        homePage.clickOnDashboardInWidget();

        homePage.clickOnPMKVYOption();

        homePage.clickOnPremiumAnalyticsDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify user is navigated to State Level Performance Dashboard")
    public void i_verify_user_is_navigated_to_state_level_performance_dashboard(){
        homePage.clickOnDashboardInWidget();

        homePage.clickOnPMKVYOption();

        homePage.clickOnStateLevelPerformanceDashboard();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://app.powerbi.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is navigated to Help and Support page")
    public void i_verify_user_is_navigated_to_help_and_support_page(){
        homePage.clickOnSkillIndiaLogo();

        homePage.scrollToPageEnd();

        homePage.clickOnHelpAndSupport();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://support.nsdcindia.org/portal/en/signin"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is navigated to Skilling Program page post clicking Schemes Link")
    public void i_verify_user_is_navigated_to_skilling_program_page_post_clicking_schemes_link(){

        homePage.clickOnSchemesFooterLink();

        Assert.assertTrue(isElementPresent(homePage.skillingProgramHeaderLink),"User is not navigated to Skilling Program page");
        log.info("User is navigated to Skilling Program page");
    }

    @Then("I verify user is able to fill all the mandatory fields in Contact us")
    public void i_verify_user_is_able_to_fill_all_the_mandatory_fields_in_contact_us(){
        homePage.clickOnContactUsInHomePage();

        Assert.assertTrue(isElementPresent(homePage.submitQueryText),"Submit Query text is not displayed");

        homePage.clickAndEnterFirstNameInQuery();

        homePage.clickAndEnterLastNameInQuery();

        homePage.clickAndEnterEmailIDInQuery();

        homePage.clickAndEnterMobileNoInQuery();

        homePage.clickOnStateDropdown();

        homePage.selectAndhraState();

        homePage.clickOnDistrictDropdown();

        homePage.selectAnantapurDistrict();

        homePage.clickAndEnterFeedback();

        homePage.clickAndEnterComments();

        homePage.clickOnQuerySubmitBtn();

        Assert.assertTrue(isElementPresent(homePage.querySubmittedToastMessage),"Query submit toast message is not displayed");
        log.info("Query submit toast message is displayed");
    }

    @Then("I verify user is able to access Contact Number in Contact Us page")
    public void i_verify_user_is_able_to_access_contact_number_in_contact_us_page(){
        homePage.clickOnContactUsInHomePage();

        Assert.assertTrue(isElementPresent(homePage.submitQueryText),"Submit Query text is not displayed");

        homePage.clickOnContactNumberInContactUsPage();

        //driver.switchTo().alert().accept();

    }

    @Then("I verify user is able to access view larger map for Address in Contact us page")
    public void i_verify_user_is_able_to_access_view_larger_map_for_address_in_contact_us_page(){
        homePage.clickOnContactUsInHomePage();

        Assert.assertTrue(isElementPresent(homePage.submitQueryText),"Submit Query text is not displayed");

        homePage.clickOnAddressInContactUspage();

        driver.switchTo().frame(2);
        waitWebDriver(2000);

        Assert.assertTrue(isElementPresent(homePage.kaushalBhawanHeader),"Kaushal Bhawan header is not displayed");

        Assert.assertTrue(isElementPresent(homePage.kaushalBhawanAddress),"Kaushal Bhawan Address is not displayed");

        Assert.assertTrue(isElementPresent(homePage.ratings),"ratings is not displayed");

        Assert.assertTrue(isElementPresent(homePage.reviews),"Reviews is not displayed");

        Assert.assertTrue(isElementPresent(homePage.directionsBtn),"Directions is not displayed");

        Assert.assertTrue(isElementPresent(homePage.viewLargerMapLink),"View Larger map link is not displayed");

        homePage.clickOnViewLargerMapLink();

        Assert.assertTrue(isElementPresent(homePage.kaushalBhawanHeader),"Kaushal Bhawan header is not displayed");

    }

    @Then("I verify user is able to redirect to Directions from Contact Us")
    public void i_verify_user_is_able_to_redirect_to_directions_from_contact_us(){
        homePage.clickOnContactUsInHomePage();

        Assert.assertTrue(isElementPresent(homePage.submitQueryText),"Submit Query text is not displayed");

        homePage.clickOnAddressInContactUspage();

        driver.switchTo().frame(2);
        waitWebDriver(2000);

        homePage.clickOnDirectionsButton();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/maps/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);

    }

    @Then("I verify user is able to redirect to Reviews from Contact Us")
    public void i_verify_user_is_able_to_redirect_to_reviews_from_contact_us(){
        driver.switchTo().frame(2);
        waitWebDriver(2000);

        homePage.clickOnReviewsButton();

        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();


        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                waitWebDriver(3000);
                System.out.println(driver.getCurrentUrl());
                Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/"));
                waitWebDriver(3000);
                driver.close();
                waitWebDriver(4000);
            }
        }
        driver.switchTo().window(parent);
    }

    @Then("I verify user is able to click on Zoom In and Zoom Out in Contact Us Address map")
    public void i_verify_user_is_able_to_click_on_zoom_in_and_zoom_out_in_contact_us_address_map(){
        driver.switchTo().frame(2);
        waitWebDriver(2000);

        homePage.clickOnZoomInOption();

        log.info("Zoom In working successfully");

        homePage.clickOnZoomOutOption();

        log.info("Zoom out working successfully");
    }


}
