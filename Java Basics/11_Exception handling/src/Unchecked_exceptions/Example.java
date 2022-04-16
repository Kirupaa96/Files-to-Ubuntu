package Unchecked_exceptions;

public class Example {
	
	public static void main(String[] args) {
		System.out.println("started");
		
		/* Thread.sleep(4000); */  //syntax,logically correct still  throws interrupted exception 

		int a=10;
		System.out.println(a/0);
		
		System.out.println("stopped");
		
		
		
		
	}

}
