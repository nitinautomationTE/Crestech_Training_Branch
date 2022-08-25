package assignment8april;


public class Result
{
     int sub1,sub2,sub3,marks;
     
     // initialization of marks through constructor.
     Result(int sub1,int sub2,int sub3)
     {
    	 this.sub1=sub1;
    	 this.sub2=sub2;
    	 this.sub3=sub3;
    	 
     }
     //Method to get marks.
     void getMarks()
     {
    	 System.out.println("Marks of three subjects:");
    	 System.out.print(sub1);
    	 System.out.print(" ");
    	 System.out.print(sub2);
    	 System.out.print(" ");
    	 System.out.println(sub3);
    	 
     }
     //Method to calculate total marks.
     void totalMarks()
     {
    	 marks=sub1+sub2+sub3;
    	 System.out.println("Total Marks:"+marks);
    	 
     }
     //Method to calculate percentage and final result.
     void result()
     {   
    	 float per;
    	 float total=300;
    	 per = (float)((marks/total)*100);
    	 System.out.println("Percentage:"+per);
    	 if(per>40)
    		 System.out.println("Pass or Fail:"+"Y");
    	 else
    	     System.out.println("Pass or Fail:"+"N");
     }
     
}
