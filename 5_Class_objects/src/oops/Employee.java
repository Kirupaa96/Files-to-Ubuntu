package oops;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	/* Employee (int id, String name, int rupees , int dno) //Constructor name same as class name
	{
		empid = id;
		empname =name;
		salary = rupees;
		deptno =dno;
	} */
	
	void setdata (int id, String name, int rupees , int dno) // created a method w/o returning values
	{
		empid = id;
		empname =name;
		salary = rupees;
		deptno =dno;
	}

	void display() // Method for printing the values but not returning anything.
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String[] args) {
		
//1.Assigning values directly to class variable using objects
		
		/*Employee emp1 = new Employee();
		emp1.empid =100;
		emp1.empname ="Aishwarya";
		emp1.salary =25000;
		emp1.deptno =5;
		emp1.display();
		System.out.println();  */
		
		
		
// 2. Assigning values to class variable using constructor.
		
		/*Employee emp2 =new Employee(102,"Fahad",50000,1);
		emp2.display(); */
		
		
// 3. Assigning values to class variables using methods.
		
		Employee emp3 = new Employee();
		emp3.setdata(105,"Christopher", 30000, 8);
		emp3.display();
}
			
}
