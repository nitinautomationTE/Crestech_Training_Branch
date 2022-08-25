package OnlyCreating;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RightWayOfCreating 
{
	public static void main(String[] args) throws IOException
	{
		//preparing skeleton/prototype
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("sheet1");
		
		//creating .xlsx file according to this skeleton
		File f1=new File("D:\\eclipse-workspace\\ApachePoiPractice\\src\\filef1.xlsx");
		FileOutputStream outstr=new FileOutputStream(f1);
		
		//feed our skeleton in this file so that we will not get error
		wb.write(outstr);
		if(f1.exists())
		System.out.println("File is created successfully");
		else
			System.out.println("File isn't created successfully");
		
		
		
	}

}
