package collections;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public void collection(){
        Collection<String> dataTypes =new ArrayList<>();
        dataTypes.add("String");
        dataTypes.add("Boolean");
        dataTypes.add("Char");
        dataTypes.add("Double");
        dataTypes.add("int");
        dataTypes.add("Integer");
        dataTypes.forEach(System.out::println);
        System.out.println("-------------------Remove----------------------");
        dataTypes.remove("Boolean");
        dataTypes.forEach(System.out::println);

    }
}
