package Checked_exceptions;

public class Handlechecked_exceptions {
public static void main(String[] args) {
	
	
	System.out.println("program is started");
	System.out.println("program is in progress");
	
	try
	{
	Thread.sleep(10000);  //checked exception 
	}
	
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
	
	
	
	
	
	System.out.println("program is completed");
	System.out.println("program is done");
	
	
	
	
	
}
}
