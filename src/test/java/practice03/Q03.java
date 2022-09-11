package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
     * Navigate to  https://www.saucedemo.com/
     * Enter the username  as "standard_user"
     * Enter the password as   "secret_sauce"
     * Click on login button
     * Order products by "Price (low to high)"
     * Verify that last product costs $49.99, first product costs $7.99.
     */




public class Q03 extends TestBase {
@Test
    public void test(){
driver.get("https://www.saucedemo.com/");
driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
driver.findElement(By.cssSelector("#login-button")).click();
        WebElement dropdown= driver.findElement(By.cssSelector(".product_sort_container"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Price (low to high)");
     List< WebElement> allItems=driver.findElements(By.cssSelector(".inventory_item_price"));
    System.out.println(allItems.get(0).getText());
    Assert.assertEquals("$7.99",allItems.get(0).getText());
    Assert.assertEquals("$49.99",allItems.get(allItems.size()-1).getText());
    List<Double> newList = new ArrayList<>();

    for(WebElement w : allItems){

        newList.add(Double.valueOf(w.getText().replace("$","")));
        newList.sort(Comparator.naturalOrder());
    }



    System.out.println(newList);
    }
}
