package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
/*
https://username:password@url/
 username : admin
   password : admin
   url   : the-internet.herokuapp.com/basic_auth
 */
public class authenticationNew extends TestBase {
    @Test
    public void test(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assert.assertTrue(driver.findElement(By.xpath("//p")).isDisplayed());
    }
}
