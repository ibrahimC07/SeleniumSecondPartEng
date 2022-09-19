package practiseIDid01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
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
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.get("https://amazon.com");
        String Title =driver.getTitle();
        System.out.println("Title = " + Title);
        driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        String expectedResult= "Smile";
        if (actualTitle.contains(expectedResult)){
            System.out.println("Title contains Smile");
        }else System.out.println("Title does not contain Smile");
        String actualUrl = driver.getCurrentUrl();
        String expectedResult02= "auto";
        if (actualUrl.contains(expectedResult02)){
            System.out.println("Title contains site");
        }else System.out.println("Title does not contain site");
        driver.get("https://techproeducation.com");
        driver.getTitle();
        String actualTitle01 = driver.getTitle();
        String expectedTitle02 = "site";
        if (actualTitle.contains(expectedTitle02)){
            System.out.println("Title contains site");
        }else System.out.println("Title does not contain site");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.navigate().forward();
        Thread.sleep(3000);

    }

}
