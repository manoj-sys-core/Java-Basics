package DAY8;

interface animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
interface alpha{
    void show();
}
interface beta{
    void display();
}
interface gama{
    int num = 7;
}
class a implements alpha,beta,gama{
    public void show(){
        System.out.println("Alpha");
    }
    public void display(){
        System.out.println("Beta");
    }
    void prints(){
        System.out.println("Ronaldo: "+num);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        a b = new a();
        b.show();
        b.display();
        b.prints();
    }
}
