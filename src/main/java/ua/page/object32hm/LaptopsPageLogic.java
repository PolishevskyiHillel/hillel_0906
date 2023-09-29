package ua.page.object32hm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LaptopsPageLogic extends LaptopsPageLocators {

    private WebDriver driver;

    public LaptopsPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public LaptopsPageLogic menuFilterRozetka() {
        driver.findElement(filterRozetka).click();
        return new LaptopsPageLogic(driver);
    }

    public LaptopsPageLogic menuFilterPriceClear() {
        driver.findElement(filterPrice).clear();
        return new LaptopsPageLogic(driver);
    }

    public LaptopsPageLogic menuFilterPriceSetNewValue() {
        driver.findElement(filterPrice).sendKeys("100000");
        return new LaptopsPageLogic(driver);
    }

    public LaptopsPageLogic menuFilterPriceSendNewValue() {
        driver.findElement(filterPrice).sendKeys(Keys.ENTER);
        return new LaptopsPageLogic(driver);
    }

    public void goToFirstTopSaleGood() {
        driver.findElement(topSaleGood).click();
        new LaptopsPageLogic(driver);
    }
}
