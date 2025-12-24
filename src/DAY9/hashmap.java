package DAY9;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> emps = new HashMap<>();
        emps.put("Java",90);
        emps.put("DSA",85);
        int val = emps.get("Java");
        System.out.println(val);
    }
}
