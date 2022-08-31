package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
/*
Create a class: Actions2
Create test method : hoverOver() and test the following scenario:
Given user is on the https://www.amazon.com/
When use click on “Account” link
Then verify the page title contains “Your Account”
 */
public class ActionNew02 extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.amazon.com/");
       WebElement accountList= driver.findElement(By.cssSelector("#nav-link-accountList"));
       Actions actions=new Actions(driver);
       actions.moveToElement(accountList).perform();
       driver.findElement(By.linkText("Account")).click();
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}
