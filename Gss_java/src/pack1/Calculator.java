package pack1;

public class Calculator {
	
	public static void main(String[] args) { 
		Calculator basicCal= new Calculator();
		basicCal.addNumbers(100, 100);
		basicCal.subNumbers(1000,900);
		basicCal.mulNumbers(123,2);
		basicCal.divNumbers(250,2);
		}

	public void addNumbers(int num1, int num2) {         //method for add 
		int sum = num1 + num2; 
		System.out.println("Sum of 2nos is "+sum);
			}
	
	public void subNumbers(int num1, int num2) {         //method for subtract
		int diff = num1 - num2; 
		System.out.println("diff of 2nos is "+diff);
			}
	
	public void mulNumbers(int num1, int num2) {         //method for multiply 
		int mul = num1 * num2; 
		System.out.println("Product of 2nos is "+mul);
			}
	
	public void divNumbers(int num1, int num2) {         //method for division
		int div = num1 / num2; 
		System.out.println("Division of 2nos is "+div);
			}
	
	
	
}
