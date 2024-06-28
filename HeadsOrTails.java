// HeadsOrTails.java
import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Who are you? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        String[] results = new String[3];
        int heads = 0;
        int tails = 0;

        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            results[i] = rand.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + (i + 1) + ": " + results[i]);
            if (results[i].equals("Heads")) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
}
