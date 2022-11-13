package problems;

public class Fibonacci_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(fibo(a, b));
    }
    static int fibo(int num1, int num2) {
        int n = 9;
        for(int i = 0; i < n; i++) {
            System.out.println(num1);
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }
        return num1;
    }
}
