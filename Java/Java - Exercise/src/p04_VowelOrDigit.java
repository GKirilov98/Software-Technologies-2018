import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p04_VowelOrDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
            System.out.println("digit");
        } else {
            String letter = input.toLowerCase();

            if (letter.equals("a") ||
                    letter.equals("e") ||
                    letter.equals("i") ||
                    letter.equals("o") ||
                    letter.equals("u")) {
                System.out.println("vowel");
            } else {
                System.out.println("other");
            }

        }
    }
}
