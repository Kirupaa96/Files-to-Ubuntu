import java.util.HashMap;
import java.util.Map;


public class Example {
	public static void main(String[] args) {
		
		HashMap <Integer, String> hm =new HashMap <Integer, String>();
		hm.put(100,"amit");
		hm.put(200,"vijay");
		hm.put(300,"faruk");
		
		System.out.println(hm);
		
		
		for (Map.Entry m:hm.entrySet())  // Entry set values are assgn to m and from there it will get value
			                             // and key
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		hm.remove(300); // for removing the key 
		System.out.println(hm);
		
		
		
		
		
	}

}
