package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class IframeNew extends TestBase {
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
        int iframeCount=driver.findElements(By.tagName("iframe")).size();
        //System.out.println(iframeCount);
        //driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        //driver.switchTo().frame("mce_0_ifr");
        //driver.findElement(By.xpath("//p")).clear();

        driver.switchTo().frame(0);
        WebElement ptag =driver.findElement(By.xpath("(//*[.='Your content goes here.'])[2]"));
        ptag.clear();
        ptag.sendKeys("This text box is inside the iframe");
        driver.switchTo().defaultContent();
       //Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).isDisplayed());
       Assert.assertEquals("Elemental Selenium",driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).getText());

    }
}

