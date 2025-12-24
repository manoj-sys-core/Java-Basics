package DAY7;
// class Student
class Student{
    int id;
    String name;
    void display(){
        System.out.println("ID : "+id+" | Name: "+name);
    }
}

//with constructor
class Car{
    int num;
    String brand;
    Car(int num,String brand){
        this.brand = brand;
        this.num = num;
    }
    void show(){
        System.out.println("Number: "+num+" | Brand: "+brand);
    }
}

public class OOPPart1 {
    public static void main(String[] args) {
//        objects instances of the class Student
        Student s1 = new Student();
        s1.name = "Manoj S";
        s1.id = 17;
        s1.display();
        Student s2 = new Student();
        s2.name = "Speed";
        s2.id = 07;
        s2.display();
        Car c1 = new Car(54,"Porsche");
        Car c2 = new Car(87,"BMW");
        c1.show();
        c2.show();
    }
}
