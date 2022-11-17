/*
Find In Mountain Array
Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
*/

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 4, 5, 3, 2, 1};
        int target = 4;
        System.out.println(search(arr, target));
    }

    static int search (int[] arr, int target) {
        int peak = mountPeak(arr);
        int leftArr = binarySearch(arr, target, 0, peak);
        if (leftArr != -1) {
            return leftArr;
        }
        // try to search in second half
        return binarySearch(arr, target, peak+1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAscend = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscend) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int mountPeak (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        return start;
    }
}
