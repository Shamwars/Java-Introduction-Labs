/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that creates an multidimensional array ( 5 x 5 ), populates the array using nested loops with letter from A until Y, and displays the array to the screen.
 */

 //class
 class BS8d{
 	//main method
 	public static void main(String[] args){

 		char x;
 		char y;

 		
 		char a[][] = new char[5][5];

 		for(x = 65; x < 90; x++){
 			for(y = 65; y < 90; y++){

 				System.out.print((char)a[x][y] + " " );
 			}
 			System.out.println();
 		}
 	}
 }



