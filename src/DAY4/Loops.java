package DAY4;

public class Loops {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i =5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=1;i<=7;i++){
            for(int s=1;s<=7-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=7;i>=1;i--){
            for(int s=1;s<=7-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("==================");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println("==================");
        int num =1;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+++" ");
            }
            System.out.println(" ");
        }
        System.out.println("==================");
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| i == n || j==1||j==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("==================");
        for(int i=7;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
