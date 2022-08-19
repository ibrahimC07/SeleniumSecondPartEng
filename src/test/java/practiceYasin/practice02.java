package practiceYasin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice02 {
/*
// Create a new class under Q02
    // Set Path
    // Create chrome driver
    // Maximize the window
    // Open google home page https://www.google.com/.
    // Wait for 3 seconds
    // Go to the "https://www.amazon.com"
    // Get the title and URL of the page
    // Check if the title contains the word "Smile" print console "Title contains Smile" or "Title does not contain Smile"
    // Check if the URL contains the word "auto" print console "URL contains auto" or "URL does not contain auto"
    // Then go to "https://techproeducation.com/"
    // Get the title and check if it contains the word "site" and print "Title contains site" or "Title does not contain site"
    // Back to the previous webpage, https://www.amazon.com"
    // Refresh the page
    // Navigate to techproeducation.com
    // Wait for 3 seconds
    // Close the browser

 */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test(){
        driver.get("https://www.google.com/.");

driver.navigate().to("https://www.amazon.com");

        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        if(title.contains("Smile")){
            System.out.println("contains");
        }else{
            System.out.println("no contains");
        }
        if(url.contains("auto")){
            System.out.println("contains ");
        }else{
            System.out.println("no contains");
        }


        driver.navigate().to("https://techproeducation.com/");
        String title2=driver.getTitle();
        if(title2.contains("site")){
            System.out.println("contains");
        }else{
            System.out.println("no contains");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
