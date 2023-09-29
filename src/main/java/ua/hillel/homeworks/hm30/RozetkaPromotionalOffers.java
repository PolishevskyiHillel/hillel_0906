package ua.hillel.homeworks.hm30;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class RozetkaPromotionalOffers {

    final String EXPECTED_URL = "https://rozetka.com.ua/ua/";

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.manage().window().maximize();
    }

    @Test
    public void assertTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1500);");
        sleep(3000);

        WebElement specialOffersBlock = driver.findElement(By.xpath("//h2[contains(text(), 'Акційні пропозиції')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ul[@class='main-goods__grid ng-star-inserted']"), 5));
        List<WebElement> products = specialOffersBlock.findElements(By.xpath("//ul[@class='main-goods__grid ng-star-inserted']"));
        Assert.assertEquals(products.size(), 6, "The number of products in the 'Promotional offers' block is not equal to 6.");

        WebElement promotionalGoods = driver
                .findElement(By.xpath("//div[@class='tile__price-old ng-star-inserted']/following-sibling::div"));
        String priceFirstGood = promotionalGoods.getText();
        WebElement firstGood = driver
                .findElement(By.xpath("//li[@class='main-goods__cell ng-star-inserted']//div"));
        firstGood.click();
        WebElement priseGoodPage = driver
                .findElement(By.xpath("//p[@class='product-price__small ng-star-inserted']/following-sibling::p[1]"));
        String priseGoodPageText = priseGoodPage.getText();
        Assert.assertEquals(priceFirstGood, priseGoodPageText, "Prices for products are different");
        WebElement rozetkaLogo = driver.findElement(By.xpath("//img[@alt='Rozetka Logo']"));
        rozetkaLogo.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, EXPECTED_URL, "URLs are different");
        js.executeScript("window.scrollBy(0, 2000);");

        List<WebElement> finishElements = driver.findElements(By.xpath("//h2[contains(text(), 'Акційні пропозиції')]/following-sibling::ul[@class='main-goods__grid ng-star-inserted']/li"));
        Assert.assertEquals(finishElements.size(), 6);
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
