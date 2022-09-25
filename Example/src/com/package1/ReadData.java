package com.package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public void readExelData(String filePath, String fileName, String sheetName) throws Exception {
		Workbook excelFile = null;
		File file = new File(filePath + fileName);
		FileInputStream f = new FileInputStream(file);

		String fileExtensionName = filePath.substring(fileName.indexOf("."));
		excelFile = WorkbookFactory.create(file);
		if (fileExtensionName.equals(".xlsx")) {
			excelFile = new XSSFWorkbook(f);
		} else {
			excelFile = new HSSFWorkbook(f);
		}

		Sheet sheet = excelFile.getSheet(sheetName);
		Row row = sheet.getRow(0);
		Cell cell1 = row.getCell(1);
		System.out.println(cell1.getStringCellValue());
		f.close();
	}

	public static void main(String args[]) throws Exception {
		FileReader reader = new FileReader("config.properties");
		Properties prop = new Properties();
		prop.load(reader);
		String excelFileName = prop.getProperty("FileName");
		String excelFilePath = prop.getProperty("FilePath");

		ReadData r = new ReadData();
		r.readExelData(excelFilePath, excelFileName, "First");
	}
}

/*
 * public static void main(String args[]) { ReadData r = new ReadData();
 * r.readDataFromExcel(); }
 */
