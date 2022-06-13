import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Handling_files {

	public static void main(String[] args) throws IOException  {
		
	//Represent a file 
		File obj =new File("File_handling.txt"); //path of the file
		
		if(obj.exists())
		{
			System.out.println("The file exists at the given location");
			System.out.println("The file is stored in "+obj.getAbsolutePath());
		}
		else 
		{
			System.out.println("The file doesn't exists at the given location");
		}
		
    //Reading text from the file
		FileReader obj2=new FileReader(obj);
		BufferedReader obj1=new BufferedReader(obj2);
		String text;
		
		while((text=obj1.readLine())!=null)
		{
			System.out.println(text);
		}
		
		obj1.close();//Just to release the memory - not mandatory - to ignore warnings
		
		
		
		
		
		
	}
}
