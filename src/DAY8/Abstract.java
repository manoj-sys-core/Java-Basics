package DAY8;
abstract class vech{
    abstract void hello();
    void fuel(){
        System.out.println("Fueling ....");
    }
}
class car extends vech{
    @Override
    void hello(){
        System.out.println("Hello world!");
    }
}
public class Abstract {
    public static void main(String[] args) {
        vech v1 = new car();
        v1.fuel();
        v1.hello();
    }
}
