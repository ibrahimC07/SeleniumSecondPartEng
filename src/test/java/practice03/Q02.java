package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

//Go to https://testpages.herokuapp.com/styled/drag-drop-javascript.html
//Drag yellow elements on the red elements below them
//Then verify they are dropped.
public class Q02 extends TestBase {
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");
        WebElement source1=driver.findElement(By.cssSelector("#draggable1"));
        WebElement source2=driver.findElement(By.cssSelector("#draggable2"));

        WebElement target1=driver.findElement(By.cssSelector("#droppable1"));
        WebElement target2=driver.findElement(By.cssSelector("#droppable2"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source1,target1).dragAndDrop(source2,target2).perform();
        Assert.assertEquals("Dropped!",target1.getText());
        Assert.assertEquals("Dropped!",target2.getText());
    }
}
