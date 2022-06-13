package Exceptions; //exceptions are errors occur during run time

public class first {

	public static void main(String[] args) {
		
		try
		{
		System.out.println("Line before exception");
		int a=10/0; //Arithematic exception 
		}
		
		catch (Exception e)
		{
		System.out.println(e.getMessage());	 // prints the reason for exception 
		e.printStackTrace();
		System.out.println("Line after exception");
		}
		
		
	}
}
