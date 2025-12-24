package DAY10;
import org.json.*;
import java.io.*;
public class jsonD {
    public static void main(String[] args) {
        try {
            JSONArray arr =new JSONArray();
            JSONObject js = new JSONObject();
            js.put("id",1);
            js.put("name","Manoj S");
            js.put("Course","Java");
            JSONObject js1 = new JSONObject();
            js1.put("id",2);
            js1.put("name","Manu");
            js1.put("Course","python");
            JSONObject js2 = new JSONObject();
            js2.put("id",3);
            js2.put("name","speed");
            js2.put("Course","go");
            arr.put(js);
            arr.put(js1);
            arr.put(js2);

            BufferedWriter os = new BufferedWriter(new FileWriter("data.json",true));
            os.write(arr.toString(4));
            System.out.println(js1.toString(4));
            os.close();
        }catch (Exception e){

        }
    }
}
