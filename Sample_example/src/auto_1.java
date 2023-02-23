import java.util.Scanner;

public class auto_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter any no:");
		Scanner no =new Scanner(System.in);
		String input = no.nextLine();
		int x= Integer.parseInt(input); // convert string into int 
		
		if(x*x ==4)
		{
			return;
		}
		else if(x*x ==9)
		{
			return;
		}
		else 
		{
			int ans =(x*x)+10;
			System.out.println(ans);
		}
	}
	
}
