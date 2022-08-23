package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
/*
Create a class: IframeTest
● Method : iframeTest
●When a user goes to https://html.com/tags/iframe/
●Then click on the first video play to play the video
● Then wait for a 5 second (hard wait)
● Then stop the play
●
●Note:
●The page is too slow. Do some manual testing and understand the behavior
 */

public class Homework3 extends TestBase {
    @Test
    public void iFrame(){
        driver.get("https://html.com/tags/iframe/");
       // int iFrameCounter=driver.findElements(By.tagName("iframe")).size();
        //System.out.println(iFrameCounter);
        //driver.switchTo().frame(0);
        WebElement iFrame= driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("//button[@aria-label='Play']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();
        driver.switchTo().defaultContent();


    }

}
