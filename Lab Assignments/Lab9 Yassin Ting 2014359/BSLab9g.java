/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program which:
 * 1. Generates a list with 10 random numbers between 1 and 50
 * 2. Displays the list
 * The program should have two methods:
 * populateArray() – Method that generates a list of 10 random numbers and return the list to the main method.
 * displayArray() – Method that received the populated array as a parameter and displays to the screen all the elements of it.
 */

 //class BSLab9g
 class BSLab9g{
 	//main method
 	public static void main(String[] args){

 		int[] num = new int[10];    //defined array 

 		num = populateArray(num);   //populate the variable array

 		displayArray(num);    //invoke method
 	}

 	public static int [] populateArray( int[] myArray ){

 		for ( int x = 0; x < myArray.length ; x++ ){      //start for loop 
			myArray[x] = (int)(Math.random() * 50) + 1;
 		}
 		return myArray;
 	}

 	public static void displayArray(int [] myArray){

 		System.out.print("List: ");     //print to screen "List:"
		for ( int x = 0; x < myArray.length ; x++ ){     //start for loop 
			System.out.print( myArray[x] + " ");      //print to screen the result of the random numbers
		}
		System.out.println();     //print to screen blank line
 	}//end of main method
 }//end of class
