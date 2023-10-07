package lesson27;

import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.page.object.selenium.MainPageLogic;
import ua.page.object.selenium.SearchPageLogic;


public class PageObjectExample extends InitialDriver {

    @Test
    public void testWithPageObject() {
        driver.get("https://rozetka.com.ua/ua/");
        String tittleFirstProductFromSearchPage = new MainPageLogic(driver)
                .typeTextToInputSearch("Mac")
                .clickSearchBtn()
                .getFirstProductTittle();
        String tittleOfProductOnProductPage = new SearchPageLogic(driver)
                .clickOnFirstProduct()
                .getTittleOfProduct();
        Assert.assertEquals(tittleFirstProductFromSearchPage, tittleOfProductOnProductPage);
    }
}