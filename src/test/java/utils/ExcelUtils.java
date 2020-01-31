package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {
    //static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {

        //projectPath = System.getProperty("user.dir");
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);
        //ExcelUtils excel = new ExcelUtils(projectPath + "/excel/data.xlsx", "Sheet1");


    }

    public static void main(String[] args) throws IOException {
        //getRowCount();
        //getCellDataString(0,0);
        //getCellDataNumber(1,1);
    }

    public static int getRowCount() {
        int rowCount;
              rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows: " + rowCount);
        return rowCount;
    }


    public static int getColumnCount() {
        int colCount;
        colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of columns: " + colCount);
        return colCount;
    }

    public static String getCellDataString(int rowNum, int colNum) {
            String cellData;
            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
            return cellData;
    }

    public static void getCellDataNumber(int rowNum, int colNum) {
            double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);
    }
}
