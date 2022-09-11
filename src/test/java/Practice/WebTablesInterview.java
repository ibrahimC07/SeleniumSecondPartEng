package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class WebTablesInterview extends TestBase {
@Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement>allTable=driver.findElements(By.xpath("//table[@id='table1']"));
        //How do you get the element in the all column?
        List<WebElement>allColumns=driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
        //How do you get the element in the all rows?
        List<WebElement>allRows=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        //How do you get the last row table data?
       int allRowsSize= allRows.size();
        System.out.println("lastRow: "+allRows.get(allRowsSize-1).getText());
        //How do you get the element in the last column?
          int columnSize=allColumns.size();
    System.out.println( "last column:"+allColumns.get(columnSize-1).getText());
        //How do you get the last table data?
    WebElement LastCell=driver.findElement(By.xpath("//table[@id='table1']//tr["+(allRowsSize-1)+"]//td["+(columnSize)+"]"));
    System.out.println("LastCell:"+LastCell.getText());

    //How to get row and column values from WebTable


       }




    }

