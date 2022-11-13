package problems;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
//        String word = "hello";
//        System.out.println(word.charAt(0));

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
//        System.out.println(ch);


    }
}
