package problems;

public class DiffProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(diff(n));
    }
    static int diff(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        return product - sum;
    }
}
