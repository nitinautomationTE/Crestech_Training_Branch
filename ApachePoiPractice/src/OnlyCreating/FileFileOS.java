package OnlyCreating;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileFileOS 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File f1=new File("D:\\eclipse-workspace\\ApachePoiPractice\\src\\nitinfos.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f1);
	}
}
