import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
    Site[] sites;

    public Map(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        scanner.close();

        
    }
}
