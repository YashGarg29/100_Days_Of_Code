/*
Find First and Last Position of Element in Sorted Array
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check the first occurence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of the target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
