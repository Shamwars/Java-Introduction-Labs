/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Write a program that uses an array to store the following data: “I”, “Love”, “Java”, “Classes”
 */

 /* BSLab4a Class */
 class BSLab4a{

 	// Main Method
 	public static void main(String[] args){

     //define and populate an array
     String[] gila = {"I", "Love", "Java", "Classes"};

     //print to screen index of I Love Java Classess
     for(int z=0; z<gila.length; z++){
     System.out.println("Index " + z + ": " + gila[z]);
     }

     //print to screen a blank line
     System.out.println();

     //define value for string gila
     gila[0] = "I";
     gila[1] = "Love";
     gila[2] = "Java";
     gila[3] = "Classess";

     //print to screen "I Love Java Classess"
     System.out.println(gila[0] + " " + gila[1] + " " + gila[2] + " " + gila[3] + " ");
  				
 	} //end of Main Method
 }/* end of class */
