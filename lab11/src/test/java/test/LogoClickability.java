package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class LogoClickability extends CommonConditions {
    @Test
    public void Logofirst()
    {
        String loggedInUserName = new TitlePage(driver)
                .openPage().
                clicklogo();
        System.out.println(loggedInUserName);
        Assert.assertEquals("https://www.balenciaga.com/en-en",loggedInUserName);
    }
    @Test
    public void Logosecond()
    {
        String loggedInUserName = new Winter22Page(driver)
                .openPage().
                clicklogo();
        System.out.println(loggedInUserName);
        Assert.assertEquals("https://www.balenciaga.com/en-en",loggedInUserName);
    }
    @Test
    public void Logothird()
    {
        String loggedInUserName = new ShopPage(driver)
                .openPage().
                clicklogo();
        System.out.println(loggedInUserName);
        Assert.assertEquals("https://www.balenciaga.com/en-en",loggedInUserName);
    }
    @Test
    public void Logofourth()
    {
        String loggedInUserName = new AuthPage(driver)
                .openPage().
                clicklogo();
        System.out.println(loggedInUserName);
        Assert.assertEquals("https://www.balenciaga.com/en-en",loggedInUserName);
    }
    @Test
    public void Logofifth()
    {
        String loggedInUserName = new ClientServicePage(driver)
                .openPage().
                clicklogo();
        System.out.println(loggedInUserName);
        Assert.assertEquals("https://www.balenciaga.com/en-en",loggedInUserName);
    }
}
