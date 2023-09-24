package homeworks.hm32;

import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.page.object32hm.FirstGoodLogic;
import ua.page.object32hm.MainPageLogic;


public class RozetkaTopSaleGoodPageObject extends InitialDriver {

    final String EXPECTED_TOP_SALE_BTN = "ТОП ПРОДАЖІВ";

    @Test
    public void testWithPageObject() {
        driver.get("https://rozetka.com.ua/ua/");

        new MainPageLogic(driver)
                .clickOnComputersAndLaptops()
                .clickLaptopsPageLogic()
                .menuFilterRozetka()
                .menuFilterPriceClear()
                .menuFilterPriceSetNewValue()
                .menuFilterPriceSendNewValue()
                .goToFirstTopSaleGood();

        FirstGoodLogic topSaleLabelOnFirstGood = new FirstGoodLogic(driver);
        String labelIsPresent = topSaleLabelOnFirstGood.verifyLabelTopSale();
        Assert.assertEquals(labelIsPresent, EXPECTED_TOP_SALE_BTN, "TopSale button isn't present");
    }
}
