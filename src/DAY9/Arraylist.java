package DAY9;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        for (int i:nums){
            System.out.println(i);
        }
        System.out.println(nums.get(0));
    }
}
