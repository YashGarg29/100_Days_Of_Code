/* Count the total 0s in a number */

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(302102));
    }
    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a number to above calls
    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
//            return helper(n/10, c+1);
            c++;
        }
        return helper(n/10, c);
    }
}
