/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that displays the result of all times tables from 1 and 10.
 * NOTE: You do not need to store the result in an array
 */

 //class BSLab8b
 class BSLab8b{
 	//main method
 	public static void main(String[] args){

 		int[][] mult = new int[11][11];     //setting up the multidimentional array 

 		for(int x = 1; x < 11; x++){       //outer loop defined
 			for(int y = 1; y < 11; y++){  //inner loop
 				mult[x][y] = x * y;
		     }    
		}
		for(int x = 1; x < 11; x++){
			for(int y = 1; y < 11; y++){
				System.out.print(mult[x][y] + "");    //print to screen the result of the times table
				System.out.print("\t");     //the tab to allign the numbers
			}
				System.out.println(); 
		}
     }//end of main method
 }//end of class

 