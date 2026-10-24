package activities;
import usermechanic.*;

public class _exit {
    public void userExit() throws Exception {
        _login user = new _login(); 
        System.out.print("\033[H\033[2J");
        System.out.print("Thank you for visiting " + _login.storeName + "!");
        Thread.sleep(2000);
        System.out.print("\033[H\033[2J");
    }
}