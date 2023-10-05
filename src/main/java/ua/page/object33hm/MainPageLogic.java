package ua.page.object33hm;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends HeaderOfMainPage implements MainPageLocators {

    public ComputersAndLaptopsPageLogic openComputersAndLaptops(int category) {
        computersAndLaptopsBtn.get(category).click();
        return page(ComputersAndLaptopsPageLogic.class);
    }

    public MainPageLogic firstQuantityOfGoodInBasket(String quantityInBasket) {
        quantityOfGoodsInBasket(quantityInBasket);
        return this;
    }
}