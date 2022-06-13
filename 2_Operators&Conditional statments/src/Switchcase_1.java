import java.util.Scanner;

public class Switchcase_1 {
	
	public static void main(String[] args) {
		
		System.out.println("Who is your crush ?");
		Scanner x = new Scanner(System.in);
	    String crush = x.nextLine();
	    
	    switch(crush)
	    {
	    case "Mia":
	    	System.out.println("She is the BEST");
	    	break;
	    case "Danny":
	    	System.out.println("She is GOOD");
	    	break;
	    case "Sunny":
	    	System.out.println("ALL TIME FAV");
	    	break;
	    default:
	    	System.out.println("Do u watch porn true/false ?");
	    	Scanner z = new Scanner(System.in);
	    	boolean answer = z.nextBoolean();
	    	
			
		if(answer ==true)
	    {
	    	System.out.println("Then who is your fav ?");
	    	Scanner a = new Scanner(System.in);
	    	 String b = a.nextLine();
		    System.out.println("Really !!! Your taste is bad ");
	    }
		else if(answer==false) 
		{
			System.out.println("FUCK OFF LIAR");
		}
	    	
 }
	    
	}
	
}
