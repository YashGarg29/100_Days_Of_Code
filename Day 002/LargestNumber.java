package problems;

import java.util.Scanner;

public class Largest_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 20;
        int num2 = 30;
        System.out.println(large(num1, num2));
    }
    static int large(int num1, int num2) {
        int ans = Math.max(num1, num2);
        return ans;
    }
}
