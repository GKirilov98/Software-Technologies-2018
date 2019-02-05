import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p10_IndexOfLetters {
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int numAlfabetic = letter - 97;
            System.out.printf("%s -> %d\n", letter, numAlfabetic  );

        }
    }
}
