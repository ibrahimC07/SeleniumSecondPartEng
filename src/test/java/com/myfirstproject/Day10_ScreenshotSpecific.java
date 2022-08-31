package com.myfirstproject;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day10_ScreenshotSpecific extends TestBase {
    @Test
    public void screenShotTest() throws IOException {
        driver.get("https:www.techproeducation.com");
        WebElement logo=driver.findElement(By.xpath("//div[@data-id='898ce2e']"));
        File image=logo.getScreenshotAs(OutputType.FILE);
        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/src/Screenshots/"+currentTime+"image.png";
        FileUtils.copyFile(image,new File(path));
    }

    public static class Day10_ExtentReport {

        @Test
        public void extend(){

        }
    }
}
