/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that Using a for, a while and a do-while loop write a program that prints to the screen the numbers from -3 to 3 in descending order
 */

 /* BSLab3b Class */
 class BSLab3b{

 	// Main Method
 	public static void main(String[] args){

          // print to screen For Loop title
          System.out.println("--- For Loop ---");
     
 	// for loop that print to screen the numbers from -3 to 3 in descending order
     for (int tres = 3; tres >= -3; tres--){
     	System.out.println(tres); 
     }
          // print blank line
     	System.out.println();
   	
 	     // print to screen While Loop title
          System.out.println("--- While Loop ---");
     
 	// for loop that print to screen the numbers from -3 to 3 in descending order
     int tres = 3;
     while (tres >= -3 ){
         	System.out.println(tres); 
     	tres--;
     }	

          // print blank line
          System.out.println();

          // print to screen Do While Loop title
          System.out.println("--- Do While Loop ---");
     
 	// for loop that print to screen the numbers from -3 to 3 in descending order
     tres = 3;
     do{

     	// print to screen -3 to 3 desscending order
     	System.out.println(tres);
     	tres--;
     }
     while (tres >= -2 );
       	System.out.println(tres); 
       
 	} //end of Main Method
 }/* end of class */
