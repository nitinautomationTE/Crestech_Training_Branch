package OnlyCreating;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fs=new FileInputStream("D:\\eclipse-workspace\\ApachePoiPractice\\src\\bo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sh=wb.getSheetAt(0);
		
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(1).getLastCellNum();
		
		for(int r=0;r<)
		
	}
}