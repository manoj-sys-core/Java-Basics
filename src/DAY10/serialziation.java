package DAY10;
import java.io.*;
class Student implements Serializable{
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
}
public class serialziation {
    public static void main(String[] args) {
        try {
            // Write object
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("student.dat"));
            oos.writeObject(new Student("Manoj S",7));
            oos.close();

            // Read object
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("student.dat"));
            Student s = (Student) ois.readObject();
            ois.close();

            System.out.println(s.id + " " + s.name);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}