package Practice;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

/*
Method: handleCookies
-Go to amazon  and automate the tasks:
1. Find the total number of cookies
2. Print all the cookies
3. Get the cookies by their name
4. Add new cookie
5. Delete cookie by name
6. Delete all of the cookies
 */
public class CookiesNew extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.amazon.com/");
        Set<Cookie> cookie=driver.manage().getCookies();
        System.out.println(cookie);
        System.out.println(cookie.size());
       for(Cookie w:cookie){
           System.out.println(w.getName());
           if (w.getName().equals("ubid-main")){
               driver.manage().deleteCookieNamed(w.getName());
           }
       }
       Cookie obj=new Cookie("atiye","kar");
       driver.manage().addCookie(obj);
      Set<Cookie>add= driver.manage().getCookies();
        System.out.println(add.size());
       driver.manage().deleteCookieNamed("atiye");
       driver.manage().deleteAllCookies();

    }
}
