package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageSix {
    private WebDriver driver;
    public void MetroPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
