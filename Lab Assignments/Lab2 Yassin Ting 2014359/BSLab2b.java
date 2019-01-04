/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that using If-Else statements, write a program that displays a message based on the following conditions.
 */

 /* BSLab2b Class*/
class BSLab2b{
	
	// Main Method
	public static void main(String[] args){
	
	//Value of variable
	int varAge = 80;
	
	//Age is less or equal than 10
		if (varAge <=10){
			System.out.println("Age " + varAge + " is classified as Child");
		}
	//Age between 11 and 18 (inclusive)
		else if (varAge >=11 && varAge <=18){
			System.out.println("Age " + varAge + " is classified as Adolescent");
		}

	//Age between 19 and 60 (inclusive)
	     else if(varAge >=19 && varAge <=60){
			System.out.println("Age " + varAge + " is clasified as Adult");
		}

	//Age is greater or equal than 61
	     else if(varAge >=61){
	     	System.out.print("Age " + varAge + " is classified as Senior"); 
	     }
	
	}// end of Main Method
} /*end of Class*/