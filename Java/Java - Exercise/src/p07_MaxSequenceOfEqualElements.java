import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class p07_MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 0;
        int maxCounter = 0;
        int index = 0;
        int leftMostIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] == numbers[i-1]){
               counter ++;
               if (counter == 1){
                   index = i;
               }
               if (counter > maxCounter){
                   maxCounter = counter;
                   leftMostIndex = index;
               }
           }
           else {
               counter = 0;
           }
        }

        for (int i = 0; i <= maxCounter; i++) {
            System.out.print(numbers[leftMostIndex] + " ");
        }
    }
}
