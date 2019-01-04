/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Write a program that creates and stores 10 numbers. Each element of the array should be populated with a random number between 0 and 100. 
 * The program should perform a linear search to find the first occurrence of the number 0 ( Zero ) in the array from the left to the right.
 */

 /* BSLab4c Class */
 class BSLab4c{

 	// Main Method
 	public static void main(String[] args){
 		
    	//define value of variables
    	int[] sham = new int[10];
    	boolean z = false;     //boolean used to get the value of true/false for detecting ZERO in the range of random numbers on screen
    	int loc = 0;      //loc for position search
     	
 	//random numbers from 0 to 100
 	for(int s = 0; s <= 9; s++){
 		sham[s] = (int)(Math.random() * 100);
 	 		
     if(sham[s] == 0 && z == false){      //
     	z = true;
     	loc = s;
     }
          System.out.print(sham[s] + " ");    //print to screen 10 random numbers between o to 100
 	}
      	
 		System.out.println();
 		System.out.println();
	if (z == true)
	{
	     System.out.println("Zero was found at position " + loc + " " + "in the list");     //print to screen if the ZERO is found and it's position in the random numbers appears
	}
 	else{
 		System.out.println("Zero was not found in the list");    //print to screen that there's no ZERO number is found on the random numbers appears
 		}
 	}//end of Main Method
 }/* end of class */
