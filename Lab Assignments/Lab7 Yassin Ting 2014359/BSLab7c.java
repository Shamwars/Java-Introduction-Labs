/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Java program which asks the user to enter five numbers.
 * The program should prevent the user from entering the same number more than once. It should also print to the screen the numbers already entered by the user.
 */

 //import Scanner from the package
 import java.util.Scanner;

 //class BSLab7c
 class BSLab7c{
 	//main method
 	public static void main(String[] args){

     //defined values for each varibales
     int[] list = new int[5];
     int ctr = 0;
     int num = 0;
     boolean pas = true;
 		
     Scanner inputUser = new Scanner(System.in);	    //Scanner declared
     
			System.out.println("List: ");                    //print to screen "List:"
			System.out.println();                            //print to screen blank line
	          System.out.print("Please, enter a number: ");    //print to screen "Please, enter a number:"   

	do{
     	pas = true;     //the value for the pas variable set to reset 

     	num = Integer.parseInt(inputUser.nextLine());     //the input from the user is set to used in the next line

     	//start a loop
     	for(int x = 0; x < 5; x++){
     		if(num == list[x] && x != ctr){      //checking the data by user to the list 
     			
     			System.out.println("Number is already in the list !!! Try again !!!");     //print to screen "Number is already in the list !!! Try again !!!" 
     			pas = false;     //this will stop the number to be use as it's already been used before
     		}
     		else if(pas ==true && x == 4){     //if the number has not been used, it will be added to the list
     			list[ctr] = num;              //number by user assigned to list
     			ctr++;
     		} 				
 		}
 			System.out.println();              //print to screen blank line
 			System.out.print("List: ");        //print to screen "List:"
			
			for(int x = 0; x < ctr; x++){      //end validating loop
							
				System.out.print(list[x] + " ");     //print the list of the number by user 
               }
			
			System.out.println();                         //print to screen blank line
			System.out.println();                         //print to screen blank line
	          System.out.print("Please, enter a number: "); //print to screen "Please, enter anumber:" 
 			 			
 		}while(ctr < 5);   //continuation defined to 5 times
  	}//end of main method
 }//end of class


	             
                 
         	           	

 		
 	

