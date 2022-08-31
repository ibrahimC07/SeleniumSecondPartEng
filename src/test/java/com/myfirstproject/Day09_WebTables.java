package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

/*
https://the-internet.herokuapp.com/tables
Create a class: Day10_WebTables
Task 1 : Print the entire table
Task 2 : Print All Rows
Task 3 : Print Last row data only
Task 4 : Print column 5 data in the table body
Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
 */
public class Day09_WebTables extends TestBase {
    @Test
    public void printTable() {
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 1 : Print the entire table
        WebElement table = driver.findElement(By.xpath("//table[@id=\"table1\"]"));
        System.out.println("allPrint1  " + table.getText());

        List<WebElement> allTable = driver.findElements(By.xpath("//table[@id=\"table1\"]//td"));
        for (WebElement w : allTable) {
            System.out.println("allPrint2  " + w.getText());
        }
        allTable.get(10).getText();


    }

    @Test
    public void printRow() {
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 2 : Print All Rows
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
        for (WebElement w : allRows) {
            System.out.println(w.getText());
        }

    }

    @Test
    public void getLastRow() {
        //Task 3 : Print Last row data only
        driver.get("https://the-internet.herokuapp.com/tables");

    }

    @Test
    public void getColumn5() {
        //Task 4 : Print column 5 data in the table body
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("***Print Column 5***");
        List<WebElement> column5Data = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));
        for (WebElement w : column5Data) {
            System.out.println(w.getText());
        }
    }
        @Test
        public void printDataTest(){
/*
Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
 */

            printData(2,3);
        }
        public void printData(int row,int column){
            driver.get("https://the-internet.herokuapp.com/tables");
            String xpath="//table[@id='table1']//tbody//tr[\"+row+\"]//td[\"+column+\"]";
            WebElement cell= driver.findElement(By.xpath(xpath));
            System.out.println(cell.getText());
        }
    }


