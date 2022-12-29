package Test2.tests;

import Test2.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected Page calculatorPage;

    @BeforeMethod
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "d:\\1POIT\\3\\TPO\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        calculatorPage = new Page(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
