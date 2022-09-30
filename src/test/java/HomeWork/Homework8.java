package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
go https://jqueryui.com/datepicker/
select the next date of the current date
Exp if today is August 30,2022, select August 31,2022
 */

public class Homework8 extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.xpath("//input[@id='datepicker']"));
        SimpleDateFormat datefull = new SimpleDateFormat("MM/dd/yyyy");
        String currentDate = datefull.format(new Date());

        input.sendKeys(currentDate);
        Thread.sleep(5000);

           int day = Integer.parseInt(currentDate.substring(3, 5));


            List<WebElement> calendarDays = driver.findElements(By.xpath("//td[@data-event='click']"));
           // for (int i = day; i <= calendarDays.size(); i++) {
                if (day<calendarDays.size()) {
                    String xpath = "(//a[@href='#'])" + "[" + (day + 1) + "]";
                    driver.findElement(By.xpath(xpath)).click();

                }else{
                    driver.findElement(By.xpath("   //a[@data-handler='next']")).click();
                    driver.findElement(By.xpath("//a[@data-date='1']")).click();
                }

            }
        }





