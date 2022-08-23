package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Day04_DropDown {

    /*
//Go to https://the-internet.herokuapp.com/dropdown
//1.Create method selectByIndexTest and Select Option 1 using index
//2.Create method selectByValueTest Select Option 2 by value
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
//4.Create method printAllTest Print all dropdown value
//5. Verify the dropdown has Option 2 text
//6.Create method printFirstSelectedOptionTest Print first selected option
//7.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
     */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    public void testByIndex(){
     WebElement dropDown =driver.findElement(By.id("dropdown"));
        Select select=new Select(dropDown);
        select.selectByIndex(2);

    }
    public  void selectByValueTest(){
        WebElement dropdown=driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdown);
        select.selectByValue("2");
    }
    public  void selectByVisibleTextTest(){
        WebElement dropdownlast=driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdownlast);
        select.selectByVisibleText("Option 1");

    }
    public void printAllTest(){
WebElement dropDownPrint=driver.findElement(By.id("dropdown"));
Select select=new Select(dropDownPrint);
List<WebElement> allOption=select.getOptions();
for(WebElement w:allOption){
    System.out.println(w.getText());

}

boolean flag=false;
        for(WebElement w:allOption) {
            if(w.getText().equals("Option 2")){

               flag=true;
        }
        }
        Assert.assertTrue(flag);

    }
    @Test
    public void printFirstSelectedOptionTest() {

        WebElement dropdown=driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdown);
        WebElement firstSelected=select.getFirstSelectedOption();
        System.out.println(firstSelected.getText()+"  default");


        List<WebElement>allSelectedOption=select.getAllSelectedOptions();
int size=allSelectedOption.size();
Assert.assertEquals(3,size);
    }
    }


