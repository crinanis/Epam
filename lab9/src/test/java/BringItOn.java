import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BringItOn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "d:\\1POIT\\3\\TPO\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://pastebin.com");
        
        WebElement codeArea = driver.findElement(By.id("postform-text"));
        codeArea.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        Thread.sleep(2000);

        WebElement nameArea = driver.findElement(By.id("postform-name"));
        nameArea.sendKeys("how to gain dominance among developers");
        Thread.sleep(2000);

        driver.findElement(By.id("select2-postform-expiration-container")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(@id,\"10M\")]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("select2-postform-format-container")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[2]/ul/li[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
    }
}
