package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://www.balenciaga.com/en-en/gift-shop/gift-shop";
    private final String RANDOM_PRODUCT_URL="https://www.balenciaga.com/en-en/maxi-godet-dress-black-719030T32601000.html";
    private final String RANDOM_PRODUCT_URL_1="https://www.balenciaga.com/en-en/bb-icon-heart-earrings-gold-700648TZ99G0705.html";
    @FindBy(xpath = "//*[@id=\"backToTop\"]/div[1]/a")
    private WebElement Logo;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button")
    private WebElement Version;
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement Cookie;
    @FindBy(xpath = "//ul[@class='product-title_list']")
    private WebElement list;
    public ShopPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShopPage openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Shop page opened");
        return this;
    }
    public ShopPage openRandomPage()
    {
        driver.navigate().to(RANDOM_PRODUCT_URL);
        logger.info("Shop random page opened");
        return this;
    }
    public ShopPage openRandomPage1()
    {
        driver.navigate().to(RANDOM_PRODUCT_URL_1);
        logger.info("Shop random page opened");
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
    public boolean cheacfindlist()
    {
        if(list!=null)
            return true;
        else
            return false;
    }
}