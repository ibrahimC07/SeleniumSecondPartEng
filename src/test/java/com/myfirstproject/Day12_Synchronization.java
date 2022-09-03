package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

/*
Create a method: explicitWait
Go to https://the-internet.herokuapp.com/dynamic_loading/1
When user clicks on the Start button
Then verify the ‘Hello World!’ Shows up on the screen
10:33
https://the-internet.herokuapp.com/dynamic_loading/
 */
public class Day12_Synchronization extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        //Thread.sleep(6000);//Works with Thread.Sleep but this method waits until 6000 complete,this way is hard coding.
        //if it completes before this time we should be able to continue, we used explicitWay for this
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ActualWaitText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));

        Assert.assertEquals("Hello World!",ActualWaitText.getText());


        //implicitly can not get because element is hidden.After click i have to wait to load page and see the element
    }


    //-------------------------------------------------------------------------------------------------------------------

    @Test
    public void explicitWait() throws InterruptedException {
//        Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        When user clicks on the Start button
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
//        Then verify the ‘Hello World!’ Shows up on the screen
//        1. create WebDriverWait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait does 2 things: 1. waits for the element. 2. returns it as web element so no need to use findElement
        WebElement helloWorld = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
        String helloWorldText = helloWorld.getText();
        Assert.assertEquals("Hello World!",helloWorldText);

/*
        NOTE: This code fails because the Hello World text is hidden for about 5 seconds
        We should wait for the element using explicit wait to be displayed
        WebElement helloWorld = driver.findElement(By.xpath("//div[@id='finish']//h4"));
        String helloWorldText = helloWorld.getText();
        Assert.assertEquals("Hello World!",helloWorldText);
 */
    }

}
