package problems;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 30;
        int num2 = 10;

        System.out.print("Operator : ");
        char op = in.next().trim().charAt(0);

        System.out.println(value(num1, num2, op));
    }

    static int value (int num1, int num2, char op) {
        int ans;
            if (op == '+') {
                ans = num1 + num2;
            }
            else if (op == '-') {
                ans = num1 - num2;
            }
            else if (op == '*') {
                ans = num1 * num2;
            }
            else if (op == '/' && num2 != 0) {
                ans = num1 / num2;
            } else {
            return -1;
            }
        return ans;
    }
}
