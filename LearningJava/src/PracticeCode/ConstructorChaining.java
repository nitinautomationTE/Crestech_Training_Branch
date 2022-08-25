package PracticeCode;

public class ConstructorChaining 
{
	String name;
	int price;
	int ram;
	
	public ConstructorChaining()
	{
		
	}
	ConstructorChaining(String name)
	{
	   this.name=name;
    }
	ConstructorChaining(String name,int price)
	{
		this(name);
		this.price=price;
	}
	ConstructorChaining(String name,int price, int ram)
	{
		this(name,price);
		this.ram=ram;
	}
	void display()
	{
		System.out.println(name+" "+price+" "+ram);
	}

}
