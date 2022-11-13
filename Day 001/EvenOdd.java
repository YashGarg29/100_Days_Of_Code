package problems;

public class EvenOdd2 {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(evenOdd(num));
    }
    static String evenOdd (int num) {
        if (num % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
