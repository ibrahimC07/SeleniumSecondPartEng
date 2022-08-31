package PracticeYasin02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
//Signup For Facebook by using Actions class
//Go to Facebook
//Click on Create New Account
//fill all the boxes by using keyboard actions
public class Q05 extends TestBase {
    @Test
    public void test(){
        driver.get("https:www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        //WebElement firstName =driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions=new Actions(driver);
        actions.click().sendKeys("Ali").
                sendKeys(Keys.TAB).
                sendKeys("Can").sendKeys(Keys.TAB).
                sendKeys("atiyeozerbr@gmail.com").sendKeys(Keys.TAB).
                sendKeys("atiyeozerbr@gmail.com").sendKeys(Keys.TAB).
                sendKeys("19985@wer").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("11").
                sendKeys(Keys.TAB).sendKeys("Feb").
                sendKeys(Keys.TAB).sendKeys("2005").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();



    }
}
