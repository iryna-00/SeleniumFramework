package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {
    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {

        projectPath = System.getProperty("user.dir");
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);

    }

    public static void main(String[] args) throws IOException {
        //getRowCount();
        getCellDataString(0,0);
        getCellDataNumber(1,1);
    }

    public static void getRowCount() {
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows: " + rowCount);
    }

    public static void getCellDataString(int rowNum, int colNum) {
            String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
    }

    public static void getCellDataNumber(int rowNum, int colNum) {
            double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);
    }
}
