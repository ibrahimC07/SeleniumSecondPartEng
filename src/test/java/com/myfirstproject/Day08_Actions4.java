package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
/*
Create a method dragAndDropTest
Given user is on https://jqueryui.com/droppable/
And user moves the target element(Drag me to my target) in to destination(Drop here)
 */
public class Day08_Actions4 extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);


        WebElement source=driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();

    }
    @Test
    public void clickAndHoldTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);


        WebElement source=driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).perform();
        actions.clickAndHold(source).moveByOffset(178,42).perform();//x left/y top
        /*
         * Why your test case MIGHT FAIL?
         * 1. Incorrect Locator.
         * 2. Timing. Synchronization. - we already have enough timeout
         * 3. New Window
         * 4. JS Alerts
         * 5. IFrame
         * */

    }
}
