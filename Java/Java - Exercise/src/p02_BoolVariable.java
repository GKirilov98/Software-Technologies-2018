import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p02_BoolVariable {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String input = scanner.readLine();
        if (input.equals("True")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
