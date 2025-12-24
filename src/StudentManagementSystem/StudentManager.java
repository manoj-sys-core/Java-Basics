package StudentManagementSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import org.json.*;

class StudentManager{
    private ArrayList<Student> students = new ArrayList<>();
    void addStudent(Student s){
        students.add(s);
    }
    void displayStudents(){
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s:students){
            System.out.println(s.toString());
        }
    }
    void saveToFile(){
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        JSONArray studentsData = new JSONArray();
        try {
            for (Student s : students) {
                JSONObject studentN = new JSONObject();
                studentN.put("id", s.getId());
                studentN.put("name", s.getName());
                studentN.put("marks", s.getMarks());
                studentsData.put(studentN);
            }
            BufferedWriter bf = new BufferedWriter(new FileWriter("students.json"));
            bf.write(studentsData.toString(4));
            bf.close();
            System.out.println("Students saved successfully.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void loadFromFile(){
        students.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.json"));
            StringBuilder sb = new StringBuilder();
            String l;
            while ((l = br.readLine())!=null){
                sb.append(l);
            }
            br.close();
            String jsonData = sb.toString();
            JSONArray arr = new JSONArray(jsonData);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);

                int id = obj.getInt("id");
                String name = obj.getString("name");
                int marks = obj.getInt("marks");

                Student s = new Student(id, name, marks);
                students.add(s);
            }

            System.out.println("Students loaded from file.");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
