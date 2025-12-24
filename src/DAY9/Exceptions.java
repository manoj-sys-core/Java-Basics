package DAY9;
import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int ans = 5/1;
            System.out.println("Division :"+ans);
            try {
                System.out.println("Enter the age: ");
                int age = sc.nextInt();
                if (age<18){
                    throw new AgeException("Not Eligible");
                }
            }catch (AgeException e){
                System.out.println(e.getMessage());
            }
        }catch (ArithmeticException e){
            System.out.println("Error Occured");
        }finally {
            System.out.println("Program Ended");
        }
        sc.close();
    }
}
