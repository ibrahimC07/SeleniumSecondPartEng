package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
/*
https://username:password@url/
 username : admin
   password : admin
   url   : the-internet.herokuapp.com/basic_auth
 */

public class Day07_BasicAuthentication extends TestBase {
    @Test
    public  void basicAuth(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String expectedText="Congratulations! You must have the proper credentials.";
        String actualText=driver.findElement(By.xpath("//p")).getText();
        Assert.assertTrue(actualText.contains(expectedText));

    }
}
