/*
Richest Customer Wealth
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
*/

public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts=  {
            {1, 2, 3},
            {3, 2, 1}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
