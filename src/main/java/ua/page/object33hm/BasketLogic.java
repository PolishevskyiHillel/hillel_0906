package ua.page.object33hm;

import com.codeborne.selenide.Condition;

public class BasketLogic implements BasketLocators {

    public BasketLogic verifyActualNameOfGood(String titleOFItem) {
        actualNameOfGoodInBasket.shouldHave(Condition.attribute("innerText", titleOFItem));
        return this;
    }

    public BasketLogic verifyQuantityOfGoodInBasket(String quantity) {
        actualQuantityOfGoodInBasket.shouldHave(Condition.attribute("value", quantity));
        return this;
    }
}