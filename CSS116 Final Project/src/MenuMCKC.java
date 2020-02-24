import java.util.Scanner;
import java.io.*;
public class MenuMCKC //This class provides a user interface for the user to use the program.
{
	public static void menu (DrinkArrayMCKC drink) //The first menu is the welcome screen. 
	//It also has a parameter to pass the drink object array from the DataHAndlingMCKC class file to the entire menu class.
	{
		Scanner userInput = new Scanner(System.in);
		//testPlan(drink); //This just runs the test plan method.
		boolean mainLoop = true;
		while(mainLoop) {
			System.out.println("Welcome to the IIT Special Vending Machine!");
		    System.out.println("Enter 'begin' to proceed to next step, 'back' to return to the previous menu or enter 'quit' to exit the program at any time");
			String userInputMain = userInput.nextLine();
			if(userInputMain.toLowerCase().equals("begin"))
			{
				subMenu(drink);
			}
			else if(userInputMain.toLowerCase().equals("quit"))
			{
					System.out.println("Program is closing. Bye!");
					return;
			}
			else //error checking: this will keep asking user to enter a correct input.
			{
				System.out.println("Please enter in a valid response!" + "\n");
			}
		}
		userInput.close();
		}
	
	public static void subMenu(DrinkArrayMCKC drink)// This is the actual menu allowing the user to access the methods
	{
		String userSubMenuInput;
		boolean menuLoop = true;
		Scanner subMenuInput = new Scanner(System.in);
		
		System.out.println("subMenu() was called");
		
		while(menuLoop)
		{
			System.out.println("\n" + "What do you want to do?");
			System.out.println("Enter '1' to display all drinks");
			System.out.println("Enter '2' to add a drink");
			System.out.println("Enter '3' to delete a drink");
			System.out.println("Enter '4' to search for a specific drink");
			userSubMenuInput = subMenuInput.nextLine();
			
			try { // try block will check if user input is an int or string
				int userSubMenuInputChoice = Integer.parseInt(userSubMenuInput); //program will parse the string for a valid int
				if(userSubMenuInputChoice == 1)
				{
					displayAll(drink);
				}
				else if(userSubMenuInputChoice ==2)
				{
					addDrink(drink);
				}
				else if(userSubMenuInputChoice ==3)
				{
					deleteDrink(drink);
				}
				else if(userSubMenuInputChoice ==4)
				{
					searchDrink(drink);
				}
				else
				{
				System.out.println("Error: Enter a valid menu option");
				}
		}	
			  catch (Exception e)// if userinput is not an int then the exception is caught and we check if the user entered back. If not then we repeat the loop.
		      {
		    	 if(userSubMenuInput.toLowerCase().equals("back")) {
						return;
					}
					else if(userSubMenuInput.toLowerCase().equals("quit")) {
					 System.out.println("Program is closing. Bye!");
				  		System.exit(0);
			  		}
					else {
						System.out.println("Enter a valid input");
					}
		      }
		}
	}

	public static void displayAll(DrinkArrayMCKC drink) //This method will display all the drinks and will then allow the user to access them individually.
	{
		//drink.selectSort(); //The drinks in the vending machine are sorted alphabetically from the beginning
		//System.out.println("selectSort() was called");
		System.out.println("displayAll() was called");
		System.out.println(" ");
		System.out.println(drink);
		return;

	}

