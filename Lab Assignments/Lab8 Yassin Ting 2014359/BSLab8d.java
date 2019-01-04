/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that creates an multidimensional array ( 5 x 5 ), populates the array using nested loops with letter from A until Y, and displays the array to the screen.
 */

 //class BSLab8d
 class BSLab8d{
 	//main method
 	public static void main(String[] args){

          //defined variables
 		char x;
 		char y;
 		
 		char a[][] = new char[5][5];   //seteing up the multidimentional array

 		for(x = 65; x < 92; x++){        //outer loop. number used based on the letter number on Ascii table
 			for(y = 65; y < 92; y++){   //inner loop

 				System.out.print((char)a[x-65][y-65]+ " " );     //print to screen the letter from A to Y in a multidimentional array
 			}
 			System.out.println();
 		}
 	}//end of main method
 }//end of class

//***********************************************THIS PROGRAM IS NOT WORKING !!!!!************************************************************    



