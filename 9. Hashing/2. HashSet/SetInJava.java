import java.util.*;

public class SetInJava {

    public static void main(String[] args){
        HashSet<Integer> hSet = new HashSet<Integer>();
        // Inserting
        hSet.add(2);
        // Removing
        hSet.remove(2);
        // contains
        hSet.contains(2);
        // Iterator
        Iterator<Integer> it = hSet.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}