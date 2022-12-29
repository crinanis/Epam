package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitlePage extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://www.balenciaga.com/en-en";

    @FindBy(xpath = "//*[@id=\"backToTop\"]/div[1]/a/h1/img[1]")
    private WebElement Logo;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button")
    private WebElement Version;
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement Cookie;
    public TitlePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public TitlePage openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Title page opened");
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
