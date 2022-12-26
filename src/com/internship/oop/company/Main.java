package com.internship.oop.company;

import com.internship.oop.company.person.Director;
import com.internship.oop.company.person.Employee;
import com.internship.oop.company.person.Manager;
import com.internship.oop.company.person.Programmer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = reading();
        List<Employee> sortedEmployees = sortByFirstName(employees);

        display(employees);
        System.out.println("---------------------sort by first name----------------------------");
        display(sortedEmployees);
    }

    static List<Employee> reading() {
        List<Employee> list = new ArrayList<>();

        BufferedReader br = null;
        try {
            File file = new File("src/com/internship/oop/company/person/Employee.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            br = new BufferedReader(new FileReader("src/com/internship/oop/company/person/Employee.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\|");
                switch (words[2]) {
                    case "1" -> {
                        Director d = new Director(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), words[4]);
                        list.add(d);
                    }
                    case "2" -> {
                        Manager m = new Manager(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), Integer.parseInt(words[4]));
                        list.add(m);
                    }
                    case "3" -> {
                        Programmer p = new Programmer(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), words[4]);
                        list.add(p);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + words[2]);
                }
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

    static void display(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }

    static List<Employee> sortByFirstName(List<Employee> employees) {
        List<Employee> sortedEmployees = new ArrayList<Employee>(employees);
        sortedEmployees.sort(new Comparator<Employee>() {
            public int compare(Employee p1, Employee p2) {
                return p1.getFirstLastName().compareTo(p2.getFirstLastName());
            }
        });
        return sortedEmployees;
    }
}
