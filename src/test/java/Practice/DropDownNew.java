package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

/*
//Go to https://the-internet.herokuapp.com/dropdown
//1.Create method selectByIndexTest and Select Option 1 using index
//2.Create method selectByValueTest Select Option 2 by value
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
//4.Create method printAllTest Print all dropdown value
//5. Verify the dropdown has Option 2 text
//6.Create method printFirstSelectedOptionTest Print first selected option
//7.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
    */
public class DropDownNew extends TestBase {
    @Test
    public void selectByIndex() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement index = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select selectByIndex = new Select(index);
        selectByIndex.selectByIndex(1);
        Assert.assertTrue(selectByIndex.getOptions().get(1).isSelected());

    }

    @Test
    public void selectByValue() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement value = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select selectByValue = new Select(value);
        selectByValue.selectByValue("2");

    }


    @Test
    public void selectByVisible() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement visible = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select selectByVisible = new Select(visible);
        selectByVisible.selectByVisibleText("Option 1");
    }

    @Test
    public void printAllTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select selectall = new Select(dropdown);
        List<WebElement> allOptions = selectall.getOptions();
        System.out.println(allOptions);

        for (WebElement w : allOptions) {
            String eachText = w.getText();
            System.out.println(eachText);
        }

        boolean flag = false;
        for (WebElement w : allOptions) {
            if (w.getText().contains("Option 2")) {
                      flag=true;
            }

        }
        Assert.assertTrue(flag);


    }
    @Test
    public  void  printFirstSelectedOption(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select selectall = new Select(dropdown);
        WebElement firstSelected=selectall.getFirstSelectedOption();
        System.out.println(firstSelected.getText());


        List<WebElement> allOptions = selectall.getOptions();
        int actual=allOptions.size();
        Assert.assertEquals("Expected Is Not Equal Actual",3,actual);
    }
}