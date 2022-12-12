/* Find the target in Array */

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,4,8};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findIndex(arr, 4, 0, list);
        System.out.println(ans);
    }

    static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndex(arr, target, index+1, list);
    }
}
