

class A
{
	int a;
	int b;
	
	void display()
	{
		System.out.println(a+b);
		System.out.println();
	}
}


class B extends A // so now class b contains everything of class a 
{
	int x;
	int y;
	
	void show()
	{
		System.out.println(x+y);
		System.out.println();
	}
}


class C extends B // contains both class b and a 
{
	int p;
	int q;
	
	void addition()
	{
		System.out.println(p+q);
	}
}

public class Multilevel_inheritance {

public static void main(String[] args) {
	
	/* A obj1 = new A(); since u can acquire everything from class b, obj1 of class a is not reqd
	obj1.a=150;
	obj1.b=250;
	obj1.display(); */ 
	
	/*B obj2 = new B();
	obj2.x =500;
	obj2.y =500;
	obj2.show();
	obj2.a =100;
	obj2.b =100;
	obj2.display(); */
	
	C obj3 = new C();
	obj3.x =500;
	obj3.y =500;
	obj3.show();
	obj3.a =100;
	obj3.b =100;
	obj3.display();
	obj3.p =10;
	obj3.q =20;
	obj3.addition();	
}		
}
