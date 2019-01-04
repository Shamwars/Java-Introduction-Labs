/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Guessing game of numbers between 1 and 10 (inclusive)
 * Write a Java program which:
 * - Displays a random number in the range above
 * - Asks the user if the next number will be (H) higher or (L)lower than the number displayed
 * - Generates a new random number (next)
 * - If the guess is right, 1 point is added to the score
 * - If the guess is wrong, 1 point is taken from the score
 * - If the guess is the same, no point is added or taken
 * - User start with 10 points
 * - Game ends when score is zero point
 * - Game continues while score is greater than zero
 */

 //import Scanner from package
 import java.util.Scanner;
//class BSLab7d
 class BSLab7d{
	//main method
 	public static void main(String[] args){

 		Scanner user = new Scanner(System.in);     //Scanner declared

 		//defined value for each varibales		
 		String plyr;
 		int sco = 10; 
 		int ron1 = 0; 
 		int ron2 = 0;
 		boolean start = true;
 		ron1 = ron2;
 		 		 		
 		while(sco > 0){     //start loop,sco 0 means the games continue till the scores is zero
 			
 			System.out.println("Your score is " + sco);     //print to screen "Your score is: and the player scores

 			if(start == true){                    
 				ron1 = (int)(Math.random()*10);     //random number
 			}
 			
 			System.out.println("Current number is " + ron1);
 			System.out.println("Will the next number be <H>igher or <L>ower");
 			
 			
 			ron2 = (int)(Math.random()*10);

 			plyr = user.next();

               //if Higher
 			if(ron2 > ron1){
 				sco++;
 				System.out.println("Win");
 			}
			else if(ron2 == ron1){
				System.out.println("Draw");
			}
			else{
				System.out.println("Lose");
				sco--;
			}
			//if Lower
			if(ron2 < ron1){
				sco++;
				System.out.println("Win");
			}
			else if(ron2 == ron1){
				System.out.println("Draw");
			}
			else{
				System.out.println("Lose");
				sco--;
			}
			
		}

 			//Set start round variable to false.
 			start = false;
 			
 			 		
 	}//end of main method
 }//end of class

//**************************************** NOTE :I didn't get this program to work !!!!***********************************//
 