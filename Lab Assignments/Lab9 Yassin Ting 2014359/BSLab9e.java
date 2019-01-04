/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program which takes in an input from user and validates the input using a method called validateInput(). 
 * The method should receive the input as a parameter and return true if the input is a number or false if it is not.
 * If the input is not a number, the program should ask the user for a new input.
 */

 import java.util.Scanner;

 //class BSLab9e
 class BSLab9e{
 	//main method
 	public static void main(String[] args){

 		Scanner userIn = new Scanner(System.in);

 		int num = 0;
 		//boolean numx = true;
 		
          System.out.print("Please enter a number : ");

 		num = Integer.parseInt(userIn.nextLine());

 		while(numx == true){
 		}

 		validateInput(num, numx);
 	}

 	public static void validateInput(int num, boolean numx){

 		boolean numx = true;
 		while(numx == true){
 			try{
 				System.out.print("Valid input, thanks you.");
 				numx = true;
 			}
 			catch (Exception e) {
                System.out.print("INVALID INPUT, Try again...");
               // return validateInput();
 			}
 		}

  	}
 }

 /***********************************************NOT DONE YET. NEEDED MORE TIME TO UNDERSTAND THE METHOD************************************************************/
