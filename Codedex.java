import java.util.Scanner;

public class Codedex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Word Guesser Game!");
        System.out.println(" ,-.");
        System.out.println(".: '`-.");
        System.out.println("|:|  __ b");
        System.out.println("`;-(");
        System.out.println(",'  |");
        System.out.println("( /|||_");
        System.out.println(",-----(.-''--``-------.");
        System.out.println("/_______`'______________\"");
        System.out.println(";/                      SSt\"");

        System.out.println("You have 5 attempts remaining to guess the secret word: _ _ _ _");

        String word = ("Kawa");
        for (int chances = 5; chances >= 1; chances--) {
            System.out.print("Enter your guess: ");
            String guesses = scanner.nextLine();
            if (!word.equals(guesses)) {
                System.out.println("Incorrect, try again you have " + (chances - 1) + " chances.");
            } else if (word.equals(guesses)) {
                System.out.println("Congrats!");
                break;
            }
        }
        scanner.close();
    }
}