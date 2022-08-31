package HomeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.*;

public class Homework4 extends TestBase {
    @Test
    public void amazon(){
        driver.get("https:www.amazon.ca");
        WebElement all =driver.findElement(By.cssSelector("#searchDropdownBox"));
        all.click();
        Select select=new Select(all);
        String actualText=select.getFirstSelectedOption().getText();
        Assert.assertEquals("All Departments",actualText);
        select.selectByIndex(2);
        Assert.assertEquals("Amazon Devices",select.getFirstSelectedOption().getText());
        List<WebElement> allOptions=select.getOptions();
        System.out.println(allOptions);
        int totalNumber=allOptions.size();
        boolean flag=false;
        for(WebElement w:allOptions){
            System.out.println(w.getText());
            if(w.getText().equals("Appliances")){
                flag=true;

            }
        }
        Assert.assertTrue(flag);
        System.out.println(flag);

     
List<String>actualList=new ArrayList<>();
for (WebElement w:select.getOptions()){
    actualList.add(w.getText());
}

List<String>tempList=actualList;
Collections.sort(tempList);
//tempList.sort(Comparator.naturalOrder());
Assert.assertEquals(tempList,actualList);


    }
}
