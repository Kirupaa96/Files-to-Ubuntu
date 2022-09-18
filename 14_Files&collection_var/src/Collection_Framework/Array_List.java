package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		List <Integer> obj =new ArrayList<Integer>(); //list is a parent interface of arraylist class and those obj can be assigned to list interface 
		                                              // Integer is a wrapper class 
		
		obj.add(5);  // stored at index 0 - add() is to add the objects
		obj.add(7);
		obj.add(5);
		
	    System.out.println("The value is "+obj.get(1)); // get() is to retrieve the elements 
	    System.out.println();
	    System.out.println("The size of the list is "+obj.size()); // size() of the array list 
	    System.out.println();
	    
	    for (int i=0;i<obj.size();i++)
	    {
	    	System.out.println("Array list element at index "+i+ " are "+obj.get(i));
	    }
	    
	  /*  for (Integer i : obj)
	    {
	    	System.out.println(i);
	    } */ 
	    
		
		
		
		
		
		
	}
	
	
}
