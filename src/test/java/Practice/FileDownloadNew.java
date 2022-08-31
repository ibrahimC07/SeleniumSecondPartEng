package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
/*
Create a class:FileDownloadTest
downloadTest()
In the downloadTest() method, do the following test:
Go to https://the-internet.herokuapp.com/download
Download flower.png file
Then verify if the file downloaded successfully
 */

public class FileDownloadNew extends TestBase {
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("nature.jpg")).click();
        String homeDirectory=System.getProperty("user.home");
        String path=homeDirectory+"\\Downloads\\nature.jpg";
        boolean isDownloaded= Files.exists(Paths.get(path));
        Assert.assertTrue(isDownloaded);

    }
}
