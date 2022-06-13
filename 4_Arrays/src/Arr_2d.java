                             //Two dimensional Array 
public class Arr_2d {
public static void main(String[] args) {
	
	int a[][]=new int[3][2]; //array declaration
	
//storing elements  // int a[][]={{10,20},{30,40},{50,60}};
	 a[0][0]=10;
	 a[0][1]=20;
	 a[1][0]=30;
	 a[1][1]=40;
	 a[2][0]=50;
	 a[2][1]=60;
	 
// reading elements 
	 
	  // Classic for loop
	 
	 for(int i=0; i<=2; i++) //for incrementing each row
	 {
		 for(int j=0; j<=1; j++) //for inc each coln of row
		 {
			 System.out.println(a[i][j]); 
		 }
	 }
	 System.out.println("Program Excited");
	 System.out.println();
	 
//for each loop - I dint understand 
	 
	 int n[][]= { {10,20,30}, {20,30,40}, {30,40,50}, {40,50,60}, {70,80,90} };
	 
	 for (int m[]:n)
	 {
		 for (int o:m)
		 {
			 System.out.print(o+" ");
		 }
		 System.out.println();
	 }	
}	
}

