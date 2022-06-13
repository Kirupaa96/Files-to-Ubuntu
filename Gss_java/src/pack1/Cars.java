package pack1;

public class Cars { //Cars is a class name 
     
	
	
	public static void main(String[] args) {
		
		Calculator Caradd = new Calculator ();   //calling methods of a diff class 
		Caradd.addNumbers(152,0);
		
		Cars audi = new Cars();   // audi is the object of class Car 
	
		int noOfCars = 10; 
		
		String colourOfMyCar = "Black"; 	
		
		char carModel = 'Z';
		
		double widthOfCar = 15678.1234823;

		float heightOfCar = 100.45f;
		
		boolean do_i_have_a_car = false;
		
		
		
		
		System.out.println("color of my car and model is "+ colourOfMyCar + carModel);
		
		System.out.println("width of my car is "+widthOfCar); 
		
		System.out.println("height of my car is "+heightOfCar);
		
	
		
		
	}
	
	
}
