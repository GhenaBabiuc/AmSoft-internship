package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public void mapDemo(){
        Map<String, Integer> carHashMap=new HashMap<>();
        carHashMap.put("BMW",100);
        carHashMap.put("Audi",34);
        carHashMap.put("Mercedes",20);
        carHashMap.put("Renault",10);
        System.out.println("---------------------------no insertion order/no sort");
        carHashMap.keySet().forEach(key->System.out.println(key+"="+carHashMap.get(key)));

        Map<String, Integer> carTreeMap=new TreeMap<>();
        carTreeMap.put("BMW",100);
        carTreeMap.put("Audi",34);
        carTreeMap.put("Mercedes",20);
        System.out.println("-------------------sort by key");
        carTreeMap.keySet().forEach(key->System.out.println(key+"="+carTreeMap.get(key)));

        Map<String, Integer> carLinkedHashMap=new LinkedHashMap<>();
        carLinkedHashMap.put("BMW",100);
        carLinkedHashMap.put("Audi",34);
        carLinkedHashMap.put("Mercedes",20);
        System.out.println("-------------------insertion order");
        carLinkedHashMap.keySet().forEach(key->System.out.println(key+"="+carLinkedHashMap.get(key)));
        System.out.println("-------------------Remove");
        carLinkedHashMap.remove("BMW");
        carLinkedHashMap.keySet().forEach(key->System.out.println(key+"="+carLinkedHashMap.get(key)));
        System.out.println("-------------------Update");
        carLinkedHashMap.put("Audi",100);
        carLinkedHashMap.keySet().forEach(key->System.out.println(key+"="+carLinkedHashMap.get(key)));
    }
}
