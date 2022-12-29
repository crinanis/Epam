package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ShopPage;

public class Find extends CommonConditions{
    @Test
    public void Findmodel() throws InterruptedException {
        boolean Find = new ShopPage(driver)
                .openRandomPage()
                .cheacfindlist();
        Assert.assertEquals(true,Find);
    }
    @Test
    public void Findathome() throws InterruptedException {
        boolean Find = new ShopPage(driver)
                .openRandomPage1()
                .cheacfindlist();
        Assert.assertEquals(true,Find);
    }
}