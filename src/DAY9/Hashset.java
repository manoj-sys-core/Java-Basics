package DAY9;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);
        nums.add(10);
        for (int i:nums){
            System.out.println(i);
        }

    }
}
