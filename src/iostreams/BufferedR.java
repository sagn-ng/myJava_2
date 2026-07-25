package iostreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedR {
    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new FileReader("src\\iostreams\\myOutput.txt"))) {
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}