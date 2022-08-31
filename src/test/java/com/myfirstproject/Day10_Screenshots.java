package com.myfirstproject;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day10_Screenshots extends TestBase {
    @Test
    public void takeScreenShotTest() throws IOException {
        driver.get("https:www.amazon.com");
takeScreenShot();
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("teaPot"+Keys.ENTER);
         takeScreenShot();
    }
    public void takeScreenShot() throws IOException {
        File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/src/Screenshots/"+currentTime+"image.png";
        FileUtils.copyFile(image,new File(path));
    }
}
