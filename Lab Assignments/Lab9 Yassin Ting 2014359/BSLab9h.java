/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that operates like a calculator.
 * Your program should ask a user for two numbers, and then show a menu of options after the numbers have been entered, each operation should be done in a different method. 
 * Each method should take the two numbers as parameters, and return the result of the operation, the result should also be printed back to the user.
 */

 import java.util.Scanner;

 //class BSLab9h
 class BSLab9h{
 	//main method
 	public static void main(String[] args){

 		Scanner userIn = new Scanner(System.in);

 		int num1 = 0;
 		int num2 = 0;
 		String selection;
 		
 		System.out.print("Enter the 1st number : ");

 		num1 = Integer.parseInt(userIn.nextLine());

 		System.out.print("Enter the 2nd number : ");

 		num2 = Integer.parseInt(userIn.nextLine());

          System.out.println();
 		System.out.println("---- Menu ----");
 		System.out.println("a - Add");
 		System.out.println("b - Subtract");
 		System.out.println("c - Divide");
 		System.out.println("d - Multiply"); 
 		System.out.println("--------------");
 		System.out.println();	
 		System.out.print("Enter one option: " );

 		selection = String.parseString(userIn.nextLine());

 		switch (selection){
 			case a: add();
 					break;
 			case b: sub();
 					break;
 			case c: div();
 					break;
 			case d: mul();
 					break;						
 		}

 			 

 		add(num1, num2);  //invoke method
		sub(num1, num2);  //invoke method
		mul(num1, num2);  //invoke method
		div(num1, num2);  //invoke method
 	}

 	public static void add(int a1, int a2){

 		System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
 	}

 	public static void sub(int s1, int s2){

 		System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
 	}

 	public static void mul(int m1, int m2){
		System.out.println(m1 + " * " + m2 + " = " +(m1 * m2));
	}//end of main method

	public static void div(int d1, int d2){
		System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
	
 	}
 }


 /***********NOT DONE YET***********/
