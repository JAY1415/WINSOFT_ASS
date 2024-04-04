import java.util.Scanner;

public class countWords3 {

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string by whitespace and count the number of resulting substrings
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        System.out.println("Number of words in the string: " + wordCount);
    }
}