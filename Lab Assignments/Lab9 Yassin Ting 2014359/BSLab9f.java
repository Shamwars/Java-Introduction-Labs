/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that takes a speed in kilometres / hour ( Km/h ) from user and converts to Miles / hour ( MPH ). 
 * Program should have a method called convSpeed that takes the speed entered by the user, converts it and returns the result. The result should be printed back to the user.
 * p/s: 1 Kilometre = 0.621371 Mile
 */

 import java.util.Scanner;     //import Scanner 

 //class BSLab9f
 class BSLab9f{
 	//main method
 	public static void main(String[] args){

 		Scanner userIn = new Scanner(System.in);     //Scanner declared

 		int km = 0;     //defined variable
 		
 		System.out.print("Speed in Km/h: ");     //print to screen instruction for user input

 		km = Integer.parseInt(userIn.nextLine());   //getting user input 

 		convSpeed(km);    //invoke method
 	}

 	public static void convSpeed(int km){

 		System.out.println();     //print to screen blank line
 		System.out.println("Speed in MPH: " + (km * 0.621371));     //printto screen the result of the conversion from KMh to MPH
 	}//end of main method	
 }//end of class
