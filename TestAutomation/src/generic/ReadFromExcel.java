package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadFromExcel 
{
	public static String readData (String path, String sheetname, int row, int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String value = "";
		FileInputStream fis = new FileInputStream (path);
		Workbook wb = WorkbookFactory.create(fis);
		value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		
		return value;
		
	}

}
