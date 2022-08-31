package PracticeYasin02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
/*

 */
public class Q04 extends TestBase {
    @Test
    public void test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement Oslo=driver.findElement(By.cssSelector("#box1"));
        WebElement stockholm=driver.findElement(By.cssSelector("#box2"));
        WebElement washington=driver.findElement(By.cssSelector("#box3"));
        WebElement copenhagen=driver.findElement(By.cssSelector("#box4"));
        WebElement seoul=driver.findElement(By.cssSelector("#box5"));
        WebElement rome=driver.findElement(By.cssSelector("#box6"));
        WebElement madrid=driver.findElement(By.cssSelector("#box7"));


        WebElement Norway=driver.findElement(By.cssSelector("#box101"));
        WebElement sweeden=driver.findElement(By.cssSelector("#box102"));
        WebElement usa=driver.findElement(By.cssSelector("#box103"));
        WebElement denmark=driver.findElement(By.cssSelector("#box104"));
        WebElement southKorea=driver.findElement(By.cssSelector("#box105"));
        WebElement Italy=driver.findElement(By.cssSelector("#box106"));
        WebElement spain=driver.findElement(By.cssSelector("#box107"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(Oslo,Norway).
                dragAndDrop(stockholm,sweeden).
                dragAndDrop(washington,usa).
                dragAndDrop(copenhagen,denmark).
                dragAndDrop(seoul,southKorea).
                dragAndDrop(rome,Italy).
                dragAndDrop(madrid,spain).perform();

    }
}
