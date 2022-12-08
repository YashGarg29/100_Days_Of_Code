/* Find the Sq root of an Integer */

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.5f",sqrt(n, p));
    }

    // Time: O(log(N))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n ) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        double root = e;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
