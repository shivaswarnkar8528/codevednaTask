import java.util.Scanner;

public class Ispangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to store whether each letter has been found
        boolean[] found = new boolean[26];

        // Convert the input string to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                found[index] = true;
            }
        }

        // Check if all letters have been found
        for (boolean letterFound : found) {
            if (!letterFound) {
                return false;
            }
        }

        return true;
    }
}
