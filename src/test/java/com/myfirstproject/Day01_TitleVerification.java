package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_TitleVerification {
    /*

    Verify if google title is "Techpro Education | Online It Courses &amp; Bootcamps"
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com/");

        //  get title
        String actualTitle = driver.getTitle();
        //  "Techpro Education | Online It Courses &amp; Bootcamps"
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";

        // verify if actual title equals expected titile

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL : "+actualTitle);
            System.out.println("EXPECTED : "+ expectedTitle);
        }


            /*
            driver.getTitle(); ==> returns the page title as string
             */




    }

}