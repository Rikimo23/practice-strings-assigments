// Problem: https://www.hackerrank.com/challenges/java-string-reverse
// Difficulty: Easy
// Score: 10


import java.util.Scanner;

public class javastringreverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(str.equalsIgnoreCase(rev) ? "Yes" : "No");


        s.close();
    }
}