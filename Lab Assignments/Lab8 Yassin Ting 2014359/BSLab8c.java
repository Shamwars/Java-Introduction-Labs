/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that takes a String from user and converts it to numbers using the ASCII table. 
 * The conversion should happen in a different method, and the result should be returned to the main method, which receives and displays the converted message.
 * HINT: User chartAt( index ) within a loop ( index is the pointer ! )
 */

 import java.util.Scanner;

 class BSLab8c{
 	public static void main(String[] args){

 		Scanner inUser = new Scanner(System.in);

 		System.out.print("Please, enter a sentence: ");

 		int num = inUser.nextInt();

 		for ( int x = 65; x < 75; x++){
 			System.out.print((char)x + num + " ");
 		}
 		
 	}
 }
