package HomeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

/*
Create a class:Synchronization4. Create a method: isEnabled
Go to https://the-internet.herokuapp.com/dynamic_controls
Click enable Button
And verify the message is equal to “It's enabled!”
And verify the textbox is enabled (I can type in the box)
And click on Disable button
And verify the message is equal to “It's disabled!”
And verify the textbox is disabled (I cannot type in the box)
NOTE: .isEnabled(); is used to check if an element is enabled or not
 */
public class Homework13 extends TestBase {
    @Test
    public void isEnabled(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement isExpected=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertEquals("It's enabled!",isExpected.getText());
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='input-example']//input")).isEnabled());driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
       Boolean isDisplayed= wait.until(ExpectedConditions.textToBe(By.xpath("//p[@id='message']"),"It's disabled!"));
       Assert.assertTrue(isDisplayed);
        Assert.assertFalse(driver.findElement(By.xpath("//form[@id='input-example']//input")).isEnabled());








    }
}
