/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that that prints the result of a simple calculation of two numbers to the screen ( addition, subtraction, multiplication & division ).
 */

 /* BSLab1d Class*/
class BSLab1d{
	// Main Method
	public static void main(String[] args){
		//numbers in int
		int num1 = 4;
		int num2 = 2;
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		//source number screen print
		System.out.println("First Number:" + num1);
		System.out.println("Second Number:" + num2); 
		//blank 
		System.out.println();
		//addition screen print
		System.out.println(+ num1 + " + " + num2 + " = " + sum);
		//substraction screen print
		System.out.println(+ num1 + " - " + num2 + " = " + sub);
		//multiplication screen print
		System.out.println(+ num1 + " * " + num2 + " = " + mul);
		//division screen print
		System.out.println(+ num1 + " / " + num2 + " = " + div);
				
	} // end  of Main Method
} /* end of Class */
