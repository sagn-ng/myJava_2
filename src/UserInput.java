import java.util.*; //to use the "Scanner" class from the built-in package: java.util
public class UserInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter an integer:");
        int x=obj.nextInt();
        System.out.println("You entered the integer: "+x);

        obj.nextLine(); /*if there isn't this line, '\n' is still left in the buffer and the nextLine() below will
        "swallow" this character, ending the input progress*/

        System.out.println("\nEnter a string:");
        String s=obj.nextLine();
        System.out.println("You entered the string: "+s);
        obj.close();
    }
}