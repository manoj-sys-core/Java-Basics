package DAY8;
class Person{
    Person(String name){
        System.out.println("Name: "+name);
    }
}
class Employee extends Person{
    Employee(){
        super("Manoj S");
    }
}
class Check{
    int num = 10;
    void add(int a,int b){
        System.out.println("Sum "+ a+b);
    }
}
class Test extends Check{
    int x = 19;
    void dis(){
        System.out.println(x);
        System.out.println(super.num);
        super.add(5,8);
    }
}
//Method overriding
class Shape{
    void draw(){
        System.out.println("Draws any shape...");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Draws a Circle....");
    }
}
public class SuperKey {
    public static void main(String[] args) {
        Employee e1= new Employee();
        Test c1 = new Test();
        c1.dis();
        Shape s1 = new Circle();
        s1.draw();
    }
}
