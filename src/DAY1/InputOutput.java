package DAY1;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :");
        String name = sc.nextLine();
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Hello! " + name + ",you are " + age + " old.");
    }
}
