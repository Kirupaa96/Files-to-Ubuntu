                                                // Single dimensional Array 
public class Arr {

	public static void main(String[] args) {

		int a[]= new int[5]; //declaration of array with 5 elements.
		
//store elements into array 
		
		a[0]=10;
		a[1]=20;
		a[2]=30;	
		a[3]=40;
		a[4]=50;
		
		
// read elements from an array 
		for(int i=0; i<=4;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println();
		
// for... each loop

		for (int i:a)    //the value of a will store in i & increments it & prints.
		{
			System.out.println(i);
		}
		System.out.println();
		
// string array 
	
	           String k[] =new String[3];

				k[0] = "I to ";
		        k[1] = "Fk ";
		        k[2] = "ABC";
		        
		        for (String z:k) // for (string z=0;z<=2;z++)
		        {
		        	System.out.print(z); 
		        }
		        System.out.println();
		        System.out.println("Length of the string is "+k.length); // gives the length of the string 
		        System.out.println();
		        
// To store any no of values 
		        
		        int f[] = {250,569,123,456,789};
		        int sum = 0;
		        
		        
		        for (int i:f)
		        {
		        System.out.println(i);
		        sum = sum +i;
		        }
		        System.out.println("sum is "+sum);
		        System.out.println();
		        
// storing different data types of elements in a single variable using object 
		       
		        Object g[] = new Object [5]; // Object v[] ={10,23.56,'r',"kirupaa"};
		        g[0] = 10;
		        g[1] = 23.56;
		        g[2] = "kirupaa";
		        g[3] = 'R';
		        g[4] = false;
		        
		        for(Object p:g)
		        {
		           System.out.println(p);
		        }
		        
}
}
