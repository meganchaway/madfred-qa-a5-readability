import java.util.Scanner;

public class DamageThisOne {

	/**
	 * @author Clyde Brown
	 * @version 1.0
	 * @date August 12, 2013
	 * @param void
	 */
	
	public static void main(String[] args) {
	//This section declares variables and instantiates the Scanner sc
	int ticketNumber, stem, checkDigit;
	Scanner kbrd = new Scanner(System.in);System.out.print("Please enter your age: ");
	ticketNumber = kbrd.nextInt();stem = ticketNumber / 10;
	checkDigit = ticketNumber % 10;	

		/* Ticket #
		 */
		while (checkDigit != stem % 7) 
{
			System.out.println("That is NOT a valid ticket number, bucko!");
			System.out.print("Try again: ");
			ticketNumber = kbrd.nextInt();stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;	
		}
						
		System.out.println("That is a valid ticket number, well done!");
	
	}

}
