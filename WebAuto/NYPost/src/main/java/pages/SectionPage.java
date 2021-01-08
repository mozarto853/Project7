package pages;

import base.CommonAPI;
import datafetch.FetchTheSteps;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class SectionPage {

/*
    @FindBy(how = How.CSS, using = "#sections > span.pages.menu-icon > svg")
    public static WebElement sectionMenuWebElement;

 */

    @FindBy(how = How.CSS, using = ".menu-icon-svg")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2) a")
    public static WebElement metroMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(5) a")
    public static WebElement businessMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(7) a")
    public static WebElement entertainmentMenuWebElement;

    public WebElement getSectionMenuWebElement(){

        return sectionMenuWebElement;
    }

    public WebElement getMetroMenuWebElement(){

        return metroMenuWebElement;
    }
    public WebElement getBusinessMenuWebElement(){

        return businessMenuWebElement;
    }
    public WebElement getEntertainmentMenuWebElement(){

        return entertainmentMenuWebElement;
    }
    public void clickOnSectionMenuTab(){
        getSectionMenuWebElement().click();
    }
    public MetroPage goToMetroPage(WebDriver driver){
        clickOnSectionMenuTab();
        getMetroMenuWebElement().click();
        return new MetroPage(driver);
    }

    public BusinessPage goToBusinessPage(WebDriver driver){
        clickOnSectionMenuTab();
        getBusinessMenuWebElement().click();
        return new BusinessPage(driver);
    }

    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        clickOnSectionMenuTab();
        getEntertainmentMenuWebElement().click();
        return new EntertainmentPage(driver);
    }



    public void runAllTheFeatureTest2(WebDriver driver) throws InterruptedException, IOException {
        FetchTheSteps fetchTheSteps = new FetchTheSteps();
        String [] featureSteps = fetchTheSteps.getDataFromExcelFile();
        for (int i=1; i<featureSteps.length; i++){
            select2(featureSteps[i], driver);
        }
    }

    public void select2(String featureName, WebDriver driver)throws InterruptedException,IOException{
        switch(featureName){
            case "metro":
                goToMetroPage(driver);
                break;
            case "business":
                goToBusinessPage(driver);
                break;
            case "entertainment":
                goToEntertainmentPage(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }












}