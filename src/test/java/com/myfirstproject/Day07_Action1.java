package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
/*
Step 1: Create the action object:
Actions actions=new Actions(driver);
Step 2: Locate the WebElement you want to work on :
WebElement element = driver.findElement(By.id(“ID"));
Step 3: Perform the action on the WebElement by using this actions object.
For instance, to right click: actions.contextClick(element).perform();
perform() : Executes an action.This must be used at the end to perform an action.DO NOT FORGET TO USE PERFORM()

Create a class: Actions1
Create a test method : contextClickMethod() and test the following scenario:
Given user is on the https://the-internet.herokuapp.com/context_menu
When use Right clicks on the box
Then verify the alert message is “You selected a context menu”
Then accept the alert


 */
public class Day07_Action1 extends TestBase {
    @Test
    public void action(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
       WebElement box = driver.findElement(By.cssSelector("#hot-spot"));
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();
        String actualText=driver.switchTo().alert().getText();
        Assert.assertTrue(actualText.contains("You selected a context menu"));
        driver.switchTo().alert().accept();




    }
}
