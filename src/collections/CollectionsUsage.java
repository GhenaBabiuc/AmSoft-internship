package collections;
import java.io.*;
import java.util.ArrayList;

public class CollectionsUsage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        citire(list);

        list.forEach(System.out::println);
    }

    static void citire(ArrayList<String> list){
        BufferedReader br = null;
        try {
            File file = new File("src/collections/employee-input.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            br = new BufferedReader(new FileReader("src/collections/employee-input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }

        } catch (IOException e) {
            System.out.print("eroare " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.print("eroare " + e);
            }
        }
    }
}