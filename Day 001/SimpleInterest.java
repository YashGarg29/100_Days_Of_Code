package problems;

import java.util.Scanner;

public class SI_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principal : ");
        int P = in.nextInt();

        System.out.print("Rate : ");
        int R = in.nextInt();

        System.out.print("Time : ");
        int T = in.nextInt();

        System.out.println(si(P, R, T));
    }
    static int si (int P, int R, int T) {
        int ans = (P * R * T) / 100;
        return ans;
    }
}
