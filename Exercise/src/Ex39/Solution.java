package Ex39;/*
 * @PackageName Ex39
 * @ClassName Solution
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, curr, res);
        return res;
    }

    private void dfs(int[] candidates, int target, int s, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = s; i < candidates.length; i++) {
            if (candidates[i] > target)
                break;
            curr.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = new int[]{2, 3, 6, 7,};
        System.out.println(solution.combinationSum(candidates, 7));
    }
}
