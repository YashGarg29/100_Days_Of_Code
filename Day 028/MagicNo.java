/*
Find value of 6th no in terms of Base is 5
 */
public class MagicNo {
    public static void main(String[] args) {
        int n = 6;

        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            ans += last * base;
            n >>= 1; // Right shift by 1
            base *= 5;
        }

        System.out.println(ans);
    }

}
