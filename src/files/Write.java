package files;
import java.io.FileWriter; //import the FileWriter class
import java.io.IOException; //import the IOException classmy
public class Write {
    public static void main(String[] args) {
        try {
            FileWriter myWriter=new FileWriter("src\\files\\myWriter.txt");
            myWriter.write("These are what i wrote using the FileWriter class with write() method!\n");
            myWriter.close(); //must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        /*we can use try-with-resources:
        try (FileWriter myWriter=new FileWriter("src\\files\\myWriter.txt")){
            //the same as normal
        } catch (IOException e){
            //also the same
        }
        */

        /*normally, FileWriter will overwrite the file if it already exists.
        So, to append texts at the end of the file, we can use two-argument constructor, with "true" being the second one
        The writer is now in "append mode"
        */
        try (FileWriter myWriter=new FileWriter("src\\files\\myWriter.txt", true)) {
            myWriter.write("I appended this line using the write() method!");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
