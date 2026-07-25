package files;
import java.io.File;
public class Delete {
    public static void main(String[] args) {
        File myObj1=new File("src\\files\\test.txt");
        try{
            if (myObj1.createNewFile()){
                System.out.println(myObj1.getName()+" is created successfully.");
                if (myObj1.delete()) System.out.println("Deleted the file: "+myObj1.getName());
                //can be used to delete a folder
                else System.out.println("Failed to delete the file.");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
