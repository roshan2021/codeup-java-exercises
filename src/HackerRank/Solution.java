package HackerRank;

import java.util.Scanner;

//Note: If you use the nextLine() method immediately following the nextInt() method,
//        recall that nextInt() reads integer tokens; because of this, the last newline
//        character for that line of integer input is still queued in the input buffer
//        and the next nextLine() will be reading the remainder of the integer line (which is empty).

public class Solution {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int input = N.nextInt();
        if(input % 2 == 1){
            System.out.println("Weird");
        } else if(input >= 2 &&  input <= 5){
            System.out.println("Not Weird");
        } else if (input <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
//        scanner.close();
    }
}


//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        if((n % 2) != 0)
//        {
//            System.out.println("Weird ");
//        }
//        else if(((n % 2) == 0) && (n >= 2) && (n <= 5))
//        {
//            System.out.println("Not Weird");
//        }
//        else if(((n % 2) == 0) && (n >= 6) && (n <= 20))
//        {
//            System.out.println("Weird");
//        }
//        else
//        {
//            System.out.println("Not Weird");
//        }
//
//    }
//}


//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        if(N % 2 !=0)
//            System.out.println("Weird");
//        else if(N % 2 == 0){
//            if(N>=2 && N<=5)
//                System.out.println("Not Weird");
//            else if(N>=6 && N<=20)
//                System.out.println("Weird");
//            else if(N>20)
//                System.out.println("Not Weird");
//        }
//    }
//}



//public class Solution {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        if(N%2==1)
//            System.out.println("Weird");
//        else
//        {
//            if(N>=2&&N<=5)
//                System.out.println("Not Weird");
//            else if(N<=20)
//                System.out.println("Weird");
//            else
//                System.out.println("Not Weird");
//        }
//    }
//}


//        Given an integer, perform the following conditional actions:
//
//        If N is odd, print Weird
//        If N is even and in the inclusive range of 2 to 5, print Not Weird
//        If N  is even and in the inclusive range of 6 to 20, print Weird
//        If N is even and greater than 20 , print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.
//
//        Input Format
//
//        A single line containing a positive integer, .
//
//        Constraints
//
//        Output Format
//
//        Print Weird if the number is weird; otherwise, print Not Weird.
//
//        Sample Input 0
//
//        3
//        Sample Output 0
//
//        Weird
//        Sample Input 1
//
//        24
//        Sample Output 1
//
//        Not Weird
//        Explanation
//
//        Sample Case 0:
//        is odd and odd numbers are weird, so we print Weird.
//
//        Sample Case 1:
//        and  is even, so it isn't weird. Thus, we print Not Weird