package inventory;
import usermechanic.*;
import inventory.*;
import java.util.*;
import app.Main;

public class View {
        private static Scanner scanner = new Scanner(System.in);

    public static void ViewRecent() throws Exception {
        _login userInfo = new _login(); 
        Insert itemInfo = new Insert();
        Main origin = new Main();

        System.out.print("\033[H\033[2J");
        System.out.println("--RECENT ITEM(VIEWING)--\n");
        System.out.println("--INFORMATION--");
        System.out.println("STORE NAME: " + userInfo.storeName);
        System.out.println("OWNER NAME: " + userInfo.ownerName);
        System.out.println("");
        System.out.println("--ITEM--");
        System.out.println("ITEM NAME: " + itemInfo.itemName);
        System.out.println("ITEM DESCRIPTION: " + itemInfo.itemDescription);
        System.out.println("ITEM PRICE: ₱" + itemInfo.itemPrice);
        System.out.println("QUANTITY: " + itemInfo.itemQuantity);
        System.out.println("SHELF LOCATION: SHELF " + itemInfo.shelf);
        System.out.println("");
        System.out.println("[0] Back\n");
        System.out.print(": ");
        
        try {
            int back = scanner.nextInt();
            origin.MainMenu();
        } catch (Exception back) {
            System.out.print("\033[H\033[2J");
            System.out.println("Invalid Value");
            Thread.sleep(1000);
            ViewRecent();
        }
        
    }
}