package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SectionPage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#sections > span.pages.menu-icon > svg")
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
        getMetroMenuWebElement().click();
        return new MetroPage(driver);
    }
    public BusinessPage goToBusinessPage(WebDriver driver)throws InterruptedException{
        try {
            getBusinessMenuWebElement().click();
        }catch (Exception ex){
            CommonAPI.navigateBack();
            Thread.sleep(1000);
            getBusinessMenuWebElement().click();
        }
        return new BusinessPage(driver);
    }
    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        getEntertainmentMenuWebElement().click();
        return new EntertainmentPage(driver);
    }


    /*
    @FindBy(how = How.CSS, using = "svg.menu-icon-svg")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = "div.headline-container a:nth-child(2) h3")
    public static WebElement headLineNewsWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(1) a")
    public static WebElement newsMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2) a")
    public static WebElement metroMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(3) a")
    public static WebElement page6MenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4) a")
    public static WebElement sportMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(5) a")
    public static WebElement businessMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(7) a")
    public static WebElement entertainmentMenuWebElement;


    //Get them
    public WebElement getSectionNavBarWebElement(){
        return sectionNavBarWebElement;
    }
    public WebElement getHeadLineNewsWebElement(){
        return headLineNewsWebElement;
    }


     */
    /*
    public WebElement getNewsMenuWebElement(){
        return newsMenuWebElement;
    }
    public WebElement getMetroMenuWebElement(){
        return metroMenuWebElement;
    }
    public WebElement getPage6MenuWebElement(){
        return page6MenuWebElement;
    }
    public WebElement getSportMenuWebElement(){
        return sportMenuWebElement;
    }
    public WebElement getBusinessMenuWebElement() { return businessMenuWebElement;}
    public WebElement getEntertainmentMenuWebElement() { return entertainmentMenuWebElement;}


    //Click on them
    public void clickOnSectionTabMenu(){
        getSectionNavBarWebElement().click();
    }

    public String getHeadLineNewsText(){
        String headLine = getHeadLineNewsWebElement().getText();
        System.out.println(headLine);
        return headLine;
    }

    public News goToNewsPage(WebDriver driver){
        clickOnSectionTabMenu();
        getNewsMenuWebElement().click();
        return new News();
    }

    public MetroPage goToMetroPage(WebDriver driver){
        clickOnSectionTabMenu();
        getMetroMenuWebElement().click();
        return new MetroPage(driver);
    }

    public PageSix goToPage6(WebDriver driver){
        clickOnSectionTabMenu();
        getPage6MenuWebElement().click();
        return new PageSix();
    }

    public Sports goToSport(WebDriver driver){
        clickOnSectionTabMenu();
        getSportMenuWebElement().click();
        return new Sports();
    }

    public BusinessPage goToBusinessPage(WebDriver driver)throws InterruptedException{
        try {
            clickOnSectionTabMenu();
            getBusinessMenuWebElement().click();
        }catch (Exception ex){
            CommonAPI.navigateBack();
            Thread.sleep(1000);
            getBusinessMenuWebElement().click();
        }
        return new BusinessPage(driver);
    }

    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        clickOnSectionTabMenu();
        getEntertainmentMenuWebElement().click();
        return new EntertainmentPage(driver);
    }

     */
}



//2:15 for explanation