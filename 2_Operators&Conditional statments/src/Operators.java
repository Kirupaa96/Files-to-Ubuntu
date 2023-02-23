
public class Operators {
	
	
public static void main(String[] args) {
	int a=10;
	int b=30;
	int c=a+b;
	
	
	// Arithmetic operators 
	
	System.out.println("sum of a and b is "+c);
	System.out.println(b-a);
	System.out.println(a*b);
	System.out.println(b/a);
	System.out.println(b%a);
	System.out.println();
	
	//Relational operators 
	
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println();
	
	//Logical operators
	
	boolean x= true;
	boolean y= false;
	
	System.out.println(x&&y);
	System.out.println(x||y);
	System.out.println(!x);
	System.out.println(!y);
	System.out.println();
	
	//Assignment operators
	
	int d;
	float e;
	
	d=50;  // Assigning the value of a to d 
	System.out.println(d);
	
	 d++;  // Increments only by 1
	 d--; 
	 System.out.println(d++);  
	 System.out.println(d--);
	
	d+=5;                   // similar to d=d+5;
	System.out.println(d);
	d= d*10;                // similar to d*=5;
	System.out.println(d);
	d= d-5;                 // similar to d-=5;
	System.out.println(d);
	e= d/5f;                // similar to d/=5;
	System.out.println(e);
	System.out.println();
	
	//Conditional operators 
	
	//if 
	
	int age= 50;
	
	if (age>=18) 
	{
		System.out.println("You are eligible to vote");
	}
	     System.out.println("program exited");
	
	//if else
	     
	 if (age>=18)    
	 {
		 System.out.println("You are eligible to vote");
	 }
	 else 
	 {
		 System.out.println("You are not eligible to vote");
	 }
	
	// Nested if else 
	 
	 int day= 7;
	 
	 if (day==1)
	 {
		 System.out.println("Sunday");
	 }
	 else if(day==2)
	 {
		 System.out.println("Monday");
	 }
	 else if(day==3)
	 {
		 System.out.println("Tuesday");
	 }
	 else if(day==4)
	 {
		 System.out.println("Wednesday");
	 }
	 else if(day==5)
	 {
		 System.out.println("Thursday");
	 }
	 else if(day==6)
	 {
		 System.out.println("Friday");
	 }
	 else if(day==7)
	 {
		 System.out.println("Saturday");
	 }
	 else 
	 {
		 System.out.println("Your day doesn't match ");
	 }
	 
	 //Switch case 
	 
	 int date= 1;
	 
	 switch(date)
	 {
	 case 1:System.out.println("Monday");break; //Once the condition executes it breaks from that line
	 case 2:System.out.println("Tuesday");break;
	 case 3:System.out.println("Wednesday");break;
	 case 4:System.out.println("Thursday");break;
	 case 5:System.out.println("Friday");break;
	 case 6:System.out.println("Saturday");break;
	 default: System.out.println("Sunday");
	 }
	 
}
	}
