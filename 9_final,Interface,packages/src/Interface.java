
interface testint 
{
    int a=10; // by default variable is static and final
	void display(); // abstract method
}


public class Interface implements testint
{ 
	public void display()
	{
		System.out.println(a);
	}
    public static void main(String[] args) {
	
    	testint obj = new Interface();
    	obj.display();
	}
}
