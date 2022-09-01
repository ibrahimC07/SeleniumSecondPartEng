package Practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
/*
// go to amazon homepage
    // hover mouse over the hello,signIn element at the top right
    // Click on the Create list link in the menu that opens
    // and verify that title is equal to "Your List"
 */
public class Q3 extends TestBase {
    @Test
    public void test(){
        driver.get("https:www.amazon.com");
        WebElement account =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(account).perform();
        WebElement list=driver.findElement(By.linkText("Create a List"));
        list.click();
        Assert.assertEquals("Your List",driver.getTitle());

    }
}
