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

        System.out.println("------------Lista cu Nume------------");
        nume(list);

        System.out.println("-----------------Data-----------------");
        data(list);
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

    static void nume(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String words[] = list.get(i).split(" ");
            System.out.println(words[0]);
        }
    }

    static void data(ArrayList<String> list) {
        int zi=12;
        int luna=12;
        int an=2022;
        int da[]=new int[3];
        for (int i = 0; i < list.size(); i++) {
            String datas[] = list.get(i).split("\\|");

            for (int j = 0; j < 3; j++) {
                String d[] =datas[1].split("/");
                da[j]= Integer.parseInt(d[j]);
            }
            if(luna==da[1]){
                if(zi>da[0]) {
                    System.out.println(an-da[2]-1+" ani");
                }else {
                    System.out.println(an-da[2]+" ani");
                }
            }if (luna>da[1]) {
                System.out.println(an-da[2]+" ani");
            }if (luna<da[1]) {
                System.out.println(an-da[2]-1+" ani");
            }
        }
    }
}

