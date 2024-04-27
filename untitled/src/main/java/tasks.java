import java.util.*;

public class tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.endsWith("ь")) {
            System.out.println(word.substring(word.length() - 1));
        } else {
            System.out.println(word.substring(word.length() - 1));
        }
    }
}