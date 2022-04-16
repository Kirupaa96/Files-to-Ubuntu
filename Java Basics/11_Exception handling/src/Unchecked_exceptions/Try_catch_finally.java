package Unchecked_exceptions;

public class Try_catch_finally {
	
	public static void main(String[] args) {
		
	    int b[] =new int[5]; // Array index out of bound exception 
		
			
//First case		
		
	/*	try
		{
		b[10] =100; // Array index out of bound exception
		}
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
		 */

		
//second case 
		
		/* try
		{
		b[10] =100; // Array index out of bound exception
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally block");
		} */ 
		
// Third case 
		
		try
		{
			b[4] =100;
	    }		
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
