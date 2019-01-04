/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that takes a numbers from user, generate a random number between 100 and 200 (inclusive) and displays the result of 
 * 4 basic math operations ( Addition, Subtraction, Multiplication & Division ). 
 */

//tell the compiler to include the standard input and output classes such as BufferedReade, IOEception and InputStreamReader. Alternative can import java.* for the whole package.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class BSLab5d
class BSLab5d{

	 //main
	 public static void main(String[] args) throws IOException{  //throws IOException used as I need to parseInt the String

	 	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));    

               System.out.print("Enter a number: ");  //print to screen instruction for user to input desired number 
                    
          String input = br.readLine();
 		int user = Integer.parseInt(input);   //convert String to Integer
 		 
	 	int[] rand = new int[1];   //defined random value to only one number

	 		System.out.println();   //print to screen blank line

 		     System.out.print("1st Number: " + user);   //print to screen first number from user input
 		     System.out.println();   //print to screen blank line

	 	for (int x = 0; x<rand.length ; x++ ){   //defined value for random number
              	rand[x] = (int)(Math.random()*(100) + 100);   //random number is defined in between 100 to 200 (inclusive)
			
               System.out.print("2nd Number: " + rand[x]);   //print to screen random number between 100 to 200
               System.out.println();   //print to screen blank line

        	//integers values defined		
          int num1 = user;   //defined num1 representing user input number (the first number)
		int num2 = rand[x];   //defined num2 representing random number (the second number)
		int sum = user + rand[x];   //addition
		int sub = user - rand[x];   //substraction
		int mul = user * rand[x];   //multiplication
		int div = user / rand[x];   //division
		
               System.out.println();   //print to screen blank line
               System.out.println(user + " + " + (rand[x] + " = " + sum));   //print to screen the addition result based on user input number against random number between 100 and 200
               System.out.println(user + " - " + (rand[x] + " = " + sub));   //print to screen the substraction result based on user input number against random number between 100 and 200
               System.out.println(user + " * " + (rand[x] + " = " + mul));   //print to screen the multiplication result based on user input number against random number between 100 and 200
               System.out.println(user + " / " + (rand[x] + " = " + div));   //print to screen the division result based on user input number against random number between 100 and 200
	 	}
	 }  //end of main
}  //end of class
