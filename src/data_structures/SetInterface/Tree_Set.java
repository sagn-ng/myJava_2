package data_structures.SetInterface;
import java.util.TreeSet; //import the TreeSet class
public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> cars=new TreeSet<String>();
        /*
        A TreeSet is an (automatically) sorted (in natural order) collection of unique elements;
        However, due to sorting elements, TreeSet is slower than HashSet
        (*Use HashSet when we care about speed, TreeSet when we need sorted elements)
        */
        cars.add("Volvo"); cars.add("BMW");
        cars.add("McLaren"); cars.add("BMW"); cars.add("Porsche");
        //elements will be sorted automatically (e.g: [BMW, McLaren, Porsche, Volvo])
        cars.remove("Volvo");
        //all the methods of HashSet we've learned works in the same way here;
        System.out.println(cars);
    }
}