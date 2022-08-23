package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class Day06_WindowHandle2 extends TestBase {
    @Test
    public void newWindowTest(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getTitle());
        String windowHandleTechPro=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https:www.amazon.com");
        System.out.println(driver.getTitle());
        String amazonHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https:www.linkedn.com");
        System.out.println(driver.getTitle());
       // String amazonHandle=driver.getWindowHandle();
    }
}
