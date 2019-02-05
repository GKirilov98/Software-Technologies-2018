import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p09_MostFrequentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String[] number = reader.readLine().split(" ");
        int counter = 1;
        int maxCounter = 1;
        int index = 0;
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i+1; j < number.length; j++) {
               if (number[i].equals(number[j])){
                   counter++;
                   if (counter > maxCounter){
                       maxCounter = counter;
                       index = i;
                   }
               }
            }
            counter = 1;
        }
        System.out.println(number[index]);
    }
}
