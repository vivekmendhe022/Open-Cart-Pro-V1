package com.generic.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String readDataFromExcelSheet(String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(IConstantUtility.EXCELFILEPATH);
		Workbook book = WorkbookFactory.create(file);
		return book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}

	public Object[][] readMultipleDataFromExcelFile(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(IConstantUtility.EXCELFILEPATH);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(sheetname);
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[row][cell];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}

}
