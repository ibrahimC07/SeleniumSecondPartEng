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
        driver.get("https:www.linkedin.com");
        System.out.println(driver.getTitle());
        String linkednHandle=driver.getWindowHandle();

        driver.switchTo().window(windowHandleTechPro);


    }
    @Test
    public void newTab(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getTitle());
        String windowHandleTechPro=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://lms.techproeducation.com/");
        String lmsTitle=driver.getTitle();
        System.out.println(lmsTitle);
        String lmsHandle=driver.getWindowHandle();
        driver.switchTo().window(windowHandleTechPro);



    }
}
