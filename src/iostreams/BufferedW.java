package iostreams;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedW {
    public static void main(String[] args) {
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("src\\iostreams\\myBuffer.txt"))) {
            bw.write("This is my progress of learning Java!");
            bw.newLine(); //move to a new line
            bw.write("I wrote this using the BufferedWriter class.\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        } //write normally

        //append, the same as FileWriter:
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("src\\iostreams\\myBuffer.txt", true))) {
            bw.write("I appended this line using two-argument constructor of FileWriter, ");
            bw.write("combined with BufferedWriter.");
            System.out.println("Successfully appended to the file.");
        } catch (Exception e) {
            System.out.println("Error writing file.\n");
            e.printStackTrace();
        }
    }
}