package assignment8april;

public class ResultDriver 
{
	public static void main(String[] args)
	{
		// Creating object of result class and Passing date by constructor.
		Result r=new Result(45,52,61);
		r.getMarks();                       //  calling getMarks(). 
		r.totalMarks();                     // calling totalMarks() to get total marks.
		r.result();                         // calling result method to get final result.
		
	}

}
