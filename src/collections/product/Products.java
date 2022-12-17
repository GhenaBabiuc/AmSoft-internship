package collections.product;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        HashMap<Integer, String> products =reading();
        Scanner cin = new Scanner(System.in);

        String s = "";

        while (!"5".equals(s)) {
            System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
            System.out.println("|Pentru a afisa productele                    1     |");
            System.out.println("|Pentru a adauga producte                     2     |");
            System.out.println("|Pentru a schimba denumirea ultimului produs  3     |");
            System.out.println("|Pentru a inscrie in fisier                   4     |");
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
                case (1) -> display(products);
                case (2) -> {
                    addProducts(products);
                    display(products);
                }
                case (3)->{
                    changeProducts(products);
                    display(products);
                }
                case (4) -> writToAFile(products);
            }
        }
        System.out.println("Sfarsit!");
    }

    static HashMap<Integer,String> reading(){
        HashMap<Integer, String> products = new HashMap<>();
        BufferedReader br = null;
        try {
            File file = new File("src/collections/product/products-input.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            br = new BufferedReader(new FileReader("src/collections/product/products-input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\|");
                products.put(Integer.valueOf(words[0]),words[1]);
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
        return products;
    }

    static void display(HashMap<Integer, String>products){
        products.keySet().forEach(key->System.out.println(key+" "+products.get(key)));
    }

    static void addProducts(HashMap<Integer, String>products){

        boolean exist;
        int id;
        String name;
        Scanner cin = new Scanner(System.in);

        do {
            exist=false;
            System.out.println("Introduceti idul produsului: ");
            id = cin.nextInt();

            for (int i : products.keySet()) {
                if (i == id) {
                    exist = true;
                }
            }
        }while (exist);
        System.out.println("Introduceti numele produsului: ");
        name = cin.next();
        products.put(id,name);
    }

    static void changeProducts(HashMap<Integer, String>products){
        String name;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduceti numele produsului: ");
        name = cin.next();
        products.put(products.size(),name);
    }

    static void writToAFile(HashMap<Integer, String> products){
        try {
            FileWriter myWriter = new FileWriter("src/collections/product/products-output.txt");
            for (Integer i: products.keySet()) {
                myWriter.write(i);
                myWriter.write(" ");
                myWriter.write(products.get(i));
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
