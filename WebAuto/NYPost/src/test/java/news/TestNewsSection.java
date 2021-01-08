
package news;

import base.CommonAPI;
import features.AllFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SectionPage;

import java.io.IOException;

public class TestNewsSection extends CommonAPI {

    /*
    @Test
    public void allFeatures() throws InterruptedException, IOException {
        AllFunctionality functionality = PageFactory.initElements(driver, AllFunctionality.class);
        functionality.sectionsMenu(driver);
    }

     */

    /*
    @Test
    public void metro() {
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToMetroPage(driver);
    }

    @Test
    public void entertainment() {
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToEntertainmentPage(driver);
    }

    @Test
    public void business() {
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.goToBusinessPage(driver);
    }

     */

    @Test
    public void excel() throws IOException, InterruptedException {
        SectionPage sectionPage = PageFactory.initElements(driver, SectionPage.class);
        sectionPage.runAllTheFeatureTest2(driver);
    }

}