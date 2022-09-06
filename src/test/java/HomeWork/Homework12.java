package HomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

/*
Create a class:Synchronization3. Create a method: synchronization1
Go to https://the-internet.herokuapp.com/dynamic_controls
Click on remove button
And verify the message is equal to “It's gone!”
Then click on Add button
And verify the message is equal to “It's back!”
 */
public class Homework12 extends TestBase {
    public void synchronization1(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
       WebElement actualText= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertEquals("It's gone!",actualText.getText());

        driver.findElement(By.xpath("//form[@id=\"checkbox-example\"]")).click();
        WebElement actualLast=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertEquals("It's back!",actualLast.getText());
    }
}
