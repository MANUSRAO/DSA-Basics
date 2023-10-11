import java.util.*;

public class MapInJava {

    public static void main(String[] args){
        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
        // Inserting
        hMap.put(1,2);
        // getting
        hMap.get(1);
        // remove
        hMap.remove(1);
        // Iterating
        for(Map.Entry<Integer,Integer> hm:hMap.entrySet()){
            hm.getValue();
            hm.getKey();
        }
        // checking if exists
        hMap.containsKey(1);
        hMap.containsValue(2);
        // get or default
        hMap.getOrDefault(1,1);
        // put if absent
        hMap.putIfAbsent(1,2);
    }
}