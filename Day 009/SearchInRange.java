package problems;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {13, 34, 76, 67, 82, 34};
        int target = 67;
        System.out.println(linearSearch(nums, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
