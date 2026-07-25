package files;
import java.io.File; //import the File class
import java.io.FileNotFoundException; //import the class to handle errors
import java.util.Scanner; //import the Scanner class to read text files
public class Read {
    public static void main(String[] args) {
        File myObj=new File("src\\files\\myWriter.txt");

        if (myObj.exists()){
            System.out.println("File name: "+myObj.getName());
            System.out.println("Absolute path: "+myObj.getAbsolutePath());
            System.out.println("Writeable: "+myObj.canWrite());
            System.out.println("Readable: "+myObj.canRead());
            System.out.println("File size in bytes: "+myObj.length()+"\n");
        } //if the file exists, print some information of it

        //try-with-resources: Scanner will be closed automatically
        try (Scanner myReader=new Scanner(myObj)) {
            System.out.println("File content:\n");
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            } //print all the lines in the file
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
