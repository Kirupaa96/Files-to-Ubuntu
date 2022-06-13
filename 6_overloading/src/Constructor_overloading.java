public class Constructor_overloading {
	
	int a;
	int b;
	double c;
	
	Constructor_overloading()   // first constructor
	{
		a=10;
		b=20;
		c=25.5;
	}
	
	Constructor_overloading(int x, int y)  // second
	{
		a=x;
		b=y;
	}
	
	Constructor_overloading(int x, double y) //third 
	{
		a=x;
		c=y;
	}
	
	Constructor_overloading(int x ,int y ,double z) //fourth
	{
	   a=x;
	   b=y;
	   c=z;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
   public static void main(String[] args) {
		
	
	   Constructor_overloading obj = new Constructor_overloading(); // calls 1st constructor
	   obj.display();
	   System.out.println();
	   
	   
	   Constructor_overloading obj1 = new Constructor_overloading(10,20);// calls 2nd 
	   obj1.display();
	   System.out.println();
	   
	   Constructor_overloading obj2 =new Constructor_overloading(50,25.35);//calls 3rd
	   obj2.display();
	   System.out.println();
		
	   Constructor_overloading obj3 =new Constructor_overloading(45,85,79.635);//calls 4th
	   obj3.display();
	 	
	}

}
