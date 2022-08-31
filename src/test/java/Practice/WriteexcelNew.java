package Practice;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Create a new class: WriteExcel
Create a new method: writeExcel()
Store the path of the file as string and open the file
Open the workbook
Open the first worksheet
Go to the first row
Create a cell on the 3rd column (2nd index) on the first row
Write “POPULATION” on that cell
Create a cell on the 2nd row 3rd cell(index2), and write 150000
Create a cell on the 3rd row 3rd cell(index2), and write 250000
Create a cell on the 4th row 3rd cell(index2), and write 54000
Write and save the workbook
Close the file
Close the workbook
 */

public class WriteexcelNew  {
    @Test
    public void test() throws IOException {

String path="C:\\Users\\toron\\IdeaProjects\\myseleniumproject\\src\\test\\java\\resources\\Foods.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet1= workbook.getSheetAt(0);
        sheet1.getRow(0).createCell(2).setCellValue("CALORIE");
        sheet1.getRow(1).createCell(2).setCellValue(150);
        sheet1.getRow(2).createCell(2).setCellValue(250);
        sheet1.getRow(3).createCell(2).setCellValue(54);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();
    }
}
