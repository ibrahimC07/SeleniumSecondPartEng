package com.myfirstproject;

import org.junit.*;

public class Day02_JUnitAnnotations {
@BeforeClass
public static void setUpClass() {
    System.out.println("Before class");

}
@AfterClass
    public static void tearDownClass(){
        System.out.println("After Class");
    }
    @Before
    public void setUpMethod(){

        System.out.println("Before Method");
    }
    @After
    public void tearDownMethod(){
        System.out.println("After Method");
    }

    @Test @Ignore
    public void test1(){
        System.out.println("test 1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }

    @Test
    public void test3(){
        System.out.println("test 3");
    }

    @Test
    public void test4(){
        System.out.println("test 4");
    }
}
