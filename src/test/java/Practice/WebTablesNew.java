package Practice;

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
public class WebTablesNew extends TestBase {
    @Test
    public void test(){

        driver.get("https://the-internet.herokuapp.com/tables");
       String allTable= driver.findElement(By.id("table1")).getText();
        System.out.println(allTable);
        List<WebElement>allRows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        for(WebElement w:allRows) {
            System.out.println(w.getText());

        }
            //Print Last row data only
            List<WebElement>allBodyRow=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));

                allBodyRow.get(allBodyRow.size()-1).
                        getText();

            //Print column 5 data in the table body
        List<WebElement>Column5=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[5]"));
        for (WebElement w:Column5){
            //System.out.println(w.getText());
        }

        }
        @Test
        public void testNew(){
        driver.get("https://the-internet.herokuapp.com/tables");
        test2(2,3);
        }
        public void test2(int row,int column){
        //Write a method that accepts 2 parameters
            driver.get("https://the-internet.herokuapp.com/tables");
            String path="//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";
            WebElement cell=driver.findElement(By.xpath(path));
            System.out.println(cell.getText());
        }

    }

