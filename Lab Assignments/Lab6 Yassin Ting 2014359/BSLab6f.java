/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that Using only one for loop, write a Java program which counts how many numbers are divisible by 10, 11, 12, 13, 14 and 15 between 10 and 500, 
 * and displays the result to the screen.
 */

 //class BSLab6f
 class BSLab6f{
 	//main method
 	public static void main(String[] args){

          //defined the integers with each unique name.
 		int n10 = 0;      
 		int n11 = 0;
 		int n12 = 0;
 		int n13 = 0;
 		int n14 = 0;
 		int n15 = 0;

 		for(int x = 10; x < 501; x++){     //for loop for number in between 10 and 500 inclusive
 		
 		if(x % 10 == 0){                   //if (numbers that divisible by 10
 		n10++;                   
 		}
 		if(x % 11 == 0){                   //if (numbers that divisible by 11
 		n11++;
 		}
 		if(x % 12 == 0){                   //if (numbers that divisible by 12
 		n12++;
 		}
 		if(x % 13 == 0){                   //if (numbers that divisible by 13 
 		n13++;
 		}
 		if(x % 14 == 0){                   //if (numbers that divisible by 14
 		n14++;
 		}
 		if(x % 15 == 0){                   //if (numbers that divisible by 15
 		n15++;
 		}
 		}
 		     System.out.println("Divisible by 10: " + n10);     //print to screen "Divisible by 10: and the result
 		     System.out.println("Divisible by 11: " + n11);     //print to screen "Divisible by 11: and the result 
 			System.out.println("Divisible by 12: " + n12);     //print to screen "Divisible by 12: and the result 
 			System.out.println("Divisible by 13: " + n13);     //print to screen "Divisible by 13: and the result
 			System.out.println("Divisible by 14: " + n14);     //print to screen "Divisible by 14: and the result
 			System.out.println("Divisible by 15: " + n15);     //print to screen "Divisible by 15: and the result
 		 		
 	}//end of main method
 }//end of class
