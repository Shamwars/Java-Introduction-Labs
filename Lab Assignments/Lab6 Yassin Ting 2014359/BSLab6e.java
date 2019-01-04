/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that Using a while loop, write a Java program which displays the following pattern:
 * 50 49 48 47 46 45 44 43 42 41
 * 40 -- 38 37 36 35 34 33 32 31
 * 30 29 28 27 -- 25 24 23 22 21
 * 20 19 18 17 16 15 14 -- 12 11
 */

 //class BSLab6e
 class BSLab6e{
 	//main method
 	public static void main(String[] args){

 		int num = 50;                                    //integer num set to 50
 		 		
 		while (num > 10){                                //while loop (set num over 10 as the range of numbers start from 11)
 			
 			if(num % 13 == 0){                          //if num divisble by 13
 				System.out.print("--" + " ");          //print to screen the result of the number to a -- sign
 				num--;                                 //numbers shown in descending value
 			}
 			else{                                       //else
 				System.out.print(num + " ");           //print to screen the rest of the number between 11 to 50
 				num--;
 			}
 			if(num == 40 || num == 30 || num == 20){    //if (separate the number into section of 10, start with defined value of 40, 30 and 20)    
 				System.out.print("\n");	              //new line of numbers 
 			}
 		}	
 			    						
 	}//end of main method
 }//end of class
 