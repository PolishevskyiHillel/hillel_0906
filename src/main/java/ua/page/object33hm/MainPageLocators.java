package ua.page.object33hm;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public interface MainPageLocators {
    ElementsCollection computersAndLaptopsBtn = $$(By.xpath("//a[@class='menu-categories__link'][contains(text(),'Ноутбуки та комп’ютери')]"));
}