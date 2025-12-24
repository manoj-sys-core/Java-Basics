package DAY10;
import java.nio.file.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class Rjson {
    public static void main(String[] args) {
        try {
            String content = new String(
                    java.nio.file.Files.readAllBytes(
                            java.nio.file.Paths.get("data.json")
                    )
            );
            JSONArray arr = new JSONArray(content);

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                System.out.println(
                        obj.getInt("id") + " " +
                                obj.getString("name")
                );
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
