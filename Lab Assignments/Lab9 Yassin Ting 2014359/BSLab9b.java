/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program which invokes two methods:
 * printOdds() – Method which prints odd numbers between 1 and 20
 * printEvens() – Method which prints even numbers between 1 and 20
 * NOTE: The methods should use a loop to print the numbers
 */

 //class BSLab9b
 class BSLab9b{
 	//main method
 	public static void main(String[] args){

 		System.out.print("Odd Numbers .: " );     //print to screen "Odd Numbers "
 		printOdds();                              //invoke method
 		System.out.println();                     //print to screen blank line
 		
 	     System.out.print("Even Numbers : ");      //print to screen "Even Numbers "
 	     printEvens();                             //invoke method
 	}

 	public static void printOdds(){
 		for (int x = 1; x < 21; x++){             //start for loop for number between 1 - 20
 			while(x % 2 == 1){                   //while loop (for odd numbers)
 				System.out.print(x + " ");      //print to screen the odd numbers
 				x++;
 			}
 		}
 	}
 	 	
 	public static void printEvens(){
 		for(int y = 1; y < 21; y++){              //start for loop for number between 1 to 20
 			while(y % 2 == 0){                   //while loop (for even numbers)
 				System.out.print(y + " ");      //print to screen the even numbers
 				y++;
 			}
 		}	
 	}//end of main method
 }//end of class
 

