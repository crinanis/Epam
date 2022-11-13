import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BringItOn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\budan\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        
        WebElement codeArea = driver.findElement(By.id("postform-text"));
        codeArea.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");

        WebElement nameArea = driver.findElement(By.id("postform-name"));
        nameArea.sendKeys("how to gain dominance among developers");

        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//*[contains(@id,\"10M\")]")).click();

        driver.findElement(By.id("select2-postform-format-container")).click();
        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[2]/ul/li[1]")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
    }
}
