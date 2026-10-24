package inventory;
import java.util.*;
import java.lang.*;
import app.Main;

public class Insert {
    Scanner input = new Scanner(System.in);
    public static String itemName = "---";
    public static String itemDescription = "---";
    public static double itemPrice = 0;
    public static int itemQuantity = 0;
    public static int shelf = 0;
    public void insertInventory() throws Exception {
        
        
        Insert itemInput = new Insert();
        System.out.print("\033[H\033[2J");
        System.out.println("--INSERTING ITEM--");
        System.out.print("Item Name: ");
        itemName = itemInput.input.nextLine();
        System.out.print("Item Description: ");
        itemDescription = itemInput.input.nextLine();
        Price();
    }

    static void Price() throws Exception {
        Insert priceInput = new Insert();
        System.out.print("Item Price: ");

        try {
            itemPrice = priceInput.input.nextDouble();
            Quantity();
        } catch (Exception price) {
            System.out.print("\033[H\033[2J");
            System.out.println("Invalid Price");
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.println("--INSERTING ITEM--");
            Price();
        }
    }

    static void Quantity() throws Exception {
        Insert quantityInput = new Insert();
        System.out.print("Item Quantity: ");
        try {
            itemQuantity = quantityInput.input.nextInt();
            Location();

        } catch (Exception price) {
            System.out.print("\033[H\033[2J");
            System.out.println("Invalid Quantity");
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.println("--INSERTING ITEM--");
            Quantity();
        }
    }

    static void Location() throws Exception {
        Insert locationInput = new Insert();
        Main origin = new Main();
        System.out.println("Shelf you have: (0,1,2,3)");
        System.out.print("Shelf Number: ");
        try {
            shelf = locationInput.input.nextInt();
            if (shelf >= 4) {
                System.out.print("\033[H\033[2J");
                System.out.println("Shelf not found");
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.println("--INSERTING ITEM--");
                Location();                
            } else {
                System.out.print("\033[H\033[2J");
                System.out.println("The item was succesfully inserted in your store!");
                Thread.sleep(2000);
                origin.MainMenu();
            }
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.println("Shelf not found");
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.println("--INSERTING ITEM--");
            Location();
        }
    }
}