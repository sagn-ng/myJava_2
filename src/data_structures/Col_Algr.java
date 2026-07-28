package data_structures;
import java.util.*;
public class Col_Algr {
    public static void main(String[] args) {
        HashSet<Integer> myHSet=new HashSet<Integer>();
        myHSet.add(2); myHSet.add(5); myHSet.add(1);
        myHSet.add(1); myHSet.add(0); myHSet.add(7);
        myHSet.add(37);
        //the sort() method, swap() method and shuffle() method can only be applied for List interface
        System.out.println(Collections.max(myHSet));
        System.out.println(Collections.min(myHSet));
        System.out.println(Collections.frequency(myHSet, 1));
        System.out.println();

        ArrayList<Integer> myAList=new ArrayList<Integer>();
        myAList.add(2); myAList.add(5); myAList.add(1);
        myAList.add(1); myAList.add(0); myAList.add(7);
        myAList.add(37);
        Collections.sort(myAList); System.out.println(myAList); //[0, 1, 1, 2, 5, 7, 37]
        Collections.swap(myAList, 3, 4); System.out.println(myAList); //[0, 1, 1, 5, 2, 7, 37]
        Collections.shuffle(myAList); System.out.println(myAList); 
    }
}
