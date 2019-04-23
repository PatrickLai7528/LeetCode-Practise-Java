package Ex464;/*
 * @PackageName Ex464
 * @ClassName Solution
 * @Author Lai Kin Meng
 * @Date 2019-03-19
 * @ProjectName LeetCode-Practise
 */

public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int[] nums = new int[maxChoosableInteger];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        return canIWin(nums, 0, nums.length - 1, desiredTotal, 1);
    }

    private boolean canIWin(int[] nums, int l, int r, int target, int p) {
        if (l > r) return p % 2 == 1;
        if (nums[l] >= target || nums[r] >= target) return p % 2 == 1;

        boolean chooseMin = canIWin(nums, l + 1, r, target - nums[l], p+1);
        boolean chooseMax =  canIWin(nums, l, r - 1, target - nums[r], p+1);
        return chooseMax || chooseMin;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canIWin(10, 40));
    }

}
