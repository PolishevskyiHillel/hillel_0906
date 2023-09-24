package ua.page.object32hm;

import org.openqa.selenium.By;

public class LaptopsPageLocators {

    By filterRozetka = By.xpath("//a[@data-id='Rozetka']");
    By filterPrice = By.xpath("//*[@formcontrolname=\"max\"]");
    By topSaleGood = By.xpath("//span[contains(@class,'promo-label_type_popularity')]/following-sibling::a");

}
