package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
		@DataProvider(name="LoginData")
		public String [][] getData() throws IOException
		{
			String path = "/Users/kabwetshibambe/eclipse-workspace/OpencartV121/testData/Opencart_LoginData.xlsx"; // Taking XL file from testData

		    // Check if file exists
		    File file = new File(path);
		    if (!file.exists()) {
		        throw new FileNotFoundException("Excel file not found: " + path);
		    }			
			
			
			
			ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
			
			int totalrows=xlutil.getRowCount("Sheet1");	
			int totalcols=xlutil.getCellCount("Sheet1",1);
			if (totalrows <= 0 || totalcols <= 0) {
			    throw new IllegalArgumentException("Invalid data in Excel file. Rows: " + totalrows + ", Columns: " + totalcols);
			}

					
			String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
			
			for (int i = 1; i <= totalrows; i++) {
			    for (int j = 0; j < totalcols; j++) {
			        String cellData = xlutil.getCellData("Sheet1", i, j);
			        if (cellData == null) {
			            throw new IllegalArgumentException("Null data found at row " + i + ", col " + j);
			        }
			        logindata[i - 1][j] = cellData;
			    }
			
	
	
	
			}
			return logindata;}
	
	
	
}
