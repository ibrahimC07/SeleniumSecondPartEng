package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class Day11_JSExecutor extends TestBase {
    @Test
    public void scrollIntoViewTest() throws InterruptedException {
        driver.get("https://techproeducation.com/");
       WebElement weOffer= driver.findElement(By.xpath("//*[.='WE OFFER']"));
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;//typeCasting
        js.executeScript("arguments[0].scrollIntoView(true);",weOffer);


            }
            @Test
    public void scrollRTest2() throws InterruptedException {
                driver.get("https://techproeducation.com/");
                Thread.sleep(4000);
                WebElement weOffer= driver.findElement(By.xpath("//*[.='WE OFFER']"));
                scrollIntoView(weOffer);//coming from testBase
            }
            @Test
    public void scrollAllTheWaytest() throws InterruptedException, IOException {
                driver.get("https://techproeducation.com/");
                Thread.sleep(4000);
                scrollAllDownByJS();
                takeScreenShot();
                Thread.sleep(4000);
                scrollAllUpByJS();
                takeScreenShot();
            }

            @Test
    public  void clickByJSTest() throws InterruptedException {
                driver.get("https://techproeducation.com/");
                Thread.sleep(4000);
                WebElement LmsLogin= driver.findElement(By.linkText("LMS Login"));
                clickByJS(LmsLogin);
            }

    @Test
    public void setValueByJSTest(){
        driver.get("https://techproeducation.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
        setValueByJS(searchBox,"QA");
    }
    @Test
    public void GetInputValue(){
        driver.get("https://www.carettahotel.com/");
        WebElement checkIn=driver.findElement(By.id("checkin_date"));
        System.out.println(checkIn.getText());//returns empty
        getValueByJS("checkin_date");//accept if ofthe element and returns value

    }

    @Test
    public void changeBackgroundColorByJSTest() throws InterruptedException, IOException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000L);
        WebElement checkAvailability = driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(3000L);
       changeBackgroundColorByJS(checkAvailability, "orange");
        Thread.sleep(3000L);
        takeScreenShot();
    }
    @Test
    public void addBorderWithJSTest() throws InterruptedException, IOException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000L);
        WebElement loginButton = driver.findElement(By.xpath("//a[.='Log in']"));
        Thread.sleep(3000L);
        addBorderWithJS(loginButton, "3px solid red");
        Thread.sleep(3000L);
        takeScreenShot();
    }

        }

