import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class p19_PhonebookUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        TreeMap<String,String> phonebook = new TreeMap<String, String>();
        while (true){
            String[] info = reader.readLine().split(" ");
            if (info[0].equals("END")){
                break;
            }

            String command = info[0];
            switch (command){
                case "A":
                    String name = info[1];
                    String phone = info[2];
                    phonebook.put(name,phone);
                    break;
                case "S":
                    String nameS = info[1];
                    if (phonebook.containsKey(nameS)){
                        System.out.printf("%s -> %s\n", nameS, phonebook.get(nameS));
                    }
                    else {
                        System.out.printf("Contact %s does not exist.\n", nameS);
                    }
                    break;
                case "ListAll":
                    for (String s : phonebook.keySet()) {
                        System.out.printf("%s -> %s\n", s, phonebook.get(s));
                    }
                    break;
            }
        }
    }
}
