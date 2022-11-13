package problems;

import java.util.Scanner;

public class USD_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float INR = in.nextFloat();
        float USD = 81.95f;

        System.out.println(dollar(INR, USD));
    }
    static float dollar(float rs, float US) {
        float ans = rs / US;
        return ans;
    }
}
