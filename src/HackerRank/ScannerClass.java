package HackerRank;

import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args){
        System.out.println("Enter user's name, age, favorite dog's name, and years of experience in industry.");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();


        int age = input.nextInt();
        input.nextLine();


        System.out.println("Enter favorite color");
        String color = input.nextLine();
        String dogsName = input.nextLine();
        int yearsExperience = input.nextInt();
        System.out.println(input.nextLine());


        System.out.println("User's name is " + name + ". User's age is " + age + ". User's favorite color is " + color + ". User's favorite dog's name is " + dogsName + ". User's years of experience in industry is " + yearsExperience + "." );

    }
}


//package HackerRank;
//
//import java.util.Scanner;
//
//class ScannerClass {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myObj.nextLine();
//
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//    }
//}