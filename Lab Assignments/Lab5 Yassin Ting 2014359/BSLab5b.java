/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program using Scanner, write a java program that prints the price of a ticket based on an input from user.
 */

//import Scanner package from library
import java.util.Scanner;

//class BSLab5b
class BSLab5b{

	//main
	public static void main(String[] args){
	
	Scanner inputUser = new Scanner(System.in);	 //scanner 
			
	System.out.print("Please, enter your age: ");    //print to screen the user input data for age
	
     int age = inputUser.nextInt();     //data input by user used in the next integer value

     System.out.println();   //print to screen blank line
         	           	
	//Age is than 10
		if (age < 10){   
			System.out.println("Ticket cost 1 Euro");   //print to screen "Ticket cost 1 Euro"
		}
	//Age is less than 45
		else if (age < 45){
			System.out.println("Ticket cost 5 Euro");   //print to screen "Ticket cost 5 Euro"
		}
	//else
	     else {
	     	System.out.println("Ticket cost 2 Euro");   //print to screen "Ticket cost 2 Euro"
     
	     }
	}//end main
}//end class


