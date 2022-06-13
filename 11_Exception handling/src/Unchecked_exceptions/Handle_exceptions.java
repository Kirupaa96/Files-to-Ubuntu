package Unchecked_exceptions;

public class Handle_exceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		int a=20;
		
		try
		{
		System.out.println(a/0);  //Arithmetic exception
		}
		
		catch (ArithmeticException o)
		{
			System.out.println(o.getMessage());
		}
		
		System.out.println("Program is in progress");
		System.out.println("Program is done");
	    System.out.println();
		
		String s = null;
		
		try
		{
		System.out.println(s.length()); // Null pointer exception
		}
		
		catch (NullPointerException o1)
		{
			System.out.println(o1.getMessage());
		}
		
		System.out.println("Program is done");
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
