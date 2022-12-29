package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.RandomProductPage;

public class IncreaseNumberOfProduct extends CommonConditions{

    @Test
    public void EditNumber() throws InterruptedException {
        Boolean deletefromcart = new RandomProductPage(driver)
                .openPage()
                .clicktoadd()
                .openCart()
                .EditNum()
                .Proceed();
        Assert.assertEquals((boolean) deletefromcart, true);
    }
}