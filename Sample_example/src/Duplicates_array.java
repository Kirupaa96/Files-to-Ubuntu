import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Duplicates_array {

	public static void main(String[] args) 
	{
		//Find_duplicates();
		//Remove_duplicates();
		//sorting();
		//Traditional_sorting();
		//swapping();
		//Count_occurences();
		// Armstrong_number();
		// Count_print_armstrong_nos();
		//count_even_odd();
		// Factorial();
		//Fibonacci();
		//min_num();
		//Reverse_sentence();
		//Palindrome();
		//example1();
		//example2();
		//example3();
		//example4();
		example5();
	}
	
		
		
	 public static void Find_duplicates()
	 {
	  String arr[]= {"kirupaa","Deepak","Reshmi","kirupaa","Divya"};
	  
	  boolean flag=false;
	  for (int i=0;i<arr.length;i++)
	  {
		  for (int j=i+1;j<arr.length;j++)
		  {
			  if (arr[i]==arr[j])
			  {
				 System.out.println("Duplicate element found is "+arr[i]); 
				 flag=true;
			  }
		  }
	  }
		
	  if(flag==false)
	  {
		  System.out.println("Duplicate element not found");
	  }
	 
	 }
		
	 public static void Remove_duplicates()
	 {
        int arr[] = {1,2,2,3,3,4,5,5,7,7,10};
		int len = arr.length;
		int temp[] = new int[arr.length];
		int j = 0;
		
		for(int i=0; i<len-1; i++)
		{
		  if (arr[i] != arr[i+1])
		   {
			temp[j]= arr[i];	
			j++; // is to store into the next space, so increment it.
		   }
		}
		temp[j++]=arr[len-1];
		
		for (int k=0; k<j; k++)
		{
			System.out.println(temp[k]);
		}
	 }
		
	 public static void sorting()
	 {
		// Ascending order  
		int b[] = new int[] {50,79,20,1};
		Arrays.sort(b); 
		System.out.printf("Modified b[] : %s",Arrays.toString(b));
		System.out.println();
		
		//Descending order
		Integer array[] = new Integer[] {5,53,100,2,10,1};
		Arrays.sort(array, Collections.reverseOrder());
		
		for (int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	 
	public static void Traditional_sorting()
	{
		int a[] =new int[] {50,1,60,3,80,-15};
		int temp=0;
		
		for (int i=0; i<a.length; i++)
		{
		  for (int j=i+1; j<a.length; j++)
		  {
			  if(a[i]>a[j])   // ascending order 
			  {
				 temp= a[i];  
				 a[i]= a[j]; 
				 a[j]= temp;
			  }
		  }
		}
		
		for (int k:a)
		{
			System.out.println(k);
		}
	}
	 
	public static void swapping()
	{
		int a=50;
		int b=100; 
		int temp;
		
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("swapping with temp var " +a +","+ b);
		
	    int x= 21;
	    int y= 156;
	    
	    x=x+y;  //30 
	    y=x-y; //10
	    x=x-y; //20
	    
	    System.out.println("swapping without temp var "+x+","+y);
	}
	 
	public static void Count_occurences()
	{
		System.out.println("Enter any word");
		Scanner name = new Scanner(System.in);
		String input= name.nextLine();
		
		String data =input;
		Map<Character,Integer> value = new HashMap<Character,Integer>();
		
		for (int i=0; i<data.length(); i++)
		{
		   char ch= data.charAt(i);  
		   
		   if(value.containsKey(ch))
		   {
			   value.put(ch, value.get(ch)+1);
		   }
		   else
		   {
			  value.put(ch, 1);
		   }
		}
		
		//System.out.println(value);
		
		for( Map.Entry a:value.entrySet())
		{
			System.out.println(a.getKey()+" = "+a.getValue());
		}
	}
	 
	 public static void Armstrong_number()
	 {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no:");
		int num= input.nextInt();
		 
	    //int n=153;
		int i=0,j=0;
		int a=num;
		
		while(a>0)
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		
		if(num==j)
		{
			System.out.println("Its a armstrong no");
		}
		else
		{
			System.out.println("Its not a armstrong no");
		}
	}
	 
	 public static void Count_print_armstrong_nos()
	 {
		 int c=0;
		 for(int n=1; n<1000; n++)
		 {
			 int i=0,j=0;
			 int a=n;
			
			 while(a>0)
			 {
		       i=a%10;
			   j=j+(i*i*i);
			   a=a/10;
			 }
	     if(n==j)
		  {
		    System.out.println("Armstrong no is = "+j);
		    c++;
		  }
		 }
		 System.out.println("Count of armstrong nos are "+c);
	 }
	 
	 public static void count_even_odd()
	 {
		//System.out.println("Enter any number ");
		//Scanner input =new Scanner(System.in);
		//int num= input.nextInt();
		
	    //int a = num;
	    int even=0,odd=0;
		
	    for(int i=0; i<=10; i++)
	    {
		if(i%2==0)
		{
			System.out.println(i + " is even num ");
			even++;
		}
		else 
		{
			System.out.println(i +" is odd num");
			odd++;
		}
	    } 
		 
		System.out.println("Total even num are "+even); 
		System.out.println("Total odd num are "+odd); 
	  }
	 
	 public static void Factorial()
	 {
		 int num = 10;
		 int prod=1;
		
		 for (int i=1; i<=num; i++)
		 {
			 prod = prod*i;
		 }
		 
		 System.out.println("Factorial of " +num+ " is " +prod);
	  }
	 
	 public static void Fibonacci()
	 {
		int a=0,b=1,c=0;
		
		System.out.print(a + ",");
		System.out.print(b + ",");
		
		for(int i=0; i<10; i++)
		{  
		   c=a+b;
		   System.out.print(c + "," );
		   a=b;
		   b=c;
		}
	 }
	 
	 public static void min_num()
	 {
		 int num[]= {100,20,5,30,40,20};
		 int min = num[0]; //100
		 
		 for(int i=0; i<num.length; i++)
		 {
			 if(num[i]<min)
			 {
				  min = num[i];
			 }
		 }
		 System.out.println(min);
	 }
		
	public static void Reverse_sentence()
	{
	   String sent= "My name is kirupaa";
	   String word[] = sent.split(" ");    // word[0] = My 
	   String result = "";
	   
	   for (int i=word.length-1; i>=0; i--)
	    {
		   result += word[i] + " ";
		}
	    System.out.println(result);
	 }
		
	public static void Palindrome()
	{
		int c=0;
		
		for (int n=121; n<40; n++)
		{	
	     int i=0,j=0;
	     int a=n;
	     
		
	     while (a>0)
		  {
			i=a%10;  
			j=(j*10)+i; 
			a=a/10; 
		  }
	     
		 if(n==j)
		 {
		 System.out.println(j);
		 c++;
		 }
		}
		
		System.out.println("The count of palindrome nos are "+c);
		
		/* if(num==j)
		{
			System.out.println("Its a palindrome");
		}
		else 
		{
			System.out.println("Its not a palindrome");
		} */ 
		
		
	}
		
		
	public static void example1()
	{
		Scanner scan = new Scanner(System.in);
        
	    int i = scan.nextInt();
        double d = scan.nextDouble();
        
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
	}

	
	public static void example2()
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N>=2 && N<=20)
		{
	       for (int i=1; i<=10; i++)
	       {
	    	   int result = N*i;
	    	   System.out.println(N+" x "+i+" = "+result);
	       }
		}
		else
		{
			System.out.println("Enter the number between the range");
		}
		
	}

    public static void example3()
    {
    	 Scanner scan = new Scanner(System.in);
    	 int q = scan.nextInt();
    	
    	for (int i=1; i<=q; i++)
    	{
    		int a = scan.nextInt();
    		int b = scan.nextInt();
    		int n = scan.nextInt();
    		
    		double sum=0;
    		for (int j=0; j<n; j++)
    		{
    		    sum = sum + Math.pow(2,j)*b;
    	        double fina=a+sum;
    	        int Result= (int)fina;
    	        System.out.print(Result+" ");
    	    }
    		System.out.println();
    	}
    }
    	
    public static void example4()
    {
    	 Scanner sc = new Scanner(System.in);
    	    int t=sc.nextInt();

    	    for(int i=0;i<t;i++)
    	    {

    	        try
    	        {
    	            long x=sc.nextLong();
    	            System.out.println(x+" can be fitted in:");

    	            if(x>=-128 && x<=127)
    	            System.out.println("* byte");

    	            if(x>=-32768 && x<=32767)
    	            System.out.println("* short");

    	            if(x>=-2147483648 && x<=2147483647)
    	            System.out.println("* int");

    	            if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)-1)                          
    	            	System.out.println("* long");
    	        }
    	        catch(Exception e)
    	        {
    	        System.out.println(sc.next()+" can't be fitted anywhere.");
    	        }

    	    }
    	}
    
    public static void example5()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int position =1;
    	
    	while(sc.hasNext())
    	{
    	  String s=	sc.nextLine();
    	
          System.out.println(position + " "+s);
    	  position++;
        }
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    		
   }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    

	
	
	
	
	
	
	
	
	
	
	
	















































