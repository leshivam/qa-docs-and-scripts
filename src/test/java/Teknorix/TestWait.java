package Teknorix;



import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestWait {

    @Description("Open page")
    @Test
    public void test_openVWOLoginPage(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
        chromeDriver.manage().window().maximize();
        WebElement searchBox = chromeDriver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchBox.sendKeys("Teknorix");
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[2]/div/svg")));

        WebElement button = chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
        button.click();

        chromeDriver.quit();
    }
}
