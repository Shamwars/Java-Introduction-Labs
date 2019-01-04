/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program which generates ten unique numbers between 1 and 20 (inclusive) and store them in a list. 
 * Before storing the number in the list, the program should check whether the number is already in the list. 
 * If the number is in the list, the program should generate a new number and count how many times it needs to generate a new number.
 */

 //class BSLab7a
 class BSLab7a{
 	//main method
 	public static void main(String[] args){

           //defined values of integers 
 		 int [] num = new int [10];
 		 int conflix = 0;
 		 int count = 0;
 		 int chk = 0;

 		     System.out.print("List : ");     //print to screen "List:"

 		for( int x = 0; x < num.length; x++ ){      // start loop for random numbers
 			 			
 			num[x] = (int)(Math.random() * 20 + 1);  //random number define within range 1-20 (inclusive)
 		}
 		while(count < num.length){
 			chk = num[count];//element to check the variables in the list of the number
 			
 			for(int x = 0; x < num.length; x++){
 				if(chk == num[x] && count != x){     //to check if the element is repeat or not in the list
 				num[x] = (int)(Math.random() * 20 + 1);
 				conflix++;         //the conflict counts
 				}
 			}
 			count++;
 		}
 		for(int x = 0; x < 10; x++){
 			System.out.print(num[x] + " ");//print to screen the list of random numbers
 		}
          System.out.println();     //print to screen blank line
 		System.out.println("# of conflicts: " + conflix);//print to screen the number of conflicts.
     } //end of main
 }  //end of class
