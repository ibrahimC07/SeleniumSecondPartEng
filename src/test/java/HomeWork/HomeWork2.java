package HomeWork;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class HomeWork2 extends TestBase {
    Faker faker=new Faker();
    String fakerEmail=faker.internet().emailAddress();
    String fakerPassword=faker.internet().password();
    @Test
    public void signIn(){

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class='login']")).click();

        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(fakerEmail);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        //5.Verify the Text : CREATE AN ACCOUNT
        //String ActualCreateAccount=driver.findElement(By.xpath("//*[text()='Create an account']")).getText();
       // String expectedCreateAccount="CREATE AN ACCOUNT";
        //Assert.assertEquals(ActualCreateAccount,expectedCreateAccount);
        String expectedUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
       String actualUrl= driver.getCurrentUrl();
       Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println(actualUrl);
        System.out.println(expectedUrl);
        //6. Verify the Text : YOUR PERSONAL INFORMATION
        String actualPersonalInfo=driver.findElement(By.xpath("//*[text()='Your personal information']")).getText();
        String expectedPersonalInfo="YOUR PERSONAL INFORMATION";
        Assert.assertEquals(expectedPersonalInfo,actualPersonalInfo);
       // 7. Verify the Text : Title
        String actualTitle=driver.findElement(By.xpath("//label[.='Title']")).getText();
        String expectedTitle="Title";
        Assert.assertEquals(expectedTitle,actualTitle);
       // 8. Select your title
        driver.findElement(By.cssSelector("#id_gender2")).click();
        //9. Enter your first name
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(faker.name().firstName());
        //10. Enter your last name
        driver.findElement(By.cssSelector("input[name='customer_lastname']")).sendKeys(faker.name().lastName());
        //11. Enter your email
        driver.findElement(By.cssSelector("#email")).click();
        //12. Enter your password
        driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys(fakerPassword);
        //13. ENTER DATE OF BIRTH
        WebElement day=driver.findElement(By.cssSelector("#days"));
        Select selectDay=new Select(day);
        selectDay.selectByValue("10");
        WebElement month=driver.findElement(By.cssSelector("#months"));
        Select selectMonth=new Select(month);
        //selectMonth.selectByValue("1");
        selectMonth.selectByVisibleText("January ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement years=driver.findElement(By.cssSelector("select[name='years']"));
        Select selectYears=new Select(years);
        selectYears.selectByValue("1994");
       //14. Click on Sign up for our newsletter!
        driver.findElement(By.cssSelector(".checker")).click();
        //15. Enter your first name
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(faker.name().firstName());
        //16. Enter your last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
        //17. Enter your company
        driver.findElement(By.cssSelector("#company")).sendKeys(faker.company().name());
        //18. Enter your Address
        driver.findElement(By.cssSelector("#address1")).sendKeys(faker.address().streetAddress(),",",faker.address().zipCode(),",",faker.company().name());
        driver.findElement(By.cssSelector("#address2")).sendKeys("Building number: ",faker.address().buildingNumber());
        //19. Enter your City
        driver.findElement(By.cssSelector("#city")).sendKeys(faker.address().city());
        //20. SELECT STATE
        WebElement state=driver.findElement(By.xpath("//select[@name='id_state']"));
        Select selectState=new Select(state);
        selectState.selectByVisibleText("California");
        //21. Enter Postal Code
        driver.findElement(By.cssSelector("#postcode")).sendKeys(faker.address().zipCode().substring(0,5));
        //22.SELECT COUNTRY
        WebElement country=driver.findElement(By.cssSelector("select[name='id_country']"));
        Select selectCountry=new Select(country);
        selectCountry.selectByVisibleText("United States");
        //23. Enter additional information
        driver.findElement(By.cssSelector("#other")).sendKeys("Additional");
        //24. Enter home phone
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(faker.phoneNumber().cellPhone());
        //25. Enter mobile phone
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys(faker.phoneNumber().cellPhone());
        //26. Enter reference name
        driver.findElement(By.cssSelector("#alias")).sendKeys("This is my adress");
        //27. Click Register
        driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
        //28. Then verify MY ACCOUNT is displayed on the home page-SEE BELOW IMAGE
       WebElement expVerify= driver.findElement(By.xpath("//h1[text()='My account']"));
       Assert.assertTrue(expVerify.isDisplayed());




    }
}
