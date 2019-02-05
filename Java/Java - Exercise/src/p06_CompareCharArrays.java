import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p06_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLetter = scanner.nextLine().split(" ");
       String let1 = "";
        for (String s : firstLetter) {
            let1 += s;
        }
        String[] secondLetter = scanner.nextLine().split(" ");
        String let2 = "";
        for (String s : secondLetter) {
            let2 += s;
        }
        String[] letter = {let1, let2};
        Arrays.sort(letter);
        for (String word : letter) {
            System.out.println(word);
        }
    }
}
