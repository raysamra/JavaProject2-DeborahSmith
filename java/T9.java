import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T9 {
    public static char nonRepeat(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        char nonRepeatChar = nonRepeat(word);

        if (nonRepeatChar != '\0') {
            System.out.println("First non-repeating character: " + nonRepeatChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
