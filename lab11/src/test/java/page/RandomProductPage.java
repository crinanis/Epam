package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class RandomProductPage extends AbstractPage{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL="https://www.balenciaga.com/en-bg/signature-card-case-on-keyring-bb-monogram-coated-canvas--black-594548210D81061.html";
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement Cookie;
    @FindBy(xpath = "//*[@id=\"minicart\"]/div[1]/a")
    private WebElement Cart;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button")
    private WebElement ConfirmRegion;
    @FindBy(xpath = "//*[@id=\"addToCartBtn\"]")
    private WebElement buttonaddtocart;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/div[2]/a")
    private WebElement buttonchechout;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/button")
    private WebElement Remove;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[3]/button[2]")
    private WebElement btnRemove;
    @FindBy(xpath = "//p[text()='Your cart is empty']")
    private WebElement pempty;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[3]/div[2]/div[1]/button[2]")
    private WebElement increaseNum;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[3]/div/div[3]/div/a")
    private WebElement proceed;

    public RandomProductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public RandomProductPage openPage() throws InterruptedException {
        driver.navigate().to(PAGE_URL);
        Cookie.click();
        ConfirmRegion.click();
        logger.info("Page with location opened");
        sleep(10000);
        return this;
    }
    public RandomProductPage clicktoadd() {
        buttonaddtocart.click();
        logger.info("Click logo and title page opened");

        return  this;
    }
    public RandomProductPage openCart() throws InterruptedException {
        Cart.click();
        logger.info("Click Cart and Cart page opened");
        sleep(10000);
        return this;
    }
    public boolean DeleteCart() throws InterruptedException {
        Remove.click();
        logger.info("Click Remove and delete think");
        btnRemove.click();
        sleep(5000);
        if (pempty!=null)
            return true;
        else
            return false;

    }
    public RandomProductPage EditNum() throws InterruptedException {
        increaseNum.click();
        sleep(5000);
        return this;
    }

    public boolean Proceed() throws InterruptedException {
        proceed.click();
        sleep(5000);
        return true;
    }
    public boolean checkCart() throws InterruptedException {
        if(buttonchechout != null){
            return true;
        }
        else {
            return false;
        }
    }
}