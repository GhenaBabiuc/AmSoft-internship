package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();

        fruits.add("Mere");
        fruits.add("pere");
        fruits.add("visini");
        fruits.add("cirese");
        fruits.forEach(System.out::println);
        System.out.println("-------How to access------------");
        System.out.println(fruits.get(1));
        System.out.println("-------Remove------------");
        fruits.remove(0);
        fruits.remove("cirese");
        fruits.forEach(System.out::println);
        System.out.println("-------ADD------------");
        fruits.add(1,"asdfg");
        fruits.forEach(System.out::println);
        System.out.println("-------Sort------------");
        List<String> sortedFruits=fruits.stream().sorted().collect(Collectors.toList());
        sortedFruits.forEach(System.out::println);
    }
}
