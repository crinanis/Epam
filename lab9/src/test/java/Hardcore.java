import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Hardcore {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "d:\\1POIT\\3\\TPO\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://yopmail.com/en");
        driver.findElement(By.xpath("//a[@href='email-generator']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@id='cprnd']")).click();
        Thread.sleep(1500);

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.get("https://cloud.google.com/");
        WebElement searchBtn = driver.findElement(By.name("q"));
        searchBtn.click();
        searchBtn.sendKeys("Google Cloud Platform Pricing Calculator");
        searchBtn.submit();
        Thread.sleep(5000);

        WebElement documentation= driver.findElement(By.linkText("Google Cloud Pricing Calculator"));
        documentation.click();
        Thread.sleep(3000);

        driver.switchTo().frame(0);
        WebElement frame = driver.findElement(By.id("myFrame"));
        driver.switchTo().frame(frame);

        WebElement numberOfInstancesField = driver.findElement(By.name("quantity"));
        numberOfInstancesField.sendKeys("4");;
        Thread.sleep(1500);

        WebElement os = driver.findElement(By.xpath("//*[@id=\"select_value_label_82\"]")); //operating system
        os.click();
        Thread.sleep(1500);
        WebElement osValue = driver.findElement(By.xpath("//md-option[@id='select_option_92']"));
        osValue.click();
        Thread.sleep(1500);

        WebElement vm = driver.findElement(By.xpath("//*[@id=\"select_value_label_83\"]")); //VM or provisioning model
        vm.click();
        Thread.sleep(1500);
        WebElement vmValue = driver.findElement(By.xpath("//md-option[@id='select_option_105']"));
        vmValue.click();
        Thread.sleep(1500);

        WebElement series = driver.findElement(By.xpath("//*[@id=\"select_value_label_85\"]")); //series
        series.click();
        Thread.sleep(1500);
        WebElement seriesValue = driver.findElement(By.xpath("//md-option[@id='select_option_201']"));
        seriesValue.click();
        Thread.sleep(1500);

        WebElement machine = driver.findElement(By.xpath("//*[@id=\"select_value_label_86\"]")); //machine type
        machine.click();
        Thread.sleep(1500);
        WebElement machineValue = driver.findElement(By.xpath("//md-option[@id='select_option_428']"));
        machineValue.click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-checkbox[@aria-label='Add GPUs']")).click(); // add gpu checkbox
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='GPU type']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_474']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Number of GPUs']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_477']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Local SSD']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_450']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//md-select[@placeholder='Datacenter location']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_229']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Committed usage']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_128']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@aria-label='Add to Estimate']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/md-content/md-card/div/md-card-content[2]/md-card/md-card-content/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//input[@type='email']"))
                .sendKeys(Keys.CONTROL+ "v");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@aria-label='Send Email']")).click();
        Thread.sleep(3000);

        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[2]/div/div/div[2]/button[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[1]/div/div[1]/div[6]/button")).click();
    }
}
