package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_cssSelector {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("http://a.testaddressbook.com/sign_in");
    }

    @Test
    public void test(){
driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testtechproed@gmail.com");
driver.findElement(By.cssSelector("input[id='session_password']")).sendKeys("Test1234!");
driver.findElement(By.cssSelector("input[name='commit']")).click();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
