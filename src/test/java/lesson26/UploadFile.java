package lesson26;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class UploadFile extends InitialDriver {

    @Test
    public void unloadFile() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("/Users/serhii/IdeaProjects/hillel_0906/rozetkaTest.txt");
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.submit();
        sleep(5000);
    }
}
