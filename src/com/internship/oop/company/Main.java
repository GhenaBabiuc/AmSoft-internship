package com.internship.oop.company;

import com.internship.oop.company.person.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        reading(person);
        display(person);
    }

    static void reading(Person[] person) {
        BufferedReader br = null;
        try {
            File file = new File("src/com/internship/oop/company/person/employee.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            br = new BufferedReader(new FileReader("src/com/internship/oop/company/person/employee.txt"));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\|");
                person[i] = new Person(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), words[3], Integer.parseInt(words[4]));
                i++;
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

    static void display(Person[] person) {
        int i;
        for (i = 0; i < person.length; i++) {
            System.out.println(person[i].getId() + ", " + person[i].getName() + ", " + person[i].getPositionCode() + ", " + person[i].getAttribute() + ", " + person[i].getSalary());
        }
    }
}
