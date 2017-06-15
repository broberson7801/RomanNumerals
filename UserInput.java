package labs;

import java.util.Scanner;

public class UserInput {

	static RomanNumeralTranslator something = new RomanNumeralTranslator();

	public String userPutStuffIn() {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number between one and ten: ");
		String number = input.next();
	

		something.parseInput(number);
		System.out.println();

		System.out.println("Please enter a number between 1 and 100: ");
		number = input.next();

		something.parseInput(number);
		System.out.println();
		
		
		System.out.println("Please enter a number between 1 and 1000: ");
		number = input.next();

		something.parseInput(number);
		System.out.println();
		
		System.out.println("Please enter a number over 1,000,000: ");
		number = input.next();
		
		something.parseInput(number);

		input.close();
		return number;
	}

}
