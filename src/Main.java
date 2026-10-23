import java.util.*;
import activities._exit;
import activities._retry;
import usermechanic._login;

/* 
* Inserting underscores(_) on my own classes to avoid any possible reserved keywords & cleaner naming convensions.
*/

public class Main {
    Scanner input = new Scanner(System.in);
    
    static void MainMenu() {
        Main origin = new Main();
        _login user = new _login();
        user.Login();
        System.out.println("\033[H\033[2J");
        System.out.println("What do you want to do?\n");
        System.out.println("[0]: Exit\n[1]: Insert\n[2]: View Store\n");
        System.out.print(": ");
        try {
            int choice = origin.input.nextInt();

            if (choice == 0) {
                _exit exit = new _exit();
                exit.userExit();
                origin.input.close();
            } else if (choice == 1) {}
            
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