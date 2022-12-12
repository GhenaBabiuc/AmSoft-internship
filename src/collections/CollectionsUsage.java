package collections;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUsage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        citire(list);

        System.out.println("----------------Lista----------------");
        afisare(list);

        sortare(list);

        System.out.println("------------Lista sortata------------");
        afisare(list);
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

    static void afisare(ArrayList<String> list){
        list.forEach(System.out::println);
    }

    static void sortare(ArrayList<String> list) {
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        list.clear();
        for(int i = 0; i< sortedList.size(); i++) {
            list.add(sortedList.get(i));
        }
    }
}