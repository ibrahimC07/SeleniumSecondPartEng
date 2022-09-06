package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
go https://jqueryui.com/accordion/
User clicks Section2 accordion
Verify text contains "Sed non urna"

 */
public class Homework7 {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://jqueryui.com/accordion/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        driver.findElement(By.cssSelector("#ui-id-3")).click();
        WebElement text=driver.findElement(By.cssSelector("#ui-id-4"));
        if(text.isDisplayed()){
            Assert.assertTrue("match",text.getText().contains("Sed non urna"));

        }



    }
}
