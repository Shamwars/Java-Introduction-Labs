package Lab8;
/*
 * @Student: 2014387
 * @Author: Michael O'Connor
 * 
 * Program will take a string from the user and print it back out in a numerical form using the ASCII table.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

class BSL8c
{
	//Start of main method
	public static void main(String[] args)
	{
		//Declare scanner and variables.
		Scanner ui = new Scanner(System.in);
		String userin = "";
		int x = 0;
		//Try catch block to validate user input.
		try
		{
			//Prompt user to input data.
			System.out.print("Please enter a line of text: ");
			//Assign input to a variable.
			userin = ui.nextLine();
		}
		catch(InputMismatchException ex)
		{
			//Error message to print if exception is caught.
			System.out.println("Invalid input: " + ex);
		}
		//While loop will run the length of the string and convert to ascii values.
		while(x < userin.length())
		{
			System.out.print((int)(userin.charAt(x)) + " ");
			x++;
		}
		//Close scanner to prevent resource leak.
		ui.close();
	}
}