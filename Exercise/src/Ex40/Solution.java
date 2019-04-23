package Ex40;/*
 * @PackageName Ex40
 * @ClassName Solution
 * @Author Lai Kin Meng
 * @Date 2019-03-19
 * @ProjectName LeetCode-Practise
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++)
            System.out.print(candidates[i] + "");
        dfs(res, curr, candidates, used, target, 0);
        return res;
    }


    private void dfs(List<List<Integer>> res, List<Integer> curr, int[] nums, boolean[] used, int target, int s) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = s; i < nums.length; i++) {
            if (nums[i] > target) break;
//            if (used[i]) continue;
//            used[i] = true;
            curr.add(nums[i]);
            dfs(res, curr, nums, used, target - nums[i], i + 1);
            curr.remove(curr.size() - 1);
//            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{10, 1, 2, 7, 6, 1, 5};
        System.out.println(solution.combinationSum2(nums, 8));
    }
}
