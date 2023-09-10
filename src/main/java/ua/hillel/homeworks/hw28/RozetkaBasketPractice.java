package ua.hillel.homeworks.hw28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RozetkaBasketPractice {

    final String EXPECTED_COUNT_GOOD = "1";

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
    public void assertTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement menuLaptopsBtn = driver.findElement(By.xpath("//a[@class='menu-categories__link'][contains(text(),'Ноутбуки та комп’ютери')]"));
        menuLaptopsBtn.click();
        WebElement laptopCategoryBtn = driver.findElement(By.xpath("//a[@title='Ноутбуки'][contains(text(),'Ноутбуки')]"));
        laptopCategoryBtn.click();
        WebElement firstGood = driver.findElement(By.xpath("//*[@class=\"goods-tile__title\"]"));
        firstGood.click();
        WebElement basketBtn = driver.findElement(By.xpath("//span[@class='buy-button__label ng-star-inserted']"));
        basketBtn.click();
        WebElement basketCloseBtn = driver.findElement(By.className("modal__close"));
        basketCloseBtn.click();
        WebElement goodName = driver.findElement(By.xpath("//h1[contains(@class,'product__title-left product__title-collapsed')]"));
        String goodNameText = goodName.getText();
        WebElement productInBasket = driver.findElement(By.xpath("//span[contains(@class,'badge badge--green')]"));
        String productInBasketBtn = productInBasket.getText();
        Assert.assertEquals(productInBasketBtn, EXPECTED_COUNT_GOOD, "Product in basket isn't present");

        WebElement basketIcon = driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted header__button--active']//*[name()='svg']"));
        basketIcon.click();
        WebElement basketGoodName = driver.findElement(By.className("cart-product__title"));
        String basketGoodNameValue = basketGoodName.getText();
        Assert.assertEquals(basketGoodNameValue, goodNameText, "Product names are different");
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
