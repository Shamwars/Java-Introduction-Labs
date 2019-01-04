/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program which asks the user to enter a number between 1 and 9. The program should validate the input to check if it is a number and if it is a valid number (within the range).
 * If the input is not a number, the program should display a message saying:
 * "Invalid input, please try again !!!"
 * If the input is out of the range, the program should display a message saying:
 * "Invalid number, please try again !!!"
 * The program should keep asking for a number if the input is incorrect.
 */

 //import Scanner from the package
 import java.util.Scanner;

 //class BSLab7b
 class BSLab7b{
 	//main method
 	public static void main(String[] args){

 		Scanner inUser = new Scanner(System.in);     //Scanner declared

 		          System.out.print("Please, enter a number between 1 and 9: ");      //print to screen "Please, enter a number between 1 and 9: "
	
          int nom = 0;    //integer nom defined

          String input = inUser.nextLine();     //use the user input data for the next step

          //starting loop
          do{
			try{ 
				System.out.println();                                              //print to screen blank screen
				System.out.print("Please, enter a number between 1 and 9: ");      //print to screen "Please, enter a number between 1 and 9:"
				nom = Integer.parseInt(inUser.nextLine());                         //user input data use for next line 
  			}
			catch (NumberFormatException ex){                                       //exception used to allow user type in other than number without commiting error  
				System.out.println();                                              //print to screen blank line
				System.out.println("Invalid input, please try again !!!");         //print to screen "Invalid input, please try again."
			}
			if (nom < 1 || nom > 9){                                                //defined that any number lower than 1 and higher than 9 will trigger error
				System.out.println();                                              //print to screen blank line
				System.out.println("Invalid number, please try again !!!");        //print to screen "Invalid number, please try again !!!"
  			}
          }
          while(nom > 0 || nom <= 9);     //Defined the assigned value accepted in the program
          
     } //end of main method
 }  //end of class
