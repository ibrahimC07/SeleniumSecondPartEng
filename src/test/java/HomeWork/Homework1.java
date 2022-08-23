package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Homework1 extends TestBase {
    @Test
    public void search() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("porcelain teapot" + Keys.ENTER);
        WebElement data = driver.findElement(By.id("result-stats"));
        //System.out.println( data.getText());
          if(data.isDisplayed()){
        System.out.println( data.getText());
}

            }


//Select select=new Select(size);

        }

