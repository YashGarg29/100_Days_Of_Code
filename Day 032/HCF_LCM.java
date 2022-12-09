package Math_II_problems;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println(hcf(224, 105));

        System.out.println(lcm(8, 12));
    }
    static int hcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        return hcf(b % a, a);
    }

    static int lcm(int a, int b) {
        return a * b / hcf(a, b);
    }
}
