import java.util.*;
import java.io.*;

public class ZELLTest<T> {

  public static void main(String [] args) throws FileNotFoundException{
    ZELLInterface aList = new ZELLItemType();  //create the list
    PrintWriter out = new PrintWriter("ZEWriteOut.txt"); //create printer for outputting
    Scanner kbd = new Scanner(System.in); //scanner for input
    String word; //variable for input
    int count= 0; //counter for test
  
    //instruction message
    System.out.println("Please enter 6 words and press enter after each word.");
   
    //while loop used for adding elements until 6 words are written
    while(count <6){
    	word= kbd.next(); 
    	aList.add(word);
    	out.println(word);
    	count++;
    }
    //close output
    out.close();
    
    //message
    System.out.println("The words you wrote were written to a file." +
    		"\nthat file will now be read from and display its contents");
    //try and catch used for reading from a file using BufferedReader(easiest way to me)
  try (BufferedReader readIt = new BufferedReader(new FileReader("ZEWriteOut.txt")))
	{
		String line;
		while ((line = readIt.readLine()) != null) {
			System.out.println(line);
		}

	} catch (IOException e) {
		//prints my own message if an exception occurs
		System.out.println("Error while trying to read file.");
	} 
  
  }
}