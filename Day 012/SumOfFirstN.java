/* Sum of First N natural numbers */

public class SumOfFirstN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumN(n));
    }
    static int sumN (int n) {
       n = n * (n + 1) / 2;
       return n;
    }
}
