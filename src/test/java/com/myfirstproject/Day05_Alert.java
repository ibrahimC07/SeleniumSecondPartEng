package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
/*
Go to https://the-internet.herokuapp.com/javascript_alerts
Create a class: AlertTest
Create setUp method
Create 3 test methods:
acceptAlert() => click on the first alert,
verify the text “rI am a JS Alert” ,
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
public class Day05_Alert extends TestBase {
    @Test
    public void acceptAlert(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        String ActualAlertText=driver.switchTo().alert().getText();
        System.out.println(ActualAlertText);
String expected="I am a JS Alert";
        driver.switchTo().alert().accept();
        Assert.assertEquals(expected,ActualAlertText);


        String actualResult=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedTesult="You successfully clicked an alert";

        Assert.assertEquals(expectedTesult,actualResult);

    }
    @Test
    public void dismissAlert(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        String actualData=driver.switchTo().alert().getText();
        String expectedData="I am a JS Confirm";
        Assert.assertEquals(expectedData,actualData);


        driver.switchTo().alert().dismiss();
        String actualResult=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResult="You clicked: Cancel";
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sendKeysAlert(){
/*
sendKeysAlert()=> click on the third alert,
verify text “I am a JS prompt”,
type “Hello World”,
click OK,
and Verify “You entered: Hello World”
 */
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        String actualData=driver.switchTo().alert().getText();
        String expectedData="I am a JS prompt";
        Assert.assertEquals(expectedData,actualData);
        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();
        String expectedResult="You entered: Hello World";
        String actualresult=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expectedResult,actualresult);
    }
}
