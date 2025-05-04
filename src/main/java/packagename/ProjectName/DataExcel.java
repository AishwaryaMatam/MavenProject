package packagename.ProjectName;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataExcel {
	
	@DataProvider(name = "validdata")
	public Object[][] validdata() throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\aishw\\eclipse-workspace\\ProjectName\\ExcelSheet\\DataSheet.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String username = w.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String password = w.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		Object data[][] = new Object[1][2];
		data[0][0] = username;
		data[0][1] = password;
		//return new Object[][] {
		//{username, password}};
		return data;
	}
	@DataProvider(name="Invaliddata")
	public Object[][] invalidData() throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\aishw\\eclipse-workspace\\ProjectName\\ExcelSheet\\DataSheet.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String validUsername1 = w.getSheet("invalid").getRow(0).getCell(0).getStringCellValue();
		String Invalidpassword1 = w.getSheet("invalid").getRow(0).getCell(1).getStringCellValue();
		//String validUsername2 = w.getSheet("invalid").getRow(1).getCell(0).getStringCellValue();
		//double Invalidpassword2 = w.getSheet("invalid").getRow(1).getCell(1).getNumericCellValue();
		Object data[][] = new Object[2][2];
		data[0][0]= validUsername1;
		data[0][1]= Invalidpassword1;
	//	data[1][0]= validUsername2;
		//data[1][1]= Invalidpassword2;
		
		return data;
		
		//return new Object[][] {
		//{validUsername,Invalidpassword}};
	}
}
