package ua.page.object33hm;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public interface ComputersAndLaptopsPageLocators {
    ElementsCollection subLaptopsTab = $$(By.xpath("//a[@title='Ноутбуки'][contains(text(),'Ноутбуки')]"));
}