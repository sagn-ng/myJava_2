package data_structures.MapInterface;
import java.util.HashMap; //import the HashMap class
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, String> cities=new HashMap<String, String>();
        /*HashMap<key type, value type>
        A HashMap stores items in key - value pairs, where each key maps to a specific value
        Keys must be unique, although values can be duplicated
        We access items by keys, instead of index
        
        We can also declare by:
        +) Map<key type, value type> obj = new HashMap<key type, value type>();
        //make sure there is "import java.util.Map;"
        +) "var" keyword
        */
        cities.put("Vietnam", "Hanoi");
        cities.put("England", "Manchester"); cities.put("England", "London");
        /*here we have the "England" key mapping to different values;
        the latest value will overwrite the previous ones*/
        cities.put("USA", "New York");
        cities.put("France", "Paris"); cities.put("Germany", "Munich");
        System.out.println(cities); //the result will be {key1=value1, ...}

        System.out.println(cities.get("Vietnam")); //access an item with get(object key) method

        cities.remove("Germany"); //remove(object key): remove an item by referring to its key
        //to remove all items, use the clear() method

        System.out.println("\nNumber of items: "+cities.size()); //size() method: get the number of items

        //loop through items of a HashMap with a "for-each" loop:
        //print keys:
        for (String i: cities.keySet()) System.out.println(i);
        System.out.println();
        //print values:
        for (String i : cities.values()) System.out.println(i);
        //all:
        for (String i: cities.keySet()) System.out.println("key: "+i+"\tvalue: "+cities.get(i));
    }
}