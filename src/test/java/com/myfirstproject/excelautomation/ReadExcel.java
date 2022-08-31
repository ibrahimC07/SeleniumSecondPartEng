package com.myfirstproject.excelautomation;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
Import the apache poi dependency in your pom file
Create resources directory under java folder(right click on java and create the folder)
Add the excel file on the resources folder
Create a new package: excelautomation
Create a new class : ReadExcel
Create a new test method : readExcel()
Store the path of the  file in a string
Open the file
Open the workbook using fileinputstream
Open the first worksheet
Go to first row
Go to first cell on that first row and print
Go to second cell on that first row and print
Go to 2nd row first cell  and assert if the data equal to USA
Go to 3rd row 2nd cell-chain the row and cell
Find the number of row
Find the number of used row
Print country, capitol key value pairs as map object
 */
public class ReadExcel {
    @Test

    public void ReadExcel() throws IOException {
        String path = ".\\src\\test\\java\\resources\\capitals.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1=workbook.getSheetAt(0);
        Row row1= sheet1.getRow(0);
        Cell cell1=row1.getCell(0);
        System.out.println(cell1);
        Cell cell2= row1.getCell(1);
        System.out.println(cell2);
        Row row2= sheet1.getRow(1);
        Cell cell1Row2= row2.getCell(0);
        System.out.println(cell1Row2);
      int numberOfRow=sheet1.getLastRowNum()+1;//index starts at 0/burda bosluklarda sayiliyo
        System.out.println(numberOfRow);
        int numOfUsedRows=sheet1.getPhysicalNumberOfRows();//index start at 1/yazdigim celler sayiliyo
        System.out.println(numOfUsedRows);


        Map<String,String > countryCapitals=new HashMap<>();
        for(int rowNum=1;rowNum<numberOfRow;rowNum++){
            String countries=sheet1.getRow(rowNum).getCell(0).toString();
           String capitals= sheet1.getRow(rowNum).getCell(1).toString().toString();
           countryCapitals.put(countries,capitals);

        }
        System.out.println(countryCapitals);
    }
}
