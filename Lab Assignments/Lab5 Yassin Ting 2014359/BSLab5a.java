/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program using BufferedReader, write a java program that prints a times table based on a user input.
 */

//tell the compiler to include the standard input and output classes such as BufferedReade, IOEception and InputStreamReader. Alternative can import java.* for the whole package.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class BSLab5a
 class BSLab5a{

 	//main
 	public static  void main(String[] args) throws IOException{   //throws IOException used as I need to parseInt the String (timesTable)

 		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));  

 		           //print to screen "Times table :..where user can input their desired number for the times table
                     System.out.print("Times table: ");
 		 		
 		int total;   //an integer total is to define the result or value of user based input number against the the times table.

 		String timesTable = br.readLine();
 		int num = Integer.parseInt(timesTable);  //convert String into Integer 

 		          System.out.println();  //print blank line to screen
          
 		for(int z = 0; z <= 9; z++){  //set the value for the array number of 0 to 9 
 			total = num * z;  //calculations !!!
 			
 				System.out.println(num + " x " + z + " = " + total);  //print to screen the Times Table result from user input number times 0 to 9 number table.
 		}
  	} //end of main
 }  //end of class
