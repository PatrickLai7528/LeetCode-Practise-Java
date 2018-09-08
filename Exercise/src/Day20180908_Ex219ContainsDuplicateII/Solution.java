package Day20180908_Ex219ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(map);
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    map.put(nums[i], Math.abs(i - map.get(nums[i])));
                    return true;
                } else {
                    map.put(nums[i], Math.abs(i));
                }
            }
        }
        return false;
    }

    public static void main(String[] agrs) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0};
        System.out.println(solution.containsNearbyDuplicate(nums, 1));
    }
}
