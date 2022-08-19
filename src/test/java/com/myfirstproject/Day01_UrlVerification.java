package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_UrlVerification {
    /*
    1.Create a new class: VerifyURLTest
   2.Navigate to TechProEducation homepage
   3.Verify if google homepage url is "https://techproeducation.com/"
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com/");

        String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "https://techproeducation.com/";

        if(actualUrl.equals(expectedUrl)){

            System.out.println("PASS");
        }else {

            System.out.println("FAIL");
            System.out.println("ACTUAL URL "+actualUrl);
            System.out.println("EXPECTED URL "+expectedUrl);
        }

        driver.quit();
    }
}
