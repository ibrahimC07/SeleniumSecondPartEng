package Practice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;

public class extentReportsNew {
      WebDriver driver;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentReports extentReports;
    protected  ExtentTest extentTest;
@Test
    public  void setUp(){
        extentHtmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/reports/"+"extent.html");
        extentReports=new ExtentReports();
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("Atiyyee");
        extentReports.setSystemInfo("yigit","clara");
        extentTest=extentReports.createTest("google","validate doohle search functinality");


        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentTest.log(Status.INFO,"Starting Test Case");
        driver.get("https:www.google.com");
        WebElement google=driver.findElement(By.name("q"));
        extentTest.pass("Search Button");
    Assert.assertTrue(google.getText().contains("q"));
        Actions actions=new Actions(driver);
        actions.sendKeys("Atiye").sendKeys(Keys.ENTER).perform();
        extentTest.pass("Pressed Enter");

        driver.close();
        extentTest.pass("driver closed");
        extentTest.info("finish");

        extentReports.flush();



    }
}
