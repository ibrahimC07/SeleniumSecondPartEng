package HomeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

/*
Create a class:Synchronization2.
Create a method: synchronization2
Go to https://the-internet.herokuapp.com/dynamic_loading/2
When user clicks on the Start button
Then verify the ‘Hello World!’ Shows up on the screen
 */
public class HomeWork11 extends TestBase {
    @Test
    public void syncronization2(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
driver.findElement(By.xpath("//div[@id='start']//button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
WebElement actualText= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//h4)[2]"))));
        Assert.assertEquals("Hello World!",actualText.getText());

    }
}
