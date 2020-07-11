package HackerRank;

import java.util.Arrays;

public class Anagram2 {
    public static boolean isAnagram(String word1, String word2){
        char[] firstWord = word1.toLowerCase().toCharArray();
        char[] secondWord = word2.toLowerCase().toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        return Arrays.equals(firstWord, secondWord);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "HELLO"));
        System.out.println(isAnagram("October", "octoberFirst"));
    }
}
