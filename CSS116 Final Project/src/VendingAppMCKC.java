public class VendingAppMCKC {
    public static void main(String[] args) {
    	//This app is essentially an vending machine inventory system for drinks. 
    	//It allows users to see know what kind of drinks a vending machine has, their cost, calorie count, fluid ounce, and additional information.
    	//The menu options are Display all drinks, Add a Drink, Delete a Drink, and Search for a drink.
    	//Typically only a vendor would use the add and delete button, but this app can be used for a personal cooler as well. 
    	
    	MenuMCKC.menu(DataHandlingMCKC.iodata());
    	//DataHandlingMCKC.iodata is called to retrieve the input file data.
    	//MenuMCKC.menu uses the drink object array list created by the data in its numerous methods.


    }
}
