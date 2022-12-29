package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientServicePage extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://www.balenciaga.com/en-en/client-service-2";

    @FindBy(xpath = "//*[@id=\"backToTop\"]/div[1]/a")
    private WebElement Logo;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button")
    private WebElement Version;
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement Cookie;
    public ClientServicePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ClientServicePage openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Client service page opened");
        return this;
    }

    public String clicklogo()
    {
        Cookie.click();
        Version.click();
        Logo.click();
        logger.info("Click logo and title page opened");
        return  driver.getCurrentUrl();
    }
}