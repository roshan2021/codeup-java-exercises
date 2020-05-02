
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        String coffeeShop = "Starbucks";
        System.out.printf("I would like some %s this morning! \n", coffeeShop);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter something ");
//        String userInput = scanner.next();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


        double pi = 3.14159;
//        String valueOfPi = "The value of pi is approximately " + pi;
//        System.out.format(valueOfPi);
//        System.out.println("The value of pi is approximately " + pi);
//        System.out.printf("The value of pi is approximately %.2f.", pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        //int userIntInput = scanner.nextInt();
        int userIntInput = Integer.parseInt(scanner.nextLine());
        System.out.println("The user entered number: " + userIntInput);


        System.out.println("Enter 3 words");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.printf("You entered: %s, %s, %s", word1, word2, word3);

        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println("Your sentence is: " + sentence);

        System.out.println("Enter length of Codeup Classroom");
        float userLength = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter width of Codeup Classroom");
        float userWidth = Float.parseFloat(scanner.nextLine());


        float perimeter = (2 * userLength) + (2 * userWidth);
        float area = userLength * userWidth;
        System.out.println("Perimeter of Codeup Class is " + perimeter);
        System.out.println("Area of the Codeup Class is " + area);
    }
}

