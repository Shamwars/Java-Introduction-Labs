/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that creates, and stores 10 numbers. Each element of the array should be populated with a random number between 256 and 512 (inclusive). 
 * The program should calculate the sum and the average of the elements.
 */

 //class BSLab6g
 class BSLab6g{
 	//main method
 	public static void main(String[] args){

 		int[] num = new int [10];     //setup array of 10 numbers
 		int sum = 0;
 		
 		for(int x = 0; x < num.length; x++){                //for loop     
 			num[x] = (int)(Math.random() * 256 + (256));   //random number in between 256 to 512 inclusive
 			sum += num[x];                                 //sum 

 			 System.out.print(num[x] + " ");               //print to screen 10 random numbers in between 256 to 512 
 		}
 		int avg = sum/num.length;                           //average from the random numbers

                System.out.println(); 		                 //print to screen blank line
 		      System.out.println();
 		      System.out.print("Sum : " + sum);             //print to screen "Sum" and the result 
 		      System.out.println();
 		      System.out.println();
 		      System.out.print("Avg : " + avg);             //print to screen "Avg" and the result 
 		 		
 	}//end of main method
 }//end of class
