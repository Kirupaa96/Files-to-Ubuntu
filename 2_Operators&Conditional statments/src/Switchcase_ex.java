


import java.util.Scanner;

public class Switchcase_ex {

	public static void main(String[] args) {
		
		System.out.println("Which coffee do u prefer?");
		Scanner inp =new Scanner(System.in); // to read data from the console 
		String coffeeType = inp.nextLine();
		switch(coffeeType) 
		{
		case "Espresso":
			 System.out.println("Price is 1$");
			 break;
		case "Latte":
			System.out.println("Price is 2$");
			break;
		case "Cappacino":
			System.out.println("Price is 3$");
			break;
		case "Mocha":
			System.out.println("Price is 5$");
			break;
		case "Irish":
			System.out.println("Price is 10$");
			break;
		case "Turkish":
			System.out.println("Price is 15$");
			break;
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
