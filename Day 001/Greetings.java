package problems;

import java.util.Scanner;

public class Name2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(greeting(name));
    }
    static String greeting(String name) {
        String hello = "Hello " + name;
        return hello;
    }
}
