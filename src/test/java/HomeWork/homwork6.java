package HomeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class homwork6 extends TestBase {

        @Test
        public void test() {
            driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
            int counter = 0;
            WebElement add = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
            for (int i = 0; i < 5; i++) {

                add.click();
                counter++;

            }
            System.out.println("first   " + counter);

            int counterdel=0;
            for (int j = 0; j < counter; j++) {
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
                counterdel++;
                List<WebElement>  delete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
            delete.remove(j);
            }
            }
           // Assert.assertEquals(counter,counterdel);
        }

