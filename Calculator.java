import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
/**@author Juan Mendez
/*@public class for calculator*/
public class Calculator {

	

	/**@param main statement*/
	public static void main(String[] args) {

		
		/**@param scanner to read user input */
		Scanner myScanner = new Scanner(System.in);
		/**@param boolean to loop the application and keep it running*/
		boolean continueLoop = true;

		/**@param if statement to begin program and dictates what code to run first */
		try {
			
			double result = 0;
						
			/*print line welcoming user to calculator */
			System.out.print("Welcome to my Calculator! Lets Begin!" + "\n");
			/*print line asking user to either type HELP or START to begin */
			System.out.print("Type HELP or START to begin: ");
			/**@param string to read user input for HELP or START command */
			String firstCommand = myScanner.nextLine();
			/**@param if statement that asks and makes decision based on user input START or HELP*/
			if (firstCommand.equals("HELP")) {
				System.out.println("Welcome to my calculator. Make sure to enter only numbers into the first two fields. \nDo NOT divide by 0. \nBe sure to enter the number matching your desired operation.");
				System.out.print("Type HELP or START to begin: ");
				firstCommand = myScanner.nextLine();
			}else {
				
			if(firstCommand.equals("START")) {
			
			/*print statement asking user for first number input */
			System.out.println("Please Enter your First Number: ");
			Double firstNumber = Double.parseDouble(myScanner.nextLine());			
		
			//firstCommand = myScanner.nextLine();
			
			/*@print statement asking user for second number input */	
			System.out.println("Please Enter your Second Number: ");
			/**@param converts string into double*/
			Double secondNumber = Double.parseDouble(myScanner.nextLine());
							
			/*Print statements with instructions on what commands to put in and where to put in.*/
			System.out.print("\n1: Add. \n2: Sub. \n3: Mult. \n4: Divide. \n5: Modulo. \n6: Pi \n7: Pow.");
			System.out.print("\nEnter your operator: ");
			
			firstCommand = myScanner.nextLine();
			
			switch(firstCommand) {
			/*@returns addition of firstNumber and secondNumber */
			case "1":
				result = (firstNumber+secondNumber); break;
			/*@returns subtraction of firstNumber and secondNumber */
			case "2":
				result = (firstNumber-secondNumber); break;
			/*@returns multiplication of firstNumber and secondNumber */
			case "3":
				result = (firstNumber*secondNumber); break;
			/*@returns division of firstNumber and secondNumber */
			case "4":
				result = (firstNumber/secondNumber); break;
			/*@returns modulo of firstNumber and secondNumber */
			case "5":
				result = (firstNumber%secondNumber); break;
			/*@returns Math.PI */
			case "6":
				result = (Math.PI);
			/*@returns power of firstNumber to the second number secondNumber*/
			case "7":
				//result = (Math.pow(x, y));
			}
			//if(command >= 1 && command <= 5)
				System.out.println("Your answer is: " + result);

			
			}	
			}
		/**@param throws exception if anything other than a number is typed in by user */	
		/*catch exception if anything other than number is keyed in*/
		} catch (InputMismatchException inputMismatchException) {
			/*@error statement printed*/
			System.err.printf("%nException: %s%n", inputMismatchException);
			/*@statement for scanner to read the next line*/
			myScanner.nextLine(); // discard input, so user can try again
			/*@print statement letting user know to try again*/
			System.out.printf("You must enter integers. Please try again %n%n");

		}
			/**@param throws exception if zero is keyed in as denominator
			/*exception if zero is keyed in as the denominator in division since you cannot divide by zero*/
		catch (ArithmeticException arithmeticException) {
			/*error statement printed*/
			System.err.printf("%nException: %s%n", arithmeticException);
			/*print statement letting user that 0 is not valid and to please try again
			not able to get the loop to go back and restart*/
			System.out.printf("Zero is an invalid denominator.Please try again. %n %n");
		}
		/**@param finally statement closes scanner*/
		finally {
			myScanner.close();
		} while(continueLoop);

	} 


	
}
