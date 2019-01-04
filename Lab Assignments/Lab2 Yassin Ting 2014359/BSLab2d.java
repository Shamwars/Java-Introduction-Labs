/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that prints a message to the screen based on the following rules given. (*Boolean*, true or false)
 * 
  */
 /* BSLab2d Class*/
class BSLab2d{
	
	// Main Method
	public static void main(String[] args){
	
	//boolean variables
	boolean varWeather = false;     //True = Good Weather, False = Bad Weather 
	boolean varWeekend = false;     //True = It's Weekend, False = It'snot Weekend
	boolean varTemp = true;        //True = It's Hot, False = It's not hot
	
	//If the weather is bad, it is not weekend and it is hot then
		if ((varWeather==false) && (varWeekend==false) && (varTemp==true)){
			System.out.println("Tip of the day : Good enough to walk to work");
		}
	
	//Else If the weather is bad, it is not weekend and it is not hot then
		else if ((varWeather==false) && (varWeekend==false) && (varTemp==false)){
			System.out.println("Tipof the day : Better get a taxi");
		}

	//Else if the weather is good, it is weekend and it is not hot then
	     else if((varWeather==true) && (varWeekend==true) && (varTemp==false)){
			System.out.println("Tip of the day : Better stay in bed");
		}

	//Else if the weather is good, it is weekend and it is hot then
	     else if((varWeather==true) && (varWeekend==true) && (varTemp==false)){
	     	System.out.println("Tipof the day : Go to a park"); 
	     }

	//Else 
	     else
	          System.out.print("Tip of the day : Do not know what to do !");
	
	}// end of Main Method
} /*end of Class*/