package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;



public class CheckBoxNew {
    /*
    Create a class : CheckBox
Create test method and complete the following task.
Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes
Then click on checkbox1 if box is not selected
Then click on checkbox2 if box is not selected
Homework: Then verify that checkbox1 is checked.
     */
    public WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }


    @After
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void checkBoxTest(){

        driver.get("https://the-internet.herokuapp.com/checkboxes");

       /* WebElement checkBox1=driver.findElement(By.xpath("//input[@type='checkbox']"));

        WebElement checkBox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if(!checkBox1.isSelected() || !checkBox2.isSelected()){
         checkBox1.click();
         checkBox2.click();*/

        //Assert.assertTrue(checkBox1.isSelected());

        List<WebElement> list1 = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
       for(WebElement w:list1){
           System.out.println(w);
           if(!w.isSelected()){
               w.click();
           }

       }
    }
    }

