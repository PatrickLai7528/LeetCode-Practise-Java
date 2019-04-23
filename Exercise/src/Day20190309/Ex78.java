package Day20190309;/*
 * @PackageName Day20190309
 * @ClassName Ex78
 * @Author Lai Kin Meng
 * @Date 2019-03-09
 * @ProjectName LeetCode-Practise
 */

import java.util.ArrayList;
import java.util.List;

public class Ex78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++)
            dfs(nums, 0, i, ans, curr);
        return ans;
    }

    private void dfs(int[] src, int s, int n, List<List<Integer>> ans, List<Integer> cur){
        if(cur.size() == n){
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i = s; i < src.length; i++){
            cur.add(src[i]);
            dfs(src, s + 1, n, ans, cur);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        Ex78 ex78 = new Ex78();
        System.out.println(ex78.subsets(nums));
    }
}
