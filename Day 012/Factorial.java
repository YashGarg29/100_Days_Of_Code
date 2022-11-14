/* Print the factorial of a number by defining a method named 'Factorial' */

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    static int factorial (int num) {
        int value = 1;
        for (int i = 2; i <= num; i++) {
            value *= i;
        }
        return value;
    }
}
