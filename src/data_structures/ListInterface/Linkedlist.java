package data_structures.ListInterface;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        /*the LinkedList class has the same methods as ArrayList because both follow the List interface.
        however, there are still some differences:
        - the ArrayList class has a regular array inside it, efficient for reading data and accessing by index
        - the LinkedList works like containers, with every "container" is linked with its next, efficient
        for operations on the first/last element (like a "queue", or "stack")
        */
        LinkedList<String> cars=new LinkedList<String>();
        //we can also declare by using List<String> or the "var" keyword like ArrayList

        //add(), get(), remove() are also availale
        /*some other methods for LinkedList */
        cars.addFirst("BMW");
        cars.addLast("Ferrari");
        cars.addLast("Volvo");
        cars.addLast("McLaren");
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        System.out.println(cars);
    }
}
