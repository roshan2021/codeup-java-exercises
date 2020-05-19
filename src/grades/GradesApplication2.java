package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication2 {

    static Input  input  = new Input();

    public static void main(String[] args) {

        HashMap<String, Student2> students = new HashMap<>();

        Student2 justin = new Student2("Justin R");
        justin.addGrade(90);
        System.out.println(justin.getGradeAverage());
        System.out.println(justin.getGradeAverage() == 90);
        justin.addGrade(70);
        System.out.println(justin.getGradeAverage() == 80);

        Student2 sophie = new Student2("Sophie K");
        sophie.addGrade(100);
        sophie.addGrade(50);

        students.put("jreusjt22323", justin);
        students.putIfAbsent("sopheiei84848", sophie);

        cli(students);
    }



    public static void cli(HashMap<String, Student2> students) {
        System.out.println("Welcome!\n" + "\n" +
                "Here are the GitHub usernames of our students:");

        for (String key : students.keySet()) {
            System.out.println(key + " ");
        }
        System.out.println("What student would you like to see more information on?");
            String userInput = input.getString();
    }
}
