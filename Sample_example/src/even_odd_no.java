import java.util.Scanner;

public class even_odd_no {
	
	
	public static void main(String[] args) {
	
    System.out.println("Enter any no");
    Scanner no= new Scanner(System.in);
    String input= no.nextLine();
    int a= Integer.parseInt(input);
    
    if (a%2==0)
	{
	System.out.println("The number is even");
	}
	else 
	{
		System.out.println("The number is odd");	
	}
}
}