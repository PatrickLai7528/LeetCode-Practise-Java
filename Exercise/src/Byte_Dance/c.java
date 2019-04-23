package Byte_Dance;/*
 * @PackageName Byte_Dance
 * @ClassName c
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int len = in.nextInt();
                int[] inps = new int[len];
                for (int j = 0; j < len; j++) {
                    inps[j] = in.nextInt();
                }
                int[] dp = new int[len];
                dp[0] = 1;
                for (int j = 1; j < len; j++) {
                    if (inps[j] > inps[j - 1])
                        dp[j] += Math.max(dp[j - 1], dp[0]) * 2 + 1;
                    else
                        dp[j] = dp[j - 1] + 1;
                }
                System.out.println(dp[dp.length - 1]);
            }
        }
    }
}
