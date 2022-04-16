
interface a 
{
	int a =10;
	void display();
}

interface b
{
	int b=20;
	void show();
}


public class Multiple_inheritance implements a,b  
{
	public void display()
	{
		System.out.println(a);
	}

   public void show()
   {
	   System.out.println(b);
   }

   public static void main(String[] args) 
   {
	
	  a obj1 = new Multiple_inheritance();
	  obj1.display();
	   
	  b obj2 =new Multiple_inheritance();
	  obj2.show();
	}


}
