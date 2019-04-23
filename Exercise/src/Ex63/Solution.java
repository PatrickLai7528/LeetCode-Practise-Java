package Ex63;/*
 * @PackageName Ex63
 * @ClassName Solution
 * @Author Lai Kin Meng
 * @Date 2019-03-19
 * @ProjectName LeetCode-Practise
 */

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1)
            return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {

                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                    continue;
                }

                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                    continue;
                }

                if(obstacleGrid[i][j - 1] != 1 && obstacleGrid[i - 1][j] != 1 )
                    dp[i][j] = dp[i][j - 1] +  dp[i - 1][j];
                else if(obstacleGrid[i][j - 1] == 1)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i][j-1];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("");
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0}};
        nums[1][1] = 1;
        System.out.println(new Solution().uniquePathsWithObstacles(nums));
    }
}
