package ua.page.object32hm;

import org.openqa.selenium.WebDriver;

public class FirstGoodLogic extends FirstGoodLocators {

    private WebDriver driver;

    public FirstGoodLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String verifyLabelTopSale() {
        return driver.findElement(topSaleLabel).getAttribute("innerText");
    }

}
