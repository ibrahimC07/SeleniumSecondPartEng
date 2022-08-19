package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceNew {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.amazon.com");
        String pageSource1=driver.getPageSource();
        //System.out.println(pageSource1);
        if(pageSource1.contains("registry")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
