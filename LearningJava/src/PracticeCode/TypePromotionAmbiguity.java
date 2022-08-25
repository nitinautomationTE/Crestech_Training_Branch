package PracticeCode;

public class TypePromotionAmbiguity 
{ 
	void sum(int a,long b)
	{
		System.out.println("a method is invoked");
	}
	void sum(long a,int b)
	{
		System.out.println("b method is invoked");
	}
	public static void main(String[] args)
	{
		TypePromotionAmbiguity t1=new TypePromotionAmbiguity();
		t1.sum(20, 20);
	}

}
