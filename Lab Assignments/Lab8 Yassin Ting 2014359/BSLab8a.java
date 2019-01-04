/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that prints the result of an operation on two numbers. The numbers and operation should be entered by the user.
 * Program ask for the two number, and then show a menu of options after the number have been entered, the output below is to demonstrate how the program should work
 */

 //import Sacnner from package
 import java.util.Scanner;

 //class BSLab8a
 class BSLab8a{
 	//main method
 	public static void main(String[] args){

 		Scanner input = new Scanner(System.in);         //Scanner declared
 		System.out.print("Enter the 1st number: ");

 		int num1 = input.nextInt(); 

 		System.out.println();

 		System.out.print("Enter the 2nd number: ");

 		int num2 = input.nextInt();

 		String add = "A";
 		String sub = "B";
 		String div = "C";
 		String mul = "D";

 		System.out.println();
 		System.out.println("---- Menu ----");
 		System.out.println("A - Add");
 		System.out.println("B - Substract");
 		System.out.println("C - Divide");
 		System.out.println("D - Multiply");
          System.out.println("--------------");
          System.out.println();
          System.out.print("Enter one option: ");

          

         		

 		int math = 0;

 		switch( math ){
			
			case 1: 
				System.out.println(num1 + " + " + num2 + (num1 + num2) + "");
				break;

			case 2:
				System.out.println((num1-num2) + "");
				break;	

			case 3:
				System.out.println((num1/num2)+ "");
				break;
				
			case 4:
				System.out.println((num1*num2) + "");
				break;
 		}
 	}
 }


 //****************************************THIS PROGRAM IS NOT WORKING AND STILL UNDER PROGRESS**********************************************
