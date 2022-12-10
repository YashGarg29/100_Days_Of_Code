/* Product of the digits of an integer */

public class DigitProduct {
    public static void main(String[] args) {
        int n = 13042;
        System.out.println(product(n));
    }

    static int product(int n) {
        if (n%10 == 0) {
            return 0;
        }
        if (n%10 == n) {
            return n;
        }
        return (n%10) * product(n/10);
    }
}
