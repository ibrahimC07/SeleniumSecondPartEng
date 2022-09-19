package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_RadioButtom {
    /*
    TEST CASE:
Click on Create new account
Enter first name
Enter last name
Enter mobile number or email
Enter new password
Enter birthday(LATER)
Enter gender
Click Sign Up
2:22
Create a class : RadioButton
Complete the following task.
Go to https://www.facebook.com/
Click on Create an Account button
Locate the elements of radio buttons
Then click on the radio buttons for your gender if they are not selected
     */
    Faker faker=new Faker();
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void test01(){
        //go to facebook.com
        driver.get("https://facebook.com");
        //Click on Create new account
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //Enter first name
        driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys(faker.name().firstName());
        //Enter last name
        driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys(faker.name().lastName());
        //Enter mobile number or email
        driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys(faker.phoneNumber().cellPhone());
        //Enter new password
        driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys(faker.number().digits(5));
        //Enter birthday(LATER)
        WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
        Select select = new Select(day);
        select.selectByValue("2");
        WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
        month.sendKeys("Eki");
        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
        year.sendKeys("1994");
        //Enter gender
        driver.findElement(By.xpath("(//*[@class='_58mt'])[2]")).click();
        //Click Sign Up
        driver.findElement(By.xpath("(//*[text()='Kaydol'])[3]")).click();
    }

}

