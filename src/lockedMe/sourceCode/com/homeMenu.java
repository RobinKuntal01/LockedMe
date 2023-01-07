package lockedMe.sourceCode.com;

public class homeMenu {

  public static void printHomescreen() {


	String welCome = "*************Weclome to LockedMe*****************\n" +
	"**********This Program was created by Robin Singh Kuntal************\n";
	
	String functionalities = ("// Use this Program to Retreive your files\n" 
			+ "// And also to Add, Delete or Search for a file");
	
	System.out.print(welCome);
	System.out.print(functionalities);
		

    }

  public static void printMenuoptions() {
	
	  String menu = "\n\n****** Please select the action you want to perform from below ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);	
	
  }

  public static void innerOperationMenu() {
	  
	  
	  String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
  }
  
  
  

}


