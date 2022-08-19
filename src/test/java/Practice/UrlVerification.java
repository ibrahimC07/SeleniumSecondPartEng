package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlVerification {
    public static void main(String[] args) {
         /*
    1.Create a new class: VerifyURLTest
   2.Navigate to TechProEducation homepage
   3.Verify if google homepage url is "https://techproeducation.com/"
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String expectedUrl="https://techproeducation.com/";
        driver.get("https://techproeducation.com/");
       String actualUrl=driver.getCurrentUrl();

       if(expectedUrl.equals(actualUrl)){
           System.out.println("pass");
       }else{
           System.out.println("fail");
       }
    }
}
