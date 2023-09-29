package ua.page.object32hm;

import org.openqa.selenium.WebDriver;

public class MainPageLogic extends MainPageLocators {

    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public ComputersAndLaptopsPageLogic clickOnComputersAndLaptops() {
        driver.findElement(computersAndLaptopsCategoryBtn).click();
        return new ComputersAndLaptopsPageLogic(driver);
    }
}
