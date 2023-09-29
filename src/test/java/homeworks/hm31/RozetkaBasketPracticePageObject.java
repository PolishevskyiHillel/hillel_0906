package homeworks.hm31;

import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.page.object31hm.*;


public class RozetkaBasketPracticePageObject extends InitialDriver {

    final String EXPECTED_COUNT_GOOD = "1";

    @Test
    public void testWithPageObject() {
        driver.get("https://rozetka.com.ua/ua/");

        String nameOfFirstGood = String.valueOf(new MainPageLogic(driver)
                .clickOnComputersAndLaptops()
                .clickLaptopsPageLogic()
                .addToBasketFirstLaptop()
                .getTitleOfFirstGood());

        HeaderOfMainPageLogic goodInBasket = new HeaderOfMainPageLogic(driver);
        String numberOfItemsInBasket = goodInBasket.productInBasketBtn();
        Assert.assertEquals(numberOfItemsInBasket, EXPECTED_COUNT_GOOD, "The Basket is empty");

        goodInBasket.goToBasket();
        BasketLogic basketGoodName = new BasketLogic(driver);
        String basketGoodNameText = basketGoodName.getProductNameInBasket();
        Assert.assertEquals(basketGoodNameText, nameOfFirstGood, "The good is not the same");
    }
}
