package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

/*
/ Go to http://the-internet.herokuapp.com/add_remove_elements/
// Click on the "Add Element" button 100 times
// Write a function that takes a number, and clicks the "Delete" button given number of times
// Then validates that given number of buttons were deleted
 */
public class Homework5  {
    protected static WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    @Test

    public void test(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        addButton(driver,10);
        deleteButton(driver,7);
    }
    public void addButton(WebDriver driver, int addNumber) {
        int counterAdd = 0;
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i < addNumber; i++) {
            addButton.click();
            counterAdd++;
        }
        System.out.println("first   " + counterAdd);
    }
        public void deleteButton(WebDriver driver,int numOfDelete){

            List<WebElement> beforeDelete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
            System.out.println(beforeDelete);
            int beforeDeleteSize=beforeDelete.size();
            System.out.println(beforeDeleteSize);
            int counterDelete=0;

                for (WebElement w : beforeDelete) {
                    counterDelete++;
                    if (counterDelete <= numOfDelete) {
                        w.click();
                    } else {
                        break;
                    }
                }
List<WebElement>afterDelete=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
int afterDeleteSize=afterDelete.size();
            System.out.println(afterDeleteSize);
Assert.assertEquals(beforeDeleteSize-numOfDelete,afterDeleteSize);
        }
    }


