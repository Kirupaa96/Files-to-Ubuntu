package Unchecked_exceptions;

public class throw_throws {

	  
	public static int divide(int a, int b) throws ArithmeticException {
	    if(b == 0) 
	    {
	        throw new ArithmeticException("Cannot divide by zero.");
	    }
	    return a/b;
	}

	  
	public static void main(String[] args) 
	  {
		divide(10,0);
	  }
	  



	
	
	  
	
	
	
	
	
}
