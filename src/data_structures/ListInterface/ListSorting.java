package data_structures.ListInterface;
import java.util.ArrayList;
import java.util.Collections;
public class ListSorting {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW"); cars.add("Lamborghini");
        cars.add("Ford"); cars.add("McLaren");
        System.out.println("Before getting sorted: "+cars);

        Collections.sort(cars); //sort alphabetically or numerically in ascending order
        System.out.println("Sorted in ascending order: "+cars);
        
        Collections.sort(cars, Collections.reverseOrder()); //sort in descending order
        System.out.println("Sorted in descending order: "+cars);
    }
}