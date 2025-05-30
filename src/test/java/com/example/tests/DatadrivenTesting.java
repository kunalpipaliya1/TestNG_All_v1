package com.example.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class DatadrivenTesting {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook ExcelWBook = null;
        XSSFSheet ExcelWSheet;

        // 1. Load the Excel file from disk
        File excelfile = new File("C:\\Users\\Nmsworks\\Downloads\\Book1.xlsx");
        FileInputStream inputstream = new FileInputStream(excelfile);

        // 2. Create workbook instance from the file input stream
        ExcelWBook = new XSSFWorkbook(inputstream);

        // 3. Get the first sheet from the workbook (index 0)
        ExcelWSheet = ExcelWBook.getSheetAt(0);

        // 4. Get the number of rows with data
        // getLastRowNum() returns zero-based index of the last row, so add 1 for count
        int TotalRow = ExcelWSheet.getLastRowNum() + 1;
        System.out.println("Total Rows: " + TotalRow);

        // 5. To get total cells (columns), get the first non-null row and check its cell count
        // This assumes the first row is non-empty and has all columns
        XSSFRow firstRow = ExcelWSheet.getRow(0);
        int TotalCell = 0;
        if (firstRow != null) {
            TotalCell = firstRow.getLastCellNum();  // getLastCellNum() returns number of cells in row
        }
        System.out.println("Total Cells (columns): " + TotalCell);

        // 6. Loop through each row and each cell inside the row
        for (int currentrow = 0; currentrow < TotalRow; currentrow++) {

            // Get the current row object
            XSSFRow row = ExcelWSheet.getRow(currentrow);

            // Check if the row is not null to avoid NullPointerException
            if (row != null) {

                for (int currentcell = 0; currentcell < TotalCell; currentcell++) {

                    // Get the cell from the current row
                    XSSFCell cell = row.getCell(currentcell);

                    // Check if the cell is null (empty) before printing
                    if (cell != null) {
                        System.out.print(cell.toString());
                    } else {
                        System.out.print("NULL");  // or print empty string "" if you prefer
                    }

                    System.out.print("\t");  // Tab space between cells
                }

                System.out.println();  // New line after each row
            }
        }

        // 7. Close workbook and input stream to release resources
        ExcelWBook.close();
        inputstream.close();
    }
}
