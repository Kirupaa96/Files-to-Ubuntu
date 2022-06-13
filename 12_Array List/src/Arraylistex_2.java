import java.util.ArrayList;

public class Arraylistex_2 {
	
	public static void main(String[] args) {
		
		 ArrayList al =new ArrayList ();
		 
		 System.out.println("No of elements  " + al.size());
		 
		al.add("welcome");
		al.add('d');
		al.add(5);
		al.add(10.56);
		
		
		System.out.println("No of elements in array list after adding " + al.size());
		System.out.println("Elements in array list " + al);
		
		//Inserting elements into array list 
		
		al.add(2, "training"); //training will be added after 2elements. tats aftr d
		al.add(1,15468);
		
		System.out.println("No of elements in array list after inserting " + al.size());
		System.out.println("ELements in array list " + al);
		
	    // Removing elements from array list 
		
		al.remove("welcome"); //directly specify the value
		System.out.println("ELements in array list " + al);
		
		al.remove(2);
		System.out.println("ELements in array list " + al); //2 describes no of elements not pos 
}

}
