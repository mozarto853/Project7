package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {


    /* Extent Report
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }


     */




    //WebDriver
    public String browserStackUserName = "mozartortiz1";
    public String browserStackAccessKey = "JQdtS92gVhe91VSQDpFt";
    public static WebDriver driver = null;

    @Parameters({"useCloudEnv","envName","os","os_version","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(String useCloudEnv,String envName,String os, String os_version, String browserName, String browserVersion,String url) throws MalformedURLException {
        if(useCloudEnv.equalsIgnoreCase("true")){
            getCloudDriver(envName,os,os_version,browserName,browserVersion);
        }else if(useCloudEnv.equalsIgnoreCase("false")){
            getLocalDriver(os,browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    public WebDriver getLocalDriver(String OS, String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\ortiz\\eclipse-workspace\\Web-automation-Sept2020\\Generic\\driver\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public WebDriver getCloudDriver(String envName, String os,String os_version, String browserName, String browserVersion) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browserVersion",browserVersion);
        cap.setCapability("os",os);
        cap.setCapability("os_version",os_version);
        if(envName.equalsIgnoreCase("Browserstack")){
            driver = new RemoteWebDriver(new URL("http://"+browserStackUserName+":"+browserStackAccessKey+"@hub-cloud.browserstack.com/wd/hub"),cap);
        }
        return driver;
    }






    public static void navigateBack(){
        driver.navigate().back();
    }

    public void typeANDEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1){
            try{
                driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2){
                try{
                    driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3) {
                    try {
                        driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                    }catch(Exception ex4) {
                        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                    }
                }
            }
        }
    }

    public void clearInputField(String locator){

        try{
            driver.findElement(By.cssSelector(locator)).clear();
        }catch (Exception ex1){
            try{
                driver.findElement(By.className(locator)).clear();
            }catch (Exception ex2) {
                try{
                    driver.findElement(By.name(locator)).clear();
                }catch (Exception ex3) {
                    try{
                        driver.findElement(By.id(locator)).clear();
                    }catch (Exception ex4){
                        driver.findElement(By.xpath(locator)).clear();
                    }
                }
            }
        }
    }

    //Try-Catch

    public void clickOnWebElement(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception ex1){
            try{
                driver.findElement(By.className(locator)).click();
            }catch (Exception ex2){
                try{
                    driver.findElement(By.id(locator)).click();
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }

    public List<String> getListOfText(String locator){
        List<WebElement> elementList = driver.findElements(By.id(locator));
        List<String> listOfText = new ArrayList<String>();

        for(WebElement element:elementList){
            listOfText.add(element.getText());
        }
        return listOfText;
    }
    public void printText(List<String> list){
        for(String st:list){
            System.out.println(st);
        }
    }

    //Synchronization
    public static void waitUntilClickAble(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public static void waitUntilClickAble(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }catch(Exception ex){
            //Possible Error
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
    }

    public static void waitUntilVisible(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void waitUntilSelectable(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
    public String getWebText(String locator){
        String text = "";
        try {
            text =  driver.findElement(By.cssSelector(locator)).getText();
        }catch (Exception ex1){
            try{
                text = driver.findElement(By.className(locator)).getText();
            }catch (Exception ex2){
                try{
                    text = driver.findElement(By.id(locator)).getText();
                }catch (Exception ex3){
                    text =  driver.findElement(By.xpath(locator)).getText();
                }
            }
        }
        return text;
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }
    }

    public static String convertToString(String st) {
        String splitString = "";
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
}
