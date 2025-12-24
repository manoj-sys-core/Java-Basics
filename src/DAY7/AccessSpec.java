package DAY7;
class Stat{
    private int num;
    private String val;
    public void setvals(int num,String val){
        this.num = num;
        this.val=val;
    }
    public int getnum(){
        return num;
    }
}

public class AccessSpec {
    public static void main(String[] args) {
        Stat s1 = new Stat();
        s1.setvals(07,"Manoj");
        int num = s1.getnum();
        System.out.println(num);

    }
}
