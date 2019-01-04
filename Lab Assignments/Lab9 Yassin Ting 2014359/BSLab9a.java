/**
 * @student 2014359
 * @author Yassin Ting
 * 
 * Program that prints "Hello World" to the screen 5 times. The main method should contain a loop which iterates for 5 times and invoke a method call sayHello() each time.
 * The method sayHello() should only display the message to the screen.
 */

 //class BSlab9a
 class BSLab9a{
 	//main method
 	public static void main(String[] args){

 		int varX = 5;     //defined variable

 		for(int x = 0; x < 5; x++){     //start loop 
 		}

 		sayHello(varX);     //invoke method (5 times to bring to the screen 5 Hello World !!!)
 		sayHello(varX);
 		sayHello(varX);
 		sayHello(varX);
 		sayHello(varX);
  	}
 	public static void sayHello(int varX){     
 		
 			System.out.println("Hello World !!!");     //print to screen "Hello World !!!"
  	}//end of main method
 }//end of class
