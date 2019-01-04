/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Write a program that creates, and stores 10 numbers. Each element of the array should be populated with a random number between 512 and 1,024 (inclusive).
 * The program should find the smallest and the biggest number in the list.
 */

 /* BSLab4d Class */
 class BSLab4d{

 	// Main Method
 	public static void main(String[] args){

 	//define value of variables
 	int[] axe = new int[10];
 	int smallest = 1024;     //value for the lowest number defined at the highest number as it will allow generate the value to smaller number. p/s; smallest number can't smaller than assigned.
     int largest = 512;       //value for the highest number defined at the lowest to allow generate the value to higher number as it can't get higher than assigned if we use highest value.
     int hloc = 0;     //loc is for biggest number position search in the random numbers appear on screen
     int lloc = 0;     //loc is for lowest number position search in the random numbers appear on screen
     
		for (int z = 0; z <=9 ; z++ ){

			//generate 10 random numbers from 512 to 1024
			axe[z] = (int)(Math.random()*(512) + 512);

			 //print to screen 10 random numbers between 512 and 1024			
			 System.out.print(axe[z] + " ");
                                      
                        if(axe[z] > largest)     //if the number is bigger than the largest number assigned ( which in this case the lowest number) look up for biggest number
                        {
                        largest = axe[z];
                        hloc = z;   
                        }
                        if (axe[z] < smallest)    //if the number is lower than the lowest number assigned (which in this case the biggest number) look up for the lowest number
                        {
                        smallest = axe[z];
                        lloc = z;
                        }
          }
                System.out.println();
                System.out.println();
                System.out.println("The smallest element is : " + smallest + " at position " + lloc);   //print to screen The smallest element and it's position in the random numbers on screen
                System.out.println();
                System.out.println("The biggest element is : " + largest + " at position " + hloc);     ////print to screen The biggest element and it's position in the random numbers on screen
   
 	 
 	}//end of Main Method
 }/* end of class */