	public static void addDrink(DrinkArrayMCKC drink) //This method will allow the user to add their own type of drink.
	{	
		String userAddDrinkInput;
		boolean addDrinkLoop = true;
		Scanner addDrinkInput = new Scanner(System.in);
		String name;
		String company;
		String cost;
		String servingSize;
		String servingAmt;//Serving amount
		String calorie;//
		String sugar;// in grams
		String caffiene;// in milligrams
		String gmoCont;//Gmo-status
		String month;
		String day;
		String year;
		
		
		System.out.println("addDrink() was called");
		
		while(addDrinkLoop) {
			System.out.println("\n" + "What type of drink do you want to add?");
			System.out.println("1: Generic drink");
			System.out.println("2: Energy drink");
			System.out.println("3: Soda");
			System.out.println("4: Healthy drink");
			
			userAddDrinkInput = addDrinkInput.nextLine();
			
			try {
			    int userAddDrinkInputChoice = Integer.parseInt(userAddDrinkInput);
			          
			    if(userAddDrinkInputChoice ==1) {// add loop for Generics
			    	System.out.println("Enter the name of the drink");
					name = addDrinkInput.nextLine();
					System.out.println("Enter the name of the company of the drink");
					company = addDrinkInput.nextLine();
					try {//The try and catch ensures that cost, serving size, servingamt, and calorie are numbers
						System.out.println("Enter the cost of the drink");
						double parseCost = Double.valueOf(addDrinkInput.nextLine());// We take the next line and see if it is a double. If it is we convert it back to string and continue.
						cost = Double.toString(parseCost);
						System.out.println("Enter the serving size of the drink");
						double parseServingSize = Double.valueOf(addDrinkInput.nextLine());
						servingSize = Double.toString(parseServingSize);
						System.out.println("Enter the amount of fluid ounces per serving");
						double parseServingAmt = Double.valueOf(addDrinkInput.nextLine());
						servingAmt = Double.toString(parseServingAmt);
						System.out.println("Enter the calories");
						double parseCalorie = Double.valueOf(addDrinkInput.nextLine());
						calorie = Integer.toString((int)parseCalorie);
						drink.add(new DrinkMCKC(name, company, cost, servingSize, servingAmt, calorie));
						System.out.println("Drink sucessfully added!");
						System.out.println(drink.getObject(drink.getIndex()-1));
					}
					catch(Exception e)
					{
						if(userAddDrinkInput.toLowerCase().equals("back")) {
							return;
						}
						else if(userAddDrinkInput.toLowerCase().equals("quit")) {
							System.out.println("Program is closing. Bye!");
							System.exit(0);
						}
						else {
							System.out.println("Enter a valid number input");
					}
					}
			    }//Closes first input choice
			    
			    if(userAddDrinkInputChoice ==2) {// add loop for Energy Drinks
			    	System.out.println("Enter the name of the Energy drink");
					name = addDrinkInput.nextLine();
					System.out.println("Enter the name of the company of the energy drink");
					company = addDrinkInput.nextLine();
					try {//The try and catch ensures that cost, serving size, servingamt, and calorie are numbers
						System.out.println("Enter the cost of the drink");
						double parseCost = Double.valueOf(addDrinkInput.nextLine());// We take the next line and see if it is a double. If it is we convert it back to string and continue.
						cost = Double.toString(parseCost);
						System.out.println("Enter the serving size of the drink");
						double parseServingSize = Double.valueOf(addDrinkInput.nextLine());
						servingSize = Double.toString(parseServingSize);
						System.out.println("Enter the amount of fluid ounces per serving");
						double parseServingAmt = Double.valueOf(addDrinkInput.nextLine());
						servingAmt = Double.toString(parseServingAmt);
						System.out.println("Enter the number of calories");
						double parseCalorie = Double.valueOf(addDrinkInput.nextLine());
						calorie = Integer.toString((int)parseCalorie);
						System.out.println("Enter the amount of caffiene(mg)");
						double parseCaffiene = Double.valueOf(addDrinkInput.nextLine());
						caffiene = Double.toString((int)parseCaffiene);
						drink.add(new EnergyDrinkMCKC(name, company, cost, servingSize, servingAmt, calorie, caffiene));
						System.out.println("Energy Drink sucessfully added!");
						System.out.println(drink.getObject(drink.getIndex()-1));
					}
					catch(Exception e)
					{
						if(userAddDrinkInput.toLowerCase().equals("back")) {
							return;
						}
						else if(userAddDrinkInput.toLowerCase().equals("quit")) {
							System.out.println("Program is closing. Bye!");
							System.exit(0);
						}
						else {
							System.out.println("Enter a valid number input");
		
					}
					}
			   }//Closes 2nd input choice
					   
			    if(userAddDrinkInputChoice ==3) {// add loop for Sodas
			    	System.out.println("Enter the name of the Soda");
					name = addDrinkInput.nextLine();
					System.out.println("Enter the name of company of the Soda");
					company = addDrinkInput.nextLine();
					try {//The try and catch ensures that cost, serving size, servingamt, and calorie are numbers
						System.out.println("Enter the cost of the drink");
						double parseCost = Double.valueOf(addDrinkInput.nextLine());// We take the next line and see if it is a double. If it is we convert it back to string and continue.
						cost = Double.toString(parseCost);
						System.out.println("Enter the serving size of the drink");
						double parseServingSize = Double.valueOf(addDrinkInput.nextLine());
						servingSize = Double.toString(parseServingSize);
						System.out.println("Enter the amount of fluid ounces per serving");
						double parseServingAmt = Double.valueOf(addDrinkInput.nextLine());
						servingAmt = Double.toString(parseServingAmt);
						System.out.println("Enter the number of calories");
						double parseCalorie = Double.valueOf(addDrinkInput.nextLine());
						calorie = Integer.toString((int)parseCalorie);
						System.out.println("Enter the amount of sugar(g)");
						double parseSugar = Double.valueOf(addDrinkInput.nextLine());
						sugar = Integer.toString((int)parseSugar);
						System.out.println("Enter the amount of caffiene(mg)");
						double parseCaffiene = Double.valueOf(addDrinkInput.nextLine());
						caffiene = Double.toString((int)parseCaffiene);
						drink.add(new SodaMCKC(name, company, cost, servingSize, servingAmt, calorie, sugar, caffiene));
						System.out.println("Soda sucessfully added!");
						System.out.println(drink.getObject(drink.getIndex()-1));
					}
					catch(Exception e)
					{
						if(userAddDrinkInput.toLowerCase().equals("back")) {
							return;
						}
						else if(userAddDrinkInput.toLowerCase().equals("quit")) {
							System.out.println("Program is closing. Bye!");
							System.exit(0);
						}
						else {
							System.out.println("Enter a valid number input");
					}
					}
			 }//Closes third input choice
			    
			    if(userAddDrinkInputChoice ==4) {// add loop for Healthy drink
					try {
						System.out.println("Enter the name of the Healthy Drink");
						name = addDrinkInput.nextLine().toUpperCase();
						System.out.println("Enter the name of company of the Healthy Drink");
						company = addDrinkInput.nextLine();
						System.out.println("Enter the cost of the drink");
						double parseCost = Double.valueOf(addDrinkInput.nextLine());// We take the next line and see if it is a double. If it is we convert it back to string and continue.
						cost = Double.toString(parseCost);
						System.out.println("Enter the serving size of the drink");
						double parseServingSize = Double.valueOf(addDrinkInput.nextLine());
						servingSize = Double.toString(parseServingSize);
						System.out.println("Enter the amount of fluid ounces per serving");
						double parseServingAmt = Double.valueOf(addDrinkInput.nextLine());
						servingAmt = Double.toString(parseServingAmt);
						System.out.println("Enter the number of calories");
						double parseCalorie = Double.valueOf(addDrinkInput.nextLine());
						calorie = Integer.toString((int)parseCalorie);
						System.out.println("Is the Drink GMO-free?");
						gmoCont = addDrinkInput.nextLine();
						System.out.println("Enter the month of Expiration");
						month = addDrinkInput.nextLine();
						System.out.println("Enter the day of Expiration");
						double parseDay = Double.valueOf(addDrinkInput.nextLine());
						day = Integer.toString((int)parseDay);
						System.out.println("Enter the year of Expiration");
						double parseYear = Double.valueOf(addDrinkInput.nextLine());
						year = Integer.toString((int)parseYear);
						SellByDateMCKC temp = new SellByDateMCKC(month, day, year);
						drink.add(new HealthyDrinkMCKC(name, company, cost, servingSize, servingAmt, calorie, gmoCont, temp));
						System.out.println("Healthy drink sucessfully added!");
						System.out.println(drink.getObject(drink.getIndex()-1));
						
					}
					catch(Exception e)
					{
						if(userAddDrinkInput.toLowerCase().equals("back")) {
							return;
						}
						else if(userAddDrinkInput.toLowerCase().equals("quit")) {
							System.out.println("Program is closing. Bye!");
							System.exit(0);
						}
						else {
							System.out.println("Enter a valid number input");
							return;
					}
					}
			 }//Closes fourth input choice
							 
			}//Closes first try for Drink Choice input  
			          
			      catch (Exception e)// if userinput is not an int then the exception is caught and we check if the user entered back. If not then we repeat the loop.
			      {
			    	 if(userAddDrinkInput.toLowerCase().equals("back")) {
			    		 return;
						}
					 else if(userAddDrinkInput.toLowerCase().equals("quit")) {
						 System.out.println("Program is closing. Bye!");
						 System.exit(0);
					 }
						else {
							System.out.println("Enter a valid input");
						}
			      }
		}//Closes While loop
		return;
		
	}
	
