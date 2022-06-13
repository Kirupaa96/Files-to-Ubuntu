public class Method_overloading {
	 
  int a;
  int b;
  
  void sum()   // first method
  {
	 a=10;
	 b=20;
	 System.out.println(a+b);
  }

  void sum(int x, int y)  // second method
  {
	/* int a=x;
	int b=y; */
	System.out.println(x+y);
  }
	

  void sum(int x, int y, int z)  // Third method 
  {
	  System.out.println(x+y+z);
  }
	
  void sum(int x, double y) // fourth method 
  {
	 System.out.println(x+y);
  }
	
public static void main(String[] args) {
	
	Method_overloading mo =new Method_overloading();
	mo.sum(); // calls the first method 
	
	mo.sum(100,150); // calls 2nd method
	
	mo.sum(10, 20, 30); //calls 3rd method 
			
	mo.sum(10, 1563.9456); // calls 4th method
}
}
