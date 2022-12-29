package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.RandomProductPage;

public class DeleteFromCart extends CommonConditions{
    @Test
    public void DeletefromCard() throws InterruptedException {
        Boolean deletefromcart = new RandomProductPage(driver)
                .openPage()
                .clicktoadd()
                .openCart()
                .DeleteCart();
        Assert.assertEquals((boolean) deletefromcart, true);
    }
}