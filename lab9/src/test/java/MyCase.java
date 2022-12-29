import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyCase {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "d:\\1POIT\\3\\TPO\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.balenciaga.com/en-en");

        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click(); //Accept cookies
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[3]/button")).click(); //Select international version
        driver.findElement(By.xpath("//*[@id=\"backToTop\"]/div[3]/div[2]/div[2]/a")).click(); //Click on login

        WebElement EmailInput = driver.findElement(By.xpath("//*[@id=\"idp-discovery-username\"]"));
        EmailInput.sendKeys("kusssyd@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"idp-discovery-submit\"]")).click();

        WebElement PasswordInput = driver.findElement(By.xpath("//*[@id=\"okta-signin-password\"]"));
        PasswordInput.sendKeys("Ksusha20031007!");
        driver.findElement(By.xpath("//*[@id=\"okta-signin-submit\"]")).click();
    }
}
