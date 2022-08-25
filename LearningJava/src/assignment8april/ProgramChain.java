package assignment8april;

public class ProgramChain 
{
	ProgramChain()
	{
		System.out.println("First constructor");
	}
	ProgramChain(int a)
	{
		this();
		System.out.println(a);
		
	}
	ProgramChain(int a, int b)
	{
		this(a);
		
		System.out.println(a+b);
	}
   public static void main(String[] args)
   {
	   ProgramChain c1= new ProgramChain(3,4);
   }
}
