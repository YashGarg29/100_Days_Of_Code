/*
Find Unique Element which is not duplicate
*/

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(uniqueElement(arr));
    }
    static int uniqueElement(int[] arr) {
        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
