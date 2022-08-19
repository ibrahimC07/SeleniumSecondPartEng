package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day02_LocatorsIntro {
    /*
    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
Verify the Addresses and Sign Out texts are displayed
Find the number of total link on the page
Sign out from the page
     */
    @Test
    public void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        driver.findElement(By.name("commit")).click();

        String ActualId=driver.findElement(By.className("navbar-text")).getText();
        String expectedId="testtechproed@gmail.com";
        Assert.assertEquals(expectedId,ActualId);

        WebElement addressElement = driver.findElement(By.linkText("Addresses"));
        Assert.assertTrue(addressElement.isDisplayed());



        WebElement actualSignOutLink = driver.findElement(By.linkText("Sign out"));
        Assert.assertTrue(actualSignOutLink.isDisplayed());

       List<WebElement> actualTag= driver.findElements(By.tagName("a"));


        for(WebElement w:actualTag){
            System.out.println(w.getText());
driver.findElement(By.xpath("//a[@data-test='sign-out']")).click(); ;

           // Assert.assertEquals(driver.getCurrentUrl(),);
        }

    }
}
