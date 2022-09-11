package practice05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

//Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
//Click on "click me" button
//Verify that "Event Triggered"
public class Q01 extends TestBase {
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
      WebElement click= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='growbutton']")));
     // click.click();
       Actions actions=new Actions(driver);
      actions.moveToElement(click).click().perform();

    }
}
