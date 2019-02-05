import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p05_IntegerToHexAndBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String hexadecimal = Integer.toHexString(number).toUpperCase();
        String binary = Integer.toBinaryString(number);
        System.out.println(hexadecimal);
        System.out.println(binary);
    }
}
