
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);

//        int counter = 100;
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);

//        long counter =2L;
//        do {
//            System.out.println(counter);
//            counter *= counter;
//        } while (counter < 1000000L);

//        for(int counter = 100; counter >= -10; counter -=5){
//            System.out.println(counter);
//        }

//        for(long counter = 2L; counter < 1000000L; counter *= counter){
//            System.out.println(counter);
//        }

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        FIZZBUZZ

//        for(int i = 1; i <= 100; i++){
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        TABLE OF POWERS
//        What number would you like to go up to? 5
//        Here is your table!
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        Scanner scanner = new Scanner(System.in);
//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to? ");
//            int userInt = scanner.nextInt();
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++){
//                System.out.format("%-6d", i);
//                System.out.print(" | ");
//                System.out.format("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.print("Would you like to enter another number (y/n)? ");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while (userContinues);


//        Grades

//        Scanner scanner = new Scanner(System.in);
//
//        boolean anotherGrade = true;
//
//        do {
//            System.out.print("Please enter a numerical grade from 0 to 100 ");
//
//            int numericGrade = scanner.nextInt();
//
//            if (numericGrade >= 88) {
//                System.out.println("A");
//            } else if (numericGrade >= 80) {
//                System.out.println("B");
//            } else if (numericGrade >= 67) {
//                System.out.println("C");
//            } else if (numericGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.print("Do you wish to enter a new grade? ");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//        } while (anotherGrade);
    }
}