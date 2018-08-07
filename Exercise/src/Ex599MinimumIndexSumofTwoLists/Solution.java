package Ex599MinimumIndexSumofTwoLists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
 * <p>
 * You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.
 * <p>
 * Example 1:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * Output: ["Shogun"]
 * Explanation: The only restaurant they both like is "Shogun".
 * Example 2:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["KFC", "Shogun", "Burger King"]
 * Output: ["Shogun"]
 * Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 * Note:
 * The length of both lists will be in the range of [1, 1000].
 * The length of strings in both lists will be in the range of [1, 30].
 * The index is starting from 0 to the list length minus 1.
 * No duplicates in both lists.
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], -1);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map.put(list2[i], i + findIndexOf(list1, list2[i]));
                counter++;
            }
        }
        System.out.println(map);
        String[] result = new String[counter];
        counter = 0;
        for (Map.Entry<String, Integer> entry1 : map.entrySet()) {
            if (entry1.getValue() != -1) {
                boolean flag = true;
                for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
                    if (entry2.getValue() != -1 && entry1.getValue() > entry2.getValue()) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result[counter] = entry1.getKey();
                    counter++;
                }
            }
        }
        Arrays.stream(result).forEach(a -> System.out.println(a));
        return Arrays.stream(result).filter(str -> str != null).toArray(String[]::new);
    }

    private int findIndexOf(String[] list, String str) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findRestaurant(new String[]{"KFC"}, new String[]{"KFC"}));
    }

}
