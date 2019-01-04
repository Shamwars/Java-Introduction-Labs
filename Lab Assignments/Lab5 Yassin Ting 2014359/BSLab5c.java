/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that creates and stores 10 random numbers between 10 and 20 ( 10 and 20 inclusive ) in an array and displays it to the screen. 
 * Using a BufferedReader, your program should ask the user for a number and it should perform a linear search in the array.
 */

//tell the compiler to include the standard input and output classes such as BufferedReade, IOEception and InputStreamReader. Alternative can import java.* for the whole package.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//class BSLab5c
class BSLab5c{

	//main
	public static void main(String[] args)throws IOException{   //throws IOException used as I need to parseInt the String

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Index : ");   //print to screen Index of numbers 0 to 9

		for (int z = 0; z < 10; z++){
			System.out.print(z + " ");
		}

		
		System.out.println();   //print to screen blank line
          System.out.print("List. : ");   //print to screen "List.:"
                   
          int[] num = new int[10];   
                                    
		for (int x = 0; x < 10 ; x++ ){    //defined values for random numbers

			num[x] = (int)(Math.random()*(10) + 10);    //creating random numbers between 10 to 20
			
               System.out.print(num[x] + " ");   //print to screen random numbers in between (10 to 20 (inclusive))
		}
               System.out.println();   //print to screen blank line
               System.out.println();   //print to screen blank line
            
          for (int x = 0; x <= 9 ; x++ ){   //defined the rows of random number
          	int pos = 0;    //defined positioning
          	pos = num[x];

               System.out.print("Please enter a number : ");   //print to screen instruction for user input desired number

          //try and catch for data given     	       	
          try{      
                              
               num[x]=Integer.parseInt(br.readLine());
          }
          catch (IOException e){
          	System.out.print("Number NOT Found in the list");
          }
               System.out.print("BINGO !!! Number " + num + "found at position " + pos);    			
          }
	}//end of main        
}//end of class

/***** NOTE ! ***** I can't seems to work this Lab5c successfully. Should I use try and catch or using some kind of loops ?*****
 *  Will leave it the way I had so far as the process of understanding of the program will get better by doing mistake and many trial and error. 
 */
