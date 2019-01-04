/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that Using while loop, write a program that outputs the sequence below
 */

 /* BSLab3d Class*/
class BSLab3d{
	
	// Main Method
	public static void main(String[] args){

          int numb = 1;    //int for number start from 1
          String bintang = "*";    //using bintang as String with asterix sign
         
          while(numb<10){     //number less than 10

          	//print to the screen of the loop output for number 1 to 9 and accumulative stars           		
               System.out.println(numb + " - " + bintang);    

          	bintang = bintang + "*";     //acknowledge * represent bintang(star)
		     numb++;     //given instruction for number accending.
          	
          	}	
	} // end  of Main Method
} /* end of Class */