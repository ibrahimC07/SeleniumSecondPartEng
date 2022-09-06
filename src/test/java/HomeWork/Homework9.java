package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Homework9 extends TestBase {
    @Test
    public void testq10() {
//2.Way for homework 8
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
       driver.findElement(By.id("datepicker")).click();

        String strToday = driver.findElement(By.xpath("//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).getText();
        int today = Integer.valueOf(strToday);
        List<WebElement> numberofDays = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));

        if (today < numberofDays.size()) {
            driver.findElement(By.xpath("//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//following-sibling::td")).click();
        } else {
            driver.findElement(By.className("ui-datepicker-next ui-corner-all")).click();
            driver.findElement(By.xpath("//*[@data-date='1']")).click();
        }
    }
}
