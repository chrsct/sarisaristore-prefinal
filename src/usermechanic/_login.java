package usermechanic;
import java.util.Scanner;

public class _login {
    public static String storeName = "";
    public static String ownerName = ""; 
    public static void Login() {
        Scanner loginInput = new Scanner(System.in);

        while (storeName.length() <= 2) {
            System.out.println("\033[H\033[2J");
            System.out.print("(2) Character Minimum\nStore's Name: ");
            storeName = loginInput.nextLine().trim();
        }

        while (ownerName.length() <= 2) {
            System.out.println("\033[H\033[2J");
            System.out.print("(2) Character Minimum\nOwner's Name: ");
            ownerName = loginInput.nextLine().trim();
        }
    }
}