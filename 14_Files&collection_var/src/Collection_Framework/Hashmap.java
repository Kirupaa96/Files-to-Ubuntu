package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		Map<Integer,String> obj =new HashMap<Integer,String>(); // If you want to store 2args like rollno, name inform of key & value
		                                                        // Map interface is the parent of hashmap class 
		obj.put(100,"Arun");
		obj.put(101,"Karun");
		obj.put(102,"Varun");
		
		// System.out.println(obj.get(100));
		
		for (Integer i : obj.keySet()) // only the integer key set is getting assigned to the Integer
		{
			System.out.println(obj.get(i));
		}
		
		
		
		
		
		
	}
	
}
