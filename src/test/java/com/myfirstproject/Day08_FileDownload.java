package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

/*
Create a class:FileDownloadTest
downloadTest()
In the downloadTest() method, do the following test:
Go to https://the-internet.herokuapp.com/download
Download flower.png file
Then verify if the file downloaded successfully
 */
public class Day08_FileDownload extends TestBase {
    @Test
    public void download() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("usa.png")).click();
Thread.sleep(1000);
        String homeDirectory=System.getProperty("user.home");
        String path=homeDirectory+"\\Downloads\\usa.png";
        boolean isDownloaded= Files.exists(Paths.get(path));
        Assert.assertTrue(isDownloaded);

    }
}
