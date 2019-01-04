/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program which:
 * 1. Defines two variables, populates them with random numbers between 1 and 50, and displays them to the screen;
 * 2. Defines a list of five numbers, populates them with random numbers between 1 and 50, and displays them to the screen;
 * 3. Displays a message to the screen based on the following rules:
 * If both numbers are in the list then displays:
 * “You won the lottery !”.
 * Else If only one number is in the list then displays:
 * “Nearly there !”.
 * Otherwise, displays:
 * “Sorry, try again !”.
 */

 //class BSLab6h
 class BSLab6h{
 	//main method
 	public static void main(String[] args){

          int num1 = (int)(Math.random() * 50 + 1);     //random number for the first number
          int num2 = (int)(Math.random() * 50 + 1);     //random number forthe second number
          boolean match1 = false;     //false value chosed to define the num1 
          boolean match2 = false;     //false value chosed to define the num2
          
               System.out.println("1st Number: " + num1);     //print to screen the random first number
               System.out.println("2nd Nunber: " + num2);     //print to screen the random second number
               System.out.println();     //print to screen the blank line
               System.out.print("List..: ");     //print to screen "List..:"
          
          int[] randlist = new int [5];     //setup integer for array of 5 numbers

 		for(int z = 0; z < randlist.length; z++){             //setup for loop of the random number list
 			randlist[z] = (int)(Math.random() * 50 + 1);     //random number between 1 to 50. "+ 1" indicate the lowest value added by 1 to avoid the number "0" is included.
 			      
 			System.out.print(randlist[z] + " ");     //print to screen list of 5 random number from 1 to 50 (inclusive)

 			if(num1 == randlist[z] && match1 == false){     //defined the first number to be detected on the list of random number to "true" if the number match or the same
 				match1 = true;
 			}
 			if(num2 == randlist[z] && match2 == false){     //defined the second number to be detected on the list of random number to "true" if the number match or the same
 				match2 = true;
 			}
          }       	
 		     System.out.println();	                       //print ot screen the blank line 
 		     System.out.println();                           //print to screen the blank line
 		if(match1 == true && match2 == true){                //if (defined the boolean value to true)
 			System.out.print("You won the lottery !");      //print to screen "You won a lottery !"
 		}
 		else if(match1 == true || match2 == true){           //else if (defined boolean value to true)
 			System.out.print("Nearly there !");             //print to screen "Nearly there !"
 		}
 		else{                                                //else 
 			System.out.print("Sorry, try again !");         //print to screen "Sorry, try again !"   
 		}
 	}//end of main method
 }//end of class




/////////////////////////***********************NOTE************************************////////////////////////////////////////////////////////////////////
//******Below was the first method I wrote the program and a bit messy. After getting an advice from colleague Michael O'Connor, I get and idea and re-wrote the program at it's simplesity and effective.
//
//class BSLab6h
//  class BSLab6h{
// 	   main method
//  	  public static void main(String[] args){
//
//            int[] lotto1 = new int [1];
// 		  int[] lotto2 = new int [1];
// 		 		 		
// 		//for(int x = 0; x < (lotto1.length); x++){
// 			lotto1[x] = (int)(Math.random() * 51);
// 			lotto1[x]++;
//
// 			System.out.println("1st Number : " + lotto1[x]);
//		}
// 		for(int y = 0; y < (lotto2.length); y++){
// 			lotto2[y] = (int)(Math.random() * 51);
// 			lotto2[y]++;
// 			
// 			System.out.println("2nd Number : " + lotto2[y]);
// 		}
// 		     System.out.println();
// 		int[] randlist = new int [5];
//
// 		     System.out.print("List..: ");
//
//          
// 		for(int z = 0; z < randlist.length; z++){
// 			randlist[z] = (int)(Math.random() * 51);
// 			randlist[z]++;
//
// 			System.out.print(randlist[z] + " ");
//
// 		 		         		
// 		if(lotto1[x] == randlist.length && lotto2[y] == randlist.length){
// 			System.out.print("You won the lottery !");
// 		}
// 		
// 		else if(lotto1[x] == randlist.length || lotto2[y] == randlist.length){
// 			System.out.print("Nearly there !");
// 		}
// 		
// 		else{
// 			System.out.print("Sorry, try again !");
// 		}
// 		}
// 	}//end of main method
// }//end of class

