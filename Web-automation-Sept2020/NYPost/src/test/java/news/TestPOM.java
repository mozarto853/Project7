package news;

import base.CommonAPI;
import features.AllFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MetroPage;
import pages.SectionPage;

import java.io.IOException;


public class TestPOM extends CommonAPI {


    @Test
    public void allFeatures() throws InterruptedException, IOException {
        AllFunctionality functionality = PageFactory.initElements(driver, AllFunctionality.class);
        functionality.runAllTheFeatureTest(driver);

    }

    /*
    @Test
    public void mainPageHeadline() {
        System.out.println("This is the main page");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.getHeadLineNewsText();
    }

    @Test
    public void goToNews() {
        System.out.println("This is the news page");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToNewsPage(driver);
        sectionPage.getHeadLineNewsText();
    }


    @Test
    public void goToMetro() {
        System.out.println("This is the Metro page");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToMetroPage(driver);
        sectionPage.getHeadLineNewsText();
    }

    @Test
    public void page6() {
        System.out.println("This is the page6");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToPage6(driver);
        sectionPage.getHeadLineNewsText();
    }

    @Test
    public void sport() {
        System.out.println("This is the sport page");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToSport(driver);
        sectionPage.getHeadLineNewsText();
    }



    @Test
    public void business() throws InterruptedException {
        System.out.println("This is the business page");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToBusinessPage(driver);
        sectionPage.getHeadLineNewsText();
    }

    @Test
    public void entertainment() {
        System.out.println("This is the entertainment page");
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToEntertainmentPage(driver);
        sectionPage.getHeadLineNewsText();
    }
}


     /*
    @Test
    public void navigateAll(){
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToNewsPage(driver);
        sectionPage.goToMetroPage(driver);
        sectionPage.goToPage6(driver);
        CommonAPI.navigateBack();
        sectionPage.goToSport(driver);
    }



     */


}
