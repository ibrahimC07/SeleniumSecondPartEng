package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
// go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
// click on the "Animals and Nature" emoji
// click all the "Animals and Nature"  emoji elements
// fill the form
// press the apply button
 */
public class practiceYasin02_01 extends TestBase {
    @Test
    public void test() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();
        List<WebElement> allEmojiis = driver.findElements(By.xpath("//div[@id='nature']/div/img"));
        System.out.println(allEmojiis);
        for (WebElement w : allEmojiis) {
            w.click();
        }
        driver.switchTo().defaultContent();

       /* Actions actions = new Actions(driver);
        WebElement firstText = driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[1]"));
        actions.click(firstText).perform();
        actions.sendKeys("atiye").sendKeys(Keys.TAB).
                sendKeys("yigit").sendKeys(Keys.TAB).
                sendKeys("Clara").sendKeys(Keys.TAB).
                sendKeys("ziya").sendKeys(Keys.TAB).
                sendKeys("ayse").sendKeys(Keys.TAB).
                sendKeys("arslan").sendKeys(Keys.TAB).
                sendKeys("eliz").sendKeys(Keys.TAB).
                sendKeys("suluru").sendKeys(Keys.TAB).
                sendKeys("sunduz").sendKeys(Keys.TAB).
                sendKeys("eliz").sendKeys(Keys.TAB).
                sendKeys("akif").sendKeys(Keys.TAB).perform();*/

List<WebElement>text=driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));
        System.out.println("list  " +text);
        System.out.println(text.size());
List<String>list=new ArrayList<>(Arrays.asList("This","iframe","example","looks","very","funny","does","not","it","?","!"));
        System.out.println(list);
        for(int i=0;i< text.size();i++){
            text.get(i).sendKeys(list.get(i));
        }
        driver.findElement(By.xpath("//button[@id='send']")).click();


    }

}


