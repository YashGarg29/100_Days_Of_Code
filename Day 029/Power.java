/*
Calculate the values of 3^^5
*/
public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 5;

        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            power >>= 1;
        }
        System.out.println(ans);
    }
}
