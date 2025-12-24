package DAY8;
interface Payment{
    void pay();
}
class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("Can proceed the UPI Payment...");
    }
}
public class InterfaceTask {
    public static void main(String[] args) {
        UPI a = new UPI();
        a.pay();
    }
}
