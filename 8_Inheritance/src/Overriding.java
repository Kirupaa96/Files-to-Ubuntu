 
class bank              //parent class
{
	int get_rate_of_interest()
	{
		return 0;
	}
}

class sbi extends bank
{
	int get_rate_of_interest() //over ridden
	{
		return 10;
	}
}

class icici extends bank
{
	int get_rate_of_interest()  //over ridden
	{
		return 12;
	}
}

class axis extends bank
{
	int get_rate_of_interest() //over ridden
	{
		return 15;
	}
}


public class Overriding {
	
public static void main(String[] args) {
	
	sbi obj1 =new sbi();
	obj1.get_rate_of_interest();
	System.out.println(obj1.get_rate_of_interest());
	
	icici obj2 =new icici();
	System.out.println(obj2.get_rate_of_interest());
	
	axis obj3 =new axis();
	System.out.println(obj3.get_rate_of_interest());	
}

}
