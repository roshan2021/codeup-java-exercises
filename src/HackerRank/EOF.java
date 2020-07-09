package HackerRank;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int lineNumber = 1;
    while(input.hasNext()){
        System.out.println(lineNumber++ + " " + input.nextLine());
        }
    }
}


