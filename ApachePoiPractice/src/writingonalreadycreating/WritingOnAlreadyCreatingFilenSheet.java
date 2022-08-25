package writingonalreadycreating;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingOnAlreadyCreatingFilenSheet 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\ApachePoiPractice\\src\\TestErManuallyCreated.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("NitinSheet");
			
		Object empdata[][]= {{"EmpId","Name","Job"},{101,"Nitin","Test.er"},{"102","Sanchi","Manager"}};
		
		int row_No=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(row_No);
		System.out.println(cols);
		
		for(int r=0;r<row_No;r++)
		{
			XSSFRow row=sh.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				
				Object value=empdata[r][c];
				
				if(value instanceof String)
				      cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
			}
		}
		FileOutputStream fos=new FileOutputStream("D:\\eclipse-workspace\\ApachePoiPractice\\src\\TestErManuallyCreated.xlsx");
	    wb.write(fos);
	    System.out.println("File written successfully....");
	
	}
	

}
