package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
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
    WebDriver driver;
    Faker faker=new Faker();
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void accountSignUp(){

        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
driver.findElement(By.name("reg_email__")).sendKeys("atiyeozerbr@gmail.com");
driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("atiyeozerbr@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys(faker.internet().password());
WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select monthh=new Select(month);
        monthh.selectByVisibleText("Jan");

        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select dayy=new Select(day);
        dayy.selectByVisibleText("10");

        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select years=new Select(year);
        years.selectByVisibleText("2000");

        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();

    }
}
