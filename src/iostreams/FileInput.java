package iostreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInput {
    public static void main(String[] args) {
        //try-with-resources: FileInputStream will be closed automatically
        /*if we have "myWriter.txt" instead of "src\\files\\myWriter.txt", the catch block
        will be executed
        if it carries the true error, the program will continue to run*/
        try (FileInputStream input=new FileInputStream("src\\files\\myWriter.txt")) {
            int i; //variable to store each byte being read
            //we read one byte at a time until the end of file (which means -1)
            while ((i=input.read())!=-1){
                //convert the byte to a character and print it to the console
                System.out.print((char) i);
            }
        } catch (IOException e){
            System.out.println("\n"+"Error reading file");
        } //handle errors

        //we're going to try copy a binary file (e.g: an image)
        try (FileInputStream input=new FileInputStream("C:\\Users\\admin\\Pictures\\IMG_1718.JPG")) {
            FileOutputStream output=new FileOutputStream("src\\iostreams\\myCopy_IO.jpg");
            int i;
            while ((i=input.read())!=-1) output.write(i); //write the raw byte to the new file
            output.close();
        } catch (IOException e) {
            System.out.println("\n"+"Error handling file");
            e.printStackTrace();
        }
    }
}
/*
FileInputStream and FileOutputStream can handle any file type, not just text like File and FileWriter

The "FileInputStream" class works with bytes of a file (the same as FileOutputStream), but it doesn't
have the write() method like FileOutputStream (and FileWriter)
*/