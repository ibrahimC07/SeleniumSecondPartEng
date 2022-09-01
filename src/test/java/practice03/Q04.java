package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04 extends TestBase {
    //Go to http://webdriveruniversity.com/To-Do-List/index.html
    //Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
    //Strikethrough all todos.
    //Delete all todos.
    //Verify that all todos deleted.
    @Test
    public  void test() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        WebElement plus=driver.findElement(By.cssSelector("#plus-icon"));
       // plus.click();
        Actions actions=new Actions(driver);

        List<String> all=new ArrayList<>(Arrays.asList("Prepare breakfast","Wash the dishes","Take care of baby","Help your kid's homework","Study Selenium","Sleep"));
       for(String w:all){
           actions.click(plus).sendKeys(Keys.TAB).
           sendKeys(w).sendKeys(Keys.ENTER).perform();

       }
        Thread.sleep(5000);
      List<WebElement> strike= driver.findElements(By.xpath("//li"));
for (WebElement w:strike){
    w.click();

}
        Thread.sleep(5000);
List<WebElement>delete=driver.findElements(By.xpath("//i[@class='fa fa-trash']"));
for(WebElement w:delete){
    w.click();


}

        List<WebElement> strikeDelete= driver.findElements(By.xpath("//li"));
        Thread.sleep(10000);
        Assert.assertEquals(0,strikeDelete.size());
    }
}
