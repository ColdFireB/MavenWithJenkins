package excelPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream(new File("test.xlsx"));

		// Properties s = new Properties();
		// s.load(fs);

		XSSFWorkbook s = new XSSFWorkbook(fs);

		XSSFSheet sheet = s.getSheet("Data");
		s.createSheet("test");

		XSSFRow row1 = sheet.getRow(1);
		sheet.createRow(3);

		XSSFCell cell = row1.getCell(1);

		sheet.getLastRowNum();

		XSSFCell cell2 = row1.createCell(1);

		cell2.setCellValue("test");

		FileOutputStream dr = new FileOutputStream(new File("test"));
		s.write(dr);
		dr.close();

	}
}
