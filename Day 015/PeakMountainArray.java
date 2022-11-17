/*
Find Peak element
Input: nums = [1,2,1,3,5,6,4]
Output: 5
*/
public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // decreasing part of array
                start = mid + 1;
            } else{
                // ascending part of array 
                end = mid;
            }
        }
        return start;
    }
}
