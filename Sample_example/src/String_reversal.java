import java.util.Scanner;

public class String_reversal {

  public static void main(String[] args) {
	
	System.out.println("Enter any name:");  
	  
	Scanner name =new Scanner(System.in);
	String input =name.nextLine();
	String output ="";
	int l=input.length();
	System.out.println("The length of the string is:"+l);
	
	  for(int i=input.length()-1;i>=0;i--)
	  {
	    char ch=input.charAt(i);
		//System.out.println("The charachter at "+i+ " is "+ch);
		output =output+ch;
	  }
	  
	 // System.out.println("The original string is:"+input);
	  System.out.println("The reversed string is:"+output);
	   
	  
       	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
	
	
	
	
	
	
	
	
	
	
	
	
}
