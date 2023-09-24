package ua.page.object31hm;

import org.openqa.selenium.WebDriver;

public class HeaderOfMainPageLogic extends HeaderOfMainPageLocators {

    private WebDriver driver;

    public HeaderOfMainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public HeaderOfMainPageLogic goToBasket() {
        driver.findElement(basketBtn).click();
        return new HeaderOfMainPageLogic(driver);
    }

    public String productInBasketBtn() {
        return driver.findElement(productInBasket).getAttribute("innerText");
    }
}
