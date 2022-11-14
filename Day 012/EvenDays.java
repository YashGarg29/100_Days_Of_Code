/* Total number of even days in August */

public class EvenDays {
    public static void main(String[] args) {
        int August = 31;
        int count = 0;
        for (int i = 0; i <= August; i+=2) {
            count++;
        }
        System.out.println(count);
    }
}
