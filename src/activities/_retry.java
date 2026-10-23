package activities;
public class _retry {
    public void userRestart() throws Exception {
        System.out.println("Choose the right <VALUE>");
        for (int counter = 3;counter >= 1; counter--) {
            System.out.println("\033[H\033[2J");
            System.out.println("Retrying in " + counter);
            Thread.sleep(1000);
        }
    }
}