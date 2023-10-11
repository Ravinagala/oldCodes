import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private int rollNumber;

    private int marks;

    public Student1(int rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class StudentsInFibonacciSeries{
    public static void main(String[] args) {
        int n = 100;

        List<Student1> students = new ArrayList<>();
        List<Student1> fibonacciStudents = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            int randomMarks = (int) (Math.random() * 100);
            students.add(new Student1(i,randomMarks));

        }
        int firstTerm = 0;
        int secondTerm = 1;

        while(firstTerm<=100){
            for(Student1 student1 : students){
                if(student1.getRollNumber() == firstTerm){
                    fibonacciStudents.add(student1);
                }
            }

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("Students in fibonacci series:");
        for(Student1 student1 : fibonacciStudents){
            System.out.println("Roll number:  "+ student1.getRollNumber() + ", Marks : "+ student1.getMarks());

        }

    }
}
