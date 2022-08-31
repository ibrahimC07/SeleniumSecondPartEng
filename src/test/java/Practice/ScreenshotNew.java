package Practice;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotNew extends TestBase {
    @Test
    public void screenShot() throws IOException {
        File img=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // String time=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        //SimpleDateFormat atiye=new SimpleDateFormat("yyyyMMddHHmmss");
        //atiye.format(new Date());//new date methodu currentTime a gidiyor
        Date currentDate=new Date();
       //long a= currentDate.getTime();

        String screenTime=currentDate.toString().replace(" ","-").replace(":","-");
        String path =System.getProperty("user.dir")+"/test-output/Screenshots2/"+screenTime+"atiye.png";
        FileUtils.copyFile(img,new File(path));



    }
@Test
    public void screenshottest() throws IOException {
        driver.get("https:www.amazon.com");
        screenShot();
    }

    @Test
    public  void test() throws IOException {
        driver.get("https:www.google.com");
        test2();
    }
    public  void test2() throws IOException {

       File shot1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       SimpleDateFormat date=new SimpleDateFormat("yyyyMM-dd-hh-mmss");
       String current=date.format(new Date());
       FileUtils.copyFile(shot1,new File(System.getProperty("user.dir")+"/test-output/Screenshots2/"+current+"google.png"));
    }

}
