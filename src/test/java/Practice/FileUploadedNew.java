package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

/*
When user goes to https://the-internet.herokuapp.com/upload
//    When user selects an image from the desktop
//    And click on the upload button
//    Then verify the File Uploaded!  Message displayed
 */
public class FileUploadedNew extends TestBase {
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile =driver.findElement(By.cssSelector("#file-upload"));

String homeDirectory=System.getProperty("user.home");
String xPath=homeDirectory+"\\Downloads\\nature.jpg";
chooseFile.sendKeys(xPath);
 driver.findElement(By.xpath("//input[@id='file-submit']")).click();
String actual=driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!",actual);


    }
}
