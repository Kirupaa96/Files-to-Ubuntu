
public class Static {

    int  a;        // non static var
	static int b;  // static var
	
	
	void m1() //non static method
	{
		System.out.println("m1 is a non static method");
	}
	
	void m3()  // non static method
	{
		a=123;
		b=369;
		m1();
		m2();
	}
	
	static void m2() //static method
	{
		System.out.println("m2 is a static method");
		
	}
	
	
	
	public static void main(String[] args)     // static method
	{  
	// static methods can access oly static stuff	
		b= 55;
		System.out.println(b);
		m2();
		
	// static methods can access non static stuff through objects 
		
		Static s= new Static();
		s.a=1500;
		System.out.println(s.a);
		s.m1();		
}	
}
