package collections;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectionsUsage {
    public static void main(String[] args) {
       List<String> list=reading();
       List<String> sortedList=sorting(list);
       List<String> names=getName(sortedList);
       List<String> dateOfBirth=getDateOfBirth(sortedList);
       List<String> age=getAge(dateOfBirth);

        System.out.println("----------------Lista----------------");
        display(list);

        System.out.println("------------Lista sortata------------");
        display(sortedList);

        System.out.println("------------Lista cu Nume------------");
        display(names);

        System.out.println("----------------varsta----------------");
        display(age);

        writToAFile(sortedList,dateOfBirth,age);
    }

    static List<String> reading(){
        List<String> list = new ArrayList<>();
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
        return list;
    }

    static void display(List<String> list){
        list.forEach(System.out::println);
    }

    static List<String> sorting(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    static List<String> getName(List<String> list) {
        List<String> names=new ArrayList<>();
        for (String s : list) {
            String[] words = s.split("\\|");
            names.add(words[0]);
        }
        return names;
    }

    static List<String> getDateOfBirth(List<String> list) {
        List<String> dateOfBirth=new ArrayList<>();

        Scanner cin = new Scanner(System.in);

        for (String s : list) {
            System.out.print("Introduceti data nasterii ");
            System.out.println(s);
            dateOfBirth.add(cin.next());
        }

        return dateOfBirth;
    }

    static List<String> getAge(List<String> list){
        List<String> age = new ArrayList<>();
        for (String s : list) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(s, formatter);
            LocalDate end = LocalDate.now();
            long years = ChronoUnit.YEARS.between(localDate, end);
            age.add(String.valueOf(years));
        }
        return age;
    }

    static void writToAFile(List<String> sortedList,List<String> dateOfBirth,List<String> age){
        try {
            FileWriter myWriter = new FileWriter("src/collections/employee-output.txt");
            for (String string : sortedList) {
                myWriter.write(string);
                myWriter.write("|");
                myWriter.write(dateOfBirth.get(sortedList.indexOf(string)));
                myWriter.write("|");
                myWriter.write(age.get(sortedList.indexOf(string)));
                myWriter.write("\r\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

