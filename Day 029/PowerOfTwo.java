/*
Check an integer is a value of power of 2 or not ?
*/
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;

        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
