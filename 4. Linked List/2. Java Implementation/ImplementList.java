import java.util.*;
public class ImplementList{ 
    public static void main(String[] args){
        LinkedList<String> mylist = new LinkedList<String>();
        // adding element
        mylist.add("Geek");
        mylist.add(1,"Geek");
        mylist.add("for");
        mylist.add("new geek");
        // changing value
        mylist.set(1,"New");
        // remove element
        mylist.remove(0);
        mylist.remove("New");
        mylist.removeFirst();
        mylist.removeLast();
        // size
        mylist.size()
    }
}