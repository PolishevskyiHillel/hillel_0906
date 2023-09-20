package lesson28;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class FirstSelenideTest {

    @BeforeMethod
    public void before() {
        open("https://www.google.com.ua/");
    }

    @Test
    public void selenideTest() throws InterruptedException {
        $(By.name("q")).setValue("Hillel").pressEnter();
        sleep(3000);
    }

    @Test
    public void selenideSecondTest() {
        $(By.xpath("(//input[@name='btnK'])[2]"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.value("Google Search"), Duration.ofSeconds(5000))
                .shouldHave(Condition.exactValue("Google Search"))
                .shouldNotHave(Condition.value("Alex"))
                .click();
    }
}
