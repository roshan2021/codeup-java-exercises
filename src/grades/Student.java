package grades;

//to use Arrays
import java.util.ArrayList;

//Created class name Student
public class Student {

    //Private properties for student's name
    private String name;
    //Private properties for grades. Grades property should be an ArrayList of integers
    private ArrayList<Integer> grades = new ArrayList<>();

    //student class should have constructor to set name property
    public Student(String name) {
        this.name = name;
    }

    //returns Student name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    //gets grades in array list
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total / grades.size();
    }


    //Test the Student class and create Student objects
    //Verify you can add grades to each object
    //Verify getGradeAverage() correctly returns the average of the student's grade
    public static void main(String[] args){
        Student s1 = new Student("Roshan");
//        s1.grades [] = {100, 50};

//    System.out.println("Student's name : " + s1.name + "grades are : " + grades);
    }

}