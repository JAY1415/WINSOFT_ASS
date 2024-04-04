import java.util.HashMap;
import java.util.Scanner;

public class Duplicate4 {
    public static void findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        findDuplicateCharacters(str);
    }
}