	public static void deleteDrink(DrinkArrayMCKC drink) //This method will allow the user to delete drinks from the list.
	{
		String userAddDrinkInput;
		Scanner deleteDrinkInput = new Scanner(System.in);
		boolean deleteDrinkLoop = true;
		
		while(deleteDrinkLoop) {
			for(int i = 0; i <drink.getIndex(); i++) {// Drinks are displayed so that the user can see what they can delete.
				System.out.print(i + ": ");
				System.out.println(drink.getObject(i));
			}
			
			System.out.println("Choose the number of the drink that you want to delete. ");
			userAddDrinkInput = deleteDrinkInput.nextLine();
			try {
				int userAddDrinkInputChoice = Integer.parseInt(userAddDrinkInput);//user input is parsed for an int
				System.out.println(((DrinkMCKC)drink.getObject(userAddDrinkInputChoice)).getName() + " deleted.");
				drink.delete(userAddDrinkInputChoice);
				return;
			}
			catch (Exception e)
		      {
		    	 if(userAddDrinkInput.toLowerCase().equals("back")) {
		    		 return;
					}
				 else if(userAddDrinkInput.toLowerCase().equals("quit")) {
					 System.out.println("Program is closing. Bye!");
					 System.exit(0);
				 }
					else {
						System.out.println("Enter a valid input");
					}
		      }
		}
		return;
	}
	
