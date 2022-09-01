package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.IOException;

/*
/Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    //Click on Ajax Loader
    //Then click on "Click Me!" button.
    //Take screenshot after each step.
 */
public class Q05 extends TestBase {
    @Test
    public void test() throws IOException {
driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
driver.findElement(By.linkText("CLICK ME!")).click();
driver.findElement(By.cssSelector("#button1")).click();
takeScreenShot();

    }
}
