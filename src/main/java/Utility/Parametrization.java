package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData(int row ,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Microsoft\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\Book1.xlsx");

		String value = WorkbookFactory.create(file).getSheet("Credentails").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
