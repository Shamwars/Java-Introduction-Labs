/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that Write a program that displays a message based on the various conditions given.

 /* BSLab2c Class*/
class BSLab2c{
	
	// Main Method
	public static void main(String[] args){
	
	//Create two integer variables called varModule1 and varModule2.
	int varModule1 = 20; 
	int varModule2 = 40;
	System.out.println("Module 1 :" + varModule1);
	System.out.println("Module 2 :" + varModule2);

	//blank
	System.out.println();
	
	//varModule1 >= 40 AND varModule2 >= 40
		if (varModule1 >=40 && varModule2 >=40){
			System.out.println("Status : Pass");
		}
	//varModule1 >= 40 AND varModule2 < 40
		else if (varModule1 >=40 && varModule2 <40){
			System.out.println("Status : Repeat Module 2");
		}

	//varModule1 < 40 AND varModule2 >= 40
	     else if(varModule1 <40 && varModule2 >=40){
			System.out.println("Status : Repeat Module 1");
		}

	//varModule1 < 40 AND varModule2 < 40
	     else if(varModule1 <40 && varModule2 <40){
	     	System.out.print("Status : Fail"); 
	     }
	
	}// end of Main Method
} /*end of Class*/