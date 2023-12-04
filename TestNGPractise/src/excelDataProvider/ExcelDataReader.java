package excelDataProvider;

import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class ExcelDataReader {

	@DataProvider(name = "credentials")
	public Object[][] dataCollect() throws Exception
	{
		String xlPath = "C:\\Users\\Deepti's laptop\\Desktop\\Selenium docs\\Excel files\\Credentials.xlsx";
		Object[][] d= readExcel(xlPath,"Sheet1");
		return d;
	}

	public Object[][] readExcel(String excelPath, String sheetName) throws Exception {
		
		String cellValue = null;
		
		
		XSSFWorkbook book = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = book.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//		System.out.println(rowCount);
//		System.out.println(colCount);
		
//		cellValue = sheet.getRow(rowCount).getCell(colCount).getStringCellValue();
//		System.out.println(cellValue);
		
		Object[][]	data = new Object[rowCount-1][2];
//		data[rowCount-1][colCount] = cellValue;
		
		for(int i = 1; i< rowCount ; i++)
		{
			for(int j = 0; j< colCount ; j++)
			{
				
//				System.out.print(cellValue);
//				System.out.print(" | ");
				
				if(j == 0)
				{
					cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j] = cellValue;
				}
				else if(j == 2)
				{
					cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j-1] = cellValue;
				}
			}
			//System.out.println();
		}
	
		System.out.println(Arrays.deepToString(data));
		return data;
	}
	
}
