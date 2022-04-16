
 class vehicle
 {
	 void run()
	 {
		 System.out.println("vehicle is running");
	 }
 }

 class bike extends vehicle
 {
	 void run()
	 {
		 System.out.println("bike is running");
	 }
 }


public class Overriding_2 {
	public static void main(String[] args) {
		
		/* vehicle obj1 =new vehicle();
		obj1.run(); */
		
		bike obj2 =new bike();
		obj2.run();		
	}
}
