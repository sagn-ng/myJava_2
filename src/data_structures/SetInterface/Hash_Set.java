package data_structures.SetInterface;
import java.util.HashSet; //import the HashSet class
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> cars=new HashSet<String>();
        /*
        We can declare a Set type by the same way we declare a List type:
        +) List<object type>
        +) "var" keyword

        A HashSet is an unordered collection of unique elements
        */
        cars.add("Volvo"); cars.add("BMW"); //add() method to add elements to a HashSet
        cars.add("McLaren"); cars.add("BMW") /*duplicate */; cars.add("Porsche");
        //duplicates like "BMW" will be counted only once
        System.out.println(cars);

        System.out.println("\"Ferrari\" exists in \"cars\": "+cars.contains("Ferrari"));
        System.out.println("\"BMW\" exists in \"cars\": "+cars.contains("BMW"));
        //contains(object o) method (return type: boolean): check if an element exists

        cars.remove("Volvo"); //remove an element; if it doesn't exist, then the set stays the same
        System.out.println(cars);

        System.out.println("Number of unique elements in the set: "+cars.size());
    }
}