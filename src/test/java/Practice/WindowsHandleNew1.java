package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Iterator;
import java.util.Set;
/*
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

public class WindowsHandleNew1 extends TestBase {
    @Test
    public void test(){
driver.get("https://the-internet.herokuapp.com/windows");
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
String handle1=driver.getWindowHandle();
driver.findElement(By.linkText("Click Here")).click();
Set<String> handles=driver.getWindowHandles();
//handles=handle1+handle2
        //handles-handle1=handle2
        System.out.println(handles);
//for(String w:handles){
        int counter=1;
    Iterator <String>itr=handles.iterator();
    while (itr.hasNext()){
        String handle2=itr.next();
        driver.switchTo().window(handle2);
       // String handle3=itr.next();
       // driver.switchTo().window(handle3);



    }
}
            }






