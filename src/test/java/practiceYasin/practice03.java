package practiceYasin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice03 {
    /*
    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button
techlistic.comtechlistic.com
Demo Sign-Up Selenium Automation Practice Form
This is a demo selenium webpage to practice web form actions. It contains all basic form components on which selenium beginners can practice selenium commands.
     */

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
        firstname.sendKeys("John");
        firstname.click();

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
        lastName.sendKeys("Doe");
        lastName.click();

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"sex-0\"]"));
        gender.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement experience = driver.findElement(By.xpath("//*[@id=\"exp-6\"]"));
        experience.click();

        WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        date.sendKeys("10-05-2022");
        date.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement profession = driver.findElement(By.xpath("//*[@id=\"profession-1\"]"));
        profession.click();

        WebElement automation = driver.findElement(By.xpath("//*[@id=\"tool-2\"]"));
        automation.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement continents = driver.findElement(By.xpath("//*[@id=\"continents\"]"));
        continents.click();
        continents.findElement(By.xpath("//*[@id=\"continents\"]/option[7]")).click();


        WebElement commands = driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]"));
        commands.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }

    }








