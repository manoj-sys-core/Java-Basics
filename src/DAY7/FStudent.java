package DAY7;
class student{
    private int id;
    private String name;
    student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return  id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Student ID: "+id+" | Student Name: "+name);
    }
}
public class FStudent {
    public static void main(String[] args) {
        student s1 = new student(7,"Manoj");
        String name = s1.getName();
        int id = s1.getId();
        System.out.println("id :"+id+" | name: "+name);
        s1.setName("Manu");
        s1.display();
    }
}
