import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class Practice04 extends TestBase {
    /*
Go to "http://automationpractice.com/"
Verify that the cart is initially empty.
Add first product to the cart
Verify that the product added.
Verify the color, size, quantity, price, shipping, Total Price
Click on Proceed to checkout
Verify that user is on the summary stage
Then verify the product is in stock
Then verify the Unit price matches the price that is on the Add To Card page
Click on + (plus) sign and verify the TOTAL price is 2*price+shipping => 2 * 16.51 + 2.00 = 35.02
Add one more product to the cart and delete second product
Verify that second product is deleted.

 */
@Test
    public void test(){
        driver.get("https://www.automationexercise.com/");
        driver.findElement(By.xpath("//a[@href='/view_cart']//i")).click();
        String emptyActual=driver.findElement(By.xpath("//b")).getText();
        Assert.assertEquals("Cart is empty!",emptyActual);
        driver.navigate().back();
        WebElement image=driver.findElement(By.xpath("//div[@class='productinfo text-center']//img"));
        WebElement addButton=driver.findElement(By.xpath("//a[@data-product-id='1']"));
        scrollIntoView(image);
        Actions actions=new Actions(driver);
        actions.moveToElement(image).perform();
        actions.click(addButton).perform();
       //String addedText=driver.findElement(By.xpath("(//h4)[4]")).getText();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    String addedText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4)[4]"))).getText();
        Assert.assertEquals("Added!",addedText);
        driver.findElement(By.xpath("//p[@class='text-center']//a")).click();
        String color=driver.findElement(By.xpath("//h4//a")).getText();
        Assert.assertEquals("Blue Top",color);
        String price=driver.findElement(By.xpath("(//td//p)[2]")).getText();
        Assert.assertEquals("Rs. 500",price);
        String quantity=driver.findElement(By.xpath("//td//button")).getText();
        Assert.assertEquals("1",quantity);
        String totalPrice=driver.findElement(By.xpath("//td[@class='cart_total']//p")).getText();
        Assert.assertEquals("Rs. 500",totalPrice);
        driver.findElement(By.xpath("//div[@class='col-sm-6']//a")).click();




    }
}
