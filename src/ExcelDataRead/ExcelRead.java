package ExcelDataRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String args[]) throws IOException{
		FileInputStream fis=new FileInputStream("TestData\\Testworkbook.xlsx");
		XSSFWorkbook wbookobj=new XSSFWorkbook(fis);
		XSSFSheet wsheet=wbookobj.getSheet("data");
		XSSFRow wrow=wsheet.getRow(2);
		XSSFCell Wcell=wrow.getCell(1);
		String dataobj=Wcell.getStringCellValue();
		System.out.println(dataobj);
		
		}
		

}
