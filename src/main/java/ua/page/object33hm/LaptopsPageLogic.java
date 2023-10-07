package ua.page.object33hm;

import com.codeborne.selenide.Condition;

public class LaptopsPageLogic extends HeaderOfMainPage implements LaptopsPageLocators {

    public String saveNameOfGood(int position) {
        return firstLaptop.get(position).text();
    }

    public LaptopsPageLogic addFirstGoodInBasket(int position) {
        buyBtn.get(position).click();
        return this;
    }

    public LaptopsPageLogic verifyGoodInBasket() {
        markOnGood.shouldBe(Condition.visible);
        return this;
    }

    public LaptopsPageLogic finalQuantityOfGoodInBasket(String quantityInCart) {
        quantityOfGoodsInBasket(quantityInCart);
        return this;
    }
}