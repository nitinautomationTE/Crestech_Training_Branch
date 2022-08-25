package assignment8april;

public class Student 
{
	String name; 
	int rollno;
	int cls;
	void setInfo(String n,int r,int c)
	{
		name=n;
		rollno=r;
		cls=c;
	}
	void displayStudent()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(cls);
	}
	
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		s1.setInfo("Nitin", 4,10 );
		s2.setInfo("Akash", 5,11 );
		s3.setInfo("Mritunjay", 8,5 );
		s4.setInfo("Ram", 9,112 );
		s5.setInfo("Presenjit", 5,9 );
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		s4.displayStudent();
		s5.displayStudent();
		
	}

}
