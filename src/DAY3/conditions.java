package DAY3;

public class conditions {
    public static void main(String[] args) {
//        basic if condition
        int a = 10;
        if(a<5){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//        nested conditions
        double temp = 28.8;
        if (temp > 32) {
            System.out.println("High");
        }else if(temp == 32){
            System.out.println("Room temperature");
        }else if(temp < 32){
            System.out.println("Low");
        }else{
            System.out.println("Invalid");
        }
        int age = 21;
        boolean id = false;
        if(age>=18) {
            if (id == true) {
                System.out.println("Approved");
            } else {
                System.out.println("ID Required");
            }
        }else{
            System.out.println("Not Allowed");
        }
        String day = "Wed";
        switch (day){
            case "mon" -> System.out.println("Day 1");
            case "tue" -> System.out.println("Day 2");
            case "Wed" -> System.out.println("Day 3");
        }

    }
}
