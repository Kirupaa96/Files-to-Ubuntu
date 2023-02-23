import java.util.Scanner;

public class string_rev {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = ""; 
		
		for(int i=input.length()-1; i>=0; i--)
		{
			char ch= input.charAt(i);
			output = output+ ch;
			
		}
		
		System.out.println(output);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
