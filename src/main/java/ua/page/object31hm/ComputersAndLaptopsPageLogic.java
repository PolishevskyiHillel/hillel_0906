package ua.page.object31hm;

import org.openqa.selenium.WebDriver;

public class ComputersAndLaptopsPageLogic extends ComputersAndLaptopsPageLocators {

    private WebDriver driver;

    public ComputersAndLaptopsPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public LaptopsPageLogic clickLaptopsPageLogic() {
        driver.findElement(sectionLaptop).click();
        return new LaptopsPageLogic(driver);
    }
}
