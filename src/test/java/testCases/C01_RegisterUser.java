package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_RegisterUser {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
       // driver.close();
    }

    @Test
    public void test01(){
        //1-Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //2-Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        //3-Verify 'New User Signup!' is visible
        WebElement verifyNewUserSignup = driver.findElement(By.xpath("//*[@class='signup-form']"));
        Assert.assertTrue(verifyNewUserSignup.isDisplayed());
        //4- Enter name and email address
        WebElement name = driver.findElement(By.xpath("//*[@Name='name']"));
        name.sendKeys("name");
        WebElement email = driver.findElement(By.xpath("(//*[@name='email'])[2]"));
        email.sendKeys("dsfdsgfg@gmail.com");
        //5-Click 'Signup' button
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
        //6- Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement verifyEnterAccountInformation = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue("visible account information",verifyEnterAccountInformation.isDisplayed());
        //7-Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("(//*[@name='title'])[1]")).click();
        driver.findElement(By.xpath("//*[@id='name']")).sendKeys("ibo");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ibrahim56");
        driver.findElement(By.xpath("//*[@id='days']")).sendKeys("5");
        driver.findElement(By.xpath("//*[@id='months']")).sendKeys("October");
        driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1994");
        //8-Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//*[@id='newsletter']")).click();
        //9-Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//*[@id='optin']")).click();
        //10-Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("ibo");
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("ibo");
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys("ibo");
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("ibo,521,sdf");
        driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("ibo,55,lkk");
        driver.findElement(By.xpath("//*[@id='country']")).sendKeys("Can");
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("ibo");
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("ibo");
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("45656");
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("64646445546");
        //11-Click 'Create Account button'
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
        //12-Verify that 'ACCOUNT CREATED!' is visible
        WebElement visibleAccountCreated = driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(visibleAccountCreated.isDisplayed());
        //13- Click 'Continue' button
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        //14-Verify that 'Logged in as username' is visible
        WebElement visibleName = driver.findElement(By.xpath("//*[text()='nameibo']"));
        Assert.assertTrue(visibleName.isDisplayed());
        //15- Click 'Delete Account' button
        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();
        //16-Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button









    }
}
