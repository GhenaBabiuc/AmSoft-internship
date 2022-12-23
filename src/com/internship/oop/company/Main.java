package com.internship.oop.company;

import com.internship.oop.company.person.Director;
import com.internship.oop.company.person.Manager;
import com.internship.oop.company.person.Programmer;

public class Main {
    public static void main(String[] args) {
        Director d = new Director(1, "Bernard Arnault", 1, 10000, "Qwerty");
        Manager m = new Manager(2, "Elon Musk", 2, 7000, 4);
        Programmer p = new Programmer(3, "Jeff Bezos", 3, 5000, "Java");

        System.out.println(d.getFirstLastName());
        System.out.println(m.getFirstLastName());
        System.out.println(p.getFirstLastName());
    }
}
