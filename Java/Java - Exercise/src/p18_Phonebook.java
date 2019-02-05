import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class p18_Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        LinkedHashMap<String,String> phonebook = new LinkedHashMap<String, String>();
        while (true){
            String[] info = reader.readLine().split(" ");
            if (info[0].equals("END")){
                break;
            }

            String command = info[0];
            String name = info[1];
            switch (command){
                case "A":
                    String phone = info[2];
                        phonebook.put(name,phone);
                    break;
                case "S":
                    if (phonebook.containsKey(name)){
                        System.out.printf("%s -> %s\n", name, phonebook.get(name));
                    }
                    else {
                        System.out.printf("Contact %s does not exist.\n", name);
                    }
                    break;
            }
        }
    }
}
