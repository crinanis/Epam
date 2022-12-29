package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.RandomProductPage;

public class AddToCard extends CommonConditions{
    @Test
    public void addToCard() throws InterruptedException {
        boolean addtocart = new RandomProductPage(driver)
                .openPage()
                .clicktoadd()
                .openCart()
                .checkCart();
        Assert.assertEquals(true,addtocart);
    }
}