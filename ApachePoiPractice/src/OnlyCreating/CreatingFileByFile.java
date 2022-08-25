package OnlyCreating;

import java.io.File;
import java.io.IOException;

public class CreatingFileByFile 
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("D:\\eclipse-workspace\\ApachePoiPractice\\src\\nitinFile.xlsx");
		f1.createNewFile();
	}

}
