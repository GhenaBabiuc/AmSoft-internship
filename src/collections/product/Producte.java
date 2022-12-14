package collections.product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Producte {
    public static void main(String[] args) {
        HashMap<Integer, String> producte = new HashMap<>();

        Scanner cin = new Scanner(System.in);

        String s = "";

        while (!"5".equals(s)) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("|Pentru a citi din fisier                     1     |");
            System.out.println("|Pentru a afisa productele                    2     |");
            System.out.println("|Pentru a adauga producte                     3     |");
            System.out.println("|                                             4     |");
            System.out.println("|Pentru a stopa programul                     5     |");
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            s = cin.next();
            int x = 0;

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Nu ati introdus corect");
            }

            switch (x) {
                case (1):
                    citire(producte);
                    break;
                case (2):
                    afisare(producte);
                    break;
                case (3):
                    adaugare(producte);
                    break;
            }
        }
        System.out.println("Sfarsit!");
    }

    static void citire(HashMap<Integer, String>producte){
        BufferedReader br = null;
        try {
            File file = new File("src/collections/product/products-input.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            br = new BufferedReader(new FileReader("src/collections/product/products-input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String words[] = line.split("\\|");
                producte.put(Integer.valueOf(words[0]),words[1]);
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

    static void afisare(HashMap<Integer, String>producte){
        producte.keySet().forEach(key->System.out.println(key+" "+producte.get(key)));
    }

    static void adaugare(HashMap<Integer, String>producte){
        int id;

        Scanner cin = new Scanner(System.in);

        System.out.println("Introduceti idul produsului: ");
        id=cin.nextInt();
        System.out.println("Introduceti numele produsului: ");
        String nume = cin.next();

        producte.put(id,nume);
    }

}
