package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
/*Create test method : scrollUpDown()
Go to techproeducation
Scroll the page down
Scroll the page up

 */
public class Day08_Actions3 extends TestBase {
    @Test
    public void ScrollUpDown()throws InterruptedException{
        driver.get("https:www.techproeducation.com");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(5000);
        actions.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_RIGHT).build().perform();


    }
}
