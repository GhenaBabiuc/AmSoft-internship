package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> digits=new HashSet<>();
        for(int i=9;i>=0;i--){
            digits.add(i);
        }
        System.out.println("Size "+digits.size());
        digits.forEach(System.out::println);
        System.out.println("------------------------------------------");
        Set<Integer> LinkedHashSet=new LinkedHashSet<>();
        for(int j=9;j>=0;j--){
            LinkedHashSet.add(j);
        }
        LinkedHashSet.forEach(System.out::println);
    }
}
