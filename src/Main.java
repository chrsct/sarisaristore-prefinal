import java.util.*;
import activities._exit;
import activities._retry;
import activities._menu;

public class Main {
    Scanner input = new Scanner(System.in);
    
    static void MainMenu() {
        Main origin = new Main();
        System.out.println("\033[H\033[2J");
        System.out.println("SARI-SARI STORE INVENTORY");
        System.out.println("What do you want to do?\n");
        System.out.println("[0]: Exit\n[1]: Menu\n[2]: Purchase History\n");
        System.out.print(": ");
        try {
            int choice = origin.input.nextInt();

            if (choice == 0) {
                _exit exit = new _exit();
                exit.userExit();
                origin.input.close();
            } else if (choice == 1) {
                _menu menu = new _menu();
                menu.StoreMenu();
            }
            
        } catch(Exception Safety0) {
            try {
                _retry retry = new _retry();
                retry.userRestart();
                MainMenu();
            } catch (Exception Safety1) {}
        }
    }

    public static void main(String[] args) throws Exception {
        MainMenu();
    }
}