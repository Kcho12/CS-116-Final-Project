//This class scans in the input file and stores it into an array of drink objects.
import java.io.*;
import java.util.*;

public class DataHandlingMCKC {

    public static DrinkArrayMCKC iodata(){
        try {
            DrinkArrayMCKC drink = new DrinkArrayMCKC();
            // inputs from the csv file
            File ifile = new File("drinks.txt");
            Scanner scan = new Scanner(ifile);

            // runs through the csv file and organizes it into array based on the comma delimiter
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] token = line.split(",");
                if (token.length == 6) {//Default Drink Class
                    drink.add(new DrinkMCKC(token[0], token[1], token[2], token[3], token[4], token[5]));
                } else if (token.length == 7) {//Energy Drink Class
                    drink.add(new EnergyDrinkMCKC(token[0], token[1], token[2], token[3], token[4], token[5], token[6]));
                } else if (token.length == 8) {//Soda Class
                    drink.add(new SodaMCKC(token[0], token[1], token[2], token[3], token[4], token[5], token[6], token[7]));
                } else if (token.length == 10) {// Healthy Drink class with an has-a of SellByDate
                    SellByDateMCKC sellDate = new SellByDateMCKC(token[7], token[8], token[9]);// This will demonstrate our has-a relationship
                    drink.add(new HealthyDrinkMCKC(token[0], token[1], token[2], token[3], token[4], token[5], token[6], sellDate));
                }
            }
            scan.close();
            return drink;
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("IndexOutOfBoundsException: " + ex.getMessage());
        } catch (IOException ie) {
            System.err.println("Caught IOException: " + ie.getMessage());
        }
        return null;
    }
}
