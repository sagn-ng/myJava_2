package advanced;
public class WrapperClass {
    public static void main(String[] args) {
        /*
        - Wrapper classes provide a way to use primitive types (int, char) as objects:
        int -- Integer; char -- Character; boolean -- Boolean
        - Sometimes we must use wrapper class, such as working with a collection of objects (List, Set, Map)
        */
        Integer myInt=25; //create a wrapper object
        System.out.println("Value of myInt: "+myInt); //or: System.out.println(myInt.intValue());
        //the same for Character, Double,...
        //some methods for Integer:
        String s=Integer.toString(myInt); //or myInt.intValue(),
        System.out.println("Print myInt as a String s: "+s+"\nLength of s: "+s.length());

        int x=Integer.parseInt(s); //convert a String into an integer
        System.out.println("Print String s as an integer: "+x);
    }
}