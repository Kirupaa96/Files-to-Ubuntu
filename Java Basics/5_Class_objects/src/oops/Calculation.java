package oops;

public class Calculation {
	
	int a;
	int b;
	
// 1.Method may not take any parameter 
	
	/* void sum()
	{
		System.out.println(a+b);
	} */

// 2. Method takes parameter
	
	/*void sum( int x, int y)
	{
		x=a;
		y=b;
		System.out.println(a+b);
	} */
	
	
// 3. Method returns some value 
	
	int sum()
	{
		return(a+b);
	}
	
//4. Method may not return any value same as 1	
	
	
	
	public static void main(String[] args) {
		
	Calculation cal = new Calculation();
	
/* 1.Method without any parameter	
	cal.a =100;
	cal.b =200;
	cal.sum(); */
	
	
/*2. Method takes parameter
  
    cal.sum(100,200); */
		
		
// 3. Methods returns some value 

	cal.a =100;
	cal.b =200;	
	int result = cal.sum();
	System.out.println(result);
	
	}

}
