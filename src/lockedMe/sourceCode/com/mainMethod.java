package lockedMe.sourceCode.com;

import java.util.Scanner;

public class mainMethod {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		fileOperations.createMainFolderIfNotPresent("main");

		homeMenu.printHomescreen();

		handleWelcomeScreenInput();
		fileHandler.handleWelcomeScreenInput();
	}

	private static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		homeMenu.printMenuoptions();
		
		do {
			
			try {int input = sc.nextInt();	
				switch (input) {
				case 1:
					fileOperations.displayfiles("main");
					break;
				case 2:
//					homeMenu.innerOperationMenu();
					fileHandler.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}

}