package ua.page.object31hm;

import org.openqa.selenium.WebDriver;

public class LaptopsPageLogic extends LaptopsPageLocators {

    private WebDriver driver;

    public LaptopsPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleOfFirstGood() {
        return driver.findElement(firstGoodName).getAttribute("innerText");
    }

    public LaptopsPageLogic addToBasketFirstLaptop() {
        driver.findElement(buyBtn).click();
        return this;
    }
}
