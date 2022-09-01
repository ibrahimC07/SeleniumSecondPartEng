package Practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class Q01 extends TestBase {
    @Test
    public void test(){
driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

WebElement iframe=driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);

WebElement secondEmoji=driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
secondEmoji.click();
List<WebElement> allEmojis=driver.findElements(By.xpath("//div[@id='nature']//div//img"));
for(WebElement w:allEmojis){
    w.click();
}
        driver.switchTo().defaultContent();
List<WebElement>textBoxes=driver.findElements(By.cssSelector(".mdl-textfield__input"));

List<String>words=new ArrayList<>(Arrays.asList("This","iframe","example","looks","very","funny","does","not","it","?","!"));
for(int i=0;i<textBoxes.size()-1;i++){
    textBoxes.get(i).sendKeys(words.get(i));

    driver.findElement(By.xpath("//button[@id='send']")).click();

}

    }
}
