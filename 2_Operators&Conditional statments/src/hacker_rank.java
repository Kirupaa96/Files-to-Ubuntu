import java.util.Scanner;

public class hacker_rank {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	    int t=in.nextInt();
	    for(int i=0;i<t;i++){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int n = in.nextInt();

	        myfunc(a,b,n);

	    }

	    in.close();

	}

	static void myfunc(int a,int b,int n){
	    int sum=0;
	    for(int j=0;j<=n-1;j++){
	        sum+=Math.pow(2,j)*b;
	        int fina=a+sum;
	        System.out.print(fina+" ");
	    }
	    System.out.print("\n");

	}
	
	
	
	
	
	
	
	
	
	
}
