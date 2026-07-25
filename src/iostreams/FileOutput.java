package iostreams;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutput {
    public static void main(String[] args) {
        String s="hello world";
        //try-with-resources: stream will be closed automatically
        try (FileOutputStream output=new FileOutputStream("src\\iostreams\\myOutput.txt")){
            output.write(s.getBytes());
            //FileOutputStream only works with bytes, so we must convert our text into bytes and write
            System.out.println("Successfully wrote the string to file.");
        } catch (IOException e){
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    /*
    Like FileWriter, FileOutputStream overwrites the file if it already exists.
    To append new content, the same as FileWriter, we use the two-argument constructor, with
    "true" as the second argument; but we still must convert our content to bytes (e.g: s.getBytes())
    */
    }
}
