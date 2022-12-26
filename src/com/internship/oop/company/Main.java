package com.internship.oop.company;

import com.internship.oop.company.person.Director;
import com.internship.oop.company.person.Employee;
import com.internship.oop.company.person.Manager;
import com.internship.oop.company.person.Programmer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = reading();
        List<Employee> sortedEmployees = sortByFirstName(employees);

        Scanner cin = new Scanner(System.in);

        String s = "";

        while (!"5".equals(s)) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("|To display the list                          1     |");
            System.out.println("|To change the salary                         2     |");
            System.out.println("|To search for an employee                    3     |");
            System.out.println("|To calculate the salary for a month          4     |");
            System.out.println("|To stop the program                          5     |");
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            s = cin.next();
            int x = 0;

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Nu ati introdus corect");
            }

            switch (x) {
                case (1) -> {
                    System.out.println("---------------------Order by First Last Name----------------------------");
                    display(sortedEmployees);
                }
                case (2) -> {
                    System.out.println("----------------------Change employees salary----------------------------");
                    changeEmployeesSalary(sortedEmployees);
                }
                case (3) -> {
                    System.out.println("--------------------------Employee search--------------------------------");
                    employeeSearch(sortedEmployees);
                }
                case (4) -> {
                    System.out.println("----------------------------Salary per month-----------------------------");
                    salaryPerMonth(employees);
                }
            }
        }
        System.out.println("Sfarsit!");
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
        for (Employee employee : employees) {
            System.out.println(employee.toString());
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

    static void changeEmployeesSalary(List<Employee> employees) {
        int id, salary;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduceti Codul personal:");
        id = cin.nextInt();
        System.out.println("Introduceti Salariul:");
        salary = cin.nextInt();
        for (Employee employee : employees) {
            if (employee.getPersonalCode() == id) {
                employees.get(employees.indexOf(employee)).setSalary(salary);
                break;
            }
        }
    }

    static void employeeSearch(List<Employee> employees) {
        String nameEmployee;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduceti Numele:");
        nameEmployee = cin.nextLine();
        for (Employee employee : employees) {
            if (Objects.equals(employee.getFirstLastName(), nameEmployee)) {
                System.out.println(employee.toString());
                break;
            }
        }
    }

    static void salaryPerMonth(List<Employee> employees) {
        double percentageOfTotal = 0, sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        System.out.println("Suma totala pentru salariu este: " + sumSalary);
        for (Employee employee : employees) {
            percentageOfTotal = employee.getSalary() / (sumSalary / 100);
            System.out.println(employee.getFirstLastName() + " " + String.format("%.2f", percentageOfTotal) + "%");
        }
    }
}
