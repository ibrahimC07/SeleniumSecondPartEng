package PracticeYasin02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
/*
// 1. Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    // 2. Click "CLICK ME" of JavaScript Alert
    // 3. Get the pop-up text
    // 4. Verify that message is "I am an alert box!"
    // 5. Accept pop-up
webdriveruniversity.com
WebDriver | Popups & Alerts
Free Online (Interaction) Training Platform. Enhance yours skills within Automation Testing (Selenium WebDriver), Complicated Tasks & Framework Design…
 */
public class Q02 extends TestBase {
    @Test
    public void test(){
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.findElement(By.cssSelector("#button1")).click();
      String alertText=  driver.switchTo().alert().getText();
        Assert.assertEquals("I am an alert box!",alertText);
        driver.switchTo().alert().accept();
    }
}
