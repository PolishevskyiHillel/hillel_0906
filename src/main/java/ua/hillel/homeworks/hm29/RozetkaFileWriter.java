package ua.hillel.homeworks.hm29;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RozetkaFileWriter {

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void assertTest() throws IOException {
        driver.get("https://rozetka.com.ua/");
        WebElement menuLaptopsBtn = driver.findElement(By.xpath("//a[@class='menu-categories__link'][contains(text(),'Ноутбуки та комп’ютери')]"));
        menuLaptopsBtn.click();
        WebElement laptopCategoryBtn = driver.findElement(By.xpath("//a[@title='Ноутбуки'][contains(text(),'Ноутбуки')]"));
        laptopCategoryBtn.click();

        List<WebElement> products = driver.findElements(By.xpath("//span[@class='goods-tile__title']"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

        Map<String, String> productData = new HashMap<>();
        for (int i = 0; i < products.size() && i < 60; i++) {
            WebElement product = products.get(i);
            WebElement priceElement = prices.get(i);
            String title = product.getText();
            String price = priceElement.getText();
            productData.put(title, price);
        }

        FileWriter writer = new FileWriter("rozetkaTest.txt");
        for (Map.Entry<String, String> entry : productData.entrySet()) {
            writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
        }
        writer.close();
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
