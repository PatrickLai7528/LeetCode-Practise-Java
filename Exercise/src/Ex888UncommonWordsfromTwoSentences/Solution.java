package Ex888UncommonWordsfromTwoSentences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
 * <p>
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * <p>
 * Return a list of all uncommon words.
 * <p>
 * You may return the list in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 * Example 2:
 * <p>
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 */
public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : A.split(" ")) {
            count = getCount(count, map, str);
        }
        for (String str : B.split(" ")) {
            count = getCount(count, map, str);
        }

        if (count <= 0)
            return new String[]{};

        System.out.println(count);
        String[] result = new String[count];
        count = 0;
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[count] = entry.getKey();
                count++;
            }
        }
        return result;
    }

    private int getCount(int count, HashMap<String, Integer> map, String str) {
        if (!map.containsKey(str)) {
            map.put(str, 1);
            count++;
        } else {
            if (map.get(str) == 1)
                count--;
            map.put(str, map.get(str) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Arrays.stream(solution.uncommonFromSentences("xf tyl xf", "gw p gw xf")).forEach(str -> System.out.println(str));
    }
}
