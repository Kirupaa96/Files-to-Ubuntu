package pack3;

import pack2.A;

public class B extends A
{
public static void main(String[] args) {
	
	
	/* A obj1= new A();
	obj1.m1(); 
	obj1.i =10; */ // you cannot access becoz m1 is a default variable 
	
	
	B obj2 =new B();  //possible through inheritance and protected type
	obj2.m1();
	obj2.i=50; 
	
	/* 
	A obj3 =new A();
	obj3.i =20;
	obj3.m1();
    */
	
	
}
}
