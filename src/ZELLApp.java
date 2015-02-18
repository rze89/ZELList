import java.util.*;
import java.io.*;

public class ZELLApp<T> {
  public static void main(String [] args) throws FileNotFoundException{

  Scanner kbd = new Scanner(System.in);   //scanner for input
  ZELLInterface theList = new ZELLItemType(); //creates storage object of ItemType
  int choice, choice2, choice3; //variables for choices made in the app
  String name;//varable for input throughout the app
  PrintWriter out = new PrintWriter("ZEOut.text"); //the txt file that will have input written to
  
  //greeting message read from txt file that I created
  try (BufferedReader readIt = new BufferedReader(new FileReader("read.txt")))
	{
		String line;
		while ((line = readIt.readLine()) != null) {
			System.out.println(line);
		}

	} catch (IOException e) {
		System.out.println("Error while trying to read file.");
	} 
  //making space
  System.out.println();
  
  //instantiating count to 0 for upcoming choices
  choice =0;

  //gives the user option to add names or reset the list
  while(choice !=3){
    System.out.println("Welcome to your personal name storage app!" +
        "\npress 1 to add a name, 2 to reset the list, 3 to exit");
    choice = kbd.nextInt();
    if(choice ==1){
      System.out.println("Please enter a name: ");
      name = kbd.next();
      theList.add(name);
      out.println(name);
    }
    if(choice ==2){
      System.out.println("Your list has been reset");
      theList.reset();
    }
    if(choice ==3){
      System.out.println("Okay. You're done adding names!");
    }
  }
  
  choice2 =0;
  //gives user option of checking if a name was added
  while(choice2 != 2){
    System.out.println("Want to check if a certain name was added? Press 1." +
        "\nOr press 2 to skip this.");
    choice2 = kbd.nextInt();
    if(choice2==1){
      System.out.println("Enter the name you'd like to search for: ");
      name = kbd.next();
      System.out.println(theList.get(name));
    }
    if(choice2 ==2){
      System.out.println("Skipping this step!");
    }
  }
  //prints out current list using toString 
  System.out.println("Your string is as follows: "+ theList.toString());
  //prints our current size of the list
  System.out.println("The size of your list is: " + theList.size());

  choice3 =0;
//gives user option of removing a name
  while(choice3 !=2){
    System.out.println("If you'd like to remove an item from the list "+
        "\npress 1. Or if you prefer not to press 2 to skip this step.");
    choice3 = kbd.nextInt();
    if(choice3==1){
      System.out.println("What name would you like to remove?");
      name = kbd.next();
      theList.remove(name);
    }
    if(choice3==2){
      System.out.println("Skipping this step.");
    }
  }
  //finish writing to outside text file and close it
  out.close();
  //prints out final list
  System.out.println("Your final string list is: "+ theList.toString());
  //prints out final size
  System.out.println("The final size of the string is: " + theList.size());
  

  }
}