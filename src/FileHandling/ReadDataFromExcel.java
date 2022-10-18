package FileHandling;

import org.apache.poi.xssf.usermodel.*; //to import all '*' is used

//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

//DDT BBD - Behaviour Driven Development(Cucumber Plugin)
public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Sneha\\IdeaProjects\\Training\\Resources\\Test.xlsx");
        //we hv to use file input stream to read excel files
        //xls and xlsx are 2 forms of excel files
        //excel is called workbook

        XSSFWorkbook workbook = new XSSFWorkbook(file); //workbook loaded

        //to read sheet
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getLastRowNum(); //to get row number
        int colCount = sheet.getRow(0).getLastCellNum(); //to get col number

        //to read data
        for (int i =1; i <= rowCount; i++) { //starting from row 1 ---> skipping the heading
            //create obj of row to get data of each row
            XSSFRow currentRow = sheet.getRow(i); //inside each row

            for (int j =0; j < colCount; j++) {
                //convert all type of data to string as sheet may contain any type of data such as char, int etc
                String cellValue = currentRow.getCell(j).toString();
                System.out.println("\t\t" + cellValue);
            }
        }
        workbook.close(); //why u close workbook. excel sheet may have sensitive data, it may lead to corruption hence always close a opened resource
    }
}