	public static void searchDrink(DrinkArrayMCKC drink) //Allows user to search for a specific drink
	{
		drink.selectSort();//This method must always be ran before the binary search takes place.
		String userSearchDrinkInput;
		Scanner searchDrinkInput = new Scanner(System.in);
		boolean searchDrinkLoop = true;

		
		while(searchDrinkLoop) {
			System.out.println("\n" + "What is the name of the drink you are searching for?");
			userSearchDrinkInput = searchDrinkInput.nextLine();
			if(userSearchDrinkInput.toLowerCase().equals("back"))
				return;
			else if(userSearchDrinkInput.toLowerCase().equals("quit")) {
				System.out.println("Program is closing. Bye!");
				System.exit(0);
			}
			else if(drink.binarySearch(userSearchDrinkInput) > -1) {//This check if userInput matches any of the stored object.
				System.out.println(userSearchDrinkInput + " found.");
				System.out.println(drink.getObject(drink.binarySearch(userSearchDrinkInput)));// if the search input is found then the individual drink object is displayed.
				System.out.println(((DrinkMCKC)drink.getObject(drink.binarySearch(userSearchDrinkInput))).dailyIntake());
				return;
			}
			System.out.println("Drink not found. Try again. Make sure you capitilize.");// If search input is not found then the loop repeats
			
		}
	}
	
