package pack1;

class A
{
	/* private int i=10;
	private void m1()
	{
		System.out.println(i);
	} */ 
	
	
	 int i=10;  // this becomes default 
	 void m1()
	{
		System.out.println(i);
	} 
	
}

public class Access_mod_ex {
public static void main(String[] args) {
	
	
	A obj1 =new A();
	/* obj1.i =10;  // cannot access var & methods since its private 
	obj1.m1(); */  
	
	obj1 .i =10;
	obj1.m1();	
}
}
