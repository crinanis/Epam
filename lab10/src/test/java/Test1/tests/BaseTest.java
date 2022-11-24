package Test1.tests;

import Test1.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected Page mainPage;

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainPage = new Page(driver);
    }

    @AfterMethod (alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }

}
