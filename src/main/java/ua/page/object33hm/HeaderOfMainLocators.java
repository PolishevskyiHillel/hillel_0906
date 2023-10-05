package ua.page.object33hm;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderOfMainLocators {
    SelenideElement basketBtn = $(By.xpath("//rz-cart/button"));
    SelenideElement goodInBasket = $(By.xpath("//rz-cart//rz-icon-badge/span"));
}
