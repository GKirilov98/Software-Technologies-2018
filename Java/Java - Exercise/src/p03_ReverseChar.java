    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class p03_ReverseChar {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<String> letter = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                String input = reader.readLine();
                letter.add(i,input);
            }

            for (int i = 2; i >=0 ; i--) {
                System.out.print(letter.get(i));
            }
        }
    }
