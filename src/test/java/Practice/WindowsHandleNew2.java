package Practice;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class WindowsHandleNew2 extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.techproeducation.com");
        String tecHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https:www.amazon.com");
        String amazonHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https:www.google.com");
        String googleHandle=driver.getWindowHandle();

        driver.switchTo().window(tecHandle);
        driver.switchTo().window(amazonHandle);

    }
    @Test
    public void test2(){
        driver.get("https://www.techproeducation.com");
        String tecHandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https:www.amazon.com");
        String amazonHandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https:www.linkedin.com");
        String linkedinHandle=driver.getWindowHandle();

        driver.switchTo().window(amazonHandle);
    }

}
