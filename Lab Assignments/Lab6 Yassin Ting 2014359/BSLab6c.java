/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that prints the month of the year based on a number.
 * The program should validate the content of a variable and display the month of the year based on the value of the variable.
 */
 
//class BSLab6c
class BSLab6c{
	//main method
	public static void main(String[] args){

		int month = 4;     //value for integer month is pre-defined to 4

		if(month == 1){                                                        //start the if/ else if/ else statement to get defined the right result to be print out based on pre-defined integer month value.
			System.out.print("Month: " + month + " - " + "January");          //print to screen "Month: 1 - January"
		}
			else if(month == 2){                                              //else if 
				System.out.print("Month: " + month + " - " + "February");    //print to screen "Month: 2 - February"
			}
			else if(month == 3){                                              //else if
				System.out.print("Month: " + month + " - " + "March");       //print to screen "Month: 3 - March" 
			}
			else if(month == 4){                                              //else if 
				System.out.print("Month: " + month + " - " + "April");       //print to screen "Month: 4 - April"
			}
			else if(month == 5){                                              //else if
				System.out.print("Month: " + month + " - " + "May");         //print to screen "Month: 5 - May"
			}
			else  if(month == 6){                                             //else if
				System.out.print("Month: " + month + " - " + "June");        //print to screen "Month: 6 - June"
			}
			else if(month == 7){                                              //else if
				System.out.print("Month: " + month + " - " + "July");        //print to screen "Month: 7 - July"
			}
			else if(month == 8){                                              //else if  
				System.out.print("Month: " + month + " - " + "August");      //print to screen "Month: 8 - August"
			}
			else if(month == 9){                                              //else if
				System.out.print("Month: " + month + " - " + "September");   //print to screen "Month: 9 - September" 
			}
			else if(month == 10){                                             //else if
				System.out.print("Month: " + month + " - " + "October");     //print to screen "Month: 10 - October"
			}
			else if(month == 11){                                             //else if 
				System.out.print("Month: " + month + " - " + "November");    //print to screen "Month: 11 - November"
			}
			else if(month == 12){                                             //else if
				System.out.print("Month: " + month + " - " + "December");    //print to screen "Month: 12 - December"
			}
			else{                                                             //else 
				System.out.print("NOT A VALID MONTH");                       //print to screen "NOT A VALID MONTH" 
			}
	}//end of main method
}//end of class