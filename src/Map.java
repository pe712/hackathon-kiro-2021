import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONTokener;


public class Map {
    Site[] sites;

    public Map(String path) throws FileNotFoundException {
        
        FileInputStream file = new FileInputStream(path);
        JSONTokener tokener = new JSONTokener(file);
        JSONObject input = new JSONObject(tokener);
        JSONObject parameters = input.getJSONObject("parameters");
        JSONObject buildingCosts = parameters.getJSONObject("buildingCosts");
        Long p = buildingCosts.getLong("productionCenter");
        System.out.println(p);
    }


    public static void main(String[] args) throws FileNotFoundException {
        Map map = new Map("data/KIRO-tiny.json");
    }
}
