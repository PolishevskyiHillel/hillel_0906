package ua.page.object33hm;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface LaptopsPageLocators {
    ElementsCollection firstLaptop = $$(By.xpath("//span[@class='goods-tile__title']"));
    ElementsCollection buyBtn = $$(By.xpath("//app-buy-button/button"));
    SelenideElement markOnGood = $(By.xpath("//button[contains(@class,'buy-button_state_in-cart')]"));
}