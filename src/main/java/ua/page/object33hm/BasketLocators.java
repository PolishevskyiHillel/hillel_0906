package ua.page.object33hm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface BasketLocators {
    SelenideElement actualNameOfGoodInBasket = $(By.xpath("//a[@class='cart-product__title']"));
    SelenideElement actualQuantityOfGoodInBasket = $(By.xpath("//rz-cart-counter//input"));
}