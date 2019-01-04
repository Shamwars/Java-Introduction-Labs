/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that displays the name of a season based on a month.
 */

//class BSLab6d
 class BSLab6d{
 	//main method
 	public static void main(String[] args){

 		int month = 8;                                   //integer value for month is pre-defined
 		
 		if(month == 12 || month <= 2){                   //if (month equal to 12 or month below or equal to 2
 			System.out.print("Season: Summer");         //print to screen "Season: Summer"
 		}
 		else if(month >= 3 && month <= 5){               //else if (month is over or equal to 3 and month below orequal to 5  
 			System.out.print("Season: Autumn");         //print to screen "Season: Autumn"
 		}
 		else if(month >= 6 && month <= 8){               //else if (month is over or equal to 6 and month is below or equal to 8
 			System.out.print("Season: Winter");         //print to screen "Season: Winter"
 		}
 		else if(month >= 9 && month <= 11){              //else if (month is over or equal to 9 and month is below or equal to 11
 			System.out.print("Season: Spring");         //print to screen "Season: Spring"
 		}
 		else{                                            //else
 			System.out.print("NOT A VALID MONTH");      //print to screen "NOT A VALID MONTH"  
 		}
 	}//end of main method
 }//end of class
