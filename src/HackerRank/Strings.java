package HackerRank;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        int aLength = A.length();
        int bLength = B.length();

        System.out.println(aLength + bLength);

        int result = A.compareTo(B);

        if(result > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " +
                B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
