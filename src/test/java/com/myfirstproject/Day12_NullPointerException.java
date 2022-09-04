package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_NullPointerException {
    WebDriver driver;
    Faker faker;
    @Test
    public void nullPointerTest(){
       // driver=new ChromeDriver();
        driver.get("https:www.google.com");//NullPointerException. driver is declared but not initialized
      //  faker=new Faker();
        System.out.println(faker.name().fullName()); //NullPointerException. faker is declared but not initialized
    }
    }

