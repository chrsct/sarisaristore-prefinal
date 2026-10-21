package activities;
public class _exit {
    public void userExit() throws Exception {
        System.out.println("\033[H\033[2J");
        System.out.println("Thank you for visiting my Sari-Sari Store!");
        Thread.sleep(2000);
        System.out.println("\033[H\033[2J");
    }
}