	public static void testPlan(DrinkArrayMCKC drink)//Test method to test various methods.
	{
		try {
			PrintWriter pw = new PrintWriter("TestOutput.txt", "UTF-8");
			pw.println("Kevin Cho and Mohammed Chisti");
			pw.println(" ");
			pw.println("---Testing for addDrink()---");
			pw.println("Sample Input: Mug Cream Soda, Pepsico, 2.00, 1, 20, 290, 79, 0");
			pw.println("Expected: displayAll() shows at end of list Mug Cream Soda ");
			drink.add(new SodaMCKC("Mug Cream Soda", "Pepsico", "2.00", "1", "20", "290","79", "0"));
			pw.println(drink);
			
			pw.println(" ");
			pw.println("---Testing deleteDrink()---");
			pw.println("Sample Input: Array Location of Mug Cream Soda");
			pw.println("Expected: displayAll() shows all drinks except Mug Cream Soda.");
			drink.delete(drink.getIndex()-1);
			pw.println(drink);
			
			pw.println(" ");
			pw.println("---Testing Incorrect user input---");
			pw.println("Sample Input: t when menu prompts for int.");
			pw.println("Expected: Console prints 'Enter a valid input'.");
			int userTestInput;
			String testInput = "t";
			try {
				userTestInput = Integer.parseInt(testInput);
			}
			catch(Exception e)
			{
				if(testInput.toLowerCase().equals("back")) {
					return;
				}
				else if(testInput.toLowerCase().equals("quit")) {
					pw.println("Program is closing. Bye!");
					System.exit(0);
				}
				else {
					pw.println("Enter a valid number input");
			}
			}
			
			pw.println(" ");
			pw.println("---Testing selectSort()---");
			pw.println("Expected: displayAll() prints all drinks alphabetically.");
			drink.selectSort();
			pw.println(drink);
			
			pw.println(" ");
			pw.println("---Testing searchDrink()---");
			pw.println("Sample Input: 'Monster'");
			pw.println("Expected: Console prints the drink object of monster");
			if(drink.binarySearch("Monster") > -1) {
				pw.println("Monster found.");
				pw.println(drink.getObject(drink.binarySearch("Monster")));
			}
			else pw.println("Drink not found. Try again. Make sure you capitilize.");
			
			pw.println(" ");
			pw.println("---Testing searchDrink()---");
			pw.println("Sample Input: 'FakeDrink'");
			pw.println("Expected: Console prints Drink not found. Try again. Make sure you capitilize.");
			if(drink.binarySearch("FakeDrink") > -1) {
				pw.println("FakeDrink found.");
			}
			pw.println("Drink not found. Try again. Make sure you capitilize.");
			
			pw.println(" ");
			pw.println("---Testing dailyIntake()");
			pw.println("Sample Input: 'Monster', 'Pepsi', 'VitaminWater'");
			pw.println("Expected: Console prints different daily value strings for each different type of drink");
			pw.println("Monster:" + ((DrinkMCKC)drink.getObject(drink.binarySearch("Monster"))).dailyIntake());
			pw.println("Pepsi:"+ ((DrinkMCKC)drink.getObject(drink.binarySearch("Pepsi"))).dailyIntake());
			pw.println("VitaminWater: "+((DrinkMCKC)drink.getObject(drink.binarySearch("Vitamin Water"))).dailyIntake());
			
			pw.flush();
			pw.close();
			//Drink: Mug Cream Soda ; Company:Pepsi Co ; Cost: $2.0 ; Serving size:1.0 ; Serving amount:20.0oz ; Calories:290 ; Sugar content:79grams ; Caffeine:0.0mg
		}
		catch (IOException e) {
			System.err.println(e);
		}
	}
		
}
	
	
	
	
	
	
	