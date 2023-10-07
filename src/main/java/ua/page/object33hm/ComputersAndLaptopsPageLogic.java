package ua.page.object33hm;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class ComputersAndLaptopsPageLogic implements ComputersAndLaptopsPageLocators {

    public LaptopsPageLogic openLaptops(String subLaptopsTabName) {
        subLaptopsTab.last().shouldBe(visible);
        for (SelenideElement subLaptops : subLaptopsTab) {
            if (subLaptops.text().equals(subLaptopsTabName)) {
                subLaptops.click();
                break;
            }
        }
        return page(LaptopsPageLogic.class);
    }
}