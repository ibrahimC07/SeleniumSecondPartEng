package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
//    When user goes to https://the-internet.herokuapp.com/upload
//    When user selects an image from the desktop
//    And click on the upload button
//    Then verify the File Uploaded!  Message displayed
public class Day08_UploadFile extends TestBase {
    @Test
    public void upload(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile=driver.findElement(By.cssSelector("#file-upload"));

        String homeDirectory=System.getProperty("user.home");
        String path=homeDirectory+"\\OneDrive\\Desktop\\atiyeJava.png";

        chooseFile.sendKeys(path);

        WebElement upload=driver.findElement(By.cssSelector("#file-submit"));
        upload.click();

       String actualText= driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals("File Uploaded!",actualText);


    }
}
