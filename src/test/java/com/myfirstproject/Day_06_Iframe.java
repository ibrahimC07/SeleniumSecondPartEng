package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day_06_Iframe extends TestBase
{
    /*
    Create a class: IFrameTest
Create a method: iframeTest
Go to https://the-internet.herokuapp.com/iframe
Verify the Bolded text contains “Editor”
Locate the text box
Delete the text in the text box
Type “This text box is inside the iframe”
Verify the text Elemental Selenium text is displayed on the page
Collaps
     */

    @Test
    public void iframe(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        String boldedText=driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(boldedText.contains("Editor"));

        driver.switchTo().frame(0);
        //driver.switchTo().frame("mce_0_ifr");
        WebElement box = driver.findElement(By.xpath("//p"));

       // WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //driver.switchTo().frame(iFrame);
//        Delete the text in the text box
        box.clear();//clear - > clears the box. deletes the texts
//        Type “This text box is inside the iframe”

//        Verify the text Elemental Selenium text is displayed on the page
    }
}
