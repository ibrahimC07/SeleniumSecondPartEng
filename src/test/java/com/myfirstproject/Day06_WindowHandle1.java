package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class Day06_WindowHandle1 extends TestBase {
    /*
    Create a new Class Tests package: Day08_WindowHandleExample
    Method name:windowHandle
    Given user is on the https://the-internet.herokuapp.com/windows
    Then user verifies the text : “Opening a new window”
Then user verifies the title of the page is “The Internet”
When user clicks on the “Click Here” button
Then user verifies the new window title is “New Window”
Then user verifies the text:  “New Window”
When user goes back to the previous window and then verifies the title : “The Internet”
     */
    @Test
    public void windowHandle(){
        driver.get("https://the-internet.herokuapp.com/windows");
       String window1handle=driver.getWindowHandle();
        //System.out.println(window1handle);
        driver.findElement(By.linkText("Click Here")).click();
Set<String> allWindowsHandle=driver.getWindowHandles();

for(String eachHandle:allWindowsHandle){
    if(!eachHandle.equals(window1handle)){
        driver.switchTo().window(window1handle);

    }
}
String windowHandle2=driver.getWindowHandle();

    }
}
