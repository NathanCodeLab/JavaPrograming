package businessComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DemoAtt {

	String[][] data = null;

	@DataProvider(name = "datatable")
	public String[][] dataProvider() throws BiffException, IOException {
		
		return data = getDatatable();
		
		
	}

	public String[][] getDatatable() throws BiffException, IOException {
		FileInputStream file = new FileInputStream(
				"/Users/sabarinathan/Documents/Eclipse Project/Framwork/DataTable/DataTable.xls");

		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);

		int rows = sheet.getRows();
		int columns = sheet.getColumns();

		String[][] testData = new String[rows-1][columns];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				testData[i-1][j] = sheet.getCell(j, i).getContents();

			}
		}
			return testData;
	}
	
	@Test(priority = -1,dataProvider = "datatable")
	public void exceldata(String rowValue,String colValue) {
		System.out.println(rowValue);
		System.out.println(colValue);

	}
	

	@Test(priority = 0, enabled = true, description = "10th std", groups = "Arts")
	public void std() {
		System.out.println("Completed 10th class Student ");
	}

	@Test(priority = 1, enabled = true, description = "12th std", groups = "Arts", dependsOnMethods = "std")
	public void hrSec() {
		System.out.println("Completed 12th class");
	}

	@Test(priority = 2, enabled = true, description = "UG Degree", groups = "Arts", dependsOnMethods = "hrSec")
	public void ug() {
		System.out.println("Completed UG Degree");
	}

	@Test(priority = 3, enabled = true, description = "PG Degree", groups = "Arts", dependsOnMethods = "ug")
	public void pg() {
		System.out.println("Completed PG Degree");
	}

	@Test(priority = 4, enabled = true, description = "MD Degree", groups = "MD", dependsOnMethods = "pg")
	public void pHD() {
		System.out.println("Completed PHD Degree");
	}

	@Test(priority = 5, enabled = true, description = "Dr.", groups = "DR", dependsOnMethods = "pHD")
	public void dr() {
		System.out.println("Completed Dr.");
	}

}
