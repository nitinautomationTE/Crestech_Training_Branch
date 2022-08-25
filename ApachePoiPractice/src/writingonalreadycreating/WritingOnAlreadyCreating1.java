package writingonalreadycreating;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingOnAlreadyCreating1
{
	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("sheet1");
			
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
		FileOutputStream f1=new FileOutputStream("D:\\eclipse-workspace\\ApachePoiPractice\\src\\TestErManuallyCreated.xlsx");
		wb.write(f1);
		System.out.println("File writing successfully.....");
		//Note: It is not possible by File f1=new File(path); only or by FileInputStream class
	}

}
