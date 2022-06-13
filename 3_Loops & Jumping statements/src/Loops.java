
public class Loops {

	public static void main(String[] args) {
		
	int i=10;
	
	// While loop
	
	while (i<=100)
	{
		System.out.println(i);
		i = i+10;
	}
	System.out.println();
	
	// do while loop
	
	int a =1;
	do
	{
		System.out.println(a);
		a= a+2;
	}while (a<=10);
	System.out.println();
	
	// for loop 
	
	for (int b=10; b>=1; b--)
	{
	System.out.println(b);
	}
	System.out.println();
	
	// break 
	
	for (int z=10; z<=20; z++)
	{
	   if (z==15)
	 {
		break;
	 }
	 System.out.println("z is "+z);
	}
	System.out.println();
	
	// continue 
	
	for (int z=10; z<=20; z++)
	{
	 if (z==15)
	 {
		continue; // when z= 15, it will go to for loop without printing the value 
	 }
	System.out.println("z value is "+z);
	}
}
}
