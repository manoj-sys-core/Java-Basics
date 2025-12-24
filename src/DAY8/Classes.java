package DAY8;
class Animal{
    void sounds(){
        System.out.println("Amimal Barks.....");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks .....");
    }
}
class Vehicle{
    void start(){
        System.out.println("Staring.........");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car Drives......... ");
    }
}
public class Classes {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        a1.sounds();
        a1.bark();
        Car bmw = new Car();
        bmw.start();
        bmw.drive();
    }
}
