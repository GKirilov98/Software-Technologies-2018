import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p01VariableinHexadecimalFormat {
    public static void main(String[] args) throws IOException {
       // Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int hexdecimal = Integer.parseInt(input, 16);
        System.out.println(hexdecimal);
    }
}
