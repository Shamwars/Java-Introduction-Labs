/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that defines two integer variables (varBase & varHeight) and based on designated values to calculate the area of a troangle based on the formula given.
 * The formula for triangle is area = Base * Height / 2
 */
 
//class BSLab6b
class BSLab6b{
	//main method
	public static void main(String[] args){

		int varBase = 8;     //defined integer value for Base
		int varHeight = 4;   //defined integer value for Height
          int area = 0;
		area = (varBase * varHeight) / 2;      //formula for calculate area is Base x Height / by 2.

		System.out.println("Base.. : " + varBase);                 //print to screen "Base :" and it's value pre-defined
		System.out.println("Height : " + varHeight);               //print to screen "Height :"and it's value pre-defined
		System.out.println();                                      //print to screen blank line
          System.out.println("Area of the triangle is: " + area);    //print to screen "Area of the triangle is :" and the result
				
	}//end of main method
}//end of class
