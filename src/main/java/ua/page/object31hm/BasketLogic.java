package ua.page.object31hm;

import org.openqa.selenium.WebDriver;

public class BasketLogic extends BasketLocators {

    private WebDriver driver;

    public BasketLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductNameInBasket() {
        return driver.findElement(laptopTitleInCart).getAttribute("innerText");
    }
}
