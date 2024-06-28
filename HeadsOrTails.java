
import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random rand = new Random();
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
