package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Winter22Page extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://www.balenciaga.com/en-en/new-arrivals/winter-22";
    @FindBy(xpath = "//*[@id=\"backToTop\"]/div[1]/a")
    private WebElement Logo;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button")
    private WebElement Version;
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement Cookie;
    public Winter22Page(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public Winter22Page openPage()
    {
        driver.navigate().to(BASE_URL);
        logger.info("Winter22 page opened");
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