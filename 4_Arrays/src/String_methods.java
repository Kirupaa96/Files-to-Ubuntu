
public class String_methods {
public static void main(String[] args) {
	
	String s ="Australia";
	
	System.out.println(s.length()); // no of char in the string
	
// Concatenation- joining 2 or more strings 
	String s1="kirupzz";
	String s2=" Raz";
	
   System.out.println(s1+s2);  
   System.out.println(s1.concat(s2));
   System.out.println("India" + " Rocks");
   System.out.println("welcome".concat(" to Java"));
   System.out.println();
   
 // Equals
    String h1= "Tiger";
    String h2= "TIGER";
    
    System.out.println(h1.equals(h2));
    System.out.println(h1.equalsIgnoreCase(h2));
    System.out.println();
  
 //contains
    System.out.println(s1.contains("pzz"));
    System.out.println();
    
 //substring  imp
    
    System.out.println(s.substring(0,3));
    System.out.println();
    
 //Replace
    System.out.println(h1.replace('e', 'A'));
    System.out.println(s1.replace("zz", " Raz"));
    
	
}
}
