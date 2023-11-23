import java.util.Scanner;

public class StringConcatenationAndAlternatingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two strings from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenating the strings
        String concatenatedString = firstString.concat(secondString);

        // Checking if the concatenated string is alternating
        boolean isAlternating = checkAlternating(concatenatedString);

        // Displaying the concatenated string and the result of the alternating check
        System.out.println("Concatenated String: " + concatenatedString);
        if (isAlternating) {
            System.out.println("The concatenated string is alternating.");
        } else {
            System.out.println("The concatenated string is not alternating.");
        }

        scanner.close();
    }

    // Method to check if a string is alternating
    private static boolean checkAlternating(String str) {
        char[] chars = str.toCharArray();
        boolean isAlternating = true;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                isAlternating = false;
                break;
            }
        }

        return isAlternating;
    }
}
