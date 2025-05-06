package Homework4_2;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram (String a, String b) {

        return Arrays.equals(countLetters(a), countLetters(b));
    }
    /**
     * Helper method to count how many times each letter (a-z) appears .
     */
    public static int [] countLetters (String s) {
        int [] counts = new int [26];
        s=s.toLowerCase();
        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic(c)){
                counts[c-'a']++;
            }
        }
        return counts ;
    }
    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts (String s) {
        int[] A=countLetters(s);
        StringBuilder letters = new StringBuilder();
        for (int i=0;i<A.length;i++) {
            if(A[i]>0){
                letters.append((char) (i + 'a')).append(": ").append(A[i]).append("\n");
            }
        }
        System.out.println(letters);
    }
    public static void main( String [] args) {
        Scanner scanner = new Scanner (System.in);
// Get two strings from the user
        System .out.print (" Enter the first string: ");
        String word1 = scanner . nextLine ();
        System .out.print (" Enter the second string: ");
        String word2 = scanner . nextLine ();
// TODO: Process the strings here (ignore spaces , case)
        System .out. println (" Are they anagrams ? " + isAnagram (word1 , word2 ));
        printLetterCounts (word1 );
    }
}
