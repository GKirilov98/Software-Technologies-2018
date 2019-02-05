import java.util.Scanner;

public class p14_FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (i == 20) {
                return;
            }
            System.out.print(input.charAt(i));
        }

        int asterics = 20 - input.length();
        for (int i = 0; i < asterics; i++) {
            System.out.print('*');
        }
    }
}
