package files;
import java.io.File; //import the File class
import java.io.IOException; //import IOException to handle errors
public class Create {
    public static void main(String[] args) {
        try {
            File myObj=new File("src\\files\\myWriter.txt"); //create an object of the File class (in the folder "files")
            //the createNewFile() method returns true (if succesfully creates the file), or false (if it already exists)
            if (myObj.createNewFile()){ //the createNewFile() method is trying to create a new file
                System.out.println("File created successfully: "+myObj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace(); //print the error details
        }
    }
}
