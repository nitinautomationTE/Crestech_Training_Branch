package filecreationonly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByFile 
{
	public static void main(String[] args) throws IOException
	{
	File f1=new File("D:\\eclipse-workspace\\File Handling\\src\\ramsharan234.txt");
    Scanner sc=new Scanner(f1);
    while(sc.hasNextLine())
    	System.out.println(sc.nextLine());
   }
}
	
