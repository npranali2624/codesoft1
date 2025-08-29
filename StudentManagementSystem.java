package CODSOFT.Task5_StudentManagmentSystem;

 import java.util.*;

class Student 
{
    String name;
    int rollNo;
    String grade;

    public Student(String name, int rollNo, String grade) 
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString()
    {
        return "Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagementSystem
{
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;

        do 
        {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student\n2. Remove Student\n3. Search Student\n4. View All Students\n5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> searchStudent();
                case 4 -> viewStudents();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void addStudent() 
    {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll no: ");
        int roll = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        studentList.add(new Student(name, roll, grade));
        System.out.println("Student added.");
    }

    static void removeStudent() 
    {
        System.out.print("Enter roll no to remove: ");
        int roll = sc.nextInt();
        studentList.removeIf(s -> s.rollNo == roll);
        System.out.println("If student existed, they are removed.");
    }

    static void searchStudent() 
    {
        System.out.print("Enter roll no to search: ");
        int roll = sc.nextInt();
        for (Student s : studentList) 
        {
            if (s.rollNo == roll) 
            {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void viewStudents() 
    {
        if (studentList.isEmpty()) 
        {
            System.out.println("No students available.");
        } 
        else 
        {
            System.out.println("All Students:");
            for (Student s : studentList) 
            {
                System.out.println(s);
            }
        }
    }
}
   

