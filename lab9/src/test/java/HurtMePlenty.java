import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HurtMePlenty {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\budan\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

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
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Datacenter location']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_229']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//md-select[@placeholder='Committed usage']")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_128']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@aria-label='Add to Estimate']")).click();
    }
}

//1. Открыть https://cloud.google.com/
//        2. Нажав кнопку поиска по порталу вверху страницы, ввести в поле поиска"Google Cloud Platform Pricing Calculator"
//        3. Запустить поиск, нажав кнопку поиска.
//        4. В результатах поиска кликнуть "Google Cloud Platform Pricing Calculator" и перейти на страницу калькулятора.
//        5. Активировать раздел COMPUTE ENGINE вверху страницы
//        6. Заполнить форму следующими данными:
//        * Number of instances: 4
//        * What are these instances for?: оставить пустым
//        * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS
//        * VM Class: Regular
//        * Instance type: n1-standard-8    (vCPUs: 8, RAM: 30 GB)
//        * Выбрать Add GPUs
//        * Number of GPUs: 1
//        * GPU type: NVIDIA Tesla V100
//        * Local SSD: 2x375 Gb
//        * Datacenter location: Frankfurt (europe-west3)
//        * Commited usage: 1 Year
//        7. Нажать Add to Estimate
//        8. Проверить соответствие данных следующих полей: VM Class, Instance type, Region, local SSD, commitment term
//        9. Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном прохождении теста.