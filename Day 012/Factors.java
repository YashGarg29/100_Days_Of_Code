/* Total number of factors of an integer */

public class Factors {
    public static void main(String[] args) {
        int num = 60;
        System.out.println(factor(num));
    }
    static int factor (int num) {
        int count = 0;
        for (int i = 1; i <= num; i ++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
