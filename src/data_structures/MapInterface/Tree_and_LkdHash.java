package data_structures.MapInterface;
import java.util.TreeMap; //import the TreeMap class
public class Tree_and_LkdHash {
    public static void main(String[] args) {
        TreeMap<String, String> citites_Tree=new TreeMap<String, String>();
        /*
        A TreeMap is a collection that stores key-value pairs in sorted order of keys (like TreeSet).
        Declarations, methods are all the same, even for LinkedHashMap.
        A LinkedHashMap stores keys and values in the same order we put them in (like LinkedHashSet).
        */
        citites_Tree.put("Vietnam", "Hanoi"); citites_Tree.put("England", "London");
        citites_Tree.put("USA", "New York");
        citites_Tree.put("France", "Paris"); citites_Tree.put("Germany", "Munich");
        System.out.println(citites_Tree);

        System.out.println(citites_Tree.get("Vietnam"));

        //loop through items:
        //print keys
        for (String i: citites_Tree.keySet()) System.out.println(i);
        System.out.println();
        //print values:
        for (String i : citites_Tree.values()) System.out.println(i);
        //all:
        for (String i: citites_Tree.keySet()) System.out.println("key: "+i+"\tvalue: "+citites_Tree.get(i));
    }
}