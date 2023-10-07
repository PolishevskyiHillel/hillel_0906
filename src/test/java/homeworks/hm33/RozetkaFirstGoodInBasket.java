package homeworks.hm33;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.page.object33hm.LaptopsPageLogic;
import ua.page.object33hm.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class RozetkaFirstGoodInBasket {
    @BeforeTest
    public void before() {
        open("https://rozetka.com.ua/ua/");
    }

    @Test
    public void verifyGoodInBasket() {
        String nameOfGood = new MainPageLogic()
                .firstQuantityOfGoodInBasket("0")
                .openComputersAndLaptops(0)
                .openLaptops("Ноутбуки")
                .addFirstGoodInBasket(0)
                .verifyGoodInBasket()
                .finalQuantityOfGoodInBasket("1")
                .saveNameOfGood(0);
        new LaptopsPageLogic()
                .openBasket()
                .verifyActualNameOfGood(nameOfGood)
                .verifyQuantityOfGoodInBasket("1");
    }
}