package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
/*
Go to https://the-internet.herokuapp.com/javascript_alerts
Create a class: AlertTest
Create setUp method
Create 3 test methods:
acceptAlert() => click on the first alert,
verify the text  “rI am a JS Alert” ,
click OK ,
and Verify “You successfully clicked an alert”


dismissAlert()=> click on the second alert,
verify text "I am a JS Confirm”,
click cancel,
and Verify “You clicked: Cancel”
sendKeysAlert()=> click on the third alert,
verify text “I am a JS prompt”,
type “Hello World”,
click OK,
and Verify “You entered: Hello World”
 */
public class AlertNew extends TestBase {
    @Test
    public void test(){
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        String actual=driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Alert",actual);
        driver.switchTo().alert().accept();
        WebElement text=driver.findElement(By.xpath("//*[text()='You successfully clicked an alert']"));
        Assert.assertTrue(text.isDisplayed());


    }
    @Test
    public void test2(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        String data=driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Confirm",data);
        driver.switchTo().alert().dismiss();
        Assert.assertTrue(driver.findElement(By.cssSelector("#result")).isDisplayed());

    }
@Test
    public void test3(){
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
    Assert.assertEquals("I am a JS prompt",driver.switchTo().alert().getText());
    driver.switchTo().alert().sendKeys("Hello World");
    driver.switchTo().alert().accept();
    Assert.assertTrue(driver.findElement(By.xpath("//*[text()='You entered: Hello World']")).isDisplayed());





}
}
