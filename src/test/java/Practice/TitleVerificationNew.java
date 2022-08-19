package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationNew {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String expectedTitle="Amazon.com. Spend less. Smile more.";
        driver.get("https:www.amazon.com");
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        if(expectedTitle.equals(actualTitle)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
     driver.quit();
    }
}
