package HackerRank;

import java.util.Scanner;

public class ProblemIntDoubleString{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  //create a Scanner Object
        System.out.println("Enter an integer");
        int integerValue = scanner.nextInt();  //create variable int integer, assign it to read user's input integer data type value
        System.out.println("Enter a Double");
        double doubleValue = scanner.nextDouble(); //create variable double, assign to read user's double data type value
        scanner.nextLine();
        System.out.println("Enter a sentence");
        String stringValue = scanner.nextLine(); //stringValue to read user's string value input

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Integer: " + integerValue);
    }
}

//public class ProblemIntDoubleString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        double y = sc.nextDouble();
//        sc.nextLine();
//        String s = sc.nextLine();
//
//        System.out.println("String: "+ s);
//        System.out.println("Double: "+ y);
//        System.out.println("Int: "+ x);
//    }
//}