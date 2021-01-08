package amazon.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonHome {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ortiz\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Far Cry 5", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Battlefield", Keys.ENTER);
    driver.close();
    }
}

