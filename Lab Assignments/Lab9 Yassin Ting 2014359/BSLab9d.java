/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that takes a name and an age from user, sends the data to a method called checkPerson, which receives the parameters ( name and age ), classifies the user according to the user’s age and displays the classification back to the user:
 * - Children ( age less or equal than 12 )
 * - Adult ( age between 13 and 50 )
 * - Senior ( age greater 50 )
 */

 import java.util.Scanner;     //import Scanner

 //class BSLab9d
 class BSLab9d{
 	//main method 
 	public static void main(String[] args){

 		Scanner userIn = new Scanner(System.in);     //Scanner declared

          //variables defined
          String name;
 		int age = 0;

 		System.out.print("Enter your name : " + "");     //print ask from user for the input
 		
 		name = userIn.nextLine();

 		System.out.print("Enter your age : " + "");      //print ask from user for the input
 		
 		age = Integer.parseInt(userIn.nextLine());

 		checkPerson(age, name);     //invoke method

 	}
 	
 	public static void checkPerson(int age, String name){

 		System.out.println();     //print to screen blank line
 		
 		if(age <= 12){                                                                                    //if age 12 and below print to screen as "Children"
 			System.out.println(name + " ( " + age + " years old " + ") is classified as : Children");
 		}
 		else if(age <= 50){                                                                               //else if age 50 and below print to screen as "Adult"  
 			System.out.println(name + " ( " + age + " years old " + ") is classified as : Adult");
 		}
 		else{                                                                                             //else age over 50 print to screen as "Senior"
 			System.out.println(name + " ( " + age + " years old " + ") is classified as : Senior");
 			 
 		}
 	}//end of main method
 }//end of class
