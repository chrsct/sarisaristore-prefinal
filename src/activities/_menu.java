package activities;
import java.util.*;

public class _menu {
    public void StoreMenu() {
        double magicSarap, sinigangMix, milo, candy;
        magicSarap = 5.00;
        sinigangMix = 16.00;
        milo = 8.99;
        candy = 2*5;
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.println("WELCOME TO STORE!\n");
        System.out.println("Which do you want to purchase?");
        System.out.println("[1]: \"Magic Sarap 8g\" : ₱" + magicSarap );
        System.out.println("[2]: \"Sinigang Mix 22g\" : ₱" + sinigangMix );
        System.out.println("[3]: \"Milo 24g\" : ₱" + milo);
        System.out.println("[4]: \"Candy 5pcs\"  : ₱" +  candy);
        System.out.println("");
        System.out.print(": ");
        int item = input.nextInt();
    }
}