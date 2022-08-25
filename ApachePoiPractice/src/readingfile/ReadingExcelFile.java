package readingfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\ApachePoiPractice\\src\\TestEr.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("sheet1");
		
		//reading by using for loop
		int lrn=sh.getLastRowNum();
		int cno=sh.getRow(0).getLastCellNum();
		
		for(int r=0;r<lrn;r++)
		{
			XSSFRow row =sh.getRow(r);
			for(int c=0;c<cno;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
				{
								
				}
			}
		}
		
		
	}

}
