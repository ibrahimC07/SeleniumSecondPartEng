package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

/*
 Go to http://the-internet.herokuapp.com/add_remove_elements/
 click on the "Add Element" button 100 times
 write a function that takes a number, and clicks the "Delete" button
 given number of times, and then validates that given number of buttons were deleted
    */
public class Q01 extends TestBase {
    @Test
    public void test(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        addButton(driver,10);
        deleteButton(driver,6);
    }
    public void addButton(WebDriver driver,int number){

        WebElement add=driver.findElement(By.xpath("//*[text()='Add Element']"));
        int counter=0;
        for(int i=0;i<number;i++){
            add.click();
            counter++;
        }
        System.out.println(counter);
    }
    public void deleteButton(WebDriver driver,int deleteNumber){
List<WebElement>deleteList=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
int beforeSIZE=deleteList.size();
int counterDelete=0;
        for(int i=0;i<deleteNumber;i++){
            counterDelete++;

            deleteList.get(i).click();
        }
        System.out.println(counterDelete);



        List<WebElement>deleteListAfter=driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int afterSize=deleteListAfter.size();

        Assert.assertEquals(beforeSIZE-deleteNumber,afterSize);
    }
}
