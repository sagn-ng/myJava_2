package data_structures.SetInterface;
import java.util.LinkedHashSet; //import the LinkedHashSet class
public class Linked_Hash_Set {
    public static void main(String[] args) {
        LinkedHashSet<String> cars=new LinkedHashSet<String>();
        cars.add("Volvo"); cars.add("BMW");
        cars.add("McLaren"); cars.add("BMW")/*this duplicate will be ignored */;
        cars.add("Porsche");
        /*
        A LinkedHashSet is a collection of unique elements that keep the order those elements were added
        All the methods we've learned can be applied the same here
        */
       System.out.println(cars);
    }
}