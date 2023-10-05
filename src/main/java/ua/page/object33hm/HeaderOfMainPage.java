package ua.page.object33hm;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public abstract class HeaderOfMainPage extends HeaderOfMainLocators {

    public BasketLogic openBasket() {
        basketBtn.click();
        return page(BasketLogic.class);
    }

    public void quantityOfGoodsInBasket(String quantityInBasket) {
        if (quantityInBasket.equals("0")) {
            goodInBasket.shouldNotBe(exist);
        } else {
            goodInBasket.shouldBe(attribute("innerText", quantityInBasket));
        }
    }
}