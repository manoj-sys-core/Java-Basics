package DAY6;

public class MethodsNScope {
//    Basic Methods
    static void Sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    static int Square(int num){
        return num * num;
    }
//    Method Overloading
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static String add(String a,String b){
        return a+b;
    }
    static void multiply(int a,int b){
        System.out.println("Product :"+(a*b));
    }
    static void multiply(int a,int b,int c){
        System.out.println("Product :"+(a*b*c));
    }
//    Scope
    static int count = 8;
    static void check(){
        int count = 9;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Sum(8,4);
        int ans = Square(4);
        System.out.println("Square: "+ans);
        System.out.println("Int Add: "+ add(5,3));
        System.out.println("Double Add: "+add(3.14,71.56));
        System.out.println("String Add: "+add("Manoj"," S"));
        multiply(5,8);
        multiply(6,5,4);
        check();
    }
}
