package Practice;

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
import java.util.List;

/*
    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
Verify the Addresses and Sign Out texts are displayed
Find the number of total link on the page
Sign out from the page
     */
public class LocatorsNew01 {

    public WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.quit();

    }

    @Test
    public void login(){

            driver.get("http://a.testaddressbook.com/sign_in");
            driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
            driver.findElement(By.id("session_password")).sendKeys("Test1234!");
            driver.findElement(By.name("commit")).click();//signIn


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //driver.quit();
            String expectedId = "testtechproed@gmail.com";
            //String actualId=driver.findElement(By.className("navbar-text")).getText();
            String actualId = driver.findElement(By.xpath("//span[@class='navbar-text']")).getText();
            Assert.assertEquals(expectedId, actualId);


            WebElement adresLink=driver.findElement(By.linkText("Addresses"));
            WebElement adresLink2=driver.findElement(By.xpath("//a[@href='/addresses']"));
            Assert.assertTrue(adresLink.isDisplayed());
            Assert.assertTrue(adresLink2.isDisplayed());


            WebElement signout =driver.findElement(By.xpath("//a[@data-test='sign-out']"));
            Assert.assertTrue(signout.isDisplayed());

List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        for(WebElement w:link){
            System.out.println(w);
            System.out.println(w.getText());

        }

          //  signout.click();
          // String actualUrl= driver.getCurrentUrl();
           //String expectedUrl="http://a.testaddressbook.com/sign_in";
          // Assert.assertEquals(actualUrl,expectedUrl);
           // Assert.assertTrue(actualUrl.equals(expectedUrl));

       // WebElement signout2 =driver.findElement(By.xpath("//a[@data-test='sign-out']"));
        //signout2.click();
        //Assert.assertFalse(driver.findElement(By.xpath("//a[@data-test='sign-out']")).isDisplayed());

        //WebElement signin2=driver.findElement(By.tagName("h2"));
       // Assert.assertTrue(signin2.isDisplayed());



        }
    }
