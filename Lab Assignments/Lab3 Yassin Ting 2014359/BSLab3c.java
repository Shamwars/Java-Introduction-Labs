/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that Using a do-while loop, write a program that prints the numbers from 3 to 13 and if the number is an odd or even number
 */

 /* BSLab3c Class*/
class BSLab3c{
	
	// Main Method
	public static void main(String[] args){

	// do-while loop to print number 3 to 13 
	int numb = 3;
     int odd = 0;
     int even = 0;
	
	do
	{
		//if the value 13%2 = 0 then odd
		if((numb % 2) == 0){   // divide by 2 to get the even and add value. Modulor

		// print to screen of even numbers	
		System.out.println(numb + " - Even ");
		numb++;
		even++;
		}
          // if the value 13%2 !== 0 then even
		
		else{

		// print to screen odd numbers
		System.out.println(numb + " - Odd ");
		numb++;
		odd++;
		}
	}
	while (numb <=13);	   // number 13 or lower

          // print blank line
		System.out.println();

		// print to screen the total of odd and even numbers
		System.out.println("Number of odd numbers : " + odd);
		System.out.println("Number of even numbers : " + even);

	   			
	} // end  of Main Method
} /* end of Class */
