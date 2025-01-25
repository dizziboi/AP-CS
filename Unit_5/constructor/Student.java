package constructor;
/**
 * class Student with 4 instance variables, a constructor, a print method, and a
 * main method to test them.
 */
public class Student
{
    // Write 4 instance variables
    private int age;
    private int grade;
    private double gpa;
    private String club;
    // Write a constructor with 4 parameters to initialize all of the instance
    // variables
    public Student(int studentAge, int studentGrade, double studnetGpa, String studentClub){
        age = studentAge;
        grade = studentGrade;
        gpa = studnetGpa;
        club = studentClub;
    }
    // Write a print method that prints all the instance variables
    public void print() {
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Gpa: " + gpa);
        System.out.println("Clubs: " + club);
    }

    // main method
    public static void main(String[] args)
    {
        // Construct 2 Student objects using the constructor with different values
        Student caleb = new Student(17,88,3.5,"tsa and frc");
        Student jude = new Student(18,95,4.0,"bsu and tsa");
        // call their print() methods
        caleb.print();
        jude.print();
    }
}