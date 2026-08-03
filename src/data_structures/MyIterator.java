package data_structures;
import java.util.ArrayList;
import java.util.Iterator; //import the Iterator class
public class MyIterator{
    public static void main(String[] args) {
        ArrayList<Integer> myArr=new ArrayList<Integer>();
        //Integer is the wrapper class of "int" type
        myArr.add(2); myArr.add(5);
        myArr.add(10); myArr.add(7);

        //get the iterator for "myArr":
        Iterator<Integer> it=myArr.iterator();
        /*
        An Iterator is an object, used to traverse through items of collection (e.g: a List, or Set (not Map)),
        while we don't have to care about the real structure of that collection
        */
        System.out.println(it.next()); //print the "first" item, then "it" will point to the next
        
        //traverse through the ArrayList "myArr":
        while (it.hasNext()){ //hasNext() method: check if there is a item left or not
            System.out.println(it.next());
        }
        /*
        - If we want "it" to "move", the we must call the next() method
        - After a loop like above, the Iterator had finished the traversal, so if we want a new start
        (like the loop below), we must reset the iterator:
        */
        it=myArr.iterator();

        //remove items from a collection:
        while (it.hasNext()){
            Integer u=it.next();
            if (u<7) it.remove();
        }
        System.out.println(myArr); //expected result: [10, 7]
    }
}