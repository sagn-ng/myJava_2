package data_structures.ListInterface;
import java.util.Collections; //import the collections class
import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        /*
        - elements must be objects;
        to use with other types like "int", "char", must specify an equivalent "wrapper class" (i haven't learned yet),
        e.g: Int, Character, Boolean, Double,...

        - we can also declare by using the "var" keyword or the "List Interface":
        +) var cars=new ArrayList<String>();
        or:
        +) List<String> cars=new ArrayList<String>();
        */
        cars.add("Lamborghini");
        cars.add("BMW");
        cars.add("McLaren");
        int x=cars.size(); System.out.println("Number of elements: "+x); //find out how many elements are there

        System.out.println(cars+"\n"); //the result will be [Lamborghini, BMW, McLaren]

        cars.add(0, "Ford"); //add an element at a specific position
        System.out.println(cars+"\n"); //the result will be [Ford, Lamborghini, BMW, McLaren]

        System.out.println(cars.get(2)+"\n"); //get() method: access an element by its index

        cars.set(2, "Volvo"); //set() method: change an element by using its index
        System.out.println(cars+"\n");

        cars.remove(1); //remove(int index) method: remove the method at the pointed index
        System.out.println(cars+"\n");

        Collections.sort(cars); //sort the list alphabetically or numerically
        System.out.println(cars);
    }    
}