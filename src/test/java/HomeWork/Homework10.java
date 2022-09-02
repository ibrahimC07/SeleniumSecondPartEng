package HomeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Homework10 extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/toggle/");
        driver.switchTo().frame(0);
        String text=driver.findElement(By.xpath("//div[@id='effect']//p")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("//button[@id='button']")).click();


       String textRun= driver.findElement(By.xpath("//div//div[@style='display: none;']")).getText();
        System.out.println("TextRun:"+textRun);
        Assert.assertTrue(textRun.isEmpty());
        driver.findElement(By.xpath("//button[@id='button']")).click();
        String textLast=driver.findElement(By.xpath("//div[@id='effect']//p")).getText();
        System.out.println(textLast);


    }
}
