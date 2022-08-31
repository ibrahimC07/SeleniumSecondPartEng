package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.Cookie;
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

public class Day07_Cookies extends TestBase {
    @Test
    public void cookie(){
driver.get("https:www.amazon.com");
Set<Cookie> cookies=driver.manage().getCookies();
int cookiesCounter=cookies.size();
        System.out.println(cookiesCounter);
        for(Cookie eachCookie:cookies){
            System.out.println("eashCookie   "+eachCookie);
            System.out.println("name    "+eachCookie.getName());
            System.out.println("value  "+eachCookie.getValue());

        }
        System.out.println(driver.manage().getCookieNamed("ubid-main"));

        Cookie cookie=new Cookie("My-Fav-Cookie","White-Chocolate");
        driver.manage().addCookie(cookie);
       Set<Cookie>cookieCounter=driver.manage().getCookies();
        System.out.println(cookieCounter.size());

        driver.manage().deleteCookieNamed("session-id");
        driver.manage().deleteAllCookies();
    }
}
