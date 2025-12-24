package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Save to File");
            System.out.println("4. Load from File");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1-> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    manager.addStudent(new Student(id, name, marks));
                    System.out.println("Student added successfully.");
                }
                case 2-> manager.displayStudents();
                case 3-> manager.saveToFile();
                case 4-> manager.loadFromFile();
                case 5-> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                }
                default-> System.out.println("Invalid choice.");
            }
        }
    }
}
