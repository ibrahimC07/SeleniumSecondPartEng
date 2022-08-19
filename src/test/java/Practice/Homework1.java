package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
    Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title. 
    Verify if the page URL contains youtube if not, print the right url. 
    Then Navigate to https://www.ama zon.com/ 
    Navigate back to youtube 
    Refresh the page 
    Navigate forward to amazon 
    Maximize the window 
    Then verify if page title includes “Amazon”, If not, print the correct title. 
    Verify if the page URL is https://www.amazon.com/, if not print the correct url 
    Quit the browser

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.youtube.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("pass");
        }else{
            System.out.println("fail"+actualTitle);
        }

//driver.get("https:www.youtube.com");
String actualData=driver.getCurrentUrl();
      if( actualData.contains("youtube")){
          System.out.println("pass");
      }else{
          System.out.println("fail "+"  "+"Current Url: "+actualData);
      }
      driver.navigate().to(" https://www.amazon.com/");
      driver.navigate().back();
      driver.navigate().refresh();
      driver.navigate().forward();
      driver.manage().window().maximize();

      driver.get("https://www.amazon.com/");
      String actualTitle1=driver.getTitle();
      if (actualTitle1.contains("Amazon")){
          System.out.println("pass");
      }else{
          System.out.println("fail "+ actualTitle1);
      }
      String ExpectedurlAmazon="https://www.amazon.com/";
      //driver.get("https://www.amazon.com/");
      String actualUrlAmazon=driver.getCurrentUrl();
      if(actualUrlAmazon.equals(ExpectedurlAmazon)){
          System.out.println("pass");
      }else {
          System.out.println("fail"+ actualUrlAmazon);
      }
      driver.quit();

    }
}
