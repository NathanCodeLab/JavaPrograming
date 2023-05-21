package com.TestNGAttributes;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLDataProvider {

	String[][] data = null;

	@DataProvider(name = "excelData")
	private String[][] dataProvider() throws BiffException, IOException {
		data = getData();
		return data;
	}

	public String[][] getData() throws IOException, BiffException {

		FileInputStream excel = new FileInputStream(
				"/Users/sabarinathan/Documents/Eclipse Project/TestNGFramwork/DataTable/DataTable.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();

		String[][] testdata = new String[rows - 1][columns];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				testdata[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}

	@Test(dataProvider = "excelData")
	public void loginData(String uName, String pWord) {
		System.out.println(uName);
		System.out.println(pWord);

	}

}
