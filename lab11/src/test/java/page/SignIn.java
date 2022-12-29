package page;

import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.StringUtils;

import static java.lang.Thread.sleep;

public class SignIn extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://www.balenciaga.com/en-en/login";
    @FindBy(id = "form-input-identity")
    private WebElement email;
    @FindBy(id = "form-submit-continue")
    private WebElement btnnxt;
    public SignIn(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public SignIn openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Singin 3 page opened");
        return this;
    }


    public SignIn emailclick(User user) throws InterruptedException {
        email.sendKeys(StringUtils.getRandomString(2));
        btnnxt.click();
        logger.info("emailclick");
        sleep(10000);
        return  this;
    }
}