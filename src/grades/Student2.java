package grades;


import java.util.ArrayList;

public class Student2 {
    private String name;
    private ArrayList<Integer> grades;

    public Student2(String aName){
        this.name = aName;
        this.grades  = new ArrayList<>();
    }



    // returns the student's name
    public String getName(){
        return this.name;
    }


    // adds the given grade to the grades property and takes in a PARAMETER
    public void addGrade(int grade){
        this.grades.add(grade);
    }


    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for( Integer grade : this.grades ){
                sum += grade;
        }
        return sum / this.grades.size();
    }

}
