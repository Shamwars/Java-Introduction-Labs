/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that takes two numbers from a user, sends the numbers to a method called multNumbers, which returns the result of the first number multiplied by the second one. 
 * The result should be displayed back to the user.
 */

 import java.util.Scanner;     //import Scanner 
 
 //class BSLab9c
 class BSLab9c{
 	//main method
 	public static void main(String[] args){

 		Scanner userIn = new Scanner(System.in);     //decalared Scanner

          //variables declared
 		int num1 = 0;
		int num2 = 0;

		System.out.print("1st Number : " + "");     //print to screen the first number by user input

		num1 = Integer.parseInt(userIn.nextLine());
		
		System.out.print("2nd Number : " + "");     //print to screen the second number by user input

		num2 = Integer.parseInt(userIn.nextLine());

		multNumbers(num1, num2);    //invoke method
 	}

 	public static void multNumbers(int m1, int m2){
 		System.out.println();
 		System.out.println(m1 + " * " + m2 + " = " +(m1 * m2));      //print to screen the result of multiplication based on the user's choices of 2 numbers
 		 		
 	}//end main method
 }//end of class
