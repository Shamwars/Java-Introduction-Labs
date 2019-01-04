/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Write a program that uses an array to store 10 numbers. The numbers should be randomly generated ( Math.random() ), and they should be between 1 and 100 ( 1 and 100 inclusive ).
 */

 /* BSLab4b Class */
 class BSLab4b{

 	// Main Method
 	public static void main(String[] args){

 		int [] num = new int [11];
 		int odd = 0;
 		int even = 0;
 		 	
           // start loop for random numbers
 		for( int x = 1; x < num.length; x++ ){

 			num[x] = (int)(Math.random() * 100);  //random number define within range 1-100
 		     if(num[x] % 2 == 0){     //define the even value by divide by 2
 		     	
 		System.out.println("Element " + x + " = " + num[x] + " (Even)" );     //print to screen Element of even numbers
          even++;
 		     }
 		else{
 			System.out.println("Element " + x + " = " + num[x] + " (Odd)" );     //print to scree Element of oddnumbers
 			odd++;;
 			}
 		}
 	      System.out.println();
 	      System.out.println("Number of odd numbers. : " + odd);     //print to screen numbers of odd number appeared randomly on screen
 	      System.out.println("Number of even numbers : " + even);   //print to screen numbers of even number appeared randomly on screen 
         
 	}//end of Main Method
 }/* end of class */
