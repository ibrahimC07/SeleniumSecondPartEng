package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_CheckBox {
    @Test
    public void login() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
      WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
      WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
      if(!checkbox1.isSelected()){
          checkbox1.click();
      }
    }
}
