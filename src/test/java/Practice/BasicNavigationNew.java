package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigationNew {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\toron\\IdeaProjects\\myseleniumproject\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com");

        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }

        driver.navigate().to("https:www.amazon.com");
      driver.close();
      driver.quit();

    }

}
