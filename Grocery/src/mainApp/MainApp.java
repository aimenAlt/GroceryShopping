package mainApp;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		String continueRunning = "y";
		while(continueRunning == "y") {
			 
			int userMode = 0;
			println("Welcome to Walmart Grocery Shopping!");
			println("please choose one of the following options: (input option number)");
			println("1-Manager Login");
			println("2-Customer Login");
			println("3-Continue as guest");
			println("0-To Quit");
			
			userMode = getInput();
			
			while(userMode > 0) {
				String continueMode = "y";
				if(userMode == 1) {
					
				} else if(userMode == 2) {
					
				} else if(userMode == 3) {
					while(continueMode == "y") {
						
					}
				} else {
					System.exit(0);
				}
 			}
			
			
		}

		
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
