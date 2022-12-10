/* Sum of the digits of an integer */

public class DigitSum {
    public static void main(String[] args) {
        int n = 2342;
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) + sum(n/10);
    }
}
