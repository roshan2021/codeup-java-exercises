package HackerRank;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence of words");
        String s = scan.nextLine();

        s = s.trim();
        if(s.length() == 0 ){
            System.out.println(0);
            return;
        }

        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);

        for(String word : words)
            System.out.println(word);
    }
}
