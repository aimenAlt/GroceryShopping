package mainApp;

import java.util.Scanner;

public class CustomerSide {
	public int customerLoop() {
		int continueMode = 0;
		while (continueMode == 0) {
			println("what would you like to do:");
			println("1 - Add groceries");
			println("2 - Show Cart");
			println("3 - Remove groceries");
			println("4 - Change Item Quantities");
			println("0 - Exit Grocery");
			
			continueMode = getInput();
			
			if(continueMode == 1) {
				
			}
		}
		return continueMode;
	}
	
	public static void println (String out) {
		System.out.println(out);
	}
	
	@SuppressWarnings("finally")
	public static int getInput() {
		Scanner scanner = new Scanner(System.in);
		int finalInput = 0 - 1;
		try {
			int input = scanner.nextInt();
			finalInput = input;
		} catch (Exception e) {
			System.out.println("Please input a numerical value!");
		} finally {
			return finalInput;
		}
	}


}
