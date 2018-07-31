package Ex279PerfectSquares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 * Example 2:
 * <p>
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 */
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i * i <= n; i++)
            dp[i * i] = 1;
        for (int i = 1; i <= n; i++) {  //选定第一个数为 i
            for (int j = 1; i + j * j <= n; j++) {  //选定另一个数为 j*j
                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);  //从小到大查找
            }
        }
        return dp[n];

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.numSquares(13));
//        System.out.println(solution.numSquares(12));
        System.out.println(solution.numSquares(19));
    }
}
