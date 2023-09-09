package ua.hillel.homeworks.hw27;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class RozetkaPractice {

    final String EXPECTED_TOP_SALE_BTN = "ТОП ПРОДАЖІВ";

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
    public void assertTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement menuLaptopsBtn = driver.findElement(By.xpath("//a[@class='menu-categories__link'][contains(text(),'Ноутбуки та комп’ютери')]"));
        menuLaptopsBtn.click();
        WebElement laptopCategoryBtn = driver.findElement(By.xpath("//a[@title='Ноутбуки'][contains(text(),'Ноутбуки')]"));
        laptopCategoryBtn.click();
        WebElement menuFilter = driver.findElement(By.xpath("//a[@data-id='Rozetka']"));
        menuFilter.click();
        WebElement menuPrice = driver.findElement(By.xpath("//*[@formcontrolname=\"max\"]"));
        menuPrice.clear();
        menuPrice.sendKeys("100000");
        menuPrice.sendKeys(Keys.ENTER);
        WebElement topSellingLabel = driver.findElement(By.xpath("//span[contains(@class,'promo-label_type_popularity')]/following-sibling::a"));
        topSellingLabel.click();
        WebElement topSellingLabelIsPresent = driver.findElement(By.xpath("(//span[@class='promo-label_type_popularity promo-label promo-label--large ng-star-inserted'][contains(text(),'ТОП ПРОДАЖІВ')])[2]"));
        String btnTopSaleValue = topSellingLabelIsPresent.getText();
        Assert.assertEquals(btnTopSaleValue, EXPECTED_TOP_SALE_BTN, "TopSale button isn't present");
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}