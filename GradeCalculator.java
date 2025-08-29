package CODSOFT.Task2_GradeCalculator;
import java.util.Scanner;

public class GradeCalculator 
{
   public static void main(String[] args) 
   {
        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects? ");
        int subjects = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= subjects; i++) 
        {
            System.out.print("Enter marks for subject " + i + ": ");
            int mark = input.nextInt();
            sum = sum + mark;
        }

        double average = sum / (double) subjects;
        String grade;

        if (average >= 90) 
        {
            grade = "A+";
        } 
        else if (average >= 80) 
        {
            grade = "A";
        } 
        else if (average >= 70) 
        {
            grade = "B";
        } 
        else if (average >= 60) 
        {
            grade = "C";
        } 
        else if (average >= 50) 
        {
            grade = "D";
        } 
        else 
        {
            grade = "F";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + average + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}

