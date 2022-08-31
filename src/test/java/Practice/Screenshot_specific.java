package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Screenshot_specific  {
    WebDriver driver;
    @Test
    public void specific() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://translate.google.com/");
        WebElement translate=driver.findElement(By.xpath("//div[@class='ccvoYb EjH7wc']"));
        File shot=translate.getScreenshotAs(OutputType.FILE);
        SimpleDateFormat date=new SimpleDateFormat("yyyyMMddhhmmss");
        String currentTime=date.format(new Date());

        FileUtils.copyFile(shot,new File(System.getProperty("user.dir")+"/test-output/Screenshots2/"+currentTime+"specific.png"));

    }

}
