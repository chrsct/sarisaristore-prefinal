package activities;
public class _retry {
    public void userRestart() throws Exception {
        System.out.println("\033[H\033[2J");
        System.out.println("Choose the right <VALUE>");
        Thread.sleep(2000);
        System.out.println("\033[H\033[2J");
        System.out.println("Retrying in 3");
        Thread.sleep(1000);
        System.out.println("\033[H\033[2J");
        System.out.println("Retrying in 2");
        Thread.sleep(1000);
        System.out.println("\033[H\033[2J");
        System.out.println("Retrying in 1");
        Thread.sleep(1000);
    }
}