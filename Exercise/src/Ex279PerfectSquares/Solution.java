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
//        // 產生少於n的完美數
////        List<Integer> perfectNums = new ArrayList<>();
////        perfectNums.add(1);
////        for (int i = 1; i * i <= n; i++) {
////            perfectNums.add(i * i);
////        }
////
//////        // n是完美數
//////        if (perfectNum.contains(n))
//////            result = 0;
//////
//////        for (int i = perfectNum.size() - 1; i >= 0; i--) {
//////            int currentNum = perfectNum.get(i);
//////            n = n - currentNum;
//////            result ++;
//////            if(n == 0)
//////                break;
//////
//////        }
//////
////        int counter2 = 0;
////        for (int i = perfectNums.size() - 1; i >= 0; i--) {
////            if (n % perfectNums.get(i) == 0) {
////                System.out.println(perfectNums.get(i));
////                counter2 = n / perfectNums.get(i);
////                break;
////            }
////        }
////        return Math.min(counter2, numSquares(0, n, perfectNums));
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i = 0; i * i <= n; i++)
            dp[i * i] = 1;
        for(int i = 1; i <= n; i++) {  //选定第一个数为 i
            for(int j = 1; i + j * j <= n; j++) {  //选定另一个数为 j*j
                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);  //从小到大查找
            }
        }
        return dp[n];

    }

//    private int numSquares(int counter, int num, List<Integer> perfectNums) {
//        if (perfectNums.contains(num))
//            return ++counter;
//        else {
//            int trialPerfectNum = Collections.max(perfectNums);
//            for (int i = perfectNums.size() - 1; i > 1; i--) {
//                int integer = perfectNums.get(i);
//                if (perfectNums.contains(num % integer)) {
//                    trialPerfectNum = integer;
//                } else {
//                    int remain = num % integer;
//                    for (Integer integer1 : perfectNums) {
//                        if (integer1 != 1 && remain % integer1 == 0) {
//                            trialPerfectNum = integer;
//                            break;
//                        }
//                    }
//                }
//            }
//            int leftNum = num - trialPerfectNum;
//            System.out.println(trialPerfectNum);
//            if (perfectNums.contains(leftNum)) {
//                return numSquares(++counter, leftNum, perfectNums);
//            } else {
//                List<Integer> newPerfectNums = new ArrayList<>();
//                for (Integer integer : perfectNums) {
//                    if (integer < leftNum)
//                        newPerfectNums.add(integer);
//                }
//                return numSquares(++counter, leftNum, newPerfectNums);
//            }
//        }
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.numSquares(13));
//        System.out.println(solution.numSquares(12));
        System.out.println(solution.numSquares(19));
    }
}
