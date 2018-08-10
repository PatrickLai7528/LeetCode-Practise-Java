package Ex349IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (Integer integer : nums1) {
            if (!map.containsKey(integer)) {
                map.put(integer, -1);
            }
        }
        for (Integer integer : nums2) {
            if (!map.containsKey(integer)) {
                map.put(integer, 0);
            } else if(map.get(integer) == -1){
                map.put(integer, 2);
                counter++;
            }
        }
        if (counter == 0)
            return new int[0];
        System.out.println(map);
        System.out.println(counter);
        int[] result = new int[counter];
        counter--;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                result[counter] = entry.getKey();
                counter--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Arrays.stream(solution.intersection(new int[]{1}, new int[]{1})).forEach(a -> System.out.println(a));
    }
}
